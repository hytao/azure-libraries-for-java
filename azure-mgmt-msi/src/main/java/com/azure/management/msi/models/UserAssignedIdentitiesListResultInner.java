// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The UserAssignedIdentitiesListResult model.
 */
@Fluent
public final class UserAssignedIdentitiesListResultInner {
    /*
     * The collection of userAssignedIdentities returned by the listing
     * operation.
     */
    @JsonProperty(value = "value")
    private List<IdentityInner> value;

    /*
     * The url to get the next page of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The collection of userAssignedIdentities
     * returned by the listing operation.
     * 
     * @return the value value.
     */
    public List<IdentityInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The collection of userAssignedIdentities
     * returned by the listing operation.
     * 
     * @param value the value value to set.
     * @return the UserAssignedIdentitiesListResultInner object itself.
     */
    public UserAssignedIdentitiesListResultInner setValue(List<IdentityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The url to get the next page of results, if
     * any.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The url to get the next page of results, if
     * any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the UserAssignedIdentitiesListResultInner object itself.
     */
    public UserAssignedIdentitiesListResultInner setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
