package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class PowerConsumptionRange extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "PowerConsumptionRange";
	private int order;
	public static final int UNDEFINED = 0;
	public static final int RANGE_UP_TO_50W = 1;
	public static final int RANGE_50W_100W = 2;
	public static final int RANGE_100W_150W = 3;
	public static final int RANGE_150W_200W = 4;
	public static final int RANGE_OVER_200W = 5;
	private static final String[] names = {"Undefined", "RangeUpTo50W","Range50W_100W", "Range100W_150W", "Range150W_200W", "RangeOver_200W"};
	
	public static final PowerConsumptionRange Undefined = new PowerConsumptionRange(UNDEFINED);
	public static final PowerConsumptionRange RangeUpTo50W = new PowerConsumptionRange(RANGE_UP_TO_50W);
	public static final PowerConsumptionRange Range50W_100W = new PowerConsumptionRange(RANGE_50W_100W);
	public static final PowerConsumptionRange Range100W_150W = new PowerConsumptionRange(RANGE_100W_150W);
	public static final PowerConsumptionRange Range150W_200W = new PowerConsumptionRange(RANGE_150W_200W);
	public static final PowerConsumptionRange RangeOver_200W = new PowerConsumptionRange(RANGE_OVER_200W);

	private PowerConsumptionRange(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static PowerConsumptionRange getActivityMountLevelByOrder(int order) {
		switch (order) {
		case UNDEFINED:
			return Undefined;
		case RANGE_UP_TO_50W:
			return RangeUpTo50W;
		case RANGE_50W_100W:
			return Range50W_100W;
		case RANGE_100W_150W:
			return Range100W_150W;
		case RANGE_150W_200W:
			return Range150W_200W;
		case RANGE_OVER_200W:
			return RangeOver_200W;
		default:
			return null;
		}
	}

	public static final PowerConsumptionRange valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = UNDEFINED; i <= RANGE_OVER_200W; i++)
			if (names[i].equals(name))
				return getActivityMountLevelByOrder(i);
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
