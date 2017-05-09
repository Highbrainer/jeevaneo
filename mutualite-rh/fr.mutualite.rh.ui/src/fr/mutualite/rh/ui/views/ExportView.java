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

import fr.mutualite.rh.webapp.ReportResource;
import fr.mutualite.rh.webapp.admin.AdminResource;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view shows data obtained from the model. The sample creates a dummy model on the fly, but a real
 * implementation would connect to the model available either in this or another plug-in (e.g. the workspace). The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view. Each view can present the same model objects using different labels and icons, if
 * needed. Alternatively, a single label provider can be shared between views in order to ensure that objects of the same type are presented in the same way everywhere.
 * <p>
 */

public class ExportView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.mutualite.rh.ui.views.ExportView";

	private FormToolkit toolkit;
	private ScrolledForm form;

	/**
	 * The constructor.
	 */
	public ExportView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Exports Excel");
		form.setToolTipText("Exports spécifiques pour Magali");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Demandes de rencontre RH", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des salariés qui ont demandé, lors de leur dernier entretien, à rencontrer les RH.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					rencontreRh();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Souhaits de formation", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des souhaits de formation émis par les salariés ou leur évaluateur, lors de leur dernier entretien.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					souhaitsFormation();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Historique des entretiens", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des dates d'entretien par salarié.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					datesEntretiens();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Sauvegarde", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter la totalité de la base au format XML.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					backup();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Responsables", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salarié présent les noms de responsable et entreteneurs, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					responsables();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Dernière formation DPC", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salarié la date de sa formation DPC la plus récente ainsi que son emploi, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					derniereFormationDpc();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Suivi des formations", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salarié la liste des sessions de formations qui lui sont rattachées, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					sessionsFormation();
				}
			});
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Souhaits de formation exportés vers " + file.getAbsolutePath());
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Liste des responsables exportée vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}
	
	private void derniereFormationDpc() {
		File file = chooseFile("derniere-formation-dpc-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsDerniereFormationDpc();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Liste des dernières formations DPC exportée vers " + file.getAbsolutePath());
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Souhaits de formation exportés vers " + file.getAbsolutePath());
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'écrire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Dates d'entretiens exportées vers " + file.getAbsolutePath());
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
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Demandes de rencontres exportées vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void sessionsFormation() {
		File file = chooseFile("sessions-formation-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsSessionsFormation();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Suivi des formations exporté vers " + file.getAbsolutePath());
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
