package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class RGBValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "RGBValue";
public static final String PROPERTY_HAS_R_VALUE= EchonetOntology.NAMESPACE + "HasRValue";
public static final String PROPERTY_HAS_G_VALUE= EchonetOntology.NAMESPACE + "HasGValue";
public static final String PROPERTY_HAS_B_VALUE = EchonetOntology.NAMESPACE + "HasBValue";
	
	public RGBValue() {
		super();
	}
	public RGBValue(String uri) {
		super(uri);
	}
	public RGBValue(String uri, MeasuredValue r, MeasuredValue g, MeasuredValue b) {
		super(uri);
		setR(r);
		setG(g);
		setB(b);
	}
	public MeasuredValue getB() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_B_VALUE);
	}
	public void setB(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_B_VALUE, msg);	
	}
	public MeasuredValue getG() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_G_VALUE);
	}
	public void setG(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_G_VALUE, msg);	
	}
	public MeasuredValue getR() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_R_VALUE);
	}
	public void setR(MeasuredValue msg) {
		if(msg != null) 
			changeProperty(PROPERTY_HAS_R_VALUE, msg);	
	}
	
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String getClassURI() {
		return MY_URI;
	}

}
