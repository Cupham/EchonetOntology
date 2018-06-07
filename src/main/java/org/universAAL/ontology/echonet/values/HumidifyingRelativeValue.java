package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class HumidifyingRelativeValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "HumidifyingRelativeValue";
	private int order;
	public static final int AUTOMATIC = 0;
	public static final int CONTINOUS_OPERATION = 1;
	public static final int INTERMITTENT_OPERATION = 2;
	public static final int OTHER = 3;
	
	private static final String[] names = {"Automatic", "ContinousOperation", "IntermitentOperation","Other"};
	
	public static final HumidifyingRelativeValue Automatic = new HumidifyingRelativeValue(AUTOMATIC);
	public static final HumidifyingRelativeValue ContinousOperation = new HumidifyingRelativeValue(CONTINOUS_OPERATION);
	public static final HumidifyingRelativeValue IntermitentOperation = new HumidifyingRelativeValue(INTERMITTENT_OPERATION);
	public static final HumidifyingRelativeValue Other = new HumidifyingRelativeValue(OTHER);

	private HumidifyingRelativeValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static HumidifyingRelativeValue getHumidifyingRelativeValueByOrder(int order) {
		switch (order) {
		case AUTOMATIC:
			return Automatic;
		case CONTINOUS_OPERATION:
			return ContinousOperation;
		case INTERMITTENT_OPERATION:
			return IntermitentOperation;
		case OTHER:
			return Other;
		default:
			return null;
		}
	}

	public static final HumidifyingRelativeValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = AUTOMATIC; i <= OTHER; i++)
			if (names[i].equals(name))
				return getHumidifyingRelativeValueByOrder(i);
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
