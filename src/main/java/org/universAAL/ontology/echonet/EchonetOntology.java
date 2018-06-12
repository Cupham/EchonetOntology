
package org.universAAL.ontology.echonet;


import java.util.Date;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.EchonetFactory;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.AirCleaner;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.AirConditionerVentilationFan;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.ElectricHeater;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.ElectricStorageHeater;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.FanHeater;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.HomeAirConditioner;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.Humidifier;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.PackageTypeCommercialAirConditionerIndoorUnit;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.PackageTypeCommercialAirConditionerOutdoorUnit;
import org.universAAL.ontology.echonet.airconditionerRelatedDevices.VentilationFan;
import org.universAAL.ontology.echonet.audiovisualRelatedDevices.Audio;
import org.universAAL.ontology.echonet.audiovisualRelatedDevices.Display;
import org.universAAL.ontology.echonet.audiovisualRelatedDevices.NetworkCamera;
import org.universAAL.ontology.echonet.audiovisualRelatedDevices.Television;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.ClothesDryer;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.CombinationMicrowaveOven;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.CommercialShowcase;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.CommercialShowcaseOutdoorUnit;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.CookingHeater;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.ElectricHotWaterPot;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.Refrigerator;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.RiceCooker;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.WasherDryer;
import org.universAAL.ontology.echonet.cookingHouseholdRelatedDevices.WashingMachine;
import org.universAAL.ontology.echonet.healthRelatedDevices.WeighingMachine;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.BathRoomHeaterDryer;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.Buzzer;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ColdHotWaterHeatSourceEquipment;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricBlind;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricGate;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricLock;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricRainSlidingShutter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricShutter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricSlidingDoor;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricToiletSeat;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricVehicleChargerDischager;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.ElectricWindow;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.EngineCogeneration;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.FloorHeater;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.FuelCell;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.GardenSprinkler;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.GasMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.GeneralLighting;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HighVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HouseHoldSmallWindTurbinePowerGeneration;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HouseHoldSolarPowerGeneration;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.InstantaneousWaterHeater;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.KeroseneMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LPGasMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LightingSystem;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LowVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.MonoFunctionLighting;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.PowerDistributionBoardMetering;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.SmartGasMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.SmartKeroseneMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.StorageBattery;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.VehicleCharger;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WaterFlowMeter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WaterHeater;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WattHourMeter;
import org.universAAL.ontology.echonet.managementOperationRelatedDevices.Controller;
import org.universAAL.ontology.echonet.managementOperationRelatedDevices.ParallelProcessingCombinationTypePowerControl;
import org.universAAL.ontology.echonet.managementOperationRelatedDevices.Switch;
import org.universAAL.ontology.echonet.sensorRelatedDevices.ActivityMountSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.AirPollutionSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.AirPressureSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.AirSpeedSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.BathHeatingStatusSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.BathWaterLevelSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.BedPresenceSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.CO2Sensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.CallSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.CondensationSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.CrimePreventionSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.CurrentValueSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.EarthquakeSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.ElectricEnergySensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.ElectricLeakSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.EmergencyButton;
import org.universAAL.ontology.echonet.sensorRelatedDevices.FireSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.FirstAidSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.FlameSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.GasLeakSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.GasSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.HumanBodyLocationSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.HumanDetectionSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.HumiditySensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.IlluminanceSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.MailingSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.MicromotionSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.OdorSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.OpenCloseSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.OxygenSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.PassageSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.PressureSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.RainSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.SmokeSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.SnowSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.SoundSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.TemperatureSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.VOCSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.VisitorSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterFlowRateSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterLeakSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterLevelSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterOverflowSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WeightSensor;
import org.universAAL.ontology.echonet.values.AirFlowDirectionSettingValue;
import org.universAAL.ontology.echonet.values.AirconditionerComponentOperationStatus;
import org.universAAL.ontology.echonet.values.AlarmStatusValue;
import org.universAAL.ontology.echonet.values.DetectionDirectionValue;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.FaultDesciptionValue;
import org.universAAL.ontology.echonet.values.IdentificationNumberValue;
import org.universAAL.ontology.echonet.values.InstallationLocationValue;
import org.universAAL.ontology.echonet.values.IntervalSettingValue;
import org.universAAL.ontology.echonet.values.IonEmissionMethodValue;
import org.universAAL.ontology.echonet.values.LiquidAmountLevelValue;
import org.universAAL.ontology.echonet.values.LocationValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MountedAirCleaningPurifyingMethodValue;
import org.universAAL.ontology.echonet.values.MountedAirRefreshingMethodValue;
import org.universAAL.ontology.echonet.values.MountedAirSelfCleaningMethodValue;
import org.universAAL.ontology.echonet.values.NumberOfSprinkleSettingValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStateSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.PowerConsumptionRange;
import org.universAAL.ontology.echonet.values.RadiationMethodValue;
import org.universAAL.ontology.echonet.values.RatedPowerConsumptionInModeValue;
import org.universAAL.ontology.echonet.values.RemoteControlSettingValue;
import org.universAAL.ontology.echonet.values.SelectiveOpeningOperationSettingValue;
import org.universAAL.ontology.echonet.values.SurplusElectricEnergyPowerPredictionValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.ValueCategory;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

/**
 *
 * @author PHAM Van Cu
 *
 */
public final class EchonetOntology extends Ontology {

	private static EchonetFactory factory = new EchonetFactory();;

	public static final String NAMESPACE = "http://ontology.universAAL.org/Echonet.owl#";

