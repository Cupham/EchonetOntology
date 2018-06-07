package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class CallSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CallSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "CallSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_CALL_STATUS = EchonetOntology.NAMESPACE + "CallSensorHasCallStatus";
	public static final String PROPERTY_HAS_CALL_HOLDING_TIME = EchonetOntology.NAMESPACE + "CallSensorHasCallHoldingTime";
	public CallSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public CallSensor(String uri) {
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
	public OccurenceStatusValue getCallStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_CALL_STATUS);	
	}
	public void setCallStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CALL_STATUS,msg);	
	}
	public Short getCallHoldingTime() {
		return (Short) getProperty(PROPERTY_HAS_CALL_HOLDING_TIME);	
	}
	public void setCallHoldingTime(Short msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CALL_HOLDING_TIME,msg);	
	}
	

}
