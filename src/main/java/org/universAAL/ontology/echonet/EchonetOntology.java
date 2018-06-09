
package org.universAAL.ontology.echonet;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.IntRestriction;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.Service;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.EchonetFactory;
import org.universAAL.ontology.location.Location;
import org.universAAL.ontology.location.LocationOntology;
import org.universAAL.ontology.phThing.Device;
import org.universAAL.ontology.phThing.PhThingOntology;

/**
 *
 * @author PHAM Van Cu
 *
 */
public final class EchonetOntology extends Ontology {

	private static EchonetFactory factory = new EchonetFactory();;

	public static final String NAMESPACE = "http://ontology.universAAL.org/Echonet.owl#";

	public EchonetOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment(
				"The ontology defining the most general concepts of Echonet protocol");
		r.setResourceLabel("Echonet");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);

		OntClassInfoSetup oci;
		
		oci = createNewAbstractOntClassInfo(EchonetSuperDevice.MY_URI);
		

	}
}
