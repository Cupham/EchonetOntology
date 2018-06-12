package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MountedAirRefreshingMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValue";
	public static final String PROPERTY_HAS_MINUS_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValueHasMinusIonMethodMounting";
	public static final String PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValueHasClusterIonMethodMounting";

	public MountedAirRefreshingMethodValue() {
		super();
		setMinusIonMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirRefreshingMethodValue(String uri) {
		super(uri);
		setMinusIonMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirRefreshingMethodValue(String uri, OperationStateSettingValue minusIonMethodMouting,OperationStateSettingValue clusterIonMethodMouting ) {
		super(uri);
		setMinusIonMethodMounting(minusIonMethodMouting);
		setClusterIonMethodMounting(clusterIonMethodMouting);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public OperationStateSettingValue getMinusIonMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING);
	}
	public void setMinusIonMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING,msg);
	}
	public OperationStateSettingValue getClusterIonMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING);
	}
	public void setClusterIonMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
