/*
 * Vonage Integration Suite
 * The Vonage Integration Suite API enables call control and webhooks for call events.  Your application must subscribe to the VonageIntegrationSuite API suite to use this API. 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: gunifydevops@vonage.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Account;
import org.openapitools.client.model.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Disabled
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    /**
     * Account info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        Account response = api.getAccount();
        // TODO: test validations
    }

}
