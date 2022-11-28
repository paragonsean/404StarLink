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
 * Model tests for ResourceDetailsAwsRdsDbCluster
 */
public class ResourceDetailsAwsRdsDbClusterTest {
    private final ResourceDetailsAwsRdsDbCluster model = new ResourceDetailsAwsRdsDbCluster();

    /**
     * Model tests for ResourceDetailsAwsRdsDbCluster
     */
    @Test
    public void testResourceDetailsAwsRdsDbCluster() {
        // TODO: test ResourceDetailsAwsRdsDbCluster
    }

    /**
     * Test the property 'allocatedStorage'
     */
    @Test
    public void allocatedStorageTest() {
        // TODO: test allocatedStorage
    }

    /**
     * Test the property 'availabilityZones'
     */
    @Test
    public void availabilityZonesTest() {
        // TODO: test availabilityZones
    }

    /**
     * Test the property 'backupRetentionPeriod'
     */
    @Test
    public void backupRetentionPeriodTest() {
        // TODO: test backupRetentionPeriod
    }

    /**
     * Test the property 'databaseName'
     */
    @Test
    public void databaseNameTest() {
        // TODO: test databaseName
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'endpoint'
     */
    @Test
    public void endpointTest() {
        // TODO: test endpoint
    }

    /**
     * Test the property 'readerEndpoint'
     */
    @Test
    public void readerEndpointTest() {
        // TODO: test readerEndpoint
    }

    /**
     * Test the property 'customEndpoints'
     */
    @Test
    public void customEndpointsTest() {
        // TODO: test customEndpoints
    }

    /**
     * Test the property 'multiAz'
     */
    @Test
    public void multiAzTest() {
        // TODO: test multiAz
    }

    /**
     * Test the property 'engine'
     */
    @Test
    public void engineTest() {
        // TODO: test engine
    }

    /**
     * Test the property 'engineVersion'
     */
    @Test
    public void engineVersionTest() {
        // TODO: test engineVersion
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'masterUsername'
     */
    @Test
    public void masterUsernameTest() {
        // TODO: test masterUsername
    }

    /**
     * Test the property 'preferredBackupWindow'
     */
    @Test
    public void preferredBackupWindowTest() {
        // TODO: test preferredBackupWindow
    }

    /**
     * Test the property 'preferredMaintenanceWindow'
     */
    @Test
    public void preferredMaintenanceWindowTest() {
        // TODO: test preferredMaintenanceWindow
    }

    /**
     * Test the property 'readReplicaIdentifiers'
     */
    @Test
    public void readReplicaIdentifiersTest() {
        // TODO: test readReplicaIdentifiers
    }

    /**
     * Test the property 'vpcSecurityGroups'
     */
    @Test
    public void vpcSecurityGroupsTest() {
        // TODO: test vpcSecurityGroups
    }

    /**
     * Test the property 'hostedZoneId'
     */
    @Test
    public void hostedZoneIdTest() {
        // TODO: test hostedZoneId
    }

    /**
     * Test the property 'storageEncrypted'
     */
    @Test
    public void storageEncryptedTest() {
        // TODO: test storageEncrypted
    }

    /**
     * Test the property 'kmsKeyId'
     */
    @Test
    public void kmsKeyIdTest() {
        // TODO: test kmsKeyId
    }

    /**
     * Test the property 'dbClusterResourceId'
     */
    @Test
    public void dbClusterResourceIdTest() {
        // TODO: test dbClusterResourceId
    }

    /**
     * Test the property 'associatedRoles'
     */
    @Test
    public void associatedRolesTest() {
        // TODO: test associatedRoles
    }

    /**
     * Test the property 'clusterCreateTime'
     */
    @Test
    public void clusterCreateTimeTest() {
        // TODO: test clusterCreateTime
    }

    /**
     * Test the property 'enabledCloudWatchLogsExports'
     */
    @Test
    public void enabledCloudWatchLogsExportsTest() {
        // TODO: test enabledCloudWatchLogsExports
    }

    /**
     * Test the property 'engineMode'
     */
    @Test
    public void engineModeTest() {
        // TODO: test engineMode
    }

    /**
     * Test the property 'deletionProtection'
     */
    @Test
    public void deletionProtectionTest() {
        // TODO: test deletionProtection
    }

    /**
     * Test the property 'httpEndpointEnabled'
     */
    @Test
    public void httpEndpointEnabledTest() {
        // TODO: test httpEndpointEnabled
    }

    /**
     * Test the property 'activityStreamStatus'
     */
    @Test
    public void activityStreamStatusTest() {
        // TODO: test activityStreamStatus
    }

    /**
     * Test the property 'copyTagsToSnapshot'
     */
    @Test
    public void copyTagsToSnapshotTest() {
        // TODO: test copyTagsToSnapshot
    }

    /**
     * Test the property 'crossAccountClone'
     */
    @Test
    public void crossAccountCloneTest() {
        // TODO: test crossAccountClone
    }

    /**
     * Test the property 'domainMemberships'
     */
    @Test
    public void domainMembershipsTest() {
        // TODO: test domainMemberships
    }

    /**
     * Test the property 'dbClusterParameterGroup'
     */
    @Test
    public void dbClusterParameterGroupTest() {
        // TODO: test dbClusterParameterGroup
    }

    /**
     * Test the property 'dbSubnetGroup'
     */
    @Test
    public void dbSubnetGroupTest() {
        // TODO: test dbSubnetGroup
    }

    /**
     * Test the property 'dbClusterOptionGroupMemberships'
     */
    @Test
    public void dbClusterOptionGroupMembershipsTest() {
        // TODO: test dbClusterOptionGroupMemberships
    }

    /**
     * Test the property 'dbClusterIdentifier'
     */
    @Test
    public void dbClusterIdentifierTest() {
        // TODO: test dbClusterIdentifier
    }

    /**
     * Test the property 'dbClusterMembers'
     */
    @Test
    public void dbClusterMembersTest() {
        // TODO: test dbClusterMembers
    }

    /**
     * Test the property 'iamDatabaseAuthenticationEnabled'
     */
    @Test
    public void iamDatabaseAuthenticationEnabledTest() {
        // TODO: test iamDatabaseAuthenticationEnabled
    }

}
