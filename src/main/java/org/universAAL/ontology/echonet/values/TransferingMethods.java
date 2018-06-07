package org.universAAL.ontology.echonet.values;


import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonet.EchonetOntology;

public class TransferingMethods extends ManagedIndividual{

	protected TransferingMethods(String uri) {
		super(uri);
	}
	public static final String MY_URI = EchonetOntology.NAMESPACE + "TransferingMethods";
	
	public static final int LOCAL_STORAGE_TRANSFER = 0;
	public static final int REMOTE_STORAGE_TRANSFER = 1;
	public static final int MAIL_TRANSFER = 2;
	private static final String[] names = { "LocalStorageTransger", "RemoteStorageTransger","MailTransfer"};
	
	public static final TransferingMethods LocalStorageTransger = new TransferingMethods(LOCAL_STORAGE_TRANSFER);
	public static final TransferingMethods RemoteStorageTransger = new TransferingMethods(REMOTE_STORAGE_TRANSFER);
	public static final TransferingMethods MailTransfer = new TransferingMethods(MAIL_TRANSFER);
	
	private int order;

	private TransferingMethods(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static TransferingMethods getTransferingMethodsByOrder(int order) {
		switch (order) {
		case LOCAL_STORAGE_TRANSFER:
			return LocalStorageTransger;
		case REMOTE_STORAGE_TRANSFER:
			return RemoteStorageTransger;
		case MAIL_TRANSFER:
			return MailTransfer;
		default:
			return null;
		}
	}

	public static final TransferingMethods valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = LOCAL_STORAGE_TRANSFER; i <= MAIL_TRANSFER; i++)
			if (names[i].equals(name))
				return getTransferingMethodsByOrder(i);
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
