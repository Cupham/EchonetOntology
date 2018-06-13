package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MinMaxSettingValue;
import org.universAAL.ontology.echonet.values.ChargerDischargerTypeValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;

public class VehicleCharger extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "VehicleCharger";
	public static final String PROPERTY_HAS_RATED_CHARGE_CAPACITY = EchonetOntology.NAMESPACE + "HasRatedChargeCapacity";
	public static final String PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS = EchonetOntology.NAMESPACE + "HasVehicleConnectionChargeableStatus";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingElectricEnergy";
	public static final String PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT = EchonetOntology.NAMESPACE + "HasMinimumMaximumChargingCurrent";
	public static final String PROPERTY_HAS_CHARGER_TYPE = EchonetOntology.NAMESPACE + "HasChargerType";
	public static final String PROPERTY_SET_VEHICLE_CONNECTION_CONFIRMATION = EchonetOntology.NAMESPACE + "SetVehicleConnectionConfirmation";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY = EchonetOntology.NAMESPACE + "HasVehicleMountedBatteryChargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY = EchonetOntology.NAMESPACE + "HasVehicleMountedBatteryRemainingChargeableCapacity";
	public static final String PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1 = EchonetOntology.NAMESPACE + "HasUsedCapacityOfVehicleMountedBattery1";
	public static final String PROPERTY_HAS_RATED_VOLTAGE = EchonetOntology.NAMESPACE + "HasRatedVoltage";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousChargingElectricEnergy";	
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeChargingElectricEnergy";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "ResettingMeasuredCumulativeChargingDischargingElectricEnergy";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric1";
	public static final String PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3 = EchonetOntology.NAMESPACE + "HasRemainingStoredElectric3";
	public static final String PROPERTY_HAS_VEHICLE_ID = EchonetOntology.NAMESPACE + "HasVehicleID";
	public static final String PROPERTY_HAS_CHARGING_AMOUNT_SETTING = EchonetOntology.NAMESPACE + "HasChargingAmountSetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING = EchonetOntology.NAMESPACE + "HasChargingElectricEnergySetting";
	public static final String PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING = EchonetOntology.NAMESPACE + "HasChargingElectricCurrentSetting";


	public MeasuredValue getChargingAmountSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING);	
	}
	public void setChargingAmountSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_AMOUNT_SETTING, msg);	
	}
	public String getVehicleID() {
		return (String) getProperty(PROPERTY_HAS_VEHICLE_ID);	
	}
	public void setVehicleID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_ID, msg);	
	}
	public MeasuredValue getVehicleMountedBatteryRemainingChargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY);	
	}
	public void setVehicleMountedBatteryRemainingChargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_REMAINING_CAPACITY, msg);	
	}
	public MeasuredValue getVehicleMountedBatteryChargeableCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY);	
	}
	public void setVehicleMountedBatteryChargeableCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_CHARGEABLE_CAPACITY, msg);	
	}
	public MeasuredValue getChargingElectricCurrentSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING);	
	}
	public void setChargingElectricCurrentSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_CURRENT_SETTING, msg);	
	}
	
	public MeasuredValue getChargingElectricEnergySetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING);	
	}
	public void setChargingElectricEnergySetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGING_ELECTRIC_ENERGY_SETTING, msg);	
	}
	
	public MeasuredValue getRemainingStoredElectric3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3);	
	}
	public void setRemainingStoredElectric3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_3, msg);	
	}
	
	public MeasuredValue getRemainingStoredElectric1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1);	
	}
	public void setRemainingStoredElectric1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_STORED_ELECTRIC_1, msg);	
	}
	
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredCumulativeChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredCumulativeChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	
	public MeasuredValue getMeasuredInstantaneousChargingElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantaneousChargingElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getRatedVoltage() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_VOLTAGE);	
	}
	public void setRatedVoltage(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_VOLTAGE, msg);	
	}
	
	public MeasuredValue getUsedCapacityOfVehicleMountedBattery1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1);	
	}
	public void setUsedCapacityOfVehicleMountedBattery1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_MOUNTED_BATTERY_USED_CAPACITY_1, msg);	
	}
	public ChargerDischargerTypeValue getChargerType() {
		return (ChargerDischargerTypeValue) getProperty(PROPERTY_HAS_CHARGER_TYPE);	
	}
	public void setChargerType(ChargerDischargerTypeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHARGER_TYPE, msg);	
	}
	
	public MinMaxSettingValue getMinimumMaximumChargingCurrent() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT);	
	}
	public void setMinimumMaximumChargingCurrent(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_CURRENT, msg);	
	}
	public MinMaxSettingValue getMinimumMaximumChargingElectricEnergy() {
		return (MinMaxSettingValue) getProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY);	
	}
	public void setMinimumMaximumChargingElectricEnergy(MinMaxSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINIMUM_MAXIMUM_CHARGING_ELECTRIC_ENERGY, msg);	
	}
	public OperationStateSettingValue getVehicleConnectionChargeableStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS);	
	}
	public void setVehicleConnectionChargeableStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VEHICLE_CONNECTION_CHARGEABLE_STATUS, msg);	
	}
	public MeasuredValue getRatedChargeCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY);	
	}
	public void setRatedChargeCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_CHARGE_CAPACITY, msg);	
	}

	public VehicleCharger() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public VehicleCharger(String uri) {
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