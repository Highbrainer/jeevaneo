package mutualite.rh.chequedej.popup.actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Succursale;

public class NewCommandeAction implements IObjectActionDelegate {

	private Shell shell;

	private ChequeDej root;

	/**
	 * Constructor for Action1.
	 */
	public NewCommandeAction() {
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
	
	

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {

		ChangeCommand command = new ChangeCommand(root) {

			@Override
			public String getLabel() {
				return "Création d'une nouvelle commande ";
			}

			@Override
			protected void doExecute() {
				Commande commande = ChequedejFactory.eINSTANCE.createCommande();
				Date now = new Date();
				commande.setDate(now);
				LocalDate nextMonth = LocalDate.now().plus(1, ChronoUnit.MONTHS);
				commande.setMois(root.getCarnet().formatMois(nextMonth));
				commande.setParticipationPatronale(root.getParticipationPatronale());
				commande.setValeurNominale(root.getValeurNominale());
				root.getCarnet().getCommandes().add(commande);
				CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(ExportFormCommandeAction.estConcerneParCommande(commande)).map(e -> {
					Item item = ChequedejFactory.eINSTANCE.createItem();
					item.setMatricule(e.getMatricule());
					item.setNom(e.getNom());
					item.setPrenom(e.getPrenom());
					item.setSuccursale(getSuccursale(e.getEtablissement().getId()));
					return item;
				}).forEach(commande.getItems()::add);
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(root);
		if (null != domain) {
			domain.getCommandStack().execute(command);
		}
	}

	protected Succursale getSuccursale(int id) {
		Optional<Succursale> opt = root.getParametrage().getCodesClient().stream().map(CodeClient::getSuccursales).flatMap(List::stream).filter(s -> s.getIdEtablissement()==id).findAny();
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
			root = null;
			if (element instanceof ChequeDej) {
				root = ((ChequeDej) element);
			} else if (element instanceof Carnet) {
				root = ((Carnet) element).root();
			} else if (element instanceof Commande) {
				root = ((Commande) element).carnet().root();
			}

		}
	}

}
