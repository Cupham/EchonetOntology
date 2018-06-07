package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MountedAirCleaningPurifyingMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValue";
	public static final String PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValueHasDustCollectionMethodMounting";
	public static final String PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValueHasClusterIonMethodMounting";

	public MountedAirCleaningPurifyingMethodValue() {
		super();
		setDustCollectionMethodMounting(MethodMountedValue.NotMounted);
		setClusterIonMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirCleaningPurifyingMethodValue(String uri) {
		super(uri);
		setDustCollectionMethodMounting(MethodMountedValue.NotMounted);
		setClusterIonMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirCleaningPurifyingMethodValue(String uri, MethodMountedValue electricalDustCollectionMethodMouting,MethodMountedValue clusterIonMethodMouting ) {
		super(uri);
		setDustCollectionMethodMounting(electricalDustCollectionMethodMouting);
		setClusterIonMethodMounting(clusterIonMethodMouting);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MethodMountedValue getDustCollectionMethodMounting() {
		return (MethodMountedValue) getProperty(PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING);
	}
	public void setDustCollectionMethodMounting(MethodMountedValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING,msg);
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
