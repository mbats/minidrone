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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.obeo.dsl.minidrone.Go;
import fr.obeo.dsl.minidrone.Instruction;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.JumpType;
import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.Turn;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MiniDronePackageImpl extends EPackageImpl implements MiniDronePackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miniDroneProgramEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass instructionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass goEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass turnEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass jumpEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum jumpTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.obeo.dsl.minidrone.MiniDronePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MiniDronePackageImpl() {
        super(eNS_URI, MiniDroneFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link MiniDronePackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MiniDronePackage init() {
        if (isInited) return (MiniDronePackage)EPackage.Registry.INSTANCE.getEPackage(MiniDronePackage.eNS_URI);

        // Obtain or create and register package
        MiniDronePackageImpl theMiniDronePackage = (MiniDronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniDronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniDronePackageImpl());

        isInited = true;

        // Create package meta-data objects
        theMiniDronePackage.createPackageContents();

        // Initialize created meta-data
        theMiniDronePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMiniDronePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MiniDronePackage.eNS_URI, theMiniDronePackage);
        return theMiniDronePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiniDroneProgram() {
        return miniDroneProgramEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiniDroneProgram_Instructions() {
        return (EReference)miniDroneProgramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiniDroneProgram_Name() {
        return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstruction() {
        return instructionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getGo() {
        return goEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGo_Distance() {
        return (EAttribute)goEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTurn() {
        return turnEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTurn_Angle() {
        return (EAttribute)turnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getJump() {
        return jumpEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJump_JumpType() {
        return (EAttribute)jumpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getJumpType() {
        return jumpTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiniDroneFactory getMiniDroneFactory() {
        return (MiniDroneFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        miniDroneProgramEClass = createEClass(MINI_DRONE_PROGRAM);
        createEReference(miniDroneProgramEClass, MINI_DRONE_PROGRAM__INSTRUCTIONS);
        createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__NAME);

        instructionEClass = createEClass(INSTRUCTION);

        goEClass = createEClass(GO);
        createEAttribute(goEClass, GO__DISTANCE);

        turnEClass = createEClass(TURN);
        createEAttribute(turnEClass, TURN__ANGLE);

        jumpEClass = createEClass(JUMP);
        createEAttribute(jumpEClass, JUMP__JUMP_TYPE);

        // Create enums
        jumpTypeEEnum = createEEnum(JUMP_TYPE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        goEClass.getESuperTypes().add(this.getInstruction());
        turnEClass.getESuperTypes().add(this.getInstruction());
        jumpEClass.getESuperTypes().add(this.getInstruction());

        // Initialize classes, features, and operations; add parameters
        initEClass(miniDroneProgramEClass, MiniDroneProgram.class, "MiniDroneProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMiniDroneProgram_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiniDroneProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(goEClass, Go.class, "Go", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGo_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, Go.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTurn_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jumpEClass, Jump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJump_JumpType(), this.getJumpType(), "jumpType", null, 0, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(jumpTypeEEnum, JumpType.class, "JumpType");
        addEEnumLiteral(jumpTypeEEnum, JumpType.JUMP_LONG);
        addEEnumLiteral(jumpTypeEEnum, JumpType.JUMP_HIGH);
        addEEnumLiteral(jumpTypeEEnum, JumpType.JUMP_MAX);

        // Create resource
        createResource(eNS_URI);
    }

} // MiniDronePackageImpl
