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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDroneFactory
 * @model kind="package"
 * @generated
 */
public interface MiniDronePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "minidrone"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.obeo.fr/dsl/minidrone/1.0.0"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "minidrone"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    MiniDronePackage eINSTANCE = fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl.init();

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getMiniDroneProgram()
     * @generated
     */
    int MINI_DRONE_PROGRAM = 0;

    /**
     * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINI_DRONE_PROGRAM__INSTRUCTIONS = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MINI_DRONE_PROGRAM__NAME = 1;

    /**
     * The number of structural features of the '<em>Program</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MINI_DRONE_PROGRAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Program</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MINI_DRONE_PROGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.impl.InstructionImpl
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getInstruction()
     * @generated
     */
    int INSTRUCTION = 1;

    /**
     * The number of structural features of the '<em>Instruction</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTRUCTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Instruction</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INSTRUCTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.GoImpl <em>Go</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.impl.GoImpl
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getGo()
     * @generated
     */
    int GO = 2;

    /**
     * The feature id for the '<em><b>Distance</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GO__DISTANCE = INSTRUCTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Go</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Go</em>' class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.TurnImpl <em>Turn</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.impl.TurnImpl
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTurn()
     * @generated
     */
    int TURN = 3;

    /**
     * The feature id for the '<em><b>Angle</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TURN__ANGLE = INSTRUCTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Turn</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Turn</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TURN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.JumpImpl <em>Jump</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.impl.JumpImpl
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJump()
     * @generated
     */
    int JUMP = 4;

    /**
     * The feature id for the '<em><b>Jump Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int JUMP__JUMP_TYPE = INSTRUCTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Jump</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int JUMP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Jump</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int JUMP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.obeo.dsl.minidrone.JumpType <em>Jump Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see fr.obeo.dsl.minidrone.JumpType
     * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJumpType()
     * @generated
     */
    int JUMP_TYPE = 5;

    /**
     * Returns the meta object for class '
     * {@link fr.obeo.dsl.minidrone.MiniDroneProgram <em>Program</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Program</em>'.
     * @see fr.obeo.dsl.minidrone.MiniDroneProgram
     * @generated
     */
    EClass getMiniDroneProgram();

    /**
     * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions <em>Instructions</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instructions</em>'.
     * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions()
     * @see #getMiniDroneProgram()
     * @generated
     */
    EReference getMiniDroneProgram_Instructions();

    /**
     * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getName <em>Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getName()
     * @see #getMiniDroneProgram()
     * @generated
     */
    EAttribute getMiniDroneProgram_Name();

    /**
     * Returns the meta object for class '
     * {@link fr.obeo.dsl.minidrone.Instruction <em>Instruction</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Instruction</em>'.
     * @see fr.obeo.dsl.minidrone.Instruction
     * @generated
     */
    EClass getInstruction();

    /**
     * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Go <em>Go</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Go</em>'.
     * @see fr.obeo.dsl.minidrone.Go
     * @generated
     */
    EClass getGo();

    /**
     * Returns the meta object for the attribute '
     * {@link fr.obeo.dsl.minidrone.Go#getDistance <em>Distance</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Distance</em>'.
     * @see fr.obeo.dsl.minidrone.Go#getDistance()
     * @see #getGo()
     * @generated
     */
    EAttribute getGo_Distance();

    /**
     * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Turn <em>Turn</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Turn</em>'.
     * @see fr.obeo.dsl.minidrone.Turn
     * @generated
     */
    EClass getTurn();

    /**
     * Returns the meta object for the attribute '
     * {@link fr.obeo.dsl.minidrone.Turn#getAngle <em>Angle</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Angle</em>'.
     * @see fr.obeo.dsl.minidrone.Turn#getAngle()
     * @see #getTurn()
     * @generated
     */
    EAttribute getTurn_Angle();

    /**
     * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Jump <em>Jump</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Jump</em>'.
     * @see fr.obeo.dsl.minidrone.Jump
     * @generated
     */
    EClass getJump();

    /**
     * Returns the meta object for the attribute '
     * {@link fr.obeo.dsl.minidrone.Jump#getJumpType <em>Jump Type</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Jump Type</em>'.
     * @see fr.obeo.dsl.minidrone.Jump#getJumpType()
     * @see #getJump()
     * @generated
     */
    EAttribute getJump_JumpType();

    /**
     * Returns the meta object for enum '{@link fr.obeo.dsl.minidrone.JumpType <em>Jump Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Jump Type</em>'.
     * @see fr.obeo.dsl.minidrone.JumpType
     * @generated
     */
    EEnum getJumpType();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MiniDroneFactory getMiniDroneFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
     * represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '
         * {@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl
         * <em>Program</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getMiniDroneProgram()
         * @generated
         */
        EClass MINI_DRONE_PROGRAM = eINSTANCE.getMiniDroneProgram();

        /**
         * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference MINI_DRONE_PROGRAM__INSTRUCTIONS = eINSTANCE.getMiniDroneProgram_Instructions();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute MINI_DRONE_PROGRAM__NAME = eINSTANCE.getMiniDroneProgram_Name();

        /**
         * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.InstructionImpl <em>Instruction</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see fr.obeo.dsl.minidrone.impl.InstructionImpl
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getInstruction()
         * @generated
         */
        EClass INSTRUCTION = eINSTANCE.getInstruction();

        /**
         * The meta object literal for the '
         * {@link fr.obeo.dsl.minidrone.impl.GoImpl <em>Go</em>}' class. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see fr.obeo.dsl.minidrone.impl.GoImpl
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getGo()
         * @generated
         */
        EClass GO = eINSTANCE.getGo();

        /**
         * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GO__DISTANCE = eINSTANCE.getGo_Distance();

        /**
         * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.TurnImpl <em>Turn</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see fr.obeo.dsl.minidrone.impl.TurnImpl
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTurn()
         * @generated
         */
        EClass TURN = eINSTANCE.getTurn();

        /**
         * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute TURN__ANGLE = eINSTANCE.getTurn_Angle();

        /**
         * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.JumpImpl <em>Jump</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see fr.obeo.dsl.minidrone.impl.JumpImpl
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJump()
         * @generated
         */
        EClass JUMP = eINSTANCE.getJump();

        /**
         * The meta object literal for the '<em><b>Jump Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute JUMP__JUMP_TYPE = eINSTANCE.getJump_JumpType();

        /**
         * The meta object literal for the '
         * {@link fr.obeo.dsl.minidrone.JumpType <em>Jump Type</em>}' enum. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see fr.obeo.dsl.minidrone.JumpType
         * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJumpType()
         * @generated
         */
        EEnum JUMP_TYPE = eINSTANCE.getJumpType();

    }

} // MiniDronePackage
