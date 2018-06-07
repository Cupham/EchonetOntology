package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class ElectricDeviceFaultDesciptionValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "ElectricDeviceFaultDesciptionValue";
	
	public static final int RESTART_BY_PERFORMING_RESET_OPERATION = 0;
	public static final int OBSTACLE_CAUTCH = 1;
	public static final int RECOVERY_FROM_OUTAGE = 2;
	public static final int TIME_OUT = 3;
	public static final int BATTERY_LOW = 4;
	public static final int USER_DEFINED = 5;
	
	
	private static final String[] names = {"RestartDeviceByPerformingResetOperation", "ObstacleCaught",
										   "RecoveryFromOutage",  "TimeOut", "BatteryLow", "UserDefined"};
	
	public static final ElectricDeviceFaultDesciptionValue RestartDeviceByPerformingResetOperation = new ElectricDeviceFaultDesciptionValue(RESTART_BY_PERFORMING_RESET_OPERATION);
	public static final ElectricDeviceFaultDesciptionValue ObstacleCaught = new ElectricDeviceFaultDesciptionValue(OBSTACLE_CAUTCH);
	public static final ElectricDeviceFaultDesciptionValue RecoveryFromOutage = new ElectricDeviceFaultDesciptionValue(RECOVERY_FROM_OUTAGE);
	public static final ElectricDeviceFaultDesciptionValue TimeOut = new ElectricDeviceFaultDesciptionValue(TIME_OUT);
	public static final ElectricDeviceFaultDesciptionValue BatteryLow = new ElectricDeviceFaultDesciptionValue(BATTERY_LOW);
	public static final ElectricDeviceFaultDesciptionValue UserDefined = new ElectricDeviceFaultDesciptionValue(USER_DEFINED);
	private int order;

	private ElectricDeviceFaultDesciptionValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static ElectricDeviceFaultDesciptionValue getElectricDeviceFaultDesciptionValueByOrder(int order) {
		switch (order) {
		case RESTART_BY_PERFORMING_RESET_OPERATION:
			return RestartDeviceByPerformingResetOperation;
		case OBSTACLE_CAUTCH:
			return ObstacleCaught;
		case RECOVERY_FROM_OUTAGE:
			return RecoveryFromOutage;
		case TIME_OUT:
			return TimeOut;
		case BATTERY_LOW:
			return BatteryLow;
		case USER_DEFINED:
			return UserDefined;			
		default:
			return null;
		}
	}

	public static final ElectricDeviceFaultDesciptionValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = RESTART_BY_PERFORMING_RESET_OPERATION; i <= USER_DEFINED; i++)
			if (names[i].equals(name))
				return getElectricDeviceFaultDesciptionValueByOrder(i);
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
