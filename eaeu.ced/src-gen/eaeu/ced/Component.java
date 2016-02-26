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

import eaeu.cm.GlobalElement;
import eaeu.cm.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.Component#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Element, MultiplicityElement {
    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link eaeu.ced.Container#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(Container)
     * @see eaeu.ced.CEDPackage#getComponent_Container()
     * @see eaeu.ced.Container#getComponents
     * @model opposite="components" required="true" transient="false"
     * @generated
     */
    Container getContainer();

    /**
     * Sets the value of the '{@link eaeu.ced.Component#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(Container value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    GlobalElement getConceptualElement();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='eaeu.cm.GlobalElement element = getConceptualElement();\r\nif (element != null) {\r\n    EList<String> realizations = element.getAnalogs();\r\n    if (!realizations.isEmpty()) {\r\n        setRealization(realizations.get(0));\r\n    }\r\n}'"
     * @generated
     */
    void setSuitableRealization();

} // Component
