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
import org.openapitools.client.model.AwsEcsTaskDefinitionDetailsProxyConfiguration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ResourceDetailsAwsEcsTaskDefinition
 */
public class ResourceDetailsAwsEcsTaskDefinitionTest {
    private final ResourceDetailsAwsEcsTaskDefinition model = new ResourceDetailsAwsEcsTaskDefinition();

    /**
     * Model tests for ResourceDetailsAwsEcsTaskDefinition
     */
    @Test
    public void testResourceDetailsAwsEcsTaskDefinition() {
        // TODO: test ResourceDetailsAwsEcsTaskDefinition
    }

    /**
     * Test the property 'containerDefinitions'
     */
    @Test
    public void containerDefinitionsTest() {
        // TODO: test containerDefinitions
    }

    /**
     * Test the property 'cpu'
     */
    @Test
    public void cpuTest() {
        // TODO: test cpu
    }

    /**
     * Test the property 'executionRoleArn'
     */
    @Test
    public void executionRoleArnTest() {
        // TODO: test executionRoleArn
    }

    /**
     * Test the property 'family'
     */
    @Test
    public void familyTest() {
        // TODO: test family
    }

    /**
     * Test the property 'inferenceAccelerators'
     */
    @Test
    public void inferenceAcceleratorsTest() {
        // TODO: test inferenceAccelerators
    }

    /**
     * Test the property 'ipcMode'
     */
    @Test
    public void ipcModeTest() {
        // TODO: test ipcMode
    }

    /**
     * Test the property 'memory'
     */
    @Test
    public void memoryTest() {
        // TODO: test memory
    }

    /**
     * Test the property 'networkMode'
     */
    @Test
    public void networkModeTest() {
        // TODO: test networkMode
    }

    /**
     * Test the property 'pidMode'
     */
    @Test
    public void pidModeTest() {
        // TODO: test pidMode
    }

    /**
     * Test the property 'placementConstraints'
     */
    @Test
    public void placementConstraintsTest() {
        // TODO: test placementConstraints
    }

    /**
     * Test the property 'proxyConfiguration'
     */
    @Test
    public void proxyConfigurationTest() {
        // TODO: test proxyConfiguration
    }

    /**
     * Test the property 'requiresCompatibilities'
     */
    @Test
    public void requiresCompatibilitiesTest() {
        // TODO: test requiresCompatibilities
    }

    /**
     * Test the property 'taskRoleArn'
     */
    @Test
    public void taskRoleArnTest() {
        // TODO: test taskRoleArn
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

}
