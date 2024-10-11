# AccountHoldersApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountHoldersId**](AccountHoldersApi.md#getAccountHoldersId) | **GET** /accountHolders/{id} | Get an account holder |
| [**getAccountHoldersIdBalanceAccounts**](AccountHoldersApi.md#getAccountHoldersIdBalanceAccounts) | **GET** /accountHolders/{id}/balanceAccounts | Get all balance accounts of an account holder |
| [**patchAccountHoldersId**](AccountHoldersApi.md#patchAccountHoldersId) | **PATCH** /accountHolders/{id} | Update an account holder |
| [**postAccountHolders**](AccountHoldersApi.md#postAccountHolders) | **POST** /accountHolders | Create an account holder |


<a id="getAccountHoldersId"></a>
# **getAccountHoldersId**
> AccountHolder getAccountHoldersId(id)

Get an account holder

Returns an account holder.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountHoldersApi;

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

    AccountHoldersApi apiInstance = new AccountHoldersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the account holder.
    try {
      AccountHolder result = apiInstance.getAccountHoldersId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountHoldersApi#getAccountHoldersId");
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
| **id** | **String**| The unique identifier of the account holder. | |

### Return type

[**AccountHolder**](AccountHolder.md)

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

<a id="getAccountHoldersIdBalanceAccounts"></a>
# **getAccountHoldersIdBalanceAccounts**
> PaginatedBalanceAccountsResponse getAccountHoldersIdBalanceAccounts(id, offset, limit)

Get all balance accounts of an account holder

Returns a paginated list of the balance accounts associated with an account holder. To fetch multiple pages, use the query parameters.   For example, to limit the page to 5 balance accounts and skip the first 10, use &#x60;/accountHolders/{id}/balanceAccounts?limit&#x3D;5&amp;offset&#x3D;10&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountHoldersApi;

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

    AccountHoldersApi apiInstance = new AccountHoldersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the account holder.
    Integer offset = 56; // Integer | The number of items that you want to skip.
    Integer limit = 56; // Integer | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
    try {
      PaginatedBalanceAccountsResponse result = apiInstance.getAccountHoldersIdBalanceAccounts(id, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountHoldersApi#getAccountHoldersIdBalanceAccounts");
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
| **id** | **String**| The unique identifier of the account holder. | |
| **offset** | **Integer**| The number of items that you want to skip. | [optional] |
| **limit** | **Integer**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional] |

### Return type

[**PaginatedBalanceAccountsResponse**](PaginatedBalanceAccountsResponse.md)

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

<a id="patchAccountHoldersId"></a>
# **patchAccountHoldersId**
> AccountHolder patchAccountHoldersId(id, accountHolder)

Update an account holder

Updates an account holder. When updating an account holder resource, if a parameter is not provided in the request, it is left unchanged.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountHoldersApi;

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

    AccountHoldersApi apiInstance = new AccountHoldersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the account holder.
    AccountHolder accountHolder = new AccountHolder(); // AccountHolder | 
    try {
      AccountHolder result = apiInstance.patchAccountHoldersId(id, accountHolder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountHoldersApi#patchAccountHoldersId");
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
| **id** | **String**| The unique identifier of the account holder. | |
| **accountHolder** | [**AccountHolder**](AccountHolder.md)|  | [optional] |

### Return type

[**AccountHolder**](AccountHolder.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="postAccountHolders"></a>
# **postAccountHolders**
> AccountHolder postAccountHolders(accountHolderInfo)

Create an account holder

Creates an account holder linked to a [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountHoldersApi;

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

    AccountHoldersApi apiInstance = new AccountHoldersApi(defaultClient);
    AccountHolderInfo accountHolderInfo = new AccountHolderInfo(); // AccountHolderInfo | 
    try {
      AccountHolder result = apiInstance.postAccountHolders(accountHolderInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountHoldersApi#postAccountHolders");
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
| **accountHolderInfo** | [**AccountHolderInfo**](AccountHolderInfo.md)|  | [optional] |

### Return type

[**AccountHolder**](AccountHolder.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

