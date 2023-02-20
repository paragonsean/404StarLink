/*
 * National Institute of Electronics and Information Technology
 * NIELIT, under Ministry of Electronics & IT (http://www.nielit.gov.in/) provides education and training in the area of Information, Electronics & Communication Technology. Certificates issued by NIELIT are made available in students' DigiLocker accounts.
 *
 * The version of the OpenAPI document: 3.0.0
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


import org.openapitools.client.model.Skcer400Response;
import org.openapitools.client.model.Skcer401Response;
import org.openapitools.client.model.Skcer404Response;
import org.openapitools.client.model.Skcer500Response;
import org.openapitools.client.model.Skcer502Response;
import org.openapitools.client.model.Skcer503Response;
import org.openapitools.client.model.Skcer504Response;
import org.openapitools.client.model.SkcerRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApisApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApisApi(ApiClient apiClient) {
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
     * Build call for skcer
     * @param skcerRequest Request format (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The certificate data in response body in PDF, XML or JSON format as requested in format parameter. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No record found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call skcerCall(SkcerRequest skcerRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = skcerRequest;

        // create path and map variables
        String localVarPath = "/skcer/certificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf",
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

        String[] localVarAuthNames = new String[] { "clientId", "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call skcerValidateBeforeCall(SkcerRequest skcerRequest, final ApiCallback _callback) throws ApiException {
        return skcerCall(skcerRequest, _callback);

    }

    /**
     * Skill Certificate
     * API to verify Skill Certificate.
     * @param skcerRequest Request format (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The certificate data in response body in PDF, XML or JSON format as requested in format parameter. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No record found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     */
    public void skcer(SkcerRequest skcerRequest) throws ApiException {
        skcerWithHttpInfo(skcerRequest);
    }

    /**
     * Skill Certificate
     * API to verify Skill Certificate.
     * @param skcerRequest Request format (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The certificate data in response body in PDF, XML or JSON format as requested in format parameter. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No record found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> skcerWithHttpInfo(SkcerRequest skcerRequest) throws ApiException {
        okhttp3.Call localVarCall = skcerValidateBeforeCall(skcerRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Skill Certificate (asynchronously)
     * API to verify Skill Certificate.
     * @param skcerRequest Request format (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The certificate data in response body in PDF, XML or JSON format as requested in format parameter. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No record found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad gateway </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call skcerAsync(SkcerRequest skcerRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = skcerValidateBeforeCall(skcerRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
