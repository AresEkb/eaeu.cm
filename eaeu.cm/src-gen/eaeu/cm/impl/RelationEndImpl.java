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
import eaeu.cm.Relation;
import eaeu.cm.RelationEnd;
import eaeu.cm.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.RelationEndImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link eaeu.cm.impl.RelationEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eaeu.cm.impl.RelationEndImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationEndImpl extends LocalElementImpl implements RelationEnd {
    /**
     * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected Role role;

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
    protected RelationEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.RELATION_END;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relation getRelation() {
        if (eContainerFeatureID() != CMPackage.RELATION_END__RELATION) return null;
        return (Relation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelation(Relation newRelation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newRelation, CMPackage.RELATION_END__RELATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelation(Relation newRelation) {
        if (newRelation != eInternalContainer() || (eContainerFeatureID() != CMPackage.RELATION_END__RELATION && newRelation != null)) {
            if (EcoreUtil.isAncestor(this, newRelation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newRelation != null)
                msgs = ((InternalEObject)newRelation).eInverseAdd(this, CMPackage.RELATION__ENDS, Relation.class, msgs);
            msgs = basicSetRelation(newRelation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.RELATION_END__RELATION, newRelation, newRelation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role getRole() {
        if (role != null && role.eIsProxy()) {
            InternalEObject oldRole = (InternalEObject)role;
            role = (Role)eResolveProxy(oldRole);
            if (role != oldRole) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMPackage.RELATION_END__ROLE, oldRole, role));
            }
        }
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role basicGetRole() {
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(Role newRole) {
        Role oldRole = role;
        role = newRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.RELATION_END__ROLE, oldRole, role));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        Role role = getRole();
        return role != null ? role.getLabel() : null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMPackage.RELATION_END__RELATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetRelation((Relation)otherEnd, msgs);
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
            case CMPackage.RELATION_END__RELATION:
                return basicSetRelation(null, msgs);
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
            case CMPackage.RELATION_END__RELATION:
                return eInternalContainer().eInverseRemove(this, CMPackage.RELATION__ENDS, Relation.class, msgs);
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
            case CMPackage.RELATION_END__RELATION:
                return getRelation();
            case CMPackage.RELATION_END__ROLE:
                if (resolve) return getRole();
                return basicGetRole();
            case CMPackage.RELATION_END__LABEL:
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
            case CMPackage.RELATION_END__RELATION:
                setRelation((Relation)newValue);
                return;
            case CMPackage.RELATION_END__ROLE:
                setRole((Role)newValue);
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
            case CMPackage.RELATION_END__RELATION:
                setRelation((Relation)null);
                return;
            case CMPackage.RELATION_END__ROLE:
                setRole((Role)null);
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
            case CMPackage.RELATION_END__RELATION:
                return getRelation() != null;
            case CMPackage.RELATION_END__ROLE:
                return role != null;
            case CMPackage.RELATION_END__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
        }
        return super.eIsSet(featureID);
    }

} //RelationEndImpl
