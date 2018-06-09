
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.device.TemperatureSensor;
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
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.GasMetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.GeneralLighting;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HighVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HouseHoldSmallWindTurbinePowerGeneration;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.HouseHoldSolarPowerGeneration;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.InstantaneousWaterHeater;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.KeroseneMetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LPGasMetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LightingSystem;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.LowVoltageSmartElectricEnergy;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.MonoFunctionLighting;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.PowerDistributionBoardMetering;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.SmartGasMetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.SmartKeroseneMetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.StorageBattery;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.VehicleCharger;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WaterFlowmetter;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WaterHeater;
import org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices.WattHourMetter;
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
import org.universAAL.ontology.echonet.sensorRelatedDevices.VOCSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.VisitorSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterFlowRateSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterLeakSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterLevelSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WaterOverflowSensor;
import org.universAAL.ontology.echonet.sensorRelatedDevices.WeightSensor;

/**
 * @author Pham Van Cu
 */
public class EchonetFactory implements ResourceFactory {
	// private static final int NAMESPACE_LENGTH = LIGHTING_NAMESPACE.length();
	// private static final String PROP_ORIG_INDIVIDUAL = LIGHTING_NAMESPACE
	// + LightingFactory.class.hashCode();
	
	public static final int ACTIVITY_AMOUNT_SENSOR = 0;
	public static final int AIR_POLLUTION_SENSOR = 0;
	public EchonetFactory() {
		super();
	}

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

