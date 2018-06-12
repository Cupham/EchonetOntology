package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class StorageBattery extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "StorageBattery";
	public static final String PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING = EchonetOntology.NAMESPACE + "HasACEffectiveCapacityCharging";
	public static final String PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING = EchonetOntology.NAMESPACE + "HasACEffectiveCapacityDischarging";
	public static final String PROPERTY_HAS_AC_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "HasACChargableCapacity";
	public static final String PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "HasACDischargableCapacity";
	public static final String PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasACChargableElectricEnergy";
	public static final String PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasACDischargableElectricEnergy";
	public static final String PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING = EchonetOntology.NAMESPACE + "HasACChargeUpperLimitSetting";
	public static final String PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING = EchonetOntology.NAMESPACE + "HasACDischargeLowerLimitSetting";
	public static final String PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasACMeasuredCummulativeChargingElectricEnergy";
	public static final String PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasACMeasuredCummulativeDischargingElectricEnergy";
	public static final String PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasACChargeAmountSettingValue";
	public static final String PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasACDishargeAmountSettingValue";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingElectricPower";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "HasMinimumMaximumDischargingElectricPower";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumDischargingCurrent";
	public static final String PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "HasReInterconnectionPermissionSetting";
	public static final String PROPERTY_HAS_OPERATION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "HasOperationPermissionSetting";
	public static final String PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING = EchonetOntology.NAMESPACE + "HasIndependentOperationPermissionSetting";
	public static final String PROPERTY_HAS_WORKING_OPERATION_STATUS = EchonetOntology.NAMESPACE + "HasWorkingOperationStatus";
	public static final String PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasACRatedElectricEnergy";
	public static final String PROPERTY_HAS_RATED_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasRatedElectricEnergy";
	public static final String PROPERTY_HAS_RATED_CAPACITY = EchonetOntology.NAMESPACE + "HasRatedCapacity";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "HasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricPower";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricCurrent";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricVoltage";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeDischargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeDischargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "HasSystemInterconnectType";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingElectricPowerIndependent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingElectricCurrentIndependent";
	public static final String PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "HasChargingDischargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "HasChargingDischargingAmountSetting2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_BATTERY_STATE_OF_HEALTH = EchonetOntology.NAMESPACE + "HasBatteryStateOfHealth";
	public static final String PROPERTY_HAS_BATTERY_TYPE = EchonetOntology.NAMESPACE + "HasBatteryType";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "HasChargingAmountSetting1";
	public static final String PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "HasDischargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "HasChargingAmountSetting2";
	public static final String PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "HasDischargingAmountSetting2";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING = EchonetOntology.NAMESPACE + "HasChargingElectricPowerSetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING = EchonetOntology.NAMESPACE + "HasDischargingElectricPowerSetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "HasChargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "HasDischargingElectricCurrentSetting";
	public static final String PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT = EchonetOntology.NAMESPACE + "HasRatedVoltageIndependent";

	public MeasuredValue getRatedVoltageIndependent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT);	
	}
	public void setRatedVoltageIndependent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE_INDEPENDENT, msg);	
	}
	public MeasuredValue getDischargingElectricCurrentSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setDischargingElectricCurrentSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	public MeasuredValue getChargingElectricCurrentSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setChargingElectricCurrentSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	public MeasuredValue getDischargingElectricPowerSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING);	
	}
	public void setDischargingElectricPowerSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_POWER_SETTING, msg);	
	}
	public MeasuredValue getChargingElectricPowerSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING);	
	}
	public void setChargingElectricPowerSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_POWER_SETTING, msg);	
	}
	public MeasuredValue getDischargingAmountSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2);	
	}
	public void setDischargingAmountSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_2, msg);	
	}
	public MeasuredValue getChargingAmountSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingAmountSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2, msg);	
	}
	public MeasuredValue getDischargingAmountSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1);	
	}
	public void setDischargingAmountSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_AMOUNT_SETTING_1, msg);	
	}
	public MeasuredValue getChargingAmountSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingAmountSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1, msg);	
	}
	public MeasuredValue getBatteryType() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATTERY_TYPE);	
	}
	public void setBatteryType(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATTERY_TYPE, msg);	
	}
	public MeasuredValue getBatteryStateOfHealth() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BATTERY_STATE_OF_HEALTH);	
	}
	public void setBatteryStateOfHealth(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATTERY_STATE_OF_HEALTH, msg);	
	}
	public MeasuredValue getRemainingStoredElectric3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3);	
	}
	public void setRemainingStoredElectric3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3, msg);	
	}
	public MeasuredValue getRemainingStoredElectric2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2);	
	}
	public void setRemainingStoredElectric2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2, msg);	
	}
	public MeasuredValue getRemainingStoredElectric1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1);	
	}
	public void setRemainingStoredElectric1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1, msg);	
	}
	public MeasuredValue getChargingDischargingAmountSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingDischargingAmountSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_2, msg);	
	}
	public MeasuredValue getChargingDischargingAmountSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingDischargingAmountSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_DISCHARGING_AMOUNT_SETTING_1, msg);	
	}
	public String getMinimumMaximumChargingElectricCurrentIndependent() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT);	
	}
	public void setMinimumMaximumChargingElectricCurrentIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_CURRENT_INDEPENDENT, msg);	
	}
	public String getMinimumMaximumChargingElectricPowerIndependent() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT);	
	}
	public void setMinimumMaximumChargingElectricPowerIndependent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER_INDEPENDENT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredCummulativeChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCummulativeChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredCummulativeDischargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCummulativeDischargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	
	public MeasuredValue getMeasuredInstantaneousChargingDischargingElectricVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE, msg);	
	}	
	
	public MeasuredValue getMeasuredInstantaneousChargingDischargingElectricCurrent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricCurrent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT, msg);	
	}
	
	public MeasuredValue getMeasuredInstantaneousChargingDischargingElectricPower() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricPower(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_POWER, msg);	
	}
	public MeasuredValue getRatedVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_CAPACITY);	
	}
	public void setRatedVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CAPACITY, msg);	
	}
	public MeasuredValue getRatedCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_CAPACITY);	
	}
	public void setRatedCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CAPACITY, msg);	
	}
	public MeasuredValue getRatedElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_ELECTRIC_ENERGY);	
	}
	public void setRatedElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getACRatedElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY);	
	}
	public void setACRatedElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_RATED_ELECTRIC_ENERGY, msg);	
	}
	public OperationModeSettingValue getWorkingOperationStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_WORKING_OPERATION_STATUS);	
	}
	public void setWorkingOperationStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WORKING_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getIndependentOperationPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING);	
	}
	public void setIndependentOperationPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INDEPENDENT_OPERATION_PERMISSION_SETTING, msg);	
	}
	public OperationStatusValue getOperationPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPERATION_PERMISSION_SETTING);	
	}
	public void setOperationPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_PERMISSION_SETTING, msg);	
	}
	public OperationStatusValue getReInterconnectionPermissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING);	
	}
	public void setReInterconnectionPermissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RE_INTERCONNECTION_PERMISSION_SETTING, msg);	
	}
	public String getMinimumMaximumDischargingCurrent() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT);	
	}
	public void setMinimumMaximumDischargingCurrent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT, msg);	
	}
	public String getMinimumMaximumChargingCurrent() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT);	
	}
	public void setMinimumMaximumChargingCurrent(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT, msg);	
	}
	public String getMinimumMaximumDischargingElectricPower() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER);	
	}
	public void setMinimumMaximumDischargingElectricPower(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_POWER, msg);	
	}
	public String getMinimumMaximumChargingElectricPower() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER);	
	}
	public void setMinimumMaximumChargingElectricPower(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_POWER, msg);	
	}
	public MeasuredValue getACDishargeAmountSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE);	
	}
	public void setACDishargeAmountSettingValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGE_AMOUNT_SETTING_VALUE, msg);	
	}
	public MeasuredValue getACChargeAmountSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE);	
	}
	public void setACChargeAmountSettingValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGE_AMOUNT_SETTING_VALUE, msg);	
	}
	public MeasuredValue getACMeasuredCummulativeDischargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setACMeasuredCummulativeDischargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getACMeasuredCummulativeChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setACMeasuredCummulativeChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_MEASURE_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getACDischargeLowerLimitSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING);	
	}
	public void setACDischargeLowerLimitSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGE_LOWER_LIMIT_SETTING, msg);	
	}
	public MeasuredValue getACChargeUpperLimitSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING);	
	}
	public void setACChargeUpperLimitSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGE_UPPER_LIMIT_SETTING, msg);	
	}
	public MeasuredValue getACDischargableElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY);	
	}
	public void setACDischargableElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGEABLE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getACChargableElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY);	
	}
	public void setACChargableElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGEABLE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getACDischargableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY);	
	}
	public void setACDischargableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_DISCHARGEABLE_CAPACITY, msg);	
	}
	public MeasuredValue getACChargableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_CHARGEABLE_CAPACITY);	
	}
	public void setACChargableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_CHARGEABLE_CAPACITY, msg);	
	}
	public MeasuredValue getACEffectiveCapacityDisharging() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING);	
	}
	public void setACEffectiveCapacityDisharging(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_DISCHARGING, msg);	
	}
	public MeasuredValue getACEffectiveCapacityCharging() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING);	
	}
	public void setACEffectiveCapacityCharging(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AC_EFFECTIVE_CAPACITY_CHARGING, msg);	
	}
	
	public StorageBattery() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public StorageBattery(String uri) {
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
