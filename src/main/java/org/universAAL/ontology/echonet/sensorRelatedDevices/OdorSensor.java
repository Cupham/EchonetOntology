package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class OdorSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OdorSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "OdorSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_ODOR_DETECTION_STATUS = EchonetOntology.NAMESPACE + "OdorSensorHasOdorDetectionStatus";
	public static final String PROPERTY_HAS_MEASURED_ODOR_VALUE = EchonetOntology.NAMESPACE + "GasSensorHasMeasuredOdorValue";
	public OdorSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public OdorSensor(String uri) {
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
	public OccurenceStatusValue getOdorDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_ODOR_DETECTION_STATUS);	
	}
	public void setOdorDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_ODOR_DETECTION_STATUS,msg);	
	}
	public Integer getMeasuredOdorValue() {
		return (Integer) getProperty(PROPERTY_HAS_MEASURED_ODOR_VALUE);	
	}
	public void setMeasuredOdorValue(Integer msg) {
		if(msg!= null)
			changeProperty(PROPERTY_HAS_MEASURED_ODOR_VALUE,msg);	
	}
	

}
