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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.minidrone.Instruction;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Program</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniDroneProgramImpl extends MinimalEObjectImpl.Container implements MiniDroneProgram {
    /**
     * The cached value of the '{@link #getInstructions() <em>Instructions</em>}
     * ' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getInstructions()
     * @generated
     * @ordered
     */
    protected EList<Instruction> instructions;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiniDroneProgramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MiniDronePackage.Literals.MINI_DRONE_PROGRAM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Instruction> getInstructions() {
        if (instructions == null) {
            instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS);
        }
        return instructions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
                return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
                return getInstructions();
            case MiniDronePackage.MINI_DRONE_PROGRAM__NAME:
                return getName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
                getInstructions().clear();
                getInstructions().addAll((Collection<? extends Instruction>)newValue);
                return;
            case MiniDronePackage.MINI_DRONE_PROGRAM__NAME:
                setName((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
                getInstructions().clear();
                return;
            case MiniDronePackage.MINI_DRONE_PROGRAM__NAME:
                setName(NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
                return instructions != null && !instructions.isEmpty();
            case MiniDronePackage.MINI_DRONE_PROGRAM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} // MiniDroneProgramImpl
