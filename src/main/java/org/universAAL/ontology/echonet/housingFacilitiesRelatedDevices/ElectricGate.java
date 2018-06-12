package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.ElectricDeviceFaultDesciptionValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricGate extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricGate";
	public static final String PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE + "HasRecoverableFaultDescription";
	public static final String PROPERTY_HAS_TIMER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasTimerOperationSetting";
	public static final String PROPERTY_HAS_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasOpeningSpeedSetting";
	public static final String PROPERTY_HAS_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasClosingSpeedSetting";
	public static final String PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE = EchonetOntology.NAMESPACE + "HasOperationTimeSettingValue";
	public static final String PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "HasOpeningClosingOperationSetting";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL = EchonetOntology.NAMESPACE + "HasDegreeOfOpeningLevel";
	public static final String PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "HasOpeningClosingSpeedSetting";
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
	public void setOneTimeOpeningSpeedSetting(ThresholdLevelValue msg) {
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
	public ThresholdLevelValue getOpeningClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING);	
	}
	public void setOpeningClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING, msg);	
	}
	public MeasuredValue getDegreeOfOpeningLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL);	
	}
	public void setDegreeOfOpeningLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL, msg);	
	}
	public OperationFunctionSettingValue getOpeningClosingOperationSetting() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING);	
	}
	public void setOpeningClosingOperationSetting(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING, msg);	
	}
	public MeasuredValue getOperationTimeSettingValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE);	
	}
	public void setOperationTimeSettingValue(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE, msg);	
	}
	public ThresholdLevelValue getClosingSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING);	
	}
	public void setClosingSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CLOSING_SPEED_SETTING, msg);	
	}
	public ThresholdLevelValue getOpeningSpeedSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_OPENING_SPEED_SETTING);	
	}
	public void setOpeningSpeedSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPENING_SPEED_SETTING, msg);	
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
	

	public ElectricGate() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public ElectricGate(String uri) {
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
