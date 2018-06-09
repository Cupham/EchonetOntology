package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.AutomaticHeatingMenu;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.TwoStageMicrowaveSettingValue;

public class CombinationMicrowaveOven extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CombinationMicrowaveOven";
	public static final String PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasDoorOpenCloseStatus";
	public static final String PROPERTY_HAS_HEATING_STATUS= EchonetOntology.NAMESPACE + "HasHeatingStatus";
	public static final String PROPERTY_HAS_HEATING_SETTING= EchonetOntology.NAMESPACE + "HasHeatingSetting";
	public static final String PROPERTY_HAS_HEATING_MODE_SETTING= EchonetOntology.NAMESPACE + "HasHeatingModeSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_SETTING= EchonetOntology.NAMESPACE + "HasAutomaticHeatingSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING= EchonetOntology.NAMESPACE + "HasAutomaticHeatingLevelSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING= EchonetOntology.NAMESPACE + "HasAutomaticHeatingMenuSetting";
	public static final String PROPERTY_HAS_OVEN_MODE_SETTING= EchonetOntology.NAMESPACE + "HasOvenModeSetting";
	public static final String PROPERTY_HAS_OVEN_PREHEATING__SETTING= EchonetOntology.NAMESPACE + "HasOvenPreheatingSetting";
	public static final String PROPERTY_HAS_FERMENTING_MODE_SETTING= EchonetOntology.NAMESPACE + "HasFermentingModeSetting";
	public static final String PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "HasChamperTemperatureSetting";
	public static final String PROPERTY_HAS_FOOD_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "HasFoodTemperatureSetting";
	public static final String PROPERTY_HAS_HEATING_SETTING_TIME= EchonetOntology.NAMESPACE + "HasHeatingSettingTime";
	public static final String PROPERTY_HAS_REMAINING_HEATING_TIME= EchonetOntology.NAMESPACE + "HasRemainingHeatingTime";
	public static final String PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING= EchonetOntology.NAMESPACE + "HasMicrowaveHeatingPowerSetting";
	public static final String PROPERTY_HAS_PROMPT_MESSAGE_SETTING= EchonetOntology.NAMESPACE + "HasPromptMessageSettingSetting";
	public static final String PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING= EchonetOntology.NAMESPACE + "HasAccessoriestoCombinationMicrowaveOvenSetting";
	public static final String PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING= EchonetOntology.NAMESPACE + "HasDisplayCharacterStringSetting";
	public static final String PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION= EchonetOntology.NAMESPACE + "HasTwoStageMicrowaveHeatingDuration";
	public static final String PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER= EchonetOntology.NAMESPACE + "HasTwoStageMicrowaveHeatingPower";
	
	public OperationModeSettingValue getHeatingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_HEATING_MODE_SETTING);	
	}
	public void setHeatingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_MODE_SETTING, msg);	
	}
	public ThresholdLevelValue getAutomaticHeatingLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING);	
	}
	public void setAutomaticHeatingLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING, msg);	
	}
	public TwoStageMicrowaveSettingValue getTwoStageMicrowaveHeatingPower() {
		return (TwoStageMicrowaveSettingValue) getProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER);	
	}
	public void setTwoStageMicrowaveHeatingPower(TwoStageMicrowaveSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER, msg);	
	}
	public TwoStageMicrowaveSettingValue setTwoStageMicrowaveHeatingDuration() {
		return (TwoStageMicrowaveSettingValue) getProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION);	
	}
	public void setTwoStageMicrowaveHeatingDuration(TwoStageMicrowaveSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION, msg);	
	}
	public String getDisplayCharacterStringSetting() {
		return (String) getProperty(PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING);	
	}
	public void setDisplayCharacterStringSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING, msg);	
	}
	public String getAccessoriestoCombinationMicrowaveOvenSetting() {
		return (String) getProperty(PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING);	
	}
	public void setAccessoriestoCombinationMicrowaveOvenSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING, msg);	
	}
	public String getPromptMessageSettingSetting() {
		return (String) getProperty(PROPERTY_HAS_PROMPT_MESSAGE_SETTING);	
	}
	public void setPromptMessageSettingSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PROMPT_MESSAGE_SETTING, msg);	
	}
	public MeasuredValue getMicrowaveHeatingPowerSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING);	
	}
	public void setMicrowaveHeatingPowerSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING, msg);	
	}
	public Date getRemainingHeatingTime() {
		return (Date) getProperty(PROPERTY_HAS_REMAINING_HEATING_TIME);	
	}
	public void setRemainingHeatingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_HEATING_TIME, msg);	
	}
	public Date getHeatingSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_HEATING_SETTING_TIME);	
	}
	public void setHeatingSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING_TIME, msg);	
	}
	public MeasuredValue getFoodTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FOOD_TEMPERATURE_SETTING);	
	}
	public void setFoodTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FOOD_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getChamperTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING);	
	}
	public void setChamperTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING, msg);	
	}
	public OperationModeSettingValue getFermentingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_FERMENTING_MODE_SETTING);	
	}
	public void setFermentingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FERMENTING_MODE_SETTING, msg);	
	}
	public OperationStatusValue getOvenPreheatingSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OVEN_PREHEATING__SETTING);	
	}
	public void setOvenPreheatingSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OVEN_PREHEATING__SETTING, msg);	
	}
	public OperationModeSettingValue getOvenModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OVEN_MODE_SETTING);	
	}
	public void setOvenModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OVEN_MODE_SETTING, msg);	
	}
	public AutomaticHeatingMenu getAutomaticHeatingMenuSetting() {
		return (AutomaticHeatingMenu) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING);	
	}
	public void setAutomaticHeatingMenuSetting(AutomaticHeatingMenu msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING, msg);	
	}
	public OperationStateSettingValue getAutomaticHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_SETTING);	
	}
	public void setAutomaticHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_SETTING, msg);	
	}
	public OperationStateSettingValue getHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_HEATING_SETTING);	
	}
	public void setHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING, msg);	
	}
	public OperationStatusValue getHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATING_STATUS);	
	}
	public void setHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_STATUS, msg);	
	}
	public OperationStateSettingValue getDoorOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS);	
	}
	public void setDoorOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS, msg);	
	}

	
	
	public CombinationMicrowaveOven() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public CombinationMicrowaveOven(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
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
