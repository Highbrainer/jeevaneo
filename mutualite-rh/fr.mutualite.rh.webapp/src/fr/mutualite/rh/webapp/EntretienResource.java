package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.multipart.FormDataParam;

import fr.mutualite.rh.model.Appreciation;
import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Avis;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.PhotoEmploye;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.Formulaire;
import fr.mutualite.rh.model.util.Activator;
import fr.mutualite.rh.webapp.cdo.ICDO;
import fr.mutualite.rh.webapp.cdo.MutualiteCDO;
import fr.mutualite.rh.webapp.security.AuthenticationFilter;
import fr.mutualite.rh.webapp.security.Secured;
import fr.opensagres.xdocreport.converter.ConverterTypeTo;
import fr.opensagres.xdocreport.converter.ConverterTypeVia;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

@Path("")
public class EntretienResource extends BaseResource {

	
	
	private ICDO cdo;
	private static final DateFormat df = DateFormat.getDateInstance();
	private static final DateFormat dtf = DateFormat.getDateTimeInstance();

	// @Inject @AuthenticatedUser Employe authenticatedUser;

	public EntretienResource() {
		cdo = CdoServlet.getCdo();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien/all.json")
	public Response list(@PathParam("matricule") int matricule) {
		final Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
		ResponseBuilder response = Response.ok(new StreamingOutput() {
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				JsonFactory jf = new JsonFactory();
				final JsonGenerator jg = jf.createGenerator(out);
				jg.writeStartArray();
				employe.getEntretiens().forEach(ent -> {
					Employe meneur = ent.getMeneur();
					try {
						jg.writeStartObject();
						jg.writeStringField("id", ent.cdoID().toURIFragment());
						jg.writeStringField("typeEntretien", ent.eClass().getName());
						jg.writeStringField("type2", ent.eClass().getName());
						jg.writeNumberField("matricule", matricule);
						jg.writeStringField("date", df.format(ent.getDate()));
						jg.writeBooleanField("enCours", ent.isEnCours());
						jg.writeBooleanField("fake", ent.isFake());
						jg.writeStringField("meneur",
								meneur == null ? "" : (meneur.getPrenom() + " " + meneur.getNom()));
						jg.writeStringField("employe", employe.getPrenom() + " " + employe.getNom());
						jg.writeEndObject();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				});
				jg.writeEndArray();
				jg.close();
			}
		});
		return response.build();
	}
	

	@Secured
	@GET
	@Produces("application/pdf")
	@Path("/entretiens/scan-{cdoId}.pdf")
	public Response getScan(@PathParam("cdoId") long cdoId) {

		Entretien entretien = (Entretien) CdoServlet.getMutualite().cdoView()
				.getObject(CDOIDUtil.createLong(cdoId));
		ResponseBuilder response = Response.ok(new StreamingOutput() {
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				out.write(entretien.getScan());
				out.flush();
			}
		});
		Employe employe = entretien.employe();
		String filename = "entretien";
		if(entretien instanceof EntretienProfessionnel) {
			filename += "-professionnel";
		} else if(entretien instanceof EntretienAnnuel) {
			filename += "-annuel";
		}
		response.header("Content-Disposition",
				"inline; filename=" + filename + "-" + employe.getNom() + "-" + employe.getPrenom() + "-"
						+ DateFormat.getDateInstance(DateFormat.SHORT).format(entretien.getDate()) + ".pdf");
		return response.build();
	}
	
	 @POST
	    @Consumes(MediaType.MULTIPART_FORM_DATA)
	 @Path("/entretiens/scan-{cdoId}.pdf")
	    public Response uploadFile(@PathParam("cdoId") long cdoId, 
	        @FormDataParam("file") InputStream in) throws IOException {
		 
		 Entretien entretien = (Entretien) CdoServlet.getMutualite().cdoView()
					.getObject(CDOIDUtil.createLong(cdoId));
	 
		 	List<byte[]> buffers = new ArrayList<byte[]>();
		 	int read = -1;
		 	byte[] buffer = new byte[2048];
		 	while((read=in.read(buffer))>0) {
		 		byte[] append = new byte[read];
		 		System.arraycopy(buffer, 0, append, 0, read);
		 		buffers.add(append);
		 	}
		 	int totalSize = (int) buffers.stream().collect(Collectors.summarizingInt(a->a.length)).getSum();
		 	
		 	byte[] file = new byte[totalSize];
		 	for(int i=0;i<buffers.size();++i) {
		 		byte[] b = buffers.get(i);
				System.arraycopy(b, 0, file, 2048*i, b.length);
		 	}
	        entretien.setScan(file);
	 
	        String output = "{\"status\":\"server\"}";
	 
	        return Response.status(200).entity(output).build();
	 
	    }
	 

		@Secured
		@DELETE
		@Path("/entretiens/{cdoId}")
		public void delete(@PathParam("cdoId") long cdoId) {

			CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
				Entretien entretien = (Entretien) mut.cdoView()
						.getObject(CDOIDUtil.createLong(cdoId));
				EcoreUtil.delete(entretien);
				return true;
			});

		}
}
