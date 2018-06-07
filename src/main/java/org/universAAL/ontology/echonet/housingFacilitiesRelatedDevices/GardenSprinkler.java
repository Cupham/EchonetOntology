package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;

import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.IntervalSettingValue;
import org.universAAL.ontology.echonet.values.NumberOfSprinkleSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class GardenSprinkler extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GardenSprinkler";
	public static final String PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING = EchonetOntology.NAMESPACE + "HasSprinkleValueOpenCloseSetting";
	public static final String PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING = EchonetOntology.NAMESPACE + "HasSprinkleIntervalSetting";
	public static final String PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING = EchonetOntology.NAMESPACE + "HasNumberOfSprinkleSetting";
	public static final String PROPERTY_HAS_SPRINKLE_TIME_SETTING_1 = EchonetOntology.NAMESPACE + "HasSprinkleTimeSetting1";
	public static final String PROPERTY_HAS_SPRINKLE_TIME_SETTING_2 = EchonetOntology.NAMESPACE + "HasSprinkleTimeSetting2";
	public static final String PROPERTY_HAS_SPRINKLE_DURATION_SETTING = EchonetOntology.NAMESPACE + "HasSprinkleDurationSetting";
	
	public Date getSprinkleDurationSetting() {
		return (Date) getProperty(PROPERTY_HAS_SPRINKLE_DURATION_SETTING);	
	}
	public void setSprinkleDurationSetting(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_DURATION_SETTING, msg);	
	}
	public Date getSprinkleTimeSetting2() {
		return (Date) getProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_2);	
	}
	public void setSprinkleTimeSetting2(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_2, msg);	
	}
	public Date getSprinkleTimeSetting1() {
		return (Date) getProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_1);	
	}
	public void setSprinkleTimeSetting1(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_TIME_SETTING_1, msg);	
	}
	public NumberOfSprinkleSettingValue getNumberOfSprinkleSetting() {
		return (NumberOfSprinkleSettingValue) getProperty(PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING);	
	}
	public void setNumberOfSprinkleSetting(NumberOfSprinkleSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_SPRINKLES_SETTING, msg);	
	}
	public IntervalSettingValue getSprinkleIntervalSetting() {
		return (IntervalSettingValue) getProperty(PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING);	
	}
	public void setSprinkleIntervalSetting(IntervalSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_INTERVAL_SETTING, msg);	
	}
	public OperationStatusValue getSprinkleValueOpenCloseSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING);	
	}
	public void setSprinkleValueOpenCloseSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPRINKLE_VALUE_OPEN_CLOSE_SETTING, msg);	
	}
	
	public GardenSprinkler() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public GardenSprinkler(String uri) {
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
