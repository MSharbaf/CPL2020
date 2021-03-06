/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.cpl.cPL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.pivot.PivotPackage;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import org.xtext.example.cpl.cPL.CPLFactory;
import org.xtext.example.cpl.cPL.CPLPackage;
import org.xtext.example.cpl.cPL.ConditionCS;
import org.xtext.example.cpl.cPL.DescriptionCP;
import org.xtext.example.cpl.cPL.RelationCP;
import org.xtext.example.cpl.cPL.TopLevelCP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPLPackageImpl extends EPackageImpl implements CPLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionCSEClass = null;

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
   * @see org.xtext.example.cpl.cPL.CPLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CPLPackageImpl()
  {
    super(eNS_URI, CPLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link CPLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CPLPackage init()
  {
    if (isInited) return (CPLPackage)EPackage.Registry.INSTANCE.getEPackage(CPLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredCPLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    CPLPackageImpl theCPLPackage = registeredCPLPackage instanceof CPLPackageImpl ? (CPLPackageImpl)registeredCPLPackage : new CPLPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    BaseCSPackage.eINSTANCE.eClass();
    CompleteOCLCSPackage.eINSTANCE.eClass();
    PivotPackage.eINSTANCE.eClass();
    EssentialOCLCSPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCPLPackage.createPackageContents();

    // Initialize created meta-data
    theCPLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCPLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CPLPackage.eNS_URI, theCPLPackage);
    return theCPLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelCP()
  {
    return topLevelCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelCP_Name()
  {
    return (EAttribute)topLevelCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedImports()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedContexts()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedRelation()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedMessage()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationCP()
  {
    return relationCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationCP_OwnedConditions()
  {
    return (EReference)relationCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescriptionCP()
  {
    return descriptionCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescriptionCP_Name()
  {
    return (EAttribute)descriptionCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescriptionCP_OwnedExpression()
  {
    return (EAttribute)descriptionCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionCS()
  {
    return conditionCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionCS_OwnedElementA()
  {
    return (EAttribute)conditionCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionCS_OwnedElementB()
  {
    return (EAttribute)conditionCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CPLFactory getCPLFactory()
  {
    return (CPLFactory)getEFactoryInstance();
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
    topLevelCPEClass = createEClass(TOP_LEVEL_CP);
    createEAttribute(topLevelCPEClass, TOP_LEVEL_CP__NAME);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_IMPORTS);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_CONTEXTS);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_RELATION);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_MESSAGE);

    relationCPEClass = createEClass(RELATION_CP);
    createEReference(relationCPEClass, RELATION_CP__OWNED_CONDITIONS);

    descriptionCPEClass = createEClass(DESCRIPTION_CP);
    createEAttribute(descriptionCPEClass, DESCRIPTION_CP__NAME);
    createEAttribute(descriptionCPEClass, DESCRIPTION_CP__OWNED_EXPRESSION);

    conditionCSEClass = createEClass(CONDITION_CS);
    createEAttribute(conditionCSEClass, CONDITION_CS__OWNED_ELEMENT_A);
    createEAttribute(conditionCSEClass, CONDITION_CS__OWNED_ELEMENT_B);
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

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
    CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteOCLCSPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(topLevelCPEClass, TopLevelCP.class, "TopLevelCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopLevelCP_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedImports(), theBaseCSPackage.getImportCS(), null, "ownedImports", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedContexts(), theCompleteOCLCSPackage.getContextDeclCS(), null, "ownedContexts", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedRelation(), this.getRelationCP(), null, "ownedRelation", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedMessage(), this.getDescriptionCP(), null, "ownedMessage", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationCPEClass, RelationCP.class, "RelationCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationCP_OwnedConditions(), this.getConditionCS(), null, "ownedConditions", null, 0, -1, RelationCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionCPEClass, DescriptionCP.class, "DescriptionCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescriptionCP_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DescriptionCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDescriptionCP_OwnedExpression(), theEcorePackage.getEString(), "ownedExpression", null, 0, 1, DescriptionCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionCSEClass, ConditionCS.class, "ConditionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionCS_OwnedElementA(), theEcorePackage.getEString(), "ownedElementA", null, 0, 1, ConditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionCS_OwnedElementB(), theEcorePackage.getEString(), "ownedElementB", null, 0, 1, ConditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CPLPackageImpl
