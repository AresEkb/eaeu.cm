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
import eaeu.ced.Document;

import eaeu.cm.Model;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.DocumentImpl#getModel <em>Model</em>}</li>
 *   <li>{@link eaeu.ced.impl.DocumentImpl#getRealizationModel <em>Realization Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends ContainerImpl implements Document {
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected Model model;

    /**
     * The cached value of the '{@link #getRealizationModel() <em>Realization Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealizationModel()
     * @generated
     * @ordered
     */
    protected EObject realizationModel;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.DOCUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getModel() {
        if (model != null && model.eIsProxy()) {
            InternalEObject oldModel = (InternalEObject)model;
            model = (Model)eResolveProxy(oldModel);
            if (model != oldModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CEDPackage.DOCUMENT__MODEL, oldModel, model));
            }
        }
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model basicGetModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(Model newModel) {
        Model oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DOCUMENT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getRealizationModel() {
        if (realizationModel != null && realizationModel.eIsProxy()) {
            InternalEObject oldRealizationModel = (InternalEObject)realizationModel;
            realizationModel = eResolveProxy(oldRealizationModel);
            if (realizationModel != oldRealizationModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CEDPackage.DOCUMENT__REALIZATION_MODEL, oldRealizationModel, realizationModel));
            }
        }
        return realizationModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetRealizationModel() {
        return realizationModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealizationModel(EObject newRealizationModel) {
        EObject oldRealizationModel = realizationModel;
        realizationModel = newRealizationModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DOCUMENT__REALIZATION_MODEL, oldRealizationModel, realizationModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CEDPackage.DOCUMENT__MODEL:
                if (resolve) return getModel();
                return basicGetModel();
            case CEDPackage.DOCUMENT__REALIZATION_MODEL:
                if (resolve) return getRealizationModel();
                return basicGetRealizationModel();
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
            case CEDPackage.DOCUMENT__MODEL:
                setModel((Model)newValue);
                return;
            case CEDPackage.DOCUMENT__REALIZATION_MODEL:
                setRealizationModel((EObject)newValue);
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
            case CEDPackage.DOCUMENT__MODEL:
                setModel((Model)null);
                return;
            case CEDPackage.DOCUMENT__REALIZATION_MODEL:
                setRealizationModel((EObject)null);
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
            case CEDPackage.DOCUMENT__MODEL:
                return model != null;
            case CEDPackage.DOCUMENT__REALIZATION_MODEL:
                return realizationModel != null;
        }
        return super.eIsSet(featureID);
    }

} //DocumentImpl
