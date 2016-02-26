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
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Relation#getLabel <em>Label</em>}</li>
 *   <li>{@link eaeu.cm.Relation#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends GlobalElement {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see eaeu.cm.CMPackage#getRelation_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='EList<RelationEnd> endList = getEnds();\r\nif (endList.isEmpty()) {\r\n    return null;\r\n}\r\nString result = \"\";\r\nint i = 0;\r\nfor (RelationEnd end : endList) {\r\n    if (i++ > 0) {\r\n        result += \" - \";\r\n    }\r\n    String label = end.getLabel();\r\n    result += label != null ? label : \"\";\r\n}\r\nreturn result;'"
     * @generated
     */
    String getLabel();

    /**
     * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
     * The list contents are of type {@link eaeu.cm.RelationEnd}.
     * It is bidirectional and its opposite is '{@link eaeu.cm.RelationEnd#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ends</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ends</em>' containment reference list.
     * @see eaeu.cm.CMPackage#getRelation_Ends()
     * @see eaeu.cm.RelationEnd#getRelation
     * @model opposite="relation" containment="true" lower="2"
     * @generated
     */
    EList<RelationEnd> getEnds();

} // Relation
