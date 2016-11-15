package fr.mutualite.rh.webapp;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Mutualite;

@Path("/bidon")
public class BidonResource {

	public BidonResource() {
	}

	@GET
	public String test() throws ConcurrentAccessException, CommitException {
		
		String ret[] = {"Alors?"};
		
		CDOSession session = CdoServlet.getCdo().openSession();
		CDOTransaction transaction = session.openTransaction(); try {
		CDOResource resource = transaction.getOrCreateResource("/mutualite/rh");
		if(resource.getContents().isEmpty()) {
			resource.getContents().add(MutFactory.eINSTANCE.createMutualite());
		}
		Mutualite mut = (Mutualite) resource.getContents().get(0);
		Employe emp = MutFactory.eINSTANCE.createEmploye();
		emp.setNom("" + new Date());
		mut.getEffectif().getEmployes().add(emp);
		transaction.commit();
		
		mut.getEffectif().getEmployes().forEach(e->{ret[0] += "<li>" + e.getNom() + "</li>";});
		
		} finally {
			transaction.close();
			session.close();
		}
		return ret[0];
		
	}
	
	public static void main(String[] args) {
		MutPackage.Literals.ENTRETIEN_PROFESSIONNEL.getEAllAttributes().forEach(a->{System.out.println("Attribut " + a.getName() + "\n" + "${" + a.getName() + "}");});
		MutPackage.Literals.ENTRETIEN_PROFESSIONNEL.getEAllReferences().forEach(r->{System.out.println("Reference " + (r.isMany()?"N":"1") + " " +  r.getName() + "\n" + "${" + r.getName() + "}");});
	}
	
}
