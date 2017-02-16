package fr.mutualite.rh.conges;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EmployeCongesParserV1 {
	
	static DateFormat df = new SimpleDateFormat("dd/MM/yy");

	public static void main(String[] args) throws ParseException {
		System.out.println(df.format(new Date()));
		System.out.println(df.parse("07/03/17"));
		System.out.println(new SimpleDateFormat("yy/MM/dd").parse("17/07/03"));
		System.out.println(new SimpleDateFormat("dd/MM/yy").parse("03/07/17"));
		
	}
	
	public List<Employe> parse(File in) throws IOException {
		List<Employe> ret = new ArrayList<>();
		Files.lines(in.toPath(), StandardCharsets.ISO_8859_1).skip(2).map(line -> line.split("\t")).map(v -> {
			for(int i=0;i<v.length;++i) {
				v[i] = v[i]/*.substring(1, v[i].length()-1)*/.trim();
			}
			return v;
		}).filter(v -> !v[0].isEmpty()).forEach(vals -> {
			System.out.println(Arrays.toString(vals));
			int matricule = Integer.parseInt(vals[1]);
			float etablissement = Float.parseFloat(vals[0]);
			Employe e = ret.stream().filter(emp -> {
				return emp.getMatricule()==matricule;
			}).findFirst().orElseGet(() -> {
				Employe mp = CongesFactory.eINSTANCE.createEmploye();
				mp.setEtablissement(etablissement);
				mp.setMatricule(matricule);
				mp.setNom(vals[2]);
				ret.add(mp);
				return mp;
			});
			int i=0;
			while(vals.length>4+2*i) {
				Date debut = date(vals[3+2*i]);
				if(null==debut) {
					break;
				}
				Date fin = date(vals[3+2*i+1]);
				Conge periode = CongesFactory.eINSTANCE.createConge();
				periode.setDebut(debut);
				periode.setFin(fin);
				e.getConges().add(periode);
				i++;
			}
		});
		return ret;
		
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
