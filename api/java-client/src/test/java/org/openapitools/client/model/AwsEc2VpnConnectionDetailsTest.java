/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import java.util.List;
import org.openapitools.client.model.AwsEc2VpnConnectionDetailsOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AwsEc2VpnConnectionDetails
 */
public class AwsEc2VpnConnectionDetailsTest {
    private final AwsEc2VpnConnectionDetails model = new AwsEc2VpnConnectionDetails();

    /**
     * Model tests for AwsEc2VpnConnectionDetails
     */
    @Test
    public void testAwsEc2VpnConnectionDetails() {
        // TODO: test AwsEc2VpnConnectionDetails
    }

    /**
     * Test the property 'vpnConnectionId'
     */
    @Test
    public void vpnConnectionIdTest() {
        // TODO: test vpnConnectionId
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'customerGatewayId'
     */
    @Test
    public void customerGatewayIdTest() {
        // TODO: test customerGatewayId
    }

    /**
     * Test the property 'customerGatewayConfiguration'
     */
    @Test
    public void customerGatewayConfigurationTest() {
        // TODO: test customerGatewayConfiguration
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'vpnGatewayId'
     */
    @Test
    public void vpnGatewayIdTest() {
        // TODO: test vpnGatewayId
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        // TODO: test category
    }

    /**
     * Test the property 'vgwTelemetry'
     */
    @Test
    public void vgwTelemetryTest() {
        // TODO: test vgwTelemetry
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

    /**
     * Test the property 'routes'
     */
    @Test
    public void routesTest() {
        // TODO: test routes
    }

    /**
     * Test the property 'transitGatewayId'
     */
    @Test
    public void transitGatewayIdTest() {
        // TODO: test transitGatewayId
    }

}
