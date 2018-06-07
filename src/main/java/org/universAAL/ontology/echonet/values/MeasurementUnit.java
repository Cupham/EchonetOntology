package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MeasurementUnit extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "FaultDescriptionValue";
public static final String HAS_FAULT_DESCRIPTION_DETAIL = EchonetOntology.NAMESPACE + "FaultDescriptionValueDetail";
	
	public static final int NO_FAULT = 0;
	public static final int RECOVERBLE_FAULT_1 = 1;
	public static final int RECOVERBLE_FAULT_2 = 2;
	public static final int RECOVERBLE_FAULT_3 = 3;
	public static final int RECOVERBLE_FAULT_4 = 4;
	public static final int RECOVERBLE_FAULT_5 = 5;
	public static final int RECOVERBLE_FAULT_6 = 6;
	public static final int RECOVERBLE_FAULT_7 = 7;
	public static final int REQUIRE_REPAIR_FAULT_1 = 8;
	public static final int REQUIRE_REPAIR_FAULT_2 = 9;
	public static final int REQUIRE_REPAIR_FAULT_3 = 10;
	public static final int REQUIRE_REPAIR_FAULT_4 = 11;
	public static final int REQUIRE_REPAIR_FAULT_5 = 12;
	public static final int REQUIRE_REPAIR_FAULT_6 = 13;
	public static final int UNKNOWN_FAULT = 14;
	
	
	private static final String[] names = {"NoFault", "RecoverableFaultType1", "RecoverableFaultType2", "RecoverableFaultType3", 
										   "RecoverableFaultType4", "RecoverableFaultType5", "RecoverableFaultType6", "RecoverableFaultType7",
										   "RequireRepairFaultType1", "RequireRepairFaultType2", "RequireRepairFaultType3","RequireRepairFaultType4", 
										   "RequireRepairFaultType5", "RequireRepairFaultType6", "Unknownfault"};
	
	public static final MeasurementUnit NoFault = new MeasurementUnit(NO_FAULT);
	public static final MeasurementUnit RecoverableFaultType1 = new MeasurementUnit(RECOVERBLE_FAULT_1);
	public static final MeasurementUnit RecoverableFaultType2 = new MeasurementUnit(RECOVERBLE_FAULT_2);
	public static final MeasurementUnit RecoverableFaultType3 = new MeasurementUnit(RECOVERBLE_FAULT_3);
	public static final MeasurementUnit RecoverableFaultType4 = new MeasurementUnit(RECOVERBLE_FAULT_4);
	public static final MeasurementUnit RecoverableFaultType5 = new MeasurementUnit(RECOVERBLE_FAULT_5);
	public static final MeasurementUnit RecoverableFaultType6 = new MeasurementUnit(RECOVERBLE_FAULT_6);
	public static final MeasurementUnit RecoverableFaultType7 = new MeasurementUnit(RECOVERBLE_FAULT_7);
	public static final MeasurementUnit ReuireRepairFaultType1 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_1);
	public static final MeasurementUnit ReuireRepairFaultType2 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_2);
	public static final MeasurementUnit ReuireRepairFaultType3 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_3);
	public static final MeasurementUnit ReuireRepairFaultType4 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_4);
	public static final MeasurementUnit ReuireRepairFaultType5 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_5);
	public static final MeasurementUnit ReuireRepairFaultType6 = new MeasurementUnit(REQUIRE_REPAIR_FAULT_6);
	public static final MeasurementUnit UnknownFault = new MeasurementUnit(UNKNOWN_FAULT);
	private int order;
	
	private MeasurementUnit(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
		String msg ="";
		switch (order) {
		case NO_FAULT:
			msg ="No fault";
			break;
		case RECOVERBLE_FAULT_1:
			msg ="Faults that can be recovered from by turning off the power witch and" +
			     "turning it on again or withdrawing and re-inserting the power plug.";
			break;
		case RECOVERBLE_FAULT_2:
			msg ="Faults that can be recovered from by pressing the reset button.";
			break;
		case RECOVERBLE_FAULT_3:
			msg ="Faults that can be recovered from by changing the way the device is" + 
				 "mounted or opening/closing a lid or door.";
			break;
		case RECOVERBLE_FAULT_4:
			msg ="Faults that can be recovered from by supplying fuel, water, air, etc.";
			break;
		case RECOVERBLE_FAULT_5:
			msg ="Faults that can be recovered from by cleaning the device (filter etc.)";
			break;
		case RECOVERBLE_FAULT_6:
			msg ="Faults that can be recovered from by changing the battery or cell";
			break;
		case RECOVERBLE_FAULT_7:
			msg ="User-definable domain";
			break;
		case REQUIRE_REPAIR_FAULT_1:
			msg ="Abnormal event or the tripping of a safety device";
			break;
		case REQUIRE_REPAIR_FAULT_2:
			msg ="Fault in a switch";
			break;
		case REQUIRE_REPAIR_FAULT_3:
			msg ="Fault in the sensor system";
			break;
		case REQUIRE_REPAIR_FAULT_4:
			msg ="Fault in a component such as an actuator";
			break;
		case REQUIRE_REPAIR_FAULT_5:
			msg ="Fault in a control circuit board";
			break;
		case REQUIRE_REPAIR_FAULT_6:
			msg ="User-definable domain";
			break;
		case UNKNOWN_FAULT:
			msg ="A fault has occurred but the recovery method or fault location cannot be determined.";
			break;
		}
		setDescriptionsDetail(msg);
	}

	public static MeasurementUnit getFaultDesciptionValueByOrder(int order) {
		switch (order) {
		case NO_FAULT:
			return NoFault;
		case RECOVERBLE_FAULT_1:
			return RecoverableFaultType1;
		case RECOVERBLE_FAULT_2:
			return RecoverableFaultType2;
		case RECOVERBLE_FAULT_3:
			return RecoverableFaultType3;
		case RECOVERBLE_FAULT_4:
			return RecoverableFaultType4;
		case RECOVERBLE_FAULT_5:
			return RecoverableFaultType5;
		case RECOVERBLE_FAULT_6:
			return RecoverableFaultType6;
		case RECOVERBLE_FAULT_7:
			return RecoverableFaultType7;
		case REQUIRE_REPAIR_FAULT_1:
			return ReuireRepairFaultType1;
		case REQUIRE_REPAIR_FAULT_2:
			return ReuireRepairFaultType2;
		case REQUIRE_REPAIR_FAULT_3:
			return ReuireRepairFaultType3;
		case REQUIRE_REPAIR_FAULT_4:
			return ReuireRepairFaultType4;
		case REQUIRE_REPAIR_FAULT_5:
			return ReuireRepairFaultType5;
		case REQUIRE_REPAIR_FAULT_6:
			return ReuireRepairFaultType6;
		case UNKNOWN_FAULT:
			return UnknownFault;			
		default:
			return null;
		}
	}

	public static final MeasurementUnit valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NO_FAULT; i <= UNKNOWN_FAULT; i++)
			if (names[i].equals(name))
				return getFaultDesciptionValueByOrder(i);
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
	public void setDescriptionsDetail(String des) {
		changeProperty(HAS_FAULT_DESCRIPTION_DETAIL, des);
	}
	public String getDescriptionsDetail() {
		Object pp = getProperty(HAS_FAULT_DESCRIPTION_DETAIL);
		if(pp!= null) {
			return pp.toString();
		} else {
			return null;
		}
	}

}
