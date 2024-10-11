/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
import java.util.Map;
import org.openapitools.client.model.ElasticsearchDomainStatusAdvancedSecurityOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusAutoTuneOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusChangeProgressDetails;
import org.openapitools.client.model.ElasticsearchDomainStatusCognitoOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusDomainEndpointOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusEBSOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusElasticsearchClusterConfig;
import org.openapitools.client.model.ElasticsearchDomainStatusEncryptionAtRestOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusNodeToNodeEncryptionOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusServiceSoftwareOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusSnapshotOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusVPCOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DeleteElasticsearchDomainResponseDomainStatus
 */
public class DeleteElasticsearchDomainResponseDomainStatusTest {
    private final DeleteElasticsearchDomainResponseDomainStatus model = new DeleteElasticsearchDomainResponseDomainStatus();

    /**
     * Model tests for DeleteElasticsearchDomainResponseDomainStatus
     */
    @Test
    public void testDeleteElasticsearchDomainResponseDomainStatus() {
        // TODO: test DeleteElasticsearchDomainResponseDomainStatus
    }

    /**
     * Test the property 'domainId'
     */
    @Test
    public void domainIdTest() {
        // TODO: test domainId
    }

    /**
     * Test the property 'domainName'
     */
    @Test
    public void domainNameTest() {
        // TODO: test domainName
    }

    /**
     * Test the property 'ARN'
     */
    @Test
    public void ARNTest() {
        // TODO: test ARN
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'deleted'
     */
    @Test
    public void deletedTest() {
        // TODO: test deleted
    }

    /**
     * Test the property 'endpoint'
     */
    @Test
    public void endpointTest() {
        // TODO: test endpoint
    }

    /**
     * Test the property 'endpoints'
     */
    @Test
    public void endpointsTest() {
        // TODO: test endpoints
    }

    /**
     * Test the property 'processing'
     */
    @Test
    public void processingTest() {
        // TODO: test processing
    }

    /**
     * Test the property 'upgradeProcessing'
     */
    @Test
    public void upgradeProcessingTest() {
        // TODO: test upgradeProcessing
    }

    /**
     * Test the property 'elasticsearchVersion'
     */
    @Test
    public void elasticsearchVersionTest() {
        // TODO: test elasticsearchVersion
    }

    /**
     * Test the property 'elasticsearchClusterConfig'
     */
    @Test
    public void elasticsearchClusterConfigTest() {
        // TODO: test elasticsearchClusterConfig
    }

    /**
     * Test the property 'ebSOptions'
     */
    @Test
    public void ebSOptionsTest() {
        // TODO: test ebSOptions
    }

    /**
     * Test the property 'accessPolicies'
     */
    @Test
    public void accessPoliciesTest() {
        // TODO: test accessPolicies
    }

    /**
     * Test the property 'snapshotOptions'
     */
    @Test
    public void snapshotOptionsTest() {
        // TODO: test snapshotOptions
    }

    /**
     * Test the property 'vpCOptions'
     */
    @Test
    public void vpCOptionsTest() {
        // TODO: test vpCOptions
    }

    /**
     * Test the property 'cognitoOptions'
     */
    @Test
    public void cognitoOptionsTest() {
        // TODO: test cognitoOptions
    }

    /**
     * Test the property 'encryptionAtRestOptions'
     */
    @Test
    public void encryptionAtRestOptionsTest() {
        // TODO: test encryptionAtRestOptions
    }

    /**
     * Test the property 'nodeToNodeEncryptionOptions'
     */
    @Test
    public void nodeToNodeEncryptionOptionsTest() {
        // TODO: test nodeToNodeEncryptionOptions
    }

    /**
     * Test the property 'advancedOptions'
     */
    @Test
    public void advancedOptionsTest() {
        // TODO: test advancedOptions
    }

    /**
     * Test the property 'logPublishingOptions'
     */
    @Test
    public void logPublishingOptionsTest() {
        // TODO: test logPublishingOptions
    }

    /**
     * Test the property 'serviceSoftwareOptions'
     */
    @Test
    public void serviceSoftwareOptionsTest() {
        // TODO: test serviceSoftwareOptions
    }

    /**
     * Test the property 'domainEndpointOptions'
     */
    @Test
    public void domainEndpointOptionsTest() {
        // TODO: test domainEndpointOptions
    }

    /**
     * Test the property 'advancedSecurityOptions'
     */
    @Test
    public void advancedSecurityOptionsTest() {
        // TODO: test advancedSecurityOptions
    }

    /**
     * Test the property 'autoTuneOptions'
     */
    @Test
    public void autoTuneOptionsTest() {
        // TODO: test autoTuneOptions
    }

    /**
     * Test the property 'changeProgressDetails'
     */
    @Test
    public void changeProgressDetailsTest() {
        // TODO: test changeProgressDetails
    }

}
