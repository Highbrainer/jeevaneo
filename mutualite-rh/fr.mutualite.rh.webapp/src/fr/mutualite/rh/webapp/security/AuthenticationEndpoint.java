package fr.mutualite.rh.webapp.security;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import fr.mutualite.rh.ldap.LdapClient;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.webapp.CdoServlet;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Path("/authentication")
public class AuthenticationEndpoint {
	private Logger log = Logger.getLogger(getClass());

	// public static Key key = MacProvider.generateKey();

	private LdapClient ldap = new LdapClient(CdoServlet.getConfig());

	public static Key key;
	static {
		// The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		// We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = "Demain, dès l'aube, la Mutualité se lèvera pour faire avancer le monde..."
				.getBytes();
		key = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
	}
	
	@GET
	@Path("/whoami")
	@Produces("application/json")
	@Secured
	public Response whoami() {

		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				Utilisateur user = AuthenticationFilter.getConnectedUtilisateur();
				JsonFactory jf = new JsonFactory();
				JsonGenerator jg = jf.createGenerator(os);
				jg.writeStartObject();
				  jg.writeStringField("login", user.getLogin());
				  jg.writeNumberField("matricule", user.getEmploye().getMatricule());
				jg.writeEndObject();
				jg.close();
				
			}
		};

		return Response.ok(stream).build();
	
	}

	@POST
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public Response authenticateUser(@FormParam("username") String username, @FormParam("password") String password) {

		try {

			// Authenticate the user using the credentials provided
			String dn = authenticate(username, password);

			// Issue a token for the user
			String token = issueToken(username, dn);

			// Return the token on the response
			return Response.ok(token).build();

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}
	}

	private String authenticate(String username, String password) throws NamingException {

		LdapContext ctx = ldap.bindAsAdmin();
		String dn = ldap.findUniqueUser(ctx, username);
		log.debug(dn);
		ctx.close();
		ldap.bind(dn, password).close();
		return dn;

	}

	private String issueToken(String username, String dn) {
//		CdoServlet.getMutualite().getUtilisateurs().getUtilisateurs().forEach(u->log.debug(u.getLogin()));
		Utilisateur utilisateur = CdoServlet.getMutualite().getUtilisateurs().getUtilisateurs().stream().filter(u -> {
			return u.getLogin().equalsIgnoreCase(username);
		}).findAny().orElseThrow(() -> {
			return new IllegalArgumentException("Utilisateur non référencé : '" + username + "' " + dn);});

		String token = Jwts.builder().setSubject(username).claim("dn", dn)
				/*.claim("matricule", utilisateur.getEmploye().getMatricule())*/.claim("roles", utilisateur.getRoles())
				.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS512, key).compact();
		return token;
	}
}