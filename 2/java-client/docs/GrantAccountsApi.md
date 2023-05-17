# GrantAccountsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGrantAccountsId**](GrantAccountsApi.md#getGrantAccountsId) | **GET** /grantAccounts/{id} | Get a grant account |


<a id="getGrantAccountsId"></a>
# **getGrantAccountsId**
> CapitalGrantAccount getGrantAccountsId(id)

Get a grant account

Returns the details of the [grant account](https://docs.adyen.com/marketplaces-and-platforms/capital#grant-account).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GrantAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://balanceplatform-api-test.adyen.com/bcl/v2");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GrantAccountsApi apiInstance = new GrantAccountsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the grant account.
    try {
      CapitalGrantAccount result = apiInstance.getGrantAccountsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrantAccountsApi#getGrantAccountsId");
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
| **id** | **String**| The unique identifier of the grant account. | |

### Return type

[**CapitalGrantAccount**](CapitalGrantAccount.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - the request has succeeded. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

