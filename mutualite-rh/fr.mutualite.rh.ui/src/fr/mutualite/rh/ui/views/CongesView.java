package fr.mutualite.rh.ui.views;

import java.awt.Desktop;
import java.io.File;
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
import fr.mutualite.rh.webapp.ReportResource;
import fr.mutualite.rh.webapp.admin.AdminResource;

/**
 */

public class CongesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.mutualite.rh.ui.views.CongesView";

	private FormToolkit toolkit;
	private ScrolledForm form;

	/**
	 * The constructor.
	 */
	public CongesView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Congés");
		form.setToolTipText("Outillage des congés spécifique pour Magali");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Plannings", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Export d'un fichier excel contenant un onglet par établissement et une ligne par salarié, avec ses congés en couleur.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					exportPlanningConges();
				}
			});
		}
	}

	protected void exportPlanningConges() {
		Application app = new Application();
		try {
			app.importExport();
		} catch (Throwable e) {
			MessageDialog.openError(CongesView.this.getSite().getShell(), "Export Planning KO", "ERREUR: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void souhaitsFormation() {
		File file = chooseFile("souhaits-formation-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsSouhaitsFormationDernierEntretien();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(CongesView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(CongesView.this.getSite().getShell(), "Export OK", "Souhaits de formation exportés vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void responsables() {
		File file = chooseFile("responsables-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsResponsables();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(CongesView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(CongesView.this.getSite().getShell(), "Export OK", "Liste des responsables exportée vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}
	
	private void backup() {
		File file = chooseFile("backup-", "xml");
		if (null != file) {
			Response resp = new AdminResource().backup();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(CongesView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(CongesView.this.getSite().getShell(), "Export OK", "Souhaits de formation exportés vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void datesEntretiens() {
		File file = chooseFile("dates-entretiens-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsDatesEntretiens();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(CongesView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(CongesView.this.getSite().getShell(), "Export OK", "Dates d'entretiens exportées vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private static final String DIR = "dir";

	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	private File chooseFile(String filename, String... extensions) {

		Preferences prefs = Preferences.userRoot().node(getClass().getName());
		String dir = prefs.get(DIR, null);

		JFileChooser chooser = null != dir ? new JFileChooser(dir) : new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers " + extensions[0], extensions);
		chooser.setFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setSelectedFile(new File(filename + df.format(new Date()) + "." + extensions[0]));
		int ret = chooser.showOpenDialog(null);

		if (ret != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		File file = chooser.getSelectedFile();
		System.out.println("Yes " + file.getAbsolutePath());
		prefs.put(DIR, file.getParent());

		return file;

	}

	private void rencontreRh() {
		File file = chooseFile("demandes-recontre-rh-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsDemandeRhLorsDernierEntretien();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(CongesView.this.getSite().getShell(), "Export OK", "Demandes de rencontres exportées vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
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
