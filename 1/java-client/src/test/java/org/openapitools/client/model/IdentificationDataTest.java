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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for IdentificationData
 */
public class IdentificationDataTest {
    private final IdentificationData model = new IdentificationData();

    /**
     * Model tests for IdentificationData
     */
    @Test
    public void testIdentificationData() {
        // TODO: test IdentificationData
    }

    /**
     * Test the property 'cardNumber'
     */
    @Test
    public void cardNumberTest() {
        // TODO: test cardNumber
    }

    /**
     * Test the property 'expiryDate'
     */
    @Test
    public void expiryDateTest() {
        // TODO: test expiryDate
    }

    /**
     * Test the property 'issuerCountry'
     */
    @Test
    public void issuerCountryTest() {
        // TODO: test issuerCountry
    }

    /**
     * Test the property 'issuerState'
     */
    @Test
    public void issuerStateTest() {
        // TODO: test issuerState
    }

    /**
     * Test the property 'nationalIdExempt'
     */
    @Test
    public void nationalIdExemptTest() {
        // TODO: test nationalIdExempt
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        // TODO: test number
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
