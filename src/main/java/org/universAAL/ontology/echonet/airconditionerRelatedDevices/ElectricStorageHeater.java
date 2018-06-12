package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RadiationMethodValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricStorageHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricStorageHeater";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE +"ElectricStorageHeaterHasTemperatureSetting";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"ElectricStorageHeaterHasRatedPowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE = EchonetOntology.NAMESPACE +"ElectricStorageHeaterHasMeasuredIndoorTemperature";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE = EchonetOntology.NAMESPACE +"ElectricStorageHeaterHasMeasuredOutdoorTemperature";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasAirFlowRateSetting";
	public static final String PROPERTY_HAS_FAN_OPERATION_STATUS = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanOperationStatus";
	public static final String PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasHeatStorageOperationStatus";
	public static final String PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasHeatStorageTemperatureSetting";
	public static final String PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasMeasuredStoredHeatTemperature";
	public static final String PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasDaytimeHeatStorageSetting";
	public static final String PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasDaytimeHeatStorageAbility";
	public static final String PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasMidnightPowerDurationSetting";
	public static final String PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasMidnightPowerStartTimeSetting";
	public static final String PROPERTY_HAS_RADIATION_METHOD = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasRadiationMethod";
	public static final String PROPERTY_HAS_CHILD_LOCK_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasChildLockSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer1Setting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_ON_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer1ONSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer1OFFSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer2Setting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_ON_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer2ONSetting";
	public static final String PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING = EchonetOntology.NAMESPACE + "ElectricStorageHeaterHasFanTimer2OFFSetting";

	public Date getFanTimer2OFFSetting() {
		return (Date) getProperty(PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING);	
	}
	public void setFanTimer2OFFSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING, msg);	
	}
	public Date getFanTimer2ONSetting() {
		return (Date) getProperty(PROPERTY_HAS_FAN_TIMER_2_ON_SETTING);	
	}
	public void setFanTimer2ONSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_ON_SETTING, msg);	
	}
	public OperationStatusValue getFanTimer2Setting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_TIMER_2_SETTING);	
	}
	public void setFanTimer2Setting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_2_SETTING, msg);	
	}
	public Date getFanTimer1OFFSetting() {
		return (Date) getProperty(PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING);	
	}
	public void setFanTimer1OFFSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING, msg);	
	}
	public Date getFanTimer1ONSetting() {
		return (Date) getProperty(PROPERTY_HAS_FAN_TIMER_1_ON_SETTING);	
	}
	public void setFanTimer1ONSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_ON_SETTING, msg);	
	}
	public OperationStatusValue getFanTimer1Setting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_TIMER_1_SETTING);	
	}
	public void setFanTimer1Setting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_TIMER_1_SETTING, msg);	
	}
	public OperationStatusValue getChildLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CHILD_LOCK_SETTING);	
	}
	public void getChildLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHILD_LOCK_SETTING, msg);	
	}
	public RadiationMethodValue getRadiationMethod() {
		return (RadiationMethodValue) getProperty(PROPERTY_HAS_RADIATION_METHOD);	
	}
	public void setRadiationMethod(RadiationMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RADIATION_METHOD, msg);	
	}
	public MeasuredValue getMidnightPowerStartTimeSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING);	
	}
	public void setMidnightPowerStartTimeSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING, msg);	
	}
	public MeasuredValue getMidnightPowerDurationSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING);	
	}
	public void setMidnightPowerDurationSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING, msg);	
	}
	public OperationStatusValue getDaytimeHeatStorageAbility() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY);	
	}
	public void setDaytimeHeatStorageAbility(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY, msg);	
	}
	public OperationStatusValue getDaytimeHeatStorageSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING);	
	}
	public void setDaytimeHeatStorageSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredStoredHeatTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE);	
	}
	public void setMeasuredStoredHeatTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE, msg);	
	}
	public MeasuredValue getHeatStorageTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING);	
	}
	public void setHeatStorageTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING, msg);	
	}
	public OperationStatusValue getHeatStorageOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS);	
	}
	public void setHeatStorageOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getFanOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_FAN_OPERATION_STATUS);	
	}
	public void setFanOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_OPERATION_STATUS, msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredOutdoorTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE);	
	}
	public void setMeasuredOutdoorTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredIndoorTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE);	
	}
	public void setMeasuredIndoorTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE, msg);	
	}
	public MeasuredValue getRatedPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION);	
	}
	public void setRatedPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING);	
	}
	public void setTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING, msg);	
	}
	

	
	public ElectricStorageHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public ElectricStorageHeater(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
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
