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

import eaeu.cm.Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.Document#getModel <em>Model</em>}</li>
 *   <li>{@link eaeu.ced.Document#getRealizationModel <em>Realization Model</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Container {
    /**
     * Returns the value of the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' reference.
     * @see #setModel(Model)
     * @see eaeu.ced.CEDPackage#getDocument_Model()
     * @model required="true"
     * @generated
     */
    Model getModel();

    /**
     * Sets the value of the '{@link eaeu.ced.Document#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(Model value);

    /**
     * Returns the value of the '<em><b>Realization Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realization Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realization Model</em>' reference.
     * @see #setRealizationModel(EObject)
     * @see eaeu.ced.CEDPackage#getDocument_RealizationModel()
     * @model
     * @generated
     */
    EObject getRealizationModel();

    /**
     * Sets the value of the '{@link eaeu.ced.Document#getRealizationModel <em>Realization Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realization Model</em>' reference.
     * @see #getRealizationModel()
     * @generated
     */
    void setRealizationModel(EObject value);

} // Document
