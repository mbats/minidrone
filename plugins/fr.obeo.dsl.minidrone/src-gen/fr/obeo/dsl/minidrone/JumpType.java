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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Jump Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc --> <!-- begin-model-doc --> Enumeration of jump types (only for
 * Jumping Sumo) <!-- end-model-doc -->
 * 
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getJumpType()
 * @model
 * @generated
 */
public enum JumpType implements Enumerator {
    /**
     * The '<em><b>JUMP LONG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JUMP_LONG_VALUE
     * @generated
     * @ordered
     */
    JUMP_LONG(0, "JUMP_LONG", "JUMP_LONG"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>JUMP HIGH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JUMP_HIGH_VALUE
     * @generated
     * @ordered
     */
    JUMP_HIGH(1, "JUMP_HIGH", "JUMP_HIGH"), //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>JUMP MAX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JUMP_MAX_VALUE
     * @generated
     * @ordered
     */
    JUMP_MAX(2, "JUMP_MAX", "JUMP_MAX"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The '<em><b>JUMP LONG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JUMP LONG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JUMP_LONG
     * @model
     * @generated
     * @ordered
     */
    public static final int JUMP_LONG_VALUE = 0;

    /**
     * The '<em><b>JUMP HIGH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JUMP HIGH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JUMP_HIGH
     * @model
     * @generated
     * @ordered
     */
    public static final int JUMP_HIGH_VALUE = 1;

    /**
     * The '<em><b>JUMP MAX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JUMP MAX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JUMP_MAX
     * @model
     * @generated
     * @ordered
     */
    public static final int JUMP_MAX_VALUE = 2;

    /**
     * An array of all the '<em><b>Jump Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final JumpType[] VALUES_ARRAY = new JumpType[] {
            JUMP_LONG,
            JUMP_HIGH,
            JUMP_MAX,
        };

    /**
     * A public read-only list of all the '<em><b>Jump Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<JumpType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Jump Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static JumpType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            JumpType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Jump Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static JumpType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            JumpType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Jump Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static JumpType get(int value) {
        switch (value) {
            case JUMP_LONG_VALUE: return JUMP_LONG;
            case JUMP_HIGH_VALUE: return JUMP_HIGH;
            case JUMP_MAX_VALUE: return JUMP_MAX;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    private JumpType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
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
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} // JumpType
