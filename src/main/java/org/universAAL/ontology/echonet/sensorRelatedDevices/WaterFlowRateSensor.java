package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class WaterFlowRateSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterFlowRateSensor";
	public static final String PROPERTY_HAS_CUMULATIVE_FLOW_RATE = EchonetOntology.NAMESPACE + "WaterFlowRateSensorHasCumulativeFlowRate";
	public static final String PROPERTY_HAS_FLOW_RATE = EchonetOntology.NAMESPACE + "WaterFlowRateSensorHasFlowRate";
	public WaterFlowRateSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public WaterFlowRateSensor(String uri) {
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
	
	public MeasuredValue getCumulativeFlowRate() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_FLOW_RATE);	
	}
	public void setCumulativeFlowRate(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CUMULATIVE_FLOW_RATE,msg);	
	}
	public MeasuredValue getFlowRate() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FLOW_RATE);	
	}
	public void setFlowRate(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_FLOW_RATE,msg);	
	}
	

}
