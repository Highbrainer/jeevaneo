package fr.mutualite.rh.conges;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeCongesParser {
	
	static DateFormat df = new SimpleDateFormat("yyyy-MM-dd 00:00:00");

	public static void main(String[] args) throws ParseException {
		System.out.println(df.format(new Date()));
		System.out.println(df.parse("2016-04-13 00:00:00"));
		
		System.out.println(Arrays.stream(TypeConge.values()).map(TypeConge::getValue).map(Object::toString).sorted().collect(Collectors.joining(", ")));
		
	}
	
	private Map<Integer, Float> loadExceptions(File in) throws IOException {
		if(null==in || !in.exists()) {
			return new HashMap<>();
		}
		Map<Integer, Float> ret = Files.lines(in.toPath()).skip(1).map(line -> line.split("[;,]")).collect(Collectors.toMap(a->Integer.parseInt(a[0]), a->Float.parseFloat(a[1])));
		return ret;
	}
	
	public List<Employe> parse(File in) throws IOException {
		Map<Integer, Float> exceptions = loadExceptions(new File(in.getParentFile(), "exceptions.csv"));
		List<Employe> ret = new ArrayList<>();
		Files.lines(in.toPath(), StandardCharsets.ISO_8859_1).skip(1).map(line -> line.split(",")).map(v -> {
			for(int i=0;i<v.length;++i) {
				v[i] = v[i]/*.substring(1, v[i].length()-1)*/.trim();
			}
			return v;
		}).filter(v -> !v[0].isEmpty()).forEach(vals -> {
			System.out.println(Arrays.toString(vals));
			int matricule = Integer.parseInt(vals[1]);
			float etablissement = exceptions.containsKey(matricule)?exceptions.get(matricule):Float.parseFloat(vals[0]);
			Employe e = ret.stream().filter(emp -> {
				return emp.getMatricule()==matricule;
			}).findFirst().orElseGet(() -> {
				Employe mp = CongesFactory.eINSTANCE.createEmploye();
				mp.setEtablissement(etablissement);
				mp.setMatricule(matricule);
				mp.setNom(vals[2] + " " + vals[3]);
				ret.add(mp);
				return mp;
			});
				Date debut = date(vals[4]);
				Date fin = date(vals[5]);
				TypeConge typeConges = typeConges(vals[6]);
				int decompte = decompte(vals);
				Conge periode = CongesFactory.eINSTANCE.createConge();
				periode.setDebut(debut);
				periode.setFin(fin);
				periode.setType(typeConges);
				periode.setDecompte(decompte);
				e.getConges().add(periode);
		});
		return ret;
		
	}

	

	private int decompte(String[] vals) {
		if(vals.length<8) {
			throw new IllegalAccessError("Il manque la 8ème colonne (décompte) dans la ligne suivante : " + Arrays.toString(vals)); 
		}
		try {
			return Integer.parseInt(vals[7]);
		} catch (NumberFormatException e) {
			throw new IllegalAccessError("Le decompte doit être un nombre entier! '" + vals + "'");
		}
	}

	private TypeConge typeConges(String s) {
		try {
			return TypeConge.get(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Le type de congés ('" + s + "') devrait être un nombre entier parmi " + Arrays.stream(TypeConge.values()).map(TypeConge::getValue).sorted().map(Object::toString).collect(Collectors.joining(", "))); 
		}
	}

	private Date date(String string) {
		if(null==string || string.trim().isEmpty()) {
			return null;
		}
		try {
			return df.parse(string);
		} catch (ParseException e) {
			throw new RuntimeException("Format de date invalide : '" + string + "'");
		}
	}

}
