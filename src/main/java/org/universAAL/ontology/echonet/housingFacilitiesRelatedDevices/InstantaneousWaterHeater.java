package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class InstantaneousWaterHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "InstantaneousWaterHeater";
	public static final String PROPERTY_HAS_HOT_WATER_HEATING_STATUS = EchonetOntology.NAMESPACE + "HasHotWaterHeatingStatus";
	public static final String PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "HasHotWaterTemperatureSetting";
	public static final String PROPERTY_HAS_HOT_WATER_WARMER_SETTING = EchonetOntology.NAMESPACE + "HasHotWaterWarmerSetting";
	public static final String PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasDurationOfAutomaticOperationSetting";
	public static final String PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME = EchonetOntology.NAMESPACE + "HasRemainingAutomaticOperationTime";
	public static final String PROPERTY_HAS_BATH_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "HasBathTemperatureSetting";
	public static final String PROPERTY_HAS_BATH_WATER_HEATER_STATUS = EchonetOntology.NAMESPACE + "HasBathWaterHeaterStatus";
	public static final String PROPERTY_HAS_BATH_AUTO_MODE_SETTING = EchonetOntology.NAMESPACE + "HasBathAutoModeSetting";
	public static final String PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathAdditionalBoilUpOpeartionSetting";
	public static final String PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathHotWaterAddingOpeartionSetting";
	public static final String PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathWaterLoweringOpeartionSetting";	
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting1";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting2";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting3";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting4";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting4MaximumSettableLevel";
	public static final String PROPERTY_HAS_BATHROOM_PRIORITY_SETTING = EchonetOntology.NAMESPACE + "HasBathroomPrioritySetting";
	public static final String PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "HasShowerHotWaterSupplyStatus";
	public static final String PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "HasKitchenHotWaterSupplyStatus";	
	public static final String PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasWaterWarmerOnTimerReservationSetting";
	public static final String PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasWaterWarmerOnTimerSettingTime";
	public static final String PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR = EchonetOntology.NAMESPACE + "HasBathOperationStatusMonitor";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_VOLUME_SETTING = EchonetOntology.NAMESPACE + "HasVolumeSetting";
	public static final String PROPERTY_HAS_MUTE_SETTING = EchonetOntology.NAMESPACE + "HasMuteSetting";
	
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
	public Date getOnTimerSettingRelativeTime() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOnTimerSettingRelativeTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getOnTimerSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME);	
	}
	public void setOnTimerSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public OperationStateSettingValue getBathOperationStatusMonitor() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR);	
	}
	public void setBathOperationStatusMonitor(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR, msg);	
	}
	
	public OperationStatusValue getWaterWarmerOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setWaterWarmerOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public Date getWaterWarmerOnTimerSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME);	
	}
	public void setWaterWarmerOnTimerSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getKitchenHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setKitchenHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public OperationStatusValue getShowerHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setShowerHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public OperationStatusValue getBathroomPrioritySetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING);	
	}
	public void setBathroomPrioritySetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING, msg);	
	}

	public MeasuredValue getBathWaterVolumeSetting4MaximumSettableLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL);	
	}
	public void setBathWaterVolumeSetting4MaximumSettableLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting4() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4);	
	}
	public void setBathWaterVolumeSetting4(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3);	
	}
	public void setBathWaterVolumeSetting3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2);	
	}
	public void setBathWaterVolumeSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2, msg);	
	}	
	public MeasuredValue getBathWaterVolumeSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1);	
	}
	public void setBathWaterVolumeSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1, msg);	
	}
	
	public OperationStatusValue getBathWaterLoweringOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING);	
	}
	public void setBathWaterLoweringOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathHotWaterAddingOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING);	
	}
	public void setBathHotWaterAddingOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathAdditionalBoilUpOpeartionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING);	
	}
	public void setBathAdditionalBoilUpOpeartionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getBathAutoModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_AUTO_MODE_SETTING);	
	}
	public void setBathAutoModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_AUTO_MODE_SETTING, msg);	
	}
	public OperationStatusValue getBathWaterHeaterStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATH_WATER_HEATER_STATUS);	
	}
	public void setBathWaterHeaterStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_HEATER_STATUS, msg);	
	}
	public MeasuredValue getBathTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_TEMPERATURE_SETTING);	
	}
	public void setBathTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_TEMPERATURE_SETTING, msg);	
	}
	public Date getRemainingAutomaticOperationTime() {
		return (Date) getProperty(PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME);	
	}
	public void setRemainingAutomaticOperationTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME, msg);	
	}
	public Date getDurationOfAutomaticOperationSetting() {
		return (Date) getProperty(PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING);	
	}
	public void setDurationOfAutomaticOperationSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getHotWaterWarmerSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_WARMER_SETTING);	
	}
	public void setHotWaterWarmerSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_WARMER_SETTING, msg);	
	}
	public MeasuredValue getHotWaterTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING);	
	}
	public void setHotWaterTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue getHotWaterHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_HEATING_STATUS);	
	}
	public void setHotWaterHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_HEATING_STATUS, msg);	
	}	
	
	public InstantaneousWaterHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public InstantaneousWaterHeater(String uri) {
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
