package org.universAAL.ontology.echonet.audiovisualRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.CharacterCodes;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SupportedCharacterCodesValue;

public class Television extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Television";
	public static final String PROPERTY_HAS_DISPLAY_CONTROL_SETTING= EchonetOntology.NAMESPACE + "HasDisplayControlSetting";
	public static final String PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS= EchonetOntology.NAMESPACE + "HasCharacterSettingAcceptanceStatus";
	public static final String PROPERTY_HAS_SUPPORTED_CHARACTER_CODES= EchonetOntology.NAMESPACE + "HasSupportedCharacterCodes";
	public static final String PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER= EchonetOntology.NAMESPACE + "HasCharacterStringToPresentToUser";
	public static final String PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH= EchonetOntology.NAMESPACE + "HasAcceptedCharacterStringLength";
	
	public MeasuredValue getAcceptedCharacterStringLength() {
		return (MeasuredValue) getProperty(PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH);	
	}
	public void setAcceptedCharacterStringLength(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_ACCEPTED_CHARACTER_STRING_LENGTH, msg);	
	}
	public CharacterCodes getCharacterStringToPresentToUser() {
		return (CharacterCodes) getProperty(PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER);	
	}
	public void setCharacterStringToPresentToUser(CharacterCodes msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_STRING_TO_PRESENT_TO_USER, msg);	
	}
	public SupportedCharacterCodesValue getSupportedCharacterCodes() {
		return (SupportedCharacterCodesValue) getProperty(PROPERTY_HAS_SUPPORTED_CHARACTER_CODES);	
	}
	public void setSupportedCharacterCodes(SupportedCharacterCodesValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SUPPORTED_CHARACTER_CODES, msg);	
	}
	public OperationStateSettingValue getCharacterSettingAcceptanceStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS);	
	}
	public void setCharacterSettingAcceptanceStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_STRING_SETTING_ACCEPTANCE_STATUS, msg);	
	}
	public OperationStatusValue getDisplayControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DISPLAY_CONTROL_SETTING);	
	}
	public void setDisplayControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISPLAY_CONTROL_SETTING, msg);	
	}

	
	
	public Television() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice);
	}
	public Television(String uri) {
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
