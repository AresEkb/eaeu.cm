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
 * A representation of the model object '<em><b>Relation End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.RelationEnd#getRelation <em>Relation</em>}</li>
 *   <li>{@link eaeu.cm.RelationEnd#getRole <em>Role</em>}</li>
 *   <li>{@link eaeu.cm.RelationEnd#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getRelationEnd()
 * @model
 * @generated
 */
public interface RelationEnd extends LocalElement {
    /**
     * Returns the value of the '<em><b>Relation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link eaeu.cm.Relation#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relation</em>' container reference.
     * @see #setRelation(Relation)
     * @see eaeu.cm.CMPackage#getRelationEnd_Relation()
     * @see eaeu.cm.Relation#getEnds
     * @model opposite="ends" required="true" transient="false"
     * @generated
     */
    Relation getRelation();

    /**
     * Sets the value of the '{@link eaeu.cm.RelationEnd#getRelation <em>Relation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relation</em>' container reference.
     * @see #getRelation()
     * @generated
     */
    void setRelation(Relation value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' reference.
     * @see #setRole(Role)
     * @see eaeu.cm.CMPackage#getRelationEnd_Role()
     * @model required="true"
     * @generated
     */
    Role getRole();

    /**
     * Sets the value of the '{@link eaeu.cm.RelationEnd#getRole <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' reference.
     * @see #getRole()
     * @generated
     */
    void setRole(Role value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see eaeu.cm.CMPackage#getRelationEnd_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='Role role = getRole();\r\nreturn role != null ? role.getLabel() : null;'"
     * @generated
     */
    String getLabel();

} // RelationEnd
