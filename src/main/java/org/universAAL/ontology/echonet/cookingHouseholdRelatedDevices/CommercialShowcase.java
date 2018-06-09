package org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OperationFuntionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ShapeValue;

public class CommercialShowcase extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CommercialShowcase";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING= EchonetOntology.NAMESPACE + "HasOperationModeSetting";
	public static final String PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE= EchonetOntology.NAMESPACE + "HasMeasuredDischargeTemperature";
	public static final String PROPERTY_HAS_GROUP_INFORMATION= EchonetOntology.NAMESPACE + "HasGroupInformation";
	public static final String PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS= EchonetOntology.NAMESPACE + "HasInternalLightingOperationStatus";
	public static final String PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS= EchonetOntology.NAMESPACE + "HasExternalLightingOperationStatus";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS= EchonetOntology.NAMESPACE + "HasCompressorOperationStatus";
	public static final String PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE= EchonetOntology.NAMESPACE + "HasMeasuredInternalTemperature";
	public static final String PROPERTY_HAS_FREEZING_CAPABILITY_VALUE= EchonetOntology.NAMESPACE + "HasFreezingCapabilityValue";
	public static final String PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION= EchonetOntology.NAMESPACE + "HasDefrostingHeaterPowerConsumption";
	public static final String PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION= EchonetOntology.NAMESPACE + "HasFanMotorPowerConsumption";
	public static final String PROPERTY_HAS_HEATER_MODE= EchonetOntology.NAMESPACE + "HasHeaterMode";
	public static final String PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE= EchonetOntology.NAMESPACE + "HasInsideTheShowcaseLightingType";
	public static final String PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_TYPE= EchonetOntology.NAMESPACE + "HasOutsideTheCaseLightingType";
	public static final String PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL= EchonetOntology.NAMESPACE + "HasInsideTheShowcaseLightingIlluminanceLevel";
	public static final String PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL= EchonetOntology.NAMESPACE + "HasOutsideTheCaseLightingIlluminanceLevel";
	public static final String PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "HasInsideTheCaseTemperatureSetting";
	public static final String PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION= EchonetOntology.NAMESPACE + "HasShowCaseTypeInformation";
	public static final String PROPERTY_HAS_DOOR_TYPE_INFORMATION= EchonetOntology.NAMESPACE + "HasDoorTypeInformation";
	public static final String PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION= EchonetOntology.NAMESPACE + "HasShowcaseConfigurationInformation";
	public static final String PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION= EchonetOntology.NAMESPACE + "HasShowcaseShapeInformation";
	public static final String PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION= EchonetOntology.NAMESPACE + "HasInsideTheCaseTemperatureRangeInformation";

	public OperationStatusValue getInsideTheCaseTemperatureRangeInformation() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION);	
	}
	public void setInsideTheCaseTemperatureRangeInformation(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_RANGE_INFORMATION, msg);	
	}
	public ShapeValue getShowcaseShapeInformation() {
		return (ShapeValue) getProperty(PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION);	
	}
	public void setShowcaseShapeInformation(ShapeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_SHAPE_INFORMATION, msg);	
	}
	public OperationFuntionSettingValue getShowcaseConfigurationInformation() {
		return (OperationFuntionSettingValue) getProperty(PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION);	
	}
	public void setShowcaseConfigurationInformation(OperationFuntionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_CONFIGURATION_INFORMATION, msg);	
	}
	public OperationStateSettingValue getDoorTypeInformation() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_TYPE_INFORMATION);	
	}
	public void setDoorTypeInformation(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_TYPE_INFORMATION, msg);	
	}
	public OperationFuntionSettingValue getShowCaseTypeInformation() {
		return (OperationFuntionSettingValue) getProperty(PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION);	
	}
	public void setShowCaseTypeInformation(OperationFuntionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHOWCASE_TYPE_INFORMATION, msg);	
	}
	public MeasuredValue getInsideTheCaseTemperatureSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING);	
	}
	public void setInsideTheCaseTemperatureSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_CASE_TEMPERATURE_SETTING, msg);	
	}
	public MeasuredValue getOutsideTheCaseLightingIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setOutsideTheCaseLightingIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OUTSIDE_THE_CASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public MeasuredValue getInsideTheShowcaseLightingIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setInsideTheCaseLightingIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public OperationFuntionSettingValue getOutsideTheShowcaseLightingType() {
		return (OperationFuntionSettingValue) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL);	
	}
	public void setOutsideTheCaseLightingType(OperationFuntionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_ILLUMINANCE_LEVEL, msg);	
	}
	public OperationFuntionSettingValue getInsideTheShowcaseLightingType() {
		return (OperationFuntionSettingValue) getProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE);	
	}
	public void setInsideTheShowcaseLightingType(OperationFuntionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSIDE_THE_SHOWCASE_LIGHTING_TYPE, msg);	
	}
	public OperationStatusValue getHeaterMode() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATER_MODE);	
	}
	public void setHeaterMode(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATER_MODE, msg);	
	}
	public MeasuredValue getFanMotorPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION);	
	}
	public void setFanMotorPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FAN_MOTER_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getDefrostingHeaterPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION);	
	}
	public void setDefrostingHeaterPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEFROSTING_HEATER_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getFreezingCapabilityValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_FREEZING_CAPABILITY_VALUE);	
	}
	public void setFreezingCapabilityValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FREEZING_CAPABILITY_VALUE, msg);	
	}
	public MeasuredValue getMeasuredInternalTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE);	
	}
	public void setMeasuredInternalTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INTERNAL_TEMPERATURE, msg);	
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);	
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getExternalLightingOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS);	
	}
	public void setExternalLightingOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EXTERNAL_LIGHTING_OPERATION_STATUS, msg);	
	}
	public OperationStatusValue getInternalLightingOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS);	
	}
	public void setInternalLightingOperationStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INTERNAL_LIGHTING_OPERATION_STATUS, msg);	
	}
	public String getGroupInformation() {
		return (String) getProperty(PROPERTY_HAS_GROUP_INFORMATION);	
	}
	public void setGroupInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GROUP_INFORMATION, msg);	
	}
	public MeasuredValue getMeasuredDischargeTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE);	
	}
	public void setMeasuredDischargeTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_DISCHARGE_TEMPERATURE, msg);	
	}
	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	

	
	public CommercialShowcase() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice);
	}
	public CommercialShowcase(String uri) {
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
