/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v1/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v1`.
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BalancePlatform;
import org.openapitools.client.model.PaginatedAccountHoldersResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatformApi
 */
@Disabled
public class PlatformApiTest {

    private final PlatformApi api = new PlatformApi();

    /**
     * Get a balance platform
     *
     * Returns a balance platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalancePlatformsIdTest() throws ApiException {
        String id = null;
        BalancePlatform response = api.getBalancePlatformsId(id);
        // TODO: test validations
    }

    /**
     * Get all account holders under a balance platform
     *
     * Returns a paginated list of all the account holders that belong to the balance platform. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 account holders and to skip the first 20, use &#x60;/balancePlatforms/{id}/accountHolders?limit&#x3D;5&amp;offset&#x3D;20&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalancePlatformsIdAccountHoldersTest() throws ApiException {
        String id = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedAccountHoldersResponse response = api.getBalancePlatformsIdAccountHolders(id, offset, limit);
        // TODO: test validations
    }

}
