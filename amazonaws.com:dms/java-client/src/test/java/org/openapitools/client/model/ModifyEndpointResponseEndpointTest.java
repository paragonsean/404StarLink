/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import org.openapitools.client.model.CreateEndpointMessageGcpMySQLSettings;
import org.openapitools.client.model.DmsSslModeValue;
import org.openapitools.client.model.DocDbSettings;
import org.openapitools.client.model.EndpointDmsTransferSettings;
import org.openapitools.client.model.EndpointDynamoDbSettings;
import org.openapitools.client.model.EndpointElasticsearchSettings;
import org.openapitools.client.model.EndpointIBMDb2Settings;
import org.openapitools.client.model.EndpointKafkaSettings;
import org.openapitools.client.model.EndpointKinesisSettings;
import org.openapitools.client.model.EndpointMicrosoftSQLServerSettings;
import org.openapitools.client.model.EndpointMongoDbSettings;
import org.openapitools.client.model.EndpointMySQLSettings;
import org.openapitools.client.model.EndpointNeptuneSettings;
import org.openapitools.client.model.EndpointOracleSettings;
import org.openapitools.client.model.EndpointPostgreSQLSettings;
import org.openapitools.client.model.EndpointRedisSettings;
import org.openapitools.client.model.EndpointRedshiftSettings;
import org.openapitools.client.model.EndpointS3Settings;
import org.openapitools.client.model.EndpointSybaseSettings;
import org.openapitools.client.model.ReplicationEndpointTypeValue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ModifyEndpointResponseEndpoint
 */
public class ModifyEndpointResponseEndpointTest {
    private final ModifyEndpointResponseEndpoint model = new ModifyEndpointResponseEndpoint();

    /**
     * Model tests for ModifyEndpointResponseEndpoint
     */
    @Test
    public void testModifyEndpointResponseEndpoint() {
        // TODO: test ModifyEndpointResponseEndpoint
    }

    /**
     * Test the property 'endpointIdentifier'
     */
    @Test
    public void endpointIdentifierTest() {
        // TODO: test endpointIdentifier
    }

    /**
     * Test the property 'endpointType'
     */
    @Test
    public void endpointTypeTest() {
        // TODO: test endpointType
    }

    /**
     * Test the property 'engineName'
     */
    @Test
    public void engineNameTest() {
        // TODO: test engineName
    }

    /**
     * Test the property 'engineDisplayName'
     */
    @Test
    public void engineDisplayNameTest() {
        // TODO: test engineDisplayName
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'serverName'
     */
    @Test
    public void serverNameTest() {
        // TODO: test serverName
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'databaseName'
     */
    @Test
    public void databaseNameTest() {
        // TODO: test databaseName
    }

    /**
     * Test the property 'extraConnectionAttributes'
     */
    @Test
    public void extraConnectionAttributesTest() {
        // TODO: test extraConnectionAttributes
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'kmsKeyId'
     */
    @Test
    public void kmsKeyIdTest() {
        // TODO: test kmsKeyId
    }

    /**
     * Test the property 'endpointArn'
     */
    @Test
    public void endpointArnTest() {
        // TODO: test endpointArn
    }

    /**
     * Test the property 'certificateArn'
     */
    @Test
    public void certificateArnTest() {
        // TODO: test certificateArn
    }

    /**
     * Test the property 'sslMode'
     */
    @Test
    public void sslModeTest() {
        // TODO: test sslMode
    }

    /**
     * Test the property 'serviceAccessRoleArn'
     */
    @Test
    public void serviceAccessRoleArnTest() {
        // TODO: test serviceAccessRoleArn
    }

    /**
     * Test the property 'externalTableDefinition'
     */
    @Test
    public void externalTableDefinitionTest() {
        // TODO: test externalTableDefinition
    }

    /**
     * Test the property 'externalId'
     */
    @Test
    public void externalIdTest() {
        // TODO: test externalId
    }

    /**
     * Test the property 'dynamoDbSettings'
     */
    @Test
    public void dynamoDbSettingsTest() {
        // TODO: test dynamoDbSettings
    }

    /**
     * Test the property 's3Settings'
     */
    @Test
    public void s3SettingsTest() {
        // TODO: test s3Settings
    }

    /**
     * Test the property 'dmsTransferSettings'
     */
    @Test
    public void dmsTransferSettingsTest() {
        // TODO: test dmsTransferSettings
    }

    /**
     * Test the property 'mongoDbSettings'
     */
    @Test
    public void mongoDbSettingsTest() {
        // TODO: test mongoDbSettings
    }

    /**
     * Test the property 'kinesisSettings'
     */
    @Test
    public void kinesisSettingsTest() {
        // TODO: test kinesisSettings
    }

    /**
     * Test the property 'kafkaSettings'
     */
    @Test
    public void kafkaSettingsTest() {
        // TODO: test kafkaSettings
    }

    /**
     * Test the property 'elasticsearchSettings'
     */
    @Test
    public void elasticsearchSettingsTest() {
        // TODO: test elasticsearchSettings
    }

    /**
     * Test the property 'neptuneSettings'
     */
    @Test
    public void neptuneSettingsTest() {
        // TODO: test neptuneSettings
    }

    /**
     * Test the property 'redshiftSettings'
     */
    @Test
    public void redshiftSettingsTest() {
        // TODO: test redshiftSettings
    }

    /**
     * Test the property 'postgreSQLSettings'
     */
    @Test
    public void postgreSQLSettingsTest() {
        // TODO: test postgreSQLSettings
    }

    /**
     * Test the property 'mySQLSettings'
     */
    @Test
    public void mySQLSettingsTest() {
        // TODO: test mySQLSettings
    }

    /**
     * Test the property 'oracleSettings'
     */
    @Test
    public void oracleSettingsTest() {
        // TODO: test oracleSettings
    }

    /**
     * Test the property 'sybaseSettings'
     */
    @Test
    public void sybaseSettingsTest() {
        // TODO: test sybaseSettings
    }

    /**
     * Test the property 'microsoftSQLServerSettings'
     */
    @Test
    public void microsoftSQLServerSettingsTest() {
        // TODO: test microsoftSQLServerSettings
    }

    /**
     * Test the property 'ibMDb2Settings'
     */
    @Test
    public void ibMDb2SettingsTest() {
        // TODO: test ibMDb2Settings
    }

    /**
     * Test the property 'docDbSettings'
     */
    @Test
    public void docDbSettingsTest() {
        // TODO: test docDbSettings
    }

    /**
     * Test the property 'redisSettings'
     */
    @Test
    public void redisSettingsTest() {
        // TODO: test redisSettings
    }

    /**
     * Test the property 'gcpMySQLSettings'
     */
    @Test
    public void gcpMySQLSettingsTest() {
        // TODO: test gcpMySQLSettings
    }

}
