
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;

/**
 * @author Pham Van Cu
 */
public class EchonetFactory implements ResourceFactory {
	// private static final int NAMESPACE_LENGTH = LIGHTING_NAMESPACE.length();
	// private static final String PROP_ORIG_INDIVIDUAL = LIGHTING_NAMESPACE
	// + LightingFactory.class.hashCode();

	public EchonetFactory() {
	}

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		/*
		 * General comment for this implementation: we assume that this method
		 * is only called by the static method Resource.getResource() => we
		 * assume that the case of registered named resources is already handled
		 * there
		 */

		switch (factoryIndex) {
		case 0:
			
		}

		// if (classURI == null || !classURI.startsWith(LIGHTING_NAMESPACE))
		// return null;
		// String className = classURI.substring(NAMESPACE_LENGTH);
		// if (className.equals("Beaming"))
		// return new Beaming(instanceURI);
		// if (className.equals("BeamingSource"))
		// return new BeamingSource(instanceURI);
		// if (className.equals("BlinkableBeaming"))
		// return new BlinkableBeaming(instanceURI);
		// if (className.equals("BlinkableBeamingSource"))
		// return new BlinkableBeamingSource(instanceURI);
		// if (className.equals("BlinkableLighting"))
		// return new BlinkableLighting(instanceURI);
		// if (className.equals("BlinkableLightSource"))
		// return new BlinkableLightSource(instanceURI);
		// if (className.equals("Lighting"))
		// return new Lighting(instanceURI);
		// if (className.equals("LightSource"))
		// return new LightSource(instanceURI);
		return null;
	}
}