		switch (factoryIndex) {
		//Sensor device
			case ACTIVITY_AMOUNT_SENSOR:
				return new ActivityMountSensor(instanceURI);
			case 1:
				return new AirPollutionSensor(instanceURI);
			case 2:
				return new AirPressureSensor(instanceURI);
			case 3:
				return new BathHeatingStatusSensor(instanceURI);
			case 4:
				return new BathWaterLevelSensor(instanceURI);
			case 5:
				return new BedPresenceSensor(instanceURI);
			case 6:
				return new CallSensor(instanceURI);
			case 7:
				return new CO2Sensor(instanceURI);
			case 8:
				return new CondensationSensor(instanceURI);
			case 9:
				return new CrimePreventionSensor(instanceURI);
			case 10:
				return new CurrentValueSensor(instanceURI);
			case 11:
				return new EarthquakeSensor(instanceURI);
			case 12:
				return new ElectricEnergySensor(instanceURI);		
			case 13:
				return new ElectricLeakSensor(instanceURI);
			case 14:
				return new EmergencyButton(instanceURI);
			case 15:
				return new FireSensor(instanceURI);
			case 16:
				return new FirstAidSensor(instanceURI);
			case 17:
				return new FlameSensor(instanceURI);
			case 18:
				return new GasLeakSensor(instanceURI);
			case 19:
				return new GasSensor(instanceURI);
			case 20:
				return new HumanBodyLocationSensor(instanceURI);
			case 21:
				return new HumanDetectionSensor(instanceURI);
			case 22:
				return new HumiditySensor(instanceURI);
			case 23:
				return new IlluminanceSensor(instanceURI);
			case 24:
				return new MailingSensor(instanceURI);
			case 25:
				return new MicromotionSensor(instanceURI);
			case 26:
				return new OdorSensor(instanceURI);
			case 27:
				return new OpenCloseSensor(instanceURI);
			case 28:
				return new OxygenSensor(instanceURI);
			case 29:
				return new PassageSensor(instanceURI);
			case 30:
				return new PressureSensor(instanceURI);	
			case 31:
				return new RainSensor(instanceURI);
			case 32:
				return new SmokeSensor(instanceURI);
			case 33:
				return new SoundSensor(instanceURI);
			case 34:
				return new TemperatureSensor(instanceURI);
			case 35:
				return new VisitorSensor(instanceURI);
			case 36:
				return new VOCSensor(instanceURI);
			case 37:
				return new WaterFlowRateSensor(instanceURI);
			case 38:
				return new WaterLeakSensor(instanceURI);
			case 39:
				return new WaterLevelSensor(instanceURI);
			case 40:
				return new WaterOverflowSensor(instanceURI);
			case 41:
				return new WeightSensor(instanceURI);
			case 42:
				return new AirSpeedSensor(instanceURI);
			case 43:
				return new SnowSensor(instanceURI);			
		//Airconditioner Related Devices
			case 44:
				return new AirCleaner(instanceURI);
			case 45:
				return new AirConditionerVentilationFan(instanceURI);
			case 46:
				return new ElectricHeater(instanceURI);
			case 47:
				return new ElectricStorageHeater(instanceURI);
			case 48:
				return new FanHeater(instanceURI);
			case 49:
				return new HomeAirConditioner(instanceURI);
			case 50:
				return new Humidifier(instanceURI);
			case 51:
				return new PackageTypeCommercialAirConditionerIndoorUnit(instanceURI);
			case 52:
				return new PackageTypeCommercialAirConditionerOutdoorUnit(instanceURI);
			case 53:
				return new VentilationFan(instanceURI);
				//Housing facilities Related devices	
			case 54:
				return new BathRoomHeaterDryer(instanceURI);
			case 55:
				return new Buzzer(instanceURI);
			case 56:
				return new ColdHotWaterHeatSourceEquipment(instanceURI);
			case 57:
				return new ElectricBlind(instanceURI);
			case 58:
				return new ElectricGate(instanceURI);
			case 59:
				return new ElectricLock(instanceURI);
			case 60:
				return new ElectricRainSlidingShutter(instanceURI);
			case 61:
				return new ElectricShutter(instanceURI);
			case 62:
				return new ElectricSlidingDoor(instanceURI);
			case 63:
				return new ElectricToiletSeat(instanceURI);
			case 64:
				return new ElectricVehicleChargerDischager(instanceURI);
			case 65:
				return new ElectricWindow(instanceURI);
			case 66:
				return new EngineCogeneration(instanceURI);
			case 67:
				return new FloorHeater(instanceURI);
			case 68:
				return new FuelCell(instanceURI);
			case 69:
				return new GardenSprinkler(instanceURI);
			case 70:
				return new GasMetter(instanceURI);
			case 71:
				return new GeneralLighting(instanceURI);
			case 72:
				return new HighVoltageSmartElectricEnergy(instanceURI);
			case 73:
				return new HouseHoldSmallWindTurbinePowerGeneration(instanceURI);
			case 74:
				return new HouseHoldSolarPowerGeneration(instanceURI);
			case 75:
				return new InstantaneousWaterHeater(instanceURI);
			case 76:
				return new KeroseneMetter(instanceURI);
			case 77:
				return new LightingSystem(instanceURI);
			case 78:
				return new LowVoltageSmartElectricEnergy(instanceURI);
			case 79:
				return new LPGasMetter(instanceURI);
			case 80: 
				return new MonoFunctionLighting(instanceURI);
			case 81:
				return new PowerDistributionBoardMetering(instanceURI);
			case 82:
				return new SmartGasMetter(instanceURI);
			case 83:
				return new SmartKeroseneMetter(instanceURI);
			case 84:
				return new StorageBattery(instanceURI);
			case 85:
				return new VehicleCharger(instanceURI);
			case 86:
				return new WaterFlowmetter(instanceURI);
			case 87:
				return new WaterHeater(instanceURI);
			case 88:
				return new WattHourMetter(instanceURI);
			//Cooking Household Related Devices	
			case 89:
				return new ClothesDryer(instanceURI);
			case 90: 
				return new CombinationMicrowaveOven(instanceURI);
			case 91:
				return new CommercialShowcase(instanceURI);
			case 92:
				return new CommercialShowcaseOutdoorUnit(instanceURI);
			case 93:
				return new CookingHeater(instanceURI);
			case 94:
				return new ElectricHotWaterPot(instanceURI);
			case 95:
				return new Refrigerator(instanceURI);
			case 96:
				return new RiceCooker(instanceURI);
			case 97:
				return new WasherDryer(instanceURI);
			case 98:
				return new WashingMachine(instanceURI);
			//Health Relared Devices	
			case 99:
				return new WeighingMachine(instanceURI);
			//Management Operation Related Devices
			case 100:
				return new Controller(instanceURI);
			case 101:
				return new ParallelProcessingCombinationTypePowerControl(instanceURI);
			case 102:
				return new Switch(instanceURI);
			// Audiovisual Related Devices
			case 103:
				return new Audio(instanceURI);
			case 104:
				return new Display(instanceURI);
			case 105:
				return new NetworkCamera(instanceURI);
			case 106:
				return new Television(instanceURI);
		}

		return null;
	}
}
