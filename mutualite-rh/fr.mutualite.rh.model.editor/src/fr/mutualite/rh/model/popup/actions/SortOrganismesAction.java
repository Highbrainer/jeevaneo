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

import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.Organismes;

public class SortOrganismesAction implements IObjectActionDelegate {

	private Shell shell;

	private Organismes orgs;

	/**
	 * Constructor for Action1.
	 */
	public SortOrganismesAction() {
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

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(orgs);
		domain.getCommandStack().execute(new ChangeCommand(orgs) {

			@Override
			public String getLabel() {
				return "Tri des organismes de formation";
			}

			@Override
			protected void doExecute() {

				ECollections.sort(orgs.getOrganismeFormations(), (e1, e2) -> {
					return e1.getNom().toLowerCase().compareTo(e2.getNom().toLowerCase());
				});
				MessageDialog.openInformation(shell, "Mutualite RH", "Organismes triés par nom!");
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
			orgs = null;
			if (element instanceof Organismes) {
				orgs = (Organismes) element;
			} else if (element instanceof Mutualite) {
				orgs = ((Mutualite) element).getOrganismes();
			}

		}
	}

}
