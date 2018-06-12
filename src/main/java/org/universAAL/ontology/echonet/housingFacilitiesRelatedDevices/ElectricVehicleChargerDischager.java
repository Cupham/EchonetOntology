package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.ChargerDischargerTypeValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;

public class ElectricVehicleChargerDischager extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricVehicleChargerDischager";
	public static final String PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1 = EchonetOntology.NAMESPACE + "HasDischargableCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2 = EchonetOntology.NAMESPACE + "HasDischargableCapacityOfVehicleMountedBattery2";
	public static final String PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1 = EchonetOntology.NAMESPACE + "HasRemainingDischargableCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2 = EchonetOntology.NAMESPACE + "HasRemainingDischargableCapacityOfVehicleMountedBattery2";
	public static final String PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_3 = EchonetOntology.NAMESPACE + "HasRemainingDischargableCapacityOfVehicleMountedBattery3";
	public static final String PROPERTY_HAS_RATED_CHARGE_CAPACITY = EchonetOntology.NAMESPACE + "HasRatedChargeCapacity";
	public static final String PROPERTY_HAS_RATED_DISCHARGE_CAPACITY = EchonetOntology.NAMESPACE + "HasRatedDisChargeCapacity";
	public static final String PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_DISCHARGEABLE_STATUS = EchonetOntology.NAMESPACE + "HasVehicleConnectionChargeableDischargeableStatus";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMinimumMaximumDisChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_CURRENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumDischargingCurrent";
	public static final String PROPERTY_HAS_CHARGER_DISCHARGER_TYPE = EchonetOntology.NAMESPACE + "HasChargerDischargerType";
	public static final String PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION = EchonetOntology.NAMESPACE + "SetVehicleConnectionConfirmation";
	public static final String PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1 = EchonetOntology.NAMESPACE + "HasUsedCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2 = EchonetOntology.NAMESPACE + "HasUsedCapacityOfVehicleMountedBattery2";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "HasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_CURRENT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricCurrent";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_VOLTAGE = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingDischargingElectricVoltage";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeDischargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_DISCHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeDischargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "HasSystemInterconnectType";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_2 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric2";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1 = EchonetOntology.NAMESPACE + "HasChargingAmountSetting1";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2 = EchonetOntology.NAMESPACE + "HasChargingAmountSetting2";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "HasChargingElectricEnergySetting";
	public static final String PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "HasDischargingElectricEnergySetting";
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
	public MeasuredValue getDischargingElectricEnergySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setDischargingElectricEnergySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	public MeasuredValue getChargingElectricEnergySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setChargingElectricEnergySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	public MeasuredValue getChargingAmountSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2);	
	}
	public void setChargingAmountSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_2, msg);	
	}
	public MeasuredValue getChargingAmountSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1);	
	}
	public void setChargingAmountSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING_1, msg);	
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
	public MeasuredValue getMeasuredInstantaneousChargingDischargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantaneousChargingDischargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getRatedVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE);	
	}
	public void setRatedVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE, msg);	
	}
	public MeasuredValue getUsedCapacityOfVehicleMountedBattery2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2);	
	}
	public void setUsedCapacityOfVehicleMountedBattery2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2, msg);	
	}
	public MeasuredValue getUsedCapacityOfVehicleMountedBattery1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1);	
	}
	public void setUsedCapacityOfVehicleMountedBattery1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_USED_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1, msg);	
	}
	public ChargerDischargerTypeValue getChargerDischargerType() {
		return (ChargerDischargerTypeValue) getProperty(PROPERTY_HAS_CHARGER_DISCHARGER_TYPE);	
	}
	public void setChargerDischargerType(ChargerDischargerTypeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGER_DISCHARGER_TYPE, msg);	
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
	public String getMinimumMaximumDischargingElectricEnergy() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY);	
	}
	public void setMinimumMaximumDischargingElectricEnergy(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_DISCHARGING_ELECTRIC_ENERGY, msg);	
	}
	public String getMinimumMaximumChargingElectricEnergy() {
		return (String) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMinimumMaximumChargingElectricEnergy(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public OperationStateSettingValue getVehicleConnectionChargeableDischargeableStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_DISCHARGEABLE_STATUS);	
	}
	public void setVehicleConnectionChargeableDischargeableStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_DISCHARGEABLE_STATUS, msg);	
	}
	public MeasuredValue getRatedDisChargeCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_DISCHARGE_CAPACITY);	
	}
	public void setRatedDisChargeCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_DISCHARGE_CAPACITY, msg);	
	}
	public MeasuredValue getRatedChargeCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY);	
	}
	public void setRatedChargeCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY, msg);	
	}
	public MeasuredValue getRemainingDischargableCapacityOfVehicleMountedBattery3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_3);	
	}
	public void setRemainingDischargableCapacityOfVehicleMountedBattery3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_3, msg);	
	}
	public MeasuredValue getRemainingDischargableCapacityOfVehicleMountedBattery2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2);	
	}
	public void setRemainingDischargableCapacityOfVehicleMountedBattery2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2, msg);	
	}
	public MeasuredValue getRemainingDischargableCapacityOfVehicleMountedBattery1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1);	
	}
	public void setRemainingDischargableCapacityOfVehicleMountedBattery1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1, msg);	
	}
	public MeasuredValue getDischargableCapacityOfVehicleMountedBattery2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2);	
	}
	public void setDischargableCapacityOfVehicleMountedBattery2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_2, msg);	
	}
	public MeasuredValue getDischargableCapacityOfVehicleMountedBattery1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1);	
	}
	public void setDischargableCapacityOfVehicleMountedBattery1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISCHARGEABLE_CAPACITY_OF_VEHICLE_MOUNTED_BATTERY_1, msg);	
	}

	public ElectricVehicleChargerDischager() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ElectricVehicleChargerDischager(String uri) {
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
