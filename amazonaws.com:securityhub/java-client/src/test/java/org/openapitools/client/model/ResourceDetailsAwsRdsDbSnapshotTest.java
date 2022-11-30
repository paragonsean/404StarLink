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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ResourceDetailsAwsRdsDbSnapshot
 */
public class ResourceDetailsAwsRdsDbSnapshotTest {
    private final ResourceDetailsAwsRdsDbSnapshot model = new ResourceDetailsAwsRdsDbSnapshot();

    /**
     * Model tests for ResourceDetailsAwsRdsDbSnapshot
     */
    @Test
    public void testResourceDetailsAwsRdsDbSnapshot() {
        // TODO: test ResourceDetailsAwsRdsDbSnapshot
    }

    /**
     * Test the property 'dbSnapshotIdentifier'
     */
    @Test
    public void dbSnapshotIdentifierTest() {
        // TODO: test dbSnapshotIdentifier
    }

    /**
     * Test the property 'dbInstanceIdentifier'
     */
    @Test
    public void dbInstanceIdentifierTest() {
        // TODO: test dbInstanceIdentifier
    }

    /**
     * Test the property 'snapshotCreateTime'
     */
    @Test
    public void snapshotCreateTimeTest() {
        // TODO: test snapshotCreateTime
    }

    /**
     * Test the property 'engine'
     */
    @Test
    public void engineTest() {
        // TODO: test engine
    }

    /**
     * Test the property 'allocatedStorage'
     */
    @Test
    public void allocatedStorageTest() {
        // TODO: test allocatedStorage
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'availabilityZone'
     */
    @Test
    public void availabilityZoneTest() {
        // TODO: test availabilityZone
    }

    /**
     * Test the property 'vpcId'
     */
    @Test
    public void vpcIdTest() {
        // TODO: test vpcId
    }

    /**
     * Test the property 'instanceCreateTime'
     */
    @Test
    public void instanceCreateTimeTest() {
        // TODO: test instanceCreateTime
    }

    /**
     * Test the property 'masterUsername'
     */
    @Test
    public void masterUsernameTest() {
        // TODO: test masterUsername
    }

    /**
     * Test the property 'engineVersion'
     */
    @Test
    public void engineVersionTest() {
        // TODO: test engineVersion
    }

    /**
     * Test the property 'licenseModel'
     */
    @Test
    public void licenseModelTest() {
        // TODO: test licenseModel
    }

    /**
     * Test the property 'snapshotType'
     */
    @Test
    public void snapshotTypeTest() {
        // TODO: test snapshotType
    }

    /**
     * Test the property 'iops'
     */
    @Test
    public void iopsTest() {
        // TODO: test iops
    }

    /**
     * Test the property 'optionGroupName'
     */
    @Test
    public void optionGroupNameTest() {
        // TODO: test optionGroupName
    }

    /**
     * Test the property 'percentProgress'
     */
    @Test
    public void percentProgressTest() {
        // TODO: test percentProgress
    }

    /**
     * Test the property 'sourceRegion'
     */
    @Test
    public void sourceRegionTest() {
        // TODO: test sourceRegion
    }

    /**
     * Test the property 'sourceDbSnapshotIdentifier'
     */
    @Test
    public void sourceDbSnapshotIdentifierTest() {
        // TODO: test sourceDbSnapshotIdentifier
    }

    /**
     * Test the property 'storageType'
     */
    @Test
    public void storageTypeTest() {
        // TODO: test storageType
    }

    /**
     * Test the property 'tdeCredentialArn'
     */
    @Test
    public void tdeCredentialArnTest() {
        // TODO: test tdeCredentialArn
    }

    /**
     * Test the property 'encrypted'
     */
    @Test
    public void encryptedTest() {
        // TODO: test encrypted
    }

    /**
     * Test the property 'kmsKeyId'
     */
    @Test
    public void kmsKeyIdTest() {
        // TODO: test kmsKeyId
    }

    /**
     * Test the property 'timezone'
     */
    @Test
    public void timezoneTest() {
        // TODO: test timezone
    }

    /**
     * Test the property 'iamDatabaseAuthenticationEnabled'
     */
    @Test
    public void iamDatabaseAuthenticationEnabledTest() {
        // TODO: test iamDatabaseAuthenticationEnabled
    }

    /**
     * Test the property 'processorFeatures'
     */
    @Test
    public void processorFeaturesTest() {
        // TODO: test processorFeatures
    }

    /**
     * Test the property 'dbiResourceId'
     */
    @Test
    public void dbiResourceIdTest() {
        // TODO: test dbiResourceId
    }

}
