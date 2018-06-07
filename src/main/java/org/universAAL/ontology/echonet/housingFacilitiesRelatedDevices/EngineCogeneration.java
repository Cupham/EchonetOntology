package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFuntionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class EngineCogeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EngineCogeneration";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER= EchonetOntology.NAMESPACE + "HasWaterTemperatureInWaterHeater";
	public static final String PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "HasRatedPowerGenerationOutput";
	public static final String PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK = EchonetOntology.NAMESPACE + "HasHeatingValueOfHotWaterTank";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousPowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativePowerGenerationOutput";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "ResettingMeasuredCumulativePowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeGasConsumption";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "ResettingMeasuredCumulativeGasConsumption";
	public static final String PROPERTY_HAS_POWER_GENERATION_SETTING = EchonetOntology.NAMESPACE + "HasPowerGenerationSetting";
	public static final String PROPERTY_HAS_POWER_GENERATION_STATUS = EchonetOntology.NAMESPACE + "HasPowerGenerationStatus";
	public static final String PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "HasInHouseMeasuredInstantaneousPowerConsumption";
	public static final String PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "HasInHouseMeasuredCumulativePowerConsumption";
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
	public OperationFuntionSettingValue getSystemInterconnectType() {
		return (OperationFuntionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFuntionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public MeasuredValue getInHouseMeasuredCumulativePowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION);	
	}
	public void setInHouseMeasuredCumulativePowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getInHouseMeasuredInstantaneousPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION);	
	}
	public void setInHouseMeasuredInstantaneousPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, msg);	
	}
	public OperationStateSettingValue getPowerGenerationStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationStatus(OperationStateSettingValue msg) {
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
	public MeasuredValue getMeasuredCumulativeGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCumulativeGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION);	
	}
	public void setMeasuredInstantaneousGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativePowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredCumulativePowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredInstantaneousPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getHeatingValueOfHotWaterTank() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK);	
	}
	public void setHeatingValueOfHotWaterTank(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK, msg);	
	}
	public MeasuredValue getRatedPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT);	
	}
	public void setRatedPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getWaterTemperatureInWaterHeater() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER);	
	}
	public void setWaterTemperatureInWaterHeater(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER, msg);	
	}

	
	public EngineCogeneration() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public EngineCogeneration(String uri) {
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
