package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MeasurementUnit;

public class HighVoltageSmartElectricEnergy extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HighVoltageSmartElectricEnergy";
	public static final String PROPERTY_HAS_COEFFICIENT= EchonetOntology.NAMESPACE + "HasCoefficient";
	public static final String PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT= EchonetOntology.NAMESPACE + "HasMultiplyingFactorForCoefficient";
	public static final String PROPERTY_HAS_FIXED_DAY= EchonetOntology.NAMESPACE + "HasFixedDay";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeActiveElectricEnergyAmount";
	public static final String PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME = EchonetOntology.NAMESPACE + "HasCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + "HasCumulativeActiveElectricEnergyForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "HasNumberOfEffectiveDigitsForCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeActiveElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeActiveElectricEnergyAmountHistoricalData";
	public static final String PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND = EchonetOntology.NAMESPACE + "HasMonthlyMaximumElectricPowerDemand";
	public static final String PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND = EchonetOntology.NAMESPACE + "HasCumulativeMaximumElectricPowerDemand";
	public static final String PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME = EchonetOntology.NAMESPACE + "HasElectricPowerDemandAtFixedTime";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND= EchonetOntology.NAMESPACE + "HasNumberOfEffectiveDigitsForElectricPowerDemand";
	public static final String PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT= EchonetOntology.NAMESPACE + "HasElectricPowerDemandUnit";
	public static final String PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA= EchonetOntology.NAMESPACE + "HasMeasuredElectricPowerDemandHistoricalData";
	public static final String PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT = EchonetOntology.NAMESPACE + "HasCumulativeMaximumElectricPowerDemandUnit";
	public static final String PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + 
										"HasMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT = EchonetOntology.NAMESPACE + 
										"HasNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT = EchonetOntology.NAMESPACE + 
										"HasMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + 
										"HasMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData";

	public MeasuredValue getMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionForPoweerFactorMeasurementHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT_HISTORICAL_DATA, msg);	
	}
	public MeasurementUnit getMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionAmountUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setNumberOfEffectiveDigitsForMeasuredCumulativeReactiveElectricPowerConsumptionForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredCumulativeReactiveElectricPowerConsumptionAtFixedTimeForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_REACTIVE_ELECTRIC_POWER_CONSUMPTION_AT_FIXED_TIME_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasuredValue getMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setMeasuredReactiveElectricPowerConsumptionForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_REACTIVE_ELECTRIC_POWER_CONSUMPTION_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasurementUnit getCumulativeMaximumElectricPowerDemandUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT);	
	}
	public void setCumulativeMaximumElectricPowerDemandUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND_UNIT, msg);	
	}
	public MeasuredValue getMeasuredElectricPowerDemandHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA);	
	}
	public void setMeasuredElectricPowerDemandHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_ELECTRIC_POWER_DEMAND_HISTORICAL_DATA, msg);	
	}
	public MeasurementUnit getElectricPowerDemandUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT);	
	}
	public void setElectricPowerDemandUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_UNIT, msg);	
	}
	public MeasuredValue getNumberOfEffectiveDigitsForElectricPowerDemand() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND);	
	}
	public void setNumberOfEffectiveDigitsForElectricPowerDemand(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_ELECTRIC_POWER_DEMAND, msg);	
	}
	public MeasuredValue getElectricPowerDemandAtFixedTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME);	
	}
	public void setElectricPowerDemandAtFixedTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ELECTRIC_POWER_DEMAND_AT_FIXED_TIME, msg);	
	}
	public MeasuredValue getCumulativeMaximumElectricPowerDemand() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setCumulativeMaximumElectricPowerDemand(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public MeasuredValue getMonthlyMaximumElectricPowerDemand() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND);	
	}
	public void setMonthlyMaximumElectricPowerDemand(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MONTHLY_MAXIMUM_ELECTRIC_POWER_DEMAND, msg);	
	}
	public MeasuredValue getMeasuredCumulativeActiveElectricEnergyAmountHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmountHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA, msg);	
	}
	public MeasurementUnit getMeasuredCumulativeActiveElectricEnergyAmountUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmountUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForCumulativeElectricEnergy() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setNumberOfEffectiveDigitsForCumulativeElectricEnergy(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getCumulativeActiveElectricEnergyForPowerFactorMeasurement() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT);	
	}
	public void setCumulativeActiveElectricEnergyForPowerFactorMeasurement(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_FOR_POWER_FACTOR_MEASUREMENT, msg);	
	}
	public MeasuredValue getCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME);	
	}
	public void setCumulativeActiveElectricEnergyAmountMeasuredAtFixedTime(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME, msg);	
	}
	public MeasuredValue getMeasuredCumulativeActiveElectricEnergyAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT);	
	}
	public void setMeasuredCumulativeActiveElectricEnergyAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ACTIVE_ELECTRIC_ENERGY_AMOUNT, msg);	
	}
	public MeasuredValue getDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergyHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_HISTORICAL_DATA, msg);	
	}
	public Date getFixedDay() {
		return (Date) getProperty(PROPERTY_HAS_FIXED_DAY);	
	}
	public void setFixedDay(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FIXED_DAY, msg);	
	}
	public MeasurementUnit getMultiplyingFactorForCoefficient() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT);	
	}
	public void setMultiplyingFactorForCoefficient(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MULTIPLYING_FACTOR_FOR_COEFFICIENT, msg);	
	}
	public MeasuredValue getCoefficient() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COEFFICIENT, msg);	
	}

	
	public HighVoltageSmartElectricEnergy() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public HighVoltageSmartElectricEnergy(String uri) {
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
