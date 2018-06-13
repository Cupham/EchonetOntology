package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;





import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class ExtendedLightingSystem extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ExtendedLightingSystem";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "HasIlluminanceLevel";
	public static final String PROPERTY_HAS_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "HasSceneControlSetting";
	public static final String PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "HasNumberForAssigningSceneControlSetting";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST = EchonetOntology.NAMESPACE + "HasPowerConsumptionRateList";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED = EchonetOntology.NAMESPACE + "HasPowerConsumptionWhenFullyLighted";
	public static final String PROPERTY_HAS_POSISSLBE_POWER_SAVING = EchonetOntology.NAMESPACE + "HasPossiblePowerSaving";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING = EchonetOntology.NAMESPACE + "HasPowerConsumptionLimitSetting";
	
	public MeasuredValue getPowerConsumptionLimitSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING);	
	}
	public void setPowerConsumptionLimitSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_LIMIT_SETTING, msg);	
	}
	public MeasuredValue getPossiblePowerSaving() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POSISSLBE_POWER_SAVING);	
	}
	public void setPossiblePowerSaving(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POSISSLBE_POWER_SAVING, msg);	
	}
	public MeasuredValue getPowerConsumptionWhenFullyLighted() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED);	
	}
	public void setPowerConsumptionWhenFullyLighted(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_WHEN_FULLY_LIGHTED, msg);	
	}
	public MeasuredValue getPowerConsumptionRateList() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST);	
	}
	public void setPowerConsumptionRateList(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_RATE_LIST, msg);	
	}
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
	
	
	public ExtendedLightingSystem() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ExtendedLightingSystem(String uri) {
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
