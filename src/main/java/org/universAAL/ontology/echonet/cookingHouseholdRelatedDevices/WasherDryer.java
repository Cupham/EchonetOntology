package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;




import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;

public class WasherDryer extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WasherDryer";
	public static final String PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "HasDoorCoverOpenCloseStatus";
	public static final String PROPERTY_HAS_WASHER_DRYER_SETTING= EchonetOntology.NAMESPACE + "HasWasherDryerSetting";
	//TODO Implement other functions
	public OperationStateSettingValue getWasherDryerSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_WASHER_DRYER_SETTING);	
	}
	public void setWasherDryerSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WASHER_DRYER_SETTING, msg);	
	}
	public OperationStateSettingValue getDoorCoverOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS);	
	}
	public void setDoorCoverOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_COVER_OPEN_CLOSE_STATUS, msg);	
	}

	public WasherDryer() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public WasherDryer(String uri) {
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
