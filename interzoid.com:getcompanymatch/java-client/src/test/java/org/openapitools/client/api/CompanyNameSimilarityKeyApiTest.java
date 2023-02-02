/*
 * Interzoid Get Company Name Match Similarity Key API
 * This API provides a similarity key used to match with other similar company name data, including for purposes of deduplication, fuzzy matching, or merging of datasets. A much higher match rate will be achieved by matching on the algorithmically generated similarity key rather than the data itself.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@interzoid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Getcompanymatch200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyNameSimilarityKeyApi
 */
@Disabled
public class CompanyNameSimilarityKeyApiTest {

    private final CompanyNameSimilarityKeyApi api = new CompanyNameSimilarityKeyApi();

    /**
     * Gets a similarity key for matching purposes for company name data
     *
     * Gets a similarity key for matching purposes for company name data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getcompanymatchTest() throws ApiException {
        String license = null;
        String company = null;
        Getcompanymatch200Response response = api.getcompanymatch(license, company);
        // TODO: test validations
    }

}
