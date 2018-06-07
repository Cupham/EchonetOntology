package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class LightingSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LightingSettingValue";
	public static final String PROPERTY_HAS_ILLUMINANCE_VALUE = EchonetOntology.NAMESPACE + "HasIlluminanceValue";
	public static final String PROPERTY_HAS_LIGHT_COLOR = EchonetOntology.NAMESPACE + "HasLightColor";

	public LightingSettingValue() {
		super();
	}
	public LightingSettingValue(String uri) {
		super(uri);
	}
	public LightingSettingValue(String uri, MeasuredValue illuminanceValue,ColorValue color ) {
		super(uri);
		setIlluminanceValue(illuminanceValue);
		setLightColor(color);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MeasuredValue getIlluminanceValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_VALUE);
	}
	public void setIlluminanceValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_ILLUMINANCE_VALUE,msg);
	}
	public ColorValue getLightColor() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR);
	}
	public void setLightColor(ColorValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_LIGHT_COLOR,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
