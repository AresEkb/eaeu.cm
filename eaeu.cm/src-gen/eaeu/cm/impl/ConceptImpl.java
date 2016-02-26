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
import eaeu.cm.Element;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getAnalogs <em>Analogs</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getModel <em>Model</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link eaeu.cm.impl.ConceptImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptImpl extends MinimalEObjectImpl.Container implements Concept {
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
     * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneral()
     * @generated
     * @ordered
     */
    protected Concept general;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConceptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMPackage.Literals.CONCEPT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.CONCEPT__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.CONCEPT__DEFINITION, oldDefinition, definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getAnalogs() {
        if (analogs == null) {
            analogs = new EDataTypeUniqueEList<String>(String.class, this, CMPackage.CONCEPT__ANALOGS);
        }
        return analogs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model getModel() {
        if (eContainerFeatureID() != CMPackage.CONCEPT__MODEL) return null;
        return (Model)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, CMPackage.CONCEPT__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(Model newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != CMPackage.CONCEPT__MODEL && newModel != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.CONCEPT__MODEL, newModel, newModel));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.CONCEPT__DOMAIN, oldDomain, domain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept getGeneral() {
        if (general != null && general.eIsProxy()) {
            InternalEObject oldGeneral = (InternalEObject)general;
            general = (Concept)eResolveProxy(oldGeneral);
            if (general != oldGeneral) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMPackage.CONCEPT__GENERAL, oldGeneral, general));
            }
        }
        return general;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concept basicGetGeneral() {
        return general;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneral(Concept newGeneral) {
        Concept oldGeneral = general;
        general = newGeneral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMPackage.CONCEPT__GENERAL, oldGeneral, general));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, CMPackage.CONCEPT__ATTRIBUTES, CMPackage.ATTRIBUTE__CONCEPT);
        }
        return attributes;
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
            case CMPackage.CONCEPT__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((Model)otherEnd, msgs);
            case CMPackage.CONCEPT__ATTRIBUTES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
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
            case CMPackage.CONCEPT__MODEL:
                return basicSetModel(null, msgs);
            case CMPackage.CONCEPT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
            case CMPackage.CONCEPT__MODEL:
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
            case CMPackage.CONCEPT__NAME:
                return getName();
            case CMPackage.CONCEPT__DEFINITION:
                return getDefinition();
            case CMPackage.CONCEPT__ANALOGS:
                return getAnalogs();
            case CMPackage.CONCEPT__MODEL:
                return getModel();
            case CMPackage.CONCEPT__DOMAIN:
                return getDomain();
            case CMPackage.CONCEPT__GENERAL:
                if (resolve) return getGeneral();
                return basicGetGeneral();
            case CMPackage.CONCEPT__ATTRIBUTES:
                return getAttributes();
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
            case CMPackage.CONCEPT__NAME:
                setName((String)newValue);
                return;
            case CMPackage.CONCEPT__DEFINITION:
                setDefinition((String)newValue);
                return;
            case CMPackage.CONCEPT__ANALOGS:
                getAnalogs().clear();
                getAnalogs().addAll((Collection<? extends String>)newValue);
                return;
            case CMPackage.CONCEPT__MODEL:
                setModel((Model)newValue);
                return;
            case CMPackage.CONCEPT__DOMAIN:
                setDomain((String)newValue);
                return;
            case CMPackage.CONCEPT__GENERAL:
                setGeneral((Concept)newValue);
                return;
            case CMPackage.CONCEPT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
            case CMPackage.CONCEPT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CMPackage.CONCEPT__DEFINITION:
                setDefinition(DEFINITION_EDEFAULT);
                return;
            case CMPackage.CONCEPT__ANALOGS:
                getAnalogs().clear();
                return;
            case CMPackage.CONCEPT__MODEL:
                setModel((Model)null);
                return;
            case CMPackage.CONCEPT__DOMAIN:
                setDomain(DOMAIN_EDEFAULT);
                return;
            case CMPackage.CONCEPT__GENERAL:
                setGeneral((Concept)null);
                return;
            case CMPackage.CONCEPT__ATTRIBUTES:
                getAttributes().clear();
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
            case CMPackage.CONCEPT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CMPackage.CONCEPT__DEFINITION:
                return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
            case CMPackage.CONCEPT__ANALOGS:
                return analogs != null && !analogs.isEmpty();
            case CMPackage.CONCEPT__MODEL:
                return getModel() != null;
            case CMPackage.CONCEPT__DOMAIN:
                return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
            case CMPackage.CONCEPT__GENERAL:
                return general != null;
            case CMPackage.CONCEPT__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
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
                case CMPackage.CONCEPT__ANALOGS: return CMPackage.ELEMENT__ANALOGS;
                default: return -1;
            }
        }
        if (baseClass == GlobalElement.class) {
            switch (derivedFeatureID) {
                case CMPackage.CONCEPT__MODEL: return CMPackage.GLOBAL_ELEMENT__MODEL;
                case CMPackage.CONCEPT__DOMAIN: return CMPackage.GLOBAL_ELEMENT__DOMAIN;
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
                case CMPackage.ELEMENT__ANALOGS: return CMPackage.CONCEPT__ANALOGS;
                default: return -1;
            }
        }
        if (baseClass == GlobalElement.class) {
            switch (baseFeatureID) {
                case CMPackage.GLOBAL_ELEMENT__MODEL: return CMPackage.CONCEPT__MODEL;
                case CMPackage.GLOBAL_ELEMENT__DOMAIN: return CMPackage.CONCEPT__DOMAIN;
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

} //ConceptImpl
