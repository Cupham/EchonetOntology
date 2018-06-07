package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class DetectionDirectionValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "DetectionDirectionValue";
	private int order;
	public static final int IN_DIRECTION = 0;
	public static final int IN_RIGHT_DIRECTION = 1;
	public static final int RIGHT_DIRECTION = 2;
	public static final int OUT_RIGHT_DIRECTION = 3;
	public static final int OUT_DIRECTION = 4;
	public static final int OUT_LEFT_DIRECTION = 5;
	public static final int LEFT_DIRECTION = 6;
	public static final int IN_LEFT_DIRECTION = 7;
	private static final String[] names = {"InDirection", "In_RightDirection", "RightDirection", "Out_RightDirection", 
										   "OutDirection", "OutLeftDirection", "LeftDirection", "In_LeftDirection"};
	
	public static final DetectionDirectionValue InDirection = new DetectionDirectionValue(IN_DIRECTION);
	public static final DetectionDirectionValue In_RightDirection = new DetectionDirectionValue(IN_RIGHT_DIRECTION);
	public static final DetectionDirectionValue RightDirection = new DetectionDirectionValue(RIGHT_DIRECTION);
	public static final DetectionDirectionValue Out_RightDirection = new DetectionDirectionValue(OUT_RIGHT_DIRECTION);
	public static final DetectionDirectionValue OutDirection = new DetectionDirectionValue(OUT_DIRECTION);
	public static final DetectionDirectionValue Out_LeftDirection = new DetectionDirectionValue(OUT_LEFT_DIRECTION);
	public static final DetectionDirectionValue LeftDirection = new DetectionDirectionValue(LEFT_DIRECTION);
	public static final DetectionDirectionValue In_LeftDirection = new DetectionDirectionValue(IN_LEFT_DIRECTION);

	private DetectionDirectionValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static DetectionDirectionValue getDetectionDirectionValueByOrder(int order) {
		switch (order) {
		case IN_DIRECTION:
			return InDirection;
		case IN_RIGHT_DIRECTION:
			return In_RightDirection;
		case RIGHT_DIRECTION:
			return RightDirection;
		case OUT_RIGHT_DIRECTION:
			return Out_RightDirection;
		case OUT_DIRECTION:
			return OutDirection;
		case OUT_LEFT_DIRECTION:
			return Out_LeftDirection;
		case LEFT_DIRECTION:
			return LeftDirection;
		case IN_LEFT_DIRECTION:
			return In_LeftDirection;		
		default:
			return null;
		}
	}

	public static final DetectionDirectionValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = IN_DIRECTION; i <= IN_LEFT_DIRECTION; i++)
			if (names[i].equals(name))
				return getDetectionDirectionValueByOrder(i);
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
