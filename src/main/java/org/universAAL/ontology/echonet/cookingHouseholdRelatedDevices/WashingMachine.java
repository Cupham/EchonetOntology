package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class WashingMachine extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WashingMachine";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_WASHING_MACHINE_SETTING= EchonetOntology.NAMESPACE + "HasWashingMachineSetting";
	public static final String PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE= EchonetOntology.NAMESPACE + "HasCurrentStageOfWashingCycle";
	public static final String PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE= EchonetOntology.NAMESPACE + "HasRemainingTimeToCompleteWashingCycle";
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
	public Date getRemainingTimeToCompleteWashingCycle() {
		return (Date) getProperty(PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE);	
	}
	public void setRemainingTimeToCompleteWashingCycle(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_TIME_TO_COMPLETE_WASHING_CYCLE, msg);	
	}
	public OperationModeSettingValue getCurrentStageOfWashingCycle() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE);	
	}
	public void setCurrentStageOfWashingCycle(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_STAGE_OF_WASHING_CYCLE, msg);	
	}
	public OperationStateSettingValue getWashingMachineSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_WASHING_MACHINE_SETTING);	
	}
	public void setWashingMachineSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHING_MACHINE_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	

	
	public WashingMachine() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public WashingMachine(String uri) {
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
