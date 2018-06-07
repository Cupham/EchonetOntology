package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class CrimePreventionSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CrimePreventionSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "CrimePreventionSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_INVASION_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "CrimePreventionSensorHasInvasionOccurenceStatus";
	public static final String PROPERTY_RESETTING_INVASION_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "ResettingCrimePreventionSensorInvasionOccurenceStatus";
	public CrimePreventionSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public CrimePreventionSensor(String uri) {
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
	public OccurenceStatusValue getInvasionOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_INVASION_OCCURENCE_STATUS);	
	}
	public void setInvasionOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_INVASION_OCCURENCE_STATUS,msg);	
	}

}
