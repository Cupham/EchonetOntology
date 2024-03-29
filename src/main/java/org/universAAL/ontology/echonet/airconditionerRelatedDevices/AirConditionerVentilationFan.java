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
package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
public class AirConditionerVentilationFan extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirConditionerVentilationFan";
	public static final String PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "hasSettingRoomHumidity";
	public static final String PROPERTY_HAS_RELATIVE_HUMIDITY_IN_VENTILATION_MODE = EchonetOntology.NAMESPACE + "hasRelativeHumidityInAutoVentilationMode";
	public static final String PROPERTY_HAS_VENTILATION_AUTO_SETTING = EchonetOntology.NAMESPACE + "hasVentilationAutoSetting";
	public static final String PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY = EchonetOntology.NAMESPACE + "hasMeasuredRoomHumidity";
	public static final String PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE = EchonetOntology.NAMESPACE + "hasValueOfVentilationAirFlowRate";
	public static final String PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasHeatExchangerOperationSetting";
	public static final String PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION = EchonetOntology.NAMESPACE + "hasMeasuredValueOfCO2Concentration";
	public static final String PROPERTY_HAS_SMOKE_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasSmokeDetectionStatus";
	public static final String PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasAirPollutionDetectionStatus";
	
	public OccurenceStatusValue getAirPollutionDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS);	
	}
	public void setAirPollutionDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,msg);	
	}
	public OccurenceStatusValue getSmokeDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS);	
	}
	public void setSmokeDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS,msg);	
	}
	public MeasuredValue getSettingRoomHumidity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY);	
	}
	public void setSettingRoomHumidity(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY,msg);	
	}
	public MeasuredValue getCO2ConcentrationMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION);	
	}
	public void setCO2ConcentrationMeasuredValue(MeasuredValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,msg);	
	}
	public OperationStatusValue getHeatExchangerOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING);
	}
	public void setHeatExchangerOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING, msg);
	}
	public ThresholdLevelValue getVentilationAirFlowRate() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE);
	}
	public void setVentilationAirFlowRate(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE, msg);
	}
	public MeasuredValue getMeasuredRoomHumidity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY);	
	}
	public void setMeasuredRoomHumidity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY, msg);	
	}
	public OperationStatusValue getVentilationAutoSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING);
	}
	public void setVentilationAutoSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VENTILATION_AUTO_SETTING, msg);
	}
	public MeasuredValue setRelativeHumidityInAutoVentilationMode() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RELATIVE_HUMIDITY_IN_VENTILATION_MODE);	
	}
	public void setRelativeHumidityInAutoVentilationMode(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RELATIVE_HUMIDITY_IN_VENTILATION_MODE, msg);	
	}
	public AirConditionerVentilationFan() {
		super();
	}
	public AirConditionerVentilationFan(String uri) {
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
