package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class HumidifyingLevelValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "HumidifyingLevelValue";
	private int order;
	public static final int AUTOMATIC = 0;
	public static final int CONTINOUS_OPERATION = 1;
	public static final int INTERMITTENT_OPERATION = 2;
	public static final int HUMIDIFYING_LEVEL1 = 3;
	public static final int HUMIDIFYING_LEVEL2 = 4;
	public static final int HUMIDIFYING_LEVEL3 = 5;
	public static final int HUMIDIFYING_LEVEL4 = 6;
	
	private static final String[] names = {"Automatic", "ContinousOperation", "IntermitentOperation","HumidifyingLevel1",
										   "HumidifyingLevel1","HumidifyingLevel2","HumidifyingLevel3","HumidifyingLevel4"};
	
	public static final HumidifyingLevelValue Automatic = new HumidifyingLevelValue(AUTOMATIC);
	public static final HumidifyingLevelValue ContinousOperation = new HumidifyingLevelValue(CONTINOUS_OPERATION);
	public static final HumidifyingLevelValue IntermitentOperation = new HumidifyingLevelValue(INTERMITTENT_OPERATION);
	public static final HumidifyingLevelValue HumidifyingLevel1 = new HumidifyingLevelValue(HUMIDIFYING_LEVEL1);
	public static final HumidifyingLevelValue HumidifyingLevel2 = new HumidifyingLevelValue(HUMIDIFYING_LEVEL2);
	public static final HumidifyingLevelValue HumidifyingLevel3 = new HumidifyingLevelValue(HUMIDIFYING_LEVEL3);
	public static final HumidifyingLevelValue HumidifyingLevel4 = new HumidifyingLevelValue(HUMIDIFYING_LEVEL4);

	private HumidifyingLevelValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static HumidifyingLevelValue getHumidifyingLevelValueByOrder(int order) {
		switch (order) {
		case AUTOMATIC:
			return Automatic;
		case CONTINOUS_OPERATION:
			return ContinousOperation;
		case INTERMITTENT_OPERATION:
			return IntermitentOperation;
		case HUMIDIFYING_LEVEL1:
			return HumidifyingLevel1;
		case HUMIDIFYING_LEVEL2:
			return HumidifyingLevel2;
		case HUMIDIFYING_LEVEL3:
			return HumidifyingLevel3;
		case HUMIDIFYING_LEVEL4:
			return HumidifyingLevel4;
		default:
			return null;
		}
	}

	public static final HumidifyingLevelValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = AUTOMATIC; i <= HUMIDIFYING_LEVEL4; i++)
			if (names[i].equals(name))
				return getHumidifyingLevelValueByOrder(i);
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
