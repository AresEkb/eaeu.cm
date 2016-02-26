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
package eaeu.cm.impl;

import eaeu.cm.Attribute;
import eaeu.cm.CMFactory;
import eaeu.cm.CMPackage;
import eaeu.cm.Concept;
import eaeu.cm.Element;
import eaeu.cm.GlobalElement;
import eaeu.cm.LocalElement;
import eaeu.cm.Model;
import eaeu.cm.MultiplicityElement;
import eaeu.cm.NamedElement;
import eaeu.cm.Property;
import eaeu.cm.Relation;
import eaeu.cm.RelationEnd;
import eaeu.cm.Role;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMPackageImpl extends EPackageImpl implements CMPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicityElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conceptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationEndEClass = null;

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
    private EClass localElementEClass = null;

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
     * @see eaeu.cm.CMPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CMPackageImpl() {
        super(eNS_URI, CMFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CMPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CMPackage init() {
        if (isInited) return (CMPackage)EPackage.Registry.INSTANCE.getEPackage(CMPackage.eNS_URI);

        // Obtain or create and register package
        CMPackageImpl theCMPackage = (CMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CMPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theCMPackage.createPackageContents();

        // Initialize created meta-data
        theCMPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCMPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CMPackage.eNS_URI, theCMPackage);
        return theCMPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModel() {
        return modelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Elements() {
        return (EReference)modelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Base() {
        return (EReference)modelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalElement() {
        return globalElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalElement_Model() {
        return (EReference)globalElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGlobalElement_Domain() {
        return (EAttribute)globalElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedElement() {
        return namedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamedElement_Name() {
        return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamedElement_Definition() {
        return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiplicityElement() {
        return multiplicityElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityElement_Lower() {
        return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityElement_Upper() {
        return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityElement_Bounds() {
        return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConcept() {
        return conceptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConcept_General() {
        return (EReference)conceptEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConcept_Attributes() {
        return (EReference)conceptEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRole() {
        return roleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRole_Concept() {
        return (EReference)roleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRole_Label() {
        return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelation() {
        return relationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelation_Label() {
        return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelation_Ends() {
        return (EReference)relationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_Concept() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_Property() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Label() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationEnd() {
        return relationEndEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationEnd_Relation() {
        return (EReference)relationEndEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationEnd_Role() {
        return (EReference)relationEndEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationEnd_Label() {
        return (EAttribute)relationEndEClass.getEStructuralFeatures().get(2);
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
    public EAttribute getElement_Analogs() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalElement() {
        return localElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocalElement_Definition() {
        return (EAttribute)localElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMFactory getCMFactory() {
        return (CMFactory)getEFactoryInstance();
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
        modelEClass = createEClass(MODEL);
        createEReference(modelEClass, MODEL__ELEMENTS);
        createEReference(modelEClass, MODEL__BASE);

        globalElementEClass = createEClass(GLOBAL_ELEMENT);
        createEReference(globalElementEClass, GLOBAL_ELEMENT__MODEL);
        createEAttribute(globalElementEClass, GLOBAL_ELEMENT__DOMAIN);

        namedElementEClass = createEClass(NAMED_ELEMENT);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__DEFINITION);

        multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
        createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
        createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
        createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__BOUNDS);

        conceptEClass = createEClass(CONCEPT);
        createEReference(conceptEClass, CONCEPT__GENERAL);
        createEReference(conceptEClass, CONCEPT__ATTRIBUTES);

        propertyEClass = createEClass(PROPERTY);

        roleEClass = createEClass(ROLE);
        createEReference(roleEClass, ROLE__CONCEPT);
        createEAttribute(roleEClass, ROLE__LABEL);

        relationEClass = createEClass(RELATION);
        createEAttribute(relationEClass, RELATION__LABEL);
        createEReference(relationEClass, RELATION__ENDS);

        attributeEClass = createEClass(ATTRIBUTE);
        createEReference(attributeEClass, ATTRIBUTE__CONCEPT);
        createEReference(attributeEClass, ATTRIBUTE__PROPERTY);
        createEAttribute(attributeEClass, ATTRIBUTE__LABEL);

        relationEndEClass = createEClass(RELATION_END);
        createEReference(relationEndEClass, RELATION_END__RELATION);
        createEReference(relationEndEClass, RELATION_END__ROLE);
        createEAttribute(relationEndEClass, RELATION_END__LABEL);

        elementEClass = createEClass(ELEMENT);
        createEAttribute(elementEClass, ELEMENT__ANALOGS);

        localElementEClass = createEClass(LOCAL_ELEMENT);
        createEAttribute(localElementEClass, LOCAL_ELEMENT__DEFINITION);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        globalElementEClass.getESuperTypes().add(this.getElement());
        conceptEClass.getESuperTypes().add(this.getNamedElement());
        conceptEClass.getESuperTypes().add(this.getGlobalElement());
        propertyEClass.getESuperTypes().add(this.getNamedElement());
        propertyEClass.getESuperTypes().add(this.getGlobalElement());
        roleEClass.getESuperTypes().add(this.getNamedElement());
        roleEClass.getESuperTypes().add(this.getGlobalElement());
        relationEClass.getESuperTypes().add(this.getGlobalElement());
        attributeEClass.getESuperTypes().add(this.getLocalElement());
        relationEndEClass.getESuperTypes().add(this.getLocalElement());
        localElementEClass.getESuperTypes().add(this.getElement());
        localElementEClass.getESuperTypes().add(this.getMultiplicityElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModel_Elements(), this.getGlobalElement(), this.getGlobalElement_Model(), "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModel_Base(), this.getModel(), null, "base", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(globalElementEClass, GlobalElement.class, "GlobalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGlobalElement_Model(), this.getModel(), this.getModel_Elements(), "model", null, 1, 1, GlobalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGlobalElement_Domain(), ecorePackage.getEString(), "domain", null, 1, 1, GlobalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNamedElement_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMultiplicityElement_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMultiplicityElement_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMultiplicityElement_Bounds(), ecorePackage.getEString(), "bounds", null, 1, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConcept_General(), this.getConcept(), null, "general", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConcept_Attributes(), this.getAttribute(), this.getAttribute_Concept(), "attributes", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRole_Concept(), this.getConcept(), null, "concept", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRole_Label(), ecorePackage.getEString(), "label", null, 0, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRelation_Label(), ecorePackage.getEString(), "label", null, 0, 1, Relation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRelation_Ends(), this.getRelationEnd(), this.getRelationEnd_Relation(), "ends", null, 2, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttribute_Concept(), this.getConcept(), this.getConcept_Attributes(), "concept", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttribute_Property(), this.getProperty(), null, "property", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Label(), ecorePackage.getEString(), "label", null, 0, 1, Attribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(relationEndEClass, RelationEnd.class, "RelationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationEnd_Relation(), this.getRelation(), this.getRelation_Ends(), "relation", null, 1, 1, RelationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationEnd_Role(), this.getRole(), null, "role", null, 1, 1, RelationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationEnd_Label(), ecorePackage.getEString(), "label", null, 0, 1, RelationEnd.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getElement_Analogs(), ecorePackage.getEString(), "analogs", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localElementEClass, LocalElement.class, "LocalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocalElement_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, LocalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CMPackageImpl
