package fr.mutualite.rh.webapp.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmiCleaner2 {

	public static void main(String[] args) throws IOException {
		File in = new File("/E:/temp/2017/04/11/backup-2017-04-11.xml");
		File out = new File(in.getAbsolutePath().replaceFirst("\\.xml$", "-clean\\.xml"));
		try (Reader r = new FileReader(in); OutputStream o = new FileOutputStream(out); PrintStream ps = new PrintStream(o);) {
			new XmiCleaner2().clean(r, ps, patterns);
			System.out.println("Done");
		}

	}

//	static Pattern pEmployeDef = Pattern.compile("(<employes )xmi:id=\"L([0-9]+)\"( matricule=\")([0-9]+)(\")");
	static Pattern pEtablissementDef = Pattern.compile("(<etablissements nom=\")([^\\\"]+)(\")");
	static Pattern pEmploiDef = Pattern.compile("(<emplois intitule=\")([^\\\"]+)(\")");
	
	static List<Pattern> patterns = Arrays.asList(pEmploiDef, pEtablissementDef);
	
	static Pattern pHref = Pattern.compile("(\\w+)=\"([^\\\"]+)\"");

	private Map<String, String> map = new HashMap<>();

	public void clean(Reader in, PrintStream out, List<Pattern> patterns) {
		List<String> lines = new ArrayList<>();
		try (Scanner s = new Scanner(in)) {
			while (s.hasNextLine()) {
				String line = s.nextLine();
				for(Pattern pattern : patterns) {
				Matcher m = pattern.matcher(line);
				StringBuffer sb = new StringBuffer();
				while (m.find()) {
					String id = m.group(2);
					String newId = /*"ID_" +*/ id.replaceAll("\\s", "_");
					id = id.replaceAll("&#x[a-z0-9]+;", "�");
					map.put(id, newId);
					m.appendReplacement(sb, "$1" + newId + "$3");
				}
				m.appendTail(sb);
				// out.println(sb.toString());
				line = sb.toString();
				}
				lines.add(line);
			}
		}

		lines.forEach(line -> {
			Matcher m = pHref.matcher(line);
			StringBuffer sb = new StringBuffer();
			while (m.find()) {
				String id = m.group(2);
				String replacement = map.get(id);
				if (null != replacement) {
					m.appendReplacement(sb, "$1=\"" + replacement + "\"");
				}
			}
			m.appendTail(sb);
			out.println(sb.toString());
		});
	}
}
