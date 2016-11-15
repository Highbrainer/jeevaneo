package fr.mutualite.rh.model.popup.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notifier;
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
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.OrganismeFormation;
import fr.mutualite.rh.model.SessionFormation;

public class ImportFormationsAction implements IObjectActionDelegate {

	private Shell shell;

	private Mutualite mut;

	/**
	 * Constructor for Action1.
	 */
	public ImportFormationsAction() {
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
		fileDialog.setText("Veuillez sélectionner le fichier csv des formations à importer...");
		String filename = fileDialog.open();
		if (null == filename) {
			return;
		}

		Path path = new File(filename).toPath();

		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(mut);
		Collection<Notifier> notifiers = new ArrayList<>();
		notifiers.add(mut.getOrganismes());
		notifiers.addAll(mut.getEffectif().getEmployes());
		domain.getCommandStack().execute(new ChangeCommand(mut) {

			@Override
			public String getLabel() {
				return "Import du fichier des formations " + path.getFileName();
			}
			
			@Override
			protected void doExecute() {

				try {
//					//1Ã¨re passe pour les organismes de formation
//					Files.lines(path).map(s-> s.split(";")[3]).collect(Collectors.toSet()).stream()
//							.forEach(organisme -> {
//								ImportFormationsAction.this.addOrganismeIfNotExists(mut, organisme);
//							});
//					//2nde passe pour les sessions de formation

//					Files.lines(path, Charset.forName("Cp1252")).skip(1).forEach(System.out::println/*ImportFormationsAction.this::handleLine*/);
					Files.lines(path, Charset.forName("Cp1252")).filter(s -> {return !s.trim().isEmpty() && !s.trim().startsWith("#");}).map(s-> s.split(";")).filter(ss -> {return ss.length>0;}).skip(1).forEach(ImportFormationsAction.this::handleLine);
					
				} catch (IOException e) {
					StringWriter error = new StringWriter();
					e.printStackTrace(new PrintWriter(error));
					ErrorDialog.openError(shell, "Erreur!",
							"Une erreur a empêché le chargement du fichier des formations : " + e.getMessage(),
							new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
				}

				MessageDialog.openInformation(shell, "Mutualité RH", "Import des formations fait!");
			}
		});
	}
	
	private SessionFormation handleLine(String[] cells) {
		int i=-1;
		//System.out.println("Line : " + Arrays.toString(cells));
		String sMatricule = cells[++i];
		String nom = cells[++i];
		String prenom = cells[++i];
		String formation = cells[++i];
		String organisme = cells[++i];
		String sDebut = cells[++i];
		String sFin = cells[++i];
		String sDuree;
		try {
			sDuree = cells[++i];
		} catch (ArrayIndexOutOfBoundsException e1) {
			StringWriter error = new StringWriter();
			e1.printStackTrace(new PrintWriter(error));
			ErrorDialog.openError(shell, "Erreur!",
					"Une erreur a empêché le chargement du fichier des formations : Durée de formation manquante! " + Arrays.toString(cells),
					new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
			throw e1;
		}
		Date debut = null;
		Date fin = null;
		Float duree = null;
		if(null!=sDebut) {
			try {
				debut = sdf.parse(sDebut);
			} catch (ParseException e) {
				StringWriter error = new StringWriter();
				e.printStackTrace(new PrintWriter(error));
				ErrorDialog.openError(shell, "Erreur!",
						"Une erreur a empêché le chargement du fichier des formations : Format de date incorrect! " + e.getMessage(),
						new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
				throw new RuntimeException(e);
			}
		}
		if(null!=sFin) {
			try {
			fin = sdf.parse(sFin);
			} catch (ParseException e) {
				StringWriter error = new StringWriter();
				e.printStackTrace(new PrintWriter(error));
				ErrorDialog.openError(shell, "Erreur!",
						"Une erreur a empêché le chargement du fichier des formations : Format de date incorrect! " + e.getMessage(),
						new Status(IStatus.ERROR, "fr.mutualite.rh.model", error.getBuffer().toString()));
			}
		}
		if(null!=sDuree) {
			duree = Float.parseFloat(sDuree.replace(',', '.'));
		}
		
		OrganismeFormation of = addOrganismeIfNotExists(mut, organisme);
		Formation f = addFormationIfNotExists(of, formation);
		SessionFormation sf = addSessionFormationIfNotExists(f, debut, fin, duree);
		Employe emp = findEmploye(mut, nom, prenom);
		if(null!=emp) {
			addEmployeeToSessionFormationIfNotAlready(sf, emp);
		}
		return sf;
	}

	private void addEmployeeToSessionFormationIfNotAlready(SessionFormation sf, Employe emp) {
		if(!sf.getEmployes().contains(emp)) {
			sf.getEmployes().add(emp);
		}
		
	}

	private SessionFormation addSessionFormationIfNotExists(Formation f, Date debut, Date fin, Float duree) {
		return f.getSessionformation().stream().filter(sf -> sf.getDateDebut().equals(debut) && sf.getDateFin().equals(fin) && sf.getDuree().equals(duree)).findAny().orElseGet(()->addSessionFormation(f, debut, fin, duree));
	}

	private SessionFormation addSessionFormation(Formation f, Date debut, Date fin, Float duree) {
		SessionFormation sf = MutFactory.eINSTANCE.createSessionFormation();
		sf.setDateDebut(debut);
		sf.setDateFin(fin);
		sf.setDuree(duree);
		f.getSessionformation().add(sf);
		return sf;
	}

	private Formation addFormationIfNotExists(OrganismeFormation of, String formation) {
		return of.getFormations().stream().filter(f -> f.getLibelle().equalsIgnoreCase(formation)).findAny().orElseGet(()->addFormation(of, formation));
	}

	private Formation addFormation(OrganismeFormation of, String formation) {
		Formation f = MutFactory.eINSTANCE.createFormation();
		f.setLibelle(formation);
		of.getFormations().add(f);
		return f;
	}

	private boolean same(String s, String t) {
		if(null==s && null==t) return true;
		if(null!=s && null!=t) {
			return cleanName(s).equalsIgnoreCase(cleanName(t));
		}
		return false;
	}
	
	private Employe findEmploye(Mutualite mut2, String nom, String prenom) {
		try {
			return mut2.getEffectif().getEmployes().stream().filter(e -> (same(e.getNom(), nom) || same(e.getNomJeuneFille(), nom)) && same(e.getPrenom(),prenom)).findAny().get();
		} catch (NoSuchElementException e) {
			System.err.println("NOT FOUND: " + nom + " " + prenom);
//			ErrorDialog.openError(shell, "Erreur!", 
//					"Une erreur a empÃªché le chargement du fichier des formations : " + "Employe non trouvé : '" + nom + "' '" + prenom + "'",
//					new Status(IStatus.ERROR, "fr.mutualite.rh.model", "Employe non trouvé : '" + nom + "' '" + prenom + "'"));
			return null;
		} catch(RuntimeException t) {
			throw t;			
		}
	}

	private String cleanName(String nom) {
		if(nom==null) {
			return null;
		}
		String ret = nom.replaceAll("[éèêë]", "e").replaceAll("[àäâ]",  "a").replaceAll("[ïìî]", "i").replaceAll("-", " ").replaceAll("ç", "c").trim();
//		System.out.println(ret);
		return ret;
	}

	private OrganismeFormation addOrganismeIfNotExists(Mutualite mut2, String orga) {
		return mut2.getOrganismes().getOrganismeFormations().stream().filter(org -> orga.equals(org.getNom())).findAny().orElseGet(() -> addOrganismeFormation(mut2, orga));
	}

	private OrganismeFormation addOrganismeFormation(Mutualite mut2, String orga) {
		OrganismeFormation of = MutFactory.eINSTANCE.createOrganismeFormation();
		of.setNom(orga);
		mut2.getOrganismes().getOrganismeFormations().add(of);
		return of;
	}
	
	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Employe parse(String line) {
		String[] tokens = line.split(";");
		if (tokens.length<11) {
			throw new IllegalStateException("Format de fichier incorrect : " + line);
		}
		int i=-1;
		String sMatricule = tokens[++i].trim();
		String nom = tokens[++i].trim();
		String nomJeuneFille = tokens[++i].trim();
		String prenom = tokens[++i].trim();
		String sIdEtablissement = tokens[++i].trim();
		String sDateNaissance = tokens[++i].trim();
		String sDateEntreeEntreprise = tokens[++i].trim();
		String sDateSortieEntreprise = tokens[++i].trim();
		String inutile = tokens[++i].trim();
		String categorieEmploi = tokens[++i].trim();
		int matricule = Integer.parseInt(sMatricule);
		int idEtablissement = Integer.parseInt(sIdEtablissement);
		Date dateNaissance;
		Date dateEntreeEntreprise;
		Date dateSortieEntreprise;
		try {
			dateNaissance = sDateNaissance.isEmpty()?null:sdf.parse(sDateNaissance);
			dateEntreeEntreprise = sDateEntreeEntreprise.isEmpty()?null:sdf.parse(sDateEntreeEntreprise);
			dateSortieEntreprise = sDateSortieEntreprise.isEmpty()?null:sdf.parse(sDateSortieEntreprise);
		} catch (ParseException e) {
			throw new IllegalStateException("Format de date invalide " + line, e);
		}
		
		Employe employe = MutFactory.eINSTANCE.createEmploye();
//		employe.setAffectationClassificationCourante(findOrCreate);
//		employe.setAffectationEmploiCourante(value);
		employe.setDateEmbauche(dateEntreeEntreprise);
		employe.setDateNaissance(dateNaissance);
		employe.setDateSortieEntreprise(dateSortieEntreprise);
		employe.setEtablissement(findEtablissement(mut, idEtablissement));
		employe.setMatricule(matricule);
		employe.setNom(nom);
		employe.setNomJeuneFille(nomJeuneFille.isEmpty()?null:nomJeuneFille);
		employe.setPrenom(prenom);
		return employe;
	}

	private Etablissement findEtablissement(Mutualite mut2, int idEtablissement) {
		return mut2.getEtablissements().getEtablissements().stream().filter(e->e.getId()==idEtablissement).findAny().get();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			mut = null;
			if (element instanceof Mutualite) {
				mut = (Mutualite) element;
			}

		}
	}

}
