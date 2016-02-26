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
import eaeu.ced.DataElement;

import eaeu.cm.GlobalElement;
import eaeu.cm.Property;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.DataElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataElementImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataElementImpl extends ComponentImpl implements DataElement {
    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected Property property;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.DATA_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getProperty() {
        if (property != null && property.eIsProxy()) {
            InternalEObject oldProperty = (InternalEObject)property;
            property = (Property)eResolveProxy(oldProperty);
            if (property != oldProperty) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CEDPackage.DATA_ELEMENT__PROPERTY, oldProperty, property));
            }
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property basicGetProperty() {
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(Property newProperty) {
        Property oldProperty = property;
        property = newProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DATA_ELEMENT__PROPERTY, oldProperty, property));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        Property property = getProperty();
        return property != null ? property.getName() : getName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalElement getConceptualElement() {
        return getProperty();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CEDPackage.DATA_ELEMENT__PROPERTY:
                if (resolve) return getProperty();
                return basicGetProperty();
            case CEDPackage.DATA_ELEMENT__LABEL:
                return getLabel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CEDPackage.DATA_ELEMENT__PROPERTY:
                setProperty((Property)newValue);
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
            case CEDPackage.DATA_ELEMENT__PROPERTY:
                setProperty((Property)null);
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
            case CEDPackage.DATA_ELEMENT__PROPERTY:
                return property != null;
            case CEDPackage.DATA_ELEMENT__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
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
            case CEDPackage.DATA_ELEMENT___GET_CONCEPTUAL_ELEMENT:
                return getConceptualElement();
        }
        return super.eInvoke(operationID, arguments);
    }

} //DataElementImpl
