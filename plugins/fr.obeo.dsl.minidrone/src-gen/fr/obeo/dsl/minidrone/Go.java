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
 * A representation of the model object '<em><b>Go</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A program instruction which send go backward/forward command to the minidrone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Go#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getGo()
 * @model
 * @generated
 */
public interface Go extends Instruction {
	/**
     * Returns the value of the '<em><b>Distance</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The distance of movement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Distance</em>' attribute.
     * @see #setDistance(int)
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#getGo_Distance()
     * @model
     * @generated
     */
	int getDistance();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.minidrone.Go#getDistance <em>Distance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance</em>' attribute.
     * @see #getDistance()
     * @generated
     */
	void setDistance(int value);

} // Go
