package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;

public class CO2Sensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CO2Sensor";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION = EchonetOntology.NAMESPACE + "CO2SensorSensorHasMeasuredValueOfCO2Concentration";
		public CO2Sensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public CO2Sensor(String uri) {
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
	

	public MeasuredValue getCO2ConcentrationMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION);	
	}
	public void setCO2ConcentrationMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,msg);	
	}
	

}
