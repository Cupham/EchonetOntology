package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class VentilationFan extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "VentilationFan";
	public static final String PROPERTY_HAS_VENTILATION_AUTO_SETTING = EchonetOntology.NAMESPACE + "VentilationFanHasVentilationAutoSetting";
	public static final String PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE = EchonetOntology.NAMESPACE + "VentilationFanHasValueOfVentilationAirFlowRate";
	
	public ThresholdLevelValue getVentilationAirFlowRate() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE);
	}
	public void setVentilationAirFlowRate(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE, msg);
	}
	public OperationStatusValue getVentilationAutoSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING);
	}
	public void setVentilationAutoSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING, msg);
	}
	public VentilationFan() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public VentilationFan(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	

}
