package fr.mutualite.rh.model.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.webapp.ReportResource;

public class ExportMatriceEmployeFormationAction implements IObjectActionDelegate {

	private Shell shell;

	private Mutualite mut;

	/**
	 * Constructor for Action1.
	 */
	public ExportMatriceEmployeFormationAction() {
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
		
		InputDialog id = new InputDialog(shell, "Quelle année?", "Veuillez saisir l'année qui vous intéresse", ""+Calendar.getInstance().get(Calendar.YEAR), null);
		if(id.open()!=Window.OK) {
			return;
		}
		String sYear = id.getValue();
		
		FileDialog fileDialog = new FileDialog(shell, SWT.SAVE);
		fileDialog.setText("Veuillez sélectionner le fichier xls à exporter...");
		fileDialog.setFileName("matrices-employes-formations-" + sYear + ".xls");
		String filename = fileDialog.open();
		if (null == filename) {
			return;
		}

		File f = new File(filename);

		Response response = new ReportResource().xlsMatriceEmployeeFormation(mut, Integer.parseInt(sYear));
		StreamingOutput entity = (StreamingOutput) response.getEntity();
		try (FileOutputStream out = new FileOutputStream(f);) {

			entity.write(out);
			out.flush();
			out.close();
			
			Desktop.getDesktop().open(f);
		} catch (WebApplicationException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			mut = null;
			if (element instanceof Mutualite) {
				mut = (Mutualite) element;
			}
		}
	}

}
