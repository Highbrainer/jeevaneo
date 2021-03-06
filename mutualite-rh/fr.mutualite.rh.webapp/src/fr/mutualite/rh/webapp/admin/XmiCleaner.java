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

public class XmiCleaner {

	public static void main(String[] args) throws IOException {
		File in = new File("/E:/temp/2017/04/05/backup.xml");
		File out = new File(in.getAbsolutePath().replaceFirst("\\.xml$", "-clean\\.xml"));
		try (Reader r = new FileReader(in); OutputStream o = new FileOutputStream(out); PrintStream ps = new PrintStream(o);) {
			new XmiCleaner().clean(r, ps, patterns);
			System.out.println("Done");
		}

	}

	static Pattern pEmployeDef = Pattern.compile("(<employes )xmi:id=\"L([0-9]+)\"( matricule=\")([0-9]+)(\")");
	static Pattern pEtablissementDef = Pattern.compile("(<etablissements )xmi:id=\"L([0-9]+)\"( nom=\")([^\\\"]+)(\")");
	
	static List<Pattern> patterns = Arrays.asList(pEmployeDef, pEtablissementDef);
	
	static Pattern pHref = Pattern.compile("href=\"L([0-9]+)\"");

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
					String mat = m.group(4);
					map.put(id, mat);
					m.appendReplacement(sb, "$1 $3" + mat + "$5");
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
				String id = m.group(1);
				String mat = map.get(id);
				if (null != mat) {
					m.appendReplacement(sb, "href=\"" + mat + "\"");
				}
			}
			m.appendTail(sb);
			out.println(sb.toString());
		});
	}

}
