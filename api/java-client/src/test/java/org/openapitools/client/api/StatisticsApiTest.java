/*
 * Traccar
 * Open Source GPS Tracking Platform
 *
 * The version of the OpenAPI document: 5.6
 * Contact: support@traccar.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Statistics;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticsApi
 */
@Disabled
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    /**
     * Fetch server Statistics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void statisticsGetTest() throws ApiException {
        OffsetDateTime from = null;
        OffsetDateTime to = null;
        List<Statistics> response = api.statisticsGet(from, to);
        // TODO: test validations
    }

}
