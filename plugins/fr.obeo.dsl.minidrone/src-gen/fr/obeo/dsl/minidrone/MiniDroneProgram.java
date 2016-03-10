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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a program allowing to pilot a minidrone (Jumping Sumo or Rolling Spider).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram()
 * @model
 * @generated
 */
public interface MiniDroneProgram extends EObject {
	/**
     * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.dsl.minidrone.Instruction}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The referenced instructions contained in a program.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Instructions</em>' containment reference list.
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_Instructions()
     * @model containment="true"
     * @generated
     */
	EList<Instruction> getInstructions();

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The name of the program.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

} // MiniDroneProgram
