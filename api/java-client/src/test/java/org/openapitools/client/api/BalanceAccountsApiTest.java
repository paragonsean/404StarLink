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
import org.openapitools.client.model.BalanceAccount;
import org.openapitools.client.model.BalanceAccountInfo;
import org.openapitools.client.model.BalanceAccountUpdateRequest;
import org.openapitools.client.model.PaginatedPaymentInstrumentsResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BalanceAccountsApi
 */
@Disabled
public class BalanceAccountsApiTest {

    private final BalanceAccountsApi api = new BalanceAccountsApi();

    /**
     * Get a balance account
     *
     * Returns a balance account and its balances for the default currency and other currencies with a non-zero balance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalanceAccountsIdTest() throws ApiException {
        String id = null;
        BalanceAccount response = api.getBalanceAccountsId(id);
        // TODO: test validations
    }

    /**
     * Get all payment instruments for a balance account
     *
     * Returns a paginated list of the payment instruments associated with a balance account.   To fetch multiple pages, use the query parameters.For example, to limit the page to 3 payment instruments and to skip the first 6, use &#x60;/balanceAccounts/{id}/paymentInstruments?limit&#x3D;3&amp;offset&#x3D;6&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalanceAccountsIdPaymentInstrumentsTest() throws ApiException {
        String id = null;
        Integer offset = null;
        Integer limit = null;
        PaginatedPaymentInstrumentsResponse response = api.getBalanceAccountsIdPaymentInstruments(id, offset, limit);
        // TODO: test validations
    }

    /**
     * Update a balance account
     *
     * Updates a balance account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchBalanceAccountsIdTest() throws ApiException {
        String id = null;
        BalanceAccountUpdateRequest balanceAccountUpdateRequest = null;
        BalanceAccount response = api.patchBalanceAccountsId(id, balanceAccountUpdateRequest);
        // TODO: test validations
    }

    /**
     * Create a balance account
     *
     * Creates a balance account that holds the funds of the associated account holder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postBalanceAccountsTest() throws ApiException {
        BalanceAccountInfo balanceAccountInfo = null;
        BalanceAccount response = api.postBalanceAccounts(balanceAccountInfo);
        // TODO: test validations
    }

}
