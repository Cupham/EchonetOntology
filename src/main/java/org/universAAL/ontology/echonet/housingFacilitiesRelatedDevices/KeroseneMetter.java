package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class KeroseneMetter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "KeroseneMetter";
	
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeKeroseneConsumptionAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeKeroseneConsumptionHistoricalData";
	
	public MeasuredValue getMeasuredCummulativeKeroseneConsumptionHistoricalData() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA);	
	}
	public void setMeasuredCummulativeKeroseneConsumptionHistoricalData(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_HISTORICAL_DATA, msg);	
	}
	public MeasuredValue getMeasuredCummulativeKeroseneConsumptionAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT);	
	}
	public void setMeasuredCummulativeKeroseneConsumptionAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_KEROSENE_CONSUMPTION_AMOUNT, msg);	
	}

	
	public KeroseneMetter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public KeroseneMetter(String uri) {
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
