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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.LocalElement#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getLocalElement()
 * @model abstract="true"
 * @generated
 */
public interface LocalElement extends Element, MultiplicityElement {
    /**
     * Returns the value of the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definition</em>' attribute.
     * @see #setDefinition(String)
     * @see eaeu.cm.CMPackage#getLocalElement_Definition()
     * @model
     * @generated
     */
    String getDefinition();

    /**
     * Sets the value of the '{@link eaeu.cm.LocalElement#getDefinition <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' attribute.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition(String value);

} // LocalElement
