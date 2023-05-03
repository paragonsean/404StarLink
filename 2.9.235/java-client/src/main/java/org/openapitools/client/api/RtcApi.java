/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
 * 
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


import org.openapitools.client.model.Label;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RtcApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RtcApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RtcApi(ApiClient apiClient) {
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
     * Build call for getActiveSessions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of active RTCsessions was returned </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The authentication was not successful </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error and the operation could not be completed. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The server is currently unable to receive requests. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActiveSessionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rtc/sessions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getActiveSessionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getActiveSessionsCall(_callback);

    }

    /**
     * Gets a list of active sessions
     * Gets a list of active RTCsessions OauthScopes: CALLS
     * @return Label
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of active RTCsessions was returned </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The authentication was not successful </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error and the operation could not be completed. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The server is currently unable to receive requests. </td><td>  -  </td></tr>
     </table>
     */
    public Label getActiveSessions() throws ApiException {
        ApiResponse<Label> localVarResp = getActiveSessionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Gets a list of active sessions
     * Gets a list of active RTCsessions OauthScopes: CALLS
     * @return ApiResponse&lt;Label&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of active RTCsessions was returned </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The authentication was not successful </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error and the operation could not be completed. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The server is currently unable to receive requests. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Label> getActiveSessionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getActiveSessionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Label>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets a list of active sessions (asynchronously)
     * Gets a list of active RTCsessions OauthScopes: CALLS
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of active RTCsessions was returned </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The authentication was not successful </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error and the operation could not be completed. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The server is currently unable to receive requests. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActiveSessionsAsync(final ApiCallback<Label> _callback) throws ApiException {

        okhttp3.Call localVarCall = getActiveSessionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Label>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
