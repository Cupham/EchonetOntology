package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.HumidifyingLevelValue;
import org.universAAL.ontology.echonet.values.HumidifyingRelativeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
public class Humidifier extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Humidifier";
	public static final String PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING = EchonetOntology.NAMESPACE +"HumidifierHasRelativeHumidifyingSetting";
	public static final String PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING = EchonetOntology.NAMESPACE +"HumidifierHasHumidifyingLevelSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "HumidifierHasMeasuredRoomHumidity";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "HumidifierHasOFFTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE = EchonetOntology.NAMESPACE + "HumidifierHasOFFTimerReservationRelativeTimeValue";
	public static final String PROPERTY_HAS_ION_EMISSION_SETTING = EchonetOntology.NAMESPACE + "HumidifierHasIonEmissionSetting";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "HumidifierHasSpecialOperationModeSetting";
	public static final String PROPERTY_HAS_WATER_AMOUNT_LEVEL = EchonetOntology.NAMESPACE + "HumidifierHasWaterAmountLevel";
	
	public LiquidAmountLevelValue getWaterAmountLevel() {
		return (LiquidAmountLevelValue) getProperty(PROPERTY_HAS_WATER_AMOUNT_LEVEL);	
	}
	public void setWaterAmountLevel(LiquidAmountLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_AMOUNT_LEVEL, msg);	
	}
	public OperationModeSettingValue getSpecialOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING);	
	}
	public void setSpecialOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING, msg);	
	}
	public IonEmissionMethodValue getIonEmissionSetting() {
		return (IonEmissionMethodValue) getProperty(PROPERTY_HAS_ION_EMISSION_SETTING);	
	}
	public void setIonEmissionSetting(IonEmissionMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ION_EMISSION_SETTING, msg);	
	}
	public Date getOFFTimerReservationRelativeTimeValue() {
		return (Date) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE);	
	}
	public void setOFFTimerReservationRelativeTimeValue(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE, msg);	
	}
	public OperationStatusValue getOFFTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);
	}
	public void setOFFTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);
	}
	public MeasuredValue getMeasuredRoomHumidity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredRoomHumidity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY, msg);	
	}
	public HumidifyingLevelValue getHumidifyingLevelSetting() {
		return (HumidifyingLevelValue) getProperty(PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING);	
	}
	public void setHumidifyingLevelSetting(HumidifyingLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING,msg);	
	}
	public HumidifyingRelativeValue getRelativeHumidifyingSetting() {
		return (HumidifyingRelativeValue) getProperty(PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING);	
	}
	public void setRelativeHumidifyingSetting(HumidifyingRelativeValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING,msg);	
	}
	
	public Humidifier() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public Humidifier(String uri) {
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
