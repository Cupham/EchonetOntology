package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class SoundSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SoundSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "SoundSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_SOUND_DETECTION_STATUS = EchonetOntology.NAMESPACE + "SoundSensorHasSoundDectionStatus";
	public static final String PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME = EchonetOntology.NAMESPACE + "SoundSensorHasSoundDectionHoldingTime";
	public SoundSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public SoundSensor(String uri) {
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
	public OccurenceStatusValue getSoundDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SOUND_DETECTION_STATUS);	
	}
	public void setSoundDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SOUND_DETECTION_STATUS,msg);	
	}
	public MeasuredValue getSoundDectionHoldingTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME);	
	}
	public void setSoundDectionHoldingTime(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME,msg);	
	}
	

}
