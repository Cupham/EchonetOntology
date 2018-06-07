package org.universAAL.ontology.echonet.sensorRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class MicromotionSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MicromotionSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "MicromotionSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_MICROMOTION_DETECTION_STATUS = EchonetOntology.NAMESPACE + "MicromotionSensorHasDetectionStatus";
	public static final String PROPERTY_HAS_DETECTION_COUNTER = EchonetOntology.NAMESPACE + "MicromotionSensorHasDetectionCounter";
	public static final String PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT = EchonetOntology.NAMESPACE + "MicromotionSensorHasSamplingCount";
	public static final String PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE = EchonetOntology.NAMESPACE + "MicromotionSensorHasSamplingCycle";
	public MicromotionSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public MicromotionSensor(String uri) {
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
	public OccurenceStatusValue getDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_MICROMOTION_DETECTION_STATUS);	
	}
	public void setDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MICROMOTION_DETECTION_STATUS,msg);	
	}
	public Short getDetectionCounter() {
		return (Short) getProperty(PROPERTY_HAS_DETECTION_COUNTER);	
	}
	public void setDetectionCounter(Short msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_COUNTER,msg);	
	}
	public Short getSamplingCount() {
		return (Short) getProperty(PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT);	
	}
	public void setSamplingCount(Short msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT,msg);	
	}
	public MeasuredValue getSamplingCycle() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE);	
	}
	public void setSamplingCycle(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE,msg);	
	}
	
	

}
