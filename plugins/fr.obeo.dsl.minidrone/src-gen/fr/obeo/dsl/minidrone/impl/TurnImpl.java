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

import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.Turn;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Turn</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.TurnImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnImpl extends InstructionImpl implements Turn {
    /**
     * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected static final int ANGLE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected int angle = ANGLE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TurnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MiniDronePackage.Literals.TURN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getAngle() {
        return angle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAngle(int newAngle) {
        int oldAngle = angle;
        angle = newAngle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.TURN__ANGLE, oldAngle, angle));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MiniDronePackage.TURN__ANGLE:
                return getAngle();
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
            case MiniDronePackage.TURN__ANGLE:
                setAngle((Integer)newValue);
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
            case MiniDronePackage.TURN__ANGLE:
                setAngle(ANGLE_EDEFAULT);
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
            case MiniDronePackage.TURN__ANGLE:
                return angle != ANGLE_EDEFAULT;
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
        result.append(" (angle: ");
        result.append(angle);
        result.append(')');
        return result.toString();
    }

} // TurnImpl
