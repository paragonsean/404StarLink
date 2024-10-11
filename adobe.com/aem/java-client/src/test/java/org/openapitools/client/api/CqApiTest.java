/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.7.1-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CqApi
 */
@Disabled
public class CqApiTest {

    private final CqApi api = new CqApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoginPageTest() throws ApiException {
        String response = api.getLoginPage();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCqActionsTest() throws ApiException {
        String authorizableId = null;
        String changelog = null;
        api.postCqActions(authorizableId, changelog);
        // TODO: test validations
    }

}
