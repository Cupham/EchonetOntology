package org.universAAL.ontology.echonet.sensorRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class ElectricEnergySensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricEnergySensor";
	public static final String PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "ElectricEnergySensorHasCummulativeAmountOfElectriceEnergy";
	public static final String PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "ElectricEnergySensorHasMediumCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "EElectricEnergySensorHasSmallCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY = 
			EchonetOntology.NAMESPACE + "ElectricEnergySensorHasLargeCapacitySensorInstantaneousElectricEnergy";
	public static final String PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG = 
			EchonetOntology.NAMESPACE + "ElectricEnergySensorHasCummulativeAmountOfElectriceEnergyMeasurementLog";
	public static final String PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE = 
			EchonetOntology.NAMESPACE + "ElectricEnergySensorHasEffectiveMeasuredValue";
	public ElectricEnergySensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public ElectricEnergySensor(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
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
	
	public MeasuredValue getCummulativeAmountOfElectriceEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY);	
	}
	public void setCummulativeAmountOfElectriceEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getMediumCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setMediumCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getSmallCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setSmallCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getLargeCapacitySensorInstantaneousElectricEnergy() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY);	
	}
	public void setLargeCapacitySensorInstantaneousElectricEnergy(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,msg);	
	}
	public MeasuredValue getCummulativeAmountOfElectriceEnergyMeasurementLog() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG);	
	}
	public void setCummulativeAmountOfElectriceEnergyMeasurementLog(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_CUMMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG,msg);	
	}
	public MeasuredValue getEffectiveMeasuredValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE);	
	}
	public void setEffectiveMeasuredValue(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE,msg);	
	}
	

}
