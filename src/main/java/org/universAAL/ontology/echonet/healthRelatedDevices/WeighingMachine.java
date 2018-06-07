package org.universAAL.ontology.echonet.healthRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class WeighingMachine extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WeighingMachine";
	public static final String PROPERTY_HAS_MEASURED_BODY_WEIGHT= EchonetOntology.NAMESPACE + "HasMeasuredBodyWeight";
	public static final String PROPERTY_HAS_MEASURED_BODY_FAT= EchonetOntology.NAMESPACE + "HasMeasuredBodyFat";
	
	public MeasuredValue getMeasuredBodyFat() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_BODY_FAT);	
	}
	public void setMeasuredBodyFat(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BODY_FAT, msg);	
	}
	public MeasuredValue getMeasuredBodyWeight() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_BODY_WEIGHT);	
	}
	public void setMeasuredBodyWeight(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_BODY_WEIGHT, msg);	
	}

	
	
	public WeighingMachine() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.HealthRelatedDevice);
	}
	public WeighingMachine(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.HealthRelatedDevice);
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
