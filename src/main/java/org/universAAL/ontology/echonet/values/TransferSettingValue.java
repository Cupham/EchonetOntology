package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TransferSettingValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TransferSettingValue";
	public static final String PROPERTY_HAS_TRANSFERING_METHOD= EchonetOntology.NAMESPACE + "HasTransferingMethod";
	public static final String PROPERTY_HAS_TRANSFERING_METHOD_STATUS = EchonetOntology.NAMESPACE + "HasTransferingMethodStatus";

	public OperationStatusValue getTransferingMethodStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_TRANSFERING_METHOD);
	}
	public void setTransferingMethodStatus(OperationStatusValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TRANSFERING_METHOD,msg);
	}
	public TransferingMethods getTransferingMethod() {
		return (TransferingMethods) getProperty(PROPERTY_HAS_TRANSFERING_METHOD);
	}
	public void setTransferingMethod(TransferingMethods msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_TRANSFERING_METHOD,msg);
	}
	public TransferSettingValue() {
		super();
	}
	public TransferSettingValue(String uri) {
		super(uri);
		
	}
	public TransferSettingValue(String uri, TransferingMethods method,OperationStatusValue status ) {
		super(uri);
		setTransferingMethodStatus(status);
		setTransferingMethod(method);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
