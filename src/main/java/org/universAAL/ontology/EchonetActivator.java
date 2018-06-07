
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.echonet.EchonetOntology;

public class EchonetActivator implements ModuleActivator {

	private EchonetOntology echonetOntology = new EchonetOntology();

	public void start(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().register(mc, echonetOntology);
	}

	public void stop(ModuleContext mc) throws Exception {
		OntologyManagement.getInstance().unregister(mc, echonetOntology);
	}
}
