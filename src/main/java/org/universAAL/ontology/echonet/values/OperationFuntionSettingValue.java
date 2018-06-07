package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class OperationFuntionSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationFuntionSettingValue";
	private int order;
	public static final int NO_SETTING = 0;
	public static final int CLOTHES_DRYER_FUNCTION = 1;
	public static final int CONDENSATION_SUPPRESSOR_FUNCTION = 2;
	public static final int MITE_MOLD_CONTROL_FUNCTION = 3;
	public static final int ACTIVE_DEFROSTING_FUNCTION = 4;
	public static final int OPEN = 5;
	public static final int CLOSE = 6;
	public static final int STOP = 7;
	public static final int CONTINOUS_SETTING = 8;
	public static final int ONE_TIME_SETTING = 9;
	public static final int SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE = 10;
	public static final int INDEPENDENT = 11;
	public static final int SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE = 12;
	public static final int TIMER_OFF = 13;
	public static final int TIMER_1_ON = 14;
	public static final int TIMER_2_ON = 15;
	public static final int TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON = 16;
	public static final int TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF = 17;
	public static final int TIME_BASED_RESERVATION_ON = 18;
	public static final int RELATIVE_TIME_BASED_RESERVATION_ON = 19;
	public static final int HYBRID = 20;
	public static final int SYSTEM_LINKED = 21;
	
	private static final String[] names = {"NoSetting", "ClothesDryerFunction", "MiteMoldControlFunction","ActiveDefrostingFunction",
										   "Open", "Close", "Stop", "ContinousSetting","OneTimeSetting",
										   "SystemInterconnectedReservePowerFlowAcceptable","Independent",
										   "SystemInterconnectedReservePowerFlowNotAcceptable","TimerOff","Timer1_On","Timer2_On",
										   "TimeAndRelativeTimeBasedRevervationON", "TimeAndRelativeTimeBasedRevervationOFF", 
										   "TimeBasedRevervationON","RelativeTimeBasedRevervationON","Hybrid","SystemLinked"};
	
	public static final OperationFuntionSettingValue NoSetting = new OperationFuntionSettingValue(NO_SETTING);
	public static final OperationFuntionSettingValue ClothesDryerFunction = new OperationFuntionSettingValue(CLOTHES_DRYER_FUNCTION);
	public static final OperationFuntionSettingValue CondensationSuppressorFunction = new OperationFuntionSettingValue(CONDENSATION_SUPPRESSOR_FUNCTION);
	public static final OperationFuntionSettingValue MiteMoldControlFunction = new OperationFuntionSettingValue(MITE_MOLD_CONTROL_FUNCTION);
	public static final OperationFuntionSettingValue ActiveDefrostingFunction = new OperationFuntionSettingValue(ACTIVE_DEFROSTING_FUNCTION);
	public static final OperationFuntionSettingValue Open = new OperationFuntionSettingValue(OPEN);
	public static final OperationFuntionSettingValue Close = new OperationFuntionSettingValue(CLOSE);
	public static final OperationFuntionSettingValue Stop = new OperationFuntionSettingValue(STOP);
	public static final OperationFuntionSettingValue ContinousSetting = new OperationFuntionSettingValue(CONTINOUS_SETTING);
	public static final OperationFuntionSettingValue OneTimeSetting = new OperationFuntionSettingValue(ONE_TIME_SETTING);
	public static final OperationFuntionSettingValue SystemInterconnectedReservePowerFlowAcceptable = new OperationFuntionSettingValue(SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE);
	public static final OperationFuntionSettingValue Independent = new OperationFuntionSettingValue(INDEPENDENT);
	public static final OperationFuntionSettingValue SystemInterconnectedReservePowerFlowNotAcceptable = new OperationFuntionSettingValue(SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE);
	public static final OperationFuntionSettingValue TimerOff = new OperationFuntionSettingValue(TIMER_OFF);
	public static final OperationFuntionSettingValue Timer1_On = new OperationFuntionSettingValue(TIMER_1_ON);
	public static final OperationFuntionSettingValue Timer2_On = new OperationFuntionSettingValue(TIMER_2_ON);
	public static final OperationFuntionSettingValue TimeAndRelativeTimeBasedRevervationON = new OperationFuntionSettingValue(TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON);
	public static final OperationFuntionSettingValue TimeAndRelativeTimeBasedRevervationOFF = new OperationFuntionSettingValue(TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF);
	public static final OperationFuntionSettingValue TimeBasedRevervationON = new OperationFuntionSettingValue(TIME_BASED_RESERVATION_ON);
	public static final OperationFuntionSettingValue RelativeTimeBasedRevervationON = new OperationFuntionSettingValue(RELATIVE_TIME_BASED_RESERVATION_ON);
	public static final OperationFuntionSettingValue Hybrid = new OperationFuntionSettingValue(HYBRID);
	public static final OperationFuntionSettingValue SystemLinked = new OperationFuntionSettingValue(SYSTEM_LINKED);

	
	private OperationFuntionSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationFuntionSettingValue getAirconditionerSpecialFuntionSettingValueByOrder(int order) {
		switch (order) {
		case NO_SETTING:
			return NoSetting;
		case CLOTHES_DRYER_FUNCTION:
			return ClothesDryerFunction;
		case CONDENSATION_SUPPRESSOR_FUNCTION:
			return CondensationSuppressorFunction;
		case MITE_MOLD_CONTROL_FUNCTION:
			return MiteMoldControlFunction;
		case ACTIVE_DEFROSTING_FUNCTION:
			return ActiveDefrostingFunction;
		case OPEN:
			return Open;
		case CLOSE:
			return Close;
		case STOP:
			return Stop;
		case CONTINOUS_SETTING:
			return ContinousSetting;
		case ONE_TIME_SETTING:
			return OneTimeSetting;
		case SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_ACCEPTABLE:
			return SystemInterconnectedReservePowerFlowAcceptable;
		case INDEPENDENT:
			return Independent;
		case SYSTEM_INTERCONNECTED_RESERVE_POWER_FLOW_NOT_ACCEPTABLE:
			return SystemInterconnectedReservePowerFlowNotAcceptable;
		case TIMER_OFF:
			return TimerOff;
		case TIMER_1_ON:
			return Timer1_On;
		case TIMER_2_ON:
			return Timer2_On;
		case TIME_AND_RELATIVE_TIME_BASED_RESERVATION_ON:
			return TimeAndRelativeTimeBasedRevervationON;
		case TIME_AND_RELATIVE_TIME_BASED_RESERVATION_OFF:
			return TimeAndRelativeTimeBasedRevervationOFF;
		case TIME_BASED_RESERVATION_ON:
			return TimeBasedRevervationON;
		case RELATIVE_TIME_BASED_RESERVATION_ON:
			return RelativeTimeBasedRevervationON;
		case HYBRID:
			return Hybrid;
		case SYSTEM_LINKED:
			return SystemLinked;
			
			
		default:
			return null;
		}
	}

	public static final OperationFuntionSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NO_SETTING; i <= SYSTEM_LINKED; i++)
			if (names[i].equals(name))
				return getAirconditionerSpecialFuntionSettingValueByOrder(i);
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
