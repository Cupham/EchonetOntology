/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;





import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.MeasuredValue;

public class LightingSystem extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "LightingSystem";	
	public static final String PROPERTY_HAS_ILLUMINANCE_LEVEL = EchonetOntology.NAMESPACE + "hasIlluminanceLevel";
	public static final String PROPERTY_HAS_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasSceneControlSetting";
	public static final String PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING = EchonetOntology.NAMESPACE + "hasNumberForAssigningSceneControlSetting";
	
	public MeasuredValue getNumberForAssigningSceneControlSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING);	
	}
	public void setNumberForAssigningSceneControlSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_NUMBER_FOR_ASSIGNING_SCENE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getSceneControlSetting() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING);	
	}
	public void setSceneControlSetting(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SCENE_CONTROL_SETTING, msg);	
	}
	public MeasuredValue getIlluminanceLevel() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL);	
	}
	public void setIlluminanceLevel(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ILLUMINANCE_LEVEL, msg);	
	}
	
	
	public LightingSystem() {
		super();
	}
	public LightingSystem(String uri) {
		super(uri);
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
