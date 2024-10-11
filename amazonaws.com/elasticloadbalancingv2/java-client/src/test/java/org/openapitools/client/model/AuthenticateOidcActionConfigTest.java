/*
 * Elastic Load Balancing
 * <fullname>Elastic Load Balancing</fullname> <p>A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase the availability of your application. The load balancer also monitors the health of its registered targets and ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic by specifying one or more listeners, which are configured with a protocol and port number for connections from clients to the load balancer. You configure a target group with a protocol and port number for connections from the load balancer to the targets, and with health check settings to be used when checking the health status of the targets.</p> <p>Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load Balancers, Gateway Load Balancers, and Classic Load Balancers. This reference covers the following load balancer types:</p> <ul> <li> <p>Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.</p> </li> <li> <p>Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.</p> </li> <li> <p>Gateway Load Balancer - Operates at the network layer (layer 3).</p> </li> </ul> <p>For more information, see the <a href=\"https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/\">Elastic Load Balancing User Guide</a>.</p> <p>All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat an operation, it succeeds.</p>
 *
 * The version of the OpenAPI document: 2015-12-01
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
import org.openapitools.client.model.AuthenticateOidcActionConditionalBehaviorEnum;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AuthenticateOidcActionConfig
 */
public class AuthenticateOidcActionConfigTest {
    private final AuthenticateOidcActionConfig model = new AuthenticateOidcActionConfig();

    /**
     * Model tests for AuthenticateOidcActionConfig
     */
    @Test
    public void testAuthenticateOidcActionConfig() {
        // TODO: test AuthenticateOidcActionConfig
    }

    /**
     * Test the property 'issuer'
     */
    @Test
    public void issuerTest() {
        // TODO: test issuer
    }

    /**
     * Test the property 'authorizationEndpoint'
     */
    @Test
    public void authorizationEndpointTest() {
        // TODO: test authorizationEndpoint
    }

    /**
     * Test the property 'tokenEndpoint'
     */
    @Test
    public void tokenEndpointTest() {
        // TODO: test tokenEndpoint
    }

    /**
     * Test the property 'userInfoEndpoint'
     */
    @Test
    public void userInfoEndpointTest() {
        // TODO: test userInfoEndpoint
    }

    /**
     * Test the property 'clientId'
     */
    @Test
    public void clientIdTest() {
        // TODO: test clientId
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    public void clientSecretTest() {
        // TODO: test clientSecret
    }

    /**
     * Test the property 'sessionCookieName'
     */
    @Test
    public void sessionCookieNameTest() {
        // TODO: test sessionCookieName
    }

    /**
     * Test the property 'scope'
     */
    @Test
    public void scopeTest() {
        // TODO: test scope
    }

    /**
     * Test the property 'sessionTimeout'
     */
    @Test
    public void sessionTimeoutTest() {
        // TODO: test sessionTimeout
    }

    /**
     * Test the property 'authenticationRequestExtraParams'
     */
    @Test
    public void authenticationRequestExtraParamsTest() {
        // TODO: test authenticationRequestExtraParams
    }

    /**
     * Test the property 'onUnauthenticatedRequest'
     */
    @Test
    public void onUnauthenticatedRequestTest() {
        // TODO: test onUnauthenticatedRequest
    }

    /**
     * Test the property 'useExistingClientSecret'
     */
    @Test
    public void useExistingClientSecretTest() {
        // TODO: test useExistingClientSecret
    }

}
