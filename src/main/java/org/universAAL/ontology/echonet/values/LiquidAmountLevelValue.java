package org.universAAL.ontology.echonet.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class LiquidAmountLevelValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "LiquidAmountLevelValue";
	private int order;
	public static final int EMPTY = 0;
	public static final int MINIMUM_LEVEL = 1;
	public static final int AMOUNT_LEVEL_20_PERCENT = 2;
	public static final int AMOUNT_LEVEL_40_PERCENT = 3;
	public static final int AMOUNT_LEVEL_60_PERCENT = 4;
	public static final int AMOUNT_LEVEL_80_PERCENT = 5;
	public static final int MAX_LEVEL = 6;
	private static final String[] names = {"Empty", "MinimumLevel", "AmountLevel20Percent", "AmountLevel40Percent", 
										   "AmountLevel60Percent", "AmountLevel80Percent", "MaxLevel"};
	
	public static final LiquidAmountLevelValue Empty = new LiquidAmountLevelValue(EMPTY);
	public static final LiquidAmountLevelValue MinimumLevel = new LiquidAmountLevelValue(MINIMUM_LEVEL);
	public static final LiquidAmountLevelValue AmountLevel20Percent = new LiquidAmountLevelValue(AMOUNT_LEVEL_20_PERCENT);
	public static final LiquidAmountLevelValue AmountLevel40Percent = new LiquidAmountLevelValue(AMOUNT_LEVEL_40_PERCENT);
	public static final LiquidAmountLevelValue AmountLevel60Percent = new LiquidAmountLevelValue(AMOUNT_LEVEL_60_PERCENT);
	public static final LiquidAmountLevelValue AmountLevel80Percent = new LiquidAmountLevelValue(AMOUNT_LEVEL_80_PERCENT);
	public static final LiquidAmountLevelValue MaxLevel = new LiquidAmountLevelValue(MAX_LEVEL);

	private LiquidAmountLevelValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static LiquidAmountLevelValue getLiquidAmountLevelValueByOrder(int order) {
		switch (order) {
		case EMPTY:
			return Empty;
		case MINIMUM_LEVEL:
			return MinimumLevel;
		case AMOUNT_LEVEL_20_PERCENT:
			return AmountLevel20Percent;
		case AMOUNT_LEVEL_40_PERCENT:
			return AmountLevel40Percent;
		case AMOUNT_LEVEL_60_PERCENT:
			return AmountLevel60Percent;
		case AMOUNT_LEVEL_80_PERCENT:
			return AmountLevel80Percent;
		case MAX_LEVEL:
			return MaxLevel;
		default:
			return null;
		}
	}

	public static final LiquidAmountLevelValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = EMPTY; i <= AMOUNT_LEVEL_80_PERCENT; i++)
			if (names[i].equals(name))
				return getLiquidAmountLevelValueByOrder(i);
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
