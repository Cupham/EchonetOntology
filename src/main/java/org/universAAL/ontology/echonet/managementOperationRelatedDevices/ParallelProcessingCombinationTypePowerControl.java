package org.universAAL.ontology.echonet.managementOperationRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;

public class ParallelProcessingCombinationTypePowerControl extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ParallelProcessingCombinationTypePowerControl";
	public static final String PROPERTY_SET_POWER_DEVIATION_INFORMATION= EchonetOntology.NAMESPACE + "SettingPowerDeviationInformation";
	public static final String PROPERTY_SET_POWER_REDUCTION_INFORMATION= EchonetOntology.NAMESPACE + "SettingPowerReductionInformation";
	public static final String PROPERTY_SET_TRANSMISSION_INTERVAL= EchonetOntology.NAMESPACE + "SettingTransmissionInterval";
	public static final String PROPERTY_SET_RATED_POWER_CONSUMPTION_THRESHOLD= EchonetOntology.NAMESPACE + "SettingRatedPowerConsumptionThreshold";
	
	
	public ParallelProcessingCombinationTypePowerControl() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
	}
	public ParallelProcessingCombinationTypePowerControl(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
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
	

}
