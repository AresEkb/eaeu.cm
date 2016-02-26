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
package eaeu.cm.impl;

import eaeu.cm.CMPackage;
import eaeu.cm.GlobalElement;
import eaeu.cm.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link eaeu.cm.impl.ModelImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<GlobalElement> elements;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected Model base;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GlobalElement> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentWithInverseEList<GlobalElement>(GlobalElement.class, this, CMPackage.MODEL__ELEMENTS, CMPackage.GLOBAL_ELEMENT__MODEL);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getBase() {
        if (base != null && base.eIsProxy()) {
            InternalEObject oldBase = (InternalEObject)base;
            base = (Model)eResolveProxy(oldBase);
            if (base != oldBase) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMPackage.MODEL__BASE, oldBase, base));
            }
        }
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model basicGetBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(Model newBase) {
        Model oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.MODEL__BASE, oldBase, base));
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
            case CMPackage.MODEL__ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
            case CMPackage.MODEL__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
            case CMPackage.MODEL__ELEMENTS:
                return getElements();
            case CMPackage.MODEL__BASE:
                if (resolve) return getBase();
                return basicGetBase();
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
            case CMPackage.MODEL__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends GlobalElement>)newValue);
                return;
            case CMPackage.MODEL__BASE:
                setBase((Model)newValue);
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
            case CMPackage.MODEL__ELEMENTS:
                getElements().clear();
                return;
            case CMPackage.MODEL__BASE:
                setBase((Model)null);
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
            case CMPackage.MODEL__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case CMPackage.MODEL__BASE:
                return base != null;
        }
        return super.eIsSet(featureID);
    }

} //ModelImpl
