package fr.mutualite.rh.ui.views;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
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
		form.setToolTipText("Exports sp�cifiques pour Magali");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Demandes de rencontre RH", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des salari�s qui ont demand�, lors de leur dernier entretien, � rencontrer les RH.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					rencontreRh();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Souhaits de formation", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des souhaits de formation �mis par les salari�s ou leur �valuateur, lors de tous les entretiens (tous types d'entretien et sans limite de temps).");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					souhaitsFormation();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Historique des entretiens pros", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des dates d'entretiens pros par salari�.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					datesEntretiensPros();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Historique des EAEs", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des dates d'entretiens annuels par salari�.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					datesEntretiensAnnuels();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Objectifs", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Liste des objectifs du dernier EAE de chaque salari�.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					xlsObjectifs();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Sauvegarde", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter la totalit� de la base au format XML.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					backup();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Responsables et Entreteneurs", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salari� pr�sent les noms de responsable et entreteneurs, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					responsables();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Derni�re formation DPC", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salari� la date de sa formation DPC la plus r�cente ainsi que son emploi, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					derniereFormationDpc();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Suivi des formations", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter pour chaque salari� la liste des sessions de formations qui lui sont rattach�es, au format excel.");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					sessionsFormation();
				}
			});
		}
		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Matrices des formations", SWT.WRAP);
			toolkit.createLabel(form.getBody(), "Exporter un tableau r�capitulatif des formations par salari� et par �tablissement, au format excel.");
			ExpandableComposite ec = toolkit.createExpandableComposite(form.getBody(), ExpandableComposite.TREE_NODE | ExpandableComposite.CLIENT_INDENT);
			ec.setText("Param�tres");
			Composite composite = toolkit.createComposite(ec);
			composite.setLayout(new GridLayout(2, false));
			Label label = toolkit.createLabel(composite, "Ann�e", SWT.WRAP);
			Text text = toolkit.createText(composite, ""+getThisYear());
			ec.setClient(composite);
			GridData td = new GridData();
			td.horizontalSpan = 3;
			td.grabExcessHorizontalSpace = true;
			ec.setLayoutData(td);
			ec.addExpansionListener(new ExpansionAdapter() {
				public void expansionStateChanged(ExpansionEvent e) {
					form.reflow(true);
				}
			});
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					try {
						int annee = Integer.parseInt(text.getText());
						if(annee<2000) {
							throw new NumberFormatException("Il faut une ann�e apr�s l'an 2000!");
						}
						matricesFormation(annee);
					} catch (NumberFormatException e1) {
						MessageDialog.openError(form.getShell(), "Format d'annee incorrect!", "L'ann�e est incorrecte! " + e1.getMessage());
					}
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Souhaits de formation export�s vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}
	

	int getThisYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	private void xlsObjectifs() {
		File file = chooseFile("objectifs-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsObjectifsDernierEntretien();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Objectifs export�s vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void responsables() {
		File file = chooseFile("responsables-entreteneurs-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsResponsables();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Liste des responsables export�e vers " + file.getAbsolutePath());
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Liste des derni�res formations DPC export�e vers " + file.getAbsolutePath());
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
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Souhaits de formation export�s vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void datesEntretiensAnnuels() {
		File file = chooseFile("dates-entretiens-annuels-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsDatesEntretiensAnnuels();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Dates d'EAE export�es vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void datesEntretiensPros() {
		File file = chooseFile("dates-entretiens-pros-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsDatesEntretiensPros();
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				MessageDialog.openError(ExportView.this.getSite().getShell(), "Export KO", "Impossible d'�crire dans le fichier " + e1.getMessage());
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Dates d'entretiens pros export�es vers " + file.getAbsolutePath());
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
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Demandes de rencontres export�es vers " + file.getAbsolutePath());
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
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Suivi des formations export� vers " + file.getAbsolutePath());
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
		}
	}

	private void matricesFormation(int annee) {
		File file = chooseFile("matrices-formations-" + annee + "-", "xls", "xslx");
		if (null != file) {
			Response resp = new ReportResource().xlsMatriceEmployeeFormation(annee);
			StreamingOutput output = (StreamingOutput) resp.getEntity();
			try (FileOutputStream out = new FileOutputStream(file);) {
				output.write(out);
				out.flush();
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
			MessageDialog.openInformation(ExportView.this.getSite().getShell(), "Export OK", "Matrice des formations export� vers " + file.getAbsolutePath());
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
