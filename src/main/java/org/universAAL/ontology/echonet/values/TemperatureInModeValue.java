package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TemperatureInModeValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TemperatureInModeValue";
	public static final String PROPERTY_HAS_OPERATION_MODE = EchonetOntology.NAMESPACE + "HasOperationMode";
	public static final String PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING = EchonetOntology.NAMESPACE + "HasTemperatureLevelSetting";
	public TemperatureInModeValue(String uri) {
		super(uri);	
	}
	public TemperatureInModeValue() {
		super();	
	}
	public TemperatureInModeValue(String uri,OperationModeSettingValue operationMode, ThresholdLevelValue temperatureLevel) {
		super(uri);	
		setTemperatureLevelSetting(temperatureLevel);
		setOperationMode(operationMode);
	}
	public void setTemperatureLevelSetting(ThresholdLevelValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING, msg);
	} 
	public ThresholdLevelValue getTemperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TEMPERATURE_LEVEL_SETTING);
	}
	public void setOperationMode(OperationModeSettingValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_OPERATION_MODE, msg);
	} 
	public OperationModeSettingValue getOperationMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE);
	}
	public String getClassURI() {
		return MY_URI;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
}
