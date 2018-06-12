package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.MeasurementUnit;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.TypeClassificationValue;

public class WaterFlowMeter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WaterFlowmetter";
	public static final String PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION = EchonetOntology.NAMESPACE + "HasWaterFlowMetterClassification";
	public static final String PROPERTY_HAS_OWNER_CLASSIFICATION = EchonetOntology.NAMESPACE + "HasOwnerClassification";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeFlowingWaterAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeFlowingWaterAmountUnit";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeFlowingWaterAmountHistoricalData";
	public static final String PROPERTY_HAS_DETECTION_OF_ABNORMAL_VALUE_IN_METERING_DATA = EchonetOntology.NAMESPACE + "HasDetectionOfAbnormalValueInMetterData";
	public static final String PROPERTY_HAS_SECURITY_DATA_INFORMATION = EchonetOntology.NAMESPACE + "HasSecurityDataInformation";
	public static final String PROPERTY_HAS_ID_NUMBER_SETTING = EchonetOntology.NAMESPACE + "HasIDNumberSetting";
	public static final String PROPERTY_VERIFICATION_EXPIRATION_INFORMATION= EchonetOntology.NAMESPACE + "HasVerificationExpirationInformation";
	
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
	public MeasuredValue getMeasuredCummulativeFlowingWaterAmountHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA);	
	}
	public void setMeasuredCummulativeFlowingWaterAmountHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_HISTORICAL_DATA, msg);	
	}
	public MeasurementUnit getMeasuredCummulativeFlowingWaterAmountUnit() {
		return (MeasurementUnit) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT);	
	}
	public void setMeasuredCummulativeFlowingWaterAmountUnit(MeasurementUnit msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT_UNIT, msg);	
	}
	public MeasuredValue getMeasuredCummulativeFlowingWaterAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT);	
	}
	public void setMeasuredCummulativeFlowingWaterAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_FLOWING_WATER_AMOUNT, msg);	
	}
	public TypeClassificationValue getOwnerClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_OWNER_CLASSIFICATION);	
	}
	public void setOwnerClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OWNER_CLASSIFICATION, msg);	
	}
	public TypeClassificationValue getWaterFlowMetterClassification() {
		return (TypeClassificationValue) getProperty(PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION);	
	}
	public void setWaterFlowMetterClassification(TypeClassificationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_FLOW_METTER_CLASSIFICATION, msg);	
	}


	
	public WaterFlowMeter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public WaterFlowMeter(String uri) {
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
