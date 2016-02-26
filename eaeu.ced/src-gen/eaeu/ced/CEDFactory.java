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
package eaeu.ced;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eaeu.ced.CEDPackage
 * @generated
 */
public interface CEDFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CEDFactory eINSTANCE = eaeu.ced.impl.CEDFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Document</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document</em>'.
     * @generated
     */
    Document createDocument();

    /**
     * Returns a new object of class '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set</em>'.
     * @generated
     */
    DataSet createDataSet();

    /**
     * Returns a new object of class '<em>Data Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Element</em>'.
     * @generated
     */
    DataElement createDataElement();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CEDPackage getCEDPackage();

} //CEDFactory
