package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class CommercialShowcaseOutdoorUnit extends EchonetSuperDevice{
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CommercialShowcaseOutdoorUnit";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING= EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_GROUP_INFORMATION= EchonetOntology.NAMESPACE + "HasGroupInformation";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS= EchonetOntology.NAMESPACE + "HasCompressorOperationStatus";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE= EchonetOntology.NAMESPACE + "HasMeasuredOutDoorAirTemperature";
	public static final String PROPERTY_HAS_EXCEPTIONAL_STATUS= EchonetOntology.NAMESPACE + "HasExceptionalStatus";
	
	
	public OperationModeSettingValue getExceptionalStatus() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE);	
	}
	public void setExceptionalStatus(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE, msg);	
	}
	
	public MeasuredValue getMeasuredOutDoorAirTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE);	
	}
	public void setMeasuredOutDoorAirTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE, msg);	
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);	
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS, msg);	
	}
	
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFORMATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFORMATION, msg);	
	}
	
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	

	
	public CommercialShowcaseOutdoorUnit() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public CommercialShowcaseOutdoorUnit(String uri) {
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
