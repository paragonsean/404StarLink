/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
 *
 * The version of the OpenAPI document: v3
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


import org.openapitools.client.model.AccountTicket;
import org.openapitools.client.model.AccountTreeRequest;
import org.openapitools.client.model.AccountTreeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvisioningApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProvisioningApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvisioningApi(ApiClient apiClient) {
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
     * Build call for analyticsProvisioningCreateAccountTicket
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTicket  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyticsProvisioningCreateAccountTicketCall(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTicket accountTicket, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accountTicket;

        // create path and map variables
        String localVarPath = "/provisioning/createAccountTicket";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (alt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alt", alt));
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

        if (userIp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userIp", userIp));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Oauth2c", "Oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call analyticsProvisioningCreateAccountTicketValidateBeforeCall(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTicket accountTicket, final ApiCallback _callback) throws ApiException {
        return analyticsProvisioningCreateAccountTicketCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTicket, _callback);

    }

    /**
     * 
     * Creates an account ticket.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTicket  (optional)
     * @return AccountTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public AccountTicket analyticsProvisioningCreateAccountTicket(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTicket accountTicket) throws ApiException {
        ApiResponse<AccountTicket> localVarResp = analyticsProvisioningCreateAccountTicketWithHttpInfo(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTicket);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates an account ticket.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTicket  (optional)
     * @return ApiResponse&lt;AccountTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountTicket> analyticsProvisioningCreateAccountTicketWithHttpInfo(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTicket accountTicket) throws ApiException {
        okhttp3.Call localVarCall = analyticsProvisioningCreateAccountTicketValidateBeforeCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTicket, null);
        Type localVarReturnType = new TypeToken<AccountTicket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates an account ticket.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTicket  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyticsProvisioningCreateAccountTicketAsync(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTicket accountTicket, final ApiCallback<AccountTicket> _callback) throws ApiException {

        okhttp3.Call localVarCall = analyticsProvisioningCreateAccountTicketValidateBeforeCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTicket, _callback);
        Type localVarReturnType = new TypeToken<AccountTicket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for analyticsProvisioningCreateAccountTree
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTreeRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyticsProvisioningCreateAccountTreeCall(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTreeRequest accountTreeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accountTreeRequest;

        // create path and map variables
        String localVarPath = "/provisioning/createAccountTree";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (alt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alt", alt));
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

        if (userIp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userIp", userIp));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Oauth2c", "Oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call analyticsProvisioningCreateAccountTreeValidateBeforeCall(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTreeRequest accountTreeRequest, final ApiCallback _callback) throws ApiException {
        return analyticsProvisioningCreateAccountTreeCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTreeRequest, _callback);

    }

    /**
     * 
     * Provision account.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTreeRequest  (optional)
     * @return AccountTreeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public AccountTreeResponse analyticsProvisioningCreateAccountTree(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTreeRequest accountTreeRequest) throws ApiException {
        ApiResponse<AccountTreeResponse> localVarResp = analyticsProvisioningCreateAccountTreeWithHttpInfo(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTreeRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Provision account.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTreeRequest  (optional)
     * @return ApiResponse&lt;AccountTreeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountTreeResponse> analyticsProvisioningCreateAccountTreeWithHttpInfo(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTreeRequest accountTreeRequest) throws ApiException {
        okhttp3.Call localVarCall = analyticsProvisioningCreateAccountTreeValidateBeforeCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTreeRequest, null);
        Type localVarReturnType = new TypeToken<AccountTreeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Provision account.
     * @param alt Data format for the response. (optional)
     * @param fields Selector specifying which fields to include in a partial response. (optional)
     * @param key API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
     * @param oauthToken OAuth 2.0 token for the current user. (optional)
     * @param prettyPrint Returns response with indentations and line breaks. (optional)
     * @param quotaUser An opaque string that represents a user for quota purposes. Must not exceed 40 characters. (optional)
     * @param userIp Deprecated. Please use quotaUser instead. (optional)
     * @param accountTreeRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyticsProvisioningCreateAccountTreeAsync(String alt, String fields, String key, String oauthToken, Boolean prettyPrint, String quotaUser, String userIp, AccountTreeRequest accountTreeRequest, final ApiCallback<AccountTreeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = analyticsProvisioningCreateAccountTreeValidateBeforeCall(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, accountTreeRequest, _callback);
        Type localVarReturnType = new TypeToken<AccountTreeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
