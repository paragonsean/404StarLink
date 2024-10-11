/*
 * QuickChart API
 * An API to generate charts and QR codes using QuickChart services.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ChartPostRequest;
import java.io.File;
import org.openapitools.client.model.QrPostRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Generate a chart (GET)
     *
     * Generate a chart based on the provided parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chartGetTest() throws ApiException {
        String chart = null;
        Integer width = null;
        Integer height = null;
        String format = null;
        String backgroundColor = null;
        File response = api.chartGet(chart, width, height, format, backgroundColor);
        // TODO: test validations
    }

    /**
     * Generate a chart (POST)
     *
     * Generate a chart based on the provided configuration in the request body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chartPostTest() throws ApiException {
        ChartPostRequest chartPostRequest = null;
        File response = api.chartPost(chartPostRequest);
        // TODO: test validations
    }

    /**
     * Generate a QR code (GET)
     *
     * Generate a QR code based on the provided parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qrGetTest() throws ApiException {
        String text = null;
        Integer width = null;
        Integer height = null;
        String format = null;
        Integer margin = null;
        File response = api.qrGet(text, width, height, format, margin);
        // TODO: test validations
    }

    /**
     * Generate a QR code (POST)
     *
     * Generate a QR code based on the provided configuration in the request body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qrPostTest() throws ApiException {
        QrPostRequest qrPostRequest = null;
        File response = api.qrPost(qrPostRequest);
        // TODO: test validations
    }

}
