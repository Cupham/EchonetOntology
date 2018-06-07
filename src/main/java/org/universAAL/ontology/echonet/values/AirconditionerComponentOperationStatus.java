package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class AirconditionerComponentOperationStatus extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "AirconditionerComponentOperationStatus";
	public static final String PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS = EchonetOntology.NAMESPACE + "AirconditionerComponentOperationStatusHasCompressorOperationStatus";
	public static final String PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS = EchonetOntology.NAMESPACE + "AirconditionerComponentOperationStatusHasThermostatOperationStatus";

	public AirconditionerComponentOperationStatus() {
		super();
	}
	public AirconditionerComponentOperationStatus(String uri) {
		super(uri);
	}
	public AirconditionerComponentOperationStatus(String uri, OperationStatusValue compressorOperationStatus,
															  OperationStatusValue thermostatOperationStatus ) {
		super(uri);
		setCompressorOperationStatus(compressorOperationStatus);
		setThermostatOperationStatus(thermostatOperationStatus);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OperationStatusValue getCompressorOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS);
	}
	public void setCompressorOperationStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_COMPRESSOR_OPERATION_STATUS,msg);
	}
	public OperationStatusValue getThermostatOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS);
	}
	public void setThermostatOperationStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_THERMOSTAT_OPERATION_STATUS,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
