package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class ComercialAirconditionerCurrentFunctionValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ComercialAirconditionerCurrentFunction";
	public static final String PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "ComercialAirconditionerCurrentFunctionHasAutomaticOperationModeSetting";
	public static final String PROPERTY_HAS_FUNCTION = EchonetOntology.NAMESPACE + "ComercialAirconditionerCurrentFunctionHasFunction";

	public ComercialAirconditionerCurrentFunctionValue() {
		super();
	}
	public ComercialAirconditionerCurrentFunctionValue(String uri) {
		super(uri);
	}
	public ComercialAirconditionerCurrentFunctionValue(String uri, OccurenceStatusValue automaticMode,OperationModeSettingValue operationMode ) {
		super(uri);
		setAutomaticOperationModeSetting(automaticMode);
		setCurrentFunctionHasFunction(operationMode);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OccurenceStatusValue getAutomaticOperationModeSetting() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING);
	}
	public void setAutomaticOperationModeSetting(OccurenceStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_AUTOMATIC_OPERATION_MODE_SETTING,msg);
	}
	public OperationModeSettingValue getCurrentFunctionHasFunction() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_FUNCTION);
	}
	public void setCurrentFunctionHasFunction(OperationModeSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_FUNCTION,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
