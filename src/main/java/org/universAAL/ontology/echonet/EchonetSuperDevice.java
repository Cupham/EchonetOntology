package org.universAAL.ontology.echonet;

import java.util.Date;

import org.universAAL.ontology.echonet.values.EchonetDeviceGroupCodeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;
import org.universAAL.ontology.echonet.values.FaultDesciptionValue;
import org.universAAL.ontology.echonet.values.IdentificationNumberValue;
import org.universAAL.ontology.echonet.values.InstallationLocationValue;
import org.universAAL.ontology.echonet.values.OccurenceStatusValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RemoteControlSettingValue;
import org.universAAL.ontology.phThing.Device;


public class EchonetSuperDevice extends Device{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "EchonetSuperDevice";
	
	public static final String PROPERTY_HAS_NODE_IP_ADDRESS = EchonetOntology.NAMESPACE + "echonet_device_has_node_ip_address";
	public static final String PROPERTY_HAS_GROUP_CODE = EchonetOntology.NAMESPACE + "echonet_device_has_group_code";
	public static final String PROPERTY_HAS_CLASS_CODE = EchonetOntology.NAMESPACE + "echonet_device_has_class_code";
	public static final String PROPERTY_HAS_INSTANCE_CODE = EchonetOntology.NAMESPACE + "echonet_device_has_instance_code";
	public static final String PROPERTY_HAS_OPERATION_STATUS = EchonetOntology.NAMESPACE +"echonet_device_has_operation_status";
	public static final String PROPERTY_HAS_INSTALLATION_LOCATION = EchonetOntology.NAMESPACE +"echonet_device_has_installation_ocation";
	public static final String PROPERTY_STANDARD_VERSION_INFORMATION = EchonetOntology.NAMESPACE +"echonet_device_has_standard_version_information";
	public static final String PROPERTY_HAS_FAULT_STATUS = EchonetOntology.NAMESPACE +"echonet_device_has_fault_status";
	public static final String PROPERTY_HAS_FAULT_DESCRIPTION = EchonetOntology.NAMESPACE +"echonet_device_has_fault_description";
	public static final String PROPERTY_HAS_MANUFACTURER_CODE = EchonetOntology.NAMESPACE +"echonet_device_has_manufacturer_code";
	public static final String PROPERTY_HAS_BUSINESS_FACILITY_CODE = EchonetOntology.NAMESPACE +"echonet_device_has_business_facility_code";
	public static final String PROPERTY_HAS_PRODUCT_CODE = EchonetOntology.NAMESPACE +"echonet_device_has_product_code";
	public static final String PROPERTY_HAS_PRODUCTION_NUMBER = EchonetOntology.NAMESPACE +"echonet_device_has_production_number";
	public static final String PROPERTY_HAS_PRODUCTION_DATE = EchonetOntology.NAMESPACE +"echonet_device_has_production_date";
	public static final String PROPERTY_HAS_IDENTIFICATION_NUMBER = EchonetOntology.NAMESPACE +"echonet_device_has_identification_number";
	public static final String PROPERTY_HAS_MANUFACTURER_FAULT_CODE = EchonetOntology.NAMESPACE +"echonet_device_has_manufacturer_fault_code";
	public static final String PROPERTY_HAS_CURRENT_LIMIT_SETTING = EchonetOntology.NAMESPACE +"echonet_device_has_current_limit_setting";
	public static final String PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING = EchonetOntology.NAMESPACE +"echonet_device_has_power_saving_operation_setting";
	public static final String PROPERTY_HAS_REMOTE_CONTROL_SETTING = EchonetOntology.NAMESPACE +"echonet_device_has_remote_control_setting";
	public static final String PROPERTY_HAS_CUMULATIVE_OPERATING_TIME = EchonetOntology.NAMESPACE +"echonet_device_has_cumulative_operating_time";
	public static final String PROPERTY_HAS_CURRENT_TIME_SETTING= EchonetOntology.NAMESPACE +"echonet_device_has_current_time_setting";
	public static final String PROPERTY_HAS_CURRENT_DATE_SETTING= EchonetOntology.NAMESPACE +"echonet_device_has_current_date_setting";
	public static final String PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"echonet_device_has_measured_instantaneous_power_consumption";
	public static final String PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION = EchonetOntology.NAMESPACE +"echonet_device_has_measured_cumulative_power_consumption";
	public static final String PROPERTY_HAS_POWER_LIMIT_SETTING = EchonetOntology.NAMESPACE +"echonet_device_has_power_limit_setting";
	
