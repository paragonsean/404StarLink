/*
 * Karnataka Secondary Education Examination Board, Karnataka
 * Karnataka Secondary Education Examination Board (http://kseeb.kar.nic.in) is providing passing certificates of  SSLC(10th Std) of April and June-2018 Examinations.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Sscer400Response;
import org.openapitools.client.model.Sscer401Response;
import org.openapitools.client.model.Sscer404Response;
import org.openapitools.client.model.Sscer500Response;
import org.openapitools.client.model.Sscer502Response;
import org.openapitools.client.model.Sscer503Response;
import org.openapitools.client.model.Sscer504Response;
import org.openapitools.client.model.SscerRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApisApi
 */
@Disabled
public class ApisApiTest {

    private final ApisApi api = new ApisApi();

    /**
     * Class X Marksheet
     *
     * API to verify Class X Marksheet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sscerTest() throws ApiException {
        SscerRequest sscerRequest = null;
        api.sscer(sscerRequest);
        // TODO: test validations
    }

}
