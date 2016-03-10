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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.JumpType;
import fr.obeo.dsl.minidrone.MiniDronePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Jump</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.JumpImpl#getJumpType <em>Jump Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpImpl extends InstructionImpl implements Jump {
    /**
     * The default value of the '{@link #getJumpType() <em>Jump Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getJumpType()
     * @generated
     * @ordered
     */
    protected static final JumpType JUMP_TYPE_EDEFAULT = JumpType.JUMP_LONG;

    /**
     * The cached value of the '{@link #getJumpType() <em>Jump Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getJumpType()
     * @generated
     * @ordered
     */
    protected JumpType jumpType = JUMP_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected JumpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MiniDronePackage.Literals.JUMP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public JumpType getJumpType() {
        return jumpType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJumpType(JumpType newJumpType) {
        JumpType oldJumpType = jumpType;
        jumpType = newJumpType == null ? JUMP_TYPE_EDEFAULT : newJumpType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.JUMP__JUMP_TYPE, oldJumpType, jumpType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MiniDronePackage.JUMP__JUMP_TYPE:
                return getJumpType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MiniDronePackage.JUMP__JUMP_TYPE:
                setJumpType((JumpType)newValue);
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
            case MiniDronePackage.JUMP__JUMP_TYPE:
                setJumpType(JUMP_TYPE_EDEFAULT);
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
            case MiniDronePackage.JUMP__JUMP_TYPE:
                return jumpType != JUMP_TYPE_EDEFAULT;
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
        result.append(" (jumpType: ");
        result.append(jumpType);
        result.append(')');
        return result.toString();
    }

} // JumpImpl
