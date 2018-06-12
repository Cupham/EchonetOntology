package org.universAAL.ontology.echonet.sensorRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.ThresholdLevelValue;
public class ActivityMountSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ActivityMountSensor";
	public static final String PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1 = EchonetOntology.NAMESPACE + "ActivityMountSensorHasActivityMountLevel1";
	public static final String PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID = EchonetOntology.NAMESPACE + "ActivityMountSensorHasMaxNumberofHumanBodyID";
	public static final String PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2 = EchonetOntology.NAMESPACE + "ActivityMountSensorHasActivityMountLevel2";
	public static final String PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION = EchonetOntology.NAMESPACE + "ActivityMountSensorHasHumanBodyExistenceInfor";
	public ActivityMountSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public ActivityMountSensor(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	
	public ThresholdLevelValue getActivityMountLevel1() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1);	
	}
	public void setActivityMountLevel1(ThresholdLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_1,msg);	
	}
	public ThresholdLevelValue getActivityMountLevel2() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2);	
	}
	public void setActivityMountLevel2(ThresholdLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_ACTIVITY_MOUNT_LEVEL_2,msg);	
	}
	public MeasuredValue getMaxNumberofHumanBodyID() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID);
	}
	public void getMaxNumberofHumanBodyID(MeasuredValue msg) {
		if(msg!=null)
			changeProperty(PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID, msg);	
	}
	public String getHumanBodyExistenceInfor() {
		return (String) getProperty(PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION);
	}
	public void setHumanBodyExistenceInfor(String msg) {
		if(msg!=null)
			changeProperty(PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION, msg);	
	}
}
