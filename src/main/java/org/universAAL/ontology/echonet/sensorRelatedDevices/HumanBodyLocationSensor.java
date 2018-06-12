package org.universAAL.ontology.echonet.sensorRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.LocationValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
public class HumanBodyLocationSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HumanBodyLocationSensor";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1 = EchonetOntology.NAMESPACE + "HumanBodyLocationSensorHasHumanBodyDetectionLocation1";
	public static final String PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID = EchonetOntology.NAMESPACE + "HumanBodyLocationSensorHasMaxNumberofHumanBodyID";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2 = EchonetOntology.NAMESPACE + "HumanBodyLocationSensorHasHumanBodyDetectionLocation2";
	public static final String PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION = EchonetOntology.NAMESPACE + "HumanBodyLocationSensorHasHumanBodyExistenceInfor";
	public HumanBodyLocationSensor() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.SensorRelatedDevice);
	}

	public HumanBodyLocationSensor(String uri) {
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
	
	public LocationValue getHumanBodyDetectionLocation1() {
		return (LocationValue) getProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1);	
	}
	public void setHumanBodyDetectionLocation1(LocationValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1,msg);	
	}
	public LocationValue getHumanBodyDetectionLocation2() {
		return (LocationValue) getProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2);	
	}
	public void setHumanBodyDetectionLocation2(LocationValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2,msg);	
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
