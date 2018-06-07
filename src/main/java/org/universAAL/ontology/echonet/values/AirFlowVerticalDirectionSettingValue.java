package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class AirFlowVerticalDirectionSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "AirFlowVerticalDirectionSettingValue";
	private int order;
	public static final int UPPER_MOST = 0;
	public static final int LOWERMOST = 1;
	public static final int CENTRAL = 2;
	public static final int UPPERMOST_CENTRAL_MIDPOINT = 3;
	public static final int LOWERMOST_CENTRAL_MIDPOINT = 4;
	private static final String[] names = {"Uppermost", "Lowermost", "Central", "Uppermost_CentralMidpoint", "Lowermost_CentralMidpoint"};
	
	public static final AirFlowVerticalDirectionSettingValue Uppermost = new AirFlowVerticalDirectionSettingValue(UPPER_MOST);
	public static final AirFlowVerticalDirectionSettingValue Lowermost = new AirFlowVerticalDirectionSettingValue(LOWERMOST);
	public static final AirFlowVerticalDirectionSettingValue Central = new AirFlowVerticalDirectionSettingValue(CENTRAL);
	public static final AirFlowVerticalDirectionSettingValue Uppermost_CentralMidpoint = new AirFlowVerticalDirectionSettingValue(UPPERMOST_CENTRAL_MIDPOINT);
	public static final AirFlowVerticalDirectionSettingValue Lowermost_CentralMidpoint = new AirFlowVerticalDirectionSettingValue(LOWERMOST_CENTRAL_MIDPOINT);

	private AirFlowVerticalDirectionSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static AirFlowVerticalDirectionSettingValue getAirFlowVerticalDirectionSettingValueByOrder(int order) {
		switch (order) {
		case UPPER_MOST:
			return Uppermost;
		case LOWERMOST:
			return Lowermost;
		case CENTRAL:
			return Central;
		case UPPERMOST_CENTRAL_MIDPOINT:
			return Uppermost_CentralMidpoint;
		case LOWERMOST_CENTRAL_MIDPOINT:
			return Lowermost_CentralMidpoint;
		default:
			return null;
		}
	}

	public static final AirFlowVerticalDirectionSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = UPPER_MOST; i <= LOWERMOST_CENTRAL_MIDPOINT; i++)
			if (names[i].equals(name))
				return getAirFlowVerticalDirectionSettingValueByOrder(i);
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
