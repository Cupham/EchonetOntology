package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MinMaxSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MinMaxSettingValue";
	public static final String PROPERTY_HAS_MIN_VALUE = EchonetOntology.NAMESPACE + "HasMinValue";
	public static final String PROPERTY_HAS_MAX_VALUE = EchonetOntology.NAMESPACE + "HasMaxValue";

	public MinMaxSettingValue() {
		super();
	}
	public MinMaxSettingValue(String uri) {
		super(uri);
	}
	public MinMaxSettingValue(String uri, MeasuredValue minValue,MeasuredValue maxValue) {
		super(uri);
		setMinValue(minValue);
		setMaxValue(maxValue);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
	public MeasuredValue getMinValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIN_VALUE);
	}
	public void setMinValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MIN_VALUE,msg);
	}
	public MeasuredValue getMaxValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MAX_VALUE);
	}
	public void setMaxValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MAX_VALUE,msg);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
