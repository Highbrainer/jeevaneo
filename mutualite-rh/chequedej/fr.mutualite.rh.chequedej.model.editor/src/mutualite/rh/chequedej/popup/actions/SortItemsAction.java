package mutualite.rh.chequedej.popup.actions;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.Utilisateurs;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Item;

public class SortItemsAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande commande;

	/**
	 * Constructor for Action1.
	 */
	public SortItemsAction() {
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

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(commande);
		domain.getCommandStack().execute(new ChangeCommand(commande) {

			@Override
			public String getLabel() {
				return "Tri des Items de la commande " + commande.getMois();
			}
			
			private String label(Item i) {
				return i.getNom()+" " + i.getPrenom() + " " + i.getMatricule();
			}

			@Override
			protected void doExecute() {

				ECollections.sort(commande.getItems(), (e1, e2) -> {
					return label(e1).toLowerCase().compareTo(label(e2).toLowerCase());
				});
				MessageDialog.openInformation(shell, "Mutualite RH", "Items triés par nom!");
			}
		});
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
