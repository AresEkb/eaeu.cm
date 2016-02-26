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
import eaeu.ced.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaeu.ced.impl.ElementImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link eaeu.ced.impl.ElementImpl#getRealization <em>Realization</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected static final String DEFINITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected String definition = DEFINITION_EDEFAULT;

    /**
     * The default value of the '{@link #getRealization() <em>Realization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealization()
     * @generated
     * @ordered
     */
    protected static final String REALIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRealization() <em>Realization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealization()
     * @generated
     * @ordered
     */
    protected String realization = REALIZATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.ELEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinition(String newDefinition) {
        String oldDefinition = definition;
        definition = newDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.ELEMENT__DEFINITION, oldDefinition, definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRealization() {
        return realization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealization(String newRealization) {
        String oldRealization = realization;
        realization = newRealization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.ELEMENT__REALIZATION, oldRealization, realization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CEDPackage.ELEMENT__NAME:
                return getName();
            case CEDPackage.ELEMENT__DEFINITION:
                return getDefinition();
            case CEDPackage.ELEMENT__REALIZATION:
                return getRealization();
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
            case CEDPackage.ELEMENT__NAME:
                setName((String)newValue);
                return;
            case CEDPackage.ELEMENT__DEFINITION:
                setDefinition((String)newValue);
                return;
            case CEDPackage.ELEMENT__REALIZATION:
                setRealization((String)newValue);
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
            case CEDPackage.ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CEDPackage.ELEMENT__DEFINITION:
                setDefinition(DEFINITION_EDEFAULT);
                return;
            case CEDPackage.ELEMENT__REALIZATION:
                setRealization(REALIZATION_EDEFAULT);
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
            case CEDPackage.ELEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CEDPackage.ELEMENT__DEFINITION:
                return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
            case CEDPackage.ELEMENT__REALIZATION:
                return REALIZATION_EDEFAULT == null ? realization != null : !REALIZATION_EDEFAULT.equals(realization);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", definition: ");
        result.append(definition);
        result.append(", realization: ");
        result.append(realization);
        result.append(')');
        return result.toString();
    }

} //ElementImpl
