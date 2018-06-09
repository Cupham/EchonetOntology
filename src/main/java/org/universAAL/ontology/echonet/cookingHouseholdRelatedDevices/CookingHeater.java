package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class CookingHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CookingHeater";
	public static final String PROPERTY_HAS_HEATING_STATUS= EchonetOntology.NAMESPACE + "HasHeatingStatus";
	public static final String PROPERTY_HAS_HEATING_SETTING= EchonetOntology.NAMESPACE + "HasHeatingSetting";
	public static final String PROPERTY_SETTING_ALL_STOP= EchonetOntology.NAMESPACE + "SettingAllStop";
	public static final String PROPERTY_HAS_HEATING_POWER_SETTING= EchonetOntology.NAMESPACE + "HasHeatingPowerSetting";
	public static final String PROPERTY_HAS_HEATING_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "HasHeatingTemperatureSetting";
	public static final String PROPERTY_HAS_STOVE_HEATING_MODES_SETTING= EchonetOntology.NAMESPACE + "HasStoveHeatingModesSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "HasOffTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_CHILD_LOCK_SETTING= EchonetOntology.NAMESPACE + "HasChildLockSetting";	
	public static final String PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING= EchonetOntology.NAMESPACE + "HasRadiantHeaterLockSetting";
	
	public OperationStatusValue getRadiantHeaterLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING);	
	}
	public void setRadiantHeaterLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RADIANT_HEATER_LOCK_SETTING, msg);	
	}
	public OperationStatusValue getChildLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CHILD_LOCK_SETTING);	
	}
	public void setChildLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHILD_LOCK_SETTING, msg);	
	}
	public Date getOffTimerSettingRelativeTime() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOffTimerSettingRelativeTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	
	public OperationModeSettingValue getStoveHeatingModesSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_STOVE_HEATING_MODES_SETTING);	
	}
	public void setStoveHeatingModesSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_STOVE_HEATING_MODES_SETTING, msg);	
	}
	
	public MeasuredValue getHeatingTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_TEMPERATURE_SETTING);	
	}
	public void setHeatingTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getHeatingPowerSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_POWER_SETTING);	
	}
	public void setHeatingPowerSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_POWER_SETTING, msg);	
	}
	public OperationStateSettingValue getHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_HEATING_SETTING);	
	}
	public void setHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING, msg);	
	}
	public OperationStatusValue getHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATING_STATUS);	
	}
	public void setHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_STATUS, msg);	
	}
	
	public CookingHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public CookingHeater(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
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
