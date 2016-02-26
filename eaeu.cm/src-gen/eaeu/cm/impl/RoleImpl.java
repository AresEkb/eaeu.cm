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
import eaeu.cm.Concept;
import eaeu.cm.Element;
import eaeu.cm.GlobalElement;
import eaeu.cm.Model;
import eaeu.cm.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getAnalogs <em>Analogs</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link eaeu.cm.impl.RoleImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
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
     * The cached value of the '{@link #getAnalogs() <em>Analogs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogs()
     * @generated
     * @ordered
     */
    protected EList<String> analogs;

    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final String DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected String domain = DOMAIN_EDEFAULT;

    /**
     * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcept()
     * @generated
     * @ordered
     */
    protected Concept concept;

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
    protected RoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.ROLE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ROLE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ROLE__DEFINITION, oldDefinition, definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getAnalogs() {
        if (analogs == null) {
            analogs = new EDataTypeUniqueEList<String>(String.class, this, CMPackage.ROLE__ANALOGS);
        }
        return analogs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getModel() {
        if (eContainerFeatureID() != CMPackage.ROLE__MODEL) return null;
        return (Model)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, CMPackage.ROLE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(Model newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != CMPackage.ROLE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, CMPackage.MODEL__ELEMENTS, Model.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ROLE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDomain(String newDomain) {
        String oldDomain = domain;
        domain = newDomain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ROLE__DOMAIN, oldDomain, domain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept getConcept() {
        if (concept != null && concept.eIsProxy()) {
            InternalEObject oldConcept = (InternalEObject)concept;
            concept = (Concept)eResolveProxy(oldConcept);
            if (concept != oldConcept) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMPackage.ROLE__CONCEPT, oldConcept, concept));
            }
        }
        return concept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept basicGetConcept() {
        return concept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcept(Concept newConcept) {
        Concept oldConcept = concept;
        concept = newConcept;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.ROLE__CONCEPT, oldConcept, concept));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        String name = getName();
        if (name != null && !name.isEmpty()) {
            return name;
        }
        Concept concept = getConcept();
        return concept != null ? "(" + concept.getName() + ")" : null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMPackage.ROLE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((Model)otherEnd, msgs);
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
            case CMPackage.ROLE__MODEL:
                return basicSetModel(null, msgs);
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
            case CMPackage.ROLE__MODEL:
                return eInternalContainer().eInverseRemove(this, CMPackage.MODEL__ELEMENTS, Model.class, msgs);
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
            case CMPackage.ROLE__NAME:
                return getName();
            case CMPackage.ROLE__DEFINITION:
                return getDefinition();
            case CMPackage.ROLE__ANALOGS:
                return getAnalogs();
            case CMPackage.ROLE__MODEL:
                return getModel();
            case CMPackage.ROLE__DOMAIN:
                return getDomain();
            case CMPackage.ROLE__CONCEPT:
                if (resolve) return getConcept();
                return basicGetConcept();
            case CMPackage.ROLE__LABEL:
                return getLabel();
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
            case CMPackage.ROLE__NAME:
                setName((String)newValue);
                return;
            case CMPackage.ROLE__DEFINITION:
                setDefinition((String)newValue);
                return;
            case CMPackage.ROLE__ANALOGS:
                getAnalogs().clear();
                getAnalogs().addAll((Collection<? extends String>)newValue);
                return;
            case CMPackage.ROLE__MODEL:
                setModel((Model)newValue);
                return;
            case CMPackage.ROLE__DOMAIN:
                setDomain((String)newValue);
                return;
            case CMPackage.ROLE__CONCEPT:
                setConcept((Concept)newValue);
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
            case CMPackage.ROLE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CMPackage.ROLE__DEFINITION:
                setDefinition(DEFINITION_EDEFAULT);
                return;
            case CMPackage.ROLE__ANALOGS:
                getAnalogs().clear();
                return;
            case CMPackage.ROLE__MODEL:
                setModel((Model)null);
                return;
            case CMPackage.ROLE__DOMAIN:
                setDomain(DOMAIN_EDEFAULT);
                return;
            case CMPackage.ROLE__CONCEPT:
                setConcept((Concept)null);
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
            case CMPackage.ROLE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CMPackage.ROLE__DEFINITION:
                return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
            case CMPackage.ROLE__ANALOGS:
                return analogs != null && !analogs.isEmpty();
            case CMPackage.ROLE__MODEL:
                return getModel() != null;
            case CMPackage.ROLE__DOMAIN:
                return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
            case CMPackage.ROLE__CONCEPT:
                return concept != null;
            case CMPackage.ROLE__LABEL:
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                case CMPackage.ROLE__ANALOGS: return CMPackage.ELEMENT__ANALOGS;
                default: return -1;
            }
        }
        if (baseClass == GlobalElement.class) {
            switch (derivedFeatureID) {
                case CMPackage.ROLE__MODEL: return CMPackage.GLOBAL_ELEMENT__MODEL;
                case CMPackage.ROLE__DOMAIN: return CMPackage.GLOBAL_ELEMENT__DOMAIN;
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
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                case CMPackage.ELEMENT__ANALOGS: return CMPackage.ROLE__ANALOGS;
                default: return -1;
            }
        }
        if (baseClass == GlobalElement.class) {
            switch (baseFeatureID) {
                case CMPackage.GLOBAL_ELEMENT__MODEL: return CMPackage.ROLE__MODEL;
                case CMPackage.GLOBAL_ELEMENT__DOMAIN: return CMPackage.ROLE__DOMAIN;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", definition: ");
        result.append(definition);
        result.append(", analogs: ");
        result.append(analogs);
        result.append(", domain: ");
        result.append(domain);
        result.append(')');
        return result.toString();
    }

} //RoleImpl
