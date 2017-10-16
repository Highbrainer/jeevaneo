package fr.mutualite.rh.ui.views;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.prefs.Preferences;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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

import fr.mutualite.rh.conges.Application;
import fr.mutualite.rh.conges.ApplicationSuivi;

/**
 */

public class CongesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.mutualite.rh.ui.views.CongesView";

	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

	/**
	 * The constructor.
	 */
	public CongesView() {
	}

	int getThisYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
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
			ExpandableComposite ec = toolkit.createExpandableComposite(form.getBody(), ExpandableComposite.TREE_NODE | ExpandableComposite.CLIENT_INDENT);
			ec.setText("Paramètres");
			Composite composite = toolkit.createComposite(ec);
			composite.setLayout(new GridLayout(2, false));
			Label labelDu = toolkit.createLabel(composite, "Du", SWT.WRAP);

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String defaultDu = prefs.get("du", "01/06/" + getThisYear());
			String defaultAu = prefs.get("au", "31/10/" + getThisYear());
			
			Text textDu = toolkit.createText(composite, defaultDu);
			Label labelAu = toolkit.createLabel(composite, "Au", SWT.WRAP);
			Text textAu = toolkit.createText(composite, defaultAu);

			textDu.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					String du = textDu.getText();
					try {
						df.parse(du);
						prefs.put("du", du);
					} catch (ParseException e1) {
						// not a valid date - ignore
					}
				}
			});
			textAu.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					String au = textAu.getText();
					try {
						df.parse(au);
						prefs.put("au", au);
					} catch (ParseException e1) {
						// not a valid date - ignore
					}
				}
			});
			
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
					System.out.println(textDu.getText());
					Date dateAu = null;
					Date dateDu = null;
					try {
						dateAu = df.parse(textAu.getText());
					} catch (ParseException e1) {
						MessageDialog.openError(form.getShell(), "Format de date incorrect!", "La date de début est incorrecte!\nFormat attendu : jj/mm/aaaa exp: 01/05/2017");
					}
					try {
						dateDu = df.parse(textDu.getText());
					} catch (ParseException e1) {
						MessageDialog.openError(form.getShell(), "Format de date incorrect!", "La date de fin est incorrecte!\nFormat attendu : jj/mm/aaaa exp: 01/05/2017");
					}
					if (null != dateDu && null != dateAu) {
						exportPlanningConges(dateDu, dateAu);
					}
				}
			});
		}

		{
			Hyperlink link = toolkit.createHyperlink(form.getBody(), "Suivis individuels", SWT.WRAP);
			toolkit.createLabel(form.getBody(),
					"Export d'un fichier excel par établissement, contenant un onglet par salarié, avec un détail de ses congés, par type de congés (CP, Fractionnement, Ponts...)");
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					exportSuiviIndividuelConges();
				}
			});
		}
	}

	protected void exportPlanningConges(Date start, Date end) {
		Application app = new Application();
		try {
			app.importExport(start, end);
		} catch (Throwable e) {
			MessageDialog.openError(CongesView.this.getSite().getShell(), "Export Planning KO", "ERREUR: " + e.getMessage());
			e.printStackTrace();
		}
	}

	protected void exportSuiviIndividuelConges() {
		ApplicationSuivi app = new ApplicationSuivi();
		try {
			app.importExport();
		} catch (Throwable e) {
			MessageDialog.openError(CongesView.this.getSite().getShell(), "Export Suivi individuel des congés KO", "ERREUR: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		form.setFocus();
	}
}
