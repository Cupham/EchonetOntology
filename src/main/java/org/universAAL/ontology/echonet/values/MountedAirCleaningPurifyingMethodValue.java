package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MountedAirCleaningPurifyingMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValue";
	public static final String PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValueHasDustCollectionMethodMounting";
	public static final String PROPERTY_HAS_CLUSTER_ION_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirCleaningPurifyingMethodValueHasClusterIonMethodMounting";

	public MountedAirCleaningPurifyingMethodValue() {
		super();
		setDustCollectionMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirCleaningPurifyingMethodValue(String uri) {
		super(uri);
		setDustCollectionMethodMounting(OperationStateSettingValue.UnMountedState);
		setClusterIonMethodMounting(OperationStateSettingValue.UnMountedState);
	}
	public MountedAirCleaningPurifyingMethodValue(String uri, OperationStateSettingValue electricalDustCollectionMethodMouting,OperationStateSettingValue clusterIonMethodMouting ) {
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
	public OperationStateSettingValue getDustCollectionMethodMounting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING);
	}
	public void setDustCollectionMethodMounting(OperationStateSettingValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_ELECTRICAL_DUST_COLLECTION_METHOD_MOUTING,msg);
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
