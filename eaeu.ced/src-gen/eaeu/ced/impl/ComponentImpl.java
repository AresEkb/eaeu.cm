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

import eaeu.cm.CMPackage;
import eaeu.cm.GlobalElement;
import eaeu.cm.MultiplicityElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.ComponentImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link eaeu.ced.impl.ComponentImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link eaeu.ced.impl.ComponentImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link eaeu.ced.impl.ComponentImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends ElementImpl implements Component {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.COMPONENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.COMPONENT__LOWER, oldLower, lower));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.COMPONENT__UPPER, oldUpper, upper));
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
    public eaeu.ced.Container getContainer() {
        if (eContainerFeatureID() != CEDPackage.COMPONENT__CONTAINER) return null;
        return (eaeu.ced.Container)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(eaeu.ced.Container newContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainer, CEDPackage.COMPONENT__CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(eaeu.ced.Container newContainer) {
        if (newContainer != eInternalContainer() || (eContainerFeatureID() != CEDPackage.COMPONENT__CONTAINER && newContainer != null)) {
            if (EcoreUtil.isAncestor(this, newContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, CEDPackage.CONTAINER__COMPONENTS, eaeu.ced.Container.class, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.COMPONENT__CONTAINER, newContainer, newContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalElement getConceptualElement() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuitableRealization() {
        eaeu.cm.GlobalElement element = getConceptualElement();
        if (element != null) {
            EList<String> realizations = element.getAnalogs();
            if (!realizations.isEmpty()) {
                setRealization(realizations.get(0));
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CEDPackage.COMPONENT__CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainer((eaeu.ced.Container)otherEnd, msgs);
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
            case CEDPackage.COMPONENT__CONTAINER:
                return basicSetContainer(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case CEDPackage.COMPONENT__CONTAINER:
                return eInternalContainer().eInverseRemove(this, CEDPackage.CONTAINER__COMPONENTS, eaeu.ced.Container.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CEDPackage.COMPONENT__LOWER:
                return getLower();
            case CEDPackage.COMPONENT__UPPER:
                return getUpper();
            case CEDPackage.COMPONENT__BOUNDS:
                return getBounds();
            case CEDPackage.COMPONENT__CONTAINER:
                return getContainer();
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
            case CEDPackage.COMPONENT__LOWER:
                setLower((Integer)newValue);
                return;
            case CEDPackage.COMPONENT__UPPER:
                setUpper((Integer)newValue);
                return;
            case CEDPackage.COMPONENT__CONTAINER:
                setContainer((eaeu.ced.Container)newValue);
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
            case CEDPackage.COMPONENT__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case CEDPackage.COMPONENT__UPPER:
                setUpper(UPPER_EDEFAULT);
                return;
            case CEDPackage.COMPONENT__CONTAINER:
                setContainer((eaeu.ced.Container)null);
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
            case CEDPackage.COMPONENT__LOWER:
                return lower != LOWER_EDEFAULT;
            case CEDPackage.COMPONENT__UPPER:
                return upper != UPPER_EDEFAULT;
            case CEDPackage.COMPONENT__BOUNDS:
                return BOUNDS_EDEFAULT == null ? getBounds() != null : !BOUNDS_EDEFAULT.equals(getBounds());
            case CEDPackage.COMPONENT__CONTAINER:
                return getContainer() != null;
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
                case CEDPackage.COMPONENT__LOWER: return CMPackage.MULTIPLICITY_ELEMENT__LOWER;
                case CEDPackage.COMPONENT__UPPER: return CMPackage.MULTIPLICITY_ELEMENT__UPPER;
                case CEDPackage.COMPONENT__BOUNDS: return CMPackage.MULTIPLICITY_ELEMENT__BOUNDS;
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
                case CMPackage.MULTIPLICITY_ELEMENT__LOWER: return CEDPackage.COMPONENT__LOWER;
                case CMPackage.MULTIPLICITY_ELEMENT__UPPER: return CEDPackage.COMPONENT__UPPER;
                case CMPackage.MULTIPLICITY_ELEMENT__BOUNDS: return CEDPackage.COMPONENT__BOUNDS;
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case CEDPackage.COMPONENT___GET_CONCEPTUAL_ELEMENT:
                return getConceptualElement();
            case CEDPackage.COMPONENT___SET_SUITABLE_REALIZATION:
                setSuitableRealization();
                return null;
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(')');
        return result.toString();
    }

} //ComponentImpl
