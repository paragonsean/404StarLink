# BillingAccountsApi

All URIs are relative to *https://cloudbilling.googleapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudbillingBillingAccountsEstimateCostScenario**](BillingAccountsApi.md#cloudbillingBillingAccountsEstimateCostScenario) | **POST** /v1beta/{billingAccount}:estimateCostScenario |  |


<a id="cloudbillingBillingAccountsEstimateCostScenario"></a>
# **cloudbillingBillingAccountsEstimateCostScenario**
> EstimateCostScenarioForBillingAccountResponse cloudbillingBillingAccountsEstimateCostScenario(billingAccount, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, estimateCostScenarioForBillingAccountRequest)



Use custom pricing in the estimate, using a &#x60;CostScenario&#x60; with a defined &#x60;billingAccount&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudbilling.googleapis.com");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BillingAccountsApi apiInstance = new BillingAccountsApi(defaultClient);
    String billingAccount = "billingAccount_example"; // String | Resource name of the billing account for the cost estimate. The resource name has the form `billingAccounts/{billing_acount_id}`. For example, `billingAccounts/012345-567890-ABCDEF` is the resource name for billing account `012345-567890-ABCDEF`. Must be specified.
    String $xgafv = "1"; // String | V1 error format.
    String accessToken = "accessToken_example"; // String | OAuth access token.
    String alt = "json"; // String | Data format for response.
    String paramCallback = "paramCallback_example"; // String | JSONP
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    String uploadProtocol = "uploadProtocol_example"; // String | Upload protocol for media (e.g. \"raw\", \"multipart\").
    String uploadType = "uploadType_example"; // String | Legacy upload protocol for media (e.g. \"media\", \"multipart\").
    EstimateCostScenarioForBillingAccountRequest estimateCostScenarioForBillingAccountRequest = new EstimateCostScenarioForBillingAccountRequest(); // EstimateCostScenarioForBillingAccountRequest | 
    try {
      EstimateCostScenarioForBillingAccountResponse result = apiInstance.cloudbillingBillingAccountsEstimateCostScenario(billingAccount, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, estimateCostScenarioForBillingAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingAccountsApi#cloudbillingBillingAccountsEstimateCostScenario");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **billingAccount** | **String**| Resource name of the billing account for the cost estimate. The resource name has the form &#x60;billingAccounts/{billing_acount_id}&#x60;. For example, &#x60;billingAccounts/012345-567890-ABCDEF&#x60; is the resource name for billing account &#x60;012345-567890-ABCDEF&#x60;. Must be specified. | |
| **$xgafv** | **String**| V1 error format. | [optional] [enum: 1, 2] |
| **accessToken** | **String**| OAuth access token. | [optional] |
| **alt** | **String**| Data format for response. | [optional] [enum: json, media, proto] |
| **paramCallback** | **String**| JSONP | [optional] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] |
| **uploadProtocol** | **String**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] |
| **uploadType** | **String**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] |
| **estimateCostScenarioForBillingAccountRequest** | [**EstimateCostScenarioForBillingAccountRequest**](EstimateCostScenarioForBillingAccountRequest.md)|  | [optional] |

### Return type

[**EstimateCostScenarioForBillingAccountResponse**](EstimateCostScenarioForBillingAccountResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

