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
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;


public class FloorHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FloorHeater";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING_1 = EchonetOntology.NAMESPACE + "HasTemperatureSetting1";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING_2 = EchonetOntology.NAMESPACE + "HasTemperatureSetting2";
	public static final String PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE = EchonetOntology.NAMESPACE + "HasMeasuredRoomTemperature";
	public static final String PROPERTY_HAS_MEASURED_FLOOR_TEMPERATURE = EchonetOntology.NAMESPACE + "HasMeasuredFloorTemperature";
	public static final String PROPERTY_HAS_ZONE_CHANGE_SETTING = EchonetOntology.NAMESPACE + "HasZoneChangeSetting";
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
	public String getZoneChangeSetting() {
		return (String) getProperty(PROPERTY_HAS_ZONE_CHANGE_SETTING);	
	}
	public void setZoneChangeSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ZONE_CHANGE_SETTING, msg);	
	}
	public OperationModeSettingValue getSpecialOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING);	
	}
	public void setSpecialOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING, msg);	
	}
	public MeasuredValue getFloorWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_FLOOR_TEMPERATURE);	
	}
	public void setMeasuredFloorTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_FLOOR_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredRoomWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE);	
	}
	public void setMeasuredRoomTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE, msg);	
	}
	public ThresholdLevelValue getTemperatureSetting2() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING_2);	
	}
	public void setTemperatureSetting2(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING_2, msg);	
	}
	public MeasuredValue getTemperatureSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING_1);	
	}
	public void setTemperatureSetting1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING_1, msg);	
	}

	
	public FloorHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public FloorHeater(String uri) {
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
