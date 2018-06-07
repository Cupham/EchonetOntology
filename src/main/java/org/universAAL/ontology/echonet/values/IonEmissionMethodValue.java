package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class IonEmissionMethodValue extends ManagedIndividual {
	public static final String MY_URI = EchonetOntology.NAMESPACE + "IonEmissionMethodValue";
	
	public static final int NEGATIVE_ION_METHOD = 0;
	public static final int CLUSTER_ION_METHOD = 1;
	private static final String[] names = { "NegativeIonMethod", "ClusterIonMethod"};
	
	public static final IonEmissionMethodValue NegativeIonMethod = new IonEmissionMethodValue(NEGATIVE_ION_METHOD);
	public static final IonEmissionMethodValue ClusterIonMethod = new IonEmissionMethodValue(CLUSTER_ION_METHOD);
	private int order;

	private IonEmissionMethodValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static IonEmissionMethodValue getIonEmissionMethodValueByOrder(int order) {
		switch (order) {
		case NEGATIVE_ION_METHOD:
			return NegativeIonMethod;
		case CLUSTER_ION_METHOD:
			return ClusterIonMethod;
		default:
			return null;
		}
	}

	public static final IonEmissionMethodValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NEGATIVE_ION_METHOD; i <= CLUSTER_ION_METHOD; i++)
			if (names[i].equals(name))
				return getIonEmissionMethodValueByOrder(i);
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
