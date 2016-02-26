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
import eaeu.cm.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.DataElement#getProperty <em>Property</em>}</li>
 *   <li>{@link eaeu.ced.DataElement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends Component {
    /**
     * Returns the value of the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' reference.
     * @see #setProperty(Property)
     * @see eaeu.ced.CEDPackage#getDataElement_Property()
     * @model
     * @generated
     */
    Property getProperty();

    /**
     * Sets the value of the '{@link eaeu.ced.DataElement#getProperty <em>Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(Property value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see eaeu.ced.CEDPackage#getDataElement_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='Property property = getProperty();\r\nreturn property != null ? property.getName() : getName();'"
     * @generated
     */
    String getLabel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getProperty();'"
     * @generated
     */
    GlobalElement getConceptualElement();

} // DataElement
