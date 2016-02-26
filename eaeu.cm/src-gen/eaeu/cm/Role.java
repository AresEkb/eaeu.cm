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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Role#getConcept <em>Concept</em>}</li>
 *   <li>{@link eaeu.cm.Role#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement, GlobalElement {
    /**
     * Returns the value of the '<em><b>Concept</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concept</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concept</em>' reference.
     * @see #setConcept(Concept)
     * @see eaeu.cm.CMPackage#getRole_Concept()
     * @model required="true"
     * @generated
     */
    Concept getConcept();

    /**
     * Sets the value of the '{@link eaeu.cm.Role#getConcept <em>Concept</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concept</em>' reference.
     * @see #getConcept()
     * @generated
     */
    void setConcept(Concept value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see eaeu.cm.CMPackage#getRole_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='String name = getName();\r\nif (name != null && !name.isEmpty()) {\r\n    return name;\r\n}\r\nConcept concept = getConcept();\r\nreturn concept != null ? \"(\" + concept.getName() + \")\" : null;'"
     * @generated
     */
    String getLabel();

} // Role
