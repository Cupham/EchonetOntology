package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class GasLeakSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GasLeakSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "GasLeakSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "GasLeakSensorHasGasLeakOccurenceStatus";
	public static final String PROPERTY_RESETTING_GAS_LEAK_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "ResettingGasLeakSensorGasLeakOccurenceStatus";
	public GasLeakSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public GasLeakSensor(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
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
	
	public ThresholdLevelValue getDetectionThresholdLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL);	
	}
	public void setDetectionThresholdLevel(ThresholdLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,msg);	
	}
	public OccurenceStatusValue getGasLeakOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS);	
	}
	public void setGasLeakOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS,msg);	
	}
	

}
