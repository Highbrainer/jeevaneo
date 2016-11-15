package fr.mutualite.rh.model.popup.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.ClassificationStatut;
import fr.mutualite.rh.model.Effectif;
import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;

public class ImportSalariesAction implements IObjectActionDelegate {

	private Shell shell;

	private Mutualite mut;

	/**
	 * Constructor for Action1.
	 */
	public ImportSalariesAction() {
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
		fileDialog.setText("Veuillez sélectionner le fichier csv des salariés à importer...");
		String filename = fileDialog.open();
		if (null == filename) {
			return;
		}

		Path path = new File(filename).toPath();

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(mut);
		domain.getCommandStack().execute(new ChangeCommand(mut) {

			@Override
			public String getLabel() {
				return "Import du fichier des salariés " + path.getFileName();
			}

			@Override
			protected void doExecute() {

//				mut.getEffectif().getEmployes().forEach(emp -> {
//					emp.getAffectationsClassification().clear();
//					emp.setAffectationClassificationCourante(null);
//				});
				
				try {
					Files.lines(path, StandardCharsets.ISO_8859_1).collect(Collectors.toSet()).stream().map(ImportSalariesAction.this::parse)
							.forEach(emp -> {
//								ImportSalariesAction.this.addIfNotExists(mut, emp);
							});
				} catch (Throwable t) {
					StringWriter error = new StringWriter();
					t.printStackTrace(new PrintWriter(error));
					ErrorDialog.openError(shell, "Erreur!", "Une erreur a empêché le chargement du fichier des établissements : " + t.getMessage(),
							new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
				}

				MessageDialog.openInformation(shell, "Mut Model", "Import du fichier des salariés OK!");
			}
		});
	}

	private void addIfNotExists(Mutualite mut2, Employe emp) {
		if(null==emp) {
			return;
		}
		if (!mut2.getEffectif().getEmployes().stream().anyMatch(empl -> emp.getMatricule() == empl.getMatricule())) {
			mut2.getEffectif().getEmployes().add(emp);
		}
	}

	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Employe parse(String line) {
		String[] tokens = line.split(";");
		if (tokens.length < 11) {
			throw new IllegalStateException("Format de fichier incorrect : " + line);
		}
		int i = -1;
		String sMatricule = tokens[++i].trim();
		String nom = tokens[++i].trim();
		String nomJeuneFille = tokens[++i].trim();
		String prenom = tokens[++i].trim();
		String sIdEtablissement = tokens[++i].trim();
		String sDateNaissance = tokens[++i].trim();
		String sDateEntreeEntreprise = tokens[++i].trim();
		String sDateSortieEntreprise = tokens[++i].trim();
//		String inutile = tokens[++i].trim();
		String sCategorieEmploi = tokens[++i].trim();
		String libelleEmploi = tokens[++i].trim();
		
		int matricule;
		try {
			matricule = Integer.parseInt(sMatricule);
		} catch (NumberFormatException e1) {
			return null;
		}
		
		Employe employe = getOrCreateEmploye(mut, matricule);
		int categorieEmploi;
		int idEtablissement;
		try {
			idEtablissement = Integer.parseInt(sIdEtablissement);
			categorieEmploi = Integer.parseInt(sCategorieEmploi);
		} catch (NumberFormatException e) {
			System.err.println("J'ignore " + employe.getPrenom() + " " + employe.getNom());
			return employe;
		}
		
		
//		Date dateNaissance;
//		Date dateEntreeEntreprise;
//		Date dateSortieEntreprise;
//		try {
//			dateNaissance = sDateNaissance.isEmpty() ? null : sdf.parse(sDateNaissance);
//			dateEntreeEntreprise = sDateEntreeEntreprise.isEmpty() ? null : sdf.parse(sDateEntreeEntreprise);
//			dateSortieEntreprise = sDateSortieEntreprise.isEmpty() ? null : sdf.parse(sDateSortieEntreprise);
//		} catch (ParseException e) {
//			throw new IllegalStateException("Format de date invalide " + line, e);
//		}
//		
////		if(null!=dateSortieEntreprise && dateSortieEntreprise.after(new Date())) {
////			System.err.println("Employé ignoré car ne faisant plus partie de l'entreprise : '" + nom + " " + prenom + "'.");
////			return null;
////		}
//
//		//EMPLOI
//		Emploi emploi = getOrCreateEmploi(mut, libelleEmploi);
//		Affectation affectationEmploiCourante = employe.getAffectationEmploiCourante();
//		if (null == affectationEmploiCourante || !affectationEmploiCourante.getEmploi().getIntitule().equalsIgnoreCase(libelleEmploi)) {
//			Affectation affectationEmploi = MutFactory.eINSTANCE.createAffectation();
//			affectationEmploi.setEmploi(emploi);
//			employe.getAffectationsEmploi().add(affectationEmploi);
//			employe.setAffectationEmploiCourante(affectationEmploi);
//		}
		
		//CLASSIF
		ClassificationStatut classif = ClassificationStatut.get(categorieEmploi);
		AffectationClassification affectationClassificationCourante = employe.getAffectationClassificationCourante();
		if(null==affectationClassificationCourante || !employe.getAffectationsClassification().contains(affectationClassificationCourante)/*|| !affectationClassificationCourante.getClassification().equals(classif)*/) {
			if(employe.getAffectationsClassification().isEmpty()) {
			AffectationClassification affectationClassification = MutFactory.eINSTANCE.createAffectationClassification();
			affectationClassification.setClassification(classif);
			employe.setAffectationClassificationCourante(affectationClassification);
			employe.getAffectationsClassification().add(affectationClassification);
			} else {
				employe.setAffectationClassificationCourante(employe.getAffectationsClassification().get(employe.getAffectationsClassification().size()-1));
			}
		}
		employe.getAffectationClassificationCourante().setClassification(classif);

		// employe.setAffectationClassificationCourante(findOrCreate);
		// employe.setAffectationEmploiCourante(value);
//		employe.setDateEmbauche(dateEntreeEntreprise);
//		employe.setDateNaissance(dateNaissance);
//		employe.setDateSortieEntreprise(dateSortieEntreprise);
//		employe.setEtablissement(findEtablissement(mut, idEtablissement));
//		employe.setMatricule(matricule);
//		employe.setNom(nom);
//		employe.setNomJeuneFille(nomJeuneFille.isEmpty() ? null : nomJeuneFille);
//		employe.setPrenom(prenom);
		return employe;
	}

	private Employe getOrCreateEmploye(Mutualite mut2, int matricule) {
		return mut2.getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny()
				.orElseGet(() -> MutFactory.eINSTANCE.createEmploye());
	}

	private Emploi getOrCreateEmploi(Mutualite mut2, String libelleEmploi) {
		return mut2.getEmplois().getEmplois().stream().filter(e -> e.getIntitule().equalsIgnoreCase(libelleEmploi)).findAny()
				.orElseGet(() -> addEmploi(mut2, libelleEmploi));
	}

	private Emploi addEmploi(Mutualite mut2, String categorieEmploi) {
		Emploi emploi = MutFactory.eINSTANCE.createEmploi();
		emploi.setIntitule(categorieEmploi);
		mut2.getEmplois().getEmplois().add(emploi);
		return emploi;
	}

	private Etablissement findEtablissement(Mutualite mut2, int idEtablissement) {
		return mut2.getEtablissements().getEtablissements().stream().filter(e -> e.getId() == idEtablissement).findAny().get();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			mut = null;
			if (element instanceof Effectif) {
				Effectif eff = (Effectif) element;
				mut = (Mutualite) eff.eContainer();
			} else if (element instanceof Mutualite) {
				mut = (Mutualite) element;
			}

		}
	}

}
