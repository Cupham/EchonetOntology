package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class IlluminanceSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "IlluminanceSensor";
	public static final String PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1 = EchonetOntology.NAMESPACE + "IlluminanceSensorHasIlluminanceValue1";
	public static final String PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2 = EchonetOntology.NAMESPACE + "IlluminanceSensorHasIlluminanceValue2";
	
	public IlluminanceSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public IlluminanceSensor(String uri) {
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
	

	public MeasuredValue getMeasuredIlluminanceValueInLux() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1);	
	}
	public void setMeasuredIlluminanceValueInLux(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1,msg);	
	}
	
	public MeasuredValue getMeasuredIlluminanceValueInKLux() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2);	
	}
	public void setMeasuredIlluminanceValueInKLux(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2,msg);	
	}
	

}
