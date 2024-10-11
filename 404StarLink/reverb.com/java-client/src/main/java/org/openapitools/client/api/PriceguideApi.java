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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceguideApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PriceguideApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PriceguideApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for priceguideIdTransactionsSummaryGet
     * @param id  (required)
     * @param numberOfMonths  (optional, default to 3)
     * @param condition  (optional, default to used)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call priceguideIdTransactionsSummaryGetCall(String id, Integer numberOfMonths, String condition, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/priceguide/{id}/transactions/summary"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (numberOfMonths != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("number_of_months", numberOfMonths));
        }

        if (condition != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("condition", condition));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call priceguideIdTransactionsSummaryGetValidateBeforeCall(String id, Integer numberOfMonths, String condition, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling priceguideIdTransactionsSummaryGet(Async)");
        }

        return priceguideIdTransactionsSummaryGetCall(id, numberOfMonths, condition, _callback);

    }

    /**
     * Get a summary of transactions for a given price guide
     * Get a summary of transactions for a given price guide
     * @param id  (required)
     * @param numberOfMonths  (optional, default to 3)
     * @param condition  (optional, default to used)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void priceguideIdTransactionsSummaryGet(String id, Integer numberOfMonths, String condition) throws ApiException {
        priceguideIdTransactionsSummaryGetWithHttpInfo(id, numberOfMonths, condition);
    }

    /**
     * Get a summary of transactions for a given price guide
     * Get a summary of transactions for a given price guide
     * @param id  (required)
     * @param numberOfMonths  (optional, default to 3)
     * @param condition  (optional, default to used)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> priceguideIdTransactionsSummaryGetWithHttpInfo(String id, Integer numberOfMonths, String condition) throws ApiException {
        okhttp3.Call localVarCall = priceguideIdTransactionsSummaryGetValidateBeforeCall(id, numberOfMonths, condition, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Get a summary of transactions for a given price guide (asynchronously)
     * Get a summary of transactions for a given price guide
     * @param id  (required)
     * @param numberOfMonths  (optional, default to 3)
     * @param condition  (optional, default to used)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call priceguideIdTransactionsSummaryGetAsync(String id, Integer numberOfMonths, String condition, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = priceguideIdTransactionsSummaryGetValidateBeforeCall(id, numberOfMonths, condition, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
