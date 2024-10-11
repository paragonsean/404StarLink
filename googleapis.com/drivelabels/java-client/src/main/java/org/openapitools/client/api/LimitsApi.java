/*
 * Drive Labels API
 * An API for managing Drive Labels
 *
 * The version of the OpenAPI document: v2
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


import org.openapitools.client.model.GoogleAppsDriveLabelsV2LabelLimits;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LimitsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LimitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LimitsApi(ApiClient apiClient) {
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
     * Build call for drivelabelsLimitsGetLabel
     * @param $xgafv V1 error format. (optional)
     * @param accessToken OAuth access token. (optional)
     * @param alt Data format for response. (optional)
     * @param paramCallback JSONP (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
     * @param uploadProtocol Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). (optional)
     * @param uploadType Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). (optional)
     * @param name Required. Label revision resource name Must be: \&quot;limits/label\&quot; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drivelabelsLimitsGetLabelCall(String $xgafv, String accessToken, String alt, String paramCallback, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String uploadProtocol, String uploadType, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/limits/label";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if ($xgafv != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$.xgafv", $xgafv));
        }

        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (alt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alt", alt));
        }

        if (paramCallback != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("callback", paramCallback));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (key != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("key", key));
        }

        if (oauthToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("oauth_token", oauthToken));
        }

        if (prettyPrint != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("prettyPrint", prettyPrint));
        }

        if (quotaUser != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("quotaUser", quotaUser));
        }

        if (uploadProtocol != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("upload_protocol", uploadProtocol));
        }

        if (uploadType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("uploadType", uploadType));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call drivelabelsLimitsGetLabelValidateBeforeCall(String $xgafv, String accessToken, String alt, String paramCallback, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String uploadProtocol, String uploadType, String name, final ApiCallback _callback) throws ApiException {
        return drivelabelsLimitsGetLabelCall($xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, name, _callback);

    }

    /**
     * 
     * Get the constraints on the structure of a Label; such as, the maximum number of Fields allowed and maximum length of the label title.
     * @param $xgafv V1 error format. (optional)
     * @param accessToken OAuth access token. (optional)
     * @param alt Data format for response. (optional)
     * @param paramCallback JSONP (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
     * @param uploadProtocol Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). (optional)
     * @param uploadType Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). (optional)
     * @param name Required. Label revision resource name Must be: \&quot;limits/label\&quot; (optional)
     * @return GoogleAppsDriveLabelsV2LabelLimits
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public GoogleAppsDriveLabelsV2LabelLimits drivelabelsLimitsGetLabel(String $xgafv, String accessToken, String alt, String paramCallback, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String uploadProtocol, String uploadType, String name) throws ApiException {
        ApiResponse<GoogleAppsDriveLabelsV2LabelLimits> localVarResp = drivelabelsLimitsGetLabelWithHttpInfo($xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, name);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the constraints on the structure of a Label; such as, the maximum number of Fields allowed and maximum length of the label title.
     * @param $xgafv V1 error format. (optional)
     * @param accessToken OAuth access token. (optional)
     * @param alt Data format for response. (optional)
     * @param paramCallback JSONP (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
     * @param uploadProtocol Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). (optional)
     * @param uploadType Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). (optional)
     * @param name Required. Label revision resource name Must be: \&quot;limits/label\&quot; (optional)
     * @return ApiResponse&lt;GoogleAppsDriveLabelsV2LabelLimits&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GoogleAppsDriveLabelsV2LabelLimits> drivelabelsLimitsGetLabelWithHttpInfo(String $xgafv, String accessToken, String alt, String paramCallback, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String uploadProtocol, String uploadType, String name) throws ApiException {
        okhttp3.Call localVarCall = drivelabelsLimitsGetLabelValidateBeforeCall($xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, name, null);
        Type localVarReturnType = new TypeToken<GoogleAppsDriveLabelsV2LabelLimits>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the constraints on the structure of a Label; such as, the maximum number of Fields allowed and maximum length of the label title.
     * @param $xgafv V1 error format. (optional)
     * @param accessToken OAuth access token. (optional)
     * @param alt Data format for response. (optional)
     * @param paramCallback JSONP (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
     * @param uploadProtocol Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). (optional)
     * @param uploadType Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). (optional)
     * @param name Required. Label revision resource name Must be: \&quot;limits/label\&quot; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call drivelabelsLimitsGetLabelAsync(String $xgafv, String accessToken, String alt, String paramCallback, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String uploadProtocol, String uploadType, String name, final ApiCallback<GoogleAppsDriveLabelsV2LabelLimits> _callback) throws ApiException {

        okhttp3.Call localVarCall = drivelabelsLimitsGetLabelValidateBeforeCall($xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, name, _callback);
        Type localVarReturnType = new TypeToken<GoogleAppsDriveLabelsV2LabelLimits>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
