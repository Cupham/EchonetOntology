package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DetectionDirectionValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class PassageSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PassageSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "PassageSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_DETECTION_HOLD_TIME = EchonetOntology.NAMESPACE + "PassageSensorHasDectectionHoldTime";
	public static final String PROPERTY_HAS_DETECTION_DIRECTION = EchonetOntology.NAMESPACE + "PassageSensorHasDectectionDirection";
	public PassageSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public PassageSensor(String uri) {
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
	public MeasuredValue getDectectionHoldTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DETECTION_HOLD_TIME);	
	}
	public void setDectectionHoldTime(MeasuredValue msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_DETECTION_HOLD_TIME,msg);	
	}
	public DetectionDirectionValue getDectectionDirection() {
		return (DetectionDirectionValue) getProperty(PROPERTY_HAS_DETECTION_DIRECTION);	
	}
	public void setDectectionDirection(DetectionDirectionValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_DIRECTION,msg);	
	}
	

}
