package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class SupportedCharacterCodesValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SupportedCharacterCodesValue";
	public static final String PROPERTY_HAS_CHARACTER_CODE = EchonetOntology.NAMESPACE + "HasCharacterCodes";
	public static final String PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE = EchonetOntology.NAMESPACE + "HasSupportedNotSupportedState";

	public CharacterCodes getCharacterCodes() {
		return (CharacterCodes) getProperty(PROPERTY_HAS_CHARACTER_CODE);	
	}
	public void setCharacterCodes(CharacterCodes msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARACTER_CODE, msg);	
	}	
	public OperationStateSettingValue getSupportedNotSupportedState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE);	
	}
	public void setSupportedNotSupportedState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SUPPORTED_NOT_SUPPORTED_STATE, msg);	
	}
	public SupportedCharacterCodesValue() {
		super();
	}
	public SupportedCharacterCodesValue(String uri) {
		super(uri);
	}
	public SupportedCharacterCodesValue(String uri, CharacterCodes codes,OperationStateSettingValue supportedState ) {
		super(uri);
		setCharacterCodes(codes);
		setSupportedNotSupportedState(supportedState);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
