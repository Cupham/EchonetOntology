package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class RadiationMethodValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "RadiationMethodValue";
	private int order;
	public static final int WITH_FAN = 0;
	public static final int WITHOUT_FAN = 1;
	private static final String[] names = {"WithFan", "WithoutFan"};
	public static final RadiationMethodValue WithFan = new RadiationMethodValue(WITH_FAN);
	public static final RadiationMethodValue WithoutFan = new RadiationMethodValue(WITHOUT_FAN);

	private RadiationMethodValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static RadiationMethodValue getRadiationMethodValueByOrder(int order) {
		switch (order) {
		case WITH_FAN:
			return WithFan;
		case WITHOUT_FAN:
			return WithoutFan;		
		default:
			return null;
		}
	}

	public static final RadiationMethodValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = WITH_FAN; i <= WITHOUT_FAN; i++)
			if (names[i].equals(name))
				return getRadiationMethodValueByOrder(i);
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
