package fr.mutualite.rh.webapp.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmiCleaner {

	public static void main(String[] args) throws IOException {
		File in = new File("/E:/temp/2016/10/18/backup.xml");
		File out = new File("/E:/temp/2016/10/18/backup-clean.xml");
		try (Reader r = new FileReader(in); OutputStream o = new FileOutputStream(out); PrintStream ps = new PrintStream(o);) {
			new XmiCleaner().clean(r, ps);
			System.out.println("Done");
		}

	}

	Pattern pEmployeDef = Pattern.compile("<employes xmi:id=\"L([0-9]+)\" matricule=\"([0-9]+)\"");
	Pattern pHref = Pattern.compile("href=\"L([0-9]+)\"");

	private Map<String, String> map = new HashMap<>();

	public void clean(Reader in, PrintStream out) {
		List<String> lines = new ArrayList<>();
		try (Scanner s = new Scanner(in)) {
			while (s.hasNextLine()) {
				String line = s.nextLine();
				Matcher m = pEmployeDef.matcher(line);
				StringBuffer sb = new StringBuffer();
				while (m.find()) {
					String id = m.group(1);
					String mat = m.group(2);
					map.put(id, mat);
					m.appendReplacement(sb, "<employes matricule=\"" + mat + "\"");
				}
				m.appendTail(sb);
				// out.println(sb.toString());
				lines.add(sb.toString());
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
