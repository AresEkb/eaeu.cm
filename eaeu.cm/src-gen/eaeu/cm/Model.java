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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link eaeu.cm.Model#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link eaeu.cm.GlobalElement}.
     * It is bidirectional and its opposite is '{@link eaeu.cm.GlobalElement#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see eaeu.cm.CMPackage#getModel_Elements()
     * @see eaeu.cm.GlobalElement#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<GlobalElement> getElements();

    /**
     * Returns the value of the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base</em>' reference.
     * @see #setBase(Model)
     * @see eaeu.cm.CMPackage#getModel_Base()
     * @model
     * @generated
     */
    Model getBase();

    /**
     * Sets the value of the '{@link eaeu.cm.Model#getBase <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' reference.
     * @see #getBase()
     * @generated
     */
    void setBase(Model value);

} // Model
