package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.generator

import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Perspective
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.LanguageElementMapping
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Cardinality

class PerspectiveSpecification {
	
	 def static compile(Perspective perspective) {
	 	
	 	'''
	 	
	 	package ca.mcgill.sel.core.perspective.«perspective.name.toLowerCase»;
	 	
	 	import org.eclipse.emf.ecore.EObject;
	 	
	 	
	 	import ca.mcgill.sel.core.COREExternalLanguage;
	 	import ca.mcgill.sel.core.CORELanguageElement;
	 	import ca.mcgill.sel.core.CORELanguageElementMapping;
	 	import ca.mcgill.sel.core.COREPerspective;
	 	import ca.mcgill.sel.core.COREPerspectiveAction;
	 	import ca.mcgill.sel.core.Cardinality;
	 	import ca.mcgill.sel.core.CoreFactory;
	 	import ca.mcgill.sel.core.MappingEnd;
	 	//import ca.mcgill.sel.core.perspective.design.ElementMapping;
	 	
	 	«FOR language : perspective.languages»
	 		import «language.rootPackage».*;
	 	«ENDFOR»
	 	
	 	public class «perspective.name»Specification {
	 	
	 	    public static COREPerspective initializePerspective(COREPerspective perspective) {
	 	
	 	        // create perspective actions
	 	        createPerspectiveAction(perspective);
	 	
	 	        // create perspective mappings
	 	        createPerspectiveMappings(perspective);
	 	        
	 	        // create IntraLanguage Mappings
	 	        createIntraLanguageMappings(perspective);
	 	
	 	        return perspective;
	 	    }
	 	
	 	    private static void createPerspectiveAction(COREPerspective perspective) {
	 	        // create perspective actions
	 	
	 	        COREPerspectiveAction pAction = null;
	 	        
	 	        «FOR action : perspective.actions»
	 	        	pAction = CoreFactory.eINSTANCE.createCORERedefineAction();
	 	        	pAction.setName("«action.name»");
	 	        	pAction.setForRole("«action.roleName»");
	 	        	perspective.getActions().add(pAction);
	 	        	
	 	        «ENDFOR»
	 	
	 	    }
	 	
	 	    private static void createPerspectiveMappings(COREPerspective perspective) {
	 	
	 	        // language element mapping 
	 	        «FOR mapping : perspective.mappings»
	 	         «IF mapping.nestedMappings.empty» 
	 	             CORELanguageElementMapping «mapping.name.toFirstLower»MappingType = createLanguageElementMapping(perspective, 
	 	             «getCardinality(mapping, true)», "«mapping.fromRoleName»", «mapping.fromGetElement», «getCardinality(mapping, 
	 	                 false)», "«mapping.toRoleName»", «mapping.toGetElement»);
	 	             
	 	             «IF !mapping.interLanguageMappingEnds.empty» 
	 	                 InterLanguageMapping «mapping.name.toFirstLower»InterMapping = createInterLanguageMapping(«mapping.name.toFirstLower»MappingType);
	 	                 
	 	                 int position = 0;
	 	                 «FOR interMappingEnd : mapping.interLanguageMappingEnds»
	 	                     position +=1;
	 	                     createInterMappingEnd(«mapping.name.toFirstLower»InterMapping, «mapping.name.toFirstLower»MappingType,
	 	                         «interMappingEnd.isOrigin», «interMappingEnd.isDestination», position);
	 	                 «ENDFOR»
	 	             «ENDIF»
	 	                 
	 	         «ELSE»
	 	            
	 	            ElementMapping «mapping.name.toFirstLower»Mapping = createLanguageElementMapping(perspective, «getCardinality(mapping, true)»,
	 	             "«mapping.fromRoleName»", «mapping.fromGetElement», «getCardinality(mapping, false)», "«mapping.toRoleName»",
                     «mapping.toGetElement»);
	 	            
	 	            CORELanguageElementMapping «mapping.name.toFirstLower»MappingType = «mapping.name.toFirstLower»Mapping.getMappingType();
	 	            
	 	            // get from mapped language element, i.e., the from container of the feature to be mapped.
	 	            CORELanguageElement «mapping.name.toFirstLower»MappingFromLanguageELement = «mapping.name.toFirstLower»Mapping.getFromLanguageElement();
	 	            
	 	            // get to mapped language element, i.e., the to container of the feature to be mapped.
	 	            CORELanguageElement «mapping.name.toFirstLower»MappingToLanguageELement = «mapping.name.toFirstLower»Mapping.getToLanguageElement();
	 	            
                    «FOR nestedMapping : mapping.nestedMappings»

                          createNestedMapping(«mapping.name.toFirstLower»MappingType, «mapping.name.toFirstLower»MappingFromLanguageELement, 
                            «mapping.name.toFirstLower»MappingToLanguageELement, "«nestedMapping.fromElementName»", "«nestedMapping.toElementName»", 
                            "«mapping.fromRoleName»", "«mapping.toRoleName»");

                    «ENDFOR»
	 	            
	 	            «IF !mapping.interLanguageMappingEnds.empty»
	 	                 InterLanguageMapping «mapping.name.toFirstLower»InterMapping = createInterLanguageMapping(«mapping.name.toFirstLower»MappingType);
	 	                 
	 	                 int position = 0;
	 	                 «FOR interMappingEnd : mapping.interLanguageMappingEnds»
	 	                     position +=1;
	 	                     createInterMappingEnd(«mapping.name.toFirstLower»InterMapping, «mapping.name.toFirstLower»MappingType,
	 	                         «interMappingEnd.isOrigin», «interMappingEnd.isDestination», position);
	 	                 «ENDFOR»
	 	                 perspective.getNavigationMappings().add(«mapping.name.toFirstLower»InterMapping);
	 	            «ENDIF»

	 	          «ENDIF»
	 	          

	 	        «ENDFOR»
	 	        
	 	    }
	 	    
	 	    private static void createIntraLanguageMappings(COREPerspective perspective) {
	 	        «FOR intraLanguageMapping : perspective.intralanguagemappings»
	 	             EClass fromEClass = «intraLanguageMapping.fromGetElement»;
	 	             IntraLanguageMapping «intraLanguageMapping.name.toFirstLower»Mapping= createIntraLanguageMapping(perspective, 
	 	             	"«intraLanguageMapping.name»", «intraLanguageMapping.isClosure», «intraLanguageMapping.isReuse», «intraLanguageMapping.isIncreaseDepth», «intraLanguageMapping.isChangeModel», fromEClass);
	 	             «FOR hop : intraLanguageMapping.hops»
	 	             	EReference hopReference = «hop.fromGetHop»;
	 	             	addHopToILM(«intraLanguageMapping.name.toFirstLower»Mapping, hopReference);
	 	             	
	 	             «ENDFOR»
	 	             perspective.getNavigationMappings().add(«intraLanguageMapping.name.toFirstLower»Mapping);
	 	        «ENDFOR»
	 	        
	 	    }
	 	
	 	    /**
	 	     * This method creates an instance of {@link CORELanguageElementMapping}.
	 	     * @param perspective 
	 	     * @param fromCardinality
	 	     * @param fromRoleName
	 	     * @param fromMetaclass
	 	     * @param toCardinality
	 	     * @param toRoleName
	 	     * @param toMetaclass
	 	     * @return the language element mapping.
	 	     * 
	 	     * @author Hyacinth Ali
	 	     */
	 	    private static ElementMapping createLanguageElementMapping(COREPerspective perspective,
	 	            Cardinality fromCardinality, String fromRoleName, EObject fromMetaclass, Cardinality toCardinality, 
	 	            String toRoleName, EObject toMetaclass) {
	 	
	 	        CORELanguageElementMapping mappingType = CoreFactory.eINSTANCE.createCORELanguageElementMapping();
	 	        mappingType.setIdentifier(getNextMappingId(perspective));
	 	
	 	        // from mapping end settings
	 	        MappingEnd fromMappingEnd = CoreFactory.eINSTANCE.createMappingEnd();
	 	        fromMappingEnd.setCardinality(fromCardinality);
	 	        fromMappingEnd.setRoleName(fromRoleName);
	 	        COREExternalLanguage fromLanguage = (COREExternalLanguage) perspective.getLanguages().get(fromRoleName);
	 	        CORELanguageElement fromLanguageElement = getLanguageElement(fromLanguage, fromMetaclass);
	 	        fromMappingEnd.setLanguageElement(fromLanguageElement);
	 	
	 	        // to mapping end settings
	 	        MappingEnd toMappingEnd = CoreFactory.eINSTANCE.createMappingEnd();
	 	        toMappingEnd.setCardinality(toCardinality);
	 	        toMappingEnd.setRoleName(toRoleName);
	 	        COREExternalLanguage toLanguage = (COREExternalLanguage) perspective.getLanguages().get(toRoleName);
	 	        CORELanguageElement toLanguageElement =
	 	                getLanguageElement(toLanguage, toMetaclass);
	 	        toMappingEnd.setLanguageElement(toLanguageElement);
	 	
	 	        mappingType.getMappingEnds().add(fromMappingEnd);
	 	        mappingType.getMappingEnds().add(toMappingEnd);
	 	
	 	        perspective.getMappings().add(mappingType);
	 	
	 	        ElementMapping elementMapping = new ElementMapping();
	 	        elementMapping.setMappingType(mappingType);
	 	        elementMapping.setFromLanguageElement(fromLanguageElement);
	 	        elementMapping.setToLanguageElement(toLanguageElement);
	 	
	 	        return elementMapping;
	 	    }
	 	
	 	    /**
	 	     * This method creates nested mapping, i.e., a language element mapping which is contained in another language 
	 	     * element mapping.
	 	     * 
	 	     * @author Hyacinth Ali
	 	     * @param mappingType - the container of the nested mapping.
	 	     * @param fromLanguageElement - from mapped language element of the mappingType
	 	     * @param toLanguageElement - to mapped language element of the mappingType
	 	     * @param fromNestedElementName - from nested language element name
	 	     * @param toNestedElementName - to nested language element name
	 	     * @param fromRoleName - the role name of the from language in the perspective.
	 	     * @param toRoleName - the role name of the to language in the perspective.
	 	     */
	 	    private static void createNestedMapping(CORELanguageElementMapping mappingType,
	 	            CORELanguageElement fromLanguageElement, CORELanguageElement toLanguageElement, String fromNestedElementName, 
	 	            String toNestedElementName, String fromRoleName, String toRoleName) {
	 	
	 	        // from nested language element, which is contained in fromLanguageElement
	 	        CORELanguageElement fromNestedElement = getNestedElement(fromLanguageElement, fromNestedElementName);
	 	        
	 	        // to nested language element, which is contained in toLanguageElement
	 	        CORELanguageElement toNestedElement = getNestedElement(toLanguageElement, toNestedElementName);
	 	
	 	        // create the nested mapping
	 	        CORELanguageElementMapping nestedElementMapping = CoreFactory.eINSTANCE.createCORELanguageElementMapping();
	 	        
	 	        MappingEnd fromNestedElementMappingEnd = CoreFactory.eINSTANCE.createMappingEnd();
	 	        fromNestedElementMappingEnd.setRoleName(fromRoleName);
	 	        fromNestedElementMappingEnd.setLanguageElement(fromNestedElement);
	 	        
	 	        MappingEnd toNestedElementMappingEnd = CoreFactory.eINSTANCE.createMappingEnd();
	 	        toNestedElementMappingEnd.setRoleName(toRoleName);
	 	        toNestedElementMappingEnd.setLanguageElement(toNestedElement);
	 	        
	 	        nestedElementMapping.getMappingEnds().add(fromNestedElementMappingEnd);
	 	        fromNestedElementMappingEnd.setType(nestedElementMapping);
	 	        nestedElementMapping.getMappingEnds().add(toNestedElementMappingEnd);
	 	        toNestedElementMappingEnd.setType(nestedElementMapping);
	 	         
	 	        mappingType.getNestedMappings().add(nestedElementMapping);
	 	    }
	 	    
	 	    private static InterLanguageMapping createInterLanguageMapping(CORELanguageElementMapping mapping) {
	 	        InterLanguageMapping interMapping = CoreFactory.eINSTANCE.createInterLanguageMapping();
	 	        mapping.setCoreLanguageElementMapping(mapping);
	 	        return interMapping;
	 	    }
	 	    
	 	    private static void createInterMappingEnd(InterLanguageMapping interMapping, CORELanguageElementMapping leMapping, 
	 	                boolean origin, boolean destination, int mappingEndNumber) {
	 	            InterLanguageMappingEnd interMappingEnd = CoreFactory.eINSTANCE.createInterLanguageMappingEnd();
	 	            interMappingEnd.setOrigin(origin);
	 	            interMappingEnd.setDestination(destination);
	 	            interMappingEnd.setMappingEnd(leMapping.getMappingEnds().get(mappingEndNumber));
	 	    }
	 	
	 	    /**
	 	     * This method returns an instance of {@link CORELanguageElement} based on the language container and the
	 	     * referenced language element.
	 	     * 
	 	     * @param language, the container of the language element.
	 	     * @param element of the interest.
	 	     * @return the language element.
	 	     */
	 	    private static CORELanguageElement getLanguageElement(COREExternalLanguage language, EObject element) {
	 	        CORELanguageElement languageElement = null;
	 	        for (CORELanguageElement le : language.getLanguageElements()) {
	 	            if (le.getLanguageElement().equals(element)) {
	 	                languageElement = le;
	 	                break;
	 	            }
	 	        }
	 	
	 	        return languageElement;
	 	
	 	    }
	 	
	 	    /**
	 	     * This helper method returns an instance of a {@link CORELanguageElement} (most structural feature) which are 
	 	     * contained in another language element. E.g., the structural feature of the name in a class (i.e., a language 
	 	     * element).
	 	     * @param owner of the language element to be retrieved.
	 	     * @param elementName the given name for the element.
	 	     * @return the contained element.
	 	     */
	 	    private static CORELanguageElement getNestedElement(CORELanguageElement owner, String elementName) {
	 	        CORELanguageElement nestedElement = null;
	 	        for (CORELanguageElement element : owner.getNestedElements()) {
	 	            if (element.getName().equals(elementName)) {
	 	                nestedElement = element;
	 	                break;
	 	            }
	 	        }
	 	        return nestedElement;
	 	    }
	 	    
	 		private static int getNextMappingId(COREPerspective perspective) {
	 	
	 			int idNumber = 0;
	 			for (CORELanguageElementMapping lem : perspective.getMappings()) {
	 				if (lem.getIdentifier() > idNumber) {
	 					idNumber = lem.getIdentifier();
	 				}
	 			}
	 			return idNumber + 1;
	 		}
	 	}
	 	
	 	/**
	 	  * This method is used to create an instance of {@link IntraLanguageMapping}
	 	  * @param perspective the perspective in which the mapping exists.
	 	  * @param name the name of the mapping
	 	  * @param closure whether the mapping will include all parts of a given hierarchy
	 	  * @param reuse whether the mapping represents a reuse
	 	  * @param increaseDepth for multi-view models, will crossing this link increase the depth of the navigation bar
	 	  * @param changeModel will there be a change of model when navigating this link
	 	  * @param fromElement the originating EClass for the mapping
	 	  */
	 	private static IntraLanguageMapping createIntraLanguageMapping(COREPerspective perspective, String name, boolean closure, 
	 	         boolean reuse, boolean increaseDepth, boolean changeModel, EClass fromElement) {
	 	     IntraLanguageMapping ilMapping = CoreFactory.eINSTANCE.createIntraLanguageMapping();
	 	     ilMapping.setName(name);
	 	     ilMapping.setClosure(true);
	 	     ilMapping.setReuse(true);
	 	     ilMapping.setIncreaseDepth(true);
	 	     ilMapping.setChangeModel(true);
	 	     ilMapping.setFrom(fromElement);
	 	     return ilMapping;
	 	}
	 	
	 	
	 	private static void addHopToILM(IntraLanguageMapping mapping, EReference hop) {
	 	    mapping.getHops().add(hop);
	 	}
	 	
	 	'''
	 	
	 }
	 
