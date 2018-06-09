package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class ClothesDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ClothesDryer";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_DRYING_SETTING= EchonetOntology.NAMESPACE + "HasDryingSetting";
	public static final String PROPERTY_HAS_DRYING_STATUS= EchonetOntology.NAMESPACE + "HasDryingStatus";
	public static final String PROPERTY_HAS_DRYING_REMAINING_TIME= EchonetOntology.NAMESPACE + "HasDryingRemainingTime";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "HasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING= EchonetOntology.NAMESPACE + "HasOnTimerSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "HasOnTimerSetting_RelativeTime";

	
	public Date getOnTimerSetting_RelativeTime() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOnTimerSetting_RelativeTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getOnTimerSetting() {
		return (Date) getProperty(PROPERTY_HAS_ON_TIMER_SETTING);	
	}
	public void setOnTimerSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}	
	public Date getDryingRemainingTime() {
		return (Date) getProperty(PROPERTY_HAS_DRYING_REMAINING_TIME);	
	}
	public void setDryingRemainingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_REMAINING_TIME, msg);	
	}
	public OperationModeSettingValue getDryingStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_DRYING_STATUS);	
	}
	public void setDryingStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_STATUS, msg);	
	}
	public OperationStateSettingValue getDryingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DRYING_SETTING);	
	}
	public void setDryingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DRYING_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	

	
	public ClothesDryer() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public ClothesDryer(String uri) {
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
