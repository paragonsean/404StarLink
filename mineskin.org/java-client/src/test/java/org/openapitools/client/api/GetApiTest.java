/*
 * MineSkin API
 * Client implementations:  Java: https://github.com/InventivetalentDev/MineskinClient NodeJS: https://github.com/InventivetalentDev/mineskin-client  Examples: https://github.com/MineSkin/examples 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@mineskin.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.GetDelayGet200Response;
import org.openapitools.client.model.GetListPageGet200Response;
import org.openapitools.client.model.SkinInfo;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetApi
 */
@Disabled
public class GetApiTest {

    private final GetApi api = new GetApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDelayGetTest() throws ApiException {
        String userAgent = null;
        GetDelayGet200Response response = api.getDelayGet(userAgent);
        // TODO: test validations
    }

    /**
     * Deprecated. Use /get/uuid instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIdIdGetTest() throws ApiException {
        BigDecimal id = null;
        String userAgent = null;
        SkinInfo response = api.getIdIdGet(id, userAgent);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListPageGetTest() throws ApiException {
        BigDecimal page = null;
        String userAgent = null;
        GetListPageGet200Response response = api.getListPageGet(page, userAgent);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUuidUuidGetTest() throws ApiException {
        UUID uuid = null;
        String userAgent = null;
        SkinInfo response = api.getUuidUuidGet(uuid, userAgent);
        // TODO: test validations
    }

}
