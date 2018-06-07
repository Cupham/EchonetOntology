package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class EarthquakeSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EarthquakeSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "EarthquakeSensorSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "EarthquakeSensorHasEarthquakeOccurenceStatus";
	public static final String PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS_RESETTING = EchonetOntology.NAMESPACE + "ResetEarthquakeSensorHasEarthquakeOccurenceStatus";
	public static final String PROPERTY_HAS_SI_VALUE = EchonetOntology.NAMESPACE + "EarthquakeSensorHasSIValue";
	public static final String PROPERTY_RESETTING_SI_VALUE = EchonetOntology.NAMESPACE + "ResettingEarthquakeSensorSIValue";
	public static final String PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "EarthquakeSensorHasCollapseOccurenceStatus";
	public static final String PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS_RESETTING = EchonetOntology.NAMESPACE + "ResetEarthquakeSensorHasCollapseOccurenceStatus";
	
	public EarthquakeSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public EarthquakeSensor(String uri) {
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
	public OccurenceStatusValue getEarthquakeOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS);	
	}
	public void setEarthquakeOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS,msg);	
	}
	public MeasuredValue getSIValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SI_VALUE);	
	}
	public void setSIValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SI_VALUE,msg);	
	}
	public OccurenceStatusValue getCollapseOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS);	
	}
	public void setCollapseOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS,msg);	
	}
}
