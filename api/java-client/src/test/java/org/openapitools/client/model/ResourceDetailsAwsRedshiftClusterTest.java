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
import org.openapitools.client.model.AwsRedshiftClusterDetailsClusterSnapshotCopyStatus;
import org.openapitools.client.model.AwsRedshiftClusterDetailsElasticIpStatus;
import org.openapitools.client.model.AwsRedshiftClusterDetailsEndpoint;
import org.openapitools.client.model.AwsRedshiftClusterDetailsHsmStatus;
import org.openapitools.client.model.AwsRedshiftClusterDetailsLoggingStatus;
import org.openapitools.client.model.AwsRedshiftClusterDetailsPendingModifiedValues;
import org.openapitools.client.model.AwsRedshiftClusterDetailsResizeInfo;
import org.openapitools.client.model.AwsRedshiftClusterDetailsRestoreStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ResourceDetailsAwsRedshiftCluster
 */
public class ResourceDetailsAwsRedshiftClusterTest {
    private final ResourceDetailsAwsRedshiftCluster model = new ResourceDetailsAwsRedshiftCluster();

    /**
     * Model tests for ResourceDetailsAwsRedshiftCluster
     */
    @Test
    public void testResourceDetailsAwsRedshiftCluster() {
        // TODO: test ResourceDetailsAwsRedshiftCluster
    }

    /**
     * Test the property 'allowVersionUpgrade'
     */
    @Test
    public void allowVersionUpgradeTest() {
        // TODO: test allowVersionUpgrade
    }

    /**
     * Test the property 'automatedSnapshotRetentionPeriod'
     */
    @Test
    public void automatedSnapshotRetentionPeriodTest() {
        // TODO: test automatedSnapshotRetentionPeriod
    }

    /**
     * Test the property 'availabilityZone'
     */
    @Test
    public void availabilityZoneTest() {
        // TODO: test availabilityZone
    }

    /**
     * Test the property 'clusterAvailabilityStatus'
     */
    @Test
    public void clusterAvailabilityStatusTest() {
        // TODO: test clusterAvailabilityStatus
    }

    /**
     * Test the property 'clusterCreateTime'
     */
    @Test
    public void clusterCreateTimeTest() {
        // TODO: test clusterCreateTime
    }

    /**
     * Test the property 'clusterIdentifier'
     */
    @Test
    public void clusterIdentifierTest() {
        // TODO: test clusterIdentifier
    }

    /**
     * Test the property 'clusterNodes'
     */
    @Test
    public void clusterNodesTest() {
        // TODO: test clusterNodes
    }

    /**
     * Test the property 'clusterParameterGroups'
     */
    @Test
    public void clusterParameterGroupsTest() {
        // TODO: test clusterParameterGroups
    }

    /**
     * Test the property 'clusterPublicKey'
     */
    @Test
    public void clusterPublicKeyTest() {
        // TODO: test clusterPublicKey
    }

    /**
     * Test the property 'clusterRevisionNumber'
     */
    @Test
    public void clusterRevisionNumberTest() {
        // TODO: test clusterRevisionNumber
    }

    /**
     * Test the property 'clusterSecurityGroups'
     */
    @Test
    public void clusterSecurityGroupsTest() {
        // TODO: test clusterSecurityGroups
    }

    /**
     * Test the property 'clusterSnapshotCopyStatus'
     */
    @Test
    public void clusterSnapshotCopyStatusTest() {
        // TODO: test clusterSnapshotCopyStatus
    }

    /**
     * Test the property 'clusterStatus'
     */
    @Test
    public void clusterStatusTest() {
        // TODO: test clusterStatus
    }

    /**
     * Test the property 'clusterSubnetGroupName'
     */
    @Test
    public void clusterSubnetGroupNameTest() {
        // TODO: test clusterSubnetGroupName
    }

    /**
     * Test the property 'clusterVersion'
     */
    @Test
    public void clusterVersionTest() {
        // TODO: test clusterVersion
    }

    /**
     * Test the property 'dbName'
     */
    @Test
    public void dbNameTest() {
        // TODO: test dbName
    }

    /**
     * Test the property 'deferredMaintenanceWindows'
     */
    @Test
    public void deferredMaintenanceWindowsTest() {
        // TODO: test deferredMaintenanceWindows
    }

    /**
     * Test the property 'elasticIpStatus'
     */
    @Test
    public void elasticIpStatusTest() {
        // TODO: test elasticIpStatus
    }

