package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MethodMountedValue extends ManagedIndividual{

	protected MethodMountedValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MethodMountedValue";
	
	public static final int MOUNTED = 0;
	public static final int NOT_MOUNTED = 1;
	private static final String[] names = { "Mounted", "NotMounted"};
	
	public static final MethodMountedValue Mounted = new MethodMountedValue(MOUNTED);
	public static final MethodMountedValue NotMounted = new MethodMountedValue(NOT_MOUNTED);
	private int order;

	private MethodMountedValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static MethodMountedValue getMethodMountedValueByOrder(int order) {
		switch (order) {
		case MOUNTED:
			return Mounted;
		case NOT_MOUNTED:
			return NotMounted;
		default:
			return null;
		}
	}

	public static final MethodMountedValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = MOUNTED; i <= NOT_MOUNTED; i++)
			if (names[i].equals(name))
				return getMethodMountedValueByOrder(i);
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
