package org.universAAL.ontology.echonet.airconditionerRelatedDevices;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;

public class AirCleaner extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirCleaner";
	public static final String PROPERTY_HAS_FILTER_CHANGE_NOTICE = EchonetOntology.NAMESPACE +"AirCleanerHasFilterChangeNotice";
	public static final String PROPERTY_HAS_AIR_FLOW_RATE_SETTING = EchonetOntology.NAMESPACE + "AirCleanerHasAirFlowRateSetting";
	public static final String PROPERTY_HAS_SMOKE_DETECTION_STATUS = EchonetOntology.NAMESPACE + "AirCleanerHasSmokeDetectionStatus";
	public static final String PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING = EchonetOntology.NAMESPACE + 
																				 "AirCleanerHasOpticalCatalystOperationSetting";
	public static final String PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS = EchonetOntology.NAMESPACE + "AirCleanerHasAirPollutionDetectionStatus";
	
	public OccurenceStatusValue getAirPollutionDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS);
	}
	public void setAirPollutionDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_POLLUTION_DETECTION_STATUS, msg);
	}
	public OperationStatusValue getOpticalCatalystOperationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING);
	}
	public void setOpticalCatalystOperationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPTICAL_CATALYST_OPERATION_SETTING, msg);
	}
	public OccurenceStatusValue getSmokeDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS);	
	}
	public void setSmokeDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_SMOKE_DETECTION_STATUS,msg);	
	}
	public ThresholdLevelValue getAirFlowRateSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING);	
	}
	public void setAirFlowRateSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AIR_FLOW_RATE_SETTING, msg);	
	}
	public OccurenceStatusValue getFilterChangeNotice() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FILTER_CHANGE_NOTICE);	
	}
	public void setFilterChangeNotice(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_FILTER_CHANGE_NOTICE,msg);	
	}

	public AirCleaner() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
	}
	public AirCleaner(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.AirConditionerRelatedDevice);
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
