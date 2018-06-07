package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;


public class AirSpeedSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirSpeedSensor";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED = EchonetOntology.NAMESPACE + "AirSpeedSensorHasMeasuredValueOfAirSpeed";
	public static final String PROPERTY_HAS_AIR_FLOW_DIRECTION = EchonetOntology.NAMESPACE + "AirSpeedSensorHasAirFlowDirection";
	public AirSpeedSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public AirSpeedSensor(String uri) {
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
	
	public MeasuredValue setAirSpeedValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED);	
	}
	public void getAirSpeedValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED,msg);	
	}
	public MeasuredValue setAirFlowDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AIR_FLOW_DIRECTION);	
	}
	public void getAirFlowDirection(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_AIR_FLOW_DIRECTION,msg);	
	}
	

}
