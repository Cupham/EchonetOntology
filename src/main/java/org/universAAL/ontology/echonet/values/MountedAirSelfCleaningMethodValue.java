package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class MountedAirSelfCleaningMethodValue extends ManagedIndividual{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "MountedAirSelfCleaningMethodValue";
	public static final String PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirSelfCleaningMethodValueHasOzoneCleaningMethodMounting";
	public static final String PROPERTY_HAS_DRYING_METHOD_MOUTING = EchonetOntology.NAMESPACE + "MountedAirSelfCleaningMethodValueHasDryingMethodMounting";

	public MountedAirSelfCleaningMethodValue() {
		super();
		setOzoneCleaningMethodMounting(MethodMountedValue.NotMounted);
		setDryingMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirSelfCleaningMethodValue(String uri) {
		super(uri);
		setOzoneCleaningMethodMounting(MethodMountedValue.NotMounted);
		setDryingMethodMounting(MethodMountedValue.NotMounted);
	}
	public MountedAirSelfCleaningMethodValue(String uri, MethodMountedValue ozoneCleaningMethodMouting,MethodMountedValue dryingMethodMouting ) {
		super(uri);
		setOzoneCleaningMethodMounting(ozoneCleaningMethodMouting);
		setDryingMethodMounting(dryingMethodMouting);
	}


	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public MethodMountedValue getOzoneCleaningMethodMounting() {
		return (MethodMountedValue) getProperty(PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING);
	}
	public void setOzoneCleaningMethodMounting(MethodMountedValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_OZONE_CLEANING_METHOD_MOUTING,msg);
	}
	public MethodMountedValue getDryingMethodMounting() {
		return (MethodMountedValue) getProperty(PROPERTY_HAS_DRYING_METHOD_MOUTING);
	}
	public void setDryingMethodMounting(MethodMountedValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_DRYING_METHOD_MOUTING,msg);
	}
	public String getClassURI() {
		return MY_URI;
	}

}
