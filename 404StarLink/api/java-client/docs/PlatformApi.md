# PlatformApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalancePlatformsId**](PlatformApi.md#getBalancePlatformsId) | **GET** /balancePlatforms/{id} | Get a balance platform |
| [**getBalancePlatformsIdAccountHolders**](PlatformApi.md#getBalancePlatformsIdAccountHolders) | **GET** /balancePlatforms/{id}/accountHolders | Get all account holders under a balance platform |


<a id="getBalancePlatformsId"></a>
# **getBalancePlatformsId**
> BalancePlatform getBalancePlatformsId(id)

Get a balance platform

Returns a balance platform.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://balanceplatform-api-test.adyen.com/bcl/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PlatformApi apiInstance = new PlatformApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the balance platform.
    try {
      BalancePlatform result = apiInstance.getBalancePlatformsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformApi#getBalancePlatformsId");
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
| **id** | **String**| The unique identifier of the balance platform. | |

### Return type

[**BalancePlatform**](BalancePlatform.md)

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

<a id="getBalancePlatformsIdAccountHolders"></a>
# **getBalancePlatformsIdAccountHolders**
> PaginatedAccountHoldersResponse getBalancePlatformsIdAccountHolders(id, offset, limit)

Get all account holders under a balance platform

Returns a paginated list of all the account holders that belong to the balance platform. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 account holders and to skip the first 20, use &#x60;/balancePlatforms/{id}/accountHolders?limit&#x3D;5&amp;offset&#x3D;20&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://balanceplatform-api-test.adyen.com/bcl/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PlatformApi apiInstance = new PlatformApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the balance platform.
    Integer offset = 56; // Integer | The number of items that you want to skip.
    Integer limit = 56; // Integer | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
    try {
      PaginatedAccountHoldersResponse result = apiInstance.getBalancePlatformsIdAccountHolders(id, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformApi#getBalancePlatformsIdAccountHolders");
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
| **id** | **String**| The unique identifier of the balance platform. | |
| **offset** | **Integer**| The number of items that you want to skip. | [optional] |
| **limit** | **Integer**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional] |

### Return type

[**PaginatedAccountHoldersResponse**](PaginatedAccountHoldersResponse.md)

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

