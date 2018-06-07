package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class ThermostatSettingOverrideFunctionValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "ThermostatSettingOverrideFunctionValue";
	private int order;
	public static final int NORMAL_SETTING = 0;
	public static final int THERMOSTAT_OVERRIDE_FUNCTION_ON = 1;
	public static final int THERMOSTAT_OVERRIDE_FUNCTION_OFF = 2;
	
	private static final String[] names = {"NormalSetting", "ThermostatOverrideFunctionON", "ThermostatOverrideFunctionOFF"};
	
	public static final ThermostatSettingOverrideFunctionValue NormalSetting = new ThermostatSettingOverrideFunctionValue(NORMAL_SETTING);
	public static final ThermostatSettingOverrideFunctionValue ThermostatOverrideFunctionON = new ThermostatSettingOverrideFunctionValue(THERMOSTAT_OVERRIDE_FUNCTION_ON);
	public static final ThermostatSettingOverrideFunctionValue ThermostatOverrideFunctionOFF = new ThermostatSettingOverrideFunctionValue(THERMOSTAT_OVERRIDE_FUNCTION_OFF);
	private ThermostatSettingOverrideFunctionValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ThermostatSettingOverrideFunctionValue getThermostatSettingOverrideFunctionValueByOrder(int order) {
		switch (order) {
		case NORMAL_SETTING:
			return NormalSetting;
		case THERMOSTAT_OVERRIDE_FUNCTION_ON:
			return ThermostatOverrideFunctionON;
		case THERMOSTAT_OVERRIDE_FUNCTION_OFF:
			return ThermostatOverrideFunctionOFF;
		default:
			return null;
		}
	}

	public static final ThermostatSettingOverrideFunctionValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NORMAL_SETTING; i <= THERMOSTAT_OVERRIDE_FUNCTION_OFF; i++)
			if (names[i].equals(name))
				return getThermostatSettingOverrideFunctionValueByOrder(i);
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
