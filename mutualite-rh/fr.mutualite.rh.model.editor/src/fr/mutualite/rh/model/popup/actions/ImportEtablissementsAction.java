package fr.mutualite.rh.model.popup.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Etablissements;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;

public class ImportEtablissementsAction implements IObjectActionDelegate {

	private Shell shell;

	private Etablissements etabs;

	/**
	 * Constructor for Action1.
	 */
	public ImportEtablissementsAction() {
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
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Veuillez sélectionner le fichier csv des établissements Ã  importer...");
		String filename = fileDialog.open();
		if (null == filename) {
			return;
		}

		Path path = new File(filename).toPath();

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(etabs);
		domain.getCommandStack().execute(new ChangeCommand(etabs) {
			
			@Override
			public String getLabel() {
				return "Import du fichier des etablissements " + path.getFileName();
			}
			
			@Override
			protected void doExecute() {

				try {
					Files.lines(path, StandardCharsets.ISO_8859_1)/*.skip(1)*/
					.filter(s->!s.toLowerCase().replaceAll("\\s", "").equals("matricule;nom"))
					.collect(Collectors.toSet()).stream()
							.map(ImportEtablissementsAction.this::parse).forEach(etab -> {
								ImportEtablissementsAction.this.addIfNotExists(etabs, etab);
							});
					MessageDialog.openInformation(shell, "Mut Model", "Importer les établissements was executed.");
				} catch (Throwable t) {
					StringWriter error = new StringWriter();
					t.printStackTrace(new PrintWriter(error));
					ErrorDialog.openError(shell, "Erreur!",
							"Une erreur a empêché le chargement du fichier des établissements : " + t.getMessage(),
							new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
				}

			}
		});
	}

	private void addIfNotExists(Etablissements etabs2, Etablissement etab) {
		if (!etabs2.getEtablissements().stream().anyMatch(etabl -> etab.getId() == etabl.getId())) {
			etabs2.getEtablissements().add(etab);
		}
	}

	private Pattern p = Pattern.compile("\\\"?\\s*([0-9]+)\\s*\\\"?;\\\"?\\s*(.*?)\\s*\\\"?;?");

	private Etablissement parse(String line) {
		Matcher m = p.matcher(line);
		if (!m.matches()) {
			throw new IllegalStateException("Format de fichier incorrect : " + line);
		}
		String sId = m.group(1);
		String label = m.group(2);
		int id = Integer.parseInt(sId);
		Etablissement etablissement = MutFactory.eINSTANCE.createEtablissement();
		etablissement.setId(id);
		etablissement.setNom(label);
		return etablissement;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			etabs = null;
			if (element instanceof Mutualite) {
				Mutualite mut = (Mutualite) element;
				etabs = mut.getEtablissements();
			} else if (element instanceof Etablissements) {
				etabs = (Etablissements) element;
			}

		}
	}

}
