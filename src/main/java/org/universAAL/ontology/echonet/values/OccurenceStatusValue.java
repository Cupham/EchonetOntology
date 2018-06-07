package org.universAAL.ontology.echonet.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class OccurenceStatusValue extends ManagedIndividual{

	protected OccurenceStatusValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OccurenceStatus";
	
	public static final int FOUND = 0;
	public static final int NOT_FOUND = 1;
	private static final String[] names = { "OccurenceStatusFound", "OccurenceStatusNotFound"};
	
	public static final OccurenceStatusValue OccurenceStatusFound = new OccurenceStatusValue(FOUND);
	public static final OccurenceStatusValue OccurenceStatusNotFound = new OccurenceStatusValue(NOT_FOUND);
	private int order;

	private OccurenceStatusValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OccurenceStatusValue getOccurenceStatusByOrder(int order) {
		switch (order) {
		case FOUND:
			return OccurenceStatusFound;
		case NOT_FOUND:
			return OccurenceStatusNotFound;
		default:
			return null;
		}
	}

	public static final OccurenceStatusValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = FOUND; i <= NOT_FOUND; i++)
			if (names[i].equals(name))
				return getOccurenceStatusByOrder(i);
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
