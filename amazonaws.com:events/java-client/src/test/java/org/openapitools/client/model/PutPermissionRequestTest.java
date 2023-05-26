/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.PutPermissionRequestCondition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PutPermissionRequest
 */
public class PutPermissionRequestTest {
    private final PutPermissionRequest model = new PutPermissionRequest();

    /**
     * Model tests for PutPermissionRequest
     */
    @Test
    public void testPutPermissionRequest() {
        // TODO: test PutPermissionRequest
    }

    /**
     * Test the property 'eventBusName'
     */
    @Test
    public void eventBusNameTest() {
        // TODO: test eventBusName
    }

    /**
     * Test the property 'action'
     */
    @Test
    public void actionTest() {
        // TODO: test action
    }

    /**
     * Test the property 'principal'
     */
    @Test
    public void principalTest() {
        // TODO: test principal
    }

    /**
     * Test the property 'statementId'
     */
    @Test
    public void statementIdTest() {
        // TODO: test statementId
    }

    /**
     * Test the property 'condition'
     */
    @Test
    public void conditionTest() {
        // TODO: test condition
    }

    /**
     * Test the property 'policy'
     */
    @Test
    public void policyTest() {
        // TODO: test policy
    }

}
