/*
 * The SureVoIP RESTful API
 * # Introduction Welcome to the SureVoIP RESTful hypermedia API (sometimes known as a VoIP REST API, Telecom REST API, SIP API, Hypermedia API or just VoIP API.)  The SureVoIP API is a way for you to automate your interaction with the SureVoIP platforms. With the API, you can create your own scripts, applications or mashups which can: * List calls * create customers * search numbers * provision numbers * send SMS texts * create outbound calls * schedule announcements * schedule call hangups with an announcement * subscribe to events/alerts * track calls * retrieve invoices * grab your SIP details * check your IP address * be 100% self-sufficient * and much more! 
 *
 * The version of the OpenAPI document: 9dcb0dc8
 * Contact: support@surevoip.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Get200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GlobalApi
 */
@Disabled
public class GlobalApiTest {

    private final GlobalApi api = new GlobalApi();

    /**
     * List global resources
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rootGetTest() throws ApiException {
        String hypermedia = null;
        String contentType = null;
        Get200Response response = api.rootGet(hypermedia, contentType);
        // TODO: test validations
    }

}
