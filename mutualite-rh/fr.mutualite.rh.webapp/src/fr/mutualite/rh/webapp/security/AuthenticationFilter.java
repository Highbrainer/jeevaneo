package fr.mutualite.rh.webapp.security;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.webapp.CdoServlet;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {

	public static ThreadLocal<String> connectedUser = new ThreadLocal<>();
	public static ThreadLocal<Set<String>> connectedRoles = new ThreadLocal<>();

	@Context
	private ResourceInfo resourceInfo;
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		Method method = resourceInfo.getResourceMethod();
		if(method==null) {
			return;
		}
		if(method.getAnnotation(Authenticated.class)==null && method.getAnnotation(Secured.class)==null) {
			//no security needed!
			return;
		}

		// Get the HTTP Authorization header from the request
		String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
		

		String token = null;

		// Check if the HTTP Authorization header is present and formatted
		// correctly
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			token = authorizationHeader.substring("Bearer".length()).trim();
		} else {
			List<String> tokens = requestContext.getUriInfo().getQueryParameters().get("token");
			if (null != tokens && !tokens.isEmpty()) {
				token = tokens.get(0);
			}
		}

		if (null == token) {
			throw new NotAuthorizedException("Authorization header must be provided");
		}

		// Extract the token from the HTTP Authorization header

		try {

			// Validate the token
			Jws<Claims> jws = validateToken(token);
			final String login = jws.getBody().getSubject().toString();
			connectedUser.set(login);

		} catch (Exception e) {
			requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
		}
	}

	private Jws<Claims> validateToken(String token) throws Exception {
		Jws<Claims> parsed = Jwts.parser().setSigningKey(AuthenticationEndpoint.key).parseClaimsJws(token);
		String subject = parsed.getBody().getSubject();
		if (null == subject || subject.trim().isEmpty()) {
			throw new IllegalArgumentException("Login (subject) obligatoire!");
		}
		return parsed;
	}

	public static Utilisateur getConnectedUtilisateur() {
		String login = connectedUser.get();
		String connectedLogin = login.trim();
		Utilisateur connected = CdoServlet.getMutualite().getUtilisateurs().getUtilisateurs().stream()
				.filter(u -> {
					String userLogin = u.getLogin();
					return userLogin.trim().equalsIgnoreCase(connectedLogin);
					}
				).findAny().orElse(null);
		return connected;
	}
}