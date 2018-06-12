package org.universAAL.ontology.echonet.values;

import java.sql.Date;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MeasuredValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "MeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_CATEGORY = EchonetOntology.NAMESPACE + "hasMeasurementCategory";
public static final String PROPERTY_HAS_MESUREMENT_VALUE = EchonetOntology.NAMESPACE + "hasMeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_UNIT = EchonetOntology.NAMESPACE + "hasMeasurementUnit";
public static final String PROPERTY_HAS_MESUREMENT_DATE = EchonetOntology.NAMESPACE + "hasMeasurementDate";


	
	public MeasuredValue(String uri) {
		super(uri);
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}
	public ValueCategory getMeasurementType() {
		return (ValueCategory) getProperty(PROPERTY_HAS_MESUREMENT_CATEGORY);
	}
	public void setMeasurementType(ValueCategory msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_MESUREMENT_CATEGORY, msg);
		}
	}
	public Date getMeasurementDate() {
		return (Date) getProperty(PROPERTY_HAS_MESUREMENT_DATE);
	}
	public void setMeasurementDate(ValueCategory msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_MESUREMENT_DATE, msg);
		}
	}
	public String getMeasuredUnit() {
		return (String) getProperty(PROPERTY_HAS_MESUREMENT_UNIT);
	}
	public void setMeasuredUnit(String unit) {
		if(unit !=null) 
			changeProperty(PROPERTY_HAS_MESUREMENT_UNIT, unit);	
		}

}
 