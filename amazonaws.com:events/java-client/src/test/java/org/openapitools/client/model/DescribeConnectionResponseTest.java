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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ConnectionAuthorizationType;
import org.openapitools.client.model.ConnectionState;
import org.openapitools.client.model.DescribeConnectionResponseAuthParameters;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DescribeConnectionResponse
 */
public class DescribeConnectionResponseTest {
    private final DescribeConnectionResponse model = new DescribeConnectionResponse();

    /**
     * Model tests for DescribeConnectionResponse
     */
    @Test
    public void testDescribeConnectionResponse() {
        // TODO: test DescribeConnectionResponse
    }

    /**
     * Test the property 'connectionArn'
     */
    @Test
    public void connectionArnTest() {
        // TODO: test connectionArn
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'connectionState'
     */
    @Test
    public void connectionStateTest() {
        // TODO: test connectionState
    }

    /**
     * Test the property 'stateReason'
     */
    @Test
    public void stateReasonTest() {
        // TODO: test stateReason
    }

    /**
     * Test the property 'authorizationType'
     */
    @Test
    public void authorizationTypeTest() {
        // TODO: test authorizationType
    }

    /**
     * Test the property 'secretArn'
     */
    @Test
    public void secretArnTest() {
        // TODO: test secretArn
    }

    /**
     * Test the property 'authParameters'
     */
    @Test
    public void authParametersTest() {
        // TODO: test authParameters
    }

    /**
     * Test the property 'creationTime'
     */
    @Test
    public void creationTimeTest() {
        // TODO: test creationTime
    }

    /**
     * Test the property 'lastModifiedTime'
     */
    @Test
    public void lastModifiedTimeTest() {
        // TODO: test lastModifiedTime
    }

    /**
     * Test the property 'lastAuthorizedTime'
     */
    @Test
    public void lastAuthorizedTimeTest() {
        // TODO: test lastAuthorizedTime
    }

}
