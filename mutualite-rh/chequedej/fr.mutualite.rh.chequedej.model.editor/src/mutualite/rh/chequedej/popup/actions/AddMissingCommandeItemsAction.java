package mutualite.rh.chequedej.popup.actions;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Succursale;

public class AddMissingCommandeItemsAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande commande;
	
	protected Logger log = Logger.getLogger(getClass());

	/**
	 * Constructor for Action1.
	 */
	public AddMissingCommandeItemsAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		run(shell);
	}
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMM");

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {

		ChangeCommand command = new ChangeCommand(commande) {

			@Override
			public String getLabel() {
				return "Création d'une nouvelle commande ";
			}

			@Override
			protected void doExecute() {
				Date now = new Date();
				CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(ExportFormCommandeAction.estConcerneParCommande(commande)).map(e->new Pair<Employe, Item>(e, commande.getOrCreateItem(e.getMatricule()))).filter(p->p.get2().getSuccursale()==null).map(p -> {
					Employe e = p.get1();
					Item item = p.get2();
					item.setMatricule(e.getMatricule());
					item.setNom(e.getNom());
					item.setPrenom(e.getPrenom());
					item.setSuccursale(getSuccursale(e.getEtablissement().getId()));
					log.info("J'ajoute ou corrige " + e.getLabel() + " à la commande " + commande.getMois());
					return item;
				}).forEach(commande.getItems()::add);
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(commande);
		if (null != domain) {
			domain.getCommandStack().execute(command);
		}
	}

	protected Succursale getSuccursale(int id) {
		Optional<Succursale> opt = commande.carnet().root().getParametrage().getCodesClient().stream().map(CodeClient::getSuccursales).flatMap(List::stream).filter(s -> s.getIdEtablissement()==id).findAny();
		if(!opt.isPresent()) {
			throw new IllegalArgumentException("Aucune succursale pour l'id étalissement " + id);
		}
		return opt.get();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			commande = null;
			if (element instanceof Commande) {
				commande = (Commande) element;
			}

		}
	}

}
