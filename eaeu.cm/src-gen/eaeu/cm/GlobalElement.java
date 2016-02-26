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
 * A representation of the model object '<em><b>Global Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.GlobalElement#getModel <em>Model</em>}</li>
 *   <li>{@link eaeu.cm.GlobalElement#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getGlobalElement()
 * @model abstract="true"
 * @generated
 */
public interface GlobalElement extends Element {
    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link eaeu.cm.Model#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(Model)
     * @see eaeu.cm.CMPackage#getGlobalElement_Model()
     * @see eaeu.cm.Model#getElements
     * @model opposite="elements" required="true" transient="false"
     * @generated
     */
    Model getModel();

    /**
     * Sets the value of the '{@link eaeu.cm.GlobalElement#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(Model value);

    /**
     * Returns the value of the '<em><b>Domain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' attribute.
     * @see #setDomain(String)
     * @see eaeu.cm.CMPackage#getGlobalElement_Domain()
     * @model required="true"
     * @generated
     */
    String getDomain();

    /**
     * Sets the value of the '{@link eaeu.cm.GlobalElement#getDomain <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain</em>' attribute.
     * @see #getDomain()
     * @generated
     */
    void setDomain(String value);

} // GlobalElement
