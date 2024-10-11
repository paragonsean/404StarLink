/*
 * reverb
 * reverb
 *
 * The version of the OpenAPI document: 3.0
 * Contact: integrations@reverb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComparisonShoppingPagesApi
 */
@Disabled
public class ComparisonShoppingPagesApiTest {

    private final ComparisonShoppingPagesApi api = new ComparisonShoppingPagesApi();

    /**
     * Show comparison shopping page
     *
     * Show comparison shopping page
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonShoppingPagesFindGetTest() throws ApiException {
        String id = null;
        String slug = null;
        api.comparisonShoppingPagesFindGet(id, slug);
        // TODO: test validations
    }

    /**
     * Returns a set of comparison shopping pages based on the current params
     *
     * Returns a set of comparison shopping pages based on the current params
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonShoppingPagesGetTest() throws ApiException {
        api.comparisonShoppingPagesGet();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonShoppingPagesIdGetTest() throws ApiException {
        String id = null;
        api.comparisonShoppingPagesIdGet(id);
        // TODO: test validations
    }

    /**
     * Return new or used listings for a comparison shopping page
     *
     * Return new or used listings for a comparison shopping page
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonShoppingPagesIdListingsGetTest() throws ApiException {
        String id = null;
        String condition = null;
        Integer page = null;
        Integer perPage = null;
        Integer offset = null;
        api.comparisonShoppingPagesIdListingsGet(id, condition, page, perPage, offset);
        // TODO: test validations
    }

    /**
     * View reviews of a comparison shopping page
     *
     * View reviews of a comparison shopping page
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonShoppingPagesIdReviewsGetTest() throws ApiException {
        String id = null;
        api.comparisonShoppingPagesIdReviewsGet(id);
        // TODO: test validations
    }

}
