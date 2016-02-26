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

import eaeu.cm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.Element#getRealization <em>Realization</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends NamedElement {
    /**
     * Returns the value of the '<em><b>Realization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realization</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realization</em>' attribute.
     * @see #setRealization(String)
     * @see eaeu.ced.CEDPackage#getElement_Realization()
     * @model
     * @generated
     */
    String getRealization();

    /**
     * Sets the value of the '{@link eaeu.ced.Element#getRealization <em>Realization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realization</em>' attribute.
     * @see #getRealization()
     * @generated
     */
    void setRealization(String value);

} // Element
