package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class WattHourMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WattHourMetter";
	
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeElectricEnergyAmount";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "HasCummulativeElectricEnergyAmountUnit";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1 = EchonetOntology.NAMESPACE + "HasCummulativeElectricEnergyMeasurementLog1";
	public static final String PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2 = EchonetOntology.NAMESPACE + "HasCummulativeElectricEnergyMeasurementLog2";

	public MeasuredValue getCummulativeElectricEnergyMeasurementLog2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2);	
	}
	public void setCummulativeElectricEnergyMeasurementLog2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_2, msg);	
	}
	public MeasuredValue getCummulativeElectricEnergyMeasurementLog1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1);	
	}
	public void setCummulativeElectricEnergyMeasurementLog1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_MEASUREMENT_LOG_1, msg);	
	}

	public String getCummulativeElectricEnergyAmountUnit() {
		return (String) getProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT);	
	}
	public void setCummulativeElectricEnergyAmountUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeElectricEnergyAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT);	
	}
	public void setMeasuredCummulativeElectricEnergyAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_AMOUNT, msg);	
	}

	
	public WattHourMeter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public WattHourMeter(String uri) {
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
