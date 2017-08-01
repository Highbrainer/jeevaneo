package fr.mutualite.rh.webapp.security;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.eclipse.emf.cdo.common.id.CDOIDUtil;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.webapp.CdoServlet;
import fr.mutualite.rh.webapp.EntretienProfessionnelResource;

@Provider
@Priority(Priorities.AUTHORIZATION)
public class AuthorizationFilter implements ContainerRequestFilter {

	@Context
	private ResourceInfo resourceInfo;

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		try {
			Method method = resourceInfo.getResourceMethod();
			if(null==method) {
				return;
			}
			Secured annotation = method.getAnnotation(Secured.class);
			if(annotation!=null) {
				if (hasRole(Role.DRH)) {
					return;
				}
				Utilisateur user = AuthenticationFilter.getConnectedUtilisateur();
				Employe employe = user.getEmploye();
				int consultedMatricule;
				String sId = requestContext.getUriInfo().getQueryParameters().getFirst("id");
				if (null == sId) {
					sId = requestContext.getUriInfo().getPathParameters().getFirst("cdoId");
				}
				if (null != sId) {
					long id = Long.parseLong(sId);
					Entretien entretien = (Entretien) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(id));
					consultedMatricule = entretien.employe().getMatricule();
				} else {
					String sConsultedMatricule = requestContext.getUriInfo().getPathParameters().getFirst("matricule");
					consultedMatricule = Integer.parseInt(sConsultedMatricule);
				}
				// si c'est soi même on laisse passer!
				if (consultedMatricule == employe.getMatricule()) {
					return;
				}

				// si c'est un de ses entretenus...
				// specifique 
				boolean isEmployeEntretenuSpecifique = employe.getEmployesEntretenus().stream().anyMatch(emp -> emp.getMatricule() == consultedMatricule);
				// de l'etablissement
				boolean isEmployeEntretenuEtablissement = employe.getEtablissementsEntretenus().stream().map(Etablissement::getEmployes).flatMap(List::stream)
						.filter(e -> e.getEntreteneurs().isEmpty()).anyMatch(emp -> emp.getMatricule() == consultedMatricule);
				boolean isSelf = consultedMatricule == employe.getMatricule();
				if (!isEmployeEntretenuSpecifique && !isEmployeEntretenuEtablissement && !isSelf) {
					throw new WebApplicationException("Vous n'avez pas l'autorisation d'accéder à cet entretien.", 403);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			requestContext.abortWith(Response.status(Response.Status.FORBIDDEN).build());
		}
	}

	private Employe getEmploye(int consultedMatricule) {
		return CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(emp -> (emp.getMatricule() == consultedMatricule)).findAny().orElseThrow(() -> {
			return new IllegalArgumentException("");
		});
	}

	private boolean hasRole(Role role) {
		return AuthenticationFilter.getConnectedUtilisateur().getRoles().contains(role);
		// return
		// AuthenticationFilter.getConnectedUtilisateur().getRoles().stream().map(r->r.getName()).anyMatch(name->role.name().equals(name));
	}
}