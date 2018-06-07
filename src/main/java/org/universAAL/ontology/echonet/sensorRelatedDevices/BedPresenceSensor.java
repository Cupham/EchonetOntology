package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class BedPresenceSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "BedPresenceSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "BedPresenceSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS = EchonetOntology.NAMESPACE + "BedPresenceSensorHasBedPresentDetectionStatus";
	public BedPresenceSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public BedPresenceSensor(String uri) {
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
	public OccurenceStatusValue getBedPresenceDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS);	
	}
	public void setBedPresenceDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS,msg);	
	}
	

}
