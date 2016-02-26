/**
 * Copyright (c) 2015, 2016 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package eaeu.ced.impl;

import eaeu.ced.CEDFactory;
import eaeu.ced.CEDPackage;
import eaeu.ced.Component;
import eaeu.ced.DataElement;
import eaeu.ced.DataSet;
import eaeu.ced.Document;
import eaeu.ced.Element;

import eaeu.cm.CMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CEDPackageImpl extends EPackageImpl implements CEDPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataElementEClass = null;

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
     * @see eaeu.ced.CEDPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CEDPackageImpl() {
        super(eNS_URI, CEDFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CEDPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CEDPackage init() {
        if (isInited) return (CEDPackage)EPackage.Registry.INSTANCE.getEPackage(CEDPackage.eNS_URI);

        // Obtain or create and register package
        CEDPackageImpl theCEDPackage = (CEDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CEDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CEDPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CMPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theCEDPackage.createPackageContents();

        // Initialize created meta-data
        theCEDPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCEDPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CEDPackage.eNS_URI, theCEDPackage);
        return theCEDPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElement() {
        return elementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Realization() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainer() {
        return containerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_Components() {
        return (EReference)containerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_Document() {
        return (EReference)containerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_AvailableProperties() {
        return (EReference)containerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_AvailableRoles() {
        return (EReference)containerEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getContainer__SetSuitableRealizations__boolean() {
        return containerEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComponent_Container() {
        return (EReference)componentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getComponent__GetConceptualElement() {
        return componentEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getComponent__SetSuitableRealization() {
        return componentEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocument() {
        return documentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocument_Model() {
        return (EReference)documentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocument_RealizationModel() {
        return (EReference)documentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataSet() {
        return dataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataSet_Role() {
        return (EReference)dataSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataSet_Label() {
        return (EAttribute)dataSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataSet_Relations() {
        return (EReference)dataSetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataSet_AllowedAttributes() {
        return (EReference)dataSetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataSet_AllowedRelationEnds() {
        return (EReference)dataSetEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDataSet__GetConceptualElement() {
        return dataSetEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDataSet__SyncDataElements() {
        return dataSetEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataElement() {
        return dataElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataElement_Property() {
        return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataElement_Label() {
        return (EAttribute)dataElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDataElement__GetConceptualElement() {
        return dataElementEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CEDFactory getCEDFactory() {
        return (CEDFactory)getEFactoryInstance();
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
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        elementEClass = createEClass(ELEMENT);
        createEAttribute(elementEClass, ELEMENT__REALIZATION);

        containerEClass = createEClass(CONTAINER);
        createEReference(containerEClass, CONTAINER__COMPONENTS);
        createEReference(containerEClass, CONTAINER__DOCUMENT);
        createEReference(containerEClass, CONTAINER__AVAILABLE_PROPERTIES);
        createEReference(containerEClass, CONTAINER__AVAILABLE_ROLES);
        createEOperation(containerEClass, CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN);

        componentEClass = createEClass(COMPONENT);
        createEReference(componentEClass, COMPONENT__CONTAINER);
        createEOperation(componentEClass, COMPONENT___GET_CONCEPTUAL_ELEMENT);
        createEOperation(componentEClass, COMPONENT___SET_SUITABLE_REALIZATION);

        documentEClass = createEClass(DOCUMENT);
        createEReference(documentEClass, DOCUMENT__MODEL);
        createEReference(documentEClass, DOCUMENT__REALIZATION_MODEL);

        dataSetEClass = createEClass(DATA_SET);
        createEReference(dataSetEClass, DATA_SET__ROLE);
        createEAttribute(dataSetEClass, DATA_SET__LABEL);
        createEReference(dataSetEClass, DATA_SET__RELATIONS);
        createEReference(dataSetEClass, DATA_SET__ALLOWED_ATTRIBUTES);
        createEReference(dataSetEClass, DATA_SET__ALLOWED_RELATION_ENDS);
        createEOperation(dataSetEClass, DATA_SET___GET_CONCEPTUAL_ELEMENT);
        createEOperation(dataSetEClass, DATA_SET___SYNC_DATA_ELEMENTS);

        dataElementEClass = createEClass(DATA_ELEMENT);
        createEReference(dataElementEClass, DATA_ELEMENT__PROPERTY);
        createEAttribute(dataElementEClass, DATA_ELEMENT__LABEL);
        createEOperation(dataElementEClass, DATA_ELEMENT___GET_CONCEPTUAL_ELEMENT);
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
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CMPackage theCMPackage = (CMPackage)EPackage.Registry.INSTANCE.getEPackage(CMPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        elementEClass.getESuperTypes().add(theCMPackage.getNamedElement());
        containerEClass.getESuperTypes().add(this.getElement());
        componentEClass.getESuperTypes().add(this.getElement());
        componentEClass.getESuperTypes().add(theCMPackage.getMultiplicityElement());
        documentEClass.getESuperTypes().add(this.getContainer());
        dataSetEClass.getESuperTypes().add(this.getContainer());
        dataSetEClass.getESuperTypes().add(this.getComponent());
        dataElementEClass.getESuperTypes().add(this.getComponent());

        // Initialize classes, features, and operations; add parameters
        initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getElement_Realization(), ecorePackage.getEString(), "realization", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(containerEClass, eaeu.ced.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContainer_Components(), this.getComponent(), this.getComponent_Container(), "components", null, 0, -1, eaeu.ced.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContainer_Document(), this.getDocument(), null, "document", null, 1, 1, eaeu.ced.Container.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getContainer_AvailableProperties(), theCMPackage.getProperty(), null, "availableProperties", null, 0, -1, eaeu.ced.Container.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getContainer_AvailableRoles(), theCMPackage.getRole(), null, "availableRoles", null, 0, -1, eaeu.ced.Container.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getContainer__SetSuitableRealizations__boolean(), null, "setSuitableRealizations", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEBoolean(), "setOnlyEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComponent_Container(), this.getContainer(), this.getContainer_Components(), "container", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getComponent__GetConceptualElement(), theCMPackage.getGlobalElement(), "getConceptualElement", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getComponent__SetSuitableRealization(), null, "setSuitableRealization", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDocument_Model(), theCMPackage.getModel(), null, "model", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocument_RealizationModel(), ecorePackage.getEObject(), null, "realizationModel", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataSet_Role(), theCMPackage.getRole(), null, "role", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataSet_Label(), ecorePackage.getEString(), "label", null, 0, 1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDataSet_Relations(), theCMPackage.getRelation(), null, "relations", null, 0, -1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDataSet_AllowedAttributes(), theCMPackage.getAttribute(), null, "allowedAttributes", null, 0, -1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDataSet_AllowedRelationEnds(), theCMPackage.getRelationEnd(), null, "allowedRelationEnds", null, 0, -1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getDataSet__GetConceptualElement(), theCMPackage.getGlobalElement(), "getConceptualElement", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getDataSet__SyncDataElements(), null, "syncDataElements", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataElement_Property(), theCMPackage.getProperty(), null, "property", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, DataElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getDataElement__GetConceptualElement(), theCMPackage.getGlobalElement(), "getConceptualElement", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CEDPackageImpl
