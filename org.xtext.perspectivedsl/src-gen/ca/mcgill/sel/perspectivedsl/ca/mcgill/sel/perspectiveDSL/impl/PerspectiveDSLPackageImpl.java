/**
 * generated by Xtext 2.22.0
 */
package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.impl;

import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Action;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Cardinality;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Hop;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.InterLanguageMappingEnd;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.IntraLanguageMapping;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Language;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.LanguageElementMapping;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.NestedMapping;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.Perspective;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveActionType;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLFactory;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerspectiveDSLPackageImpl extends EPackageImpl implements PerspectiveDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perspectiveModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perspectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageElementMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interLanguageMappingEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intraLanguageMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cardinalityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum perspectiveActionTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.perspectiveDSL.PerspectiveDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PerspectiveDSLPackageImpl()
  {
    super(eNS_URI, PerspectiveDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link PerspectiveDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PerspectiveDSLPackage init()
  {
    if (isInited) return (PerspectiveDSLPackage)EPackage.Registry.INSTANCE.getEPackage(PerspectiveDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredPerspectiveDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    PerspectiveDSLPackageImpl thePerspectiveDSLPackage = registeredPerspectiveDSLPackage instanceof PerspectiveDSLPackageImpl ? (PerspectiveDSLPackageImpl)registeredPerspectiveDSLPackage : new PerspectiveDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    thePerspectiveDSLPackage.createPackageContents();

    // Initialize created meta-data
    thePerspectiveDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePerspectiveDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PerspectiveDSLPackage.eNS_URI, thePerspectiveDSLPackage);
    return thePerspectiveDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPerspectiveModel()
  {
    return perspectiveModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPerspectiveModel_Perspective()
  {
    return (EReference)perspectiveModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPerspective()
  {
    return perspectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPerspective_Name()
  {
    return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPerspective_Default()
  {
    return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPerspective_DisplayName()
  {
    return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPerspective_Languages()
  {
    return (EReference)perspectiveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPerspective_Actions()
  {
    return (EReference)perspectiveEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPerspective_Mappings()
  {
    return (EReference)perspectiveEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPerspective_Intralanguagemappings()
  {
    return (EReference)perspectiveEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLanguage()
  {
    return languageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguage_Name()
  {
    return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguage_RootPackage()
  {
    return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguage_PackageClassName()
  {
    return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguage_RoleName()
  {
    return (EAttribute)languageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLanguageElementMapping()
  {
    return languageElementMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_Name()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_FromCardinality()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_ToCardinality()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_FromElement()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_FromRoleName()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_FromGetElement()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_ToElement()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_ToRoleName()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageElementMapping_ToGetElement()
  {
    return (EAttribute)languageElementMappingEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLanguageElementMapping_NestedMappings()
  {
    return (EReference)languageElementMappingEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLanguageElementMapping_InterLanguageMappingEnds()
  {
    return (EReference)languageElementMappingEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNestedMapping()
  {
    return nestedMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNestedMapping_Name()
  {
    return (EAttribute)nestedMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNestedMapping_FromElementName()
  {
    return (EAttribute)nestedMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNestedMapping_FromRoleName()
  {
    return (EAttribute)nestedMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNestedMapping_ToElementName()
  {
    return (EAttribute)nestedMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNestedMapping_ToRoleName()
  {
    return (EAttribute)nestedMappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInterLanguageMappingEnd()
  {
    return interLanguageMappingEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInterLanguageMappingEnd_Name()
  {
    return (EAttribute)interLanguageMappingEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInterLanguageMappingEnd_Origin()
  {
    return (EAttribute)interLanguageMappingEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInterLanguageMappingEnd_Destination()
  {
    return (EAttribute)interLanguageMappingEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAction_ActionType()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAction_RoleName()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntraLanguageMapping()
  {
    return intraLanguageMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_Name()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_Closure()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_Reuse()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_IncreaseDepth()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_ChangeModel()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_FromElement()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntraLanguageMapping_FromGetElement()
  {
    return (EAttribute)intraLanguageMappingEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntraLanguageMapping_Hops()
  {
    return (EReference)intraLanguageMappingEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHop()
  {
    return hopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHop_HopElement()
  {
    return (EAttribute)hopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHop_FromGetHop()
  {
    return (EAttribute)hopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getCardinality()
  {
    return cardinalityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getPerspectiveActionType()
  {
    return perspectiveActionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PerspectiveDSLFactory getPerspectiveDSLFactory()
  {
    return (PerspectiveDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    perspectiveModelEClass = createEClass(PERSPECTIVE_MODEL);
    createEReference(perspectiveModelEClass, PERSPECTIVE_MODEL__PERSPECTIVE);

    perspectiveEClass = createEClass(PERSPECTIVE);
    createEAttribute(perspectiveEClass, PERSPECTIVE__NAME);
    createEAttribute(perspectiveEClass, PERSPECTIVE__DEFAULT);
    createEAttribute(perspectiveEClass, PERSPECTIVE__DISPLAY_NAME);
    createEReference(perspectiveEClass, PERSPECTIVE__LANGUAGES);
    createEReference(perspectiveEClass, PERSPECTIVE__ACTIONS);
    createEReference(perspectiveEClass, PERSPECTIVE__MAPPINGS);
    createEReference(perspectiveEClass, PERSPECTIVE__INTRALANGUAGEMAPPINGS);

    languageEClass = createEClass(LANGUAGE);
    createEAttribute(languageEClass, LANGUAGE__NAME);
    createEAttribute(languageEClass, LANGUAGE__ROOT_PACKAGE);
    createEAttribute(languageEClass, LANGUAGE__PACKAGE_CLASS_NAME);
    createEAttribute(languageEClass, LANGUAGE__ROLE_NAME);

    languageElementMappingEClass = createEClass(LANGUAGE_ELEMENT_MAPPING);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__NAME);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__FROM_CARDINALITY);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__TO_CARDINALITY);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__FROM_ELEMENT);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__FROM_ROLE_NAME);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__FROM_GET_ELEMENT);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__TO_ELEMENT);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__TO_ROLE_NAME);
    createEAttribute(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__TO_GET_ELEMENT);
    createEReference(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__NESTED_MAPPINGS);
    createEReference(languageElementMappingEClass, LANGUAGE_ELEMENT_MAPPING__INTER_LANGUAGE_MAPPING_ENDS);

    nestedMappingEClass = createEClass(NESTED_MAPPING);
    createEAttribute(nestedMappingEClass, NESTED_MAPPING__NAME);
    createEAttribute(nestedMappingEClass, NESTED_MAPPING__FROM_ELEMENT_NAME);
    createEAttribute(nestedMappingEClass, NESTED_MAPPING__FROM_ROLE_NAME);
    createEAttribute(nestedMappingEClass, NESTED_MAPPING__TO_ELEMENT_NAME);
    createEAttribute(nestedMappingEClass, NESTED_MAPPING__TO_ROLE_NAME);

    interLanguageMappingEndEClass = createEClass(INTER_LANGUAGE_MAPPING_END);
    createEAttribute(interLanguageMappingEndEClass, INTER_LANGUAGE_MAPPING_END__NAME);
    createEAttribute(interLanguageMappingEndEClass, INTER_LANGUAGE_MAPPING_END__ORIGIN);
    createEAttribute(interLanguageMappingEndEClass, INTER_LANGUAGE_MAPPING_END__DESTINATION);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__ACTION_TYPE);
    createEAttribute(actionEClass, ACTION__ROLE_NAME);
    createEAttribute(actionEClass, ACTION__NAME);

    intraLanguageMappingEClass = createEClass(INTRA_LANGUAGE_MAPPING);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__NAME);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__CLOSURE);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__REUSE);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__INCREASE_DEPTH);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__CHANGE_MODEL);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__FROM_ELEMENT);
    createEAttribute(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__FROM_GET_ELEMENT);
    createEReference(intraLanguageMappingEClass, INTRA_LANGUAGE_MAPPING__HOPS);

    hopEClass = createEClass(HOP);
    createEAttribute(hopEClass, HOP__HOP_ELEMENT);
    createEAttribute(hopEClass, HOP__FROM_GET_HOP);

    // Create enums
    cardinalityEEnum = createEEnum(CARDINALITY);
    perspectiveActionTypeEEnum = createEEnum(PERSPECTIVE_ACTION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(perspectiveModelEClass, PerspectiveModel.class, "PerspectiveModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerspectiveModel_Perspective(), this.getPerspective(), null, "perspective", null, 0, -1, PerspectiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(perspectiveEClass, Perspective.class, "Perspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerspective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerspective_Default(), ecorePackage.getEString(), "default", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerspective_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerspective_Languages(), this.getLanguage(), null, "languages", null, 0, -1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerspective_Actions(), this.getAction(), null, "actions", null, 0, -1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerspective_Mappings(), this.getLanguageElementMapping(), null, "mappings", null, 0, -1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPerspective_Intralanguagemappings(), this.getIntraLanguageMapping(), null, "intralanguagemappings", null, 0, -1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguage_RootPackage(), ecorePackage.getEString(), "rootPackage", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguage_PackageClassName(), ecorePackage.getEString(), "packageClassName", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguage_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageElementMappingEClass, LanguageElementMapping.class, "LanguageElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageElementMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_FromCardinality(), this.getCardinality(), "fromCardinality", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_ToCardinality(), this.getCardinality(), "toCardinality", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_FromElement(), ecorePackage.getEString(), "fromElement", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_FromRoleName(), ecorePackage.getEString(), "fromRoleName", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_FromGetElement(), ecorePackage.getEString(), "fromGetElement", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_ToElement(), ecorePackage.getEString(), "toElement", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_ToRoleName(), ecorePackage.getEString(), "toRoleName", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageElementMapping_ToGetElement(), ecorePackage.getEString(), "toGetElement", null, 0, 1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageElementMapping_NestedMappings(), this.getNestedMapping(), null, "nestedMappings", null, 0, -1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageElementMapping_InterLanguageMappingEnds(), this.getInterLanguageMappingEnd(), null, "interLanguageMappingEnds", null, 0, -1, LanguageElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedMappingEClass, NestedMapping.class, "NestedMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNestedMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, NestedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNestedMapping_FromElementName(), ecorePackage.getEString(), "fromElementName", null, 0, 1, NestedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNestedMapping_FromRoleName(), ecorePackage.getEString(), "fromRoleName", null, 0, 1, NestedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNestedMapping_ToElementName(), ecorePackage.getEString(), "toElementName", null, 0, 1, NestedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNestedMapping_ToRoleName(), ecorePackage.getEString(), "toRoleName", null, 0, 1, NestedMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interLanguageMappingEndEClass, InterLanguageMappingEnd.class, "InterLanguageMappingEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterLanguageMappingEnd_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterLanguageMappingEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterLanguageMappingEnd_Origin(), ecorePackage.getEBoolean(), "origin", null, 0, 1, InterLanguageMappingEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterLanguageMappingEnd_Destination(), ecorePackage.getEBoolean(), "destination", null, 0, 1, InterLanguageMappingEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_ActionType(), this.getPerspectiveActionType(), "actionType", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intraLanguageMappingEClass, IntraLanguageMapping.class, "IntraLanguageMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntraLanguageMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_Closure(), ecorePackage.getEBoolean(), "closure", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_Reuse(), ecorePackage.getEBoolean(), "reuse", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_IncreaseDepth(), ecorePackage.getEBoolean(), "increaseDepth", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_ChangeModel(), ecorePackage.getEBoolean(), "changeModel", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_FromElement(), ecorePackage.getEString(), "fromElement", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntraLanguageMapping_FromGetElement(), ecorePackage.getEString(), "fromGetElement", null, 0, 1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntraLanguageMapping_Hops(), this.getHop(), null, "hops", null, 0, -1, IntraLanguageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hopEClass, Hop.class, "Hop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHop_HopElement(), ecorePackage.getEString(), "hopElement", null, 0, 1, Hop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHop_FromGetHop(), ecorePackage.getEString(), "fromGetHop", null, 0, 1, Hop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
    addEEnumLiteral(cardinalityEEnum, Cardinality.COMPULSORY);
    addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL);
    addEEnumLiteral(cardinalityEEnum, Cardinality.COMPULSORY_MULTIPLE);
    addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL_MULTIPLE);

    initEEnum(perspectiveActionTypeEEnum, PerspectiveActionType.class, "PerspectiveActionType");
    addEEnumLiteral(perspectiveActionTypeEEnum, PerspectiveActionType.REEXPOSE);
    addEEnumLiteral(perspectiveActionTypeEEnum, PerspectiveActionType.REDEFINED);
    addEEnumLiteral(perspectiveActionTypeEEnum, PerspectiveActionType.CREATE_MAPPING);

    // Create resource
    createResource(eNS_URI);
  }

} //PerspectiveDSLPackageImpl
