package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;


public class PressureSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PressureSensor";
	public static final String PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE = EchonetOntology.NAMESPACE + "PressureSensorHasMeasuredDiffirentialPressureValue";
	public PressureSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public PressureSensor(String uri) {
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
	
	public MeasuredValue getMeasuredDiffirentialPressureValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE);	
	}
	public void setMeasuredDiffirentialPressureValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE,msg);	
	}

}
