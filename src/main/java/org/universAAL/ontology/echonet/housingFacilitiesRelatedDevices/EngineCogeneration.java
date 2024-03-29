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
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class EngineCogeneration extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EngineCogeneration";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER= EchonetOntology.NAMESPACE + "hasWaterTemperatureInWaterHeater";
	public static final String PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "hasRatedPowerGenerationOutput";
	public static final String PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK = EchonetOntology.NAMESPACE + "hasHeatingValueOfHotWaterTank";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousPowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "hasMeasuredCumulativePowerGenerationOutput";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT = EchonetOntology.NAMESPACE + "resetMeasuredCumulativePowerGenerationOutput";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredInstantaneousGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "hasMeasuredCumulativeGasConsumption";
	public static final String PROPERTY_RESET_MEASURED_CUMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "resetMeasuredCumulativeGasConsumption";
	public static final String PROPERTY_HAS_POWER_GENERATION_SETTING = EchonetOntology.NAMESPACE + "hasPowerGenerationSetting";
	public static final String PROPERTY_HAS_POWER_GENERATION_STATUS= EchonetOntology.NAMESPACE + "hasPowerGenerationStatus";
	public static final String PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasInHouseMeasuredInstantaneousPowerConsumption";
	public static final String PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasInHouseMeasuredCumulativePowerConsumption";
	public static final String PROPERTY_RESET_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "resetInHouseMeasuredCumulativePowerConsumption";
	public static final String PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE = EchonetOntology.NAMESPACE + "hasSystemInterconnectType";
	public static final String PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT = EchonetOntology.NAMESPACE + "hasMeasuredRemainingHotWaterAmount";
	public static final String PROPERTY_HAS_TANK_CAPACITY = EchonetOntology.NAMESPACE + "hasTankCapacity";
		
	public MeasuredValue getTankCapacity() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_TANK_CAPACITY);	
	}
	public void setTankCapacity(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TANK_CAPACITY, msg);	
	}
	public MeasuredValue getMeasuredRemainingHotWaterAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT);	
	}
	public void setMeasuredRemainingHotWaterAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REMAINING_HOT_WATER_AMOUNT, msg);	
	}
	public OperationFunctionSettingValue getSystemInterconnectType() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE);	
	}
	public void setSystemInterconnectType(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE, msg);	
	}
	public MeasuredValue getInHouseMeasuredCumulativePowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION);	
	}
	public void setInHouseMeasuredCumulativePowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_CUMULATIVE_POWER_CONSUMPTION, msg);	
	}
	public MeasuredValue getInHouseMeasuredInstantaneousPowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION);	
	}
	public void setInHouseMeasuredInstantaneousPowerConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_IN_HOUSE_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, msg);	
	}
	public OperationStateSettingValue getPowerGenerationStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_POWER_GENERATION_STATUS);	
	}
	public void setPowerGenerationStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_STATUS, msg);	
	}
	public OperationStatusValue getPowerGenerationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_POWER_GENERATION_SETTING);	
	}
	public void setPowerGenerationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_GENERATION_SETTING, msg);	
	}
	public MeasuredValue getMeasuredCumulativeGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCumulativeGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION);	
	}
	public void setMeasuredInstantaneousGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_GAS_CONSUMPTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativePowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredCumulativePowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getMeasuredInstantaneousPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT);	
	}
	public void setMeasuredInstantaneousPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getHeatingValueOfHotWaterTank() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK);	
	}
	public void setHeatingValueOfHotWaterTank(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_VALUE_OF_HOT_WATER_STORAGE_TANK, msg);	
	}
	public MeasuredValue getRatedPowerGenerationOutput() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT);	
	}
	public void setRatedPowerGenerationOutput(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_GENERATION_OUTPUT, msg);	
	}
	public MeasuredValue getWaterTemperatureInWaterHeater() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER);	
	}
	public void setWaterTemperatureInWaterHeater(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_IN_WATER_HEATER, msg);	
	}

	
	public EngineCogeneration() {
		super();
	}
	public EngineCogeneration(String uri) {
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
