package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import java.util.Date;
import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasurementMethodValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RatedPowerConsumptionInModeValue;
import org.universAAL.ontology.echonet.values.TemperatureInModeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;


public class ColdHotWaterHeatSourceEquipment extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ColdHotWaterHeatSourceEquipment";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1 = EchonetOntology.NAMESPACE + "HasWaterTemperatureSetting1";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2 = EchonetOntology.NAMESPACE + "HasWaterTemperatureSetting2";
	public static final String PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE = EchonetOntology.NAMESPACE + "HasMeasuredInwardWaterTemperature";
	public static final String PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE = EchonetOntology.NAMESPACE + "HasMeasuredOutwardWaterTemperature";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasSpecialOperationSetting";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS = EchonetOntology.NAMESPACE + "HasDailyTimerSettingStatus";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_1 = EchonetOntology.NAMESPACE + "HasDailyTimerSetting1";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_2 = EchonetOntology.NAMESPACE + "HasDailyTimerSetting2";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOffTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasOffTimerSettingTime";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "HasOffTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "HasRatedPowerConsumption";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD = EchonetOntology.NAMESPACE + "HasPowerConsumptionMeasurementMethod";

	public MeasurementMethodValue getPowerConsumptionMeasurementMethod() {
		return (MeasurementMethodValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD);	
	}
	public void setPowerConsumptionMeasurementMethod(MeasurementMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD, msg);	
	}
	public RatedPowerConsumptionInModeValue getRatedPowerConsumption() {
		return (RatedPowerConsumptionInModeValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION);	
	}
	public void setRatedPowerConsumption(RatedPowerConsumptionInModeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public Date getOffTimerSettingRelativeTime() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOffTimerSettingRelativeTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getOffTimerSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME);	
	}
	public void setOfTimerSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getOffTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);	
	}
	public void setOfffTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);	
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
	public String getDailyTimerSetting2() {
		return (String) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2);	
	}
	public void setDailyTimerSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2, msg);	
	}
	public String getDailyTimerSetting1() {
		return (String) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_1);	
	}
	public void setDailyTimerSetting1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_1, msg);	
	}
	public OperationFunctionSettingValue getDailyTimerSettingStatus() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS);	
	}
	public void setDailyTimerSettingStatus(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS, msg);	
	}
	public OperationModeSettingValue getSpecialOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING);	
	}
	public void setSpecialOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING, msg);	
	}
	public MeasuredValue getMeasuredOutwardWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredOutwardWaterTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredInwardWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredInwardWaterTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE, msg);	
	}
	public TemperatureInModeValue getWaterTemperatureSetting2() {
		return (TemperatureInModeValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2);	
	}
	public void setWaterTemperatureSetting2(TemperatureInModeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2, msg);	
	}
	public MeasuredValue getWaterTemperatureSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1);	
	}
	public void setWaterTemperatureSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1, msg);	
	}

	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	public ColdHotWaterHeatSourceEquipment() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ColdHotWaterHeatSourceEquipment(String uri) {
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
