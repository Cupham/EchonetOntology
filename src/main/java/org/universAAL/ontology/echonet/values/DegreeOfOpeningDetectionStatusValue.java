package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class DegreeOfOpeningDetectionStatusValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "DetectionDirecDegreeOfOpeningDetectionStatusValuetionValue";
	private int order;
	public static final int CLOSE_DETECTED = 0;
	public static final int DEGREE_OF_OPENING_LEVEL_1 = 1;
	public static final int DEGREE_OF_OPENING_LEVEL_2 = 2;
	public static final int DEGREE_OF_OPENING_LEVEL_3 = 3;
	public static final int DEGREE_OF_OPENING_LEVEL_4 = 4;
	public static final int DEGREE_OF_OPENING_LEVEL_5 = 5;
	public static final int DEGREE_OF_OPENING_LEVEL_6 = 6;
	public static final int DEGREE_OF_OPENING_LEVEL_7 = 7;
	public static final int DEGREE_OF_OPENING_LEVEL_8 = 8;
	public static final int OPEN_DETECTED_LEVEL_UNKNOWN = 9;
	public static final int DEGREE_OF_OPENING_DETECTED = 10;
	public static final int DEGREE_OF_OPENING_NOT_DETECTED = 11;
	private static final String[] names = {"CloseDeteced", "DegreeOfOpeningLevel1", "DegreeOfOpeningLevel2", "DegreeOfOpeningLevel3", 
											"DegreeOfOpeningLevel4", "DegreeOfOpeningLevel5", "DegreeOfOpeningLevel6", "DegreeOfOpeningLevel7",
											"DegreeOfOpeningLevel8", "OpenDetecedLevelUnknown","DegreeOfOpeningDetected","DegreeOfOpeningNotDetected"};
	
	public static final DegreeOfOpeningDetectionStatusValue CloseDeteced = new DegreeOfOpeningDetectionStatusValue(CLOSE_DETECTED);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel1 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_1);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel2 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_2);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel3 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_3);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel4 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_4);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel5 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_5);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel6 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_6);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel7 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_7);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningLevel8 = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_LEVEL_8);
	public static final DegreeOfOpeningDetectionStatusValue OpenDetecedLevelUnknown = new DegreeOfOpeningDetectionStatusValue(OPEN_DETECTED_LEVEL_UNKNOWN);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningDetected = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_DETECTED);
	public static final DegreeOfOpeningDetectionStatusValue DegreeOfOpeningNotDetected = new DegreeOfOpeningDetectionStatusValue(DEGREE_OF_OPENING_NOT_DETECTED);

	private DegreeOfOpeningDetectionStatusValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static DegreeOfOpeningDetectionStatusValue getDegreeOfOpeningDetectionStatusValueByOrder(int order) {
		switch (order) {
		case CLOSE_DETECTED:
			return CloseDeteced;
		case DEGREE_OF_OPENING_LEVEL_1:
			return DegreeOfOpeningLevel1;
		case DEGREE_OF_OPENING_LEVEL_2:
			return DegreeOfOpeningLevel2;
		case DEGREE_OF_OPENING_LEVEL_3:
			return DegreeOfOpeningLevel3;
		case DEGREE_OF_OPENING_LEVEL_4:
			return DegreeOfOpeningLevel4;
		case DEGREE_OF_OPENING_LEVEL_5:
			return DegreeOfOpeningLevel5;
		case DEGREE_OF_OPENING_LEVEL_6:
			return DegreeOfOpeningLevel6;
		case DEGREE_OF_OPENING_LEVEL_7:
			return DegreeOfOpeningLevel7;
		case DEGREE_OF_OPENING_LEVEL_8:
			return DegreeOfOpeningLevel8;
		case OPEN_DETECTED_LEVEL_UNKNOWN:
			return OpenDetecedLevelUnknown;
		case DEGREE_OF_OPENING_DETECTED:
			return DegreeOfOpeningDetected;
		case DEGREE_OF_OPENING_NOT_DETECTED:
			return DegreeOfOpeningNotDetected;
		default:
			return null;
		}
	}

	public static final DegreeOfOpeningDetectionStatusValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = CLOSE_DETECTED; i <= DEGREE_OF_OPENING_NOT_DETECTED; i++)
			if (names[i].equals(name))
				return getDegreeOfOpeningDetectionStatusValueByOrder(i);
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
