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
import org.openapitools.client.model.SAMLOptionsInputIdp;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for SAMLOptionsInput
 */
public class SAMLOptionsInputTest {
    private final SAMLOptionsInput model = new SAMLOptionsInput();

    /**
     * Model tests for SAMLOptionsInput
     */
    @Test
    public void testSAMLOptionsInput() {
        // TODO: test SAMLOptionsInput
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'idp'
     */
    @Test
    public void idpTest() {
        // TODO: test idp
    }

    /**
     * Test the property 'masterUserName'
     */
    @Test
    public void masterUserNameTest() {
        // TODO: test masterUserName
    }

    /**
     * Test the property 'masterBackendRole'
     */
    @Test
    public void masterBackendRoleTest() {
        // TODO: test masterBackendRole
    }

    /**
     * Test the property 'subjectKey'
     */
    @Test
    public void subjectKeyTest() {
        // TODO: test subjectKey
    }

    /**
     * Test the property 'rolesKey'
     */
    @Test
    public void rolesKeyTest() {
        // TODO: test rolesKey
    }

    /**
     * Test the property 'sessionTimeoutMinutes'
     */
    @Test
    public void sessionTimeoutMinutesTest() {
        // TODO: test sessionTimeoutMinutes
    }

}
