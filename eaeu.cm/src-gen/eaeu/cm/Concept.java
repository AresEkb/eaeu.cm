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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Concept#getGeneral <em>General</em>}</li>
 *   <li>{@link eaeu.cm.Concept#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends NamedElement, GlobalElement {
    /**
     * Returns the value of the '<em><b>General</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General</em>' reference.
     * @see #setGeneral(Concept)
     * @see eaeu.cm.CMPackage#getConcept_General()
     * @model
     * @generated
     */
    Concept getGeneral();

    /**
     * Sets the value of the '{@link eaeu.cm.Concept#getGeneral <em>General</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General</em>' reference.
     * @see #getGeneral()
     * @generated
     */
    void setGeneral(Concept value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link eaeu.cm.Attribute}.
     * It is bidirectional and its opposite is '{@link eaeu.cm.Attribute#getConcept <em>Concept</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see eaeu.cm.CMPackage#getConcept_Attributes()
     * @see eaeu.cm.Attribute#getConcept
     * @model opposite="concept" containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

} // Concept
