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

import fr.obeo.dsl.minidrone.Go;
import fr.obeo.dsl.minidrone.MiniDronePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Go</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.GoImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoImpl extends InstructionImpl implements Go {
    /**
     * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDistance()
     * @generated
     * @ordered
     */
    protected static final int DISTANCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDistance()
     * @generated
     * @ordered
     */
    protected int distance = DISTANCE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected GoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MiniDronePackage.Literals.GO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getDistance() {
        return distance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDistance(int newDistance) {
        int oldDistance = distance;
        distance = newDistance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.GO__DISTANCE, oldDistance, distance));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MiniDronePackage.GO__DISTANCE:
                return getDistance();
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
            case MiniDronePackage.GO__DISTANCE:
                setDistance((Integer)newValue);
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
            case MiniDronePackage.GO__DISTANCE:
                setDistance(DISTANCE_EDEFAULT);
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
            case MiniDronePackage.GO__DISTANCE:
                return distance != DISTANCE_EDEFAULT;
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
        result.append(" (distance: ");
        result.append(distance);
        result.append(')');
        return result.toString();
    }

} // GoImpl
