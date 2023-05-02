/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.4
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


import org.openapitools.client.model.AppPortalAccessIn;
import org.openapitools.client.model.AppPortalAccessOut;
import org.openapitools.client.model.ApplicationTokenExpireIn;
import org.openapitools.client.model.DashboardAccessOut;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.HttpErrorOut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
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
     * Build call for expireAllApiV1AuthAppAppIdExpireAllPost
     * @param appId  (required)
     * @param applicationTokenExpireIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call expireAllApiV1AuthAppAppIdExpireAllPostCall(String appId, ApplicationTokenExpireIn applicationTokenExpireIn, String idempotencyKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applicationTokenExpireIn;

        // create path and map variables
        String localVarPath = "/api/v1/auth/app/{app_id}/expire-all/"
            .replace("{" + "app_id" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("idempotency-key", localVarApiClient.parameterToString(idempotencyKey));
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call expireAllApiV1AuthAppAppIdExpireAllPostValidateBeforeCall(String appId, ApplicationTokenExpireIn applicationTokenExpireIn, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling expireAllApiV1AuthAppAppIdExpireAllPost(Async)");
        }

        // verify the required parameter 'applicationTokenExpireIn' is set
        if (applicationTokenExpireIn == null) {
            throw new ApiException("Missing the required parameter 'applicationTokenExpireIn' when calling expireAllApiV1AuthAppAppIdExpireAllPost(Async)");
        }

        return expireAllApiV1AuthAppAppIdExpireAllPostCall(appId, applicationTokenExpireIn, idempotencyKey, _callback);

    }

    /**
     * Expire All
     * Expire all of the tokens associated with a specific Application
     * @param appId  (required)
     * @param applicationTokenExpireIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public void expireAllApiV1AuthAppAppIdExpireAllPost(String appId, ApplicationTokenExpireIn applicationTokenExpireIn, String idempotencyKey) throws ApiException {
        expireAllApiV1AuthAppAppIdExpireAllPostWithHttpInfo(appId, applicationTokenExpireIn, idempotencyKey);
    }

    /**
     * Expire All
     * Expire all of the tokens associated with a specific Application
     * @param appId  (required)
     * @param applicationTokenExpireIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> expireAllApiV1AuthAppAppIdExpireAllPostWithHttpInfo(String appId, ApplicationTokenExpireIn applicationTokenExpireIn, String idempotencyKey) throws ApiException {
        okhttp3.Call localVarCall = expireAllApiV1AuthAppAppIdExpireAllPostValidateBeforeCall(appId, applicationTokenExpireIn, idempotencyKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Expire All (asynchronously)
     * Expire all of the tokens associated with a specific Application
     * @param appId  (required)
     * @param applicationTokenExpireIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call expireAllApiV1AuthAppAppIdExpireAllPostAsync(String appId, ApplicationTokenExpireIn applicationTokenExpireIn, String idempotencyKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = expireAllApiV1AuthAppAppIdExpireAllPostValidateBeforeCall(appId, applicationTokenExpireIn, idempotencyKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAppPortalAccessApiV1AuthAppPortalAccessAppIdPost
     * @param appId  (required)
     * @param appPortalAccessIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostCall(String appId, AppPortalAccessIn appPortalAccessIn, String idempotencyKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = appPortalAccessIn;

        // create path and map variables
        String localVarPath = "/api/v1/auth/app-portal-access/{app_id}/"
            .replace("{" + "app_id" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("idempotency-key", localVarApiClient.parameterToString(idempotencyKey));
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostValidateBeforeCall(String appId, AppPortalAccessIn appPortalAccessIn, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppPortalAccessApiV1AuthAppPortalAccessAppIdPost(Async)");
        }

        // verify the required parameter 'appPortalAccessIn' is set
        if (appPortalAccessIn == null) {
            throw new ApiException("Missing the required parameter 'appPortalAccessIn' when calling getAppPortalAccessApiV1AuthAppPortalAccessAppIdPost(Async)");
        }

        return getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostCall(appId, appPortalAccessIn, idempotencyKey, _callback);

    }

    /**
     * Get Consumer App Portal Access
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param appPortalAccessIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return AppPortalAccessOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public AppPortalAccessOut getAppPortalAccessApiV1AuthAppPortalAccessAppIdPost(String appId, AppPortalAccessIn appPortalAccessIn, String idempotencyKey) throws ApiException {
        ApiResponse<AppPortalAccessOut> localVarResp = getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostWithHttpInfo(appId, appPortalAccessIn, idempotencyKey);
        return localVarResp.getData();
    }

    /**
     * Get Consumer App Portal Access
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param appPortalAccessIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse&lt;AppPortalAccessOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppPortalAccessOut> getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostWithHttpInfo(String appId, AppPortalAccessIn appPortalAccessIn, String idempotencyKey) throws ApiException {
        okhttp3.Call localVarCall = getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostValidateBeforeCall(appId, appPortalAccessIn, idempotencyKey, null);
        Type localVarReturnType = new TypeToken<AppPortalAccessOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Consumer App Portal Access (asynchronously)
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param appPortalAccessIn  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostAsync(String appId, AppPortalAccessIn appPortalAccessIn, String idempotencyKey, final ApiCallback<AppPortalAccessOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAppPortalAccessApiV1AuthAppPortalAccessAppIdPostValidateBeforeCall(appId, appPortalAccessIn, idempotencyKey, _callback);
        Type localVarReturnType = new TypeToken<AppPortalAccessOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDashboardAccessApiV1AuthDashboardAccessAppIdPost
     * @param appId  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getDashboardAccessApiV1AuthDashboardAccessAppIdPostCall(String appId, String idempotencyKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/auth/dashboard-access/{app_id}/"
            .replace("{" + "app_id" + "}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("idempotency-key", localVarApiClient.parameterToString(idempotencyKey));
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDashboardAccessApiV1AuthDashboardAccessAppIdPostValidateBeforeCall(String appId, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getDashboardAccessApiV1AuthDashboardAccessAppIdPost(Async)");
        }

        return getDashboardAccessApiV1AuthDashboardAccessAppIdPostCall(appId, idempotencyKey, _callback);

    }

    /**
     * Get Dashboard Access
     * DEPRECATED: Please use &#x60;app-portal-access&#x60; instead.  Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return DashboardAccessOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public DashboardAccessOut getDashboardAccessApiV1AuthDashboardAccessAppIdPost(String appId, String idempotencyKey) throws ApiException {
        ApiResponse<DashboardAccessOut> localVarResp = getDashboardAccessApiV1AuthDashboardAccessAppIdPostWithHttpInfo(appId, idempotencyKey);
        return localVarResp.getData();
    }

    /**
     * Get Dashboard Access
     * DEPRECATED: Please use &#x60;app-portal-access&#x60; instead.  Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse&lt;DashboardAccessOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<DashboardAccessOut> getDashboardAccessApiV1AuthDashboardAccessAppIdPostWithHttpInfo(String appId, String idempotencyKey) throws ApiException {
        okhttp3.Call localVarCall = getDashboardAccessApiV1AuthDashboardAccessAppIdPostValidateBeforeCall(appId, idempotencyKey, null);
        Type localVarReturnType = new TypeToken<DashboardAccessOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Dashboard Access (asynchronously)
     * DEPRECATED: Please use &#x60;app-portal-access&#x60; instead.  Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     * @param appId  (required)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getDashboardAccessApiV1AuthDashboardAccessAppIdPostAsync(String appId, String idempotencyKey, final ApiCallback<DashboardAccessOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDashboardAccessApiV1AuthDashboardAccessAppIdPostValidateBeforeCall(appId, idempotencyKey, _callback);
        Type localVarReturnType = new TypeToken<DashboardAccessOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for logoutApiV1AuthLogoutPost
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call logoutApiV1AuthLogoutPostCall(String idempotencyKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/auth/logout/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("idempotency-key", localVarApiClient.parameterToString(idempotencyKey));
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call logoutApiV1AuthLogoutPostValidateBeforeCall(String idempotencyKey, final ApiCallback _callback) throws ApiException {
        return logoutApiV1AuthLogoutPostCall(idempotencyKey, _callback);

    }

    /**
     * Logout
     * Logout an app token.  Trying to log out other tokens will fail.
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public void logoutApiV1AuthLogoutPost(String idempotencyKey) throws ApiException {
        logoutApiV1AuthLogoutPostWithHttpInfo(idempotencyKey);
    }

    /**
     * Logout
     * Logout an app token.  Trying to log out other tokens will fail.
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> logoutApiV1AuthLogoutPostWithHttpInfo(String idempotencyKey) throws ApiException {
        okhttp3.Call localVarCall = logoutApiV1AuthLogoutPostValidateBeforeCall(idempotencyKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Logout (asynchronously)
     * Logout an app token.  Trying to log out other tokens will fail.
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call logoutApiV1AuthLogoutPostAsync(String idempotencyKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = logoutApiV1AuthLogoutPostValidateBeforeCall(idempotencyKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
