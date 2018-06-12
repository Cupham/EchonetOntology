package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class HouseHoldSmallWindTurbinePowerGeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "StorageBattery";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS = EchonetOntology.NAMESPACE + "HasSystemInterconnectionStatus";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredInstantaneousGeneratedElectricityAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeGeneratedElectricityAmount";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "ResettingMeasuredCumulativeGeneratedElectricityAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeSoldElectricityAmount";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT = EchonetOntology.NAMESPACE + "ResettingMeasuredCumulativeGeneratedElectricityAmount";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1 = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputLimitSetting1";
	public static final String PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2 = EchonetOntology.NAMESPACE + "HasPowerGenerationOutputLimitSetting2";
	public static final String PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING = EchonetOntology.NAMESPACE + "HasAmoundOfElectricitySoldLimitSetting";
	public static final String PROPERTY_HAS_RATED_POWER = EchonetOntology.NAMESPACE + "HasRatedPower";
	public static final String PROPERTY_HAS_MEASURED_WIND_SPEED = EchonetOntology.NAMESPACE + "HasMeasuredWindSpeed";
	public static final String PROPERTY_HAS_RATED_WIND_SPEED = EchonetOntology.NAMESPACE + "HasRatedWindSpeed";
	public static final String PROPERTY_HAS_CUT_IN_WIND_SPEED = EchonetOntology.NAMESPACE + "HasCutInWindSpeed";
	public static final String PROPERTY_HAS_CUT_OUT_WIND_SPEED = EchonetOntology.NAMESPACE + "HasCutOutWindSpeed";
	public static final String PROPERTY_HAS_EXTREME_WIND_SPEED = EchonetOntology.NAMESPACE + "HasExtremeWindSpeed";
	public static final String PROPERTY_HAS_BARKING_STATUS = EchonetOntology.NAMESPACE + "HasBarkingStatus";
	
	public OperationStatusValue getBarkingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BARKING_STATUS);	
	}
	public void setBarkingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BARKING_STATUS, msg);	
	}
	public MeasuredValue getExtremeWindSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_EXTREME_WIND_SPEED);	
	}
	public void setExtremeWindSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTREME_WIND_SPEED, msg);	
	}
	public MeasuredValue getCutOutWindSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUT_OUT_WIND_SPEED);	
	}
	public void setCutOutWindSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUT_OUT_WIND_SPEED, msg);	
	}	
	public MeasuredValue getCutInWindSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUT_IN_WIND_SPEED);	
	}
	public void setCutInWindSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUT_IN_WIND_SPEED, msg);	
	}
	public MeasuredValue getRatedWindSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_WIND_SPEED);	
	}
	public void setRatedWindSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_WIND_SPEED, msg);	
	}
	public MeasuredValue getMeasuredWindSpeed() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_WIND_SPEED);	
	}
	public void setMeasuredWindSpeed(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_WIND_SPEED, msg);	
	}
	public MeasuredValue getRatedPower() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER);	
	}
	public void setRatedPower(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER, msg);	
	}
	public MeasuredValue getAmoundOfElectricitySoldLimitSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING);	
	}
	public void setAmoundOfElectricitySoldLimitSetting(MeasuredValue msg) {
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
	public MeasuredValue getMeasuredCumulativeSoldElectricityAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredCumulativeSoldElectricityAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_SOLD_ELECTRICITY_AMOUNT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeGeneratedElectricityAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredCumulativeGeneratedElectricityAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GENERATED_ELECTRICITY_AMOUNT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousGeneratedElectricityAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT);	
	}
	public void setMeasuredInstantaneousGeneratedElectricityAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GENERATED_ELECTRICITY_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectionStatus() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS);	
	}
	public void setSystemInterconnectionStatus(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECTION_STATUS, msg);	
	}
	
	
	public HouseHoldSmallWindTurbinePowerGeneration() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public HouseHoldSmallWindTurbinePowerGeneration(String uri) {
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
