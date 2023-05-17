/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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


import org.openapitools.client.model.BankAccountIdentificationValidationRequest;
import org.openapitools.client.model.RestServiceError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccountValidationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BankAccountValidationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BankAccountValidationApi(ApiClient apiClient) {
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
     * Build call for postValidateBankAccountIdentification
     * @param bankAccountIdentificationValidationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postValidateBankAccountIdentificationCall(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bankAccountIdentificationValidationRequest;

        // create path and map variables
        String localVarPath = "/validateBankAccountIdentification";

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
    private okhttp3.Call postValidateBankAccountIdentificationValidateBeforeCall(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest, final ApiCallback _callback) throws ApiException {
        return postValidateBankAccountIdentificationCall(bankAccountIdentificationValidationRequest, _callback);

    }

    /**
     * Validate a bank account
     * Validates bank account identification details. You can use this endpoint to validate bank account details before you [make a transfer](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers) or [create a transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments).
     * @param bankAccountIdentificationValidationRequest  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public Object postValidateBankAccountIdentification(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest) throws ApiException {
        ApiResponse<Object> localVarResp = postValidateBankAccountIdentificationWithHttpInfo(bankAccountIdentificationValidationRequest);
        return localVarResp.getData();
    }

    /**
     * Validate a bank account
     * Validates bank account identification details. You can use this endpoint to validate bank account details before you [make a transfer](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers) or [create a transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments).
     * @param bankAccountIdentificationValidationRequest  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> postValidateBankAccountIdentificationWithHttpInfo(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest) throws ApiException {
        okhttp3.Call localVarCall = postValidateBankAccountIdentificationValidateBeforeCall(bankAccountIdentificationValidationRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate a bank account (asynchronously)
     * Validates bank account identification details. You can use this endpoint to validate bank account details before you [make a transfer](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers) or [create a transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments).
     * @param bankAccountIdentificationValidationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postValidateBankAccountIdentificationAsync(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = postValidateBankAccountIdentificationValidateBeforeCall(bankAccountIdentificationValidationRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
