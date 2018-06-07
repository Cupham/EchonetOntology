package org.universAAL.ontology.echonet.managementOperationRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;

public class Switch extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Switch";
	public static final String PROPERTY_HAS_CONNECTED_DEVICE= EchonetOntology.NAMESPACE + "HasConnectedDevice";

	public String getConnectedDevice() {
		return (String) getProperty(PROPERTY_HAS_CONNECTED_DEVICE);	
	}
	public void setConnectedDevice(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONNECTED_DEVICE, msg);	
	}

	
	
	public Switch() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
	}
	public Switch(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
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
	

}
