package org.universAAL.ontology.echonet.airconditionerRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.ComercialAirconditionerCurrentFunctionValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.PowerConsumptionRange;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class PackageTypeCommercialAirConditionerIndoorUnit extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "PackageTypeCommercialAirConditionerIndoorUnit";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasOperationModeSetting";
	public static final String PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE = EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasMeasuredIndoorUnitTemperature";
	public static final String PROPERTY_HAS_THERMOSTAT_STATE= EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasThermostatState";
	public static final String PROPERTY_HAS_CURRENT_FUNCTION= EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasCurrentFunction";
	public static final String PROPERTY_HAS_GROUP_INFOMRATION= EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasGroupInformation";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT= EchonetOntology.NAMESPACE + 
			"PackageTypeCommercialAirConditionerIndoorUnitHasPowerConsumptionRangeIndoorUnit";
	
	public PowerConsumptionRange getPowerConsumptionRangeIndoorUnit() {
		return (PowerConsumptionRange) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT);	
	}
	public void setPowerConsumptionRangeIndoorUnit(PowerConsumptionRange msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFOMRATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFOMRATION, msg);	
	}
	public ComercialAirconditionerCurrentFunctionValue getCurrentFunction() {
		return (ComercialAirconditionerCurrentFunctionValue) getProperty(PROPERTY_HAS_CURRENT_FUNCTION);	
	}
	public void setCurrentFunction(ComercialAirconditionerCurrentFunctionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CURRENT_FUNCTION, msg);	
	}
	public OperationStatusValue getThermostatState() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_THERMOSTAT_STATE);	
	}
	public void setThermostatState(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_THERMOSTAT_STATE, msg);	
	}
	public MeasuredValue getMeasuredIndoorUnitTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE);	
	}
	public void setMeasuredIndoorUnitTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	public PackageTypeCommercialAirConditionerIndoorUnit() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public PackageTypeCommercialAirConditionerIndoorUnit(String uri) {
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
