package fr.mutualite.rh.webapp.security;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.BaseResource;
import fr.mutualite.rh.webapp.CdoServlet;


@RequestScoped
public class AuthenticatedUserProducer extends BaseResource {

    @Produces
    @RequestScoped
    @AuthenticatedUser
    private Employe authenticatedUser;

    public void handleAuthenticationEvent(@Observes @AuthenticatedUser int matricule) {
        this.authenticatedUser = findEmploye(matricule);
    }

    private Employe findEmploye(int matricule) {
        return getEmploye(matricule, CdoServlet.getMutualite());
    }
}