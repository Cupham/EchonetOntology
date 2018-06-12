package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class FuelCell extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FuelCell";
	public static final String PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE = EchonetOntology.NAMESPACE + "HasMeasuredWaterTemperatureInWaterHeaterMode";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT= EchonetOntology.NAMESPACE + "HasRatedPowerGenerationOutput";
	public static final String PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK= EchonetOntology.NAMESPACE + "HasHeatingValueOfHotWaterStorageTank";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousPowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativePowerGenerationOutput";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativePowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumption";
	public static final String PROPERTY_RESET_MEASURED_CUMMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeGasConsumption";
	public static final String PROPERTY_HAS_POWER_GENERATION_SETTING = EchonetOntology.NAMESPACE + "HasPowerGenerationSetting";
	public static final String PROPERTY_HAS_POWER_GENERATION_STATE= EchonetOntology.NAMESPACE + "HasPowerGenerationState";
	public static final String PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredInHouseCummulativePowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredInHouseInstantaneousPowerConsumption";
	public static final String PROPERTY_RESET_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION  = EchonetOntology.NAMESPACE + "ResettingMeasuredInHouseCummulativePowerConsumption";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "HasSystemInterconnectType";
	public static final String PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredRemainingHotWaterAmount";
	public static final String PROPERTY_HAS_TANK_CAPACITY = EchonetOntology.NAMESPACE + "HasTankCapacity";
		
	public MeasuredValue getTankCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public MeasuredValue getMeasuredRemainingHotWaterAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT);	
	}
	public void setMeasuredRemainingHotWaterAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public MeasuredValue getMeasuredInHouseInstantaneousPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION);	
	}
	public void setMeasuredInHouseInstantaneousPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_INSTANTANEOUS_POWER_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredInHouseCummulativePowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION);	
	}
	public void setMeasuredInHouseCummulativePowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_IN_HOUSE_CUMMULATIVE_POWER_CONSUMPTION, msg);	
	}
	public OperationStateSettingValue getPowerGenerationState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_SETTING, msg);	
	}
	public OperationStatusValue getPowerGenerationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_SETTING, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCummulativeGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION);	
	}
	public void setMeasuredInstantaneousGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredCummulativePowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredCummulativePowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredInstantaneousPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getHeatingValueOfHotWaterStorageTank() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK);	
	}
	public void setHeatingValueOfHotWaterStorageTank(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK, msg);	
	}
	public MeasuredValue getRatedPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT);	
	}
	public void setRatedPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getMeasuredWaterTemperatureInWaterHeaterMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE);	
	}
	public void setMeasuredWaterTemperatureInWaterHeaterMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_IN_WATER_HEATER_MODE, msg);	
	}
	
	public FuelCell() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public FuelCell(String uri) {
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