	public EchonetOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("The collection of ECHONET Ontology");
		r.setResourceLabel("Echonet");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);
		// ******* Declaration of enumeration classes of the ontology ******* //
		OntClassInfoSetup oci_EchonetDeviceGroupCodeValue = createNewAbstractOntClassInfo(EchonetDeviceGroupCodeValue.MY_URI);
		OntClassInfoSetup oci_OperationStatusValue = createNewAbstractOntClassInfo(OperationStatusValue.MY_URI);
		OntClassInfoSetup oci_InstallationLocationValue = createNewAbstractOntClassInfo(InstallationLocationValue.MY_URI);
		OntClassInfoSetup oci_IdentificationNumberValue = createNewAbstractOntClassInfo(IdentificationNumberValue.MY_URI);	
		OntClassInfoSetup oci_OccurenceStatusValue = createNewAbstractOntClassInfo(OccurenceStatusValue.MY_URI);
		OntClassInfoSetup oci_FaultDesciptionValue = createNewAbstractOntClassInfo(FaultDesciptionValue.MY_URI);
		OntClassInfoSetup oci_OperationModeSettingValue = createNewAbstractOntClassInfo(OperationModeSettingValue.MY_URI);
		OntClassInfoSetup oci_RemoteControlSettingValue = createNewAbstractOntClassInfo(RemoteControlSettingValue.MY_URI);
		OntClassInfoSetup oci_ThresholdLevelValue = createNewAbstractOntClassInfo(ThresholdLevelValue.MY_URI);
		OntClassInfoSetup oci_DetectionDirectionValue = createNewAbstractOntClassInfo(DetectionDirectionValue.MY_URI);
		OntClassInfoSetup oci_OperationStateSettingValue = createNewAbstractOntClassInfo(OperationStateSettingValue.MY_URI);
		OntClassInfoSetup oci_OperationFuntionSettingValue = createNewAbstractOntClassInfo(OperationFunctionSettingValue.MY_URI);
		OntClassInfoSetup oci_AirFlowDirectionSettingValue = createNewAbstractOntClassInfo(AirFlowDirectionSettingValue.MY_URI);
		OntClassInfoSetup oci_IonEmissionMethodValue = createNewAbstractOntClassInfo(IonEmissionMethodValue.MY_URI);
		OntClassInfoSetup oci_LiquidAmountLevelValue = createNewAbstractOntClassInfo(LiquidAmountLevelValue.MY_URI);
		OntClassInfoSetup oci_RadiationMethodValue = createNewAbstractOntClassInfo(RadiationMethodValue.MY_URI);
		OntClassInfoSetup oci_PowerConsumptionRange = createNewAbstractOntClassInfo(PowerConsumptionRange.MY_URI);
		OntClassInfoSetup oci_SelectiveOpeningOperationSettingValue = createNewAbstractOntClassInfo(SelectiveOpeningOperationSettingValue.MY_URI);
		OntClassInfoSetup oci_IntervalSettingValue = createNewAbstractOntClassInfo(IntervalSettingValue.MY_URI);
		OntClassInfoSetup oci_NumberOfSprinkleSettingValue = createNewAbstractOntClassInfo(NumberOfSprinkleSettingValue.MY_URI);
		OntClassInfoSetup oci_AlarmStatusValue = createNewAbstractOntClassInfo(AlarmStatusValue.MY_URI);
		
		
		OntClassInfoSetup oci_MeasuredValue = createNewAbstractOntClassInfo(MeasuredValue.MY_URI);
		OntClassInfoSetup oci_LocationValue = createNewAbstractOntClassInfo(LocationValue.MY_URI);
		OntClassInfoSetup oci_RatedPowerConsumptionInModeValue = createNewAbstractOntClassInfo(RatedPowerConsumptionInModeValue.MY_URI);
		OntClassInfoSetup oci_MountedAirCleaningPurifyingMethodValue = createNewAbstractOntClassInfo(MountedAirCleaningPurifyingMethodValue.MY_URI);
		OntClassInfoSetup oci_MountedAirRefreshingMethodValue = createNewAbstractOntClassInfo(MountedAirRefreshingMethodValue.MY_URI);
		OntClassInfoSetup oci_MountedAirSelfCleaningMethodValue = createNewAbstractOntClassInfo(MountedAirSelfCleaningMethodValue.MY_URI);
		OntClassInfoSetup oci_AirconditionerComponentOperationStatus = createNewAbstractOntClassInfo(AirconditionerComponentOperationStatus.MY_URI);
		OntClassInfoSetup oci_SurplusElectricEnergyPowerPredictionValue = createNewAbstractOntClassInfo(SurplusElectricEnergyPowerPredictionValue.MY_URI);
		
		
		
		// ******* Declaration of regular classes of the ECHONET ontology ******* //
		OntClassInfoSetup oci_EchonetSuperDevice = createNewAbstractOntClassInfo(EchonetSuperDevice.MY_URI);
		OntClassInfoSetup oci_ActivityMountSensor = createNewOntClassInfo(ActivityMountSensor.MY_URI,factory, EchonetFactory.ACTIVITY_AMOUNT_SENSOR);
		OntClassInfoSetup oci_AirPollutionSensor = createNewOntClassInfo(AirPollutionSensor.MY_URI,factory, EchonetFactory.AIR_POLLUTION_SENSOR);
		OntClassInfoSetup oci_AirPressureSensor = createNewOntClassInfo(AirPressureSensor.MY_URI,factory, EchonetFactory.AIR_PRESSURE_SENSOR);
		OntClassInfoSetup oci_AirSpeedSensor = createNewOntClassInfo(AirSpeedSensor.MY_URI,factory, EchonetFactory.AIR_SPEED_SENSOR);
		OntClassInfoSetup oci_BathHeatingStatusSensor = createNewOntClassInfo(BathHeatingStatusSensor.MY_URI,factory, EchonetFactory.BATH_HEATING_STATUS_SENSOR);
		OntClassInfoSetup oci_BathWaterLevelSensor = createNewOntClassInfo(BathWaterLevelSensor.MY_URI,factory, EchonetFactory.BATH_WATER_LEVEL_SENSOR);
		OntClassInfoSetup oci_BedPresenceSensor = createNewOntClassInfo(BedPresenceSensor.MY_URI,factory, EchonetFactory.BED_PRESENCE_SENSOR);
		OntClassInfoSetup oci_CallSensor = createNewOntClassInfo(CallSensor.MY_URI,factory, EchonetFactory.CALL_SENSOR);
		OntClassInfoSetup oci_CO2Sensor = createNewOntClassInfo(CO2Sensor.MY_URI,factory, EchonetFactory.CO2_SENSOR);
		OntClassInfoSetup oci_CondensationSensor = createNewOntClassInfo(CondensationSensor.MY_URI,factory, EchonetFactory.CONDENSATION_SENSOR);
		OntClassInfoSetup oci_CrimePreventionSensor = createNewOntClassInfo(CrimePreventionSensor.MY_URI,factory, EchonetFactory.CRIME_PREVENTION_SENSOR);
		OntClassInfoSetup oci_CurrentValueSensor = createNewOntClassInfo(CurrentValueSensor.MY_URI,factory, EchonetFactory.CURRENT_VALUE_SENSOR);
		OntClassInfoSetup oci_EarthquakeSensor = createNewOntClassInfo(EarthquakeSensor.MY_URI,factory, EchonetFactory.EARTHQUAKE_SENSOR);
		OntClassInfoSetup oci_ElectricEnergySensor = createNewOntClassInfo(ElectricEnergySensor.MY_URI,factory, EchonetFactory.ELECTRIC_ENERGY_SENSOR);
		OntClassInfoSetup oci_ElectricLeakSensor = createNewOntClassInfo(ElectricLeakSensor.MY_URI,factory, EchonetFactory.ELECTRIC_LEAK_SENSOR);
		OntClassInfoSetup oci_EmergencyButton = createNewOntClassInfo(EmergencyButton.MY_URI,factory, EchonetFactory.EMERGENCY_BUTTON);
		OntClassInfoSetup oci_FireSensor = createNewOntClassInfo(FireSensor.MY_URI,factory, EchonetFactory.FIRE_SENSOR);	
		OntClassInfoSetup oci_FirstAidSensor = createNewOntClassInfo(FirstAidSensor.MY_URI,factory, EchonetFactory.FIRST_AID_SENSOR);
		OntClassInfoSetup oci_FlameSensor = createNewOntClassInfo(FlameSensor.MY_URI,factory, EchonetFactory.FLAME_SENSOR);
		OntClassInfoSetup oci_GasLeakSensor = createNewOntClassInfo(GasLeakSensor.MY_URI,factory, EchonetFactory.GAS_LEAK_SENSOR);
		OntClassInfoSetup oci_GasSensor = createNewOntClassInfo(GasSensor.MY_URI,factory, EchonetFactory.GAS_SENSOR);
		OntClassInfoSetup oci_HumanBodyLocationSensor = createNewOntClassInfo(HumanBodyLocationSensor.MY_URI,factory, EchonetFactory.HUMAN_BODY_LOCATION_SENSOR);
		OntClassInfoSetup oci_HumanDetectionSensor = createNewOntClassInfo(HumanDetectionSensor.MY_URI,factory, EchonetFactory.HUMAN_DETECTION_SENSOR);
		OntClassInfoSetup oci_HumiditySensor = createNewOntClassInfo(HumiditySensor.MY_URI,factory, EchonetFactory.HUMIDITY_SENSOR);
		OntClassInfoSetup oci_IlluminanceSensor = createNewOntClassInfo(IlluminanceSensor.MY_URI,factory, EchonetFactory.ILLUMINANCE_SENSOR);
		OntClassInfoSetup oci_MailingSensor = createNewOntClassInfo(MailingSensor.MY_URI,factory, EchonetFactory.MAILING_SENSOR);
		OntClassInfoSetup oci_MicromotionsSensor= createNewOntClassInfo(MicromotionSensor.MY_URI,factory, EchonetFactory.MICROMOTION_SENSOR);
		OntClassInfoSetup oci_OdorSensor = createNewOntClassInfo(OdorSensor.MY_URI,factory, EchonetFactory.ODOR_SENSOR);
		OntClassInfoSetup oci_OpenCloseSensor = createNewOntClassInfo(OpenCloseSensor.MY_URI,factory, EchonetFactory.OPEN_CLOSE_SENSOR);
		OntClassInfoSetup oci_OxygenSensor = createNewOntClassInfo(OxygenSensor.MY_URI,factory, EchonetFactory.OXYGEN_SENSOR);
		OntClassInfoSetup oci_PassageSensor = createNewOntClassInfo(PassageSensor.MY_URI,factory, EchonetFactory.PASSAGE_SENSOR);
		OntClassInfoSetup oci_PressureSensor = createNewOntClassInfo(PressureSensor.MY_URI,factory, EchonetFactory.PRESSURE_SENSOR);
		OntClassInfoSetup oci_RainSensor = createNewOntClassInfo(RainSensor.MY_URI,factory, EchonetFactory.RAIN_SENSOR);
		OntClassInfoSetup oci_SmokeSensor = createNewOntClassInfo(SmokeSensor.MY_URI,factory, EchonetFactory.SMOKE_SENSOR);
		OntClassInfoSetup oci_SnowSensor = createNewOntClassInfo(SnowSensor.MY_URI,factory, EchonetFactory.SNOW_SENSOR);
		OntClassInfoSetup oci_SoundSensor = createNewOntClassInfo(SoundSensor.MY_URI,factory, EchonetFactory.SOUND_SENSOR);
		OntClassInfoSetup oci_TemperatureSensor = createNewOntClassInfo(TemperatureSensor.MY_URI,factory, EchonetFactory.TEMPERATURE_SENSOR);
		OntClassInfoSetup oci_VisitorSensor = createNewOntClassInfo(VisitorSensor.MY_URI,factory, EchonetFactory.VISITOR_SENSOR);
		OntClassInfoSetup oci_VOCSensor = createNewOntClassInfo(VOCSensor.MY_URI,factory, EchonetFactory.VOC_SENSOR);
		OntClassInfoSetup oci_WaterFlowRateSensor = createNewOntClassInfo(WaterFlowRateSensor.MY_URI,factory, EchonetFactory.WATER_FLOW_RATE_SENSOR);
		OntClassInfoSetup oci_WaterLeakSensor = createNewOntClassInfo(WaterLeakSensor.MY_URI,factory, EchonetFactory.WATER_LEAK_SENSOR);
		OntClassInfoSetup oci_WaterLevelSensor = createNewOntClassInfo(WaterLevelSensor.MY_URI,factory, EchonetFactory.WATER_LEVEL_SENSOR);
		OntClassInfoSetup oci_WaterOverflowSensor = createNewOntClassInfo(WaterOverflowSensor.MY_URI,factory, EchonetFactory.WATER_OVER_FLOW_SENSOR);
		OntClassInfoSetup oci_WeightSensor = createNewOntClassInfo(WeightSensor.MY_URI,factory, EchonetFactory.WEIGHT_SENSOR);
		
		OntClassInfoSetup oci_AirCleaner = createNewOntClassInfo(AirCleaner.MY_URI,factory, EchonetFactory.AIR_CLEANER);
		OntClassInfoSetup oci_AirConditionerVentilationFan = createNewOntClassInfo(AirConditionerVentilationFan.MY_URI,factory, EchonetFactory.AIR_CONDITIONER_VENTILATION_FAN);
		OntClassInfoSetup oci_ElectricHeater = createNewOntClassInfo(ElectricHeater.MY_URI,factory, EchonetFactory.ELECTRIC_HEATER);
		OntClassInfoSetup oci_ElectricStorageHeater = createNewOntClassInfo(ElectricStorageHeater.MY_URI,factory, EchonetFactory.ELECTRIC_STORAGE_HEATER);
		OntClassInfoSetup oci_FanHeater = createNewOntClassInfo(FanHeater.MY_URI,factory, EchonetFactory.FAN_HEATER);
		OntClassInfoSetup oci_HomeAirConditioner = createNewOntClassInfo(HomeAirConditioner.MY_URI,factory, EchonetFactory.HOME_AIR_CONDITIONER);
		OntClassInfoSetup oci_Humidifier = createNewOntClassInfo(Humidifier.MY_URI,factory, EchonetFactory.HUMIDIFIER);
		OntClassInfoSetup oci_PackageTypeCommercialAirconditionerIndoorUnit = createNewOntClassInfo(PackageTypeCommercialAirConditionerIndoorUnit.MY_URI,factory, EchonetFactory.PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_INDOOR_UNIT);
		OntClassInfoSetup oci_PackageTypeCommercialAirconditionerOutdoorUnit = createNewOntClassInfo(PackageTypeCommercialAirConditionerOutdoorUnit.MY_URI,factory, EchonetFactory.PACKAGE_TYPE_COMMERCIAL_AIR_CONDITIONER_OUTDOOR_UNIT);
		OntClassInfoSetup oci_VentilationFan = createNewOntClassInfo(VentilationFan.MY_URI,factory, EchonetFactory.VENTILATION_FAN);
		
		OntClassInfoSetup oci_BathRoomHeaterDryer = createNewOntClassInfo(BathRoomHeaterDryer.MY_URI,factory, EchonetFactory.BATH_ROOM_HEATER_DRYER);
		OntClassInfoSetup oci_Buzzer = createNewOntClassInfo(Buzzer.MY_URI,factory, EchonetFactory.BUZZER);
		OntClassInfoSetup oci_ColdHotWaterHeatSourceEquipment = createNewOntClassInfo(ColdHotWaterHeatSourceEquipment.MY_URI,factory, EchonetFactory.COLD_HOT_WATER_HEAT_SOURCE_EQUIPMENT);
		OntClassInfoSetup oci_ElectricBlind = createNewOntClassInfo(ElectricBlind.MY_URI,factory, EchonetFactory.ELECTRIC_BLIND);
		OntClassInfoSetup oci_ElectricGate = createNewOntClassInfo(ElectricGate.MY_URI,factory, EchonetFactory.ELECTRIC_GATE);
		OntClassInfoSetup oci_ElectricLock = createNewOntClassInfo(ElectricLock.MY_URI,factory, EchonetFactory.ELECTRIC_LOCK);
		OntClassInfoSetup oci_ElectricRainSlidingShutter = createNewOntClassInfo(ElectricRainSlidingShutter.MY_URI,factory, EchonetFactory.ELECTRIC_RAIN_SLIDING_SHUTTER);
		OntClassInfoSetup oci_ElectricShuttler = createNewOntClassInfo(ElectricShutter.MY_URI,factory, EchonetFactory.ELECTRIC_SHUTTER);
		OntClassInfoSetup oci_ElectricSlidingDoor = createNewOntClassInfo(ElectricSlidingDoor.MY_URI,factory, EchonetFactory.ELECTRIC_SLIDING_DOOR);
		OntClassInfoSetup oci_ElectricToiletSeat = createNewOntClassInfo(ElectricToiletSeat.MY_URI,factory, EchonetFactory.ELECTRIC_TOILET_SEAT);
		OntClassInfoSetup oci_ElectricHehicleChargerDischarger = createNewOntClassInfo(ElectricVehicleChargerDischager.MY_URI,factory, EchonetFactory.ELECTRIC_VEHICLE_CHARGER_DISCHAGER);
		OntClassInfoSetup oci_ElectricWindow = createNewOntClassInfo(ElectricWindow.MY_URI,factory, EchonetFactory.ELECTRIC_WINDOW);
		OntClassInfoSetup oci_EngineCogeneration = createNewOntClassInfo(EngineCogeneration.MY_URI,factory, EchonetFactory.ENGINE_COGENERATION);
		OntClassInfoSetup oci_FloorHeater = createNewOntClassInfo(FloorHeater.MY_URI,factory, EchonetFactory.FLOOR_HEATER);
		OntClassInfoSetup oci_FuelCell = createNewOntClassInfo(FuelCell.MY_URI,factory, EchonetFactory.FUEL_CELL);
		OntClassInfoSetup oci_GardenSprinkler = createNewOntClassInfo(GardenSprinkler.MY_URI,factory, EchonetFactory.GARDEN_SPRINKLER);
		OntClassInfoSetup oci_GasMetter = createNewOntClassInfo(GasMeter.MY_URI,factory, EchonetFactory.GAS_METER);	
		OntClassInfoSetup oci_GeneralLight = createNewOntClassInfo(GeneralLighting.MY_URI,factory, EchonetFactory.GENERAL_LIGHTING);
		OntClassInfoSetup oci_HighVoltageSmartElectricEnergy = createNewOntClassInfo(HighVoltageSmartElectricEnergy.MY_URI,factory, EchonetFactory.HIGH_VOLTAGE_SMART_ELECTRIC_ENERGY);
		OntClassInfoSetup oci_HouseHoldSmartWindTurbinePowerGeneration = createNewOntClassInfo(HouseHoldSmallWindTurbinePowerGeneration.MY_URI,factory, EchonetFactory.HOUSE_HOLD_SMALL_WIND_TURBINE_POWER_GENERATION);
		OntClassInfoSetup oci_HouseHoldSolarPowerGeneration = createNewOntClassInfo(HouseHoldSolarPowerGeneration.MY_URI,factory, EchonetFactory.HOUSE_HOLD_SOLAR_POWER_GENERATION);
		OntClassInfoSetup oci_InstantaneousWaterHeater = createNewOntClassInfo(InstantaneousWaterHeater.MY_URI,factory, EchonetFactory.INSTANTANEOUS_WATER_HEATER);
		OntClassInfoSetup oci_KeroseneMetter = createNewOntClassInfo(KeroseneMeter.MY_URI,factory, EchonetFactory.KEROSENE_METER);
		OntClassInfoSetup oci_LightingSystem = createNewOntClassInfo(LightingSystem.MY_URI,factory, EchonetFactory.LIGHTING_SYSTEM);
		OntClassInfoSetup oci_LowVoltageSmartElectricEnergy = createNewOntClassInfo(LowVoltageSmartElectricEnergy.MY_URI,factory, EchonetFactory.LOW_VOLTAGE_SMART_ELECTRIC_ENERGY);
		OntClassInfoSetup oci_LPGasMetter = createNewOntClassInfo(LPGasMeter.MY_URI,factory, EchonetFactory.LP_GAS_METER);
		OntClassInfoSetup oci_MonoFunctionLighting = createNewOntClassInfo(MonoFunctionLighting.MY_URI,factory, EchonetFactory.MONO_FUNCTION_LIGHTING);
		OntClassInfoSetup oci_PowerDistributionBoardMetering = createNewOntClassInfo(PowerDistributionBoardMetering.MY_URI,factory, EchonetFactory.POWER_DISTRIBUTION_BOARD_METERING);
		OntClassInfoSetup oci_SmartGasMeter = createNewOntClassInfo(SmartGasMeter.MY_URI,factory, EchonetFactory.SMART_GAS_METER);
		OntClassInfoSetup oci_SmartKeroseneMeter = createNewOntClassInfo(SmartKeroseneMeter.MY_URI,factory, EchonetFactory.SMART_KEROSENE_METER);
		OntClassInfoSetup oci_StorageBattery = createNewOntClassInfo(StorageBattery.MY_URI,factory, EchonetFactory.STORAGE_BATTERY);
		OntClassInfoSetup oci_VehicleCharger = createNewOntClassInfo(VehicleCharger.MY_URI,factory, EchonetFactory.VEHICLE_CHARGER);
		OntClassInfoSetup oci_WaterFlowMeter = createNewOntClassInfo(WaterFlowMeter.MY_URI,factory, EchonetFactory.WATER_FLOW_METER);
		OntClassInfoSetup oci_WaterHeater = createNewOntClassInfo(WaterHeater.MY_URI,factory, EchonetFactory.WATER_HEATER);
		OntClassInfoSetup oci_WattHourMeter = createNewOntClassInfo(WattHourMeter.MY_URI,factory, EchonetFactory.WATT_HOUR_METER);
		
		OntClassInfoSetup oci_ClothesDryer = createNewOntClassInfo(ClothesDryer.MY_URI,factory, EchonetFactory.CLOTHES_DRYER);
		OntClassInfoSetup oci_CombinationMicrowaveOven = createNewOntClassInfo(CombinationMicrowaveOven.MY_URI,factory, EchonetFactory.COMBINATION_MICROWAVE_OVEN);
		OntClassInfoSetup oci_CommercialShowcase = createNewOntClassInfo(CommercialShowcase.MY_URI,factory, EchonetFactory.COMMERCIAL_SHOWCASE);
		OntClassInfoSetup oci_CommercialShowcaseOutdoorUnit = createNewOntClassInfo(CommercialShowcaseOutdoorUnit.MY_URI,factory, EchonetFactory.COMMERCIAL_SHOWCASE_OUTDOOR_UNIT);
		OntClassInfoSetup oci_CookingHeater = createNewOntClassInfo(CookingHeater.MY_URI,factory, EchonetFactory.COOKING_HEATER);
		OntClassInfoSetup oci_ElectricHotWaterPot = createNewOntClassInfo(ElectricHotWaterPot.MY_URI,factory, EchonetFactory.ELECTRIC_HOT_WATER_POT);
		OntClassInfoSetup oci_Refrigeratoi = createNewOntClassInfo(Refrigerator.MY_URI,factory, EchonetFactory.REFRIGERATOR);
		OntClassInfoSetup oci_RiceCooker = createNewOntClassInfo(RiceCooker.MY_URI,factory, EchonetFactory.RICE_COOKER);
		OntClassInfoSetup oci_WasherDryer = createNewOntClassInfo(WasherDryer.MY_URI,factory, EchonetFactory.WASHER_DRYER);
		OntClassInfoSetup oci_WashingMachine = createNewOntClassInfo(WashingMachine.MY_URI,factory, EchonetFactory.WASHING_MACHINE);
		
		OntClassInfoSetup oci_WeighingMachine = createNewOntClassInfo(WeighingMachine.MY_URI,factory, EchonetFactory.WEIGHING_MACHINE);
		
		OntClassInfoSetup oci_Controller = createNewOntClassInfo(Controller.MY_URI,factory, EchonetFactory.CONTROLLER);
		OntClassInfoSetup oci_ParallelProcessingCombinationTypePowerControl = createNewOntClassInfo(ParallelProcessingCombinationTypePowerControl.MY_URI,factory, EchonetFactory.PARALLEL_PROCESSING_COMBINATION_TYPE_POWER_CONTROL);
		OntClassInfoSetup oci_Switch = createNewOntClassInfo(Switch.MY_URI,factory, EchonetFactory.SWITCH);
		
		OntClassInfoSetup oci_Audio = createNewOntClassInfo(Audio.MY_URI,factory, EchonetFactory.AUDIO);
		OntClassInfoSetup oci_Display = createNewOntClassInfo(Display.MY_URI,factory, EchonetFactory.DISPLAY);
		OntClassInfoSetup oci_NetworkCamera = createNewOntClassInfo(NetworkCamera.MY_URI,factory, EchonetFactory.NETWORK_CAMERA);
		OntClassInfoSetup oci_Television= createNewOntClassInfo(Television.MY_URI,factory, EchonetFactory.TELEVISION);
		
		// ******* Add content to enumeration classes of the ontology ******* //
		oci_RatedPowerConsumptionInModeValue.setResourceComment("");
		oci_RatedPowerConsumptionInModeValue.setResourceLabel("RatedPowerConsumptionInModeValue");
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(RatedPowerConsumptionInModeValue.PROPERTY_HAS_OPERATION_MODE).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				RatedPowerConsumptionInModeValue.PROPERTY_HAS_OPERATION_MODE, OperationModeSettingValue.MY_URI, 1, 1));
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(RatedPowerConsumptionInModeValue.PROPERTY_HAS_POWER_CONSUMPTION_VALUE).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				RatedPowerConsumptionInModeValue.PROPERTY_HAS_POWER_CONSUMPTION_VALUE, MeasuredValue.MY_URI, 1, 1));
		oci_RatedPowerConsumptionInModeValue.setResourceComment("");
		oci_RatedPowerConsumptionInModeValue.setResourceLabel("RatedPowerConsumptionInModeValue");
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(RatedPowerConsumptionInModeValue.PROPERTY_HAS_OPERATION_MODE).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				RatedPowerConsumptionInModeValue.PROPERTY_HAS_OPERATION_MODE, OperationModeSettingValue.MY_URI, 1, 1));
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(RatedPowerConsumptionInModeValue.PROPERTY_HAS_POWER_CONSUMPTION_VALUE).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				RatedPowerConsumptionInModeValue.PROPERTY_HAS_POWER_CONSUMPTION_VALUE, MeasuredValue.MY_URI, 1, 1));
		
		oci_MountedAirCleaningPurifyingMethodValue.setResourceComment("");
		oci_RatedPowerConsumptionInModeValue.setResourceLabel("MountedAirCleaningPurifyingMethodValue");
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(MountedAirCleaningPurifyingMethodValue.PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirCleaningPurifyingMethodValue.PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));
		oci_RatedPowerConsumptionInModeValue.addDatatypeProperty(MountedAirCleaningPurifyingMethodValue.PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING).setFunctional();
		oci_RatedPowerConsumptionInModeValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirCleaningPurifyingMethodValue.PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));

		oci_MountedAirRefreshingMethodValue.setResourceComment("");
		oci_MountedAirRefreshingMethodValue.setResourceLabel("MountedAirRefreshingMethodValue");
		oci_MountedAirRefreshingMethodValue.addDatatypeProperty(MountedAirRefreshingMethodValue.PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING).setFunctional();
		oci_MountedAirRefreshingMethodValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirRefreshingMethodValue.PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));
		oci_MountedAirRefreshingMethodValue.addDatatypeProperty(MountedAirRefreshingMethodValue.PROPERTY_HAS_MINUS_ION_METHOD_MOUTING).setFunctional();
		oci_MountedAirRefreshingMethodValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirRefreshingMethodValue.PROPERTY_HAS_MINUS_ION_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));
		
		oci_MountedAirSelfCleaningMethodValue.setResourceComment("");
		oci_MountedAirSelfCleaningMethodValue.setResourceLabel("MountedAirSelfCleaningMethodValue");
		oci_MountedAirSelfCleaningMethodValue.addDatatypeProperty(MountedAirSelfCleaningMethodValue.PROPERTY_HAS_DRYING_METHOD_MOUTING).setFunctional();
		oci_MountedAirSelfCleaningMethodValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirSelfCleaningMethodValue.PROPERTY_HAS_DRYING_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));
		oci_MountedAirSelfCleaningMethodValue.addDatatypeProperty(MountedAirSelfCleaningMethodValue.PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING).setFunctional();
		oci_MountedAirSelfCleaningMethodValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MountedAirSelfCleaningMethodValue.PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING, OperationStateSettingValue.MY_URI, 1, 1));
		
		oci_AirconditionerComponentOperationStatus.setResourceComment("");
		oci_AirconditionerComponentOperationStatus.setResourceLabel("AirconditionerComponentOperationStatus");
		oci_AirconditionerComponentOperationStatus.addDatatypeProperty(AirconditionerComponentOperationStatus.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS).setFunctional();
		oci_AirconditionerComponentOperationStatus.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				AirconditionerComponentOperationStatus.PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS, OperationStatusValue.MY_URI, 1, 1));
		oci_AirconditionerComponentOperationStatus.addDatatypeProperty(AirconditionerComponentOperationStatus.PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS).setFunctional();
		oci_AirconditionerComponentOperationStatus.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				AirconditionerComponentOperationStatus.PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS, OperationStatusValue.MY_URI, 1, 1));
		
		oci_SurplusElectricEnergyPowerPredictionValue.setResourceComment("");
		oci_SurplusElectricEnergyPowerPredictionValue.setResourceLabel("SurplusElectricEnergyPowerPredictionValue");
		oci_SurplusElectricEnergyPowerPredictionValue.addDatatypeProperty(SurplusElectricEnergyPowerPredictionValue.PROPERTY_HAS_PREDICTION_TIME).setFunctional();
		oci_SurplusElectricEnergyPowerPredictionValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				SurplusElectricEnergyPowerPredictionValue.PROPERTY_HAS_PREDICTION_TIME, TypeMapper.getDatatypeURI(Date.class), 1, 1));
		oci_SurplusElectricEnergyPowerPredictionValue.addDatatypeProperty(SurplusElectricEnergyPowerPredictionValue.PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE).setFunctional();
		oci_SurplusElectricEnergyPowerPredictionValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				SurplusElectricEnergyPowerPredictionValue.PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE, MeasuredValue.MY_URI, 1, 1));
		
		
		oci_EchonetDeviceGroupCodeValue.setResourceComment("Echonet Device Group Code values");
		oci_EchonetDeviceGroupCodeValue.setResourceLabel("EchonetDeviceGroupCodeValue");
		oci_EchonetDeviceGroupCodeValue.toEnumeration(new ManagedIndividual[] {
				EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice,EchonetDeviceGroupCodeValue.AudiovisualRelatedDevice,
				EchonetDeviceGroupCodeValue.CookingHouseholdRelatedDevice,EchonetDeviceGroupCodeValue.HealthRelatedDevice,
				EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice,EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice,
				EchonetDeviceGroupCodeValue.SensorRelatedDevice
		});
		
		oci_OperationStatusValue.setResourceComment("EPC:x80");
		oci_OperationStatusValue.setResourceLabel("OperationStatusValue");
		oci_OperationStatusValue.toEnumeration(new ManagedIndividual[] {
				OperationStatusValue.On,OperationStatusValue.Off,OperationStatusValue.AutomaticOn,
				OperationStatusValue.ManualOn,OperationStatusValue.ManualOff,OperationStatusValue.Automatic,
				OperationStatusValue.NonAutomatic,OperationStatusValue.AutomaticUsed,OperationStatusValue.NonAutomaticStopped,
				OperationStatusValue.NonAutomaticUsed,OperationStatusValue.Heating,OperationStatusValue.NotHeating,	
				OperationStatusValue.Possible,OperationStatusValue.NotPossible,OperationStatusValue.Normal,
				OperationStatusValue.Alarm,OperationStatusValue.Initial,OperationStatusValue.HeatingSuspended,
				OperationStatusValue.HeatingCycleCompleted,OperationStatusValue.Setting,OperationStatusValue.PreHeating,
				OperationStatusValue.PreheatTemperatureMaintenance,OperationStatusValue.HeatingTemporilyStopped,OperationStatusValue.NotSpecified,
				OperationStatusValue.Stop,OperationStatusValue.Cooking,OperationStatusValue.Steaming,
				OperationStatusValue.CookingCompleted,OperationStatusValue.Refrigeration,OperationStatusValue.Freezing
		});
		oci_InstallationLocationValue.setResourceComment("EPC:x81");
		oci_InstallationLocationValue.setResourceLabel("InstallationLocationValue");
		oci_InstallationLocationValue.toEnumeration(new ManagedIndividual[] {
				InstallationLocationValue.LivingRoom,InstallationLocationValue.DinningRoom,InstallationLocationValue.Kitchen,
				InstallationLocationValue.Bathroom,InstallationLocationValue.Lavatory,InstallationLocationValue.Washroom_ChangingRoom,
				InstallationLocationValue.Passageway,InstallationLocationValue.Room,InstallationLocationValue.Stairway,
				InstallationLocationValue.FrontDoor,InstallationLocationValue.Storeroom,InstallationLocationValue.Garden_Perimeter,
				InstallationLocationValue.Garare,InstallationLocationValue.Veranda_Balcony,InstallationLocationValue.Others,
				InstallationLocationValue.FreeDefinition,InstallationLocationValue.InstallationLocationNotSpecified,
				InstallationLocationValue.InstallationLocationIndefinited				
		});
		oci_IdentificationNumberValue.setResourceComment("EPC:x83");
		oci_IdentificationNumberValue.setResourceLabel("IdentificationNumberValue");
		oci_IdentificationNumberValue.toEnumeration(new ManagedIndividual[] { 
				IdentificationNumberValue.LowerLayerCommunicationProtocol,IdentificationNumberValue.PowerLineCommunicationProtocol_A_D,
				IdentificationNumberValue.LowPowerRadioCommunicationProtocol,IdentificationNumberValue.ExtendedHBS,
				IdentificationNumberValue.IrDA,IdentificationNumberValue.LonTalk, IdentificationNumberValue.Bluetooth,
				IdentificationNumberValue.Ethernet, IdentificationNumberValue.IEEE802_11_11B,IdentificationNumberValue.PowerLineCommunicationProtocol_C,
				IdentificationNumberValue.IPV6_6LoWPAN,IdentificationNumberValue.ManufacturerDefinedProtocol,	
				IdentificationNumberValue.IPV6_Ethernet,IdentificationNumberValue.RandomlyGeneratedProtocol,
				IdentificationNumberValue.IdentificationNotSet
		});
		oci_OccurenceStatusValue.setResourceComment("Occurence status of a property");
		oci_OccurenceStatusValue.setResourceLabel("OccurenceStatusValue");
		oci_IdentificationNumberValue.toEnumeration(new ManagedIndividual[] { 
				OccurenceStatusValue.OccurenceStatusFound,OccurenceStatusValue.OccurenceStatusNotFound
		});	
		oci_FaultDesciptionValue.setResourceComment("EPC:x89");
		oci_FaultDesciptionValue.setResourceLabel("FaultDescriptionValue");
		oci_FaultDesciptionValue.toEnumeration(new ManagedIndividual[] { 
				FaultDesciptionValue.NoFault,FaultDesciptionValue.RecoverableFaultType1,FaultDesciptionValue.RecoverableFaultType2,
				FaultDesciptionValue.RecoverableFaultType3,FaultDesciptionValue.RecoverableFaultType4,FaultDesciptionValue.RecoverableFaultType5,
				FaultDesciptionValue.RecoverableFaultType6,FaultDesciptionValue.RecoverableFaultType7,FaultDesciptionValue.RequireRepairFaultType1,
				FaultDesciptionValue.RequireRepairFaultType2,FaultDesciptionValue.RequireRepairFaultType3,FaultDesciptionValue.RequireRepairFaultType4,
				FaultDesciptionValue.RequireRepairFaultType5,FaultDesciptionValue.RequireRepairFaultType6,FaultDesciptionValue.UnknownFault
		});
		oci_OperationModeSettingValue.setResourceComment("Device's operation mode values");
		oci_OperationModeSettingValue.setResourceLabel("OpeationModeValue");
		oci_OperationModeSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationModeSettingValue.NormalMode,OperationModeSettingValue.HighSpeedMode,OperationModeSettingValue.SilentMode,
				OperationModeSettingValue.StandardMode,OperationModeSettingValue.ExtraMode,OperationModeSettingValue.AutomaticAirFlowDirectionControlMode,
				OperationModeSettingValue.NonAutomaticAirFlowDirectionControlMode,OperationModeSettingValue.AutomaticAirFlowVerticalDirectionMode,
				OperationModeSettingValue.AutomaticAirFlowHorizontalDirectionMode,OperationModeSettingValue.AutomaticMode,OperationModeSettingValue.CoolingMode,		
				OperationModeSettingValue.HeatingMode,OperationModeSettingValue.DehumidificationMode,OperationModeSettingValue.CiculatorMode,
				OperationModeSettingValue.Other,OperationModeSettingValue.ThroatDryPreventionMode,OperationModeSettingValue.QuietOperationMode,
				OperationModeSettingValue.PowerSavingMode,OperationModeSettingValue.RoomHeatingOnMode,OperationModeSettingValue.RoomHeatingOffMode,
				OperationModeSettingValue.TimerMode,OperationModeSettingValue.NoSetting,OperationModeSettingValue.OverCoolPreventionMode,
				OperationModeSettingValue.VentilationMode,OperationModeSettingValue.PreWarmMode,OperationModeSettingValue.DryerMode,
				OperationModeSettingValue.Stop,OperationModeSettingValue.ModestOperationMode,OperationModeSettingValue.HighPowerOperationMode,
				OperationModeSettingValue.RapidCharginMode,OperationModeSettingValue.ChargingMode,OperationModeSettingValue.DischargingMode,
				OperationModeSettingValue.StandbyMode,OperationModeSettingValue.TestMode,OperationModeSettingValue.RestartMode,	
				OperationModeSettingValue.RecalculationMode,OperationModeSettingValue.MainLightingMode,OperationModeSettingValue.NightLightingMode,
				OperationModeSettingValue.ColorLightingMode,OperationModeSettingValue.CitricAcidCleaningMode,OperationModeSettingValue.QuickMode,
				OperationModeSettingValue.MicrowaveHeatingMode,OperationModeSettingValue.DefrostingMode,OperationModeSettingValue.OvenMode,
				OperationModeSettingValue.GrillMode,OperationModeSettingValue.ToasterMode,OperationModeSettingValue.FermentingMode,
				OperationModeSettingValue.StewingMode,OperationModeSettingValue.SteamingMode,OperationModeSettingValue.TwoStageMicrowaveHeatingMode,	
				OperationModeSettingValue.ConvectionMode,OperationModeSettingValue.HybridMode,OperationModeSettingValue.PowerControlMode,
				OperationModeSettingValue.DeepFryingMode,OperationModeSettingValue.WaterHeatingMode,OperationModeSettingValue.RiceBoilingMode,
				OperationModeSettingValue.StirFryingMode,OperationModeSettingValue.WashingMode,OperationModeSettingValue.RinsingMode,
				OperationModeSettingValue.SpinDryingMode,OperationModeSettingValue.SuspendedMode,OperationModeSettingValue.WorkingCycleStoppedCompletedMode,
				OperationModeSettingValue.NonCoolingMode,OperationModeSettingValue.ContinousMode,OperationModeSettingValue.IntermitentMode
		});
		oci_RemoteControlSettingValue.setResourceComment("EPC:x93");
		oci_RemoteControlSettingValue.setResourceLabel("RemoteControlSetting");
		oci_RemoteControlSettingValue.toEnumeration(new ManagedIndividual[] { 
				RemoteControlSettingValue.NormalCommunicationLine_PublicNetworkDiabled,RemoteControlSettingValue.NotThroughPublicNetwork,
				RemoteControlSettingValue.NormalCommunicationLine_PublicNetworkEnalbed,RemoteControlSettingValue.ThroughPublicNetwork
		});
		
		oci_OperationStateSettingValue.setResourceComment("Operation state of device's functions");
		oci_OperationStateSettingValue.setResourceLabel("OperationStateSettingValue");
		oci_OperationStateSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationStateSettingValue.NormalOperation,OperationStateSettingValue.SpecialState,OperationStateSettingValue.DefrostingState,
				OperationStateSettingValue.PreHeatingState,OperationStateSettingValue.HeatRemovalState,OperationStateSettingValue.AutomaticAirFlowSwingNotUsed,
				OperationStateSettingValue.AutomaticAirFlowSwingVerticalUsed,OperationStateSettingValue.AutomaticAirFlowSwingHorizontalUsed,
				OperationStateSettingValue.AutomaticAirFlowSwingVerticalAndHorizontalUsed,OperationStateSettingValue.FullyOpened,OperationStateSettingValue.FullyClosed,
				OperationStateSettingValue.Opened,OperationStateSettingValue.Closed,OperationStateSettingValue.StopHalfway,
				OperationStateSettingValue.NonPriorityState,OperationStateSettingValue.Locked,OperationStateSettingValue.UnLocked,
				OperationStateSettingValue.OrdinaryLevel,OperationStateSettingValue.NotificationOfBatteryReplacementState,OperationStateSettingValue.SupplyingHotWaterState,
				OperationStateSettingValue.KeepingBathTemperatureState,OperationStateSettingValue.Stopped,OperationStateSettingValue.Generating,
				OperationStateSettingValue.Starting,OperationStateSettingValue.Stopping,OperationStateSettingValue.UndeterminedState,
				OperationStateSettingValue.Idling,OperationStateSettingValue.VehicleNotConnectedState,OperationStateSettingValue.VehicleConnectedNotChargeableNotDischargableState,
				OperationStateSettingValue.VehicleConnectedChargeableNotDischargableState,OperationStateSettingValue.VehicleConnectedNotChargeableDischargableState,
				OperationStateSettingValue.VehicleConnectedChargeableDischargableState,OperationStateSettingValue.VehicleConnectedChargeableState,
				OperationStateSettingValue.VehicleConnectedNotChargeableState,OperationStateSettingValue.ReadyState,OperationStateSettingValue.BusyState,
				OperationStateSettingValue.ImplementedState,OperationStateSettingValue.NotImplementedState, OperationStateSettingValue.EnableState,
				OperationStateSettingValue.DisableState,OperationStateSettingValue.TemporaryDisableState,OperationStateSettingValue.ConnectedState,
				OperationStateSettingValue.DisconnectedState,OperationStateSettingValue.NotRegisteredState,OperationStateSettingValue.DeletedState,
				OperationStateSettingValue.StartedRestartedState,OperationStateSettingValue.SuspendedState,OperationStateSettingValue.MountedState,
				OperationStateSettingValue.UnMountedState
		});
		
		oci_OperationFuntionSettingValue.setResourceComment("Operation state of device's functions");
		oci_OperationFuntionSettingValue.setResourceLabel("OperationFuntionSettingValue");
		oci_OperationFuntionSettingValue.toEnumeration(new ManagedIndividual[] { 
				OperationFunctionSettingValue.NoSetting,OperationFunctionSettingValue.ClothesDryerFunction,OperationFunctionSettingValue.MiteMoldControlFunction,
				OperationFunctionSettingValue.ActiveDefrostingFunction,OperationFunctionSettingValue.Open,OperationFunctionSettingValue.Close,
				OperationFunctionSettingValue.Stop,OperationFunctionSettingValue.ContinousSetting,OperationFunctionSettingValue.OneTimeSetting,
				OperationFunctionSettingValue.SystemInterconnectedReservePowerFlowAcceptable,OperationFunctionSettingValue.Independent,
				OperationFunctionSettingValue.SystemInterconnectedReservePowerFlowNotAcceptable,OperationFunctionSettingValue.TimerOff,
				OperationFunctionSettingValue.Timer1_On,OperationFunctionSettingValue.Timer2_On,OperationFunctionSettingValue.TimeBasedRevervationON,
				OperationFunctionSettingValue.TimeAndRelativeTimeBasedRevervationON,OperationFunctionSettingValue.TimeAndRelativeTimeBasedRevervationOFF,
				OperationFunctionSettingValue.RelativeTimeBasedRevervationON,OperationFunctionSettingValue.Hybrid,OperationFunctionSettingValue.SystemLinked,	
				OperationFunctionSettingValue.FluorescentLight,OperationFunctionSettingValue.Led,OperationFunctionSettingValue.NoLight,
				OperationFunctionSettingValue.NonFluorocarbonInverter,OperationFunctionSettingValue.Inverter,
				OperationFunctionSettingValue.BuiltInType,OperationFunctionSettingValue.SeperateType,OperationFunctionSettingValue.Others,
				OperationFunctionSettingValue.NormalSetting,OperationFunctionSettingValue.ThermostatOverrideFunctionON,
				OperationFunctionSettingValue.ThermostatOverrideFunctionOFF
		});

		oci_ThresholdLevelValue.setResourceComment("");
		oci_ThresholdLevelValue.setResourceLabel("ThresholdLevelValue");
		oci_ThresholdLevelValue.toEnumeration(new ManagedIndividual[] { 
				ThresholdLevelValue.MinumumLevel,ThresholdLevelValue.Level_1,ThresholdLevelValue.Level_2,ThresholdLevelValue.Level_3,
				ThresholdLevelValue.Level_4,ThresholdLevelValue.Level_5, ThresholdLevelValue.Level_6,ThresholdLevelValue.Level_7,
				ThresholdLevelValue.Level_8,ThresholdLevelValue.Level_9,ThresholdLevelValue.Level_10,ThresholdLevelValue.Level_11,
				ThresholdLevelValue.Level_12,ThresholdLevelValue.Level_13,ThresholdLevelValue.Level_14,ThresholdLevelValue.Level_15,
				ThresholdLevelValue.MaximumLevel,ThresholdLevelValue.High,ThresholdLevelValue.Medium,ThresholdLevelValue.Low,
				ThresholdLevelValue.AutomaticControl,ThresholdLevelValue.Standard,ThresholdLevelValue.ContinousOperation,
				ThresholdLevelValue.IntermittentOperation
		});
		oci_DetectionDirectionValue.setResourceComment("");
		oci_DetectionDirectionValue.setResourceLabel("DetectionDirectionValue");
		oci_DetectionDirectionValue.toEnumeration(new ManagedIndividual[] { 
				DetectionDirectionValue.InDirection,DetectionDirectionValue.In_RightDirection,DetectionDirectionValue.RightDirection,
				DetectionDirectionValue.Out_RightDirection,DetectionDirectionValue.OutDirection,DetectionDirectionValue.Out_LeftDirection,
				DetectionDirectionValue.LeftDirection,DetectionDirectionValue.In_LeftDirection,DetectionDirectionValue.NoDetection,
				DetectionDirectionValue.Detected_DirectionUnknown
		});
		oci_AirFlowDirectionSettingValue.setResourceComment("");
		oci_AirFlowDirectionSettingValue.setResourceLabel("AirFlowDirectionSettingValue");
		oci_AirFlowDirectionSettingValue.toEnumeration(new ManagedIndividual[] { 
				AirFlowDirectionSettingValue.Rightward,AirFlowDirectionSettingValue.Leftward,AirFlowDirectionSettingValue.Central,
				AirFlowDirectionSettingValue.LeftCenter,AirFlowDirectionSettingValue.RightCenter,AirFlowDirectionSettingValue.Uppermost,
				AirFlowDirectionSettingValue.Lowermost,AirFlowDirectionSettingValue.Uppermost_CentralMidpoint,
				AirFlowDirectionSettingValue.Lowermost_CentralMidpoint
		});
		oci_IonEmissionMethodValue.setResourceComment("");
		oci_IonEmissionMethodValue.setResourceLabel("IonEmissionMethodValue");
		oci_IonEmissionMethodValue.toEnumeration(new ManagedIndividual[] { 
				IonEmissionMethodValue.ClusterIonMethod,IonEmissionMethodValue.NegativeIonMethod
		});
		oci_LiquidAmountLevelValue.setResourceComment("");
		oci_LiquidAmountLevelValue.setResourceLabel("LiquidAmountLevelValue");
		oci_LiquidAmountLevelValue.toEnumeration(new ManagedIndividual[] { 
				LiquidAmountLevelValue.Empty,LiquidAmountLevelValue.MinimumLevel,LiquidAmountLevelValue.AmountLevel20Percent,
				LiquidAmountLevelValue.AmountLevel40Percent,LiquidAmountLevelValue.AmountLevel60Percent,
				LiquidAmountLevelValue.AmountLevel80Percent,LiquidAmountLevelValue.MaxLevel
		});
		oci_RadiationMethodValue.setResourceComment("");
		oci_RadiationMethodValue.setResourceLabel("RadiationMethodValue");
		oci_RadiationMethodValue.toEnumeration(new ManagedIndividual[] { 
				RadiationMethodValue.WithFan,RadiationMethodValue.WithoutFan
		});
		
		oci_PowerConsumptionRange.setResourceComment("");
		oci_PowerConsumptionRange.setResourceLabel("PowerConsumptionRange");
		oci_PowerConsumptionRange.toEnumeration(new ManagedIndividual[] { 
				PowerConsumptionRange.Undefined,PowerConsumptionRange.RangeUpTo50W,
				PowerConsumptionRange.Range50W_100W,PowerConsumptionRange.Range100W_150W,
				PowerConsumptionRange.Range150W_200W,PowerConsumptionRange.RangeOver_200W
		});
		oci_SelectiveOpeningOperationSettingValue.setResourceComment("");
		oci_SelectiveOpeningOperationSettingValue.setResourceLabel("PowerConsumptionRange");
		oci_SelectiveOpeningOperationSettingValue.toEnumeration(new ManagedIndividual[] { 
				SelectiveOpeningOperationSettingValue.DegreeOfSettingPositionOpen,SelectiveOpeningOperationSettingValue.OperationTimeSettingValueOpen,
				SelectiveOpeningOperationSettingValue.OperationTimeSettingValueClose,SelectiveOpeningOperationSettingValue.LocalSettingPosition,
				SelectiveOpeningOperationSettingValue.SlitDegreeOfOpeningSetting
		});
		oci_IntervalSettingValue.setResourceComment("");
		oci_IntervalSettingValue.setResourceLabel("IntervalSettingValue");
		oci_IntervalSettingValue.toEnumeration(new ManagedIndividual[] { 
				IntervalSettingValue.Off,IntervalSettingValue.Daily,IntervalSettingValue.EveryOtherDay,
				IntervalSettingValue.Every3Day,IntervalSettingValue.OnceAWeek
		});
		
		oci_NumberOfSprinkleSettingValue.setResourceComment("");
		oci_NumberOfSprinkleSettingValue.setResourceLabel("NumberOfSprinkleSettingValue");
		oci_NumberOfSprinkleSettingValue.toEnumeration(new ManagedIndividual[] { 
				NumberOfSprinkleSettingValue.BothOn,NumberOfSprinkleSettingValue.FirstOn,NumberOfSprinkleSettingValue.SecondOn
		});
		
		oci_AlarmStatusValue.setResourceComment("");
		oci_AlarmStatusValue.setResourceLabel("AlarmStatusValue");
		oci_AlarmStatusValue.toEnumeration(new ManagedIndividual[] { 
				AlarmStatusValue.NoAlarm,AlarmStatusValue.OutOfHotWater,AlarmStatusValue.WaterLeaking,
				AlarmStatusValue.WaterFrozen,AlarmStatusValue.BreakOpened,AlarmStatusValue.DoorOpened,
				AlarmStatusValue.ManualUnlocked,AlarmStatusValue.Tampered
		});
		
		oci_MeasuredValue.setResourceComment("Measured value");
		oci_MeasuredValue.setResourceLabel("MeasuredValue");
		oci_MeasuredValue.addDatatypeProperty(MeasuredValue.PROPERTY_HAS_MESUREMENT_CATEGORY).setFunctional();
		oci_MeasuredValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MeasuredValue.PROPERTY_HAS_MESUREMENT_CATEGORY, ValueCategory.MY_URI, 0, 1));
		oci_MeasuredValue.addDatatypeProperty(MeasuredValue.PROPERTY_HAS_MESUREMENT_DATE).setFunctional();
		oci_MeasuredValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MeasuredValue.PROPERTY_HAS_MESUREMENT_DATE, TypeMapper.getDatatypeURI(Date.class), 0, 1));
		oci_MeasuredValue.addDatatypeProperty(MeasuredValue.PROPERTY_HAS_MESUREMENT_VALUE).setFunctional();
		oci_MeasuredValue.addDatatypeProperty(MeasuredValue.PROPERTY_HAS_MESUREMENT_UNIT).setFunctional();
		oci_MeasuredValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				MeasuredValue.PROPERTY_HAS_MESUREMENT_UNIT, TypeMapper.getDatatypeURI(String.class), 0, 1));
		
		oci_LocationValue.setResourceComment("");
		oci_LocationValue.setResourceLabel("LocationValue");
		oci_LocationValue.addDatatypeProperty(LocationValue.PROPERTY_HAS_X_COORDINATOR).setFunctional();
		oci_LocationValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				LocationValue.PROPERTY_HAS_X_COORDINATOR, MeasuredValue.MY_URI, 1, 1));
		oci_LocationValue.addDatatypeProperty(LocationValue.PROPERTY_HAS_Y_COORDINATOR).setFunctional();
		oci_LocationValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				LocationValue.PROPERTY_HAS_Y_COORDINATOR, MeasuredValue.MY_URI, 1, 1));
		oci_LocationValue.addDatatypeProperty(LocationValue.PROPERTY_HAS_Z_COORDINATOR).setFunctional();
		oci_LocationValue.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				LocationValue.PROPERTY_HAS_Z_COORDINATOR, MeasuredValue.MY_URI, 1, 1));
		
		
		
		// ******* Add content to device classes of the ontology ******* //
		oci_EchonetSuperDevice.setResourceComment("Super device class");
		oci_EchonetSuperDevice.setResourceLabel("EchonetSuperDevice");
		oci_EchonetSuperDevice.addSuperClass(Device.MY_URI);
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_NODE_IP_ADDRESS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_NODE_IP_ADDRESS, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_GROUP_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_GROUP_CODE, EchonetDeviceGroupCodeValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_CLASS_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CLASS_CODE, TypeMapper.getDatatypeURI(Byte.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_OPERATION_STATUS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_OPERATION_STATUS, OperationStatusValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_INSTALLATION_LOCATION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_INSTALLATION_LOCATION, InstallationLocationValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_STANDARD_VERSION_INFORMATION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_STANDARD_VERSION_INFORMATION, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_IDENTIFICATION_NUMBER).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_IDENTIFICATION_NUMBER, IdentificationNumberValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, MeasuredValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION, MeasuredValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_FAULT_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_FAULT_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_LIMIT_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_LIMIT_SETTING, MeasuredValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_FAULT_STATUS).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_FAULT_STATUS, OccurenceStatusValue.MY_URI, 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_FAULT_DESCRIPTION, FaultDesciptionValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_MANUFACTURER_CODE, TypeMapper.getDatatypeURI(String.class), 1, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_BUSINESS_FACILITY_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_BUSINESS_FACILITY_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCT_CODE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCT_CODE, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_NUMBER).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_NUMBER, TypeMapper.getDatatypeURI(String.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_DATE).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_PRODUCTION_DATE, TypeMapper.getDatatypeURI(Date.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING, OperationModeSettingValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_REMOTE_CONTROL_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_REMOTE_CONTROL_SETTING, RemoteControlSettingValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_TIME_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_TIME_SETTING, TypeMapper.getDatatypeURI(Date.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_CURRENT_DATE_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CURRENT_DATE_SETTING, TypeMapper.getDatatypeURI(Date.class), 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_POWER_LIMIT_SETTING).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_POWER_LIMIT_SETTING, MeasuredValue.MY_URI, 0, 1));
		oci_EchonetSuperDevice.addObjectProperty(EchonetSuperDevice.PROPERTY_HAS_CUMULATIVE_OPERATING_TIME).setFunctional();
		oci_EchonetSuperDevice.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EchonetSuperDevice.PROPERTY_HAS_CUMULATIVE_OPERATING_TIME, MeasuredValue.MY_URI, 0, 1));
		
		oci_GasLeakSensor.setResourceComment("Gas Leak Sensor");
		oci_GasLeakSensor.setResourceLabel("GasLeakSensor");
		oci_GasLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_HAS_GAS_LEAK_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_GasLeakSensor.addObjectProperty(GasLeakSensor.PROPERTY_RESETTING_GAS_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_GasLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasLeakSensor.PROPERTY_RESETTING_GAS_LEAK_OCCURENCE_STATUS,GasLeakSensor.MY_URI,1,1));		
		oci_CrimePreventionSensor.setResourceComment("Crime Prevention Sensor");
		oci_CrimePreventionSensor.setResourceLabel("CrimePreventionSensor");
		oci_CrimePreventionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_HAS_INVASION_OCCURENCE_STATUS).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_HAS_INVASION_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_CrimePreventionSensor.addObjectProperty(CrimePreventionSensor.PROPERTY_RESETTING_INVASION_OCCURENCE_STATUS).setFunctional();
		oci_CrimePreventionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CrimePreventionSensor.PROPERTY_RESETTING_INVASION_OCCURENCE_STATUS,CrimePreventionSensor.MY_URI,1,1));	
		oci_EmergencyButton.setResourceComment("");
		oci_EmergencyButton.setResourceLabel("EmergencyButton");
		oci_EmergencyButton.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_EmergencyButton.addObjectProperty(EmergencyButton.PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS).setFunctional();
		oci_EmergencyButton.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EmergencyButton.PROPERTY_HAS_EMERGENCY_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EmergencyButton.addObjectProperty(EmergencyButton.PROPERTY_RESETTING_EMERGENCY_OCCURENCE_STATUS).setFunctional();
		oci_EmergencyButton.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EmergencyButton.PROPERTY_RESETTING_EMERGENCY_OCCURENCE_STATUS,EmergencyButton.MY_URI,1,1));	
		oci_FirstAidSensor.setResourceComment("");
		oci_FirstAidSensor.setResourceLabel("FirstAidSensor");
		oci_FirstAidSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_HAS_FIRST_AID_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FirstAidSensor.addObjectProperty(FirstAidSensor.PROPERTY_RESETTING_FIRST_AID_OCCURENCE_STATUS).setFunctional();
		oci_FirstAidSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FirstAidSensor.PROPERTY_RESETTING_FIRST_AID_OCCURENCE_STATUS,FirstAidSensor.MY_URI,1,1));	
		oci_EarthquakeSensor.setResourceComment("");
		oci_EarthquakeSensor.setResourceLabel("EarthquakeSensor");
		oci_EarthquakeSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_EARTHQUAKE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_EARTHQUAKE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_EARTHQUAKE_OCCURENCE_STATUS,EarthquakeSensor.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_SI_VALUE).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_SI_VALUE,MeasuredValue.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_SI_VALUE).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_SI_VALUE,EarthquakeSensor.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_HAS_COLLAPSE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_EarthquakeSensor.addObjectProperty(EarthquakeSensor.PROPERTY_RESETTING_COLLAPSE_OCCURENCE_STATUS).setFunctional();
		oci_EarthquakeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(EarthquakeSensor.PROPERTY_RESETTING_COLLAPSE_OCCURENCE_STATUS,EarthquakeSensor.MY_URI,1,1));		
		oci_ElectricLeakSensor.setResourceComment("");
		oci_ElectricLeakSensor.setResourceLabel("ElectricLeakSensor");
		oci_ElectricLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_HAS_ELECTRIC_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_HAS_ELECTRIC_LEAK_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_ElectricLeakSensor.addObjectProperty(ElectricLeakSensor.PROPERTY_RESETTING_ELECTRIC_LEAK_OCCURENCE_STATUS).setFunctional();
		oci_ElectricLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLeakSensor.PROPERTY_RESETTING_ELECTRIC_LEAK_OCCURENCE_STATUS,ElectricLeakSensor.MY_URI,1,1));	
		oci_HumanDetectionSensor.setResourceComment("");
		oci_HumanDetectionSensor.setResourceLabel("HumanDetectionSensor");
		oci_HumanDetectionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumanDetectionSensor.addObjectProperty(HumanDetectionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_HumanDetectionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanDetectionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_HumanDetectionSensor.addObjectProperty(HumanDetectionSensor.PROPERTY_HAS_HUMAN_DETECTION_STATUS).setFunctional();
		oci_HumanDetectionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanDetectionSensor.PROPERTY_HAS_HUMAN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_VisitorSensor.setResourceComment("");
		oci_VisitorSensor.setResourceLabel("VisitorSensor");
		oci_VisitorSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VisitorSensor.addObjectProperty(VisitorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_VisitorSensor.addObjectProperty(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_STATUS).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_VisitorSensor.addObjectProperty(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME).setFunctional();
		oci_VisitorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VisitorSensor.PROPERTY_HAS_VISITOR_DETECTION_HOLDING_TIME,MeasuredValue.MY_URI,0,1));
		oci_CallSensor.setResourceComment("");
		oci_CallSensor.setResourceLabel("CallSensor");
		oci_CallSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CallSensor.addObjectProperty(CallSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CallSensor.addObjectProperty(CallSensor.PROPERTY_HAS_CALL_STATUS).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_CALL_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_CallSensor.addObjectProperty(CallSensor.PROPERTY_HAS_CALL_HOLDING_TIME).setFunctional();
		oci_CallSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CallSensor.PROPERTY_HAS_CALL_HOLDING_TIME,MeasuredValue.MY_URI,0,1));		
		oci_CondensationSensor.setResourceComment("");
		oci_CondensationSensor.setResourceLabel("CondensationSensor");
		oci_CondensationSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CondensationSensor.addObjectProperty(CondensationSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_CondensationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CondensationSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_CondensationSensor.addObjectProperty(CondensationSensor.PROPERTY_HAS_CONDENSATION_DETECTION_STATUS).setFunctional();
		oci_CondensationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CondensationSensor.PROPERTY_HAS_CONDENSATION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_AirPollutionSensor.setResourceComment("");
		oci_AirPollutionSensor.setResourceLabel("AirPollutionSensor");
		oci_AirPollutionSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirPollutionSensor.addObjectProperty(AirPollutionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_AirPollutionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPollutionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_AirPollutionSensor.addObjectProperty(AirPollutionSensor.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirPollutionSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPollutionSensor.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_OxygenSensor.setResourceComment("");
		oci_OxygenSensor.setResourceLabel("OxygenSensor");
		oci_OxygenSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OxygenSensor.addObjectProperty(OxygenSensor.PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION).setFunctional();
		oci_OxygenSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OxygenSensor.PROPERTY_HAS_MEASURED_VALUE_OF_OXYGEN_CONCENTRATION,MeasuredValue.MY_URI,1,1));	
		oci_IlluminanceSensor.setResourceComment("");
		oci_IlluminanceSensor.setResourceLabel("IlluminanceSensor");
		oci_IlluminanceSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_IlluminanceSensor.addObjectProperty(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1).setFunctional();
		oci_IlluminanceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_1,MeasuredValue.MY_URI,1,1));
		oci_IlluminanceSensor.addObjectProperty(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2).setFunctional();
		oci_IlluminanceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(IlluminanceSensor.PROPERTY_HAS_MEASURED_ILLUMINANCE_VALUE_2,MeasuredValue.MY_URI,1,1));	
		oci_SoundSensor.setResourceComment("");
		oci_SoundSensor.setResourceLabel("SoundSensor");
		oci_SoundSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SoundSensor.addObjectProperty(SoundSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SoundSensor.addObjectProperty(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_STATUS).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_SoundSensor.addObjectProperty(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME).setFunctional();
		oci_SoundSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SoundSensor.PROPERTY_HAS_SOUND_DETECTION_HOLDING_TIME,MeasuredValue.MY_URI,1,1));	
		oci_MailingSensor.setResourceComment("");
		oci_MailingSensor.setResourceLabel("MailingSensor");
		oci_MailingSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_MailingSensor.addObjectProperty(MailingSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_MailingSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MailingSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_MailingSensor.addObjectProperty(MailingSensor.PROPERTY_HAS_MAILING_DETECTION_STATUS).setFunctional();
		oci_MailingSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MailingSensor.PROPERTY_HAS_MAILING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_WeightSensor.setResourceComment("");
		oci_WeightSensor.setResourceLabel("WeightSensor");
		oci_WeightSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WeightSensor.addObjectProperty(WeightSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WeightSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeightSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WeightSensor.addObjectProperty(WeightSensor.PROPERTY_HAS_WEIGHT_DETECTION_STATUS).setFunctional();
		oci_WeightSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WeightSensor.PROPERTY_HAS_WEIGHT_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_TemperatureSensor.setResourceComment("");
		oci_TemperatureSensor.setResourceLabel("TemperatureSensor");
		oci_TemperatureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_TemperatureSensor.addObjectProperty(TemperatureSensor.PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE).setFunctional();
		oci_TemperatureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(TemperatureSensor.PROPERTY_HAS_MEASURED_TEMPERATURE_VALUE,MeasuredValue.MY_URI,1,1));		
		oci_HumiditySensor.setResourceComment("");
		oci_HumiditySensor.setResourceLabel("HumiditySensor");
		oci_HumiditySensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumiditySensor.addObjectProperty(HumiditySensor.PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE).setFunctional();
		oci_HumiditySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumiditySensor.PROPERTY_HAS_MEASURED_RELATIVE_HUMIDITY_VALUE,MeasuredValue.MY_URI,1,1));		
		oci_RainSensor.setResourceComment("");
		oci_RainSensor.setResourceLabel("RainSensor");
		oci_RainSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_RainSensor.addObjectProperty(RainSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_RainSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RainSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_RainSensor.addObjectProperty(RainSensor.PROPERTY_HAS_RAIN_DETECTION_STATUS).setFunctional();
		oci_RainSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(RainSensor.PROPERTY_HAS_RAIN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));		
		oci_WaterLevelSensor.setResourceComment("");
		oci_WaterLevelSensor.setResourceLabel("WaterLevelSensor");
		oci_WaterLevelSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterLevelSensor.addObjectProperty(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_WaterLevelSensor.addObjectProperty(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_WATER_LEVEL_OVER_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_WaterLevelSensor.addObjectProperty(WaterLevelSensor.PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE).setFunctional();
		oci_WaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLevelSensor.PROPERTY_HAS_MEASURED_WATER_LEVEL_VALUE,MeasuredValue.MY_URI,1,1));	
		oci_BathWaterLevelSensor.setResourceComment("");
		oci_BathWaterLevelSensor.setResourceLabel("BathWaterLevelSensor");
		oci_BathWaterLevelSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathWaterLevelSensor.addObjectProperty(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_THRESHOLD_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_BathWaterLevelSensor.addObjectProperty(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_BATH_WATER_LEVEL_OVER_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_BathWaterLevelSensor.addObjectProperty(BathWaterLevelSensor.PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE).setFunctional();
		oci_BathWaterLevelSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathWaterLevelSensor.PROPERTY_HAS_MEASURED_BATH_WATER_LEVEL_VALUE,MeasuredValue.MY_URI,1,1));	
		oci_BathHeatingStatusSensor.setResourceComment("");
		oci_BathHeatingStatusSensor.setResourceLabel("BathHeatingStatusSensor");
		oci_BathHeatingStatusSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathHeatingStatusSensor.addObjectProperty(BathHeatingStatusSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BathHeatingStatusSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathHeatingStatusSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_BathHeatingStatusSensor.addObjectProperty(BathHeatingStatusSensor.PROPERTY_HAS_BATH_HEATING_DETECTION_STATUS).setFunctional();
		oci_BathHeatingStatusSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathHeatingStatusSensor.PROPERTY_HAS_BATH_HEATING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_WaterLeakSensor.setResourceComment("");
		oci_WaterLeakSensor.setResourceLabel("WaterLeakSensor");
		oci_WaterLeakSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterLeakSensor.addObjectProperty(WaterLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLeakSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WaterLeakSensor.addObjectProperty(WaterLeakSensor.PROPERTY_HAS_WATER_LEAK_DETECTION_STATUS).setFunctional();
		oci_WaterLeakSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterLeakSensor.PROPERTY_HAS_WATER_LEAK_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_WaterOverflowSensor.setResourceComment("");
		oci_WaterOverflowSensor.setResourceLabel("WaterOverflowSensor");
		oci_WaterOverflowSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterOverflowSensor.addObjectProperty(WaterOverflowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_WaterOverflowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterOverflowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_WaterOverflowSensor.addObjectProperty(WaterOverflowSensor.PROPERTY_HAS_WATER_OVERFLOW_DETECTION_STATUS).setFunctional();
		oci_WaterOverflowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterOverflowSensor.PROPERTY_HAS_WATER_OVERFLOW_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_FireSensor.setResourceComment("");
		oci_FireSensor.setResourceLabel("FireSensor");
		oci_FireSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_HAS_FIRE_OCCURENCE_STATUS).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_HAS_FIRE_OCCURENCE_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FireSensor.addObjectProperty(FireSensor.PROPERTY_RESETTING_FIRE_OCCURENCE_STATUS).setFunctional();
		oci_FireSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FireSensor.PROPERTY_RESETTING_FIRE_OCCURENCE_STATUS,FireSensor.MY_URI,1,1));		
		oci_SmokeSensor.setResourceComment("");
		oci_SmokeSensor.setResourceLabel("SmokeSensor");
		oci_SmokeSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SmokeSensor.addObjectProperty(SmokeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SmokeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmokeSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SmokeSensor.addObjectProperty(SmokeSensor.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_SmokeSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SmokeSensor.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_CO2Sensor.setResourceComment("");
		oci_CO2Sensor.setResourceLabel("CO2Sensor");
		oci_CO2Sensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CO2Sensor.addObjectProperty(CO2Sensor.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION).setFunctional();
		oci_CO2Sensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CO2Sensor.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,MeasuredValue.MY_URI,1,1));	
		oci_GasSensor.setResourceComment("");
		oci_GasSensor.setResourceLabel("GasSensor");
		oci_GasSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GasSensor.addObjectProperty(GasSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_GasSensor.addObjectProperty(GasSensor.PROPERTY_HAS_GAS_DETECTION_STATUS).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_GAS_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_GasSensor.addObjectProperty(GasSensor.PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION).setFunctional();
		oci_GasSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GasSensor.PROPERTY_HAS_MEASURED_VALUE_OF_GAS_CONCENTRATION,MeasuredValue.MY_URI,1,1));	
		oci_VOCSensor.setResourceComment("");
		oci_VOCSensor.setResourceLabel("VOCSensor");
		oci_VOCSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VOCSensor.addObjectProperty(VOCSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_VOCSensor.addObjectProperty(VOCSensor.PROPERTY_HAS_VOC_DETECTION_STATUS).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_VOC_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_VOCSensor.addObjectProperty(VOCSensor.PROPERTY_HAS_MEASURED_VALUE_OF_VOC_CONCENTRATION).setFunctional();
		oci_VOCSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VOCSensor.PROPERTY_HAS_MEASURED_VALUE_OF_VOC_CONCENTRATION,MeasuredValue.MY_URI,1,1));	
		oci_PressureSensor.setResourceComment("");
		oci_PressureSensor.setResourceLabel("PressureSensor");
		oci_PressureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PressureSensor.addObjectProperty(PressureSensor.PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE).setFunctional();
		oci_PressureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PressureSensor.PROPERTY_HAS_MEASURED_DIFFIRENTIAL_PRESSURE_VALUE,MeasuredValue.MY_URI,1,1));		
		oci_AirSpeedSensor.setResourceComment("");
		oci_AirSpeedSensor.setResourceLabel("AirSpeedSensor");
		oci_AirSpeedSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirSpeedSensor.addObjectProperty(AirSpeedSensor.PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED).setFunctional();
		oci_AirSpeedSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirSpeedSensor.PROPERTY_HAS_MEASURED_VALUE_OF_AIR_SPEED,MeasuredValue.MY_URI,1,1));
		oci_AirSpeedSensor.addObjectProperty(AirSpeedSensor.PROPERTY_HAS_AIR_FLOW_DIRECTION).setFunctional();
		oci_AirSpeedSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirSpeedSensor.PROPERTY_HAS_AIR_FLOW_DIRECTION,MeasuredValue.MY_URI,0,1));		
		oci_OdorSensor.setResourceComment("");
		oci_OdorSensor.setResourceLabel("OdorSensor");
		oci_OdorSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OdorSensor.addObjectProperty(OdorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_OdorSensor.addObjectProperty(OdorSensor.PROPERTY_HAS_ODOR_DETECTION_STATUS).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_ODOR_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_OdorSensor.addObjectProperty(OdorSensor.PROPERTY_HAS_MEASURED_ODOR_VALUE).setFunctional();
		oci_OdorSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OdorSensor.PROPERTY_HAS_MEASURED_ODOR_VALUE,MeasuredValue.MY_URI,1,1));	
		oci_FlameSensor.setResourceComment("");
		oci_FlameSensor.setResourceLabel("FlameSensor");
		oci_FlameSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_HAS_FLAME_DETECTION_STATUS).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_HAS_FLAME_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_FlameSensor.addObjectProperty(FlameSensor.PROPERTY_RESETTING_FLAME_DETECTION_STATUS).setFunctional();
		oci_FlameSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FlameSensor.PROPERTY_RESETTING_FLAME_DETECTION_STATUS,FlameSensor.MY_URI,1,1));		
		oci_ElectricEnergySensor.setResourceComment("");
		oci_ElectricEnergySensor.setResourceLabel("ElectricEnergySensor");
		oci_ElectricEnergySensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY,MeasuredValue.MY_URI,1,1));
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_MEDIUM_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,MeasuredValue.MY_URI,0,1));
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_SMALL_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,MeasuredValue.MY_URI,0,1));
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_LARGE_CAPACITY_SENSOR_INSTANTANEOUS_ELECTRIC_ENERGY,MeasuredValue.MY_URI,0,1));
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_CUMULATIVE_AMOUNT_OF_ELECTRIC_ENERGY_MEASUREMENT_LOG,MeasuredValue.MY_URI,0,1));
		oci_ElectricEnergySensor.addObjectProperty(ElectricEnergySensor.PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE).setFunctional();
		oci_ElectricEnergySensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricEnergySensor.PROPERTY_HAS_EFFECTIVE_VOLTAGE_VALUE,MeasuredValue.MY_URI,0,1));
		oci_CurrentValueSensor.setResourceComment("");
		oci_CurrentValueSensor.setResourceLabel("CurrentValueSensor");
		oci_CurrentValueSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_CurrentValueSensor.addObjectProperty(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_1).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_1,MeasuredValue.MY_URI,1,1));
		oci_CurrentValueSensor.addObjectProperty(CurrentValueSensor.PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_RATED_VOLTAGE_TO_BE_MEASURED,MeasuredValue.MY_URI,0,1));
		oci_CurrentValueSensor.addObjectProperty(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_2).setFunctional();
		oci_CurrentValueSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(CurrentValueSensor.PROPERTY_HAS_MEASURED_CURRENT_VALUE_2,MeasuredValue.MY_URI,1,1));		
		oci_WaterFlowRateSensor.setResourceComment("");
		oci_WaterFlowRateSensor.setResourceLabel("WaterFlowRateSensor");
		oci_WaterFlowRateSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterFlowRateSensor.addObjectProperty(WaterFlowRateSensor.PROPERTY_HAS_CUMULATIVE_FLOW_RATE).setFunctional();
		oci_WaterFlowRateSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowRateSensor.PROPERTY_HAS_CUMULATIVE_FLOW_RATE,MeasuredValue.MY_URI,0,1));
		oci_WaterFlowRateSensor.addObjectProperty(WaterFlowRateSensor.PROPERTY_HAS_FLOW_RATE).setFunctional();
		oci_WaterFlowRateSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterFlowRateSensor.PROPERTY_HAS_FLOW_RATE,MeasuredValue.MY_URI,1,1));	
		oci_MicromotionsSensor.setResourceComment("");
		oci_MicromotionsSensor.setResourceLabel("MicromotionSensor");
		oci_MicromotionsSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_DETECTION_STATUS).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_DETECTION_COUNTER).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_DETECTION_COUNTER,MeasuredValue.MY_URI,0,1));
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_COUNT,MeasuredValue.MY_URI,0,1));
		oci_MicromotionsSensor.addObjectProperty(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE).setFunctional();
		oci_MicromotionsSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(MicromotionSensor.PROPERTY_HAS_MICROMOTION_SAMPLING_CYCLE,MeasuredValue.MY_URI,0,1));	
		oci_PassageSensor.setResourceComment("");
		oci_PassageSensor.setResourceLabel("PassageSensor");
		oci_PassageSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PassageSensor.addObjectProperty(PassageSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_PassageSensor.addObjectProperty(PassageSensor.PROPERTY_HAS_DETECTION_HOLD_TIME).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_HOLD_TIME,MeasuredValue.MY_URI,0,1));
		oci_PassageSensor.addObjectProperty(PassageSensor.PROPERTY_HAS_DETECTION_DIRECTION).setFunctional();
		oci_PassageSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PassageSensor.PROPERTY_HAS_DETECTION_DIRECTION,DetectionDirectionValue.MY_URI,1,1));	
		oci_BedPresenceSensor.setResourceComment("");
		oci_BedPresenceSensor.setResourceLabel("BedPresenceSensor");
		oci_BedPresenceSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BedPresenceSensor.addObjectProperty(BedPresenceSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_BedPresenceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BedPresenceSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_BedPresenceSensor.addObjectProperty(BedPresenceSensor.PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS).setFunctional();
		oci_BedPresenceSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BedPresenceSensor.PROPERTY_HAS_BED_PRESENCE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));	
		oci_OpenCloseSensor.setResourceComment("");
		oci_OpenCloseSensor.setResourceLabel("OpenCloseSensor");
		oci_OpenCloseSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_1,ThresholdLevelValue.MY_URI,1,1));
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_OpenCloseSensor.addObjectProperty(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2).setFunctional();
		oci_OpenCloseSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(OpenCloseSensor.PROPERTY_HAS_DEGREE_OF_OPENNING_DETECTION_STATUS_2,OccurenceStatusValue.MY_URI,1,1));		
		oci_ActivityMountSensor.setResourceComment("");
		oci_ActivityMountSensor.setResourceLabel("ActivityMountSensor");
		oci_ActivityMountSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1,ThresholdLevelValue.MY_URI,1,1));
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID,MeasuredValue.MY_URI,0,1));
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2,ThresholdLevelValue.MY_URI,1,1));
		oci_ActivityMountSensor.addObjectProperty(ActivityMountSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION).setFunctional();
		oci_ActivityMountSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ActivityMountSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_HumanBodyLocationSensor.setResourceComment("");
		oci_HumanBodyLocationSensor.setResourceLabel("HumanBodyLocationSensor");
		oci_HumanBodyLocationSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HumanBodyLocationSensor.addObjectProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1,LocationValue.MY_URI,1,1));
		oci_HumanBodyLocationSensor.addObjectProperty(HumanBodyLocationSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID,MeasuredValue.MY_URI,0,1));
		oci_HumanBodyLocationSensor.addObjectProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2,LocationValue.MY_URI,1,1));
		oci_HumanBodyLocationSensor.addObjectProperty(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION).setFunctional();
		oci_HumanBodyLocationSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HumanBodyLocationSensor.PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION,TypeMapper.getDatatypeURI(String.class),0,1));	
		oci_SnowSensor.setResourceComment("");
		oci_SnowSensor.setResourceLabel("SnowSensor");
		oci_SnowSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_SnowSensor.addObjectProperty(SnowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL).setFunctional();
		oci_SnowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SnowSensor.PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_SnowSensor.addObjectProperty(SnowSensor.PROPERTY_HAS_SNOW_DETECTION_STATUS).setFunctional();
		oci_SnowSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(SnowSensor.PROPERTY_HAS_SNOW_DETECTION_STATUS,OccurenceStatusValue.MY_URI,1,1));
		oci_AirPressureSensor.setResourceComment("");
		oci_AirPressureSensor.setResourceLabel("AirPressureSensor");
		oci_AirPressureSensor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirPressureSensor.addObjectProperty(AirPressureSensor.PROPERTY_HAS_MEASURED_AIR_PRESSURE).setFunctional();
		oci_AirPressureSensor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirPressureSensor.PROPERTY_HAS_MEASURED_AIR_PRESSURE,MeasuredValue.MY_URI,1,1));
		
		oci_HomeAirConditioner.setResourceComment("");
		oci_HomeAirConditioner.setResourceLabel("HomeAirConditioner");
		oci_HomeAirConditioner.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_TYPE_OF_OPERATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_TYPE_OF_OPERATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_CURRENT_SETTING_OF_TEMPERATURE,MeasuredValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RELATIVE_HUMIDITY_IN_DEHUMIDIFICATION_MODE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_COOLING_MODE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_HEATING_MODE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SETTING_TEMPERATURE_IN_DEHUMIDICATION_MODE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RATED_POWER_CONSUMPTION_IN_MODES,RatedPowerConsumptionInModeValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_CURRENT_CONSUMPTION,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,MeasuredValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_CURRENT_TEMPERATER_SETTING_OF_REMOTE_CONTROL,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_COOLED_AIR_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MEASURED_OUTDOOR_AIR_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_RELATIVE_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_CONTROL_OF_AIR_FLOW_DIRECTION_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AUTOMATIC_SWING_OF_AIR_FLOW_SETTING,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_VERTICAL_DIRECTION_SETTING,AirFlowDirectionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIRFLOW_HORIZONTAL_DIRECTION_SETTING,AirFlowDirectionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SPECIAL_STATE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SPECIAL_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_NON_PRIORITY_STATE).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_NON_PRIORITY_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_VENTILATION_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_VENTILATION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_HUMIDIFIER_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_DEGREE_OF_HUMIDIFICATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_CLEANING_METHOD,MountedAirCleaningPurifyingMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_PURIFIER_FUNCTION_SETTING,MountedAirCleaningPurifyingMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESHER_FUNCTION_SETTING,MountedAirRefreshingMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_AIR_REFRESH_METHOD,MountedAirRefreshingMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_METHOD,MountedAirSelfCleaningMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_MOUNTED_SELF_CLEANING_FUNCTION_SETTING,MountedAirSelfCleaningMethodValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_SPECIAL_FUNCTION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_SPECIAL_FUNCTION_SETTING,OperationFunctionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OPERATION_STATUS_OF_COMPONENTS,AirconditionerComponentOperationStatus.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_THERMOSTAT_SETTING_OVERRIDE_FUNCTION,OperationFunctionSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_AIR_PURIFICATION_MODE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_BUZZER).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_BUZZER,HomeAirConditioner.MY_URI,1,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));	
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_HomeAirConditioner.addObjectProperty(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_HomeAirConditioner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HomeAirConditioner.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		 
		oci_VentilationFan.setResourceComment("");
		oci_VentilationFan.setResourceLabel("VentilationFan");
		oci_VentilationFan.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_VentilationFan.addObjectProperty(VentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING).setFunctional();
		oci_VentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_VentilationFan.addObjectProperty(VentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE).setFunctional();
		oci_VentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(VentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE,ThresholdLevelValue.MY_URI,0,1));
			
		oci_AirConditionerVentilationFan.setResourceComment("");
		oci_AirConditionerVentilationFan.setResourceLabel("AirConditionerVentilationFan");
		oci_AirConditionerVentilationFan.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_SETTING_ROOM_RELATIVE_HUMIDITY,MeasuredValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_VENTILATION_AUTO_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,MeasuredValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_VALUE_OF_VENTILATION_AIR_FLOW_RATE,ThresholdLevelValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_HEAT_EXCHANGER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_MEASURED_VALUE_OF_CO2_CONCENTRATION,MeasuredValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_AirConditionerVentilationFan.addObjectProperty(AirConditionerVentilationFan.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirConditionerVentilationFan.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirConditionerVentilationFan.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_AirCleaner.setResourceComment("");
		oci_AirCleaner.setResourceLabel("AirCleaner");
		oci_AirCleaner.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_FILTER_CHANGE_NOTICE).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_FILTER_CHANGE_NOTICE,OccurenceStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_SMOKE_DETECTION_STATUS).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_SMOKE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_AirCleaner.addObjectProperty(AirCleaner.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS).setFunctional();
		oci_AirCleaner.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(AirCleaner.PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_Humidifier.setResourceComment("");
		oci_Humidifier.setResourceLabel("Humidifier");
		oci_Humidifier.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_RELATIVE_HUMIDIFYING_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_HUMIDIFYING_LEVEL_SETTING,ThresholdLevelValue.MY_URI,1,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_MEASURED_ROOM_RELATIVE_HUMIDITY,MeasuredValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_OFF_TIMER_RESERVATION_RELATIVE_TIME_VALUE,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_ION_EMISSION_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_ION_EMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD,IonEmissionMethodValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_Humidifier.addObjectProperty(Humidifier.PROPERTY_HAS_WATER_AMOUNT_LEVEL).setFunctional();
		oci_Humidifier.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(Humidifier.PROPERTY_HAS_WATER_AMOUNT_LEVEL,LiquidAmountLevelValue.MY_URI,0,1));
		
		oci_ElectricHeater.setResourceComment("");
		oci_ElectricHeater.setResourceLabel("ElectricHeater");
		oci_ElectricHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_MEASURED_ROOM_TEMPERATURE,MeasuredValue.MY_URI,1,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_REMOTELY_SET_TEMPERATURE).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_REMOTELY_SET_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricHeater.addObjectProperty(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_ElectricHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		
		
		oci_FanHeater.setResourceComment("");
		oci_FanHeater.setResourceLabel("FanHeater");
		oci_FanHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_TEMPERATURE_SETTING,MeasuredValue.MY_URI,1,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_EXTENSIONAL_OPERATION_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_ION_EMISSION_SETTING).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_ION_EMISSION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_IMPLEMENTED_ION_EMISSION_METHOD,OperationModeSettingValue.MY_URI,0,1));
		oci_FanHeater.addObjectProperty(FanHeater.PROPERTY_HAS_OIL_AMOUNT_LEVEL).setFunctional();
		oci_FanHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(FanHeater.PROPERTY_HAS_OIL_AMOUNT_LEVEL,LiquidAmountLevelValue.MY_URI,0,1));
		
		oci_ElectricStorageHeater.setResourceComment("");
		oci_ElectricStorageHeater.setResourceLabel("ElectricStorageHeater");
		oci_ElectricStorageHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION,MeasuredValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_INDOOR_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_OUTDOOR_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_OPERATION_STATUS).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_OPERATION_STATUS,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_OPERATION_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_HEAT_STORAGE_TEMPERATURE_SETTING,MeasuredValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MEASURED_STORED_HEAT_TEMPERATURE,MeasuredValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_DAYTIME_HEAT_STORAGE_ABILITY,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_DURATION_SETTING,MeasuredValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_MIDNIGHT_POWER_START_TIME_SETTING,MeasuredValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_RADIATION_METHOD).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_RADIATION_METHOD,RadiationMethodValue.MY_URI,1,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_CHILD_LOCK_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_CHILD_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_ON_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_ON_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_1_OFF_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_ON_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_ON_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricStorageHeater.addObjectProperty(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING).setFunctional();
		oci_ElectricStorageHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricStorageHeater.PROPERTY_HAS_FAN_TIMER_2_OFF_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		
		oci_PackageTypeCommercialAirconditionerIndoorUnit.setResourceComment("");
		oci_PackageTypeCommercialAirconditionerIndoorUnit.setResourceLabel("PackageTypeCommercialAirconditionerIndoorUnit");
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_MEASURED_INDOOR_UNIT_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_THERMOSTAT_STATE).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_THERMOSTAT_STATE,OperationStatusValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_CURRENT_FUNCTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_CURRENT_FUNCTION,OperationModeSettingValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_GROUP_INFOMRATION).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_GROUP_INFOMRATION,TypeMapper.getDatatypeURI(Date.class),1,1));
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerIndoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerIndoorUnit.PROPERTY_HAS_POWER_CONSUMPTION_RANGE_INDOOR_UNIT,PowerConsumptionRange.MY_URI,0,1));
	
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.setResourceComment("");
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.setResourceLabel("PackageTypeCommercialAirconditionerOutdoorUnit");
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_OUTDOOR_UNIT_RATED_POWER_CONSUMPTION,MeasuredValue.MY_URI,0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION,MeasuredValue.MY_URI,0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SPECIAL_STATE).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SPECIAL_STATE,OperationStateSettingValue.MY_URI,0,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_GROUP_INFOMRATION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_GROUP_INFOMRATION,TypeMapper.getDatatypeURI(String.class),1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MEASURED_OUTDOOR_UNIT_POWER_CONSUMPTION,MeasuredValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_POSSIBLE_POWER_SAVING_FOR_OUTDOOR_UNIT,MeasuredValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT).setFunctional();
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_SETTING_RESTRICTING_POWER_CONSUMPTION_FOR_OUTDOOR_UNIT,MeasuredValue.MY_URI,1,1));
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addObjectProperty(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT).setFunctional();	
		oci_PackageTypeCommercialAirconditionerOutdoorUnit.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(PackageTypeCommercialAirConditionerOutdoorUnit.PROPERTY_HAS_MINUMUM_POWER_CONSUMPTION_FOR_RESTRICTED_OUTDOOR_UNIT,MeasuredValue.MY_URI,0,1));
		
		
		oci_ElectricBlind.setResourceComment("");
		oci_ElectricBlind.setResourceLabel("ElectricBlind");
		oci_ElectricBlind.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_WIND_DETECTION_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_WIND_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SUN_LIGHT_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_CLOSING_SPEED_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPERATION_TIME,MeasuredValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_SHADE_ANGLE_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SHADE_ANGLE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SPEED).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_SPEED,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricBlind.addObjectProperty(ElectricBlind.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricBlind.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricBlind.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricShuttler.setResourceComment("");
		oci_ElectricShuttler.setResourceLabel("ElectricShuttler");
		oci_ElectricShuttler.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPERATION_TIME,MeasuredValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SPEED).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_SPEED,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricShuttler.addObjectProperty(ElectricShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricShuttler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		
		oci_ElectricRainSlidingShutter.setResourceComment("");
		oci_ElectricRainSlidingShutter.setResourceLabel("ElectricRainSlidingShutter");
		oci_ElectricRainSlidingShutter.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPERATION_TIME,MeasuredValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_BLIND_ANGLE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_SLIT_DEGREE_OF_OPENING_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricRainSlidingShutter.addObjectProperty(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricRainSlidingShutter.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricRainSlidingShutter.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricGate.setResourceComment("");
		oci_ElectricGate.setResourceLabel("ElectricGate");
		oci_ElectricGate.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE,MeasuredValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricGate.addObjectProperty(ElectricGate.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricGate.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricGate.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricWindow.setResourceComment("");
		oci_ElectricWindow.setResourceLabel("ElectricWindow");
		oci_ElectricWindow.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_TIMER_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_TIMER_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_REGISTERED_TEMPERATURE_DETECTION_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_REGISTERED_TEMPERATURE_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_RAIN_DETECTION_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_RAIN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPERATION_TIME).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPERATION_TIME,MeasuredValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_AUTOMATIC_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_DEGREE_OF_OPENING_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ELECTRIC_LOCK_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ELECTRIC_LOCK_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricWindow.addObjectProperty(ElectricWindow.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricWindow.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricWindow.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_ElectricSlidingDoor.setResourceComment("");
		oci_ElectricSlidingDoor.setResourceLabel("ElectricSlidingDoor");
		oci_ElectricSlidingDoor.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_FAULT_DESCRIPTION).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_FAULT_DESCRIPTION,FaultDesciptionValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPERATION_TIME_SETTING_VALUE,MeasuredValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_TIME_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_TIME_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_OPERATION_SETTING,OperationFunctionSettingValue.MY_URI,1,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_DEGREE_OF_OPENING_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_DEGREE_OF_OPENING_SETTING,MeasuredValue.MY_URI,1,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPENING_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_REMOTE_OPERATION_SETTING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_SELECTIVE_OPENING_OPERATION_SETTING,SelectiveOpeningOperationSettingValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_OPEN_CLOSE_STATUS,OperationStateSettingValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_OPENING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricSlidingDoor.addObjectProperty(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING).setFunctional();
		oci_ElectricSlidingDoor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricSlidingDoor.PROPERTY_HAS_ONE_TIME_CLOSING_SPEED_SETTING,ThresholdLevelValue.MY_URI,0,1));
		
		oci_GardenSprinkler.setResourceComment("");
		oci_GardenSprinkler.setResourceLabel("GardenSprinkler");
		oci_GardenSprinkler.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING,IntervalSettingValue.MY_URI,0,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING,NumberOfSprinkleSettingValue.MY_URI,0,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_1).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_1,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_2).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_TIME_SETTING_2,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_GardenSprinkler.addObjectProperty(GardenSprinkler.PROPERTY_HAS_SPRINKLE_DURATION_SETTING).setFunctional();
		oci_GardenSprinkler.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(GardenSprinkler.PROPERTY_HAS_SPRINKLE_DURATION_SETTING,MeasuredValue.MY_URI,0,1));
	
		oci_WaterHeater.setResourceComment("");
		oci_WaterHeater.setResourceLabel("WaterHeater");
		oci_WaterHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_WATER_HEATING_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_TEMPERATURE_CONTROL_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_WATER_HEATER_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_WATER_HEATER_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_WATER_HEATING_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_WATER_HEATING_STOP_DAY_SETTING,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_FOR_MANUAL_WATER_HEATING_OFF_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_TANK_OPERATION_MODE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TANK_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DAYTIME_REHEATING_PERMISSION_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MEASURED_WATER_TEMPERATURE_OF_WATER_HEATER,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ALARM_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ALARM_STATUS,AlarmStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,1,1));	
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RELATIVE_TIME_SETTING_FOR_KEEPING_BATH_TEMPERATURE,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TEMPERATURE_OF_SUPPLIED_WATER_SETTING,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MEASURED_AMOUNT_OF_REMAINING_WATER_IN_TANK,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_TANK_CAPACITY).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_TANK_CAPACITY,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_AUTOMATIC_BATH_WATER_HEATING_MODE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR,OperationStateSettingValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_BATH_HOT_WATER_ADDITION_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MANUAL_LUKEWARM_WATER_TEMPERATURE_LOWERING_FUNCTION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETABLE_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ON_TIMER_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ON_TIMER_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_VOLUME_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_VOLUME_SETTING,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_MUTE_SETTING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_MUTE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_REMAINING_HOT_WATER_VOLUME,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_SURPLUS_ELECTRIC_ENERGY_POWER_PREDICTION_VALUE,SurplusElectricEnergyPowerPredictionValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_WINTER,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_BETWEEN_SEASON,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_RATED_POWER_CONSUMPTION_OF_HP_UNIT_IN_SUMMER,MeasuredValue.MY_URI,0,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_PARTICIPATION_IN_ENERGY_SHIFT,OperationStatusValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_STANDARD_TIME_TO_START_HEATING,TypeMapper.getDatatypeURI(Date.class),1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_NUMBER_OF_ENERGY_SHIFTS,MeasuredValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_1,TypeMapper.getDatatypeURI(Date.class),1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_1,MeasuredValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_1,MeasuredValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_DATETIME_HEATING_SHIFT_TIME_2,TypeMapper.getDatatypeURI(Date.class),1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_EXPECTED_ENERYGY_OF_DATETIME_HEATING_SHIFT_TIME_2,MeasuredValue.MY_URI,1,1));
		oci_WaterHeater.addObjectProperty(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2).setFunctional();
		oci_WaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(WaterHeater.PROPERTY_HAS_ENERGY_CONSUMPTION_PER_HOUR_2,MeasuredValue.MY_URI,1,1));
		
		
		oci_ElectricToiletSeat.setResourceComment("");
		oci_ElectricToiletSeat.setResourceLabel("ElectricToiletSeat");
		oci_ElectricToiletSeat.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPERATURE_LEVEL,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_HEATER_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_SETTING,OperationFunctionSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_START_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_TOILET_SEAT_TEMPORAL_HALT_DURATION,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_TEMPERATURE_LEVEL_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_START_TIME).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_START_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_DURATION).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_ROOM_HEATING_DURATION,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_SPECIAL_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_HUMAN_DETECTION_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_HUMAN_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricToiletSeat.addObjectProperty(ElectricToiletSeat.PROPERTY_HAS_SEATING_DETECTION_STATUS).setFunctional();
		oci_ElectricToiletSeat.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricToiletSeat.PROPERTY_HAS_SEATING_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		
		oci_ElectricLock.setResourceComment("");
		oci_ElectricLock.setResourceLabel("ElectricLock");
		oci_ElectricLock.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_SETTING_1).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_SETTING_1,OperationModeSettingValue.MY_URI,1,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_SETTING_2).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_SETTING_2,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_DOOR_GUARD_LOCK_STATUS,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS,OperationModeSettingValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_OCCUPANT_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_OCCUPANT_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_ALARM_STATUS).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_ALARM_STATUS,AlarmStatusValue.MY_URI,1,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_AUTO_LOCK_MODE_SETTING).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_AUTO_LOCK_MODE_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_ElectricLock.addObjectProperty(ElectricLock.PROPERTY_HAS_LOCK_BATTERY_LEVEL).setFunctional();
		oci_ElectricLock.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(ElectricLock.PROPERTY_HAS_LOCK_BATTERY_LEVEL,OperationStateSettingValue.MY_URI,1,1));
		
		oci_InstantaneousWaterHeater.setResourceComment("");
		oci_InstantaneousWaterHeater.setResourceLabel("InstantaneousWaterHeater");
		oci_InstantaneousWaterHeater.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_HEATING_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_HEATING_STATUS,OperationStatusValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_WARMER_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_HOT_WATER_WARMER_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_DURATION_OF_AUTOMATIC_OPERATION_SETTING,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_REMAINING_AUTOMATIC_OPERATION_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_TEMPERATURE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_TEMPERATURE_SETTING,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_HEATER_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_HEATER_STATUS,OperationModeSettingValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_AUTO_MODE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_AUTO_MODE_SETTING,OperationStatusValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_ADDITIONAL_BOILUP_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_HOT_WATER_ADDING_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_LOWERING_OPERATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_1,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_2,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_3,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_WATER_VOLUME_SETTING_4_MAXIMUM_SETTABLE_LEVEL,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATHROOM_PRIORITY_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_SHOWER_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_KITCHEN_HOT_WATER_SUPPLY_STATUS,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_WATER_WARMER_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_BATH_OPERATION_STATUS_MONITOR,OperationStateSettingValue.MY_URI,1,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_VOLUME_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_VOLUME_SETTING,MeasuredValue.MY_URI,0,1));
		oci_InstantaneousWaterHeater.addObjectProperty(InstantaneousWaterHeater.PROPERTY_HAS_MUTE_SETTING).setFunctional();
		oci_InstantaneousWaterHeater.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(InstantaneousWaterHeater.PROPERTY_HAS_MUTE_SETTING,OperationStatusValue.MY_URI,0,1));
		
		
		oci_BathRoomHeaterDryer.setResourceComment("");
		oci_BathRoomHeaterDryer.setResourceLabel("BathRoomHeaterDryer");
		oci_BathRoomHeaterDryer.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OPERATION_MODE_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OPERATION_MODE_SETTING,OperationModeSettingValue.MY_URI,1,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_PRE_WARM_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_HEATER_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_DRYER_OPERATION_SETTING,ThresholdLevelValue.MY_URI,1,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_BATHROOM_AIR_CICURLATOR_OPERATION_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_RELATIVE_HUMIDITY,MeasuredValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_MEASURED_BATHROOM_TEMPERATURE,MeasuredValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_VENTILATION_AIR_FLOW_RATE_SETTING,ThresholdLevelValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_FILTER_CLEANING_REMINDER_SIGN_SETTING,OccurenceStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_HUMAN_BODY_DETECTION_STATUS,OccurenceStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_1,OperationStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_BASED_RESERVATION_SETTING_2,OperationModeSettingValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_BASED_RESERVATION_SETTING,OperationStatusValue.MY_URI,0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		oci_BathRoomHeaterDryer.addObjectProperty(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).setFunctional();
		oci_BathRoomHeaterDryer.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(BathRoomHeaterDryer.PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME,TypeMapper.getDatatypeURI(Date.class),0,1));
		
		oci_HouseHoldSolarPowerGeneration.setResourceComment("");
		oci_HouseHoldSolarPowerGeneration.setResourceLabel("HouseHoldSolarPowerGeneration");
		oci_HouseHoldSolarPowerGeneration.addSuperClass(EchonetSuperDevice.MY_URI);
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_SYSTEM_INTERCONNECT_TYPE,OperationFunctionSettingValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_INSTANTANEOUS_ELECTRIC_ENERGY_GENERATED_AMOUNT,MeasuredValue.MY_URI,1,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT,MeasuredValue.MY_URI,1,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_GENERATED_AMOUNT,HouseHoldSolarPowerGeneration.MY_URI,10,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_MEASURED_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT,MeasuredValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_RESETTING_CUMMULATIVE_ELECTRIC_ENERGY_SOLD_AMOUNT,HouseHoldSolarPowerGeneration.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_1,MeasuredValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_POWER_GENERATION_OUTPUT_LIMIT_SETTING_2,MeasuredValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_AMOUNT_OF_ELECTRICITY_SOLD_LIMIT_SETTING,MeasuredValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_SYSTEM_INTERCONNECTED,MeasuredValue.MY_URI,0,1));
		oci_HouseHoldSolarPowerGeneration.addObjectProperty(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT).setFunctional();
		oci_HouseHoldSolarPowerGeneration.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality
				(HouseHoldSolarPowerGeneration.PROPERTY_HAS_REATED_POWER_GENERATION_OUTPUT_INDEPENDENT,MeasuredValue.MY_URI,0,1));
		
		
	}
}
