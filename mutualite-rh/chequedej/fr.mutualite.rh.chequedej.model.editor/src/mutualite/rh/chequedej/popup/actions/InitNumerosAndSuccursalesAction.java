package mutualite.rh.chequedej.popup.actions;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Parametrage;
import mutualite.rh.chequedej.Succursale;

public class InitNumerosAndSuccursalesAction implements IObjectActionDelegate {

	private Shell shell;

	private ChequeDej root;

	/**
	 * Constructor for Action1.
	 */
	public InitNumerosAndSuccursalesAction() {
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
				return "Initialisation des Numéros et Succursales...";
			}

			@Override
			protected void doExecute() {

				try {

					CodeClient nc = ChequedejFactory.eINSTANCE.createCodeClient();
					nc.setLibelle("Faux code! Dispatcher les succursales dans des codes clients adhoc et définir leur numéro!");

					CdoServlet.getMutualite().getEtablissements().getEtablissements().stream().map(et -> {
						Succursale succursale = ChequedejFactory.eINSTANCE.createSuccursale();
						succursale.setIdEtablissement(et.getId());
						return succursale;
					}).forEach(nc.getSuccursales()::add);

					root.getParametrage().getCodesClient().add(nc);

					MessageDialog.openInformation(aShell, "Chèques Déjeuner", "Initialisation terminée!");
				} catch (Throwable t) {
					StringWriter error = new StringWriter();
					t.printStackTrace(new PrintWriter(error));
					ErrorDialog.openError(aShell, "Erreur!", "Une erreur a empêché l'initialisation des numéros et succursales : " + t.getMessage(),
							new Status(IStatus.ERROR, "fr.mutualite.rh.chequedej.model", error.getBuffer().toString()));
				}
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(root);
		if (null != domain) {
			domain.getCommandStack().execute(command);
		}
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
				root = (ChequeDej) element;
			} else if (element instanceof Parametrage) {
				root = (ChequeDej) ((Parametrage) element).eContainer();
			}

		}
	}

}
