package fr.mutualite.rh.ui.views;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;

import fr.mutualite.rh.model.popup.actions.ImportEtablissementsAction;
import fr.mutualite.rh.webapp.EmployeResource;
import fr.mutualite.rh.webapp.EntretienAnnuelResource;
import fr.mutualite.rh.webapp.ReportResource;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained from the model. The sample creates a dummy model on the fly, but a real
 * implementation would connect to the model available either in this or another plug-in (e.g. the workspace). The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each view can present the same model objects using different labels and icons, if
 * needed. Alternatively, a single label provider can be shared between views in order to ensure that objects of the same type are presented in the same way everywhere.
 * <p>
 */

public class ImportView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.mutualite.rh.ui.views.ExportView";

	private FormToolkit toolkit;
	private ScrolledForm form;

	/**
	 * The constructor.
	 */
	public ImportView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Imports CSV");
		form.setToolTipText("Imports spécifiques pour Magali");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Etablissements", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des établissements, avec leur responsable et la liste des 'entreteneurs'.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					importEtablissements();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Nettoyage Entreteneurs et Responsables", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Supprime les entreteneurs spécifiques des employés pour lesquels l'établissement possède exactement la même liste d'entreteneurs.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					cleanupEntreteneurs();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Objectifs d'EAE papier", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Importer les derniers objectifs assignés à chaque salarié, avant l'utilisation de GIC. Des \"faux\" EAE seront créés pour permettre de pré-remplir les objectifs des futurs entretiens.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					importFakeEAEs();
				}
			});
		}
	}

	private void importFakeEAEs() {
		File file = chooseFile("dir-eae");
		try(InputStream in = new FileInputStream(file)) {
			new EntretienAnnuelResource().importFakeEAEs(in);

			MessageDialog.openInformation(ImportView.this.getSite().getShell(), "Import OK", "C'est fait!");
		} catch (Throwable e1) {
			MessageDialog.openError(ImportView.this.getSite().getShell(), "Import KO", "Impossible d'importer les objectifs " + e1.getMessage());
			throw new RuntimeException(e1);
		}
	}

	private void cleanupEntreteneurs() {
		try {
			EmployeResource er = new EmployeResource();
			er.cleanupEntreteneurs();
			er.cleanupResponsables();
			MessageDialog.openInformation(ImportView.this.getSite().getShell(), "Cleanup OK", "C'est tout propre!");
		} catch (Throwable e1) {
			MessageDialog.openError(ImportView.this.getSite().getShell(), "Cleanup KO", "Impossible de nettoyer les entreteneurs spécifiques " + e1.getMessage());
			throw new RuntimeException(e1);
		}
	}

	private void importEtablissements() {
//		MessageDialog.openWarning(form.getShell(), "Non implémenté!", "Cette fonctionnalité n'est pas encore implémentée! Passe par le clic-droit!");
		new ImportEtablissementsAction().run(form.getShell());
	}

	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	private File chooseFile(/*String filename,*/ String dirKey) {

		Preferences prefs = Preferences.userRoot().node(getClass().getName());
		String dir = prefs.get(dirKey, null);

		JFileChooser chooser = null != dir ? new JFileChooser(dir) : new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", "xls", "xlsx");
		chooser.setFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//		chooser.setSelectedFile(new File(filename + df.format(new Date()) + ".xls"));
		int ret = chooser.showOpenDialog(null);

		if (ret != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		File file = chooser.getSelectedFile();
		prefs.put(dirKey, file.getParent());

		return file;

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		form.setFocus();
	}
}
