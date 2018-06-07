package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;





import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class Buzzer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Buzzer";	
	public static final String PROPERTY_HAS_SOUND_GENERATION_SETTING = EchonetOntology.NAMESPACE + "HasSoundGenerationSetting";
	public static final String PROPERTY_HAS_BUZZER_SOUND_TYPE = EchonetOntology.NAMESPACE + "HasBuzzerSoundType";
	
	public ThresholdLevelValue getBuzzerSoundType() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BUZZER_SOUND_TYPE);	
	}
	public void setBuzzerSoundType(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BUZZER_SOUND_TYPE, msg);	
	}
	public OperationStatusValue getSoundGenerationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SOUND_GENERATION_SETTING);	
	}
	public void setSoundGenerationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SOUND_GENERATION_SETTING, msg);	
	}
	

	
	public Buzzer() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public Buzzer(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
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
