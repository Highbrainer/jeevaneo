package mutualite.rh.chequedej.popup.actions;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.Contrats;
import mutualite.rh.chequedej.DejeMensuel;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;
import mutualite.rh.chequedej.provider.ChequedejItemProviderAdapterFactory;

public class SortContratsAction implements IObjectActionDelegate {

	private Shell shell;

	private Contrats o;

	/**
	 * Constructor for Action1.
	 */
	public SortContratsAction() {
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

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(o);
		domain.getCommandStack().execute(new ChangeCommand(o) {

			ChequedejItemProviderAdapterFactory cipaf = new ChequedejItemProviderAdapterFactory();
			IItemLabelProvider lp  = (IItemLabelProvider) cipaf.createContratAdapter();
			
			@Override
			public String getLabel() {
				return "Tri des Contrats";
			}
			
			@Override
			protected void doExecute() {

				ECollections.sort(o.getContrats(), (e1, e2) -> {
					return lp.getText(e1).toLowerCase().compareTo(lp.getText(e2).toLowerCase());
				});
				MessageDialog.openInformation(shell, "Mutualite RH", "Contrats triés!");
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
			o = null;
			if (element instanceof Contrats) {
				o = (Contrats) element;
			} 
		}
	}

}
