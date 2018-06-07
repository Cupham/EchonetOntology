package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class OperationStatusValue extends ManagedIndividual {
	public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationStatusValue";
	
	public static final int ON = 0;
	public static final int OFF = 1;
	public static final int AUTOMATIC_ON = 2;
	public static final int MANUAL_ON = 3;
	public static final int MANUAL_OFF = 4;
	public static final int AUTOMATIC = 5;
	public static final int NON_AUTOMATIC = 6;
	public static final int AUTOMATIC_USED = 7;
	public static final int NON_AUTOMATIC_USED = 8;
	public static final int NON_AUTOMATIC_STOPPED = 9;
	public static final int HEATING = 10;
	public static final int NOT_HEATING = 11;
	public static final int POSSIBLE = 12;
	public static final int NOT_POSSIBLE = 13;
	public static final int NORMAL = 14;
	public static final int ALARM = 15;
	public static final int CONNECTED = 16;
	public static final int DISCONNECTED = 17;
	public static final int NOT_REGISTERED = 18;
	public static final int DELETED = 19;

	private static final String[] names = { "On", "Off","AutomaticOn","ManualOn","ManualOff",
											"Automatic","NonAutomatic","AutomaticUsed","NonAutomaticStopped",
											"NonAutomaticUsed","Heating","NotHeating","Possible", "NotPossible",
											"Normal","Alarm","Connected","Disconnected","NotRegistered","Deleted"};
	
	public static final OperationStatusValue On = new OperationStatusValue(ON);
	public static final OperationStatusValue Off = new OperationStatusValue(OFF);
	public static final OperationStatusValue AutomaticOn = new OperationStatusValue(AUTOMATIC_ON);
	public static final OperationStatusValue ManualOn = new OperationStatusValue(MANUAL_ON);
	public static final OperationStatusValue ManualOff = new OperationStatusValue(MANUAL_OFF);
	public static final OperationStatusValue Automatic = new OperationStatusValue(AUTOMATIC);
	public static final OperationStatusValue NonAutomatic = new OperationStatusValue(NON_AUTOMATIC);
	public static final OperationStatusValue AutomaticUsed = new OperationStatusValue(AUTOMATIC_USED);
	public static final OperationStatusValue NonAutomaticStopped = new OperationStatusValue(NON_AUTOMATIC_USED);
	public static final OperationStatusValue NonAutomaticUsed = new OperationStatusValue(NON_AUTOMATIC_STOPPED);
	public static final OperationStatusValue Heating = new OperationStatusValue(HEATING);
	public static final OperationStatusValue NotHeating = new OperationStatusValue(NOT_HEATING);
	public static final OperationStatusValue Possible = new OperationStatusValue(POSSIBLE);
	public static final OperationStatusValue NotPossible = new OperationStatusValue(NOT_POSSIBLE);
	public static final OperationStatusValue Normal = new OperationStatusValue(NORMAL);
	public static final OperationStatusValue Alarm = new OperationStatusValue(ALARM);
	public static final OperationStatusValue Connected = new OperationStatusValue(CONNECTED);
	public static final OperationStatusValue Disconnected = new OperationStatusValue(DISCONNECTED);
	public static final OperationStatusValue NotRegistered = new OperationStatusValue(NOT_REGISTERED);
	public static final OperationStatusValue Deleted = new OperationStatusValue(DELETED);


	private int order;

	private OperationStatusValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationStatusValue getOperationStatusValueByOrder(int order) {
		switch (order) {
		case ON:
			return On;
		case OFF:
			return Off;
		case AUTOMATIC_ON:
			return AutomaticOn;
		case MANUAL_ON:
			return ManualOn;
		case MANUAL_OFF:
			return ManualOff;
		case AUTOMATIC:
			return Automatic;
		case NON_AUTOMATIC:
			return NonAutomatic;
		case AUTOMATIC_USED:
			return AutomaticUsed;
		case NON_AUTOMATIC_USED:
			return NonAutomaticStopped;
		case NON_AUTOMATIC_STOPPED:
			return NonAutomaticUsed;
		case HEATING:
			return Heating;
		case NOT_HEATING:
			return NotHeating;
		case POSSIBLE:
			return Possible;
		case NOT_POSSIBLE:
			return NotPossible;	
		case NORMAL:
			return Normal;
		case ALARM:
			return Alarm;	
		case CONNECTED:
			return Connected;
		case DISCONNECTED:
			return Disconnected;	
		case NOT_REGISTERED:
			return NotRegistered;
		case DELETED:
			return Deleted;
		default:
			return null;
		}
	}

	public static final OperationStatusValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = ON; i <= DELETED; i++)
			if (names[i].equals(name))
				return getOperationStatusValueByOrder(i);
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
