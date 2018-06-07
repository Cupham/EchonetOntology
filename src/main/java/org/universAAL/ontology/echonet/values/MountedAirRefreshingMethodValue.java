package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MountedAirRefreshingMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValue";
	public static final String PROPERTY_HAS_MINUS_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValueHasMinusIonMethodMounting";
	public static final String PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirRefreshingMethodValueHasClusterIonMethodMounting";

	public MountedAirRefreshingMethodValue() {
		super();
		setMinusIonMethodMounting(MethodMountedValue.NotMounted);
		setClusterIonMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirRefreshingMethodValue(String uri) {
		super(uri);
		setMinusIonMethodMounting(MethodMountedValue.NotMounted);
		setClusterIonMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirRefreshingMethodValue(String uri, MethodMountedValue minusIonMethodMouting,MethodMountedValue clusterIonMethodMouting ) {
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
	public MethodMountedValue getMinusIonMethodMounting() {
		return (MethodMountedValue) getProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING);
	}
	public void setMinusIonMethodMounting(MethodMountedValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MINUS_ION_METHOD_MOUTING,msg);
	}
	public MethodMountedValue getClusterIonMethodMounting() {
		return (MethodMountedValue) getProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING);
	}
	public void setClusterIonMethodMounting(MethodMountedValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
