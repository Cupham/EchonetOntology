package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class FirstAidSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FirstAidSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "FirstAidSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "FirstAidSensorHasFirstAidOccurenceStatus";
	public static final String PROPERTY_RESETTING_FIRST_AID_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "ResettingFirstAidSensorFirstAidOccurenceStatus";
	public FirstAidSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public FirstAidSensor(String uri) {
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
	public OccurenceStatusValue getFirstAidOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS);	
	}
	public void setFirstAidOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS,msg);	
	}

}
