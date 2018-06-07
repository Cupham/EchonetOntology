package org.universAAL.ontology.echonet.values;

import java.util.Date;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class SurplusElectricEnergyPowerPredictionValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "SurplusElectricEnergyPowerPredictionValue";
	public static final String PROPERTY_HAS_PREDICTION_TIME = EchonetOntology.NAMESPACE + "HasPredictionTime";
	public static final String PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE = EchonetOntology.NAMESPACE + "HasSurplusPowerPredictionValue";

	public SurplusElectricEnergyPowerPredictionValue() {
		super();
	}
	public SurplusElectricEnergyPowerPredictionValue(String uri) {
		super(uri);
	}
	public SurplusElectricEnergyPowerPredictionValue(String uri, Date date,MeasuredValue value ) {
		super(uri);
		setPredictionTime(date);
		setSurplusPowerPredictionValue(value);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public Date getPredictionTime() {
		return (Date) getProperty(PROPERTY_HAS_PREDICTION_TIME);
	}
	public void setPredictionTime(Date msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_PREDICTION_TIME,msg);
	}
	public MeasuredValue getSurplusPowerPredictionValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE);
	}
	public void setSurplusPowerPredictionValue(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_SURPLUS_POWER_PREDICTION_VALUE,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
