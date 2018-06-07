package org.universAAL.ontology.echonet.audiovisualRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.TransferSettingValue;

public class NetworkCamera extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "NetworkCamera";
	public static final String PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS = 
								EchonetOntology.NAMESPACE + "HasStillImagePhotographySettingAcceptanceStatus";
	public static final String PROPERTY_SET_STILL_IMAGE_PHOTOGRAPHY_SETTING =  EchonetOntology.NAMESPACE + "SettingStillImagePhotographySetting";
	public static final String PROPERTY_HAS_TRANSFER_SETTING= EchonetOntology.NAMESPACE + "HasTransferSetting";
	
	public TransferSettingValue getTransferSetting() {
		return (TransferSettingValue) getProperty(PROPERTY_HAS_TRANSFER_SETTING);	
	}
	public void setTransferSetting(TransferSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TRANSFER_SETTING, msg);	
	}
	public OperationStateSettingValue getStillImagePhotographySettingAcceptanceStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS);	
	}
	public void setStillImagePhotographySettingAcceptanceStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STILL_IMAGE_PHOTOGRAPHY_SETTING_ACCEPTANCE_STATUS, msg);	
	}

	
	
	public NetworkCamera() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice);
	}
	public NetworkCamera(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice);
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
