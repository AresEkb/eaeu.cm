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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eaeu.cm.CMPackage
 * @generated
 */
public interface CMFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CMFactory eINSTANCE = eaeu.cm.impl.CMFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    Model createModel();

    /**
     * Returns a new object of class '<em>Concept</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Concept</em>'.
     * @generated
     */
    Concept createConcept();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role</em>'.
     * @generated
     */
    Role createRole();

    /**
     * Returns a new object of class '<em>Relation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation</em>'.
     * @generated
     */
    Relation createRelation();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Relation End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation End</em>'.
     * @generated
     */
    RelationEnd createRelationEnd();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CMPackage getCMPackage();

} //CMFactory
