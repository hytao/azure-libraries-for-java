/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ImmutabilityPolicyState.
 */
public final class ImmutabilityPolicyState extends ExpandableStringEnum<ImmutabilityPolicyState> {
    /** Static value Locked for ImmutabilityPolicyState. */
    public static final ImmutabilityPolicyState LOCKED = fromString("Locked");

    /** Static value Unlocked for ImmutabilityPolicyState. */
    public static final ImmutabilityPolicyState UNLOCKED = fromString("Unlocked");

    /**
     * Creates or finds a ImmutabilityPolicyState from its string representation.
     * @param name a name to look for
     * @return the corresponding ImmutabilityPolicyState
     */
    @JsonCreator
    public static ImmutabilityPolicyState fromString(String name) {
        return fromString(name, ImmutabilityPolicyState.class);
    }

    /**
     * @return known ImmutabilityPolicyState values
     */
    public static Collection<ImmutabilityPolicyState> values() {
        return values(ImmutabilityPolicyState.class);
    }
}
