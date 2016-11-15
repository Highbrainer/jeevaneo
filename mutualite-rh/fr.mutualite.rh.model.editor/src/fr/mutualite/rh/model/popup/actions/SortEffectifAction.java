package fr.mutualite.rh.model.popup.actions;

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

import fr.mutualite.rh.model.Effectif;
import fr.mutualite.rh.model.Mutualite;

public class SortEffectifAction implements IObjectActionDelegate {

	private Shell shell;

	private Effectif effectif;

	/**
	 * Constructor for Action1.
	 */
	public SortEffectifAction() {
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

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(effectif);
		domain.getCommandStack().execute(new ChangeCommand(effectif) {

			@Override
			public String getLabel() {
				return "Tri des salariés ";
			}

			@Override
			protected void doExecute() {

				ECollections.sort(effectif.getEmployes(), (e1, e2) -> {
					String n1 = e1.getNom()==null?"":e1.getNom();
					String n2 = e2.getNom()==null?"":e2.getNom();
					return n1.toLowerCase().compareTo(n2.toLowerCase());
				});
				MessageDialog.openInformation(shell, "Mutualite RH", "Effectif trié par nom!");
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
			effectif = null;
			if (element instanceof Effectif) {
				effectif = (Effectif) element;
			} else if (element instanceof Mutualite) {
				effectif = ((Mutualite) element).getEffectif();
			}

		}
	}

}
