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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eaeu.ced.CEDPackage
 * @generated
 */
public class CEDAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CEDPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CEDAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CEDPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CEDSwitch<Adapter> modelSwitch =
        new CEDSwitch<Adapter>() {
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseContainer(Container object) {
                return createContainerAdapter();
            }
            @Override
            public Adapter caseComponent(Component object) {
                return createComponentAdapter();
            }
            @Override
            public Adapter caseDocument(Document object) {
                return createDocumentAdapter();
            }
            @Override
            public Adapter caseDataSet(DataSet object) {
                return createDataSetAdapter();
            }
            @Override
            public Adapter caseDataElement(DataElement object) {
                return createDataElementAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseMultiplicityElement(MultiplicityElement object) {
                return createMultiplicityElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.Container
     * @generated
     */
    public Adapter createContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.Document <em>Document</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.Document
     * @generated
     */
    public Adapter createDocumentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.DataSet
     * @generated
     */
    public Adapter createDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.ced.DataElement <em>Data Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.ced.DataElement
     * @generated
     */
    public Adapter createDataElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.cm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.cm.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eaeu.cm.MultiplicityElement <em>Multiplicity Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eaeu.cm.MultiplicityElement
     * @generated
     */
    public Adapter createMultiplicityElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //CEDAdapterFactory
