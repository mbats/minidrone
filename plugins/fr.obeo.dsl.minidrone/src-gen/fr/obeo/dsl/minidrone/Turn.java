/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package fr.obeo.dsl.minidrone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A program instruction which send a turn command to the minidrone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Turn#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends Instruction {
	/**
     * Returns the value of the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The rotation angle.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Angle</em>' attribute.
     * @see #setAngle(int)
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#getTurn_Angle()
     * @model
     * @generated
     */
	int getAngle();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.minidrone.Turn#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle</em>' attribute.
     * @see #getAngle()
     * @generated
     */
	void setAngle(int value);

} // Turn
