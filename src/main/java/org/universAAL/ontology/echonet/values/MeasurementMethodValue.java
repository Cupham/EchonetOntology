package org.universAAL.ontology.echonet.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MeasurementMethodValue extends ManagedIndividual{

	protected MeasurementMethodValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OccurenceStatus";
	
	public static final int NODE_UNIT = 0;
	public static final int CLASS_UNIT = 1;
	public static final int INSTANCE_UNIT = 2;
	private static final String[] names = {"NodeUnit", "ClassUnit","InstanceUnit"};
	
	public static final MeasurementMethodValue NodeUnit = new MeasurementMethodValue(NODE_UNIT);
	public static final MeasurementMethodValue ClassUnit = new MeasurementMethodValue(CLASS_UNIT);
	public static final MeasurementMethodValue InstanceUnit = new MeasurementMethodValue(INSTANCE_UNIT);
	private int order;

	private MeasurementMethodValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static MeasurementMethodValue getOccurenceStatusByOrder(int order) {
		switch (order) {
		case NODE_UNIT:
			return NodeUnit;
		case CLASS_UNIT:
			return ClassUnit;
		case INSTANCE_UNIT:
			return InstanceUnit;
		default:
			return null;
		}
	}

	public static final MeasurementMethodValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NODE_UNIT; i <= INSTANCE_UNIT; i++)
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
