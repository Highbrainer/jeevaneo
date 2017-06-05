package fr.mutualite.rh.ui.views;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.jface.dialogs.InputDialog;
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

import fr.mutualite.rh.conges.Application;
import fr.mutualite.rh.conges.ApplicationSuivi;
import fr.mutualite.rh.webapp.ReportResource;
import fr.mutualite.rh.webapp.admin.AdminResource;

/**
 */

public class AdminView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.mutualite.rh.ui.views.CongesView";

	private FormToolkit toolkit;
	private ScrolledForm form;

	/**
	 * The constructor.
	 */
	public AdminView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Administration de GIC");
		form.setToolTipText("Outillage de l'administration de GIC pour Magali");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Suppression des tables", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Suppression de toutes les tables de la base de données. Toutes les données seront perdues.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					dropAll();
				}
			});
		}

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Restauration de données", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Importe les données contenues dans un fichier de sauvegarde. Les données évntuellement déjà présentes dans la base seront remplacées.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					restore();
				}
			});
		}
	}


	private static final String DIR = "dir";

	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	private File chooseFile() {

		Preferences prefs = Preferences.userRoot().node(getClass().getName());
		String dir = prefs.get(DIR, null);

		JFileChooser chooser = null != dir ? new JFileChooser(dir) : new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Sauvegarde", "xml");
		chooser.setFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//		chooser.setSelectedFile(new File(filename + df.format(new Date()) + ".xls"));
		int ret = chooser.showOpenDialog(null);

		if (ret != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		File file = chooser.getSelectedFile();
		prefs.put(DIR, file.getParent());

		return file;

	}
	
	private void dropAll() {
		boolean confirm = MessageDialog.openConfirm(AdminView.this.getSite().getShell(), "Confirmation de la suppression des données", "Cette action va supprimer toutes les données de la base de données. Le serveur doit d'abord être éteint. Cette action est irréversible.\nSûre?");
		if(confirm) {
			try {new AdminResource().dropAllTables();
			MessageDialog.openInformation(AdminView.this.getSite().getShell(), "Opération terminée", "Données supprimées!");
			} catch (Throwable e) {
				MessageDialog.openError(AdminView.this.getSite().getShell(), "Suppression KO", "ERREUR: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	private void restore() {
		File backup = chooseFile();
		if(null==backup) {
			return;
		}
		boolean confirm = MessageDialog.openConfirm(AdminView.this.getSite().getShell(), "Confirmation de la restauration des données", "Cette action va supprimer toutes les données de la base de données puis charger le fichier sélectionné.\nSûre?");
		if(confirm) {
			try {new AdminResource().restore(new FileInputStream(backup));
			MessageDialog.openInformation(AdminView.this.getSite().getShell(), "Opération terminée", "Données restaurées!\nIl faut probablement reset le serveur en allant par exemple sur http://rh-gic.mfca.local:44200/rest/admin/reset ...");
			} catch (Throwable e) {
				MessageDialog.openError(AdminView.this.getSite().getShell(), "Suppression KO", "ERREUR: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		form.setFocus();
	}
}
