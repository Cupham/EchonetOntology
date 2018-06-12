package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.AlarmStatusValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SurplusElectricEnergyPowerPredictionValue;
public class WaterHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterHeater";
	public static final String PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING = EchonetOntology.NAMESPACE + "HasAutomaticWaterHeatingSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "HasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_WATER_HEATER_STATUS = EchonetOntology.NAMESPACE + "HasWaterHeaterStatus";
	public static final String PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "HasWaterHeatingTemperatureSetting";
	public static final String PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING = EchonetOntology.NAMESPACE + "HasManualWaterHeatingStopDaySetting";
	public static final String PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING = EchonetOntology.NAMESPACE + "HasRelativeTimeForManualWaterHeatingOffSetting";
	public static final String PROPERTY_HAS_TANK_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasTankOperationModeSetting";
	public static final String PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "HasDaytimeReheatingPermissionSetting";
	public static final String PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER = EchonetOntology.NAMESPACE + "HasMeasuredWaterTemperatureOfWaterHeater";
	public static final String PROPERTY_HAS_ALARM_STATUS = EchonetOntology.NAMESPACE + "HasAlarmStatus";
	public static final String PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS = EchonetOntology.NAMESPACE + "HasHotWaterSupplyStatus";
	public static final String PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE = EchonetOntology.NAMESPACE + "HasRelativeTimeSettingForKeepingBathTemperature";
	public static final String PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING = EchonetOntology.NAMESPACE + "HasTemperatureOfSuppliedWaterSetting";
	public static final String PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "HasBathWaterTemperatureSetting";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting";
	public static final String PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK = EchonetOntology.NAMESPACE + "HasMeasuredAmountOfRemainingWaterInTank";
	public static final String PROPERTY_HAS_TANK_CAPACITY = EchonetOntology.NAMESPACE + "HasTankCapacity";
	public static final String PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING = EchonetOntology.NAMESPACE + "HasAutomaticBathWaterHeatingModeSetting";
	public static final String PROPERTY_HAS_BATHROOM_PRIORITY_SETTING = EchonetOntology.NAMESPACE + "HasBathroomPrioritySetting";
	public static final String PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR = EchonetOntology.NAMESPACE + "HasBathOperationStatusMonitor";
	public static final String PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasManualBathReheatingOperationSetting";
	public static final String PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "HasManualBathHotWaterAdditionFunctionSetting";
	public static final String PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING = EchonetOntology.NAMESPACE + "HasManualLukewarmWaterTemperatureLoweringFunctionSetting";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting1";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting2";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting3";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4 = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting4";
	public static final String PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL = EchonetOntology.NAMESPACE + "HasBathWaterVolumeSetting4MaximumSettableLevel";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerSetting";
	public static final String PROPERTY_HAS_VOLUME_SETTING = EchonetOntology.NAMESPACE + "HasVolumeSetting";
	public static final String PROPERTY_HAS_MUTE_SETTING = EchonetOntology.NAMESPACE + "HasMuteSetting";
	public static final String PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME = EchonetOntology.NAMESPACE + "HasRemainingHotWaterVolume";
	public static final String PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE = EchonetOntology.NAMESPACE + "HasSurplusElectricEnergyPowerPredictionValue";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER = EchonetOntology.NAMESPACE + "HasRatedPowerConsumptionOfHPUnitInWinter";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON = EchonetOntology.NAMESPACE + "HasRatedPowerConsumptionOfHPUnitInBetweenSeason";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER = EchonetOntology.NAMESPACE + "HasRatedPowerConsumptionOfHPUnitInSummer";
	public static final String PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT = EchonetOntology.NAMESPACE + "HasParticipationInEnergyShift";
	public static final String PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING= EchonetOntology.NAMESPACE + "HasStandardTimeToStartHeating";
	public static final String PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS = EchonetOntology.NAMESPACE + "HasNumberOfEnergyShifts";
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "HasDatetimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1 = EchonetOntology.NAMESPACE + "HasExpectedEnergyOfDatetimeHeatingShiftTime1";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1 = EchonetOntology.NAMESPACE + "HasEnergyConsumptionPerHour1";
	public static final String PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "HasDatetimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2 = EchonetOntology.NAMESPACE + "HasExpectedEnergyOfDatetimeHeatingShiftTime2";
	public static final String PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2 = EchonetOntology.NAMESPACE + "HasEnergyConsumptionPerHour2";
	
	
	public String getEnergyConsumptionPerHour2() {
		return (String) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2);	
	}
	public void setEnergyConsumptionPerHour2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2, msg);	
	}
	public String getExpectedEnergyOfDatetimeHeatingShiftTime2() {
		return (String) getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2);	
	}
	public void setExpectedEnergyOfDatetimeHeatingShiftTime2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public void setDatetimeHeatingShiftTime2(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2, msg);	
	}
	public Date getDatetimeHeatingShiftTime2() {
		return (Date) getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2);	
	}
	public String getEnergyConsumptionPerHour1() {
		return (String) getProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1);	
	}
	public void setEnergyConsumptionPerHour1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1, msg);	
	}
	public String getExpectedEnergyOfDatetimeHeatingShiftTime1() {
		return (String) getProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1);	
	}
	public void setExpectedEnergyOfDatetimeHeatingShiftTime1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public Date getDatetimeHeatingShiftTime1() {
		return (Date) getProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1);	
	}
	public void setDatetimeHeatingShiftTime1(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1, msg);	
	}
	public MeasuredValue getNumberOfEnergyShifts() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS);	
	}
	public void setNumberOfEnergyShifts(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS, msg);	
	}
	public Date getStandardTimeToStartHeating() {
		return (Date) getProperty(PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING);	
	}
	public void setStandardTimeToStartHeating(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING, msg);	
	}
	public OperationStatusValue getParticipationInEnergyShift() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT);	
	}
	public void setParticipationInEnergyShift(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT, msg);	
	}
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInSummer() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInSummer(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER, msg);	
	}
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInBetweenSeason() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON);	
	}
	public void setRatedPowerConsumptionOfHPUnitInBetweenSeason(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON, msg);	
	}
	public MeasuredValue getRatedPowerConsumptionOfHPUnitInWinter() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER);	
	}
	public void setRatedPowerConsumptionOfHPUnitInWinter(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER, msg);	
	}
	public SurplusElectricEnergyPowerPredictionValue getSurplusElectricEnergyPowerPredictionValue() {
		return (SurplusElectricEnergyPowerPredictionValue) getProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE);	
	}
	public void setSurplusElectricEnergyPowerPredictionValue(SurplusElectricEnergyPowerPredictionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE, msg);	
	}
	public MeasuredValue getRemainingHotWaterVolume() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME);	
	}
	public void setRemainingHotWaterVolume(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME, msg);	
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
	public MeasuredValue getBathWaterVolumeSetting4MaximumSettableLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL);	
	}
	public void setBathWaterVolumeSetting4MaximumSettableLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL, msg);	
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
	public OperationStatusValue getManualLukewarmWaterTemperatureLoweringFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING);	
	}
	public void setManualLukewarmWaterTemperatureLoweringFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getManualBathHotWaterAdditionFunctionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING);	
	}
	public void setManualBathHotWaterAdditionFunctionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING, msg);	
	}
	public OperationStatusValue getManualBathReheatingOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING);	
	}
	public void setManualBathReheatingOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_BATH_REHEATING_OPERATION_SETTING, msg);	
	}
	public OperationStateSettingValue getBathOperationStatusMonitor() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR);	
	}
	public void setBathOperationStatusMonitor(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR, msg);	
	}
	
	public OperationStatusValue getBathroomPrioritySetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING);	
	}
	public void setBathroomPrioritySetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRIORITY_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticBathWaterHeatingModeSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING);	
	}
	public void setAutomaticBathWaterHeatingModeSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING, msg);	
	}
	public MeasuredValue getTankCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public MeasuredValue getMeasuredAmountOfRemainingWaterInTank() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK);	
	}
	public void getMeasuredAmountOfRemainingWaterInTank(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK, msg);	
	}
	public MeasuredValue getBathWaterVolumeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING);	
	}
	public void setBathWaterVolumeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_VOLUME_SETTING, msg);	
	}
	public MeasuredValue getBathWaterTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING);	
	}
	public void setBathWaterTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATH_WATER_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getTemperatureOfSuppliedWaterSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING);	
	}
	public void setTemperatureOfSuppliedWaterSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING, msg);	
	}
	public Date getRelativeTimeSettingForKeepingBathTemperature() {
		return (Date) getProperty(PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE);	
	}
	public void setRelativeTimeSettingForKeepingBathTemperature(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE, msg);	
	}
	public OperationStatusValue getHotWaterSupplyStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS);	
	}
	public void setHotWaterSupplyStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS, msg);	
	}
	public AlarmStatusValue getAlarmStatus() {
		return (AlarmStatusValue) getProperty(PROPERTY_HAS_ALARM_STATUS);	
	}
	public void setAlarmStatus(AlarmStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ALARM_STATUS, msg);	
	}
	public MeasuredValue getMeasuredWaterTemperatureOfWaterHeater() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER);	
	}
	public void setMeasuredWaterTemperatureOfWaterHeater(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER, msg);	
	}
	public OperationStatusValue getDaytimeReheatingPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING);	
	}
	public void setDaytimeReheatingPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING, msg);	
	}
	public OperationModeSettingValue getTankOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_TANK_OPERATION_MODE_SETTING);	
	}
	public void setTankOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_OPERATION_MODE_SETTING, msg);	
	}
	public Date getRelativeTimeForManualWaterHeatingOffSetting() {
		return (Date) getProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING);	
	}
	public void setRelativeTimeForManualWaterHeatingOffSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING, msg);	
	}
	public MeasuredValue getManualWaterHeatingStopDaySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING);	
	}
	public void setManualWaterHeatingStopDaySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING, msg);	
	}
	public MeasuredValue getWaterHeatingTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING);	
	}
	public void setWaterHeatingTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue PROPERTY_HAS_WATER_HEAT_STATUS() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WATER_HEATER_STATUS);	
	}
	public void setWaterHeaterStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_HEATER_STATUS, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticWaterHeatingSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING);	
	}
	public void setAutomaticWaterHeatingSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING, msg);	
	}
	
	
	public WaterHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public WaterHeater(String uri) {
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
