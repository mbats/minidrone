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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDronePackage
 * @generated
 */
public interface MiniDroneFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	MiniDroneFactory eINSTANCE = fr.obeo.dsl.minidrone.impl.MiniDroneFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Program</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Program</em>'.
     * @generated
     */
	MiniDroneProgram createMiniDroneProgram();

	/**
     * Returns a new object of class '<em>Go</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Go</em>'.
     * @generated
     */
	Go createGo();

	/**
     * Returns a new object of class '<em>Turn</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Turn</em>'.
     * @generated
     */
	Turn createTurn();

	/**
     * Returns a new object of class '<em>Jump</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Jump</em>'.
     * @generated
     */
	Jump createJump();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	MiniDronePackage getMiniDronePackage();

} //MiniDroneFactory
