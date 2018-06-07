package org.universAAL.ontology.echonet.airconditionerRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class PackageTypeCommercialAirConditionerOutdoorUnit extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PackageTypeCommercialAirConditionerOutdoorUnit";
	
	public static final String PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasOutDoorUnitRatedPowerConsumption";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasMeasuredOutdoorUnitTemperature";
	public static final String PROPERTY_HAS_SPECIAL_STATE = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasSpecialState";
	public static final String PROPERTY_HAS_GROUP_INFOMRATION= EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasGroupInformation";
	public static final String PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasMeasuredOutdoorUnitPowerConsumption";
	public static final String PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasPossiblePowerSavingForOutdoorUnit";
	public static final String PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasSettingRestrictingPowerConsumptionForOutdoorUnit";
	public static final String PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerOutdoorUnitHasMinimumPowerConsumptionForRestrictedOutdoorUnit";
	
	public MeasuredValue getMinimumPowerConsumptionForRestrictedOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT);	
	}
	public void setMinimumPowerConsumptionForRestrictedOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getSettingRestrictingPowerConsumptionForOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT);	
	}
	public void setSettingRestrictingPowerConsumptionForOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getPossiblePowerSavingForOutdoorUnit() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT);	
	}
	public void setPossiblePowerSavingForOutdoorUnit(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT, msg);	
	}
	public MeasuredValue getMeasuredOutdoorUnitPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION);	
	}
	public void setMeasuredOutdoorUnitPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFOMRATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFOMRATION, msg);	
	}
	public OperationStateSettingValue getSpecialState() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_SPECIAL_STATE);	
	}
	public void setSpecialState(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_STATE, msg);	
	}
	public MeasuredValue getMeasuredOutdoorUnitTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE);	
	}
	public void setMeasuredOutdoorUnitTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_TEMPERATURE, msg);	
	}
	public MeasuredValue getOutDoorUnitRatedPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION);	
	}
	public void setOutDoorUnitRatedPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION, msg);	
	}
	
	
	public PackageTypeCommercialAirConditionerOutdoorUnit() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public PackageTypeCommercialAirConditionerOutdoorUnit(String uri) {
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
