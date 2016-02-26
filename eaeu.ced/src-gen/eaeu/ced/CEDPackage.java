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
package eaeu.ced;

import eaeu.cm.CMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see eaeu.ced.CEDFactory
 * @model kind="package"
 * @generated
 */
public interface CEDPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ced";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/eaeu/ced";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ced";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CEDPackage eINSTANCE = eaeu.ced.impl.CEDPackageImpl.init();

    /**
     * The meta object id for the '{@link eaeu.ced.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.ElementImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__NAME = CMPackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__DEFINITION = CMPackage.NAMED_ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__REALIZATION = CMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = CMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = CMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.ced.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.ContainerImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getContainer()
     * @generated
     */
    int CONTAINER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__NAME = ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__DEFINITION = ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__REALIZATION = ELEMENT__REALIZATION;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__COMPONENTS = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__DOCUMENT = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Available Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__AVAILABLE_PROPERTIES = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Available Roles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__AVAILABLE_ROLES = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Set Suitable Realizations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link eaeu.ced.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.ComponentImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__DEFINITION = ELEMENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__REALIZATION = ELEMENT__REALIZATION;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__LOWER = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__UPPER = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__BOUNDS = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__CONTAINER = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Conceptual Element</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___GET_CONCEPTUAL_ELEMENT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Suitable Realization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT___SET_SUITABLE_REALIZATION = ELEMENT_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link eaeu.ced.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.DocumentImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getDocument()
     * @generated
     */
    int DOCUMENT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__NAME = CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__DEFINITION = CONTAINER__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__REALIZATION = CONTAINER__REALIZATION;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__COMPONENTS = CONTAINER__COMPONENTS;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__DOCUMENT = CONTAINER__DOCUMENT;

    /**
     * The feature id for the '<em><b>Available Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__AVAILABLE_PROPERTIES = CONTAINER__AVAILABLE_PROPERTIES;

    /**
     * The feature id for the '<em><b>Available Roles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__AVAILABLE_ROLES = CONTAINER__AVAILABLE_ROLES;

    /**
     * The feature id for the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__MODEL = CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Realization Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT__REALIZATION_MODEL = CONTAINER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Set Suitable Realizations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT___SET_SUITABLE_REALIZATIONS__BOOLEAN = CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN;

    /**
     * The number of operations of the '<em>Document</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eaeu.ced.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.DataSetImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getDataSet()
     * @generated
     */
    int DATA_SET = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__NAME = CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__DEFINITION = CONTAINER__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__REALIZATION = CONTAINER__REALIZATION;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__COMPONENTS = CONTAINER__COMPONENTS;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__DOCUMENT = CONTAINER__DOCUMENT;

    /**
     * The feature id for the '<em><b>Available Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__AVAILABLE_PROPERTIES = CONTAINER__AVAILABLE_PROPERTIES;

    /**
     * The feature id for the '<em><b>Available Roles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__AVAILABLE_ROLES = CONTAINER__AVAILABLE_ROLES;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__LOWER = CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__UPPER = CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__BOUNDS = CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__CONTAINER = CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ROLE = CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__LABEL = CONTAINER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Relations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__RELATIONS = CONTAINER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Allowed Attributes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ALLOWED_ATTRIBUTES = CONTAINER_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Allowed Relation Ends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ALLOWED_RELATION_ENDS = CONTAINER_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Set Suitable Realizations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET___SET_SUITABLE_REALIZATIONS__BOOLEAN = CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN;

    /**
     * The operation id for the '<em>Set Suitable Realization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET___SET_SUITABLE_REALIZATION = CONTAINER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Conceptual Element</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET___GET_CONCEPTUAL_ELEMENT = CONTAINER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Sync Data Elements</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET___SYNC_DATA_ELEMENTS = CONTAINER_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link eaeu.ced.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eaeu.ced.impl.DataElementImpl
     * @see eaeu.ced.impl.CEDPackageImpl#getDataElement()
     * @generated
     */
    int DATA_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__DEFINITION = COMPONENT__DEFINITION;

    /**
     * The feature id for the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__REALIZATION = COMPONENT__REALIZATION;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__LOWER = COMPONENT__LOWER;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__UPPER = COMPONENT__UPPER;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__BOUNDS = COMPONENT__BOUNDS;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__CONTAINER = COMPONENT__CONTAINER;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__PROPERTY = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT__LABEL = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Set Suitable Realization</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT___SET_SUITABLE_REALIZATION = COMPONENT___SET_SUITABLE_REALIZATION;

    /**
     * The operation id for the '<em>Get Conceptual Element</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT___GET_CONCEPTUAL_ELEMENT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;


    /**
     * Returns the meta object for class '{@link eaeu.ced.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see eaeu.ced.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute '{@link eaeu.ced.Element#getRealization <em>Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Realization</em>'.
     * @see eaeu.ced.Element#getRealization()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Realization();

    /**
     * Returns the meta object for class '{@link eaeu.ced.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see eaeu.ced.Container
     * @generated
     */
    EClass getContainer();

    /**
     * Returns the meta object for the containment reference list '{@link eaeu.ced.Container#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see eaeu.ced.Container#getComponents()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_Components();

    /**
     * Returns the meta object for the reference '{@link eaeu.ced.Container#getDocument <em>Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Document</em>'.
     * @see eaeu.ced.Container#getDocument()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_Document();

    /**
     * Returns the meta object for the reference list '{@link eaeu.ced.Container#getAvailableProperties <em>Available Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Available Properties</em>'.
     * @see eaeu.ced.Container#getAvailableProperties()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_AvailableProperties();

    /**
     * Returns the meta object for the reference list '{@link eaeu.ced.Container#getAvailableRoles <em>Available Roles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Available Roles</em>'.
     * @see eaeu.ced.Container#getAvailableRoles()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_AvailableRoles();

    /**
     * Returns the meta object for the '{@link eaeu.ced.Container#setSuitableRealizations(boolean) <em>Set Suitable Realizations</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Suitable Realizations</em>' operation.
     * @see eaeu.ced.Container#setSuitableRealizations(boolean)
     * @generated
     */
    EOperation getContainer__SetSuitableRealizations__boolean();

    /**
     * Returns the meta object for class '{@link eaeu.ced.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see eaeu.ced.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the container reference '{@link eaeu.ced.Component#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container</em>'.
     * @see eaeu.ced.Component#getContainer()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_Container();

    /**
     * Returns the meta object for the '{@link eaeu.ced.Component#getConceptualElement() <em>Get Conceptual Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Conceptual Element</em>' operation.
     * @see eaeu.ced.Component#getConceptualElement()
     * @generated
     */
    EOperation getComponent__GetConceptualElement();

    /**
     * Returns the meta object for the '{@link eaeu.ced.Component#setSuitableRealization() <em>Set Suitable Realization</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Suitable Realization</em>' operation.
     * @see eaeu.ced.Component#setSuitableRealization()
     * @generated
     */
    EOperation getComponent__SetSuitableRealization();

    /**
     * Returns the meta object for class '{@link eaeu.ced.Document <em>Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document</em>'.
     * @see eaeu.ced.Document
     * @generated
     */
    EClass getDocument();

    /**
     * Returns the meta object for the reference '{@link eaeu.ced.Document#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Model</em>'.
     * @see eaeu.ced.Document#getModel()
     * @see #getDocument()
     * @generated
     */
    EReference getDocument_Model();

    /**
     * Returns the meta object for the reference '{@link eaeu.ced.Document#getRealizationModel <em>Realization Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Realization Model</em>'.
     * @see eaeu.ced.Document#getRealizationModel()
     * @see #getDocument()
     * @generated
     */
    EReference getDocument_RealizationModel();

    /**
     * Returns the meta object for class '{@link eaeu.ced.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set</em>'.
     * @see eaeu.ced.DataSet
     * @generated
     */
    EClass getDataSet();

    /**
     * Returns the meta object for the reference '{@link eaeu.ced.DataSet#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role</em>'.
     * @see eaeu.ced.DataSet#getRole()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_Role();

    /**
     * Returns the meta object for the attribute '{@link eaeu.ced.DataSet#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.ced.DataSet#getLabel()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_Label();

    /**
     * Returns the meta object for the reference list '{@link eaeu.ced.DataSet#getRelations <em>Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Relations</em>'.
     * @see eaeu.ced.DataSet#getRelations()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_Relations();

    /**
     * Returns the meta object for the reference list '{@link eaeu.ced.DataSet#getAllowedAttributes <em>Allowed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Allowed Attributes</em>'.
     * @see eaeu.ced.DataSet#getAllowedAttributes()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_AllowedAttributes();

    /**
     * Returns the meta object for the reference list '{@link eaeu.ced.DataSet#getAllowedRelationEnds <em>Allowed Relation Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Allowed Relation Ends</em>'.
     * @see eaeu.ced.DataSet#getAllowedRelationEnds()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_AllowedRelationEnds();

    /**
     * Returns the meta object for the '{@link eaeu.ced.DataSet#getConceptualElement() <em>Get Conceptual Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Conceptual Element</em>' operation.
     * @see eaeu.ced.DataSet#getConceptualElement()
     * @generated
     */
    EOperation getDataSet__GetConceptualElement();

    /**
     * Returns the meta object for the '{@link eaeu.ced.DataSet#syncDataElements() <em>Sync Data Elements</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Sync Data Elements</em>' operation.
     * @see eaeu.ced.DataSet#syncDataElements()
     * @generated
     */
    EOperation getDataSet__SyncDataElements();

    /**
     * Returns the meta object for class '{@link eaeu.ced.DataElement <em>Data Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Element</em>'.
     * @see eaeu.ced.DataElement
     * @generated
     */
    EClass getDataElement();

    /**
     * Returns the meta object for the reference '{@link eaeu.ced.DataElement#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Property</em>'.
     * @see eaeu.ced.DataElement#getProperty()
     * @see #getDataElement()
     * @generated
     */
    EReference getDataElement_Property();

    /**
     * Returns the meta object for the attribute '{@link eaeu.ced.DataElement#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see eaeu.ced.DataElement#getLabel()
     * @see #getDataElement()
     * @generated
     */
    EAttribute getDataElement_Label();

    /**
     * Returns the meta object for the '{@link eaeu.ced.DataElement#getConceptualElement() <em>Get Conceptual Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Conceptual Element</em>' operation.
     * @see eaeu.ced.DataElement#getConceptualElement()
     * @generated
     */
    EOperation getDataElement__GetConceptualElement();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CEDFactory getCEDFactory();

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
         * The meta object literal for the '{@link eaeu.ced.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.ElementImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Realization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__REALIZATION = eINSTANCE.getElement_Realization();

        /**
         * The meta object literal for the '{@link eaeu.ced.impl.ContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.ContainerImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getContainer()
         * @generated
         */
        EClass CONTAINER = eINSTANCE.getContainer();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__COMPONENTS = eINSTANCE.getContainer_Components();

        /**
         * The meta object literal for the '<em><b>Document</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__DOCUMENT = eINSTANCE.getContainer_Document();

        /**
         * The meta object literal for the '<em><b>Available Properties</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__AVAILABLE_PROPERTIES = eINSTANCE.getContainer_AvailableProperties();

        /**
         * The meta object literal for the '<em><b>Available Roles</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__AVAILABLE_ROLES = eINSTANCE.getContainer_AvailableRoles();

        /**
         * The meta object literal for the '<em><b>Set Suitable Realizations</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN = eINSTANCE.getContainer__SetSuitableRealizations__boolean();

        /**
         * The meta object literal for the '{@link eaeu.ced.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.ComponentImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__CONTAINER = eINSTANCE.getComponent_Container();

        /**
         * The meta object literal for the '<em><b>Get Conceptual Element</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPONENT___GET_CONCEPTUAL_ELEMENT = eINSTANCE.getComponent__GetConceptualElement();

        /**
         * The meta object literal for the '<em><b>Set Suitable Realization</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPONENT___SET_SUITABLE_REALIZATION = eINSTANCE.getComponent__SetSuitableRealization();

        /**
         * The meta object literal for the '{@link eaeu.ced.impl.DocumentImpl <em>Document</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.DocumentImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getDocument()
         * @generated
         */
        EClass DOCUMENT = eINSTANCE.getDocument();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT__MODEL = eINSTANCE.getDocument_Model();

        /**
         * The meta object literal for the '<em><b>Realization Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT__REALIZATION_MODEL = eINSTANCE.getDocument_RealizationModel();

        /**
         * The meta object literal for the '{@link eaeu.ced.impl.DataSetImpl <em>Data Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.DataSetImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getDataSet()
         * @generated
         */
        EClass DATA_SET = eINSTANCE.getDataSet();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__ROLE = eINSTANCE.getDataSet_Role();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__LABEL = eINSTANCE.getDataSet_Label();

        /**
         * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__RELATIONS = eINSTANCE.getDataSet_Relations();

        /**
         * The meta object literal for the '<em><b>Allowed Attributes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__ALLOWED_ATTRIBUTES = eINSTANCE.getDataSet_AllowedAttributes();

        /**
         * The meta object literal for the '<em><b>Allowed Relation Ends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__ALLOWED_RELATION_ENDS = eINSTANCE.getDataSet_AllowedRelationEnds();

        /**
         * The meta object literal for the '<em><b>Get Conceptual Element</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation DATA_SET___GET_CONCEPTUAL_ELEMENT = eINSTANCE.getDataSet__GetConceptualElement();

        /**
         * The meta object literal for the '<em><b>Sync Data Elements</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation DATA_SET___SYNC_DATA_ELEMENTS = eINSTANCE.getDataSet__SyncDataElements();

        /**
         * The meta object literal for the '{@link eaeu.ced.impl.DataElementImpl <em>Data Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eaeu.ced.impl.DataElementImpl
         * @see eaeu.ced.impl.CEDPackageImpl#getDataElement()
         * @generated
         */
        EClass DATA_ELEMENT = eINSTANCE.getDataElement();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ELEMENT__PROPERTY = eINSTANCE.getDataElement_Property();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT__LABEL = eINSTANCE.getDataElement_Label();

        /**
         * The meta object literal for the '<em><b>Get Conceptual Element</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation DATA_ELEMENT___GET_CONCEPTUAL_ELEMENT = eINSTANCE.getDataElement__GetConceptualElement();

    }

} //CEDPackage
