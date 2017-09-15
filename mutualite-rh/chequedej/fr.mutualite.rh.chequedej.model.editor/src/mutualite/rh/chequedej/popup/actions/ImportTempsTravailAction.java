package mutualite.rh.chequedej.popup.actions;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.prefs.Preferences;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.Contrats;
import mutualite.rh.chequedej.provider.ChequedejItemProviderAdapterFactory;

public class ImportTempsTravailAction implements IObjectActionDelegate {

	private Shell shell;

	private Contrats root;

	/**
	 * Constructor for Action1.
	 */
	public ImportTempsTravailAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	protected Logger log = Logger.getLogger(getClass());

	private Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

	private File promptFile() {
		File def = defaultFile();

		// def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\congés v3.csv");

		String[] extensions = { "*.csv", "*.*" };
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
		fd.setFilterExtensions(extensions);
		fd.setFilterIndex(0);
		fd.setText("Choisir le fichier à importer...");
		if (def != null) {
			if (def.isDirectory()) {
				fd.setFilterPath(def.getAbsolutePath());
			} else {
				fd.setFileName(def.getName());
				fd.setFilterPath(def.getParent());
			}
		}
		String file = fd.open();
		if (null == file) {
			return null;
		}
		File ret = new File(file);
		prefs.put("file-dir", file);
		return ret;

		// JFileChooser chooser = new JFileChooser();
		//// chooser.setMultiSelectionEnabled(true);
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", ".xslx");
		// // FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		// chooser.setFileFilter(filter);
		// if (null != def) {
		// chooser.setSelectedFile(def);
		// }
		// chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		// int ret = chooser.showOpenDialog(null);
		//
		// if (ret == JFileChooser.APPROVE_OPTION) {
		// File in = chooser.getSelectedFile();
		//
		// String serialized = in.getAbsolutePath();
		// prefs.put("file-dir", serialized);
		// return in;
		// }
		//
		// return null;
	}

	private File defaultFile() {
		File def = null;
		String sDef = prefs.get("file-dir", null);
		if (null != sDef) {
			def = new File(sDef);
		}
		File t = new File("T:/");
		if (null == def && t.exists()) {
			def = t;
		}
		return def;
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

		ChangeCommand command = new ChangeCommand(root) {

			@Override
			public String getLabel() {	
				return "Import des temps de travail";
			}

			@Override
			protected void doExecute() {
				File in = promptFile();
				if (null == in) {
					return;
				}
				try {
					Files.lines(in.toPath(), StandardCharsets.ISO_8859_1).skip(1).map(line -> line.split("\\s*;\\s*")).forEach(a -> {
						String sMatricule = a[0].replaceFirst("^\"\\s*(.*)\\s*\"$", "$1").trim();
						if(sMatricule.isEmpty()) {
							log.warn("Pas de matricule pour la ligne :" + Arrays.toString(a));
							return;
						}
						int matricule = Integer.parseInt(sMatricule);
						String sHoraire = a[10].replace(',', '.').replaceFirst("^\"\\s*(.*)\\s*\"$", "$1").trim();
						Float ttm = null;
						try {
							ttm = Float.parseFloat(sHoraire);
						} catch (NumberFormatException nfe) {
							log.debug("Format numérique invalide : on considère un temps plein! '" + sHoraire + "'", nfe);
							//temps plein!
						}
						root.getOrCreateContrat(matricule).setTempsTravailMensuel(ttm);
					});
					ChequedejItemProviderAdapterFactory adapterFactory = new ChequedejItemProviderAdapterFactory();
					IItemLabelProvider adapter = (IItemLabelProvider) adapterFactory.createContratAdapter();
					
					ECollections.sort(root.getContrats(), (ci1, ci2) -> adapter.getText(ci1).compareTo(adapter.getText(ci2)));
					MessageDialog.openInformation(aShell, "Import OK", "L'import des temps de travail est terminé.");
					} catch (Throwable e) {
					shell.getDisplay().asyncExec(() -> {
						MessageDialog.openError(shell, "Erreurs à l'import", "ERREUR : " + e.getMessage());
						log.error("", e);
					});
				}
			}

		};
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(root);
		if (null != domain) {
			try {
				domain.getCommandStack().execute(command);
			} catch (WrappedException e) {
				MessageDialog.openError(shell, "Erreurs à l'import", "ERREUR : " + e.getCause().getMessage());
			} catch (Throwable e) {
				MessageDialog.openError(shell, "Erreurs à l'import", "ERREUR : " + e.getMessage());
			} 
		}
	}
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			root = null;
			if (element instanceof ChequeDej) {
				root = ((ChequeDej) element).getContrats();
			} else if (element instanceof Contrats) {
				root = (Contrats) element;
			}

		}
	}

}
