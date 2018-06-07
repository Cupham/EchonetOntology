package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class RatedPowerConsumptionInModeValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "RatedPowerConsumptionInModeValue";
	public static final String PROPERTY_HAS_OPERATION_MODE = EchonetOntology.NAMESPACE + "HasOperationMode";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_VALUE = EchonetOntology.NAMESPACE + "HasPowerConsumptionValue";
	public RatedPowerConsumptionInModeValue(String uri) {
		super(uri);	
	}
	public RatedPowerConsumptionInModeValue() {
		super();	
	}
	public RatedPowerConsumptionInModeValue(String uri,OperationModeSettingValue operationMode, MeasuredValue powerConsumption) {
		super(uri);	
		setPowerConsumptionValue(powerConsumption);
		setOperationMode(operationMode);
	}
	public void setPowerConsumptionValue(MeasuredValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_VALUE, msg);
	} 
	public MeasuredValue getPowerConsumptionValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_VALUE);
	}
	public void setOperationMode(OperationModeSettingValue msg) {
		if (msg != null)
			changeProperty(PROPERTY_HAS_OPERATION_MODE, msg);
	} 
	public OperationModeSettingValue getOperationMode() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE);
	}
	public String getClassURI() {
		return MY_URI;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_FULL;
	}
}
