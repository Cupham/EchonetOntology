package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class GasSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GasSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "GasSensorHasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_GAS_DETECTION_STATUS = EchonetOntology.NAMESPACE + "GasSensorHasGasDetectionStatus";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION = EchonetOntology.NAMESPACE + "GasSensorHasMeasuredValueOfGasConcentration";
	public GasSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public GasSensor(String uri) {
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
	public OccurenceStatusValue getGasDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_GAS_DETECTION_STATUS);	
	}
	public void setGasDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)	
			changeProperty(PROPERTY_HAS_GAS_DETECTION_STATUS,msg);	
	}
	public MeasuredValue getGasConcentrationMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION);	
	}
	public void setGasConcentrationMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION,msg);	
	}
	

}
