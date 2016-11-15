package fr.mutualite.rh.model.util;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClassifier;

public interface JsonGenerator {

	String generateJson(CDOObject o);

	String simpleValue(Object value, EClassifier type);

}