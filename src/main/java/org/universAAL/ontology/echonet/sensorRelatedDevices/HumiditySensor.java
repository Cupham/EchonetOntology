package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;


public class HumiditySensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HumiditySensor";
	public static final String PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE = EchonetOntology.NAMESPACE + "HumiditySensorHasMeasuredRelatedHumidityValue";
	public HumiditySensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public HumiditySensor(String uri) {
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
	
	public MeasuredValue getMeasuredRelatedHimidityValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE);	
	}
	public void setMeasuredRelatedHimidityValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE,msg);	
	}

}
