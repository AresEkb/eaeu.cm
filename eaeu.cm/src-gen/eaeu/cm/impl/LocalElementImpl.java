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
import eaeu.cm.LocalElement;
import eaeu.cm.MultiplicityElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.LocalElementImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link eaeu.cm.impl.LocalElementImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link eaeu.cm.impl.LocalElementImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link eaeu.cm.impl.LocalElementImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LocalElementImpl extends ElementImpl implements LocalElement {
    /**
     * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected static final int LOWER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected int lower = LOWER_EDEFAULT;

    /**
     * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected static final int UPPER_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected int upper = UPPER_EDEFAULT;

    /**
     * The default value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBounds()
     * @generated
     * @ordered
     */
    protected static final String BOUNDS_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.LOCAL_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLower() {
        return lower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLower(int newLower) {
        int oldLower = lower;
        lower = newLower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.LOCAL_ELEMENT__LOWER, oldLower, lower));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUpper() {
        return upper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpper(int newUpper) {
        int oldUpper = upper;
        upper = newUpper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.LOCAL_ELEMENT__UPPER, oldUpper, upper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBounds() {
        String result = String.format("%d", lower);
        if (lower != upper) {
            result += ".." + (upper == -1 ? "*" : String.format("%d", upper));
        }
        return result;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.LOCAL_ELEMENT__DEFINITION, oldDefinition, definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMPackage.LOCAL_ELEMENT__LOWER:
                return getLower();
            case CMPackage.LOCAL_ELEMENT__UPPER:
                return getUpper();
            case CMPackage.LOCAL_ELEMENT__BOUNDS:
                return getBounds();
            case CMPackage.LOCAL_ELEMENT__DEFINITION:
                return getDefinition();
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
            case CMPackage.LOCAL_ELEMENT__LOWER:
                setLower((Integer)newValue);
                return;
            case CMPackage.LOCAL_ELEMENT__UPPER:
                setUpper((Integer)newValue);
                return;
            case CMPackage.LOCAL_ELEMENT__DEFINITION:
                setDefinition((String)newValue);
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
            case CMPackage.LOCAL_ELEMENT__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case CMPackage.LOCAL_ELEMENT__UPPER:
                setUpper(UPPER_EDEFAULT);
                return;
            case CMPackage.LOCAL_ELEMENT__DEFINITION:
                setDefinition(DEFINITION_EDEFAULT);
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
            case CMPackage.LOCAL_ELEMENT__LOWER:
                return lower != LOWER_EDEFAULT;
            case CMPackage.LOCAL_ELEMENT__UPPER:
                return upper != UPPER_EDEFAULT;
            case CMPackage.LOCAL_ELEMENT__BOUNDS:
                return BOUNDS_EDEFAULT == null ? getBounds() != null : !BOUNDS_EDEFAULT.equals(getBounds());
            case CMPackage.LOCAL_ELEMENT__DEFINITION:
                return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MultiplicityElement.class) {
            switch (derivedFeatureID) {
                case CMPackage.LOCAL_ELEMENT__LOWER: return CMPackage.MULTIPLICITY_ELEMENT__LOWER;
                case CMPackage.LOCAL_ELEMENT__UPPER: return CMPackage.MULTIPLICITY_ELEMENT__UPPER;
                case CMPackage.LOCAL_ELEMENT__BOUNDS: return CMPackage.MULTIPLICITY_ELEMENT__BOUNDS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MultiplicityElement.class) {
            switch (baseFeatureID) {
                case CMPackage.MULTIPLICITY_ELEMENT__LOWER: return CMPackage.LOCAL_ELEMENT__LOWER;
                case CMPackage.MULTIPLICITY_ELEMENT__UPPER: return CMPackage.LOCAL_ELEMENT__UPPER;
                case CMPackage.MULTIPLICITY_ELEMENT__BOUNDS: return CMPackage.LOCAL_ELEMENT__BOUNDS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (lower: ");
        result.append(lower);
        result.append(", upper: ");
        result.append(upper);
        result.append(", definition: ");
        result.append(definition);
        result.append(')');
        return result.toString();
    }

} //LocalElementImpl
