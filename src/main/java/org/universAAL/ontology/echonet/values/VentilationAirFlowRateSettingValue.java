package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class VentilationAirFlowRateSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "VentilationAirFlowRateSettingValue";
	private int order;
	public static final int VENTILATION_AUTOMATIC_CONTROL = 0;
	public static final int VENTILATION_AIR_FLOW_RATE_1 = 1;
	public static final int VENTILATION_AIR_FLOW_RATE_2 = 2;
	public static final int VENTILATION_AIR_FLOW_RATE_3 = 3;
	public static final int VENTILATION_AIR_FLOW_RATE_4 = 4;
	public static final int VENTILATION_AIR_FLOW_RATE_5 = 5;
	public static final int VENTILATION_AIR_FLOW_RATE_6 = 6;
	public static final int VENTILATION_AIR_FLOW_RATE_7 = 7;
	public static final int VENTILATION_AIR_FLOW_RATE_8 = 8;
	private static final String[] names = {"AutomaticVentilationAirFlowRateControl", "VentilationAirFlowRate1", "VentilationAirFlowRate2",
										   "VentilationAirFlowRate3", "VentilationAirFlowRate4", "VentilationAirFlowRate5", 
										   "VentilationAirFlowRate6", "VentilationAirFlowRate7", "VentilationAirFlowRate8"};
	
	public static final VentilationAirFlowRateSettingValue AutomaticVentilationAirFlowRateControl = new VentilationAirFlowRateSettingValue(VENTILATION_AUTOMATIC_CONTROL);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate1 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_1);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate2 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_2);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate3 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_3);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate4 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_4);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate5 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_5);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate6 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_6);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate7 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_7);
	public static final VentilationAirFlowRateSettingValue VentilationAirFlowRate8 = new VentilationAirFlowRateSettingValue(VENTILATION_AIR_FLOW_RATE_8);

	private VentilationAirFlowRateSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static VentilationAirFlowRateSettingValue getVentilationAirFlowRateSettingValueByOrder(int order) {
		switch (order) {
		case VENTILATION_AUTOMATIC_CONTROL:
			return AutomaticVentilationAirFlowRateControl;
		case VENTILATION_AIR_FLOW_RATE_1:
			return VentilationAirFlowRate1;
		case VENTILATION_AIR_FLOW_RATE_2:
			return VentilationAirFlowRate2;
		case VENTILATION_AIR_FLOW_RATE_3:
			return VentilationAirFlowRate3;
		case VENTILATION_AIR_FLOW_RATE_4:
			return VentilationAirFlowRate4;
		case VENTILATION_AIR_FLOW_RATE_5:
			return VentilationAirFlowRate5;
		case VENTILATION_AIR_FLOW_RATE_6:
			return VentilationAirFlowRate6;
		case VENTILATION_AIR_FLOW_RATE_7:
			return VentilationAirFlowRate7;
		case VENTILATION_AIR_FLOW_RATE_8:
			return VentilationAirFlowRate8;
		default:
			return null;
		}
	}

	public static final VentilationAirFlowRateSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = VENTILATION_AUTOMATIC_CONTROL; i <= VENTILATION_AIR_FLOW_RATE_8; i++)
			if (names[i].equals(name))
				return getVentilationAirFlowRateSettingValueByOrder(i);
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
