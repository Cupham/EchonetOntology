package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.ElectricDeviceFaultDesciptionValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;

public class ElectricBlind extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirCleaner";
	public static final String PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE + "HasRecoverableFaultDescription";
	public static final String PROPERTY_HAS_TIMER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasTimerOperationSetting";
	public static final String PROPERTY_HAS_WIND_DETECTION_STATUS = EchonetOntology.NAMESPACE + "HasWindDetectionStatus";
	public static final String PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS = EchonetOntology.NAMESPACE + "HasSunLightDetectionStatus";
	public static final String PROPERTY_HAS_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasOpeningSpeedSetting";
	public static final String PROPERTY_HAS_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasClosingSpeedSetting";
	public static final String PROPERTY_HAS_OPERATION_TIME = EchonetOntology.NAMESPACE + "HasOperationTime";
	public static final String PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasAutomaticOperationSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_SETTING = EchonetOntology.NAMESPACE + "HasOpenCloseSetting";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL = EchonetOntology.NAMESPACE + "HasDegreeOfOpeningLevel";
	public static final String PROPERTY_HAS_SHADE_ANGLE_SETTING = EchonetOntology.NAMESPACE + "HasShadeAngleSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_SPEED = EchonetOntology.NAMESPACE + "HasOpenCloseSpeed";
	public static final String PROPERTY_HAS_ELECTRIC_LOCK_SETTING = EchonetOntology.NAMESPACE + "HasElectricLockSetting";
	public static final String PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS = EchonetOntology.NAMESPACE + "HasRemoteOperationSettingStatus";
	public static final String PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasSelectiveOpeningOperationSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_STATUS = EchonetOntology.NAMESPACE + "HasOpenCloseStatus";
	public static final String PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasOneTimeOpeningSpeedSetting";
	public static final String PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasOneTimeClosingSpeedSetting";
	
	public ThresholdLevelValue getOneTimeClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING);	
	}
	public void setOneTimeClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING, msg);	
	}
	public ThresholdLevelValue getOneTimeOpeningSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING);	
	}
	public void setOneTimeOpeningSpeedSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING, msg);	
	}
	public OperationStateSettingValue getOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_OPEN_CLOSE_STATUS);	
	}
	public void setOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPEN_CLOSE_STATUS, msg);	
	}
	public SelectiveOpeningOperationSettingValue getSelectiveOpeningOperationSetting() {
		return (SelectiveOpeningOperationSettingValue) getProperty(PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING);	
	}
	public void setSelectiveOpeningOperationSetting(SelectiveOpeningOperationSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING, msg);	
	}
	public OperationStatusValue getRemoteOperationSettingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS);	
	}
	public void setRemoteOperationSettingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS, msg);	
	}
	public OperationStatusValue getElectricLockSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ELECTRIC_LOCK_SETTING);	
	}
	public void setElectricLockSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_LOCK_SETTING, msg);	
	}
	public ThresholdLevelValue getCloseSpeed() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_OPEN_CLOSE_SPEED);	
	}
	public void setCloseSpeed(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPEN_CLOSE_SPEED, msg);	
	}
	public MeasuredValue getShadeAngleSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SHADE_ANGLE_SETTING);	
	}
	public void setShadeAngleSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SHADE_ANGLE_SETTING, msg);	
	}
	public MeasuredValue getDegreeOfOpeningLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL);	
	}
	public void setDegreeOfOpeningLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL, msg);	
	}
	public OperationFunctionSettingValue getOpenCloseSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_OPEN_CLOSE_SETTING);	
	}
	public void setOpenCloseSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPEN_CLOSE_SETTING, msg);	
	}
	public OperationStatusValue getAutomaticOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING);	
	}
	public void setAutomaticOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING, msg);	
	}
	public MeasuredValue getOperationTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OPERATION_TIME);	
	}
	public void setOperationTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_TIME, msg);	
	}
	public OperationModeSettingValue getClosingSpeedSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING);	
	}
	public void setClosingSpeedSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING, msg);	
	}
	public OperationModeSettingValue getOpeningSpeedSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPENING_SPEED_SETTING);	
	}
	public void setOpeningSpeedSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_SPEED_SETTING, msg);	
	}
	public OccurenceStatusValue getSunLightDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS);	
	}
	public void setSunLightDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS, msg);	
	}
	public OccurenceStatusValue getWindDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_WIND_DETECTION_STATUS);	
	}
	public void setWindDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WIND_DETECTION_STATUS, msg);	
	}
	public OperationStatusValue getTimerOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TIMER_OPERATION_SETTING);	
	}
	public void setTimerOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TIMER_OPERATION_SETTING, msg);	
	}
	public ElectricDeviceFaultDesciptionValue getRecoverableFaultDescription() {
		return (ElectricDeviceFaultDesciptionValue) getProperty(PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION);	
	}
	public void setRecoverableFaultDescription(ElectricDeviceFaultDesciptionValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION, msg);	
	}
	

	public ElectricBlind() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ElectricBlind(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
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
