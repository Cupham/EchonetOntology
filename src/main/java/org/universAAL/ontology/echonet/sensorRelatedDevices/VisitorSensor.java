package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class VisitorSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "VisitorSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "VisitorSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_VISITOR_DETECTION_STATUS = EchonetOntology.NAMESPACE + "VisitorSensorHasVisitorDetectionStatus";
	public static final String PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME = EchonetOntology.NAMESPACE + "VisitorSensorHasVisitorDetectionHoldingTime";
	public VisitorSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public VisitorSensor(String uri) {
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
	public OccurenceStatusValue getVisitorDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_VISITOR_DETECTION_STATUS);	
	}
	public void setVisitorDetectionStatus(OccurenceStatusValue msg) {
		
		if(msg !=null)
			changeProperty(PROPERTY_HAS_VISITOR_DETECTION_STATUS,msg);	
	}
	public Short getVisitorDetectionHoldingTime() {
		return (Short) getProperty(PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME);	
	}
	public void setVisitorDetectionHoldingTime(Short msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME,msg);	
	}
	

}
