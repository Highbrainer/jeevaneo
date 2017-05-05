package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.eclipse.emf.cdo.view.CDOQuery;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.UIEmploye;
import fr.mutualite.rh.webapp.security.AuthenticationFilter;
import fr.mutualite.rh.webapp.security.Secured;

@Path("/etablissements")
public class EtablissementResource extends BaseResource {
	
	private final Logger log = Logger.getLogger(getClass());

	public EtablissementResource() {
	}

	/**
	 * La liste des employés dont je peux consulter l'entretien pro.
	 * 
	 * @return
	 * @throws IOException
	 */
	@GET
//	@Secured
	@Path("/combo.json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComboItem> comboListEmployes() throws IOException {

		List<ComboItem> ret = CdoServlet.getMutualite().getEtablissements().getEtablissements().stream().map(et -> new ComboItem("" + et.getId(), "" + et.getNom())).collect(Collectors.toSet()).stream()
				.sorted(this::compare).collect(Collectors.toList());
		log.debug("Found " + ret.size() + " employes.");
		return ret;
	}

	private int compare(ComboItem c1, ComboItem c2) {
		return c1.getValue().compareTo(c2.getValue());
	}
	
	
}
