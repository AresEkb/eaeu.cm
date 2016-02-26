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

import eaeu.cm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMFactoryImpl extends EFactoryImpl implements CMFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CMFactory init() {
        try {
            CMFactory theCMFactory = (CMFactory)EPackage.Registry.INSTANCE.getEFactory(CMPackage.eNS_URI);
            if (theCMFactory != null) {
                return theCMFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CMFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case CMPackage.MODEL: return createModel();
            case CMPackage.CONCEPT: return createConcept();
            case CMPackage.PROPERTY: return createProperty();
            case CMPackage.ROLE: return createRole();
            case CMPackage.RELATION: return createRelation();
            case CMPackage.ATTRIBUTE: return createAttribute();
            case CMPackage.RELATION_END: return createRelationEnd();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept createConcept() {
        ConceptImpl concept = new ConceptImpl();
        return concept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role createRole() {
        RoleImpl role = new RoleImpl();
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relation createRelation() {
        RelationImpl relation = new RelationImpl();
        return relation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationEnd createRelationEnd() {
        RelationEndImpl relationEnd = new RelationEndImpl();
        return relationEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMPackage getCMPackage() {
        return (CMPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CMPackage getPackage() {
        return CMPackage.eINSTANCE;
    }

} //CMFactoryImpl
