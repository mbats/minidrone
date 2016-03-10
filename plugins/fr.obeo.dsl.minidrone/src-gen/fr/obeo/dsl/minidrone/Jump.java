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
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A program instruction which send a jump command to the minidrone. This command is specific to the Jumping Sumo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Jump#getJumpType <em>Jump Type</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends Instruction {
	/**
     * Returns the value of the '<em><b>Jump Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.JumpType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The height of the jump.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Jump Type</em>' attribute.
     * @see fr.obeo.dsl.minidrone.JumpType
     * @see #setJumpType(JumpType)
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#getJump_JumpType()
     * @model
     * @generated
     */
	JumpType getJumpType();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.minidrone.Jump#getJumpType <em>Jump Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jump Type</em>' attribute.
     * @see fr.obeo.dsl.minidrone.JumpType
     * @see #getJumpType()
     * @generated
     */
	void setJumpType(JumpType value);

} // Jump
