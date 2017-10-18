package mutualite.rh.chequedej.popup.actions;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
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

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.Avance;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.Deje;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.Solde;

public class AddAvanceAction implements IObjectActionDelegate {

	class AvanceDialog extends Dialog {
		private Text txtMatricule;
		private Text txtAmount;
		private Text txtComment;
		private Text txtMois;
		private Integer amount;
		private Integer matricule;
		private String mois;
		private String comment;

		public AvanceDialog(Shell parentShell) {
			super(parentShell);
			parentShell.setText("Déclaration d'une avance");
		}

		private void updateStatus() {
			boolean enable = true;
			if (txtAmount != null) {
				String sAmount = txtAmount.getText();
				try {
					int amount = Integer.parseInt(sAmount);
					setAmount(amount);
					if (amount == 0) {
						enable &= false;
					}
				} catch (NumberFormatException nfe) {
					enable = false;
				}
			}

			if (txtComment != null) {
				// comment
				String sComment = txtComment.getText().trim();
				setComment(sComment);
				enable &= !sComment.isEmpty();
			}

			if (txtMatricule != null) {
				// matricule
				String sMatricule = txtMatricule.getText().trim();
				try {
					setMatricule(Integer.parseInt(sMatricule));
					enable &= !sMatricule.isEmpty();
				} catch (NumberFormatException e) {
					enable = false;
				}
			}

			if (txtMois != null) {
				// mois
				String sMois = txtMois.getText().trim();
				setMois(sMois);
				enable &= !sMois.isEmpty();
				try {
					o.getCarnet().mois(sMois);
				} catch (RuntimeException e) {
					enable = false;
				}
			}

			getButton(OK).setEnabled(enable);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
			GridLayout layout = new GridLayout(2, false);
			layout.marginRight = 5;
			layout.marginLeft = 10;
			container.setLayout(layout);

			{
				GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				Label lbl = new Label(container, SWT.NONE);
				lbl.setText("Matricule :");
				Text txt = new Text(container, SWT.BORDER);
				txt.setLayoutData(layoutData);
				txt.setText("");
				txt.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						updateStatus();
					}
				});
				txtMatricule = txt;

			}
			{
				GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				Label lbl = new Label(container, SWT.NONE);
				lbl.setText("Mois (aaaamm) :");
				Text txt = new Text(container, SWT.BORDER);
				txt.setLayoutData(layoutData);
				txt.setText(o.getCarnet().formatMois(LocalDate.now()));
				txt.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						updateStatus();
					}
				});
				txtMois = txt;

			}
			{
				GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				Label lbl = new Label(container, SWT.NONE);
				lbl.setText("Nb Chèques :");
				Text txt = new Text(container, SWT.BORDER);
				txt.setLayoutData(layoutData);
				txt.setText("");
				txt.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						updateStatus();
					}
				});
				txtAmount = txt;

			}

			Label lblComment = new Label(container, SWT.NONE);
			GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			gd_lblNewLabel.horizontalIndent = 1;
			lblComment.setLayoutData(gd_lblNewLabel);
			lblComment.setText("Commentaire :");

			GridData layoutDataComment = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
			layoutDataComment.heightHint = convertHeightInCharsToPixels(5);
			txtComment = new Text(container, SWT.BORDER/* | SWT.MULTI */ | SWT.WRAP);
			txtComment.setLayoutData(layoutDataComment);
			txtComment.setText(null == getComment() ? "" : getComment());
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
			createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		}

		@Override
		protected Point getInitialSize() {
			return new Point(450, 260);
		}

		// @Override
		// protected void okPressed() {
		//// String sAmount = txtAmount.getText();
		//// setAmount((sAmount == null || sAmount.trim().isEmpty()) ? null : Integer.parseInt(sAmount));
		//// setComment(txtComment.getText());
		// super.okPressed();
		// }

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Integer getMatricule() {
			return matricule;
		}

		public void setMatricule(Integer matricule) {
			this.matricule = matricule;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getMois() {
			return mois;
		}

		public void setMois(String mois) {
			this.mois = mois;
		}

	}

	private Shell shell;

	private ChequeDej o;

	/**
	 * Constructor for Action1.
	 */
	public AddAvanceAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	private Employe findEmploye(int mat) {
		Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == mat).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		AvanceDialog dlg = new AvanceDialog(shell);
		if (dlg.open() != Window.OK) {
			return;
		}

		Integer amount = dlg.getAmount();
		String comment = dlg.getComment();
		Integer matricule = dlg.getMatricule();
		String mois = dlg.getMois();

		Employe employe = findEmploye(matricule);
		if (employe == null) {
			if (!MessageDialog.openQuestion(shell, "Matricule inconnu dans GIC", "Ce matricule n'est pas (encore?) renseigné dans GIC. Continuer tout de même?")) {
				return;
			}
		} else {
			if (!MessageDialog.openQuestion(shell, "Confirmation", "Enregistrer une avance de " + amount + " cheque(s) pour " + employe.getLabel() + ". Sûre?")) {
				return;
			}
		}

		Deje dejes = o.getDejes();
		ChangeCommand command = new ChangeCommand(dejes) {

			@Override
			public String getLabel() {
				return "Ajout d'une avance";
			}

			@Override
			protected void doExecute() {
				DejeIndividuel di = dejes.getOrCreateDejeMensuel(mois).getOrCreateDejeIndividuel(matricule);
				Avance avance = ChequedejFactory.eINSTANCE.createAvance();
				avance.setComment(comment);
				avance.setDate(new Date());
				avance.setNbCheques(amount);
				di.setAvance(avance);
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(dejes);
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
			o = null;
			if (element instanceof ChequeDej) {
				o = (ChequeDej) element;
			} else if (element instanceof Solde) {
				o = (ChequeDej) ((Solde) element).eContainer();
			}
		}
	}

}
