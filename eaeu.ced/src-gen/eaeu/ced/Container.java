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

import eaeu.cm.Property;
import eaeu.cm.Role;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.Container#getComponents <em>Components</em>}</li>
 *   <li>{@link eaeu.ced.Container#getDocument <em>Document</em>}</li>
 *   <li>{@link eaeu.ced.Container#getAvailableProperties <em>Available Properties</em>}</li>
 *   <li>{@link eaeu.ced.Container#getAvailableRoles <em>Available Roles</em>}</li>
 * </ul>
 *
 * @see eaeu.ced.CEDPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends Element {
    /**
     * Returns the value of the '<em><b>Components</b></em>' containment reference list.
     * The list contents are of type {@link eaeu.ced.Component}.
     * It is bidirectional and its opposite is '{@link eaeu.ced.Component#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' containment reference list.
     * @see eaeu.ced.CEDPackage#getContainer_Components()
     * @see eaeu.ced.Component#getContainer
     * @model opposite="container" containment="true"
     * @generated
     */
    EList<Component> getComponents();

    /**
     * Returns the value of the '<em><b>Document</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Document</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Document</em>' reference.
     * @see eaeu.ced.CEDPackage#getContainer_Document()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return (Document) (this instanceof Document ? this : org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(this));'"
     * @generated
     */
    Document getDocument();

    /**
     * Returns the value of the '<em><b>Available Properties</b></em>' reference list.
     * The list contents are of type {@link eaeu.cm.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Available Properties</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Available Properties</em>' reference list.
     * @see eaeu.ced.CEDPackage#getContainer_AvailableProperties()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='// TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n//java.util.List<Property> addedProperties = getComponents().stream()\r\n//        .filter(comp -> comp instanceof eaeu.ced.DataElement)\r\n//        .map(comp -> ((eaeu.ced.DataElement) comp).getProperty())\r\n//        .collect(java.util.stream.Collectors.toList());\r\n//java.util.List<Property> result = getDocument().getModel().getElements().stream()\r\n//        .filter(el -> el instanceof Property)\r\n//        .map(el -> (Property) el)\r\n//        .filter(prop -> !addedProperties.contains(prop))\r\n//        .collect(java.util.stream.Collectors.toList());\r\njava.util.List<Property> addedProperties = new java.util.ArrayList<Property>();\r\nfor (Component comp : getComponents()) {\r\n    if (comp instanceof eaeu.ced.DataElement) {\r\n        addedProperties.add(((eaeu.ced.DataElement) comp).getProperty());\r\n    }\r\n}\r\njava.util.List<Property> result = new java.util.ArrayList<Property>();\r\nfor (eaeu.cm.Element el : getDocument().getModel().getElements()) {\r\n    if (el instanceof Property) {\r\n        if (!addedProperties.contains(el)) {\r\n            result.add((Property) el);\r\n        }\r\n    }\r\n}\r\nreturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Property>(this,\r\n        CEDPackage.Literals.CONTAINER__AVAILABLE_PROPERTIES, result.size(), result.toArray());'"
     * @generated
     */
    EList<Property> getAvailableProperties();

    /**
     * Returns the value of the '<em><b>Available Roles</b></em>' reference list.
     * The list contents are of type {@link eaeu.cm.Role}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Available Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Available Roles</em>' reference list.
     * @see eaeu.ced.CEDPackage#getContainer_AvailableRoles()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='// TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future\r\n//java.util.List<Role> addedRoles = getComponents().stream()\r\n//        .filter(comp -> comp instanceof eaeu.ced.DataSet)\r\n//        .map(comp -> ((eaeu.ced.DataSet)comp).getRole())\r\n//        .collect(java.util.stream.Collectors.toList());\r\n//java.util.List<Role> result = getDocument().getModel().getElements().stream()\r\n//        .filter(el -> el instanceof Role)\r\n//        .map(el -> (Role) el)\r\n//        .filter(role -> role.getName() != null && !role.getName().isEmpty())\r\n//        .filter(role -> !addedRoles.contains(role))\r\n//        .collect(java.util.stream.Collectors.toList());\r\njava.util.List<Role> addedRoles = new java.util.ArrayList<Role>();\r\nfor (Component comp : getComponents()) {\r\n    if (comp instanceof eaeu.ced.DataSet) {\r\n        addedRoles.add(((eaeu.ced.DataSet) comp).getRole());\r\n    }\r\n}\r\njava.util.List<Role> result = new java.util.ArrayList<Role>();\r\nfor (eaeu.cm.Element el : getDocument().getModel().getElements()) {\r\n    if (el instanceof Role) {\r\n        Role role = (Role) el;\r\n        if (role.getName() != null && !role.getName().isEmpty()) {\r\n            if (!addedRoles.contains(role)) {\r\n                result.add(role);\r\n            }\r\n        }\r\n    }\r\n}\r\nreturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Role>(this,\r\n        CEDPackage.Literals.CONTAINER__AVAILABLE_ROLES, result.size(), result.toArray());'"
     * @generated
     */
    EList<Role> getAvailableRoles();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model setOnlyEmptyRequired="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof Component) {\r\n    ((Component) this).setSuitableRealization();\r\n}\r\nfor (Component component : getComponents()) {\r\n    if (!setOnlyEmpty || component.getRealization() == null || component.getRealization().isEmpty()) {\r\n        component.setSuitableRealization();\r\n    }\r\n    if (component instanceof eaeu.ced.Container) {\r\n        ((eaeu.ced.Container) component).setSuitableRealizations(setOnlyEmpty);\r\n    }\r\n}'"
     * @generated
     */
    void setSuitableRealizations(boolean setOnlyEmpty);

} // Container
