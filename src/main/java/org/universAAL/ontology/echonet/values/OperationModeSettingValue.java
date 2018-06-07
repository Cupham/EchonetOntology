package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class OperationModeSettingValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "OperationModeSettingValue";
	private int order;
	public static final int NORMAL_OPERATION = 0;
	public static final int HIGH_SPEED_OPERATION = 1;
	public static final int SILENT_OPERATION = 2;
	public static final int STANDARD_MODE = 3;
	public static final int EXTRA_MODE = 5;
	public static final int AUTOMATIC_DIRECTION_CONTROL_MODE = 6;
	public static final int NON_AUTOMATIC_DIRECTION_CONTROL_MODE = 7;
	public static final int AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE = 8;
	public static final int AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE = 9;
	public static final int AUTOMATIC_MODE = 10;
	public static final int COOLING_MODE = 11;
	public static final int HEATING_MODE = 12;
	public static final int DEHUMIDIFICATION_MODE = 13;
	public static final int AIR_CIRCULATOR_MODE = 14;
	public static final int OTHER = 15;
	public static final int THROAT_DRY_PREVENTION_MODE = 16;
	public static final int QUIET_OPERATION_MODE = 17;
	public static final int SAVING_MODE = 18;
	public static final int ROOM_HEATING_ON_MODE = 19;
	public static final int ROOM_HEATING_OFF_MODE = 20;
	public static final int TIMER_MODE = 21;
	public static final int NO_SETTING = 22;
	public static final int OVER_COOL_PREVENTION_MODE = 23;
	public static final int VENTILATION_MODE = 24;
	public static final int PRE_WARM_MODE = 25;
	public static final int DRYER_MODE = 26;
	public static final int STOP = 27;
	public static final int MODEST_OPERATION_MODE = 28;
	public static final int HIGH_POWER_OPERATION_MODE = 29;
	public static final int RAPID_CHARGING_MODE = 30;
	public static final int CHARGING_MODE = 31;
	public static final int DISCHARGING_MODE = 32;
	public static final int STANDBY_MODE = 33;
	public static final int TEST_MODE = 34;
	public static final int RESTART_MODE = 35;
	public static final int RECALCULATION_MODE= 36;
	public static final int MAIN_LIGHTING_MODE = 37;
	public static final int NIGHT_LIGHTING_MODE = 38;
	public static final int COLOR_LIGHTING_MODE= 39;
	public static final int CITRIC_ACID_CLEANING_MODE= 40;
	

	
	
	private static final String[] names = {"NormalMode", "HighSpeedMode", "SilentMode",
										   "StanardMode","ExtraMode","AutomaticAirFlowDirectionControlModeMode", 
										   "NonAutomaticAirFlowDirectionControlMode", "AutomaticAirFlowVerticalDirectionMode", 
										   "AutomaticAirFlowHorizontalDirectionMode","AutomaticMode", "CoolingMode", "HeatingMode", 
										   "DehumidificationMode", "AirCiculatorMode", "Other","ThroatDryPreventionMode", "QuiteOperationMode",
										   "PowerSavingMode","RoomHeatingOnMode","RoomHeatingOffMode","TimerMode","NoSetting",
										   "OverCoolPreventionMode","VentilationMode","PreWarmMode","DryerMode","Stop",
										   "ModestOperationMode","HighPowerOperationMode","RapidCharginMode","ChargingMode",
										   "DischargingMode","StandbyMode","TestMode","RestartMode","RecalculationMode",
										   "MainLightingMode","NightLightingMode","ColorLightingMode","CitricAcidCleaningMode"};
	
	public static final OperationModeSettingValue NormalMode = new OperationModeSettingValue(NORMAL_OPERATION);
	public static final OperationModeSettingValue HighSpeedMode = new OperationModeSettingValue(HIGH_SPEED_OPERATION);
	public static final OperationModeSettingValue SilentMode = new OperationModeSettingValue(SILENT_OPERATION);
	public static final OperationModeSettingValue StandardMode = new OperationModeSettingValue(STANDARD_MODE);
	public static final OperationModeSettingValue ExtraMode = new OperationModeSettingValue(EXTRA_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowDirectionControlMode = new OperationModeSettingValue(AUTOMATIC_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue NonAutomaticAirFlowDirectionControlMode = new OperationModeSettingValue(NON_AUTOMATIC_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowVerticalDirectionMode = new OperationModeSettingValue(AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticAirFlowHorizontalDirectionMode = new OperationModeSettingValue(AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE);
	public static final OperationModeSettingValue AutomaticMode = new OperationModeSettingValue(AUTOMATIC_MODE);
	public static final OperationModeSettingValue CoolingMode = new OperationModeSettingValue(COOLING_MODE);
	public static final OperationModeSettingValue HeatingMode = new OperationModeSettingValue(HEATING_MODE);
	public static final OperationModeSettingValue DehumidificationMode = new OperationModeSettingValue(DEHUMIDIFICATION_MODE);
	public static final OperationModeSettingValue AirCiculatorMode = new OperationModeSettingValue(AIR_CIRCULATOR_MODE);
	public static final OperationModeSettingValue Other = new OperationModeSettingValue(OTHER);
	public static final OperationModeSettingValue ThroatDryPreventionMode = new OperationModeSettingValue(THROAT_DRY_PREVENTION_MODE);
	public static final OperationModeSettingValue QuiteOperationMode = new OperationModeSettingValue(QUIET_OPERATION_MODE);
	public static final OperationModeSettingValue PowerSavingMode = new OperationModeSettingValue(SAVING_MODE);
	public static final OperationModeSettingValue RoomHeatingOnMode = new OperationModeSettingValue(ROOM_HEATING_ON_MODE);
	public static final OperationModeSettingValue RoomHeatingOffMode = new OperationModeSettingValue(ROOM_HEATING_OFF_MODE);
	public static final OperationModeSettingValue TimerMode= new OperationModeSettingValue(TIMER_MODE);
	public static final OperationModeSettingValue NoSetting = new OperationModeSettingValue(NO_SETTING);
	public static final OperationModeSettingValue OverCoolPreventionMode = new OperationModeSettingValue(OVER_COOL_PREVENTION_MODE);
	public static final OperationModeSettingValue VentilationMode = new OperationModeSettingValue(VENTILATION_MODE);
	public static final OperationModeSettingValue PreWarmMode= new OperationModeSettingValue(PRE_WARM_MODE);
	public static final OperationModeSettingValue DryerMode = new OperationModeSettingValue(NO_SETTING);
	public static final OperationModeSettingValue Stop = new OperationModeSettingValue(OVER_COOL_PREVENTION_MODE);
	public static final OperationModeSettingValue ModestOperationMode = new OperationModeSettingValue(MODEST_OPERATION_MODE);
	public static final OperationModeSettingValue HighPowerOperationMode = new OperationModeSettingValue(HIGH_POWER_OPERATION_MODE);
	public static final OperationModeSettingValue RapidCharginMode = new OperationModeSettingValue(RAPID_CHARGING_MODE);
	public static final OperationModeSettingValue ChargingMode = new OperationModeSettingValue(CHARGING_MODE);
	public static final OperationModeSettingValue DischargingMode = new OperationModeSettingValue(CHARGING_MODE);
	public static final OperationModeSettingValue StandbyMode = new OperationModeSettingValue(STANDBY_MODE);
	public static final OperationModeSettingValue TestMode = new OperationModeSettingValue(STANDBY_MODE);
	public static final OperationModeSettingValue RestartMode = new OperationModeSettingValue(RESTART_MODE);
	public static final OperationModeSettingValue RecalculationMode = new OperationModeSettingValue(RECALCULATION_MODE);
	public static final OperationModeSettingValue MainLightingMode = new OperationModeSettingValue(MAIN_LIGHTING_MODE);
	public static final OperationModeSettingValue NightLightingMode = new OperationModeSettingValue(NIGHT_LIGHTING_MODE);
	public static final OperationModeSettingValue ColorLightingMode = new OperationModeSettingValue(COLOR_LIGHTING_MODE);
	public static final OperationModeSettingValue CitricAcidCleaningMode = new OperationModeSettingValue(CITRIC_ACID_CLEANING_MODE);
	
	private OperationModeSettingValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static OperationModeSettingValue getOperationModeSettingValueByOrder(int order) {
		switch (order) {
		case NORMAL_OPERATION:
			return NormalMode;
		case HIGH_SPEED_OPERATION:
			return HighSpeedMode;
		case SILENT_OPERATION:
			return SilentMode;
		case STANDARD_MODE:
			return StandardMode;
		case EXTRA_MODE:
			return ExtraMode;
		case AUTOMATIC_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowDirectionControlMode;
		case NON_AUTOMATIC_DIRECTION_CONTROL_MODE:
			return NonAutomaticAirFlowDirectionControlMode;
		case AUTOMATIC_VERTICAL_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowVerticalDirectionMode;
		case AUTOMATIC_HORIZONTAL_DIRECTION_CONTROL_MODE:
			return AutomaticAirFlowHorizontalDirectionMode;
		case AUTOMATIC_MODE:
			return AutomaticMode;
		case COOLING_MODE:
			return CoolingMode;
		case HEATING_MODE:
			return HeatingMode;
		case DEHUMIDIFICATION_MODE:
			return DehumidificationMode;
		case AIR_CIRCULATOR_MODE:
			return AirCiculatorMode;
		case OTHER:
			return Other;
		case THROAT_DRY_PREVENTION_MODE:
			return ThroatDryPreventionMode;
		case QUIET_OPERATION_MODE:
			return QuiteOperationMode;
		case SAVING_MODE:
			return PowerSavingMode;
		case ROOM_HEATING_ON_MODE:
			return RoomHeatingOnMode;
		case ROOM_HEATING_OFF_MODE:
			return RoomHeatingOffMode;
		case TIMER_MODE:
			return TimerMode;
		case NO_SETTING:
			return NoSetting;
		case OVER_COOL_PREVENTION_MODE:
			return OverCoolPreventionMode;
		case VENTILATION_MODE:
			return VentilationMode;
		case PRE_WARM_MODE:
			return PreWarmMode;
		case DRYER_MODE:
			return DryerMode;
		case STOP:
			return Stop;
		case MODEST_OPERATION_MODE:
			return ModestOperationMode;
		case HIGH_POWER_OPERATION_MODE:
			return HighPowerOperationMode;
		case RAPID_CHARGING_MODE:
			return RapidCharginMode;
		case CHARGING_MODE:
			return ChargingMode;
		case DISCHARGING_MODE:
			return DischargingMode;
		case STANDBY_MODE:
			return StandbyMode;
		case TEST_MODE:
			return TestMode;
		case RESTART_MODE:
			return RestartMode;
		case RECALCULATION_MODE:
			return RecalculationMode;
		case MAIN_LIGHTING_MODE:
			return MainLightingMode;
		case NIGHT_LIGHTING_MODE:
			return NightLightingMode;
		case COLOR_LIGHTING_MODE:
			return ColorLightingMode;
		case CITRIC_ACID_CLEANING_MODE:
			return CitricAcidCleaningMode;
		default:
			return null;
		}
	}

	public static final OperationModeSettingValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = NORMAL_OPERATION; i <= CITRIC_ACID_CLEANING_MODE; i++)
			if (names[i].equals(name))
				return getOperationModeSettingValueByOrder(i);
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
