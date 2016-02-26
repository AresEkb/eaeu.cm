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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Attribute#getConcept <em>Concept</em>}</li>
 *   <li>{@link eaeu.cm.Attribute#getProperty <em>Property</em>}</li>
 *   <li>{@link eaeu.cm.Attribute#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends LocalElement {
    /**
     * Returns the value of the '<em><b>Concept</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link eaeu.cm.Concept#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concept</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concept</em>' container reference.
     * @see #setConcept(Concept)
     * @see eaeu.cm.CMPackage#getAttribute_Concept()
     * @see eaeu.cm.Concept#getAttributes
     * @model opposite="attributes" required="true" transient="false"
     * @generated
     */
    Concept getConcept();

    /**
     * Sets the value of the '{@link eaeu.cm.Attribute#getConcept <em>Concept</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concept</em>' container reference.
     * @see #getConcept()
     * @generated
     */
    void setConcept(Concept value);

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
     * @see eaeu.cm.CMPackage#getAttribute_Property()
     * @model required="true"
     * @generated
     */
    Property getProperty();

    /**
     * Sets the value of the '{@link eaeu.cm.Attribute#getProperty <em>Property</em>}' reference.
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
     * @see eaeu.cm.CMPackage#getAttribute_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='Property property = getProperty();\r\nreturn property != null ? property.getName() : null;'"
     * @generated
     */
    String getLabel();

} // Attribute
