package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricToiletSeat extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricToiletSeat";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL = EchonetOntology.NAMESPACE + "HasToiletSeatTemperatureLevel";
	public static final String PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING = EchonetOntology.NAMESPACE + "HasToiletSeatHeaterSetting";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING = EchonetOntology.NAMESPACE + "HasToiletSeatTemporalHaltSetting";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME = EchonetOntology.NAMESPACE + "HasToiletSeatTemporalHaltStartTime";
	public static final String PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION = EchonetOntology.NAMESPACE + "HasToiletSeatTemporalHaltDuration";
	public static final String PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING = EchonetOntology.NAMESPACE + "HasRoomHeatingTemeperatureLevelSetting";
	public static final String PROPERTY_HAS_ROOM_HEATING_SETTING = EchonetOntology.NAMESPACE + "HasRoomHeatingSetting";
	public static final String PROPERTY_HAS_ROOM_HEATING_STATUS = EchonetOntology.NAMESPACE + "HasRoomHeatingStatus";
	public static final String PROPERTY_HAS_ROOM_HEATING_START_TIME = EchonetOntology.NAMESPACE + "HasRoomHeatingStartTime";
	public static final String PROPERTY_HAS_ROOM_HEATING_DURATION = EchonetOntology.NAMESPACE + "HasRoomHeatingDuration";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HasSpecialOperationModeSetting";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_STATUS = EchonetOntology.NAMESPACE + "HasHumanDetectionStatus";
	public static final String PROPERTY_HAS_SEATING_DETECTION_STATUS = EchonetOntology.NAMESPACE + "HasSeatingDetectionStatus";
	
	public OccurenceStatusValue getSeatingDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SEATING_DETECTION_STATUS);	
	}
	public void setSeatingDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SEATING_DETECTION_STATUS, msg);	
	}
	public OccurenceStatusValue getHumanDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_HUMAN_DETECTION_STATUS);	
	}
	public void setHumanDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_STATUS, msg);	
	}
	public OperationModeSettingValue getSpecialOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING);	
	}
	public void OperationModeSettingValue(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING, msg);	
	}
	public Date getRoomHeatingDuration() {
		return (Date) getProperty(PROPERTY_HAS_ROOM_HEATING_DURATION);	
	}
	public void setRoomHeatingDuration(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_DURATION, msg);	
	}
	public Date getRoomHeatingStartTime() {
		return (Date) getProperty(PROPERTY_HAS_ROOM_HEATING_START_TIME);	
	}
	public void setRoomHeatingStartTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_START_TIME, msg);	
	}
	public OperationStatusValue getRoomHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ROOM_HEATING_STATUS);	
	}
	public void setRoomHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_STATUS, msg);	
	}
	public OperationModeSettingValue getRoomHeatingSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ROOM_HEATING_SETTING);	
	}
	public void setRoomHeatingSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_SETTING, msg);	
	}
	public ThresholdLevelValue getRoomHeatingTemeperatureLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING);	
	}
	public void setRoomHeatingTemeperatureLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING, msg);	
	}
	public Date getToiletSeatTemporalHaltDuration() {
		return (Date) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION);	
	}
	public void setToiletSeatTemporalHaltDuration(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION, msg);	
	}
	public Date getToiletSeatTemporalHaltStartTime() {
		return (Date) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME);	
	}
	public void setToiletSeatTemporalHaltStartTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME, msg);	
	}
	public OperationFunctionSettingValue getToiletSeatTemporalHaltSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING);	
	}
	public void setToiletSeatTemporalHaltSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING, msg);	
	}
	public OperationStatusValue getToiletSeatHeaterSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING);	
	}
	public void setToiletSeatHeaterSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING, msg);	
	}
	public ThresholdLevelValue getToiletSeatTemperatureLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL);	
	}
	public void setToiletSeatTemperatureLevel(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL, msg);	
	}

	public ElectricToiletSeat() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ElectricToiletSeat(String uri) {
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
