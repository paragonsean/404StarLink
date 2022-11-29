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
import org.openapitools.client.model.AwsElbLoadBalancerDetailsHealthCheck;
import org.openapitools.client.model.AwsElbLoadBalancerDetailsLoadBalancerAttributes;
import org.openapitools.client.model.AwsElbLoadBalancerDetailsPolicies;
import org.openapitools.client.model.AwsElbLoadBalancerDetailsSourceSecurityGroup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ResourceDetailsAwsElbLoadBalancer
 */
public class ResourceDetailsAwsElbLoadBalancerTest {
    private final ResourceDetailsAwsElbLoadBalancer model = new ResourceDetailsAwsElbLoadBalancer();

    /**
     * Model tests for ResourceDetailsAwsElbLoadBalancer
     */
    @Test
    public void testResourceDetailsAwsElbLoadBalancer() {
        // TODO: test ResourceDetailsAwsElbLoadBalancer
    }

    /**
     * Test the property 'availabilityZones'
     */
    @Test
    public void availabilityZonesTest() {
        // TODO: test availabilityZones
    }

    /**
     * Test the property 'backendServerDescriptions'
     */
    @Test
    public void backendServerDescriptionsTest() {
        // TODO: test backendServerDescriptions
    }

    /**
     * Test the property 'canonicalHostedZoneName'
     */
    @Test
    public void canonicalHostedZoneNameTest() {
        // TODO: test canonicalHostedZoneName
    }

    /**
     * Test the property 'canonicalHostedZoneNameID'
     */
    @Test
    public void canonicalHostedZoneNameIDTest() {
        // TODO: test canonicalHostedZoneNameID
    }

    /**
     * Test the property 'createdTime'
     */
    @Test
    public void createdTimeTest() {
        // TODO: test createdTime
    }

    /**
     * Test the property 'dnsName'
     */
    @Test
    public void dnsNameTest() {
        // TODO: test dnsName
    }

    /**
     * Test the property 'healthCheck'
     */
    @Test
    public void healthCheckTest() {
        // TODO: test healthCheck
    }

    /**
     * Test the property 'instances'
     */
    @Test
    public void instancesTest() {
        // TODO: test instances
    }

    /**
     * Test the property 'listenerDescriptions'
     */
    @Test
    public void listenerDescriptionsTest() {
        // TODO: test listenerDescriptions
    }

    /**
     * Test the property 'loadBalancerAttributes'
     */
    @Test
    public void loadBalancerAttributesTest() {
        // TODO: test loadBalancerAttributes
    }

    /**
     * Test the property 'loadBalancerName'
     */
    @Test
    public void loadBalancerNameTest() {
        // TODO: test loadBalancerName
    }

    /**
     * Test the property 'policies'
     */
    @Test
    public void policiesTest() {
        // TODO: test policies
    }

    /**
     * Test the property 'scheme'
     */
    @Test
    public void schemeTest() {
        // TODO: test scheme
    }

    /**
     * Test the property 'securityGroups'
     */
    @Test
    public void securityGroupsTest() {
        // TODO: test securityGroups
    }

    /**
     * Test the property 'sourceSecurityGroup'
     */
    @Test
    public void sourceSecurityGroupTest() {
        // TODO: test sourceSecurityGroup
    }

    /**
     * Test the property 'subnets'
     */
    @Test
    public void subnetsTest() {
        // TODO: test subnets
    }

    /**
     * Test the property 'vpcId'
     */
    @Test
    public void vpcIdTest() {
        // TODO: test vpcId
    }

}
