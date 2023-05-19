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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountSupportingEntityCapability;
import org.openapitools.client.model.JSONObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AccountHolderCapability
 */
public class AccountHolderCapabilityTest {
    private final AccountHolderCapability model = new AccountHolderCapability();

    /**
     * Model tests for AccountHolderCapability
     */
    @Test
    public void testAccountHolderCapability() {
        // TODO: test AccountHolderCapability
    }

    /**
     * Test the property 'allowed'
     */
    @Test
    public void allowedTest() {
        // TODO: test allowed
    }

    /**
     * Test the property 'allowedLevel'
     */
    @Test
    public void allowedLevelTest() {
        // TODO: test allowedLevel
    }

    /**
     * Test the property 'allowedSettings'
     */
    @Test
    public void allowedSettingsTest() {
        // TODO: test allowedSettings
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'problems'
     */
    @Test
    public void problemsTest() {
        // TODO: test problems
    }

    /**
     * Test the property 'requested'
     */
    @Test
    public void requestedTest() {
        // TODO: test requested
    }

    /**
     * Test the property 'requestedLevel'
     */
    @Test
    public void requestedLevelTest() {
        // TODO: test requestedLevel
    }

    /**
     * Test the property 'requestedSettings'
     */
    @Test
    public void requestedSettingsTest() {
        // TODO: test requestedSettings
    }

    /**
     * Test the property 'transferInstruments'
     */
    @Test
    public void transferInstrumentsTest() {
        // TODO: test transferInstruments
    }

    /**
     * Test the property 'verificationStatus'
     */
    @Test
    public void verificationStatusTest() {
        // TODO: test verificationStatus
    }

}
