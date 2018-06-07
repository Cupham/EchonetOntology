package org.universAAL.ontology.echonet.audiovisualRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.InputSourceSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class Audio extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Audio";
	public static final String PROPERTY_HAS_VOLUME_SETTING= EchonetOntology.NAMESPACE + "HasVolumeSetting";
	public static final String PROPERTY_HAS_MUTE_SETTING= EchonetOntology.NAMESPACE + "HasMuteSetting";
	public static final String PROPERTY_HAS_INPUT_SOURCE_SETTING= EchonetOntology.NAMESPACE + "HasInputSourceSetting";
	
	public InputSourceSettingValue getInputSourceSetting() {
		return (InputSourceSettingValue) getProperty(PROPERTY_HAS_INPUT_SOURCE_SETTING);	
	}
	public void setInputSourceSetting(InputSourceSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INPUT_SOURCE_SETTING, msg);	
	}
	public OperationStatusValue getMuteSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MUTE_SETTING);	
	}
	public void setMuteSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MUTE_SETTING, msg);	
	}
	public MeasuredValue getVolumeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VOLUME_SETTING);	
	}
	public void setVolumeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VOLUME_SETTING, msg);	
	}

	
	
	public Audio() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice);
	}
	public Audio(String uri) {
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
