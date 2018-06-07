package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.ColorValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.LightingSettingValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RGBValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class GeneralLighting extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GeneralLighting";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "HasIlluminanceLevel";
	public static final String PROPERTY_HAS_LIGHTING_COLOR_SETTING = EchonetOntology.NAMESPACE + "HasLightingColorSetting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING = EchonetOntology.NAMESPACE + "HasIlluminanceLevelStepSetting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING = EchonetOntology.NAMESPACE + "HasLightColorStepSetting";
	public static final String PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES = EchonetOntology.NAMESPACE + "HasMaximumSpecifiableValues";
	public static final String PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES = EchonetOntology.NAMESPACE + "HasMaximumSetableLevelForNightLightingValue";
	public static final String PROPERTY_HAS_LIGHTING_MODE_SETTING = EchonetOntology.NAMESPACE + "HasLightingModeSetting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "HasIlluminanceLevelForMainLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "HasIlluminanceLevelStepSettingForMainLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "HasIlluminanceLevelForNightLighting";
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "HasIlluminanceLevelStepSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "HasLightColorSettingForMainLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING = EchonetOntology.NAMESPACE + "HasLightColorLevelStepSettingForMainLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "HasLightColorSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING = EchonetOntology.NAMESPACE + "HasLightColorLevelStepSettingForNightLighting";
	public static final String PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE = EchonetOntology.NAMESPACE + "HasLightingModeStatusInAutoMode";
	public static final String PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING = EchonetOntology.NAMESPACE + "HasRGBSettingForColorLighting";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOffTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING = EchonetOntology.NAMESPACE + "HasOffTimerSetting";

	
	public Date getOffTimerSetting() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING);	
	}
	public void setOffTimerSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING, msg);	
	}	
	public OperationStatusValue getOffTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);	
	}
	public void setOffTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);	
	}
	
	public Date getOnTimerSetting() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING);	
	}
	public void setOnTimerSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING, msg);	
	}	
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	
	public RGBValue getRGBSettingForColorLighting() {
		return (RGBValue) getProperty(PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING);	
	}
	public void setRGBSettingForColorLighting(RGBValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RGB_SETTING_FOR_COLOR_LIGHTING, msg);	
	}
	
	public OperationModeSettingValue getLightingModeStatusInAutoMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE);	
	}
	public void setLightingModeStatusInAutoMode(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_MODE_STATUS_IN_AUTO_MODE, msg);	
	}
	
	public ThresholdLevelValue getLightColorLevelStepSettingForNightLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setLightColorLevelStepSettingForNightLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public ColorValue getLightColorSettingForNightLighting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setLightColorSettingForNightLighting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public ThresholdLevelValue getLightColorLevelStepSettingForMainLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setLightColorLevelStepSettingForMainLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	public ColorValue getLightColorSettingForMainLighting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setLightColorSettingForMainLighting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	
	public ThresholdLevelValue getIlluminanceLevelStepSettingForNightLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING);	
	}
	public void setIlluminanceLevelStepSettingFoNightLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_NIGHT_LIGHTING, msg);	
	}
	public MeasuredValue getIlluminanceLevelForNightLighting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING);	
	}
	public void setIlluminanceLevelForNightLighting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_NIGHT_LIGHTING, msg);	
	}
	public ThresholdLevelValue getIlluminanceLevelStepSettingForMainLighting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING);	
	}
	public void setIlluminanceLevelStepSettingForMainLighting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING_FOR_MAIN_LIGHTING, msg);	
	}
	public MeasuredValue getIlluminanceLevelForMainLighting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING);	
	}
	public void setIlluminanceLevelForMainLighting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_FOR_MAIN_LIGHTING, msg);	
	}
	public OperationModeSettingValue getLightingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_LIGHTING_MODE_SETTING);	
	}
	public void setLightingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_MODE_SETTING, msg);	
	}
	public LightingSettingValue getMaximumSetableLevelForNightLightingValue() {
		return (LightingSettingValue) getProperty(PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES);	
	}
	public void setMaximumSetableLevelForNightLightingValue(LightingSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_SETABLE_LEVEL_FOR_NIGHT_LIGHTING_VALUES, msg);	
	}
	public LightingSettingValue HasMaximumSpecifiableValues() {
		return (LightingSettingValue) getProperty(PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES);	
	}
	public void HasMaximumSpecifiableValues(LightingSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MAXIMUM_SPECIFIABLE_VALUES, msg);	
	}
	public ThresholdLevelValue getLightColorStepSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING);	
	}
	public void setLightColorStepSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHT_COLOR_STEP_SETTING, msg);	
	}
	public ThresholdLevelValue getIlluminanceLevelStepSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING);	
	}
	public void setIlluminanceLevelStepSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL_STEP_SETTING, msg);	
	}
	public ColorValue getLightingColorSetting() {
		return (ColorValue) getProperty(PROPERTY_HAS_LIGHTING_COLOR_SETTING);	
	}
	public void setLightingColorSetting(ColorValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LIGHTING_COLOR_SETTING, msg);	
	}
	public MeasuredValue getIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL);	
	}
	public void setIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL, msg);	
	}
	

	
	public GeneralLighting() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public GeneralLighting(String uri) {
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
