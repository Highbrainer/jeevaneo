package fr.mutualite.rh.model.popup.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.ECollections;
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

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Etablissements;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.webapp.CdoServlet;

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

		run(shell);
	}

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {
		FileDialog fileDialog = new FileDialog(aShell);
		fileDialog.setText("Veuillez sélectionner le fichier csv des établissements Ã  importer...");
		String filename = fileDialog.open();
		if (null == filename) {
			return;
		}

		Path path = new File(filename).toPath();

		ChangeCommand command = new ChangeCommand(etabs) {

			@Override
			public String getLabel() {
				return "Import du fichier des etablissements " + path.getFileName();
			}

			@Override
			protected void doExecute() {

				doImport(aShell, path);

			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(etabs);
		if (null != domain) {
			domain.getCommandStack().execute(command);
		} else {
			CdoServlet.getCdo().doInTransaction(transaction -> {
				if (null == etabs) {
					etabs = CdoServlet.getCdo().findMutualite(transaction).getEtablissements();
				}
				etabs = transaction.getObject(etabs);

				doImport(shell, path);
				return true;
			});
		}
	}

	public void doImport(Shell aShell, Path path) {
		// try {
		// ECollections.sort(CdoServlet.getMutualite().getUtilisateurs().getUtilisateurs(), (u1,u2)->u1.getEmploye().getNom().compareTo(u2.getEmploye().getNom()));
		// ((Mutualite)etabs.eContainer()).getEmplois().getEmplois().forEach(e -> {e.setIntitule(e.getIntitule().replaceAll("_", " "));});
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		try {
			Files.lines(path, StandardCharsets.ISO_8859_1)/* .skip(1) */
					// .filter(s->!s.toLowerCase().replaceAll("\\s", "").startsWith("matricule;nom"))
					.collect(Collectors.toSet()).stream().forEach(ImportEtablissementsAction.this::parse);
			MessageDialog.openInformation(aShell, "Mut Model", "Importer les établissements was executed.");
		} catch (Throwable t) {
			StringWriter error = new StringWriter();
			t.printStackTrace(new PrintWriter(error));
			ErrorDialog.openError(aShell, "Erreur!", "Une erreur a empêché le chargement du fichier des établissements : " + t.getMessage(),
					new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
		}
	}

	private Etablissement parse(String line) {
		String[] strings = line.split(";");
		if (strings.length < 2) {
			throw new IllegalStateException("Format de fichier incorrect : " + line);
		}
		String sId = strings[0];
		String label = strings[1];
		int id = Integer.parseInt(sId);

		Etablissement etablissement = etabs.getEtablissements().stream().filter(et -> et.getId() == id).findAny().orElseGet(() -> {

			Etablissement etab = MutFactory.eINSTANCE.createEtablissement();
			etab.setId(id);
			etabs.getEtablissements().add(etab);
			return etab;
		});
		etablissement.setNom(label);

		if (strings.length > 2) {
			String sMatResponsable = strings[2];
			int matResponsable = Integer.parseInt(sMatResponsable);
			Employe resp = findOrCreateEmploye(matResponsable);
			etablissement.setResponsable(resp);
		}
		if (strings.length > 3) {
			String matsEntreteneurs = strings[3];
			if (!matsEntreteneurs.trim().isEmpty()) {
				etablissement.getEntreteneurs().clear();
				Arrays.stream(matsEntreteneurs.trim().split(",")).map(Integer::parseInt).forEach(matEntreteneur -> {
					addEntreteneurIfNotAlready(etablissement, matEntreteneur);
				});
			}
		}
		return etablissement;
	}

	private Employe findOrCreateEmploye(int matResponsable) {
		Mutualite mut = (Mutualite) etabs.eContainer();
		return mut.getEffectif().getEmployes().stream().filter(emp -> emp.getMatricule() == matResponsable).findAny().orElseGet(() -> {
			Employe resp = MutFactory.eINSTANCE.createEmploye();
			resp.setNom("A définir!");
			resp.setMatricule(matResponsable);
			mut.getEffectif().getEmployes().add(resp);
			return resp;
		});
	}

	private void addEntreteneurIfNotAlready(Etablissement etablissement, Integer matEntreteneur) {
		if (!etablissement.getEntreteneurs().stream().anyMatch(emp -> emp.getMatricule() == matEntreteneur)) {
			Employe entreteneur = findOrCreateEmploye(matEntreteneur);
			etablissement.getEntreteneurs().add(entreteneur);
		}

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
