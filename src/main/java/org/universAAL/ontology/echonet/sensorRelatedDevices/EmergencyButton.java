package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;

public class EmergencyButton extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EmergencyButton";
	public static final String PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS = EchonetOntology.NAMESPACE + "EmergencyButtonHasEmergencyOccurenceStatus";
	public static final String PROPERTY_RESETTING_EMERGENCY_OCCURENCE_STATUS= EchonetOntology.NAMESPACE + "ResettingEmergencyButtonEmergencyOccurenceStatus";
	public EmergencyButton() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public EmergencyButton(String uri) {
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
	
	public OccurenceStatusValue getEmergencyOccurenceStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS);	
	}
	public void setEmergencyOccurenceStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS,msg);	
	}
	
}
