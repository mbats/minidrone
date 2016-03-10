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
package fr.obeo.dsl.minidrone.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.obeo.dsl.minidrone.Go;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.JumpType;
import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.Turn;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MiniDroneFactoryImpl extends EFactoryImpl implements MiniDroneFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static MiniDroneFactory init() {
        try {
            MiniDroneFactory theMiniDroneFactory = (MiniDroneFactory)EPackage.Registry.INSTANCE.getEFactory(MiniDronePackage.eNS_URI);
            if (theMiniDroneFactory != null) {
                return theMiniDroneFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MiniDroneFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public MiniDroneFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MiniDronePackage.MINI_DRONE_PROGRAM: return createMiniDroneProgram();
            case MiniDronePackage.GO: return createGo();
            case MiniDronePackage.TURN: return createTurn();
            case MiniDronePackage.JUMP: return createJump();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case MiniDronePackage.JUMP_TYPE:
                return createJumpTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case MiniDronePackage.JUMP_TYPE:
                return convertJumpTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiniDroneProgram createMiniDroneProgram() {
        MiniDroneProgramImpl miniDroneProgram = new MiniDroneProgramImpl();
        return miniDroneProgram;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Go createGo() {
        GoImpl go = new GoImpl();
        return go;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Turn createTurn() {
        TurnImpl turn = new TurnImpl();
        return turn;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Jump createJump() {
        JumpImpl jump = new JumpImpl();
        return jump;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public JumpType createJumpTypeFromString(EDataType eDataType, String initialValue) {
        JumpType result = JumpType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertJumpTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiniDronePackage getMiniDronePackage() {
        return (MiniDronePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MiniDronePackage getPackage() {
        return MiniDronePackage.eINSTANCE;
    }

} // MiniDroneFactoryImpl
