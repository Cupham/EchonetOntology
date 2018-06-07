package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;





import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class LightingSystem extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LightingSystem";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "HasIlluminanceLevel";
	public static final String PROPERTY_HAS_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "HasSceneControlSetting";
	public static final String PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "HasNumberForAssigningSceneControlSetting";
	
	public MeasuredValue getNumberForAssigningSceneControlSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING);	
	}
	public void setNumberForAssigningSceneControlSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getSceneControlSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING);	
	}
	public void setSceneControlSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL);	
	}
	public void setIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL, msg);	
	}
	
	
	public LightingSystem() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public LightingSystem(String uri) {
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
