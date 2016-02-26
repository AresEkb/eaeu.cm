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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.RelationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link eaeu.cm.impl.RelationImpl#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends GlobalElementImpl implements Relation {
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
     * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnds()
     * @generated
     * @ordered
     */
    protected EList<RelationEnd> ends;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.RELATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        EList<RelationEnd> endList = getEnds();
        if (endList.isEmpty()) {
            return null;
        }
        String result = "";
        int i = 0;
        for (RelationEnd end : endList) {
            if (i++ > 0) {
                result += " - ";
            }
            String label = end.getLabel();
            result += label != null ? label : "";
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RelationEnd> getEnds() {
        if (ends == null) {
            ends = new EObjectContainmentWithInverseEList<RelationEnd>(RelationEnd.class, this, CMPackage.RELATION__ENDS, CMPackage.RELATION_END__RELATION);
        }
        return ends;
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
            case CMPackage.RELATION__ENDS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnds()).basicAdd(otherEnd, msgs);
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
            case CMPackage.RELATION__ENDS:
                return ((InternalEList<?>)getEnds()).basicRemove(otherEnd, msgs);
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
            case CMPackage.RELATION__LABEL:
                return getLabel();
            case CMPackage.RELATION__ENDS:
                return getEnds();
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
            case CMPackage.RELATION__ENDS:
                getEnds().clear();
                getEnds().addAll((Collection<? extends RelationEnd>)newValue);
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
            case CMPackage.RELATION__ENDS:
                getEnds().clear();
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
            case CMPackage.RELATION__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
            case CMPackage.RELATION__ENDS:
                return ends != null && !ends.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RelationImpl
