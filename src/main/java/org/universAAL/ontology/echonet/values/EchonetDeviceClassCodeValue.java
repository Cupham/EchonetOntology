package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class EchonetDeviceClassCodeValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EchonetDeviceClassCodeValue";
	
	public static final int GAS_LEAKED_SENSOR = 0;
	public static final int CRIME_PREVENTION_SENSOR = 1;
	public static final int EMERGENCY_BUTTON = 2;
	public static final int FIRST_AID_SENSOR = 3;
	public static final int HEALTH_RELATED_DEVICE = 4;
	public static final int MANAGEMENT_OPERATION_RELATED_DEVICE = 5;
	public static final int AUDIOVISUAL_RELATED_DEVICE = 6;
	
	private static final String[] names = {"GasLeakedSensor", "CrimePreventionSensor",
											"EmergencyButton", "FirstAidSensor",
											"health_related_device", "management_operation_related_device",
											"audiovisual_related_device"};
	public static final EchonetDeviceClassCodeValue GasLeakedSensor = new EchonetDeviceClassCodeValue(GAS_LEAKED_SENSOR);
	public static final EchonetDeviceClassCodeValue CrimePreventionSensor = new EchonetDeviceClassCodeValue(CRIME_PREVENTION_SENSOR);
	public static final EchonetDeviceClassCodeValue EmergencyButton = new EchonetDeviceClassCodeValue(EMERGENCY_BUTTON);
	public static final EchonetDeviceClassCodeValue FirstAidSensor = new EchonetDeviceClassCodeValue(FIRST_AID_SENSOR);
	private int order;
	
	private EchonetDeviceClassCodeValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}
	
	public static EchonetDeviceClassCodeValue getEchonetDeviceClassCodeValueOrder(int order) {
		switch (order) {
		case GAS_LEAKED_SENSOR:
			return GasLeakedSensor;
		case CRIME_PREVENTION_SENSOR:
			return CrimePreventionSensor;
		case EMERGENCY_BUTTON:
			return EmergencyButton;
		case FIRST_AID_SENSOR:
			return FirstAidSensor;
		default:
			return null;
		}
	}
	public static final EchonetDeviceClassCodeValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = GAS_LEAKED_SENSOR; i <= AUDIOVISUAL_RELATED_DEVICE; i++)
			if (names[i].equals(name))
				return getEchonetDeviceClassCodeValueOrder(i);
		return null;
	}
	public String getClassURI() {
		return MY_URI;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int ord() {
		return this.order;
	}
	public byte byteValue() {
		switch (order) {
		case GAS_LEAKED_SENSOR:
			return (byte) 0x01;
		case CRIME_PREVENTION_SENSOR:
			return  (byte) 0x02;
		default:
			return 0;
		}
	}
	public String name() {
		return names[order];
	}

}
