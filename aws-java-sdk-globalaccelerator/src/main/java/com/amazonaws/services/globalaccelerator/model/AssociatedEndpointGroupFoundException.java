/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.globalaccelerator.model;

import javax.annotation.Generated;

/**
 * <p>
 * The listener that you specified has an endpoint group associated with it. You must remove all dependent resources
 * from a listener before you can delete it.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedEndpointGroupFoundException extends com.amazonaws.services.globalaccelerator.model.AWSGlobalAcceleratorException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AssociatedEndpointGroupFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AssociatedEndpointGroupFoundException(String message) {
        super(message);
    }

}