	public String getNodeIPAddress() {
		Object pp = getProperty(PROPERTY_HAS_NODE_IP_ADDRESS);
		if(pp!= null) {
			return pp.toString();
		} else {
			return null;
		}
	}
	public void setNodeIPAddress(String ip) {
		changeProperty(PROPERTY_HAS_NODE_IP_ADDRESS, ip);	
	}
	public EchonetDeviceGroupCodeValue getClassGroupCode() {
		return (EchonetDeviceGroupCodeValue) getProperty(PROPERTY_HAS_GROUP_CODE);
	}
	public void setClassGroupCode(EchonetDeviceGroupCodeValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_GROUP_CODE, msg);
		}
	}
	public Byte getClassCode() {
		return (Byte) getProperty(PROPERTY_HAS_CLASS_CODE);
	}
	public void setClassCode(Byte msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_CLASS_CODE, msg);
		}
	}
	public OperationStatusValue getOperationStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OPERATION_STATUS);
	}
	public void setOperationStatus(OperationStatusValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_OPERATION_STATUS, msg);
		}
	}

	public InstallationLocationValue getInstallationLocation() {
		return (InstallationLocationValue) getProperty(PROPERTY_HAS_INSTALLATION_LOCATION);
	}
	public void setInstallationLocation(InstallationLocationValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_INSTALLATION_LOCATION, msg);
		}
	}
	public String getStandardVersionInformation() {
		return (String) getProperty(PROPERTY_STANDARD_VERSION_INFORMATION);
	}
	public void setStandardVersionInformation(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_STANDARD_VERSION_INFORMATION, msg);	
	}
	

	public OccurenceStatusValue getFaultStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_FAULT_STATUS);
	}
	public void setFaultStatus(OccurenceStatusValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_FAULT_STATUS, msg);	
		}	
	}
	public FaultDesciptionValue getFaultDesciptionValue() {
		return (FaultDesciptionValue) getProperty(PROPERTY_HAS_FAULT_DESCRIPTION);
	}
	public void setFaultDesciptionValue(FaultDesciptionValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_FAULT_DESCRIPTION, msg);	
		}	
	}
	
	public  String getManufacturerCode() {
		return (String) getProperty(PROPERTY_HAS_MANUFACTURER_CODE);
	}
	public  void setManufacturerCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_MANUFACTURER_CODE, msg);
	}
	
	public  void setBusinessFacilityCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_BUSINESS_FACILITY_CODE, msg);
	}
	public  String getBusinessFacilityCode() {
		return (String) getProperty(PROPERTY_HAS_BUSINESS_FACILITY_CODE);
	}
	
	public  String getProductCode() {
		return (String) getProperty(PROPERTY_HAS_PRODUCT_CODE);
	}
	public  void setProductCode(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_PRODUCT_CODE, msg);
	}


	public  String getProductionNumber() {
		return (String) getProperty(PROPERTY_HAS_PRODUCTION_NUMBER);
	}
	public  void setProductionNumber(String msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_PRODUCTION_NUMBER, msg);
	}
	public Date getProductionDate() {
		return (Date) getProperty(PROPERTY_HAS_PRODUCTION_DATE);
	}
	public  void setProductionDate(Date msg) {
		changeProperty(PROPERTY_HAS_PRODUCTION_DATE, msg);
	}	
	public IdentificationNumberValue getIdentificationNumber() {
		return (IdentificationNumberValue) getProperty(PROPERTY_HAS_IDENTIFICATION_NUMBER);
	}
	public void setIdentificationNumber(IdentificationNumberValue msg) {
		if(msg != null) {
			changeProperty(PROPERTY_HAS_IDENTIFICATION_NUMBER, msg);	
		}	
	}
	

	public  String getManufacturerFaultCode() {
		return (String) getProperty(PROPERTY_HAS_MANUFACTURER_FAULT_CODE);
	}
	public  void setManufacturerFaultCode(String msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MANUFACTURER_FAULT_CODE, msg);
	}
	public  MeasuredValue getCurrentLimitSetting() {	
		return (MeasuredValue) getProperty(PROPERTY_HAS_CURRENT_LIMIT_SETTING);
	}
	public  void setCurrentLimitSetting(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_CURRENT_LIMIT_SETTING, msg);
	}
	public  OperationModeSettingValue getPowerSavingOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING);
	}
	public  void setPowerSavingOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_POWER_SAVING_OPERATION_SETTING, msg);
		}
	}
	public  RemoteControlSettingValue getRemoteControlSetting() {
		return (RemoteControlSettingValue) getProperty(PROPERTY_HAS_REMOTE_CONTROL_SETTING);
	}
	public  void setRemoteControlSetting(RemoteControlSettingValue msg) {
		if(msg !=null) {
			changeProperty(PROPERTY_HAS_REMOTE_CONTROL_SETTING, msg);
		}
	}
	public  String getCumulativeOperatingTime() {
		return (String) getProperty(PROPERTY_HAS_CUMULATIVE_OPERATING_TIME);
	}
	public  void setCumulativeOperatingTime(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CUMULATIVE_OPERATING_TIME, msg);
	}
	public Date getCurrentTimeSetting() {
		return (Date) getProperty(PROPERTY_HAS_CURRENT_TIME_SETTING);
	}
	public  void setCurrentTimeSetting(Date msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CURRENT_TIME_SETTING, msg);
	}
	public Date getCurrentDateSetting() {
		return (Date)getProperty(PROPERTY_HAS_CURRENT_DATE_SETTING);
	}
	public  void setCurrentDateSetting(Date msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_CURRENT_DATE_SETTING, msg);
	}
	public MeasuredValue getMeasuredInstantaneousPowerConsumption() {
		return (MeasuredValue)getProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION);
	}
	public  void setMeasuredInstantaneousPowerConsumption(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_INSTANTANEOUS_POWER_CONSUMPTION, msg);
	}


	public  MeasuredValue getMeasuredCumulativePowerConsumption() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION);
		
	}
	public  void setMeasuredCumulativePowerConsumption(MeasuredValue msg) {
		if(msg != null)
			changeProperty(PROPERTY_HAS_MEASURED_CUMULATIVE_POWER_CONSUMPTION, msg);
	}
	
	public  MeasuredValue ElectricEnergyValue() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_POWER_LIMIT_SETTING);
	}
	public  void setPowerLimitSetting(MeasuredValue msg) {
		changeProperty(PROPERTY_HAS_POWER_LIMIT_SETTING, msg);
	}
	
	public EchonetSuperDevice() {
		super();
	}
	public EchonetSuperDevice(String uri) {
		super(uri);
	}
	public int getPropSerializationType(String arg0) {
		// TODO Auto-generated method stub
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String getClassURI() {
		return MY_URI;
	}
	
	

}