	 /**
	  * Gets the cardinality of a given mapping-end.
	  */
	 def static String getCardinality(LanguageElementMapping mapping, boolean isFrom) {
	     var cardinality = ''
	
	     if (isFrom) {
	         
	         switch(mapping.fromCardinality) {
            case COMPULSORY: {
                cardinality = "Cardinality.COMPULSORY"
            }
            case COMPULSORY_MULTIPLE: {
                cardinality = "Cardinality.COMPULSORY_MULTIPLE"
            }
            case OPTIONAL: {
                cardinality = "Cardinality.OPTIONAL"
            }
            case OPTIONAL_MULTIPLE: {
                cardinality = "Cardinality.OPTIONAL_MULTIPLE"
            }
             
         }
	         
	     } else {
	         
	         switch(mapping.toCardinality) {
            case COMPULSORY: {
                cardinality = "Cardinality.COMPULSORY"
            }
            case COMPULSORY_MULTIPLE: {
                cardinality = "Cardinality.COMPULSORY_MULTIPLE"
            }
            case OPTIONAL: {
                cardinality = "Cardinality.OPTIONAL"
            }
            case OPTIONAL_MULTIPLE: {
                cardinality = "Cardinality.OPTIONAL_MULTIPLE"
            }
             
          }
	         
	     }
	     
	     return cardinality
	 }
	
}