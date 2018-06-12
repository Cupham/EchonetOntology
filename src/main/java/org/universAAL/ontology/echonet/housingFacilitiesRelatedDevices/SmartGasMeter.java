package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MeasurementUnit;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.TypeClassificationValue;

public class SmartGasMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SmartGasMetter";
	public static final String PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING = EchonetOntology.NAMESPACE + "HasGasMetterClassificationSetting";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "HasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_UNIT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionHistoricalData";
	public static final String PROPERTY_HAS_DAY_TO_RETRIEVE_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasDayToRetrieveMeasuredCummulativeGasConsumptionHistoricalData";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "HasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "HasSecurityDataInformation";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "HasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "HasVerificationExpirationInformation";
	public static final String PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER = EchonetOntology.NAMESPACE + "HasValveClosureByTheCenter";
	public static final String PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER = EchonetOntology.NAMESPACE + "HasPermissionFromTheCenterToReopenTheValveClosedByTheCenter";
	public static final String PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE = EchonetOntology.NAMESPACE + "HasEmergencyClosureOfShutoffValve";
	public static final String PROPERTY_HAS_SHUTOFF_VALVE_STATUS = EchonetOntology.NAMESPACE + "HasShutoffValveStatus";
	public static final String PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS = EchonetOntology.NAMESPACE + "HasHistoricalDataOfShutoffReasons";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionInformationDateTimeIncluded";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionHistoricalInformationDateTimeIncluded";
	
	
	public MeasuredValue getMeasuredCummulativeGasConsumptionHistoricalInformationDateTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCummulativeGasConsumptionHistoricalInformationDateTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumptionInformationDateTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCummulativeGasConsumptionInformationDateTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public String getHistoricalDataOfShutoffReasons() {
		return (String) getProperty(PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS);	
	}
	public void setHistoricalDataOfShutoffReasons(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HISTORICAL_DATA_OF_SHUTOFF_REASONS, msg);	
	}
	
	public OperationStatusValue getShutoffValveStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE);	
	}
	public void setShutoffValveStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE, msg);	
	}
	public OccurenceStatusValue getEmergencyClosureOfShutoffValve() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE);	
	}
	public void setEmergencyClosureOfShutoffValve(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_EMERGENCY_CLOSURE_OF_SHUTOFF_VALVE, msg);	
	}
	
	public OperationStatusValue getPermissionFromTheCenterToReopenTheValveClosedByTheCenter() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER);	
	}
	public void setPermissionFromTheCenterToReopenTheValveClosedByTheCenter(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PERMISSION_FROM_THE_CENTER_TO_REOPEN_VALUE_CLOSED_BY_THE_CENTER, msg);	
	}
	public OperationStatusValue getValveClosureByTheCenter() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER);	
	}
	public void setValveClosureByTheCenter(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_VALVE_CLOSURE_BY_THE_CENTER, msg);	
	}
	public Date getVerificationExpirationInformation() {
		return (Date) getProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION);	
	}
	public void setVerificationExpirationInformation(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_VERIFICATION_EXPIRATION_INFORMATION, msg);	
	}
	public String getIDNumberSetting() {
		return (String) getProperty(PROPERTY_HAS_ID_NUMBER_SETTING);	
	}
	public void setIDNumberSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ID_NUMBER_SETTING, msg);	
	}
	public String getSecurityDataInformation() {
		return (String) getProperty(PROPERTY_HAS_SECURITY_DATA_INFORMATION);	
	}
	public void setSecurityDataInformation(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SECURITY_DATA_INFORMATION, msg);	
	}
	public OccurenceStatusValue getDetectionOfAbnormalValueInMetterData() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA);	
	}
	public void setDetectionOfAbnormalValueInMetterData(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA, msg);	
	}
	public MeasuredValue getDayToRetrieveMeasuredCummulativeGasConsumptionHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_DAY_TO_RETRIEVE_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setDayToRetrieveMeasuredCummulativeGasConsumptionHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAY_TO_RETRIEVE_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumptionHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCummulativeGasConsumptionHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public MeasurementUnit getMeasuredCummulativeGasConsumptionUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_UNIT);	
	}
	public void setMeasuredCummulativeGasConsumptionUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION);	
	}
	public void setMeasuredCummulativeGasConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION, msg);	
	}
	
	
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	public TypeClassificationValue getGasMetterClassificationSetting() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING);	
	}
	public void setGasMetterClassificationSetting(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_GAS_METTER_CLASSIFICATION_SETTING, msg);	
	}


	
	public SmartGasMeter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public SmartGasMeter(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
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
