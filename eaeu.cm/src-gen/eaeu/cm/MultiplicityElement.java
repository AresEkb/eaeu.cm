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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaeu.cm.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link eaeu.cm.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link eaeu.cm.MultiplicityElement#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see eaeu.cm.CMPackage#getMultiplicityElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MultiplicityElement extends EObject {
    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #setLower(int)
     * @see eaeu.cm.CMPackage#getMultiplicityElement_Lower()
     * @model default="0" required="true"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link eaeu.cm.MultiplicityElement#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(int)
     * @see eaeu.cm.CMPackage#getMultiplicityElement_Upper()
     * @model default="-1" required="true"
     * @generated
     */
    int getUpper();

    /**
     * Sets the value of the '{@link eaeu.cm.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(int value);

    /**
     * Returns the value of the '<em><b>Bounds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bounds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bounds</em>' attribute.
     * @see eaeu.cm.CMPackage#getMultiplicityElement_Bounds()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='String result = String.format(\"%d\", lower);\r\nif (lower != upper) {\r\n    result += \"..\" + (upper == -1 ? \"*\" : String.format(\"%d\", upper));\r\n}\r\nreturn result;'"
     * @generated
     */
    String getBounds();

} // MultiplicityElement
