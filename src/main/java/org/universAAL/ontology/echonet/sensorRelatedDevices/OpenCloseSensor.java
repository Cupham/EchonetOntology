package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class OpenCloseSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OpenCloseSensor";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1 = EchonetOntology.NAMESPACE + "OpenCloseSensorHasDegreeOfOpenningDetectionStatus1";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "OpenCloseSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2 = EchonetOntology.NAMESPACE + "OpenCloseSensorHasDegreeOfOpenningDetectionStatus2";
	public OpenCloseSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public OpenCloseSensor(String uri) {
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
	public ThresholdLevelValue getDegreeOfOpenningDetectionStatus1() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1);	
	}
	public void setDegreeOfOpenningDetectionStatus1(ThresholdLevelValue msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1,msg);	
	}
	public ThresholdLevelValue getDegreeOfOpenningDetectionStatus2() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2);	
	}
	public void setDegreeOfOpenningDetectionStatus2(ThresholdLevelValue msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2,msg);	
	}
	
	

}
