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
package eaeu.ced.impl;

import eaeu.ced.CEDPackage;
import eaeu.ced.Component;
import eaeu.ced.Document;

import eaeu.cm.Property;
import eaeu.cm.Role;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.ContainerImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link eaeu.ced.impl.ContainerImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link eaeu.ced.impl.ContainerImpl#getAvailableProperties <em>Available Properties</em>}</li>
 *   <li>{@link eaeu.ced.impl.ContainerImpl#getAvailableRoles <em>Available Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends ElementImpl implements eaeu.ced.Container {
    /**
     * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponents()
     * @generated
     * @ordered
     */
    protected EList<Component> components;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Component> getComponents() {
        if (components == null) {
            components = new EObjectContainmentWithInverseEList<Component>(Component.class, this, CEDPackage.CONTAINER__COMPONENTS, CEDPackage.COMPONENT__CONTAINER);
        }
        return components;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Document getDocument() {
        Document document = basicGetDocument();
        return document != null && document.eIsProxy() ? (Document)eResolveProxy((InternalEObject)document) : document;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Document basicGetDocument() {
        return (Document) (this instanceof Document ? this : org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(this));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getAvailableProperties() {
        // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
        //java.util.List<Property> addedProperties = getComponents().stream()
        //        .filter(comp -> comp instanceof eaeu.ced.DataElement)
        //        .map(comp -> ((eaeu.ced.DataElement) comp).getProperty())
        //        .collect(java.util.stream.Collectors.toList());
        //java.util.List<Property> result = getDocument().getModel().getElements().stream()
        //        .filter(el -> el instanceof Property)
        //        .map(el -> (Property) el)
        //        .filter(prop -> !addedProperties.contains(prop))
        //        .collect(java.util.stream.Collectors.toList());
        java.util.List<Property> addedProperties = new java.util.ArrayList<Property>();
        for (Component comp : getComponents()) {
            if (comp instanceof eaeu.ced.DataElement) {
                addedProperties.add(((eaeu.ced.DataElement) comp).getProperty());
            }
        }
        java.util.List<Property> result = new java.util.ArrayList<Property>();
        for (eaeu.cm.Element el : getDocument().getModel().getElements()) {
            if (el instanceof Property) {
                if (!addedProperties.contains(el)) {
                    result.add((Property) el);
                }
            }
        }
        return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Property>(this,
                CEDPackage.Literals.CONTAINER__AVAILABLE_PROPERTIES, result.size(), result.toArray());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Role> getAvailableRoles() {
        // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
        //java.util.List<Role> addedRoles = getComponents().stream()
        //        .filter(comp -> comp instanceof eaeu.ced.DataSet)
        //        .map(comp -> ((eaeu.ced.DataSet)comp).getRole())
        //        .collect(java.util.stream.Collectors.toList());
        //java.util.List<Role> result = getDocument().getModel().getElements().stream()
        //        .filter(el -> el instanceof Role)
        //        .map(el -> (Role) el)
        //        .filter(role -> role.getName() != null && !role.getName().isEmpty())
        //        .filter(role -> !addedRoles.contains(role))
        //        .collect(java.util.stream.Collectors.toList());
        java.util.List<Role> addedRoles = new java.util.ArrayList<Role>();
        for (Component comp : getComponents()) {
            if (comp instanceof eaeu.ced.DataSet) {
                addedRoles.add(((eaeu.ced.DataSet) comp).getRole());
            }
        }
        java.util.List<Role> result = new java.util.ArrayList<Role>();
        for (eaeu.cm.Element el : getDocument().getModel().getElements()) {
            if (el instanceof Role) {
                Role role = (Role) el;
                if (role.getName() != null && !role.getName().isEmpty()) {
                    if (!addedRoles.contains(role)) {
                        result.add(role);
                    }
                }
            }
        }
        return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Role>(this,
                CEDPackage.Literals.CONTAINER__AVAILABLE_ROLES, result.size(), result.toArray());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuitableRealizations(final boolean setOnlyEmpty) {
        if (this instanceof Component) {
            ((Component) this).setSuitableRealization();
        }
        for (Component component : getComponents()) {
            if (!setOnlyEmpty || component.getRealization() == null || component.getRealization().isEmpty()) {
                component.setSuitableRealization();
            }
            if (component instanceof eaeu.ced.Container) {
                ((eaeu.ced.Container) component).setSuitableRealizations(setOnlyEmpty);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                return getComponents();
            case CEDPackage.CONTAINER__DOCUMENT:
                if (resolve) return getDocument();
                return basicGetDocument();
            case CEDPackage.CONTAINER__AVAILABLE_PROPERTIES:
                return getAvailableProperties();
            case CEDPackage.CONTAINER__AVAILABLE_ROLES:
                return getAvailableRoles();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                getComponents().clear();
                getComponents().addAll((Collection<? extends Component>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                getComponents().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CEDPackage.CONTAINER__COMPONENTS:
                return components != null && !components.isEmpty();
            case CEDPackage.CONTAINER__DOCUMENT:
                return basicGetDocument() != null;
            case CEDPackage.CONTAINER__AVAILABLE_PROPERTIES:
                return !getAvailableProperties().isEmpty();
            case CEDPackage.CONTAINER__AVAILABLE_ROLES:
                return !getAvailableRoles().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case CEDPackage.CONTAINER___SET_SUITABLE_REALIZATIONS__BOOLEAN:
                setSuitableRealizations((Boolean)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //ContainerImpl
