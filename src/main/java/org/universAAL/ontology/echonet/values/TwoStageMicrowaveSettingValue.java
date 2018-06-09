package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TwoStageMicrowaveSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TwoStageMicrowaveSettingValue";
	public static final String PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasFirstStageSettingValue";
	public static final String PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasSecondStageSettingValue";

	public TwoStageMicrowaveSettingValue() {
		super();
	}
	public TwoStageMicrowaveSettingValue(String uri) {
		super(uri);
	}
	public TwoStageMicrowaveSettingValue(String uri, MeasuredValue firstStageValue,MeasuredValue secondStageValue ) {
		super(uri);
		setFirstStageSettingValue(firstStageValue);
		setSecondStageSettingValue(secondStageValue);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MeasuredValue getFirstStageSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE);
	}
	public void setFirstStageSettingValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_FIRST_STAGE_SETTING_VALUE,msg);
	}
	public MeasuredValue getSecondStageSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE);
	}
	public void setSecondStageSettingValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_SECOND_STAGE_SETTING_VALUE,msg);
	}

	public String getClassURI() {
		return MY_URI;
	}

}
