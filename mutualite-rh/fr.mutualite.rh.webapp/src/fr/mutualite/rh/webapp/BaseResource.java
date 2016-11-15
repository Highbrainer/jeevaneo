package fr.mutualite.rh.webapp;

import org.osgi.framework.ServiceException;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Mutualite;

public class BaseResource {

	protected static Employe getEmploye(int matricule, Mutualite mut) {
		// CDOQuery query = mut.cdoView().createQuery("sql", "SELECT distinct
		// cdo_id from Employe where matricule=" +
		// matricule);
		// query.setParameter("matricule", matricule);
		// Employe employe = query.getResultValue(Employe.class);
		Employe employe = mut.getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny()
				.orElse(null);
		if (null == employe) {
			throw new ServiceException("Employ� de matricule " + matricule + " : non trouv�!", 404);
		}
		return employe;
	}

}
