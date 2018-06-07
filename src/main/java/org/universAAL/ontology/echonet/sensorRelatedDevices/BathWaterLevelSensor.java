package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;

public class BathWaterLevelSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "BathWaterLevelSensor";
	public static final String PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "BathWaterLevelSensorHasWaterLevelOverDectectionThresholdLevel";
	public static final String PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS = EchonetOntology.NAMESPACE + "BathWaterLevelSensorHasLevelOverDetectionStatus";
	public static final String PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE = EchonetOntology.NAMESPACE + "BathWaterLevelSensorHasMeasuredWaterLevelValue";
	public BathWaterLevelSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public BathWaterLevelSensor(String uri) {
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
	
	public MeasuredValue getBathWaterLevelOverDetectionThreshold() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL);	
	}
	public void setBathWaterLevelOverDetectionThreshold(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,msg);	
	}
	public OccurenceStatusValue getBathWaterLevelOverDetection() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS);	
	}
	public void setBathWaterLevelOverDetection(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS,msg);	
	}
	public MeasuredValue getMeasuredBathWaterLevelValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE);	
	}
	public void getMeasuredBathWaterLevelValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE,msg);	
	}
	

}
