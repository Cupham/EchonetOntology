package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class ValueCategory extends ManagedIndividual{

	public static final String MY_URI = EchonetOntology.NAMESPACE + "ValueCategory";
	private int order;
	public static final int SI_VALUE = 1;
	public static final int ILLUMINANCE_LEVEL_VALUE = 2;
	public static final int TEMPERATURE_VALUE = 3;
	public static final int PERCENTAGE_VALUE = 4;
	public static final int WATER_LEVEL_VALUE = 5;
	public static final int CONCENTRATION_VALUE = 6;
	public static final int PRESSURE_VALUE = 7;
	public static final int AIR_SPEED_VALUE = 8;
	public static final int ELECTRIC_ENERGY_VALUE = 9;
	public static final int VOLTAGE_VALUE = 10;
	public static final int CURRENT_VALUE = 11;
	public static final int FLOW_RATE_VALUE = 12;
	public static final int TIME_VALUE = 13;
	public static final int ANGLE_VALUE = 14;
	public static final int FIRST_AID_OCCURENCE_STATUS_NOT_FOUND = 100;
	private static final String[] names = { "SIValue","IlluminanceLevelValue","TemperatureValue","PercentageValue",
											"WaterLevelValue","ConcentrationValue","PressureValue","AirSpeedValue",
											"ElectricEnergyValue","VoltageValue","CurrentValue", "FlowRateValue",
											"TimeValue","AngleValue"};
	//in Kine
	public static final ValueCategory SIValue = new ValueCategory(SI_VALUE);
	// in Lux/kLux
	public static final ValueCategory IlluminanceLevelValue = new ValueCategory(ILLUMINANCE_LEVEL_VALUE);
	// in degree celcius
	public static final ValueCategory TemperatureValue = new ValueCategory(TEMPERATURE_VALUE);
	// in %
	public static final ValueCategory PercentageValue = new ValueCategory(PERCENTAGE_VALUE);
	//in cm
	public static final ValueCategory WaterLevelValue = new ValueCategory(WATER_LEVEL_VALUE);
	// in ppm
	public static final ValueCategory ConcentrationValue = new ValueCategory(CONCENTRATION_VALUE);
	// in Pa/ hPa
	public static final ValueCategory PressureValue = new ValueCategory(PRESSURE_VALUE);
	// in m/sec
	public static final ValueCategory AirSpeedValue = new ValueCategory(AIR_SPEED_VALUE);
	// in W, kW, kWh
	public static final ValueCategory ElectricEnergyValue = new ValueCategory(ELECTRIC_ENERGY_VALUE);
	// in V
	public static final ValueCategory VoltageValue = new ValueCategory(VOLTAGE_VALUE);
	// in A, mA
	public static final ValueCategory CurrentValue = new ValueCategory(CURRENT_VALUE);
	// in cm3/min
	public static final ValueCategory FlowRateValue = new ValueCategory(FLOW_RATE_VALUE);
	// in ms
	public static final ValueCategory TimeValue = new ValueCategory(TIME_VALUE);
	// in angle degree
	public static final ValueCategory AngleValue = new ValueCategory(ANGLE_VALUE);

	private ValueCategory(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ValueCategory getValueTypeByOrder(int order) {
		switch (order) {
		case SI_VALUE:
			return SIValue;
		case ILLUMINANCE_LEVEL_VALUE:
			return IlluminanceLevelValue;
		case TEMPERATURE_VALUE:
			return TemperatureValue;
		case PERCENTAGE_VALUE:
			return PercentageValue;
		case WATER_LEVEL_VALUE:
			return WaterLevelValue;
		case CONCENTRATION_VALUE:
			return ConcentrationValue;
		case PRESSURE_VALUE:
			return PressureValue;
		case AIR_SPEED_VALUE:
			return AirSpeedValue;
		case ELECTRIC_ENERGY_VALUE:
			return ElectricEnergyValue;	
		case VOLTAGE_VALUE:
			return VoltageValue;	
		case CURRENT_VALUE:
			return CurrentValue;	
		case FLOW_RATE_VALUE:
			return FlowRateValue;
		case TIME_VALUE:
			return TimeValue;
		case ANGLE_VALUE:
			return AngleValue;
		default:
			return null;
		}
	}

	public static final ValueCategory valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = SI_VALUE; i <= FIRST_AID_OCCURENCE_STATUS_NOT_FOUND; i++)
			if (names[i].equals(name))
				return getValueTypeByOrder(i);
		return null;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
