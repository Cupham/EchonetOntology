package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MeasuredValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "MeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_CATEGORY = EchonetOntology.NAMESPACE + "hasMeasurementCategory";
public static final String PROPERTY_HAS_MESUREMENT_VALUE_TYPE = EchonetOntology.NAMESPACE + "hasMeasurementValueType";
public static final String PROPERTY_HAS_MESUREMENT_VALUE = EchonetOntology.NAMESPACE + "hasMeasurementValue";
public static final String PROPERTY_HAS_MESUREMENT_UNIT = EchonetOntology.NAMESPACE + "hasMeasurementUnit";


	
	public MeasuredValue(String uri) {
		super(uri);
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
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
	public String getMeasuredUnit() {
		Object pp = getProperty(PROPERTY_HAS_MESUREMENT_UNIT);
		if(pp!= null) {
			return pp.toString();
		} else {
			return null;
		}
	}
	public void setMeasuredUnit(String unit) {
		changeProperty(PROPERTY_HAS_MESUREMENT_UNIT, unit);	
	}

}
 