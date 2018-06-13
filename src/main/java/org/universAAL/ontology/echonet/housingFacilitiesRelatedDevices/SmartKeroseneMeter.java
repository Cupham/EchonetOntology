package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
import org.universAAL.ontology.echonet.values.TypeClassificationValue;

public class SmartKeroseneMeter extends EchonetSuperDevice{
	
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SmartKeroseneMetter";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "HasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeKeroseneConsumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeKeroseneConsumptionUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeKeroseneConsumptionHistoricalData";
	public static final String PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION = EchonetOntology.NAMESPACE + "HasCollectionDataSettingForHistoryCumulativeKeroseneConsumption";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "HasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "HasSecurityDataInformation";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL = EchonetOntology.NAMESPACE + "HasResidualVolumeControlWarningLevel";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1 = EchonetOntology.NAMESPACE + "HasResidualVolumeControlWarningLevel1";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2 = EchonetOntology.NAMESPACE + "HasResidualVolumeControlWarningLevel2";
	public static final String PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3 = EchonetOntology.NAMESPACE + "HasResidualVolumeControlWarningLevel3";
	public static final String PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE = EchonetOntology.NAMESPACE + "HasSlightLeakTimerValue";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "HasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "HasVerificationExpirationInformation";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeKeroseneConsumptionInformationDateTimeIncluded";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED = EchonetOntology.NAMESPACE + "HasMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeIncluded";
	
	public String getMeasuredCumulativeKeroseneConsumptionUnit() {
		return (String) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionUnit(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalInformationDateTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_INFORMATION_DATE_TIME_INCLUDED, msg);	
	}
	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionInformationDateTimeIncluded() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionInformationDateTimeIncluded(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_INFORMATION_DATE_TIME_INCLUDED, msg);	
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
	public Date getSlightLeakTimerValue() {
		return (Date) getProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE);	
	}
	public void setSlightLeakTimerValue(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SLIGHT_LEAK_TIMER_VALUE, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel3() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3);	
	}
	public void setResidualVolumeControlWarningLevel3(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_3, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel2() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2);	
	}
	public void setResidualVolumeControlWarningLevel2(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_2, msg);	
	}
	public MeasuredValue getResidualVolumeControlWarningLevel1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1);	
	}
	public void setResidualVolumeControlWarningLevel1(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL_1, msg);	
	}
	public ThresholdLevelValue getResidualVolumeControlWarningLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL);	
	}
	public void setResidualVolumeControlWarningLevel(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RESIDUAL_VOLUME_CONTROL_WARNING_LEVEL, msg);	
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
	public MeasuredValue getCollectionDataSettingForHistoryCumulativeKeroseneConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setCollectionDataSettingForHistoryCumulativeKeroseneConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_COLLECTION_DATE_SETTING_FOR_HISTORY_CUMULATIVE_KEROSENE_CONSUMPTION, msg);	
	}

	public MeasuredValue getMeasuredCumulativeKeroseneConsumptionHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCumulativeKeroseneConsumptionHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA, msg);	
	}

	public MeasuredValue getMeasuredCumulativeKeroseneConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION);	
	}
	public void setMeasuredCumulativeKeroseneConsumption(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_KEROSENE_CONSUMPTION, msg);	
	}
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	
	public SmartKeroseneMeter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public SmartKeroseneMeter(String uri) {
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
