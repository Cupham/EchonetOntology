package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonet.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class FanHeater extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "FanHeater";
	public static final String PROPERTY_HAS_TEMPERATURE_SETTING = EchonetOntology.NAMESPACE +"FanHeaterHasTemperatureSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE = EchonetOntology.NAMESPACE +"FanHeaterHasMeasuredRoomTemperature";
	public static final String PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING = EchonetOntology.NAMESPACE +"FanHeaterHasAutomaticTemperatureControlSetting";
	public static final String PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "FanHeaterHasONTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "FanHeaterHasONTimerTimeSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "FanHeaterHasONTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "FanHeaterHasOFFTimerBasedReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "FanHeaterHasOFFTimerTimeSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "FanHeaterHasOFFTimerRelativeTimeSetting";
	public static final String PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING = EchonetOntology.NAMESPACE +"FanHeaterHasExtensionalOperationSetting";
	public static final String PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME= EchonetOntology.NAMESPACE + "FanHeaterHasExtensionalOperationTimerSettingTime";
	public static final String PROPERTY_HAS_ION_EMISSION_SETTING = EchonetOntology.NAMESPACE + "FanHeaterHasIonEmissionSetting";
	public static final String PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD = EchonetOntology.NAMESPACE + "FanHeaterHasImplementedIonEmissionMethod";
	public static final String PROPERTY_HAS_OIL_AMOUNT_LEVEL = EchonetOntology.NAMESPACE + "FanHeaterHasOilAmountLevel";
	
	public LiquidAmountLevelValue getOilAmountLevel() {
		return (LiquidAmountLevelValue) getProperty(PROPERTY_HAS_OIL_AMOUNT_LEVEL);	
	}
	public void setOilAmountLevel(LiquidAmountLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OIL_AMOUNT_LEVEL, msg);	
	}
	public IonEmissionMethodValue getImplementedIonEmissionMethod() {
		return (IonEmissionMethodValue) getProperty(PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD);	
	}
	public void setImplementedIonEmissionMethod(IonEmissionMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD, msg);	
	}
	public OperationStatusValue getIonEmissionSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ION_EMISSION_SETTING);	
	}
	public void setIonEmissionSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ION_EMISSION_SETTING, msg);	
	}
	public Date getExtensionalOperationTimerSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME);	
	}
	public void setExtensionalOperationTimerSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getExtensionalOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING);	
	}
	public void setExtensionalOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING, msg);	
	}
	public Date getOFFTimerRelativeTimeSetting() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOFFTimerRelativeTimeSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getOFFTimerTimeSetting() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME);	
	}
	public void setOFFTimerTimeSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getOFFTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setOFFTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public Date getONTimerRelativeTimeSetting() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setONTimerRelativeTimeSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getONTimerTimeSetting() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME);	
	}
	public void setONTimerTimeSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationModeSettingValue getONTimerBasedReservationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING);	
	}
	public void setONTimerBasedReservationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticTemperatureControlSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING);	
	}
	public void setAutomaticTemperatureControlSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getMeasuredRoomTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE);	
	}
	public void setMeasuredRoomTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE, msg);	
	}
	public MeasuredValue getTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TEMPERATURE_SETTING);	
	}
	public void setTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TEMPERATURE_SETTING, msg);	
	}
	
	public FanHeater() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public FanHeater(String uri) {
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
