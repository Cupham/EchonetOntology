package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TemperatureSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterTemperatureSettingValue";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_TEMPERATURE_VALUE = EchonetOntology.NAMESPACE + "HasTemperatureValue";
	public static final String PROPERTY_HAS_TEMPERATURE_LEVEL = EchonetOntology.NAMESPACE + "HasTemperatureLevel";
	public TemperatureSettingValue() {
		super();
	}
	public TemperatureSettingValue(String uri) {
		super(uri);
	}
	public TemperatureSettingValue(String uri, OperationModeSettingValue operationMode,MeasuredValue temperature ) {
		super(uri);
		setOperationModeSetting(operationMode);
		setTemperatureValue(temperature);
	}
	public TemperatureSettingValue(String uri, OperationModeSettingValue operationMode,ThresholdLevelValue temperatureLevel ) {
		super(uri);
		setOperationModeSetting(operationMode);
		setTemperatureLevel(temperatureLevel);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public ThresholdLevelValue getTemperatureLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TEMPERATURE_LEVEL);
	}
	public void setTemperatureLevel(ThresholdLevelValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TEMPERATURE_LEVEL,msg);
	}
	public MeasuredValue getTemperaturevalue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_VALUE);
	}
	public void setTemperatureValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TEMPERATURE_VALUE,msg);
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
