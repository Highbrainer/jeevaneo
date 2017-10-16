package mutualite.rh.chequedej.popup.actions;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.undo.UpdateMarkersOperation;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.HistoriqueSoldeIndividuel;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.SoldeIndividuel;

public class ManualSoldeRegulationAction implements IObjectActionDelegate {

	private Shell shell;

	private SoldeIndividuel si;
	
	protected Logger log = Logger.getLogger(getClass());

	/**
	 * Constructor for Action1.
	 */
	public ManualSoldeRegulationAction() {
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
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMM");

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {

		ChangeCommand command = new ChangeCommand(si) {

			@Override
			public String getLabel() {
				return "Régularisation de solde manuelle";
			}

			@Override
			protected void doExecute() {
				RegulDialog dlg = new RegulDialog(shell);
			        if (dlg.open() != Window.OK) {
			        	return;
			        }
			          // User clicked OK; update the label with the input
			          Integer delta = dlg.getDelta();
			          String comment = dlg.getComment();
			          
			          System.out.println("" + delta + " " + comment);
			          
			          si.incremente(delta, comment);
				
				
//				Date now = new Date();
//				CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(ExportFormCommandeAction.estConcerneParCommande(si)).map(e->new Pair<Employe, Item>(e, si.getOrCreateItem(e.getMatricule()))).filter(p->p.get2().getSuccursale()==null).map(p -> {
//					Employe e = p.get1();
//					Item item = p.get2();
//					item.setMatricule(e.getMatricule());
//					item.setNom(e.getNom());
//					item.setPrenom(e.getPrenom());
//					item.setSuccursale(getSuccursale(e.getEtablissement().getId()));
//					log.info("J'ajoute ou corrige " + e.getLabel() + " à la commande " + si.getMois());
//					return item;
//				}).forEach(si.getItems()::add);
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(si);
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
			si = null;
			if (element instanceof SoldeIndividuel) {
				si = (SoldeIndividuel) element;
			} else if (element instanceof HistoriqueSoldeIndividuel) {
				si = (SoldeIndividuel) ((HistoriqueSoldeIndividuel) element).eContainer();
			}

		}
	}

}

class RegulDialog extends Dialog {
    private Text txtDelta;
    private Text txtComment;
    private Integer delta;
    private String comment;

    public RegulDialog(Shell parentShell) {
        super(parentShell);
        parentShell.setText("Saisie des infos de régularisation");
    }
    
    private void updateStatus() {
    	Text deltaWidget = txtDelta;
        String sDelta = deltaWidget.getText();
        boolean enable = true;
        try {
			int delta = Integer.parseInt(sDelta);
			setDelta(delta);
		} catch (NumberFormatException nfe) {
			enable = false;
		}
        

        Text commentWidget = txtComment;
        String sComment = commentWidget.getText().trim();
        setComment(sComment);
        enable &= !sComment.isEmpty();
        getButton(OK).setEnabled(enable);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout layout = new GridLayout(2, false);
        layout.marginRight = 5;
        layout.marginLeft = 10;
        container.setLayout(layout);

        Label lblUser = new Label(container, SWT.NONE);
        lblUser.setText("Régul' :");

        txtDelta = new Text(container, SWT.BORDER);
        GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true,
                false, 1, 1);
		txtDelta.setLayoutData(layoutData);
        txtDelta.setText(getDelta()==null?"":getDelta().toString());
        
        txtDelta.setToolTipText("Le delta saisi sera ajouté au solde.\nUn nombre positif augmente donc le nombre de chèques qu'on doit au salarié.\nUn nombre négatif indique qu'on lui en devra moins (ou qu'il en devra plus!).");

        
        txtDelta.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                updateStatus();
            }
        });

        Label lblComment = new Label(container, SWT.NONE);
        GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false,
                false, 1, 1);
        gd_lblNewLabel.horizontalIndent = 1;
        lblComment.setLayoutData(gd_lblNewLabel);
        lblComment.setText("Commentaire :");

        GridData layoutDataComment = new GridData(SWT.FILL, SWT.CENTER, true,
                false, 1, 1);
        layoutDataComment.heightHint = convertHeightInCharsToPixels(5);
        txtComment = new Text(container, SWT.BORDER/*| SWT.MULTI*/ | SWT.WRAP);
        txtComment.setLayoutData(layoutDataComment);
        txtComment.setText(null==getComment()?"":getComment());
        txtComment.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
            	updateStatus();
            }
        });
        
        return container;
    }
    
    @Override
    protected Control createContents(Composite parent) {
    	
    	Control contents = super.createContents(parent);
    	updateStatus();
		return contents;
    }

    // override method to use "Login" as label for the OK button
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, "Régulariser", true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(450, 200);
    }

    @Override
    protected void okPressed() {
        String sDelta = txtDelta.getText();
        setDelta((sDelta==null||sDelta.trim().isEmpty())?null:Integer.parseInt(sDelta));
        setComment(txtComment.getText());
        super.okPressed();
    }

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
