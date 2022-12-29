/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolsDeleteRequest;
import org.openapitools.client.model.PoolsListResponse;
import org.openapitools.client.model.Template;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoolsApi
 */
@Disabled
public class PoolsApiTest {

    private final PoolsApi api = new PoolsApi();

    /**
     * Deletes a replica pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsDeleteTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String poolName = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        PoolsDeleteRequest poolsDeleteRequest = null;
        api.replicapoolPoolsDelete(projectName, zone, poolName, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, poolsDeleteRequest);
        // TODO: test validations
    }

    /**
     * Gets information about a single replica pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsGetTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String poolName = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        Pool response = api.replicapoolPoolsGet(projectName, zone, poolName, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
        // TODO: test validations
    }

    /**
     * Inserts a new replica pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsInsertTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        Pool pool = null;
        Pool response = api.replicapoolPoolsInsert(projectName, zone, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, pool);
        // TODO: test validations
    }

    /**
     * List all replica pools.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsListTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        Integer maxResults = null;
        String pageToken = null;
        PoolsListResponse response = api.replicapoolPoolsList(projectName, zone, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, pageToken);
        // TODO: test validations
    }

    /**
     * Resize a pool. This is an asynchronous operation, and multiple overlapping resize requests can be made. Replica Pools will use the information from the last resize request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsResizeTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String poolName = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        Integer numReplicas = null;
        Pool response = api.replicapoolPoolsResize(projectName, zone, poolName, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, numReplicas);
        // TODO: test validations
    }

    /**
     * Update the template used by the pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replicapoolPoolsUpdatetemplateTest() throws ApiException {
        String projectName = null;
        String zone = null;
        String poolName = null;
        String alt = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String userIp = null;
        Template template = null;
        api.replicapoolPoolsUpdatetemplate(projectName, zone, poolName, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, template);
        // TODO: test validations
    }

}
