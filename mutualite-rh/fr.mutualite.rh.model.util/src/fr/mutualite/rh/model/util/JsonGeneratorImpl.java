package fr.mutualite.rh.model.util;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.MutFactory;

public class JsonGeneratorImpl implements JsonGenerator {

	public JsonGeneratorImpl() {
	}

	public JsonGeneratorImpl(DateFormat df) {
		this.df = df;
	}

	private DateFormat df = DateFormat.getDateInstance();

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.mutualite.rh.model.util.JsonGenerator#generateJson(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String generateJson(CDOObject o) {
		Stream<String> attrs = o.eClass().getEAllAttributes().stream().map(a -> {
			Object value = o.eGet(a);
			if (null == value) {
				return null;
			}
			StringBuilder ret = new StringBuilder();
			ret.append('\"');
			ret.append(a.getName());
			ret.append("\":");
			if (a.isMany()) {
				List<?> values = (List<?>) value;
				ret.append('[');
				ret.append(values.stream().map(v -> simpleValue(v, a.getEType())).collect(Collectors.joining(", ")));
				ret.append(']');
			} else {
				ret.append(simpleValue(value, a.getEType()));
			}

			return ret.toString();
		}).filter(s -> s != null);

		Stream<String> conts = o.eClass().getEAllContainments().stream().map(ref -> {
			Object value = o.eGet(ref);
			StringBuilder ret = new StringBuilder();
			ret.append('\"');
			ret.append(ref.getName());
			ret.append("\":");
			if (null == value) {
				ret.append("" + null);
			} else {
				if (ref.isMany()) {
					List<CDOObject> values = (List<CDOObject>) value;
					ret.append('[');
					ret.append(values.stream().map(v -> generateJson(v)).collect(Collectors.joining(", ")));
					ret.append(']');
				} else {
					ret.append(generateJson((CDOObject) value));
				}

			}
			return ret.toString();
		});

		List<String> ids = new LinkedList<>();
		if (o.cdoID() != null) {
			ids.add("\"cdoId\":" + o.cdoID().toURIFragment());
		}
		Stream<String> id = ids.stream();

		return "{" + Stream.concat(id, Stream.concat(attrs, conts)).collect(Collectors.joining(", ")) + "}";
		// return ret.toString();
	}

	@Override
	public String simpleValue(Object value, EClassifier type) {
		StringBuilder ret = new StringBuilder();
		if (isQuoted(type))
			ret.append('\"');
		Class<?> instanceClass = type.getInstanceClass();
		if (value instanceof Date) {
			ret.append(df.format(value));
		} else {
			if (null == value) {
				ret.append("");
			} else {
				ret.append(value.toString().replaceAll("\r?\n", "\\\\n").replaceAll("\"", "\\\\\""));
			}
		}
		if (isQuoted(type))
			ret.append('\"');
		return ret.toString();
	}

	private static final List<String> QUOTED_TYPES = Arrays.asList("EString", "EChar", "ECharObject", "EDate");

	private boolean isQuoted(EClassifier type) {
		if (type instanceof EEnum) {
			return true;
		}
		String name = type.getName();
		return QUOTED_TYPES.contains(name);
	}

	public static void main(String[] args) {
		JsonGenerator moi = new JsonGeneratorImpl();
		Employe e = MutFactory.eINSTANCE.createEmploye();
		e.setDateEmbauche(null);
		e.setDateNaissance(new Date());
		e.setMatricule(123);
		e.setNom("Borgoltz");
		e.getDiplomes().addAll(Arrays.asList("mon premier diplôme", "mon second dip", "mon dernier diplôme"));
		Emploi emploi = MutFactory.eINSTANCE.createEmploi();
		emploi.setIntitule("mon premier emploi");
		Affectation aff = MutFactory.eINSTANCE.createAffectation();
		aff.setDateDebut(new Date());
		aff.setEmploi(emploi);
		e.setAffectationEmploiCourante(aff);
		e.getAffectationsEmploi().add(aff);
		System.out.println(moi.generateJson(e));
	}

	@Override
	public String generateJson(List<? extends CDOObject> l) {
		return l.stream().map(this::generateJson).collect(Collectors.joining(", ", "[", "]"));
	}

}