    /**
     * Test the property 'elasticResizeNumberOfNodeOptions'
     */
    @Test
    public void elasticResizeNumberOfNodeOptionsTest() {
        // TODO: test elasticResizeNumberOfNodeOptions
    }

    /**
     * Test the property 'encrypted'
     */
    @Test
    public void encryptedTest() {
        // TODO: test encrypted
    }

    /**
     * Test the property 'endpoint'
     */
    @Test
    public void endpointTest() {
        // TODO: test endpoint
    }

    /**
     * Test the property 'enhancedVpcRouting'
     */
    @Test
    public void enhancedVpcRoutingTest() {
        // TODO: test enhancedVpcRouting
    }

    /**
     * Test the property 'expectedNextSnapshotScheduleTime'
     */
    @Test
    public void expectedNextSnapshotScheduleTimeTest() {
        // TODO: test expectedNextSnapshotScheduleTime
    }

    /**
     * Test the property 'expectedNextSnapshotScheduleTimeStatus'
     */
    @Test
    public void expectedNextSnapshotScheduleTimeStatusTest() {
        // TODO: test expectedNextSnapshotScheduleTimeStatus
    }

    /**
     * Test the property 'hsmStatus'
     */
    @Test
    public void hsmStatusTest() {
        // TODO: test hsmStatus
    }

    /**
     * Test the property 'iamRoles'
     */
    @Test
    public void iamRolesTest() {
        // TODO: test iamRoles
    }

    /**
     * Test the property 'kmsKeyId'
     */
    @Test
    public void kmsKeyIdTest() {
        // TODO: test kmsKeyId
    }

    /**
     * Test the property 'maintenanceTrackName'
     */
    @Test
    public void maintenanceTrackNameTest() {
        // TODO: test maintenanceTrackName
    }

    /**
     * Test the property 'manualSnapshotRetentionPeriod'
     */
    @Test
    public void manualSnapshotRetentionPeriodTest() {
        // TODO: test manualSnapshotRetentionPeriod
    }

    /**
     * Test the property 'masterUsername'
     */
    @Test
    public void masterUsernameTest() {
        // TODO: test masterUsername
    }

    /**
     * Test the property 'nextMaintenanceWindowStartTime'
     */
    @Test
    public void nextMaintenanceWindowStartTimeTest() {
        // TODO: test nextMaintenanceWindowStartTime
    }

    /**
     * Test the property 'nodeType'
     */
    @Test
    public void nodeTypeTest() {
        // TODO: test nodeType
    }

    /**
     * Test the property 'numberOfNodes'
     */
    @Test
    public void numberOfNodesTest() {
        // TODO: test numberOfNodes
    }

    /**
     * Test the property 'pendingActions'
     */
    @Test
    public void pendingActionsTest() {
        // TODO: test pendingActions
    }

    /**
     * Test the property 'pendingModifiedValues'
     */
    @Test
    public void pendingModifiedValuesTest() {
        // TODO: test pendingModifiedValues
    }

    /**
     * Test the property 'preferredMaintenanceWindow'
     */
    @Test
    public void preferredMaintenanceWindowTest() {
        // TODO: test preferredMaintenanceWindow
    }

    /**
     * Test the property 'publiclyAccessible'
     */
    @Test
    public void publiclyAccessibleTest() {
        // TODO: test publiclyAccessible
    }

    /**
     * Test the property 'resizeInfo'
     */
    @Test
    public void resizeInfoTest() {
        // TODO: test resizeInfo
    }

    /**
     * Test the property 'restoreStatus'
     */
    @Test
    public void restoreStatusTest() {
        // TODO: test restoreStatus
    }

    /**
     * Test the property 'snapshotScheduleIdentifier'
     */
    @Test
    public void snapshotScheduleIdentifierTest() {
        // TODO: test snapshotScheduleIdentifier
    }

    /**
     * Test the property 'snapshotScheduleState'
     */
    @Test
    public void snapshotScheduleStateTest() {
        // TODO: test snapshotScheduleState
    }

    /**
     * Test the property 'vpcId'
     */
    @Test
    public void vpcIdTest() {
        // TODO: test vpcId
    }

    /**
     * Test the property 'vpcSecurityGroups'
     */
    @Test
    public void vpcSecurityGroupsTest() {
        // TODO: test vpcSecurityGroups
    }

    /**
     * Test the property 'loggingStatus'
     */
    @Test
    public void loggingStatusTest() {
        // TODO: test loggingStatus
    }

}
