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
package eaeu.cm.util;

import eaeu.cm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eaeu.cm.CMPackage
 * @generated
 */
public class CMSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CMPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMSwitch() {
        if (modelPackage == null) {
            modelPackage = CMPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case CMPackage.MODEL: {
                Model model = (Model)theEObject;
                T result = caseModel(model);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.GLOBAL_ELEMENT: {
                GlobalElement globalElement = (GlobalElement)theEObject;
                T result = caseGlobalElement(globalElement);
                if (result == null) result = caseElement(globalElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.NAMED_ELEMENT: {
                NamedElement namedElement = (NamedElement)theEObject;
                T result = caseNamedElement(namedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.MULTIPLICITY_ELEMENT: {
                MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
                T result = caseMultiplicityElement(multiplicityElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.CONCEPT: {
                Concept concept = (Concept)theEObject;
                T result = caseConcept(concept);
                if (result == null) result = caseNamedElement(concept);
                if (result == null) result = caseGlobalElement(concept);
                if (result == null) result = caseElement(concept);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = caseGlobalElement(property);
                if (result == null) result = caseElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.ROLE: {
                Role role = (Role)theEObject;
                T result = caseRole(role);
                if (result == null) result = caseNamedElement(role);
                if (result == null) result = caseGlobalElement(role);
                if (result == null) result = caseElement(role);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.RELATION: {
                Relation relation = (Relation)theEObject;
                T result = caseRelation(relation);
                if (result == null) result = caseGlobalElement(relation);
                if (result == null) result = caseElement(relation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T result = caseAttribute(attribute);
                if (result == null) result = caseLocalElement(attribute);
                if (result == null) result = caseElement(attribute);
                if (result == null) result = caseMultiplicityElement(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.RELATION_END: {
                RelationEnd relationEnd = (RelationEnd)theEObject;
                T result = caseRelationEnd(relationEnd);
                if (result == null) result = caseLocalElement(relationEnd);
                if (result == null) result = caseElement(relationEnd);
                if (result == null) result = caseMultiplicityElement(relationEnd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMPackage.LOCAL_ELEMENT: {
                LocalElement localElement = (LocalElement)theEObject;
                T result = caseLocalElement(localElement);
                if (result == null) result = caseElement(localElement);
                if (result == null) result = caseMultiplicityElement(localElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalElement(GlobalElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicityElement(MultiplicityElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConcept(Concept object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRole(Role object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelation(Relation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationEnd(RelationEnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalElement(LocalElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //CMSwitch
