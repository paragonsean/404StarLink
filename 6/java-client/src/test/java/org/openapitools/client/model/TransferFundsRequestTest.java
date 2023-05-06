/*
 * Fund API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Fund API provides endpoints for managing the funds in the accounts on your platform. These management operations include, for example, the transfer of funds from one account to another, the payout of funds to an account holder, and the retrieval of balances in an account.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Fund API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Fund/v6/accountHolderBalance ```
 *
 * The version of the OpenAPI document: 6
 * Contact: developer-experience@adyen.com
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
import org.openapitools.client.model.Amount;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for TransferFundsRequest
 */
public class TransferFundsRequestTest {
    private final TransferFundsRequest model = new TransferFundsRequest();

    /**
     * Model tests for TransferFundsRequest
     */
    @Test
    public void testTransferFundsRequest() {
        // TODO: test TransferFundsRequest
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'destinationAccountCode'
     */
    @Test
    public void destinationAccountCodeTest() {
        // TODO: test destinationAccountCode
    }

    /**
     * Test the property 'merchantReference'
     */
    @Test
    public void merchantReferenceTest() {
        // TODO: test merchantReference
    }

    /**
     * Test the property 'sourceAccountCode'
     */
    @Test
    public void sourceAccountCodeTest() {
        // TODO: test sourceAccountCode
    }

    /**
     * Test the property 'transferCode'
     */
    @Test
    public void transferCodeTest() {
        // TODO: test transferCode
    }

}
