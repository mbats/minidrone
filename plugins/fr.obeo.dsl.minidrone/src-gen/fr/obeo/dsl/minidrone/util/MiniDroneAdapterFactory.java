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
package fr.obeo.dsl.minidrone.util;

import fr.obeo.dsl.minidrone.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDronePackage
 * @generated
 */
public class MiniDroneAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static MiniDronePackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MiniDroneAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MiniDronePackage.eINSTANCE;
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
	protected MiniDroneSwitch<Adapter> modelSwitch =
		new MiniDroneSwitch<Adapter>() {
            @Override
            public Adapter caseMiniDroneProgram(MiniDroneProgram object) {
                return createMiniDroneProgramAdapter();
            }
            @Override
            public Adapter caseInstruction(Instruction object) {
                return createInstructionAdapter();
            }
            @Override
            public Adapter caseGo(Go object) {
                return createGoAdapter();
            }
            @Override
            public Adapter caseTurn(Turn object) {
                return createTurnAdapter();
            }
            @Override
            public Adapter caseJump(Jump object) {
                return createJumpAdapter();
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
     * Creates a new adapter for an object of class '{@link fr.obeo.dsl.minidrone.MiniDroneProgram <em>Program</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.dsl.minidrone.MiniDroneProgram
     * @generated
     */
	public Adapter createMiniDroneProgramAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.obeo.dsl.minidrone.Instruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.dsl.minidrone.Instruction
     * @generated
     */
	public Adapter createInstructionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.obeo.dsl.minidrone.Go <em>Go</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.dsl.minidrone.Go
     * @generated
     */
	public Adapter createGoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.obeo.dsl.minidrone.Turn <em>Turn</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.dsl.minidrone.Turn
     * @generated
     */
	public Adapter createTurnAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.obeo.dsl.minidrone.Jump <em>Jump</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.obeo.dsl.minidrone.Jump
     * @generated
     */
	public Adapter createJumpAdapter() {
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

} //MiniDroneAdapterFactory
