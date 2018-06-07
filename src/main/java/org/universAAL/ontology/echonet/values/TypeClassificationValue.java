package org.universAAL.ontology.echonet.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TypeClassificationValue extends ManagedIndividual{

	protected TypeClassificationValue(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TypeClassificationValue";
	
	public static final int RUNNING_WATER = 0;
	public static final int RECYCLED_WATER = 1;
	public static final int SEWAGE_WATER = 2;
	public static final int OTHERS= 3;
	public static final int NOT_SPECIFIED = 4;	
	public static final int PUBLIC_WATERWORKS_COMPANY = 5;
	public static final int PRIVATE_SECTOR_COMPANY = 6;
	public static final int INDIVIDUAL = 7;
	public static final int CITY_GAS = 8;
	public static final int LP_GAS = 9;
	public static final int NATURAL_GAS = 10;
	private static final String[] names = { "RunningWater", "RecycledWater","SewageWater","Others",
											"NotSpecified","PublicWaterworksCompany","PrivateSectorCompany",
											"Individual","CityGas","LPGas","NaturalGas"};
	
	public static final TypeClassificationValue RunningWater = new TypeClassificationValue(RUNNING_WATER);
	public static final TypeClassificationValue RecycledWater = new TypeClassificationValue(RECYCLED_WATER);
	public static final TypeClassificationValue SewageWater = new TypeClassificationValue(SEWAGE_WATER);
	public static final TypeClassificationValue Others = new TypeClassificationValue(OTHERS);
	public static final TypeClassificationValue NotSpecified = new TypeClassificationValue(NOT_SPECIFIED);
	public static final TypeClassificationValue PublicWaterworksCompany = new TypeClassificationValue(PUBLIC_WATERWORKS_COMPANY);
	public static final TypeClassificationValue PrivateSectorCompany = new TypeClassificationValue(PRIVATE_SECTOR_COMPANY);
	public static final TypeClassificationValue Individual = new TypeClassificationValue(INDIVIDUAL);
	public static final TypeClassificationValue CityGas = new TypeClassificationValue(CITY_GAS);
	public static final TypeClassificationValue LPGas = new TypeClassificationValue(LP_GAS);
	public static final TypeClassificationValue NaturalGas = new TypeClassificationValue(NATURAL_GAS);
	private int order;

	private TypeClassificationValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static TypeClassificationValue getTypeClassificationValueByOrder(int order) {
		switch (order) {
		case RUNNING_WATER:
			return RunningWater;
		case RECYCLED_WATER:
			return RecycledWater;
		case SEWAGE_WATER:
			return SewageWater;
		case OTHERS:
			return Others;
		case NOT_SPECIFIED:
			return NotSpecified;
		case PUBLIC_WATERWORKS_COMPANY:
			return PublicWaterworksCompany;
		case PRIVATE_SECTOR_COMPANY:
			return PrivateSectorCompany;
		case INDIVIDUAL:
			return Individual;
		case CITY_GAS:
			return CityGas;
		case LP_GAS:
			return LPGas;
		case NATURAL_GAS:
			return NaturalGas;
		default:
			return null;
		}
	}

	public static final TypeClassificationValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = RUNNING_WATER; i <= NATURAL_GAS; i++)
			if (names[i].equals(name))
				return getTypeClassificationValueByOrder(i);
		return null;
	}
	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
