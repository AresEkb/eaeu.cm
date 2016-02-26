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
package eaeu.ced.util;

import eaeu.ced.*;

import eaeu.cm.MultiplicityElement;
import eaeu.cm.NamedElement;

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
 * @see eaeu.ced.CEDPackage
 * @generated
 */
public class CEDSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CEDPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CEDSwitch() {
        if (modelPackage == null) {
            modelPackage = CEDPackage.eINSTANCE;
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
            case CEDPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = caseNamedElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CEDPackage.CONTAINER: {
                Container container = (Container)theEObject;
                T result = caseContainer(container);
                if (result == null) result = caseElement(container);
                if (result == null) result = caseNamedElement(container);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CEDPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T result = caseComponent(component);
                if (result == null) result = caseElement(component);
                if (result == null) result = caseMultiplicityElement(component);
                if (result == null) result = caseNamedElement(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CEDPackage.DOCUMENT: {
                Document document = (Document)theEObject;
                T result = caseDocument(document);
                if (result == null) result = caseContainer(document);
                if (result == null) result = caseElement(document);
                if (result == null) result = caseNamedElement(document);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CEDPackage.DATA_SET: {
                DataSet dataSet = (DataSet)theEObject;
                T result = caseDataSet(dataSet);
                if (result == null) result = caseContainer(dataSet);
                if (result == null) result = caseComponent(dataSet);
                if (result == null) result = caseElement(dataSet);
                if (result == null) result = caseMultiplicityElement(dataSet);
                if (result == null) result = caseNamedElement(dataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CEDPackage.DATA_ELEMENT: {
                DataElement dataElement = (DataElement)theEObject;
                T result = caseDataElement(dataElement);
                if (result == null) result = caseComponent(dataElement);
                if (result == null) result = caseElement(dataElement);
                if (result == null) result = caseMultiplicityElement(dataElement);
                if (result == null) result = caseNamedElement(dataElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContainer(Container object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponent(Component object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocument(Document object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSet(DataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataElement(DataElement object) {
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

} //CEDSwitch
