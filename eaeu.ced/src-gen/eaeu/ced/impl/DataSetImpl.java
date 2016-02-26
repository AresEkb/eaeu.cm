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
import eaeu.ced.DataSet;

import eaeu.cm.Attribute;
import eaeu.cm.CMPackage;
import eaeu.cm.GlobalElement;
import eaeu.cm.MultiplicityElement;
import eaeu.cm.Relation;
import eaeu.cm.RelationEnd;
import eaeu.cm.Role;

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
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getAllowedAttributes <em>Allowed Attributes</em>}</li>
 *   <li>{@link eaeu.ced.impl.DataSetImpl#getAllowedRelationEnds <em>Allowed Relation Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetImpl extends ContainerImpl implements DataSet {
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
    protected DataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CEDPackage.Literals.DATA_SET;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DATA_SET__LOWER, oldLower, lower));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DATA_SET__UPPER, oldUpper, upper));
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
        if (eContainerFeatureID() != CEDPackage.DATA_SET__CONTAINER) return null;
        return (eaeu.ced.Container)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(eaeu.ced.Container newContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainer, CEDPackage.DATA_SET__CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(eaeu.ced.Container newContainer) {
        if (newContainer != eInternalContainer() || (eContainerFeatureID() != CEDPackage.DATA_SET__CONTAINER && newContainer != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DATA_SET__CONTAINER, newContainer, newContainer));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CEDPackage.DATA_SET__ROLE, oldRole, role));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CEDPackage.DATA_SET__ROLE, oldRole, role));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        Role role = getRole();
        return role != null ? role.getLabel() : getName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Relation> getRelations() {
        java.util.List<Relation> result;
        Role role = getRole();
        if (role != null) {
            eaeu.cm.Concept concept = role.getConcept();
            // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
            //result = concept.getModel().getElements().stream()
            //        .filter(el -> el instanceof Relation)
            //        .map(el -> (Relation) el)
            //        .filter(rel -> rel.getEnds().stream()
            //                .anyMatch(end -> end.getRole() != null && concept.equals(end.getRole().getConcept())))
            //        .collect(java.util.stream.Collectors.toList());
            result = new java.util.ArrayList<Relation>();
            for (eaeu.cm.Element el : concept.getModel().getElements()) {
                if (el instanceof Relation) {
                    Relation rel = (Relation) el;
                    for (eaeu.cm.RelationEnd end : rel.getEnds()) {
                        if (end.getRole() != null && concept.equals(end.getRole().getConcept())) {
                            result.add(rel);
                            break;
                        }
                    }
                }
            }
        }
        else {
            result = java.util.Collections.<Relation>emptyList();
        }
        return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Relation>(this,
                CEDPackage.Literals.DATA_SET__RELATIONS, result.size(), result.toArray());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAllowedAttributes() {
        java.util.List<Attribute> result;
        Role role = getRole();
        if (role != null) {
            // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
            //java.util.List<eaeu.cm.Property> addedProperties = getComponents().stream()
            //        .filter(comp -> comp instanceof eaeu.ced.DataElement)
            //        .map(comp -> (eaeu.ced.DataElement) comp)
            //        .filter(el -> !(el.getLower() == 0 && el.getUpper() == 0))
            //        .map(el -> el.getProperty())
            //        .collect(java.util.stream.Collectors.toList());
            //result = role.getConcept().getAttributes().stream()
            //        .filter(attr -> !addedProperties.contains(attr.getProperty()))
            //        .collect(java.util.stream.Collectors.toList());
            java.util.List<eaeu.cm.Property> addedProperties = new java.util.ArrayList<eaeu.cm.Property>();
            for (Component comp : getComponents()) {
                if (comp instanceof eaeu.ced.DataElement) {
                    eaeu.ced.DataElement el = (eaeu.ced.DataElement) comp;
                    if (!(el.getLower() == 0 && el.getUpper() == 0)) {
                        addedProperties.add(el.getProperty());
                    }
                }
            }
            result = new java.util.ArrayList<Attribute>();
            for (eaeu.cm.Attribute attr : role.getConcept().getAttributes()) {
                if (!addedProperties.contains(attr.getProperty())) {
                    result.add(attr);
                }
            }
        }
        else {
            result = java.util.Collections.<Attribute>emptyList();
        }
        return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<Attribute>(this,
                CEDPackage.Literals.DATA_SET__ALLOWED_ATTRIBUTES, result.size(), result.toArray());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RelationEnd> getAllowedRelationEnds() {
        java.util.List<RelationEnd> result;
        Role role = getRole();
        if (role != null) {
            eaeu.cm.Concept concept = role.getConcept();
            // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
            //java.util.List<Role> addedRoles = getComponents().stream()
            //        .filter(comp -> comp instanceof DataSet)
            //        .map(comp -> (DataSet) comp)
            //        .map(el -> el.getRole())
            //        .collect(java.util.stream.Collectors.toList());
            //result = getRelations().stream()
            //        .flatMap(rel -> rel.getEnds().stream())
            //        .filter(end -> end.getRole().getName() != null && !end.getRole().getName().isEmpty())
            //        .filter(end -> !concept.equals(end.getRole().getConcept()))
            //        .filter(end -> !addedRoles.contains(end.getRole()))
            //        .collect(java.util.stream.Collectors.toList());
            java.util.List<Role> addedRoles = new java.util.ArrayList<Role>();
            for (Component comp : getComponents()) {
                if (comp instanceof eaeu.ced.DataSet) {
                    addedRoles.add(((eaeu.ced.DataSet) comp).getRole());
                }
            }
            result = new java.util.ArrayList<RelationEnd>();
            for (eaeu.cm.Relation rel : getRelations()) {
                for (eaeu.cm.RelationEnd end : rel.getEnds()) {
                    if (end.getRole().getName() != null && !end.getRole().getName().isEmpty()) {
                        if (!concept.equals(end.getRole().getConcept())) {
                            if (!addedRoles.contains(end.getRole())) {
                                result.add(end);
                            }
                        }
                    }
                }
            }
        }
        else {
            result = java.util.Collections.<RelationEnd>emptyList();
        }
        return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList.FastCompare<RelationEnd>(this,
                CEDPackage.Literals.DATA_SET__ALLOWED_RELATION_ENDS, result.size(), result.toArray());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalElement getConceptualElement() {
        return getRole();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void syncDataElements() {
        int prev = -1;
        for (Attribute attr : getRole().getConcept().getAttributes()) {
            // TODO: RSA 9.1 is based on Java 7. Migrate to Java 8 in future
            //java.util.List<eaeu.cm.Property> properties = getComponents().stream()
            //        .map(comp -> comp instanceof eaeu.ced.DataElement ? ((eaeu.ced.DataElement)comp).getProperty() : null)
            //        .collect(java.util.stream.Collectors.toList());
            java.util.List<eaeu.cm.Property> properties = new java.util.ArrayList<eaeu.cm.Property>();
            for (Component comp : getComponents()) {
                properties.add(comp instanceof eaeu.ced.DataElement ? ((eaeu.ced.DataElement)comp).getProperty() : null);
            }
            int index = properties.indexOf(attr.getProperty());
            if (index == -1) {
                eaeu.ced.DataElement dataElement = CEDPackage.eINSTANCE.getCEDFactory().createDataElement();
                dataElement.setProperty(attr.getProperty());
                dataElement.setLower(attr.getLower());
                dataElement.setUpper(attr.getUpper());
                getComponents().add(prev + 1, dataElement);
                prev++;
            }
            else {
                prev = index;
            }
        }
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
            case CEDPackage.DATA_SET__CONTAINER:
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
            case CEDPackage.DATA_SET__CONTAINER:
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
            case CEDPackage.DATA_SET__CONTAINER:
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
            case CEDPackage.DATA_SET__LOWER:
                return getLower();
            case CEDPackage.DATA_SET__UPPER:
                return getUpper();
            case CEDPackage.DATA_SET__BOUNDS:
                return getBounds();
            case CEDPackage.DATA_SET__CONTAINER:
                return getContainer();
            case CEDPackage.DATA_SET__ROLE:
                if (resolve) return getRole();
                return basicGetRole();
            case CEDPackage.DATA_SET__LABEL:
                return getLabel();
            case CEDPackage.DATA_SET__RELATIONS:
                return getRelations();
            case CEDPackage.DATA_SET__ALLOWED_ATTRIBUTES:
                return getAllowedAttributes();
            case CEDPackage.DATA_SET__ALLOWED_RELATION_ENDS:
                return getAllowedRelationEnds();
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
            case CEDPackage.DATA_SET__LOWER:
                setLower((Integer)newValue);
                return;
            case CEDPackage.DATA_SET__UPPER:
                setUpper((Integer)newValue);
                return;
            case CEDPackage.DATA_SET__CONTAINER:
                setContainer((eaeu.ced.Container)newValue);
                return;
            case CEDPackage.DATA_SET__ROLE:
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
            case CEDPackage.DATA_SET__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case CEDPackage.DATA_SET__UPPER:
                setUpper(UPPER_EDEFAULT);
                return;
            case CEDPackage.DATA_SET__CONTAINER:
                setContainer((eaeu.ced.Container)null);
                return;
            case CEDPackage.DATA_SET__ROLE:
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
            case CEDPackage.DATA_SET__LOWER:
                return lower != LOWER_EDEFAULT;
            case CEDPackage.DATA_SET__UPPER:
                return upper != UPPER_EDEFAULT;
            case CEDPackage.DATA_SET__BOUNDS:
                return BOUNDS_EDEFAULT == null ? getBounds() != null : !BOUNDS_EDEFAULT.equals(getBounds());
            case CEDPackage.DATA_SET__CONTAINER:
                return getContainer() != null;
            case CEDPackage.DATA_SET__ROLE:
                return role != null;
            case CEDPackage.DATA_SET__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
            case CEDPackage.DATA_SET__RELATIONS:
                return !getRelations().isEmpty();
            case CEDPackage.DATA_SET__ALLOWED_ATTRIBUTES:
                return !getAllowedAttributes().isEmpty();
            case CEDPackage.DATA_SET__ALLOWED_RELATION_ENDS:
                return !getAllowedRelationEnds().isEmpty();
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
                case CEDPackage.DATA_SET__LOWER: return CMPackage.MULTIPLICITY_ELEMENT__LOWER;
                case CEDPackage.DATA_SET__UPPER: return CMPackage.MULTIPLICITY_ELEMENT__UPPER;
                case CEDPackage.DATA_SET__BOUNDS: return CMPackage.MULTIPLICITY_ELEMENT__BOUNDS;
                default: return -1;
            }
        }
        if (baseClass == Component.class) {
            switch (derivedFeatureID) {
                case CEDPackage.DATA_SET__CONTAINER: return CEDPackage.COMPONENT__CONTAINER;
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
                case CMPackage.MULTIPLICITY_ELEMENT__LOWER: return CEDPackage.DATA_SET__LOWER;
                case CMPackage.MULTIPLICITY_ELEMENT__UPPER: return CEDPackage.DATA_SET__UPPER;
                case CMPackage.MULTIPLICITY_ELEMENT__BOUNDS: return CEDPackage.DATA_SET__BOUNDS;
                default: return -1;
            }
        }
        if (baseClass == Component.class) {
            switch (baseFeatureID) {
                case CEDPackage.COMPONENT__CONTAINER: return CEDPackage.DATA_SET__CONTAINER;
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
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == MultiplicityElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == Component.class) {
            switch (baseOperationID) {
                case CEDPackage.COMPONENT___GET_CONCEPTUAL_ELEMENT: return CEDPackage.DATA_SET___GET_CONCEPTUAL_ELEMENT;
                case CEDPackage.COMPONENT___SET_SUITABLE_REALIZATION: return CEDPackage.DATA_SET___SET_SUITABLE_REALIZATION;
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case CEDPackage.DATA_SET___GET_CONCEPTUAL_ELEMENT:
                return getConceptualElement();
            case CEDPackage.DATA_SET___SYNC_DATA_ELEMENTS:
                syncDataElements();
                return null;
            case CEDPackage.DATA_SET___SET_SUITABLE_REALIZATION:
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

} //DataSetImpl
