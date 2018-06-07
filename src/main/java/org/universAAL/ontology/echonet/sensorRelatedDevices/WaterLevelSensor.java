package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;

public class WaterLevelSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterLevelSensor";
	public static final String PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "WaterLevelSensorHasWaterLevelOverDectectionThresholdLevel";
	public static final String PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS = EchonetOntology.NAMESPACE + "WaterLevelSensorHasLevelOverDetectionStatus";
	public static final String PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE = EchonetOntology.NAMESPACE + "WaterLevelSensorHasMeasuredWaterLevelValue";
	public WaterLevelSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public WaterLevelSensor(String uri) {
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
	
	public MeasuredValue getWaterLevelOverDetectionThreshold() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL);	
	}
	public void setWaterLevelOverDetectionThreshold(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,msg);	
	}
	public OccurenceStatusValue getWaterLevelOverDetection() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS);	
	}
	public void setWaterLevelOverDetection(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS,msg);	
	}
	public MeasuredValue getMeasuredWaterLevelValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE);	
	}
	public void getMeasuredWaterLevelValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE,msg);	
	}
	

}
