package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.common.util.EList;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.UIEmploye;
import fr.mutualite.rh.model.util.Activator;
import fr.mutualite.rh.model.util.JsonGenerator;
import fr.mutualite.rh.model.util.JsonGeneratorImpl;
import fr.mutualite.rh.webapp.security.AuthenticationFilter;
import fr.mutualite.rh.webapp.security.Secured;

@Path("/effectif")
public class EmployeResource extends BaseResource {
	
	private final Logger log = Logger.getLogger(getClass());

	public EmployeResource() {
	}
	
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	@POST
//	@Secured
	@Path("{cdoId}/dateSortieEntreprise")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void setDateSortieEntreprise(@PathParam("cdoId") long cdoId, @FormParam("dateSortieEntreprise") String sDate) throws ParseException {
		Date day = df.parse(sDate);
		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			Employe emp = (Employe) mut.cdoView().getObject(CDOIDUtil.createLong(cdoId));
			emp.setDateSortieEntreprise(day);
			return true;
		});
	}

	@POST
	@Path("cleanupEntreteneurs")
	public void cleanupEntreteneurs() {
		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			mut.getEffectif().getEmployes().forEach(emp -> {
				Etablissement etablissement = emp.getEtablissement();
				if(null==etablissement) {
					return;
				}
				EList<Employe> entreteneurs = emp.getEntreteneurs();
				if(null==entreteneurs || entreteneurs.isEmpty()) {
					return;
				}
				EList<Employe> entreteneursEtab = etablissement.getEntreteneurs();
				if(null==entreteneursEtab || entreteneursEtab.isEmpty()) {
					return;
				}
				//aucun des deux n'est nul ou vide
				if(entreteneursEtab.size()!=entreteneurs.size()) {
					return;
				}
				//et ils ont la même taille : on checke!
				Set<Integer> matriculesEntreteneursEtab = entreteneursEtab.stream().map(Employe::getMatricule).collect(Collectors.toSet());
				if(entreteneurs.stream().map(Employe::getMatricule).allMatch(matriculesEntreteneursEtab::contains)) {
					// exactement les mêmes entreteneurs que l'établissement (à l'ordre près)
					emp.getEntreteneurs().clear();
					log.info("J'ai resetté les entreteneurs de " + emp.getLabel());
				}
			});
			return true;
		});
	}

	@POST
	@Path("cleanupResponsables")
	public void cleanupResponsables() {
		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			mut.getEffectif().getEmployes().forEach(emp -> {
				Etablissement etablissement = emp.getEtablissement();
				if(null==etablissement) {
					return;
				}
				Employe responsable = emp.getResponsable();
				if(null==responsable) {
					return;
				}
				Employe responsableEtab = etablissement.getResponsable();
				if(null==responsableEtab) {
					return;
				}
				//aucun des deux n'est nul
				if(responsable.getMatricule()==responsableEtab.getMatricule()) {
					emp.setResponsable(null);
					log.info("J'ai resetté le responsable de " + emp.getLabel());
				}
			});
			return true;
		});
	}
	
	@DELETE
//	@Secured
	@Path("{cdoId}/dateSortieEntreprise")
	public void unsetDateSortieEntreprise(@PathParam("cdoId") long cdoId) throws ParseException {
		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			Employe emp = (Employe) mut.cdoView().getObject(CDOIDUtil.createLong(cdoId));
			emp.setDateSortieEntreprise(null);
			return true;
		});
	}

	/**
	 * La liste des employés dont je peux consulter l'entretien pro.
	 * 
	 * @return
	 * @throws IOException
	 */
	@GET
	@Secured
	@Path("/combo.json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComboItem> comboListEmployes() throws IOException {

		Utilisateur user = AuthenticationFilter.getConnectedUtilisateur();
		CDOQuery query = CdoServlet.getMutualite().cdoView().createQuery("sql", "SELECT distinct cdo_id from Employe where cdo_id is not null");
		Set<Employe> employes = query.getResult(Employe.class).stream().collect(Collectors.toSet());
		Stream<Employe> stream = employes.stream().filter(emp -> emp != null);
		if (!user.getRoles().contains(Role.DRH)) {
			Date now = new Date();
			stream = stream.filter(emp -> {
				return emp.getDateSortieEntreprise()==null || emp.getDateSortieEntreprise().after(now);
			});
			stream = stream.filter(emp -> {
				// System.out.println(emp.getMatricule() + " vs " +
				// user.getEmploye().getMatricule());
				return user.getEmploye().getEmployesEntretenus().contains(emp) || emp.equals(user.getEmploye());
			});
		}
		List<ComboItem> ret = stream.map(emp -> new ComboItem("" + emp.getMatricule(), "" + emp.getNom() + " " + emp.getPrenom())).collect(Collectors.toSet()).stream()
				.sorted(this::compare).collect(Collectors.toList());
		log.debug("Found " + ret.size() + " employes.");
		return ret;
	}
	
	@GET
//	@Secured
	@Path(".json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listEmployes() {
		return Response.ok(new StreamingOutput() {
			
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				out.write("[".getBytes());
				final boolean[] pFirst = {true};
				JsonGenerator jsonGenerator = new JsonGeneratorImpl(new SimpleDateFormat("yyyy-MM-dd"));
				CdoServlet.getMutualite().getEffectif().getEmployes().forEach(emp -> {
					try {
						if(pFirst[0]) {
							pFirst[0] = false;
						} else {
							out.write(", ".getBytes());
						}
						out.write(jsonGenerator.generateJson(emp).getBytes());
					} catch (IOException e) {
						new WebApplicationException(e);
					}
				});
				out.write("]".getBytes());
			}
		}).build();
	}

	private int compare(ComboItem c1, ComboItem c2) {
		return c1.getValue().compareTo(c2.getValue());
	}

	@GET
	@Path("/{matricule}/entreteneurs/combo.json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComboItem> comboListEmployes(@PathParam("matricule") int matricule) {
		final List<ComboItem> ret = new ArrayList<>();

		Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
		Function<? super Employe, ComboItem> mapper = e -> {
			log.debug(e);
			return new ComboItem("" + e.getMatricule(), e.getNom() + " " + e.getPrenom());
		};
		employe.getEntreteneurs().stream().filter(e -> e != null && e.getDateSortieEntreprise() == null).map(mapper).forEach(ret::add);
		return ret;
	}

	@GET
	@Path("/{matricule}")
	@Produces("application/javascript")
	public UIEmploye get(@PathParam("matricule") int matricule) {

		Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
		UIEmploye ret = DtoFactory.eINSTANCE.createUIEmploye();
		ret.setMatricule(employe.getMatricule());
		ret.setPrenom(employe.getPrenom());
		ret.setNom(employe.getNom());
		return ret;
	}

}
