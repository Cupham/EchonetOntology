/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;


import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ElectricDeviceFaultDesciptionValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class ElectricShutter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricShutter";
	public static final String PROPERTY_HAS_RECOVERABLE_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE + "hasRecoverableFaultDescription";
	public static final String PROPERTY_HAS_TIMER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasTimerOperationSetting";
	public static final String PROPERTY_HAS_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOpeningSpeedSetting";
	public static final String PROPERTY_HAS_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasClosingSpeedSetting";
	public static final String PROPERTY_HAS_OPERATION_TIME = EchonetOntology.NAMESPACE + "hasOperationTime";
	public static final String PROPERTY_HAS_OPEN_CLOSE_SETTING = EchonetOntology.NAMESPACE + "hasOpenCloseSetting";
	public static final String PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL = EchonetOntology.NAMESPACE + "hasDegreeOfOpeningLevel";
	public static final String PROPERTY_HAS_BLIND_ANGLE_SETTING = EchonetOntology.NAMESPACE + "hasBlindAngleSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_SPEED = EchonetOntology.NAMESPACE + "hasOpenCloseSpeed";
	public static final String PROPERTY_HAS_ELECTRIC_LOCK_SETTING = EchonetOntology.NAMESPACE + "hasElectricLockSetting";
	public static final String PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS = EchonetOntology.NAMESPACE + "hasRemoteOperationSettingStatus";
	public static final String PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasSelectiveOpeningOperationSetting";
	public static final String PROPERTY_HAS_OPEN_CLOSE_STATUS = EchonetOntology.NAMESPACE + "hasOpenCloseStatus";
	public static final String PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING = EchonetOntology.NAMESPACE + "hasSlitDegreeOfOpeningSetting";
	public static final String PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOneTimeOpeningSpeedSetting";
	public static final String PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING = EchonetOntology.NAMESPACE + "hasOneTimeClosingSpeedSetting";
	public OperationModeSettingValue getOneTimeClosingSpeedSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING);	
	}
	public void setOneTimeClosingSpeedSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING, msg);	
	}
	public OperationModeSettingValue getOneTimeOpeningSpeedSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING);	
	}
	public void setOneTimeOpeningSpeedSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING, msg);	
	}
	public ThresholdLevelValue getSlitDegreeOfOpeningSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING);	
	}
	public void setSlitDegreeOfOpeningSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING, msg);	
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
	public MeasuredValue getBlindAngleSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_BLIND_ANGLE_SETTING);	
	}
	public void setBlindAngleSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_BLIND_ANGLE_SETTING, msg);	
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
	public MeasuredValue getOperationTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_OPERATION_TIME);	
	}
	public void setOperationTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_TIME, msg);	
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
	

	public ElectricShutter() {
		super();
	}
	public ElectricShutter(String uri) {
		super(uri);
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
