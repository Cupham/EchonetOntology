# ECHONET Ontology

This is the Java source code of the ECHONET (and ECHONET Lite) ontology for ECHONET device objects (Release J, Aug.31 2017 by the ECHONET CONSORTIUM).
The ontology is following the guidelines to construct official ontology for the universAAL platform.

## Getting Started

The .owl and .ttl files are already included in the repository. However they can be generated by running the source code.

### Prerequisites

Maven 
Java (JavaSE 1.8)

### Installing

Simply running "Maven-install" the project to generate ontology files.

  Example by using eclipse (Oxygen with maven plugin installed)
  Select project -> right-click -> Run as -> Maven install

The ontology files are located at $target/ontologies folder.

### Remaining problems
1. The DR controller is not yet supported in this version 
2. The WasherDryer's functions and attributes are partly supported (mandatory properties only)
3. Enum values for measurement units are planning to support in the next version
4. The class naming (semantic meaning) is not so clear :-S

## Contributing

PHAM, Van Cu initial and create the project.


## Authors

PHAM, Van Cu (cupham@jaist.ac.jp)

## License

This project is licensed under the APACHE 2 License

## Acknowledgments
This work is a part of the CARESSES project (http://caressesrobot.org/en/).
The ECHONET device objects are from the ECHONET specification release J (https://echonet.jp/spec_object_rj_en/)
The coding style are following the guidelines from universAAL platform (https://github.com/universAAL)
