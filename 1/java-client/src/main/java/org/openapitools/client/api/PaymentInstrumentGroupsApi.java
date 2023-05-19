/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v1/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v1`.
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
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


import org.openapitools.client.model.PaymentInstrumentGroup;
import org.openapitools.client.model.PaymentInstrumentGroupInfo;
import org.openapitools.client.model.RestServiceError;
import org.openapitools.client.model.TransactionRulesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentInstrumentGroupsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentInstrumentGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentInstrumentGroupsApi(ApiClient apiClient) {
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
     * Build call for getPaymentInstrumentGroupsId
     * @param id The unique identifier of the payment instrument group. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentInstrumentGroupsIdCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/paymentInstrumentGroups/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentInstrumentGroupsIdValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPaymentInstrumentGroupsId(Async)");
        }

        return getPaymentInstrumentGroupsIdCall(id, _callback);

    }

    /**
     * Get a payment instrument group
     * Returns the details of a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @return PaymentInstrumentGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentInstrumentGroup getPaymentInstrumentGroupsId(String id) throws ApiException {
        ApiResponse<PaymentInstrumentGroup> localVarResp = getPaymentInstrumentGroupsIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a payment instrument group
     * Returns the details of a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @return ApiResponse&lt;PaymentInstrumentGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentInstrumentGroup> getPaymentInstrumentGroupsIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getPaymentInstrumentGroupsIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<PaymentInstrumentGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a payment instrument group (asynchronously)
     * Returns the details of a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentInstrumentGroupsIdAsync(String id, final ApiCallback<PaymentInstrumentGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentInstrumentGroupsIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrumentGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPaymentInstrumentGroupsIdTransactionRules
     * @param id The unique identifier of the payment instrument group. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentInstrumentGroupsIdTransactionRulesCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/paymentInstrumentGroups/{id}/transactionRules"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentInstrumentGroupsIdTransactionRulesValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPaymentInstrumentGroupsIdTransactionRules(Async)");
        }

        return getPaymentInstrumentGroupsIdTransactionRulesCall(id, _callback);

    }

    /**
     * Get all transaction rules for a payment instrument group
     * Returns a list of all the transaction rules associated with a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @return TransactionRulesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public TransactionRulesResponse getPaymentInstrumentGroupsIdTransactionRules(String id) throws ApiException {
        ApiResponse<TransactionRulesResponse> localVarResp = getPaymentInstrumentGroupsIdTransactionRulesWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get all transaction rules for a payment instrument group
     * Returns a list of all the transaction rules associated with a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @return ApiResponse&lt;TransactionRulesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionRulesResponse> getPaymentInstrumentGroupsIdTransactionRulesWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getPaymentInstrumentGroupsIdTransactionRulesValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<TransactionRulesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all transaction rules for a payment instrument group (asynchronously)
     * Returns a list of all the transaction rules associated with a payment instrument group.
     * @param id The unique identifier of the payment instrument group. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentInstrumentGroupsIdTransactionRulesAsync(String id, final ApiCallback<TransactionRulesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentInstrumentGroupsIdTransactionRulesValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<TransactionRulesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postPaymentInstrumentGroups
     * @param paymentInstrumentGroupInfo  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPaymentInstrumentGroupsCall(PaymentInstrumentGroupInfo paymentInstrumentGroupInfo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentInstrumentGroupInfo;

        // create path and map variables
        String localVarPath = "/paymentInstrumentGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postPaymentInstrumentGroupsValidateBeforeCall(PaymentInstrumentGroupInfo paymentInstrumentGroupInfo, final ApiCallback _callback) throws ApiException {
        return postPaymentInstrumentGroupsCall(paymentInstrumentGroupInfo, _callback);

    }

    /**
     * Create a payment instrument group
     * Creates a payment instrument group to associate and group payment instrument resources together. You can apply a transaction rule to a payment instrument group.
     * @param paymentInstrumentGroupInfo  (optional)
     * @return PaymentInstrumentGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentInstrumentGroup postPaymentInstrumentGroups(PaymentInstrumentGroupInfo paymentInstrumentGroupInfo) throws ApiException {
        ApiResponse<PaymentInstrumentGroup> localVarResp = postPaymentInstrumentGroupsWithHttpInfo(paymentInstrumentGroupInfo);
        return localVarResp.getData();
    }

    /**
     * Create a payment instrument group
     * Creates a payment instrument group to associate and group payment instrument resources together. You can apply a transaction rule to a payment instrument group.
     * @param paymentInstrumentGroupInfo  (optional)
     * @return ApiResponse&lt;PaymentInstrumentGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentInstrumentGroup> postPaymentInstrumentGroupsWithHttpInfo(PaymentInstrumentGroupInfo paymentInstrumentGroupInfo) throws ApiException {
        okhttp3.Call localVarCall = postPaymentInstrumentGroupsValidateBeforeCall(paymentInstrumentGroupInfo, null);
        Type localVarReturnType = new TypeToken<PaymentInstrumentGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a payment instrument group (asynchronously)
     * Creates a payment instrument group to associate and group payment instrument resources together. You can apply a transaction rule to a payment instrument group.
     * @param paymentInstrumentGroupInfo  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPaymentInstrumentGroupsAsync(PaymentInstrumentGroupInfo paymentInstrumentGroupInfo, final ApiCallback<PaymentInstrumentGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = postPaymentInstrumentGroupsValidateBeforeCall(paymentInstrumentGroupInfo, _callback);
        Type localVarReturnType = new TypeToken<PaymentInstrumentGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
