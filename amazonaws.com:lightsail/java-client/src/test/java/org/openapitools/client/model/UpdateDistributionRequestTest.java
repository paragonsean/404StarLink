/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import org.openapitools.client.model.CreateDistributionRequestDefaultCacheBehavior;
import org.openapitools.client.model.CreateDistributionRequestOrigin;
import org.openapitools.client.model.UpdateDistributionRequestCacheBehaviorSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UpdateDistributionRequest
 */
public class UpdateDistributionRequestTest {
    private final UpdateDistributionRequest model = new UpdateDistributionRequest();

    /**
     * Model tests for UpdateDistributionRequest
     */
    @Test
    public void testUpdateDistributionRequest() {
        // TODO: test UpdateDistributionRequest
    }

    /**
     * Test the property 'distributionName'
     */
    @Test
    public void distributionNameTest() {
        // TODO: test distributionName
    }

    /**
     * Test the property 'origin'
     */
    @Test
    public void originTest() {
        // TODO: test origin
    }

    /**
     * Test the property 'defaultCacheBehavior'
     */
    @Test
    public void defaultCacheBehaviorTest() {
        // TODO: test defaultCacheBehavior
    }

    /**
     * Test the property 'cacheBehaviorSettings'
     */
    @Test
    public void cacheBehaviorSettingsTest() {
        // TODO: test cacheBehaviorSettings
    }

    /**
     * Test the property 'cacheBehaviors'
     */
    @Test
    public void cacheBehaviorsTest() {
        // TODO: test cacheBehaviors
    }

    /**
     * Test the property 'isEnabled'
     */
    @Test
    public void isEnabledTest() {
        // TODO: test isEnabled
    }

}
