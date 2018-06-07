package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class AirFlowHorizontalDirectionSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "AirFlowVerticalDirectionSettingValue";
	private int order;
	public static final int RIGHTWARD = 0;
	public static final int LEFTWARD = 1;
	public static final int CENTRAL = 2;
	public static final int LEFT_CENTER = 3;
	public static final int RIGHT_CENTER = 4;
	private static final String[] names = {"Rightward", "Leftward", "Central", "LeftCenter", "RightCenter"};
	
	public static final AirFlowHorizontalDirectionSettingValue Rightward = new AirFlowHorizontalDirectionSettingValue(RIGHTWARD);
	public static final AirFlowHorizontalDirectionSettingValue Leftward = new AirFlowHorizontalDirectionSettingValue(LEFTWARD);
	public static final AirFlowHorizontalDirectionSettingValue Central = new AirFlowHorizontalDirectionSettingValue(CENTRAL);
	public static final AirFlowHorizontalDirectionSettingValue LeftCenter = new AirFlowHorizontalDirectionSettingValue(LEFT_CENTER);
	public static final AirFlowHorizontalDirectionSettingValue RightCenter = new AirFlowHorizontalDirectionSettingValue(RIGHT_CENTER);

	private AirFlowHorizontalDirectionSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static AirFlowHorizontalDirectionSettingValue getAirFlowHorizontalDirectionSettingValueByOrder(int order) {
		switch (order) {
		case RIGHTWARD:
			return Rightward;
		case LEFTWARD:
			return Leftward;
		case CENTRAL:
			return Central;
		case LEFT_CENTER:
			return LeftCenter;
		case RIGHT_CENTER:
			return RightCenter;
		default:
			return null;
		}
	}

	public static final AirFlowHorizontalDirectionSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = RIGHTWARD; i <= RIGHT_CENTER; i++)
			if (names[i].equals(name))
				return getAirFlowHorizontalDirectionSettingValueByOrder(i);
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
