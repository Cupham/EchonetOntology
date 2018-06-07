package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class MailingSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MailingSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "MailingSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_MAILING_DETECTION_STATUS = EchonetOntology.NAMESPACE + "MailingSensorHasMailingDetectionStatus";
	public MailingSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public MailingSensor(String uri) {
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
	public OccurenceStatusValue getMailingDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_MAILING_DETECTION_STATUS);	
	}
	public void setMailingDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MAILING_DETECTION_STATUS,msg);	
	}
	

}
