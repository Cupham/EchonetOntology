package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class BathRoomHeaterDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "BathRoomHeaterDryer";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_VENTILATION_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasVentilationOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathroomPreWarmOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathroomHeaterOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathroomDryerOperationSetting";
	public static final String PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasBathroomAirCirculatorOperationSetting";
	public static final String PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "HasMeasuredBathroomHumidity";
	public static final String PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE = EchonetOntology.NAMESPACE + "HasMeasuredBathroomTemperature";
	public static final String PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "HasVentilationAirFlowRateSetting";
	public static final String PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING = EchonetOntology.NAMESPACE + "HasFilterCleaningReminderSignSetting";
	public static final String PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS = EchonetOntology.NAMESPACE + "HasHumanBodyDetectionStatus";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1 = EchonetOntology.NAMESPACE + "HasOnTimerBasedReservationSetting1";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2 = EchonetOntology.NAMESPACE + "HasOnTimerBasedReservationSetting2";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "HasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HasOffTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "HasOffTimerSettingTime";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "HasOffTimerSettingRelativeTime";
	
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
	public void setOffTimerSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getOffTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setOffTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING, msg);	
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
	public OperationModeSettingValue getOnTimerBasedReservationSetting2() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2);	
	}
	public void setOnTimerBasedReservationSetting2(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2, msg);	
	}
	public OperationStatusValue getOnTimerBasedReservationSetting1() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1);	
	}
	public void setOnTimerBasedReservationSetting1(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1, msg);	
	}
	public OccurenceStatusValue getHumanBodyDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS);	
	}
	public void setHumanBodyDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS, msg);	
	}
	public OccurenceStatusValue getFilterCleaningReminderSignSetting() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING);	
	}
	public void setFilterCleaningReminderSignSetting(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING, msg);	
	}
	public ThresholdLevelValue getVentilationAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING);	
	}
	public void setVentilationAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING, msg);	
	}
	public MeasuredValue getMeasuredBathroomTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE);	
	}
	public void setMeasuredBathroomTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredBathroomHumidity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredBathroomHumidity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY, msg);	
	}
	public ThresholdLevelValue getBathroomAirCirculatorOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING);	
	}
	public void setBathroomAirCirculatorOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomDryerOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING);	
	}
	public void setBathroomDryerOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomHeaterOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING);	
	}
	public void setBathroomHeaterOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getBathroomPreWarmOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING);	
	}
	public void setBathroomPreWarmOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING, msg);	
	}
	public ThresholdLevelValue getVentilationOperationSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VENTILATION_OPERATION_SETTING);	
	}
	public void setVentilationOperationSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_OPERATION_SETTING, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	
	
	public BathRoomHeaterDryer() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public BathRoomHeaterDryer(String uri) {
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
