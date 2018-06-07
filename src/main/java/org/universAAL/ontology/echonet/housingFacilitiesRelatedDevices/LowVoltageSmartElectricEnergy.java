package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MeasurementUnit;

public class LowVoltageSmartElectricEnergy extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LowVoltageSmartElectricEnergy";
	
	public static final String PROPERTY_HAS_COEFFICIENT= EchonetOntology.NAMESPACE + "HasCoefficient";
	public static final String PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "HasNumberOfEffectiveDigitsForCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmount_NormalDirection";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmount_ReverseDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY = EchonetOntology.NAMESPACE + "HasDayToRetrieveMeasuredCumulativeElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY= EchonetOntology.NAMESPACE + "HasMeasuredInstantanenousAmountOfElectricEnergy";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT= EchonetOntology.NAMESPACE + "HasMeasuredInstantanenousCurrent";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "HasCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection";
	public static final String PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION = EchonetOntology.NAMESPACE + "HasCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_NORMAL_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmountHistoricalData2_NormalDirection";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_REVERSE_DIRECTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeElectricEnergyAmountHistoricalData2_ReversedDirection";
	public static final String PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2 = EchonetOntology.NAMESPACE + "HasDayToRetrieveMeasuredCumulativeElectricEnergy2";

	public MeasuredValue getDayToRetrieveMeasuredCumulativeElectricEnergy2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_2, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData2_ReversedDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData2_ReversedDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData2_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData2_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_2_NORMAL_DIRECTION, msg);	
	}
	public MeasuredValue getCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_ReversedDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_REVERSED_DIRECTION, msg);	
	}
	public MeasuredValue getCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION);	
	}
	public void setCumulativeElectricEnergyAmountMeasuredAtFixedTime_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_MEASURED_AT_FIXED_TIME_NORMAL_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousCurrent() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT);	
	}
	public void setMeasuredInstantanenousCurrent(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_CURRENT, msg);	
	}
	public MeasuredValue getMeasuredInstantanenousAmountOfElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setMeasuredInstantanenousAmountOfElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_AMOUNT_OF_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getDayToRetrieveMeasuredCumulativeElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setDayToRetrieveMeasuredCumulativeElectricEnergy(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIVE_MEASURED_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmount_ReverseDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_ReverseDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_REVERSE_DIRECTION, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountHistoricalData_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_HISTORICAL_DATA_NORMAL_DIRECTION, msg);	
	}
	public MeasurementUnit getMeasuredCumulativeElectricEnergyAmountUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setMeasuredCumulativeElectricEnergyAmountUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeElectricEnergyAmount_NormalDirection() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION);	
	}
	public void setMeasuredCumulativeElectricEnergyAmount_NormalDirection(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_ELECTRIC_ENERGY_AMOUNT_NORMAL_DIRECTION, msg);	
	}
	public Integer getNumberOfEffectiveDigitsForCumulativeElectricEnergy() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY);	
	}
	public void setNumberOfEffectiveDigitsForCumulativeElectricEnergy(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_EFFECTIVE_DIGITS_FOR_CUMULATIVE_ELECTRIC_ENERGY, msg);	
	}
	public MeasuredValue getCoefficient() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COEFFICIENT);	
	}
	public void setCoefficient(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COEFFICIENT, msg);	
	}
	
	public LowVoltageSmartElectricEnergy() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public LowVoltageSmartElectricEnergy(String uri) {
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
