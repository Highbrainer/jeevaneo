package fr.mutualite.rh.model.popup.actions;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.ClassificationStatut;
import fr.mutualite.rh.model.Effectif;
import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;

public class ImportSalariesExtendedAction implements IObjectActionDelegate {

	private Shell shell;

	private Mutualite mut;

	/**
	 * Constructor for Action1.
	 */
	public ImportSalariesExtendedAction() {
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
		fileDialog.setText("Veuillez sélectionner le fichier 'retravaillé' csv des salariés à importer...");
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

				try {
					Files.lines(path, Charset.forName	("Cp1252")/* StandardCharsets.ISO_8859_1 */).skip(1).collect(Collectors.toSet()).stream()
							.forEach(ImportSalariesExtendedAction.this::parse);
				} catch (Throwable t) {
					StringWriter error = new StringWriter();
					t.printStackTrace(new PrintWriter(error));
					ErrorDialog.openError(shell, "Erreur!", "Une erreur a empêché le chargement du fichier des établissements : " + t.getMessage(),
							new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
					t.printStackTrace();
				}

				MessageDialog.openInformation(shell, "Mut Model", "Import du fichier des salariés OK!");
			}
		});
	}

//	private void addIfNotExists(Mutualite mut2, Employe emp) {
//		if (emp.getDateSortieEntreprise() != null && emp.getDateSortieEntreprise().before(new Date())) {
//			// ignore
//			System.err.println("L'employé '" + emp.getNom() + " " + emp.getPrenom() + "' a quitté l'entreprise le " + sdf.format(emp.getDateSortieEntreprise()) + " => je l'ignore!");
//			return;
//		}
//		if (!mut2.getEffectif().getEmployes().stream().anyMatch(empl -> emp.getMatricule() == empl.getMatricule())) {
//			mut2.getEffectif().getEmployes().add(emp);
//		}
//	}

	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

	private Employe parse(String line) {
		String[] tokens = line.split("\\s*;\\s*");
		if (tokens.length < 10) {
			throw new IllegalStateException("Format de fichier incorrect (il manque des colonnes... les 10 premières sont obligatoires) : " + line);
		}
		int i = -1;
		// champs obligatoires
		String sMatricule = intToken(tokens, ++i);
		String nom = token(tokens, ++i);
		String nomJeuneFille = token(tokens, ++i);
		String prenom = token(tokens, ++i);
		String sIdEtablissement = intToken(tokens, ++i);
		String sDateNaissance = token(tokens, ++i);
		String sDateEntreeEntreprise = token(tokens, ++i);
		String sDateSortieEntreprise = token(tokens, ++i);
		// String inutile = token(tokens, ++i);
		String sCategorieEmploi = intToken(tokens, ++i);
		String libelleEmploi = token(tokens, ++i);

		// champs facultatifs
//		String sDateEntreeEmploi = token(tokens, ++i);
//		String sDatePrecedentEntretien = token(tokens, ++i);
//		String nomResponsable = token(tokens, ++i);
		String sMatriculeResponsable = intToken(tokens, ++i);
//		String nomEntreteneur = token(tokens, ++i);
		String sMatriculeEntreteneurs = intToken(tokens, ++i);
		int matricule;
		try {
			matricule = Integer.parseInt(sMatricule);
		} catch (NumberFormatException e2) {
			throw new IllegalStateException("Matricule non numérique ou manquant : '" + sMatricule + "' dans " + line);
		}
		Integer matriculeResponsable = null;
		try {
			if (sMatriculeResponsable != null && !sMatriculeResponsable.isEmpty()) {
				matriculeResponsable = Integer.parseInt(sMatriculeResponsable.trim());
			}
		} catch (NumberFormatException e1) {
			System.err.println("Matricule de responsable non numérique : '" + sMatriculeResponsable + "'");
			e1.printStackTrace();
		}
		List<Integer> matriculesEntreteneur = new ArrayList<>();
		try {
			if (sMatriculeEntreteneurs != null && !sMatriculeEntreteneurs.isEmpty()) {
				String[] sMatriculesEntreteneurs = sMatriculeEntreteneurs.split(",");
				for (String sMatriculeEntreteneur : sMatriculesEntreteneurs) {
					int matriculeEntreteneur = Integer.parseInt(sMatriculeEntreteneur.trim());
					matriculesEntreteneur.add(matriculeEntreteneur);
				}
			}
		} catch (NumberFormatException e1) {
			System.err.println("Matricule de responsable d'entretien non numérique : '" + sMatriculeResponsable + "'");
			e1.printStackTrace();
		}
		int idEtablissement = Integer.parseInt(sIdEtablissement);
		Date dateNaissance;
		Date dateEntreeEntreprise;
		Date dateSortieEntreprise;
		Date dateEntreeEmploi;
//		Date datePrecedentEntretien;
		try {
			dateNaissance = sDateNaissance.isEmpty() ? null : sdf.parse(sDateNaissance);
			dateEntreeEntreprise = sDateEntreeEntreprise.isEmpty() ? null : sdf.parse(sDateEntreeEntreprise);
			dateSortieEntreprise = sDateSortieEntreprise.isEmpty() ? null : sdf.parse(sDateSortieEntreprise);
//			dateEntreeEmploi = (sDateEntreeEmploi == null || sDateEntreeEmploi.isEmpty()) ? null : sdf.parse(sDateEntreeEmploi);
//			datePrecedentEntretien = (sDatePrecedentEntretien == null || sDatePrecedentEntretien.isEmpty()) ? null : sdf.parse(sDatePrecedentEntretien);
		} catch (ParseException e) {
			throw new IllegalStateException("Format de date invalide " + line, e);
		}

		Employe employe = getOrCreateEmploye(mut, matricule);

		// EMPLOI
		Emploi emploi = getOrCreateEmploi(mut, libelleEmploi);
		Affectation affectationEmploiCourante = employe.getAffectationEmploiCourante();
		if (null == affectationEmploiCourante || !affectationEmploiCourante.getEmploi().getIntitule().equalsIgnoreCase(libelleEmploi)) {
			Affectation affectationEmploi = MutFactory.eINSTANCE.createAffectation();
			affectationEmploi.setEmploi(emploi);
			employe.getAffectationsEmploi().add(affectationEmploi);
			employe.setAffectationEmploiCourante(affectationEmploi);
		}

		// date d'entrée dans l'emploi
		affectationEmploiCourante = employe.getAffectationEmploiCourante();
//		if (null != dateEntreeEmploi) {
//			affectationEmploiCourante.setDateDebut(dateEntreeEmploi);
//		}

//		// PRECEDENT ENTRETIEN
//		if (null != datePrecedentEntretien) {
//			if (!employe.getEntretiens().stream().anyMatch(e -> e.getDate().equals(datePrecedentEntretien))) {
//				EntretienProfessionnel entretien = MutFactory.eINSTANCE.createEntretienProfessionnel();
//				entretien.setEnCours(false);
//				entretien.setFake(true);
//				entretien.setDate(datePrecedentEntretien);
//				employe.getEntretiens().add(entretien);
//			}
//		}

		// RESPONSABLE
		if (null != matriculeResponsable) {
			Employe responsable = getOrCreateEmploye(mut, matriculeResponsable);
			employe.setResponsable(responsable);
		}

		// RESPONSABLES D'ENTRETIEN
		for (int matriculeEntreteneur : matriculesEntreteneur) {
			Employe responsable = getOrCreateEmploye(mut, matriculeEntreteneur);
			employe.getEntreteneurs().add(responsable);
		}

		sCategorieEmploi = sCategorieEmploi.trim().isEmpty() ? null : sCategorieEmploi.trim().toUpperCase();
		// CLASSIF
		if (sCategorieEmploi != null) {
			ClassificationStatut classif;
			try {
				Integer categorieEmploi = Integer.parseInt(sCategorieEmploi);
				classif = ClassificationStatut.get(categorieEmploi);
			} catch (NumberFormatException e) {
				classif = ClassificationStatut.getByName(sCategorieEmploi);
			}
			AffectationClassification affectationClassificationCourante = employe.getAffectationClassificationCourante();
			if (null == affectationClassificationCourante || !affectationClassificationCourante.getClassification().equals(classif)) {
				AffectationClassification affectationClassification = MutFactory.eINSTANCE.createAffectationClassification();
				affectationClassification.setClassification(classif);
				employe.setAffectationClassificationCourante(affectationClassification);
				employe.getAffectationsClassification().add(affectationClassification);
			}
		}

		// employe.setAffectationClassificationCourante(findOrCreate);
		// employe.setAffectationEmploiCourante(value);
		employe.setDateEmbauche(dateEntreeEntreprise);
		employe.setDateNaissance(dateNaissance);
		employe.setDateSortieEntreprise(dateSortieEntreprise);
		employe.setEtablissement(findEtablissement(mut, idEtablissement));
		employe.setMatricule(matricule);
		employe.setNom(nom);
		employe.setNomJeuneFille(nomJeuneFille.isEmpty() ? null : nomJeuneFille);
		employe.setPrenom(prenom);
		return employe;
	}

	private String intToken(String[] tokens, int i) {
		String token = token(tokens, i);
		if(null==token) {
			return null;
		}
		String clean = token.replaceAll(",0+", "");
		return clean;
	}

	private String token(String[] tokens, int i) {
		if (i >= tokens.length) {
			return null;
		}
		return tokens[i].replaceFirst("^\\\"(.*)\\\"$", "$1").trim();
	}

	private Employe getOrCreateEmploye(Mutualite mut2, int matricule) {
		return mut2.getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny().orElseGet(() -> {
			Employe e = MutFactory.eINSTANCE.createEmploye();
			e.setMatricule(matricule);
			mut2.getEffectif().getEmployes().add(e);
			return e;
		});
	}

	private Emploi getOrCreateEmploi(Mutualite mut2, String libelleEmploi) {
		return mut2.getEmplois().getEmplois().stream().filter(e -> e.getIntitule().equalsIgnoreCase(libelleEmploi)).findAny().orElseGet(() -> addEmploi(mut2, libelleEmploi));
	}

	private Emploi addEmploi(Mutualite mut2, String categorieEmploi) {
		Emploi emploi = MutFactory.eINSTANCE.createEmploi();
		emploi.setIntitule(categorieEmploi);
		mut2.getEmplois().getEmplois().add(emploi);
		return emploi;
	}

	private Etablissement findEtablissement(Mutualite mut2, int idEtablissement) {
		return mut2.getEtablissements().getEtablissements().stream().filter(e -> e.getId() == idEtablissement).findAny().orElseThrow(() -> new RuntimeException("Etablissement non trouvé : " + idEtablissement));
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
