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

import eaeu.ced.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CEDFactoryImpl extends EFactoryImpl implements CEDFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CEDFactory init() {
        try {
            CEDFactory theCEDFactory = (CEDFactory)EPackage.Registry.INSTANCE.getEFactory(CEDPackage.eNS_URI);
            if (theCEDFactory != null) {
                return theCEDFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CEDFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CEDFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case CEDPackage.DOCUMENT: return createDocument();
            case CEDPackage.DATA_SET: return createDataSet();
            case CEDPackage.DATA_ELEMENT: return createDataElement();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Document createDocument() {
        DocumentImpl document = new DocumentImpl();
        return document;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSet createDataSet() {
        DataSetImpl dataSet = new DataSetImpl();
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataElement createDataElement() {
        DataElementImpl dataElement = new DataElementImpl();
        return dataElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CEDPackage getCEDPackage() {
        return (CEDPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CEDPackage getPackage() {
        return CEDPackage.eINSTANCE;
    }

} //CEDFactoryImpl
