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
import org.openapitools.client.model.Calendar;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarsApi
 */
@Disabled
public class CalendarsApiTest {

    private final CalendarsApi api = new CalendarsApi();

    /**
     * Fetch a list of Calendars
     *
     * Without params, it returns a list of Calendars the user has access to
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calendarsGetTest() throws ApiException {
        Boolean all = null;
        Integer userId = null;
        List<Calendar> response = api.calendarsGet(all, userId);
        // TODO: test validations
    }

    /**
     * Delete a Calendar
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calendarsIdDeleteTest() throws ApiException {
        Integer id = null;
        api.calendarsIdDelete(id);
        // TODO: test validations
    }

    /**
     * Update a Calendar
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calendarsIdPutTest() throws ApiException {
        Integer id = null;
        Calendar body = null;
        Calendar response = api.calendarsIdPut(id, body);
        // TODO: test validations
    }

    /**
     * Create a Calendar
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void calendarsPostTest() throws ApiException {
        Calendar body = null;
        Calendar response = api.calendarsPost(body);
        // TODO: test validations
    }

}
