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
package eaeu.cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.Element#getAnalogs <em>Analogs</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Analogs</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analogs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analogs</em>' attribute list.
     * @see eaeu.cm.CMPackage#getElement_Analogs()
     * @model
     * @generated
     */
    EList<String> getAnalogs();

} // Element
