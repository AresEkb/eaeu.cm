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

import eaeu.cm.Attribute;
import eaeu.cm.CMPackage;
import eaeu.cm.Concept;
import eaeu.cm.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.AttributeImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link eaeu.cm.impl.AttributeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eaeu.cm.impl.AttributeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends LocalElementImpl implements Attribute {
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
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept getConcept() {
        if (eContainerFeatureID() != CMPackage.ATTRIBUTE__CONCEPT) return null;
        return (Concept)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConcept(Concept newConcept, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newConcept, CMPackage.ATTRIBUTE__CONCEPT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcept(Concept newConcept) {
        if (newConcept != eInternalContainer() || (eContainerFeatureID() != CMPackage.ATTRIBUTE__CONCEPT && newConcept != null)) {
            if (EcoreUtil.isAncestor(this, newConcept))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newConcept != null)
                msgs = ((InternalEObject)newConcept).eInverseAdd(this, CMPackage.CONCEPT__ATTRIBUTES, Concept.class, msgs);
            msgs = basicSetConcept(newConcept, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ATTRIBUTE__CONCEPT, newConcept, newConcept));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMPackage.ATTRIBUTE__PROPERTY, oldProperty, property));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ATTRIBUTE__PROPERTY, oldProperty, property));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        Property property = getProperty();
        return property != null ? property.getName() : null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMPackage.ATTRIBUTE__CONCEPT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetConcept((Concept)otherEnd, msgs);
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                return basicSetConcept(null, msgs);
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                return eInternalContainer().eInverseRemove(this, CMPackage.CONCEPT__ATTRIBUTES, Concept.class, msgs);
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                return getConcept();
            case CMPackage.ATTRIBUTE__PROPERTY:
                if (resolve) return getProperty();
                return basicGetProperty();
            case CMPackage.ATTRIBUTE__LABEL:
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                setConcept((Concept)newValue);
                return;
            case CMPackage.ATTRIBUTE__PROPERTY:
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                setConcept((Concept)null);
                return;
            case CMPackage.ATTRIBUTE__PROPERTY:
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
            case CMPackage.ATTRIBUTE__CONCEPT:
                return getConcept() != null;
            case CMPackage.ATTRIBUTE__PROPERTY:
                return property != null;
            case CMPackage.ATTRIBUTE__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
        }
        return super.eIsSet(featureID);
    }

} //AttributeImpl
