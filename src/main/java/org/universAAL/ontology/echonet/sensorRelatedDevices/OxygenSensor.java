package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class OxygenSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OxygenSensor";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION = EchonetOntology.NAMESPACE + "OxygenSensorHasMeasuredValueOfOxygenConcentration";
		public OxygenSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public OxygenSensor(String uri) {
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
	

	public MeasuredValue getOxygenConcentrationMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION);	
	}
	public void setOxygenConcentrationMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION,msg);	
	}
	

}
