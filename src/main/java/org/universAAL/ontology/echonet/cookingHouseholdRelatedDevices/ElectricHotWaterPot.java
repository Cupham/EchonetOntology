package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class ElectricHotWaterPot extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricHotWaterPot";
	public static final String PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_NO_WATER_WARNING = EchonetOntology.NAMESPACE + "HasNoWaterWarning";
	public static final String PROPERTY_HAS_BOIL_UP_SETTING = EchonetOntology.NAMESPACE + "HasBoilUpSetting";
	public static final String PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING = EchonetOntology.NAMESPACE + "HasBoilUpWarmerModeSetting";
	public static final String PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasWarmerTemperatureSettingValue";
	public static final String PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS = EchonetOntology.NAMESPACE + "HasHotWaterDischargeStatus";
	public static final String PROPERTY_HAS_LOCK_STATUS = EchonetOntology.NAMESPACE + "HasLockStatus";
	
	public OccurenceStatusValue getLockStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_LOCK_STATUS);	
	}
	public void setLockStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_LOCK_STATUS, msg);	
	}
	public OperationStatusValue getHotWaterDischargeStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS);	
	}
	public void setHotWaterDischargeStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HOT_WATER_DISCHARGE_STATUS, msg);	
	}
	public MeasuredValue getWarmerTemperatureSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE);	
	}
	public void setWarmerTemperatureSettingValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WARMER_TEMPERATURE_SETTING_VALUE, msg);	
	}
	public OperationModeSettingValue getBoilUpWarmerModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING);	
	}
	public void setBoilUpWarmerModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BOIL_UP_WARMER_MODE_SETTING, msg);	
	}
	public OperationStatusValue getBoilUpSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_BOIL_UP_SETTING);	
	}
	public void setBoilUpSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BOIL_UP_SETTING, msg);	
	}
	public OccurenceStatusValue getNoWaterWarning() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_NO_WATER_WARNING);	
	}
	public void setNoWaterWarning(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NO_WATER_WARNING, msg);	
	}
	public OperationStateSettingValue getCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS, msg);	
	}

	public ElectricHotWaterPot() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public ElectricHotWaterPot(String uri) {
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
