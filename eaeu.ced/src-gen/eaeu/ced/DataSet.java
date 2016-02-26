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

import eaeu.cm.Attribute;
import eaeu.cm.GlobalElement;
import eaeu.cm.Relation;
import eaeu.cm.RelationEnd;
import eaeu.cm.Role;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.DataSet#getRole <em>Role</em>}</li>
 *   <li>{@link eaeu.ced.DataSet#getLabel <em>Label</em>}</li>
 *   <li>{@link eaeu.ced.DataSet#getRelations <em>Relations</em>}</li>
 *   <li>{@link eaeu.ced.DataSet#getAllowedAttributes <em>Allowed Attributes</em>}</li>
 *   <li>{@link eaeu.ced.DataSet#getAllowedRelationEnds <em>Allowed Relation Ends</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends Container, Component {
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
     * @see eaeu.ced.CEDPackage#getDataSet_Role()
     * @model
     * @generated
     */
    Role getRole();

    /**
     * Sets the value of the '{@link eaeu.ced.DataSet#getRole <em>Role</em>}' reference.
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
     * @see eaeu.ced.CEDPackage#getDataSet_Label()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='Role role = getRole();\r\nreturn role != null ? role.getLabel() : getName();'"
     * @generated
     */
    String getLabel();

    /**
     * Returns the value of the '<em><b>Relations</b></em>' reference list.
     * The list contents are of type {@link eaeu.cm.Relation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' reference list.
     * @see eaeu.ced.CEDPackage#getDataSet_Relations()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='java.util.List<Relation> result;\r\nRole role = getRole();\r\nif (role != null) {\r\n    eaeu.cm.Concept concept = role.getConcept();\r\n    // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n    //result = concept.getModel().getElements().stream()\r\n    //        .filter(el -> el instanceof Relation)\r\n    //        .map(el -> (Relation) el)\r\n    //        .filter(rel -> rel.getEnds().stream()\r\n    //                .anyMatch(end -> end.getRole() != null && concept.equals(end.getRole().getConcept())))\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    result = new java.util.ArrayList<Relation>();\r\n    for (eaeu.cm.Element el : concept.getModel().getElements()) {\r\n        if (el instanceof Relation) {\r\n            Relation rel = (Relation) el;\r\n            for (eaeu.cm.RelationEnd end : rel.getEnds()) {\r\n                if (end.getRole() != null && concept.equals(end.getRole().getConcept())) {\r\n                    result.add(rel);\r\n                    break;\r\n                }\r\n            }\r\n        }\r\n    }\r\n}\r\nelse {\r\n    result = java.util.Collections.<Relation>emptyList();\r\n}\r\nreturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Relation>(this,\r\n        CEDPackage.Literals.DATA_SET__RELATIONS, result.size(), result.toArray());'"
     * @generated
     */
    EList<Relation> getRelations();

    /**
     * Returns the value of the '<em><b>Allowed Attributes</b></em>' reference list.
     * The list contents are of type {@link eaeu.cm.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Attributes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allowed Attributes</em>' reference list.
     * @see eaeu.ced.CEDPackage#getDataSet_AllowedAttributes()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='java.util.List<Attribute> result;\r\nRole role = getRole();\r\nif (role != null) {\r\n    // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n    //java.util.List<eaeu.cm.Property> addedProperties = getComponents().stream()\r\n    //        .filter(comp -> comp instanceof eaeu.ced.DataElement)\r\n    //        .map(comp -> (eaeu.ced.DataElement) comp)\r\n    //        .filter(el -> !(el.getLower() == 0 && el.getUpper() == 0))\r\n    //        .map(el -> el.getProperty())\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    //result = role.getConcept().getAttributes().stream()\r\n    //        .filter(attr -> !addedProperties.contains(attr.getProperty()))\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    java.util.List<eaeu.cm.Property> addedProperties = new java.util.ArrayList<eaeu.cm.Property>();\r\n    for (Component comp : getComponents()) {\r\n        if (comp instanceof eaeu.ced.DataElement) {\r\n            eaeu.ced.DataElement el = (eaeu.ced.DataElement) comp;\r\n            if (!(el.getLower() == 0 && el.getUpper() == 0)) {\r\n                addedProperties.add(el.getProperty());\r\n            }\r\n        }\r\n    }\r\n    result = new java.util.ArrayList<Attribute>();\r\n    for (eaeu.cm.Attribute attr : role.getConcept().getAttributes()) {\r\n        if (!addedProperties.contains(attr.getProperty())) {\r\n            result.add(attr);\r\n        }\r\n    }\r\n}\r\nelse {\r\n    result = java.util.Collections.<Attribute>emptyList();\r\n}\r\nreturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Attribute>(this,\r\n        CEDPackage.Literals.DATA_SET__ALLOWED_ATTRIBUTES, result.size(), result.toArray());'"
     * @generated
     */
    EList<Attribute> getAllowedAttributes();

    /**
     * Returns the value of the '<em><b>Allowed Relation Ends</b></em>' reference list.
     * The list contents are of type {@link eaeu.cm.RelationEnd}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Relation Ends</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allowed Relation Ends</em>' reference list.
     * @see eaeu.ced.CEDPackage#getDataSet_AllowedRelationEnds()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='java.util.List<RelationEnd> result;\r\nRole role = getRole();\r\nif (role != null) {\r\n    eaeu.cm.Concept concept = role.getConcept();\r\n    // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n    //java.util.List<Role> addedRoles = getComponents().stream()\r\n    //        .filter(comp -> comp instanceof DataSet)\r\n    //        .map(comp -> (DataSet) comp)\r\n    //        .map(el -> el.getRole())\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    //result = getRelations().stream()\r\n    //        .flatMap(rel -> rel.getEnds().stream())\r\n    //        .filter(end -> end.getRole().getName() != null && !end.getRole().getName().isEmpty())\r\n    //        .filter(end -> !concept.equals(end.getRole().getConcept()))\r\n    //        .filter(end -> !addedRoles.contains(end.getRole()))\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    java.util.List<Role> addedRoles = new java.util.ArrayList<Role>();\r\n    for (Component comp : getComponents()) {\r\n        if (comp instanceof eaeu.ced.DataSet) {\r\n            addedRoles.add(((eaeu.ced.DataSet) comp).getRole());\r\n        }\r\n    }\r\n    result = new java.util.ArrayList<RelationEnd>();\r\n    for (eaeu.cm.Relation rel : getRelations()) {\r\n        for (eaeu.cm.RelationEnd end : rel.getEnds()) {\r\n            if (end.getRole().getName() != null && !end.getRole().getName().isEmpty()) {\r\n                if (!concept.equals(end.getRole().getConcept())) {\r\n                    if (!addedRoles.contains(end.getRole())) {\r\n                        result.add(end);\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n}\r\nelse {\r\n    result = java.util.Collections.<RelationEnd>emptyList();\r\n}\r\nreturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<RelationEnd>(this,\r\n        CEDPackage.Literals.DATA_SET__ALLOWED_RELATION_ENDS, result.size(), result.toArray());'"
     * @generated
     */
    EList<RelationEnd> getAllowedRelationEnds();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getRole();'"
     * @generated
     */
    GlobalElement getConceptualElement();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int prev = -1;\r\nfor (Attribute attr : getRole().getConcept().getAttributes()) {\r\n    // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n    //java.util.List<eaeu.cm.Property> properties = getComponents().stream()\r\n    //        .map(comp -> comp instanceof eaeu.ced.DataElement ? ((eaeu.ced.DataElement)comp).getProperty() : null)\r\n    //        .collect(java.util.stream.Collectors.toList());\r\n    java.util.List<eaeu.cm.Property> properties = new java.util.ArrayList<eaeu.cm.Property>();\r\n    for (Component comp : getComponents()) {\r\n        properties.add(comp instanceof eaeu.ced.DataElement ? ((eaeu.ced.DataElement)comp).getProperty() : null);\r\n    }\r\n    int index = properties.indexOf(attr.getProperty());\r\n    if (index == -1) {\r\n        eaeu.ced.DataElement dataElement = CEDPackage.eINSTANCE.getCEDFactory().createDataElement();\r\n        dataElement.setProperty(attr.getProperty());\r\n        dataElement.setLower(attr.getLower());\r\n        dataElement.setUpper(attr.getUpper());\r\n        getComponents().add(prev + 1, dataElement);\r\n        prev++;\r\n    }\r\n    else {\r\n        prev = index;\r\n    }\r\n}'"
     * @generated
     */
    void syncDataElements();

} // DataSet
