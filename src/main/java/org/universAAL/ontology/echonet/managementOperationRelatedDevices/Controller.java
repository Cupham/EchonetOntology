package org.universAAL.ontology.echonet.managementOperationRelatedDevices;



import java.util.Date;

import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.InstallationLocationValue;
import org.universAAL.ontology.echonet.values.LocationValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;

public class Controller extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "Controller";
	public static final String PROPERTY_HAS_CONTROLLER_ID= EchonetOntology.NAMESPACE + "HasControllerID";
	public static final String PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES= EchonetOntology.NAMESPACE + "HasNumberOfControlledDevices";
	public static final String PROPERTY_HAS_INDEX= EchonetOntology.NAMESPACE + "HasIndex";
	public static final String PROPERTY_HAS_DEVICE_ID= EchonetOntology.NAMESPACE + "HasDeviceID";
	public static final String PROPERTY_HAS_DEVICE_TYPE= EchonetOntology.NAMESPACE + "HasDeviceType";
	public static final String PROPERTY_HAS_DEVICE_NAME= EchonetOntology.NAMESPACE + "HasDeviceName";
	public static final String PROPERTY_HAS_CONNECTION_STATUS= EchonetOntology.NAMESPACE + "HasConnectionStatus";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE= EchonetOntology.NAMESPACE + "HasControlledDeviceBusinessCode";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE= EchonetOntology.NAMESPACE + "HasControlledDeviceProductCode";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE= EchonetOntology.NAMESPACE + "HasControlledDeviceManufacturerDate";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE= EchonetOntology.NAMESPACE + "HasControlledDeviceRegisteredInformationRenewalDate";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION= EchonetOntology.NAMESPACE + "HasControlledDeviceRegisteredInformationRenewalVersionInfor";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION= EchonetOntology.NAMESPACE + "HasControlledDeviceInstallationLocation";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS= EchonetOntology.NAMESPACE + "HasControlledDeviceFaultStatus";
	public static final String PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS= EchonetOntology.NAMESPACE + "HasInstallationLocationAddress";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP= EchonetOntology.NAMESPACE + "HasControlledDeviceSetPropertyMap";
	public static final String PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP= EchonetOntology.NAMESPACE + "HasControlledDeviceGetPropertyMap";
	
	public String getControlledDeviceGetPropertyMap() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP);	
	}
	public void setControlledDeviceGetPropertyMap(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_GET_PROPERTY_MAP, msg);	
	}
	public String getControlledDeviceSetPropertyMap() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP);	
	}
	public void setControlledDeviceSetPropertyMap(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_SET_PROPERTY_MAP, msg);	
	}
	public LocationValue getInstallationLocationAddress() {
		return (LocationValue) getProperty(PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS);	
	}
	public void setInstallationLocationAddress(LocationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INSTALLATION_LOCATION_ADDRESS, msg);	
	}
	public OccurenceStatusValue getControlledDeviceFaultStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS);	
	}
	public void setControlledDeviceFaultStatus(OccurenceStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_FAULT_STATUS, msg);	
	}
	public InstallationLocationValue getControlledDeviceInstallationLocation() {
		return (InstallationLocationValue) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION);	
	}
	public void setControlledDeviceInstallationLocation(InstallationLocationValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_INSTALLATION_LOCATION, msg);	
	}
	public String getControlledDeviceRegisteredInformationRenewalVersionInfor() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION);	
	}
	public void setControlledDeviceRegisteredInformationRenewalVersionInfor(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_VERSION_INFORMATION, msg);	
	}
	public Date getControlledDeviceRegisteredInformationRenewalDate() {
		return (Date) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE);	
	}
	public void setControlledDeviceRegisteredInformationRenewalDate(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_REGISTERED_INFORMATION_RENEWAL_DATE, msg);	
	}
	public Date getControlledDeviceManufacturerDate() {
		return (Date) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE);	
	}
	public void setControlledDeviceManufacturerDate(Date msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_MANUFACTURER_DATE, msg);	
	}
	public String getControlledDeviceProductCode() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE);	
	}
	public void setControlledDeviceProductCode(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_PRODUCT_CODE, msg);	
	}
	public String getControlledDeviceBusinessCode() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE);	
	}
	public void setControlledDeviceBusinessCode(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLED_DEVICE_BUSINESS_CODE, msg);	
	}
	public OperationStatusValue getConnectionStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_CONNECTION_STATUS);	
	}
	public void setConnectionStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONNECTION_STATUS, msg);	
	}
	public String getDeviceName() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_NAME);	
	}
	public void setDeviceName(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_NAME, msg);	
	}
	public String getDeviceType() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_TYPE);	
	}
	public void setDeviceType(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_TYPE, msg);	
	}
	public String getDeviceID() {
		return (String) getProperty(PROPERTY_HAS_DEVICE_ID);	
	}
	public void setDeviceID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DEVICE_ID, msg);	
	}
	public Integer getIndex() {
		return (Integer) getProperty(PROPERTY_HAS_INDEX);	
	}
	public void setIndex(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_INDEX, msg);	
	}
	public Integer getNumberOfControlledDevices() {
		return (Integer) getProperty(PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES);	
	}
	public void setNumberOfControlledDevices(Integer msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_OF_CONTROLLED_DEVICES, msg);	
	}
	public String getControllerID() {
		return (String) getProperty(PROPERTY_HAS_CONTROLLER_ID);	
	}
	public void setControllerID(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CONTROLLER_ID, msg);	
	}

	
	
	public Controller() {
		super();
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
	}
	public Controller(String uri) {
		super(uri);
		setClassGroupCode(EchonetDeviceGroupCodeValue.ManagementOperationRelatedDevice);
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
	

}
