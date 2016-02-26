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
package eaeu.cm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eaeu.cm.CMFactory
 * @model kind="package"
 * @generated
 */
public interface CMPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/eaeu/cm";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CMPackage eINSTANCE = eaeu.cm.impl.CMPackageImpl.init();

    /**
     * The meta object id for the '{@link eaeu.cm.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.ModelImpl
     * @see eaeu.cm.impl.CMPackageImpl#getModel()
     * @generated
     */
    int MODEL = 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ELEMENTS = 0;

    /**
     * The feature id for the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__BASE = 1;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.ElementImpl
     * @see eaeu.cm.impl.CMPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 10;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ANALOGS = 0;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.GlobalElementImpl <em>Global Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.GlobalElementImpl
     * @see eaeu.cm.impl.CMPackageImpl#getGlobalElement()
     * @generated
     */
    int GLOBAL_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_ELEMENT__ANALOGS = ELEMENT__ANALOGS;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_ELEMENT__MODEL = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_ELEMENT__DOMAIN = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Global Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Global Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.NamedElement <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.NamedElement
     * @see eaeu.cm.impl.CMPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__DEFINITION = 1;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link eaeu.cm.MultiplicityElement <em>Multiplicity Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.MultiplicityElement
     * @see eaeu.cm.impl.CMPackageImpl#getMultiplicityElement()
     * @generated
     */
    int MULTIPLICITY_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT__LOWER = 0;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT__UPPER = 1;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT__BOUNDS = 2;

    /**
     * The number of structural features of the '<em>Multiplicity Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Multiplicity Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.ConceptImpl <em>Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.ConceptImpl
     * @see eaeu.cm.impl.CMPackageImpl#getConcept()
     * @generated
     */
    int CONCEPT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__DEFINITION = NAMED_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ANALOGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>General</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__GENERAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Concept</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Concept</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.PropertyImpl
     * @see eaeu.cm.impl.CMPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DEFINITION = NAMED_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ANALOGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.RoleImpl
     * @see eaeu.cm.impl.CMPackageImpl#getRole()
     * @generated
     */
    int ROLE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__DEFINITION = NAMED_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ANALOGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Concept</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__CONCEPT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.RelationImpl
     * @see eaeu.cm.impl.CMPackageImpl#getRelation()
     * @generated
     */
    int RELATION = 7;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__ANALOGS = GLOBAL_ELEMENT__ANALOGS;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__MODEL = GLOBAL_ELEMENT__MODEL;

    /**
     * The feature id for the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__DOMAIN = GLOBAL_ELEMENT__DOMAIN;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__LABEL = GLOBAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__ENDS = GLOBAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_FEATURE_COUNT = GLOBAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_OPERATION_COUNT = GLOBAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.LocalElementImpl <em>Local Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.LocalElementImpl
     * @see eaeu.cm.impl.CMPackageImpl#getLocalElement()
     * @generated
     */
    int LOCAL_ELEMENT = 11;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ANALOGS = ELEMENT__ANALOGS;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__LOWER = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__UPPER = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__BOUNDS = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__DEFINITION = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Local Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Local Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.AttributeImpl
     * @see eaeu.cm.impl.CMPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 8;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ANALOGS = LOCAL_ELEMENT__ANALOGS;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__LOWER = LOCAL_ELEMENT__LOWER;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__UPPER = LOCAL_ELEMENT__UPPER;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__BOUNDS = LOCAL_ELEMENT__BOUNDS;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DEFINITION = LOCAL_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Concept</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CONCEPT = LOCAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__PROPERTY = LOCAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__LABEL = LOCAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = LOCAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = LOCAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.cm.impl.RelationEndImpl <em>Relation End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.cm.impl.RelationEndImpl
     * @see eaeu.cm.impl.CMPackageImpl#getRelationEnd()
     * @generated
     */
    int RELATION_END = 9;

    /**
     * The feature id for the '<em><b>Analogs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__ANALOGS = LOCAL_ELEMENT__ANALOGS;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__LOWER = LOCAL_ELEMENT__LOWER;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__UPPER = LOCAL_ELEMENT__UPPER;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__BOUNDS = LOCAL_ELEMENT__BOUNDS;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__DEFINITION = LOCAL_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Relation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__RELATION = LOCAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__ROLE = LOCAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END__LABEL = LOCAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Relation End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END_FEATURE_COUNT = LOCAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Relation End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_END_OPERATION_COUNT = LOCAL_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link eaeu.cm.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see eaeu.cm.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the containment reference list '{@link eaeu.cm.Model#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see eaeu.cm.Model#getElements()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Elements();

    /**
     * Returns the meta object for the reference '{@link eaeu.cm.Model#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base</em>'.
     * @see eaeu.cm.Model#getBase()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Base();

    /**
     * Returns the meta object for class '{@link eaeu.cm.GlobalElement <em>Global Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Element</em>'.
     * @see eaeu.cm.GlobalElement
     * @generated
     */
    EClass getGlobalElement();

    /**
     * Returns the meta object for the container reference '{@link eaeu.cm.GlobalElement#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see eaeu.cm.GlobalElement#getModel()
     * @see #getGlobalElement()
     * @generated
     */
    EReference getGlobalElement_Model();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.GlobalElement#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Domain</em>'.
     * @see eaeu.cm.GlobalElement#getDomain()
     * @see #getGlobalElement()
     * @generated
     */
    EAttribute getGlobalElement_Domain();

    /**
     * Returns the meta object for class '{@link eaeu.cm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see eaeu.cm.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see eaeu.cm.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.NamedElement#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see eaeu.cm.NamedElement#getDefinition()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Definition();

    /**
     * Returns the meta object for class '{@link eaeu.cm.MultiplicityElement <em>Multiplicity Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicity Element</em>'.
     * @see eaeu.cm.MultiplicityElement
     * @generated
     */
    EClass getMultiplicityElement();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.MultiplicityElement#getLower <em>Lower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower</em>'.
     * @see eaeu.cm.MultiplicityElement#getLower()
     * @see #getMultiplicityElement()
     * @generated
     */
    EAttribute getMultiplicityElement_Lower();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.MultiplicityElement#getUpper <em>Upper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper</em>'.
     * @see eaeu.cm.MultiplicityElement#getUpper()
     * @see #getMultiplicityElement()
     * @generated
     */
    EAttribute getMultiplicityElement_Upper();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.MultiplicityElement#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bounds</em>'.
     * @see eaeu.cm.MultiplicityElement#getBounds()
     * @see #getMultiplicityElement()
     * @generated
     */
    EAttribute getMultiplicityElement_Bounds();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Concept <em>Concept</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Concept</em>'.
     * @see eaeu.cm.Concept
     * @generated
     */
    EClass getConcept();

    /**
     * Returns the meta object for the reference '{@link eaeu.cm.Concept#getGeneral <em>General</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>General</em>'.
     * @see eaeu.cm.Concept#getGeneral()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_General();

    /**
     * Returns the meta object for the containment reference list '{@link eaeu.cm.Concept#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see eaeu.cm.Concept#getAttributes()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_Attributes();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see eaeu.cm.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Role <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role</em>'.
     * @see eaeu.cm.Role
     * @generated
     */
    EClass getRole();

    /**
     * Returns the meta object for the reference '{@link eaeu.cm.Role#getConcept <em>Concept</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Concept</em>'.
     * @see eaeu.cm.Role#getConcept()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Concept();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.Role#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.cm.Role#getLabel()
     * @see #getRole()
     * @generated
     */
    EAttribute getRole_Label();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Relation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation</em>'.
     * @see eaeu.cm.Relation
     * @generated
     */
    EClass getRelation();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.Relation#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.cm.Relation#getLabel()
     * @see #getRelation()
     * @generated
     */
    EAttribute getRelation_Label();

    /**
     * Returns the meta object for the containment reference list '{@link eaeu.cm.Relation#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ends</em>'.
     * @see eaeu.cm.Relation#getEnds()
     * @see #getRelation()
     * @generated
     */
    EReference getRelation_Ends();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see eaeu.cm.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the container reference '{@link eaeu.cm.Attribute#getConcept <em>Concept</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Concept</em>'.
     * @see eaeu.cm.Attribute#getConcept()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_Concept();

    /**
     * Returns the meta object for the reference '{@link eaeu.cm.Attribute#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Property</em>'.
     * @see eaeu.cm.Attribute#getProperty()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_Property();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.Attribute#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.cm.Attribute#getLabel()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Label();

    /**
     * Returns the meta object for class '{@link eaeu.cm.RelationEnd <em>Relation End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation End</em>'.
     * @see eaeu.cm.RelationEnd
     * @generated
     */
    EClass getRelationEnd();

    /**
     * Returns the meta object for the container reference '{@link eaeu.cm.RelationEnd#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Relation</em>'.
     * @see eaeu.cm.RelationEnd#getRelation()
     * @see #getRelationEnd()
     * @generated
     */
    EReference getRelationEnd_Relation();

    /**
     * Returns the meta object for the reference '{@link eaeu.cm.RelationEnd#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role</em>'.
     * @see eaeu.cm.RelationEnd#getRole()
     * @see #getRelationEnd()
     * @generated
     */
    EReference getRelationEnd_Role();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.RelationEnd#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.cm.RelationEnd#getLabel()
     * @see #getRelationEnd()
     * @generated
     */
    EAttribute getRelationEnd_Label();

    /**
     * Returns the meta object for class '{@link eaeu.cm.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see eaeu.cm.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute list '{@link eaeu.cm.Element#getAnalogs <em>Analogs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Analogs</em>'.
     * @see eaeu.cm.Element#getAnalogs()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Analogs();

    /**
     * Returns the meta object for class '{@link eaeu.cm.LocalElement <em>Local Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Element</em>'.
     * @see eaeu.cm.LocalElement
     * @generated
     */
    EClass getLocalElement();

    /**
     * Returns the meta object for the attribute '{@link eaeu.cm.LocalElement#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see eaeu.cm.LocalElement#getDefinition()
     * @see #getLocalElement()
     * @generated
     */
    EAttribute getLocalElement_Definition();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CMFactory getCMFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link eaeu.cm.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.ModelImpl
         * @see eaeu.cm.impl.CMPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__BASE = eINSTANCE.getModel_Base();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.GlobalElementImpl <em>Global Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.GlobalElementImpl
         * @see eaeu.cm.impl.CMPackageImpl#getGlobalElement()
         * @generated
         */
        EClass GLOBAL_ELEMENT = eINSTANCE.getGlobalElement();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GLOBAL_ELEMENT__MODEL = eINSTANCE.getGlobalElement_Model();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GLOBAL_ELEMENT__DOMAIN = eINSTANCE.getGlobalElement_Domain();

        /**
         * The meta object literal for the '{@link eaeu.cm.NamedElement <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.NamedElement
         * @see eaeu.cm.impl.CMPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__DEFINITION = eINSTANCE.getNamedElement_Definition();

        /**
         * The meta object literal for the '{@link eaeu.cm.MultiplicityElement <em>Multiplicity Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.MultiplicityElement
         * @see eaeu.cm.impl.CMPackageImpl#getMultiplicityElement()
         * @generated
         */
        EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

        /**
         * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

        /**
         * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_ELEMENT__BOUNDS = eINSTANCE.getMultiplicityElement_Bounds();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.ConceptImpl <em>Concept</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.ConceptImpl
         * @see eaeu.cm.impl.CMPackageImpl#getConcept()
         * @generated
         */
        EClass CONCEPT = eINSTANCE.getConcept();

        /**
         * The meta object literal for the '<em><b>General</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONCEPT__GENERAL = eINSTANCE.getConcept_General();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONCEPT__ATTRIBUTES = eINSTANCE.getConcept_Attributes();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.PropertyImpl
         * @see eaeu.cm.impl.CMPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.RoleImpl <em>Role</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.RoleImpl
         * @see eaeu.cm.impl.CMPackageImpl#getRole()
         * @generated
         */
        EClass ROLE = eINSTANCE.getRole();

        /**
         * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__CONCEPT = eINSTANCE.getRole_Concept();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROLE__LABEL = eINSTANCE.getRole_Label();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.RelationImpl <em>Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.RelationImpl
         * @see eaeu.cm.impl.CMPackageImpl#getRelation()
         * @generated
         */
        EClass RELATION = eINSTANCE.getRelation();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION__LABEL = eINSTANCE.getRelation_Label();

        /**
         * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION__ENDS = eINSTANCE.getRelation_Ends();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.AttributeImpl
         * @see eaeu.cm.impl.CMPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Concept</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__CONCEPT = eINSTANCE.getAttribute_Concept();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__PROPERTY = eINSTANCE.getAttribute_Property();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.RelationEndImpl <em>Relation End</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.RelationEndImpl
         * @see eaeu.cm.impl.CMPackageImpl#getRelationEnd()
         * @generated
         */
        EClass RELATION_END = eINSTANCE.getRelationEnd();

        /**
         * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_END__RELATION = eINSTANCE.getRelationEnd_Relation();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_END__ROLE = eINSTANCE.getRelationEnd_Role();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION_END__LABEL = eINSTANCE.getRelationEnd_Label();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.ElementImpl
         * @see eaeu.cm.impl.CMPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Analogs</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__ANALOGS = eINSTANCE.getElement_Analogs();

        /**
         * The meta object literal for the '{@link eaeu.cm.impl.LocalElementImpl <em>Local Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.cm.impl.LocalElementImpl
         * @see eaeu.cm.impl.CMPackageImpl#getLocalElement()
         * @generated
         */
        EClass LOCAL_ELEMENT = eINSTANCE.getLocalElement();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCAL_ELEMENT__DEFINITION = eINSTANCE.getLocalElement_Definition();

    }

} //CMPackage
