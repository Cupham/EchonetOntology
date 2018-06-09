package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class RiceCooker extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "RiceCooker";
	public static final String PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_RICE_COOKING_STATUS= EchonetOntology.NAMESPACE + "HasRiceCookingStatus";
	public static final String PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING= EchonetOntology.NAMESPACE + "HasRiceCookingControlSetting";
	public static final String PROPERTY_HAS_WARMER_SETTING= EchonetOntology.NAMESPACE + "HasWarmerSetting";
	public static final String PROPERTY_HAS_INNER_POT_REMOVAL_STATUS= EchonetOntology.NAMESPACE + "HasInnerPotRemovalStatus";	
	public static final String PROPERTY_HAS_COVER_REMOVAL_STATUS= EchonetOntology.NAMESPACE + "HasCoverRemovalStatus";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING= EchonetOntology.NAMESPACE + "HasRiceCookingReservationSetting";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME= EchonetOntology.NAMESPACE + "HasRiceCookingReservationSettingTime";	
	public static final String PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME= EchonetOntology.NAMESPACE + "HasRiceCookingReservationSettingRelativeTime";	
	
	public Date getRiceCookingReservationSettingRelativeTime() {
		return (Date) getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME);	
	}
	public void setRiceCookingReservationSettingRelativeTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_RELATIVE_TIME, msg);	
	}
	public Date getRiceCookingReservationSettingTime() {
		return (Date) getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME);	
	}
	public void setRiceCookingReservationSettingTime(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING_TIME, msg);	
	}
	public OperationStatusValue getRiceCookingReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING);	
	}
	public void setRiceCookingReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_RESERVATION_SETTING, msg);	
	}
	public OperationStatusValue getCoverRemovalStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COVER_REMOVAL_STATUS);	
	}
	public void setCoverRemovalStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_REMOVAL_STATUS, msg);	
	}
	public OperationStatusValue getInnerPotRemovalStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INNER_POT_REMOVAL_STATUS);	
	}
	public void setInnerPotRemovalStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INNER_POT_REMOVAL_STATUS, msg);	
	}
	public OperationStatusValue getWarmerSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_WARMER_SETTING);	
	}
	public void setWarmerSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WARMER_SETTING, msg);	
	}
	public OperationStateSettingValue getRiceCookingControlSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING);	
	}
	public void setRiceCookingControlSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_CONTROL_SETTING, msg);	
	}
	
	public OperationStatusValue getRiceCookingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_RICE_COOKING_STATUS);	
	}
	public void setRiceCookingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RICE_COOKING_STATUS, msg);	
	}
	public OperationStateSettingValue getCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COVER_OPEN_CLOSE_STATUS, msg);	
	}
	
	public RiceCooker() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public RiceCooker(String uri) {
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
