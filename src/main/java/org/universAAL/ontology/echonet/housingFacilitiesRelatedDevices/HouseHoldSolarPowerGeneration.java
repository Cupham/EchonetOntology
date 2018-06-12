package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;

public class HouseHoldSolarPowerGeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HouseHoldSolarPowerGeneration";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "HasSystemInterconnectType";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeElectricEnergyGeneratedAmount";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousElectricEnergyGeneratedAmount";
	public static final String PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeElectricEnergyGeneratedAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeElectricEnergySoldAmount";
	public static final String PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT = EchonetOntology.NAMESPACE + "ResettingMeasuredCummulativeElectricEnergySoldAmount";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1 = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputLimitSetting1";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2 = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputLimitSetting2";
	public static final String PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING = EchonetOntology.NAMESPACE + "HasAmountOfElectricitySoldLimitSetting";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputSystemInterconnected";
	public static final String PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputSystemIndependent";

	public MeasuredValue getPowerGenerationOutputSystemIndependent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT);	
	}
	public void setPowerGenerationOutputSystemIndependent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT, msg);	
	}
	public MeasuredValue getPowerGenerationOutputSystemInterconnected() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED);	
	}
	public void setPowerGenerationOutputSystemInterconnected(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED, msg);	
	}
	public MeasuredValue getAmountOfElectricitySoldLimitSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING);	
	}
	public void setAmountOfElectricitySoldLimitSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING, msg);	
	}
	public MeasuredValue getPowerGenerationOutputLimitSetting2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2);	
	}
	public void setPowerGenerationOutputLimitSetting2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2, msg);	
	}
	public MeasuredValue getPowerGenerationOutputLimitSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1);	
	}
	public void setPowerGenerationOutputLimitSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergySoldAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergySoldAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousElectricEnergyGeneratedAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT);	
	}
	public void setMeasuredInstantaneousElectricEnergyGeneratedAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyGeneratedAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergyGeneratedAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	
	public HouseHoldSolarPowerGeneration() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public HouseHoldSolarPowerGeneration(String uri) {
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
