package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;

public class CurrentValueSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CurrentValueSensor";
	public static final String PROPERTY_HAS_MEASURED_CURRENT_VALUE_1 = EchonetOntology.NAMESPACE + "CurrentValueSensorHasMeasuredCurrentValue1";
	public static final String PROPERTY_HAS_MEASURED_CURRENT_VALUE_2 = EchonetOntology.NAMESPACE + "CurrentValueSensorHasMeasuredCurrentValue2";
	public static final String PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED = EchonetOntology.NAMESPACE + "CurrentValueSensorHasRatedVoltageToBeMeasured";

	public CurrentValueSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public CurrentValueSensor(String uri) {
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
	
	public MeasuredValue getMeasuredCurrentValue1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CURRENT_VALUE_1);	
	}
	public void setMeasuredCurrentValue1(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_CURRENT_VALUE_1,msg);	
	}
	public MeasuredValue getMeasuredCurrentValue2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CURRENT_VALUE_2);	
	}
	public void setMeasuredCurrentValue2(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_CURRENT_VALUE_2,msg);	
	}
	public MeasuredValue getRatedVoltageToBeMeasured() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED);	
	}
	public void setRatedVoltageToBeMeasured(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED,msg);	
	}
	

}
