package fr.mutualite.rh.model.util;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClassifier;

public interface JsonGenerator {

	String generateJson(CDOObject o);
	String generateJson(List<? extends CDOObject> l);

	String simpleValue(Object value, EClassifier type);

}