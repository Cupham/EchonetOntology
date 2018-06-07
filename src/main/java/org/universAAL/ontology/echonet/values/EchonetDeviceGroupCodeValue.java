package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class EchonetDeviceGroupCodeValue extends ManagedIndividual{
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EchonetDeviceGroupCodeValue";
	public static final int SENSOR_RELATED_DEVICE = 0;
	public static final int AIRCONDITIONER_RELATED_DEVICE = 1;
	public static final int HOUSING_FACILITY_RELATED_DEVICE = 2;
	public static final int COOKING_HOUSEHOLD_RELATED_DEVICE = 3;
	public static final int HEALTH_RELATED_DEVICE = 4;
	public static final int MANAGEMENT_OPERATION_RELATED_DEVICE = 5;
	public static final int AUDIOVISUAL_RELATED_DEVICE = 6;
	
	private static final String[] names = {"SensorDelatedDeviceGroupCode", "AirconditionerRelatedDeviceGroupCode",
											"HousingFacilityRelatedDeviceGroupCode", "CookingHouseholdRelatedDeviceGroupCode",
											"HealthRelatedDeviceGroupCode", "ManagementOperationRelatedDeviceGroupCode",
											"AudiovisualRelatedDeviceGroupCode"};
	public static final EchonetDeviceGroupCodeValue SensorRelatedDevice = new EchonetDeviceGroupCodeValue(SENSOR_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue AirConditionerRelatedDevice = new EchonetDeviceGroupCodeValue(AIRCONDITIONER_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue HousingFacilityRelatedDevice = new EchonetDeviceGroupCodeValue(HOUSING_FACILITY_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue CookingHouseholdRelatedDevice = new EchonetDeviceGroupCodeValue(COOKING_HOUSEHOLD_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue HealthRelatedDevice = new EchonetDeviceGroupCodeValue(HEALTH_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue ManagementOperationRelatedDevice = new EchonetDeviceGroupCodeValue(MANAGEMENT_OPERATION_RELATED_DEVICE);
	public static final EchonetDeviceGroupCodeValue AudiovisualRelatedDevice = new EchonetDeviceGroupCodeValue(AUDIOVISUAL_RELATED_DEVICE);
	
	private int order;
	
	private EchonetDeviceGroupCodeValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}
	
	public static EchonetDeviceGroupCodeValue getDeviceGroupByOrder(int order) {
		switch (order) {
		case SENSOR_RELATED_DEVICE:
			return SensorRelatedDevice;
		case AIRCONDITIONER_RELATED_DEVICE:
			return AirConditionerRelatedDevice;
		case HOUSING_FACILITY_RELATED_DEVICE:
			return HousingFacilityRelatedDevice;
		case COOKING_HOUSEHOLD_RELATED_DEVICE:
			return CookingHouseholdRelatedDevice;
		case HEALTH_RELATED_DEVICE:
			return HealthRelatedDevice;
		case MANAGEMENT_OPERATION_RELATED_DEVICE:
			return ManagementOperationRelatedDevice;
		case AUDIOVISUAL_RELATED_DEVICE:
			return AudiovisualRelatedDevice;
		default:
			return null;
		}
	}
	public static final EchonetDeviceGroupCodeValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = SENSOR_RELATED_DEVICE; i <= AUDIOVISUAL_RELATED_DEVICE; i++)
			if (names[i].equals(name))
				return getDeviceGroupByOrder(i);
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
	public String name() {
		return names[order];
	}

}
