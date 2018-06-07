package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;


public class TemperatureSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TemperatureSensor";
	public static final String PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE = EchonetOntology.NAMESPACE + "TemperatureSensorHasMeasuredMeasuredValue";
	public TemperatureSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public TemperatureSensor(String uri) {
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
	
	public MeasuredValue getMeasuredMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE);	
	}
	public void setMeasuredMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE,msg);	
	}

}
