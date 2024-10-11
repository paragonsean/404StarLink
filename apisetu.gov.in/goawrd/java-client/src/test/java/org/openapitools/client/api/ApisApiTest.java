/*
 * Goa Water Resources Department, Goa
 * Goa WRD (https://goawrd.gov.in/) is the official departmental portal of the Water Resources Department, Govt. of Goa, through which citizens can avail time bound service being offered by the department. Certificates issued by it (e.g. Contractor Enlistment, Well Registration etc) are made available in citizens' DigiLocker accounts.
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
import org.openapitools.client.model.Ercer400Response;
import org.openapitools.client.model.Ercer401Response;
import org.openapitools.client.model.Ercer404Response;
import org.openapitools.client.model.Ercer500Response;
import org.openapitools.client.model.Ercer502Response;
import org.openapitools.client.model.Ercer503Response;
import org.openapitools.client.model.Ercer504Response;
import org.openapitools.client.model.ErcerRequest;
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
     * Registration Certificate of Establishment Employing Contract Labour
     *
     * API to verify Registration Certificate of Establishment Employing Contract Labour.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ercerTest() throws ApiException {
        ErcerRequest ercerRequest = null;
        api.ercer(ercerRequest);
        // TODO: test validations
    }

    /**
     * Permission/ Certificate for Well
     *
     * API to verify Permission/ Certificate for Well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pfdawTest() throws ApiException {
        ErcerRequest ercerRequest = null;
        api.pfdaw(ercerRequest);
        // TODO: test validations
    }

    /**
     * Permission/ Certificate for Transportation (Petroleum Products, Water etc.)
     *
     * API to verify Permission/ Certificate for Transportation (Petroleum Products, Water etc.).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tpcerTest() throws ApiException {
        ErcerRequest ercerRequest = null;
        api.tpcer(ercerRequest);
        // TODO: test validations
    }

}
