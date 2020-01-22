// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LogSpecification model.
 */
@Fluent
public final class LogSpecification {
    /*
     * Name of log specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of log specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Blob duration of specification.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the name property: Name of log specification.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of log specification.
     * 
     * @param name the name value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of log specification.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of log specification.
     * 
     * @param displayName the displayName value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: Blob duration of specification.
     * 
     * @return the blobDuration value.
     */
    public String getBlobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Blob duration of specification.
     * 
     * @param blobDuration the blobDuration value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification setBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }
}
