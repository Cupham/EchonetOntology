package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class GasMetter extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "GasMetter";
	
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionAmount";
	public static final String PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG = EchonetOntology.NAMESPACE + "HasMeasuredCummulativeGasConsumptionLog";

	public MeasuredValue getMeasuredCummulativeGasConsumptionLog() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG);	
	}
	public void setMeasuredCummulativeGasConsumptionLog(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_LOG, msg);	
	}
	public MeasuredValue getMeasuredCummulativeGasConsumptionAmount() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT);	
	}
	public void setMeasuredCummulativeGasConsumptionAmount(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_CUMMULATIVE_GAS_CONSUMPTION_AMOUNT, msg);	
	}

	
	public GasMetter() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HousingFacilityRelatedDevice);
	}
	public GasMetter(String uri) {
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
