# BalanceAccountsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#deleteBalanceAccountsBalanceAccountIdSweepsSweepId) | **DELETE** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Delete a sweep |
| [**getBalanceAccountsBalanceAccountIdSweeps**](BalanceAccountsApi.md#getBalanceAccountsBalanceAccountIdSweeps) | **GET** /balanceAccounts/{balanceAccountId}/sweeps | Get all sweeps for a balance account |
| [**getBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#getBalanceAccountsBalanceAccountIdSweepsSweepId) | **GET** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Get a sweep |
| [**getBalanceAccountsId**](BalanceAccountsApi.md#getBalanceAccountsId) | **GET** /balanceAccounts/{id} | Get a balance account |
| [**getBalanceAccountsIdPaymentInstruments**](BalanceAccountsApi.md#getBalanceAccountsIdPaymentInstruments) | **GET** /balanceAccounts/{id}/paymentInstruments | Get all payment instruments for a balance account |
| [**patchBalanceAccountsBalanceAccountIdSweepsSweepId**](BalanceAccountsApi.md#patchBalanceAccountsBalanceAccountIdSweepsSweepId) | **PATCH** /balanceAccounts/{balanceAccountId}/sweeps/{sweepId} | Update a sweep |
| [**patchBalanceAccountsId**](BalanceAccountsApi.md#patchBalanceAccountsId) | **PATCH** /balanceAccounts/{id} | Update a balance account |
| [**postBalanceAccounts**](BalanceAccountsApi.md#postBalanceAccounts) | **POST** /balanceAccounts | Create a balance account |
| [**postBalanceAccountsBalanceAccountIdSweeps**](BalanceAccountsApi.md#postBalanceAccountsBalanceAccountIdSweeps) | **POST** /balanceAccounts/{balanceAccountId}/sweeps | Create a sweep |


<a id="deleteBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **deleteBalanceAccountsBalanceAccountIdSweepsSweepId**
> deleteBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)

Delete a sweep

Deletes a sweep for a balance account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String balanceAccountId = "balanceAccountId_example"; // String | The unique identifier of the balance account.
    String sweepId = "sweepId_example"; // String | The unique identifier of the sweep.
    try {
      apiInstance.deleteBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#deleteBalanceAccountsBalanceAccountIdSweepsSweepId");
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
| **balanceAccountId** | **String**| The unique identifier of the balance account. | |
| **sweepId** | **String**| The unique identifier of the sweep. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

<a id="getBalanceAccountsBalanceAccountIdSweeps"></a>
# **getBalanceAccountsBalanceAccountIdSweeps**
> BalanceSweepConfigurationsResponse getBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, offset, limit)

Get all sweeps for a balance account

Returns a list of the sweeps configured for a balance account.  To fetch multiple pages, use the query parameters. For example, to limit the page to 5 sweeps and to skip the first 10, use &#x60;/balanceAccounts/{balanceAccountId}/sweeps?limit&#x3D;5&amp;offset&#x3D;10&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String balanceAccountId = "balanceAccountId_example"; // String | The unique identifier of the balance account.
    Integer offset = 56; // Integer | The number of items that you want to skip.
    Integer limit = 56; // Integer | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
    try {
      BalanceSweepConfigurationsResponse result = apiInstance.getBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweeps");
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
| **balanceAccountId** | **String**| The unique identifier of the balance account. | |
| **offset** | **Integer**| The number of items that you want to skip. | [optional] |
| **limit** | **Integer**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional] |

### Return type

[**BalanceSweepConfigurationsResponse**](BalanceSweepConfigurationsResponse.md)

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

<a id="getBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **getBalanceAccountsBalanceAccountIdSweepsSweepId**
> SweepConfigurationV2 getBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId)

Get a sweep

Returns a sweep.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String balanceAccountId = "balanceAccountId_example"; // String | The unique identifier of the balance account.
    String sweepId = "sweepId_example"; // String | The unique identifier of the sweep.
    try {
      SweepConfigurationV2 result = apiInstance.getBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#getBalanceAccountsBalanceAccountIdSweepsSweepId");
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
| **balanceAccountId** | **String**| The unique identifier of the balance account. | |
| **sweepId** | **String**| The unique identifier of the sweep. | |

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

<a id="getBalanceAccountsId"></a>
# **getBalanceAccountsId**
> BalanceAccount getBalanceAccountsId(id)

Get a balance account

Returns a balance account and its balances for the default currency and other currencies with a non-zero balance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the balance account.
    try {
      BalanceAccount result = apiInstance.getBalanceAccountsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#getBalanceAccountsId");
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
| **id** | **String**| The unique identifier of the balance account. | |

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a id="getBalanceAccountsIdPaymentInstruments"></a>
# **getBalanceAccountsIdPaymentInstruments**
> PaginatedPaymentInstrumentsResponse getBalanceAccountsIdPaymentInstruments(id, offset, limit)

Get all payment instruments for a balance account

Returns a paginated list of the payment instruments associated with a balance account.   To fetch multiple pages, use the query parameters.For example, to limit the page to 3 payment instruments and to skip the first 6, use &#x60;/balanceAccounts/{id}/paymentInstruments?limit&#x3D;3&amp;offset&#x3D;6&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the balance account.
    Integer offset = 56; // Integer | The number of items that you want to skip.
    Integer limit = 56; // Integer | The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page.
    try {
      PaginatedPaymentInstrumentsResponse result = apiInstance.getBalanceAccountsIdPaymentInstruments(id, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#getBalanceAccountsIdPaymentInstruments");
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
| **id** | **String**| The unique identifier of the balance account. | |
| **offset** | **Integer**| The number of items that you want to skip. | [optional] |
| **limit** | **Integer**| The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. | [optional] |

### Return type

[**PaginatedPaymentInstrumentsResponse**](PaginatedPaymentInstrumentsResponse.md)

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

<a id="patchBalanceAccountsBalanceAccountIdSweepsSweepId"></a>
# **patchBalanceAccountsBalanceAccountIdSweepsSweepId**
> SweepConfigurationV2 patchBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId, sweepConfigurationV2)

Update a sweep

Updates a sweep. When updating a sweep resource, note that if a request parameter is not provided, the parameter is left unchanged.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String balanceAccountId = "balanceAccountId_example"; // String | The unique identifier of the balance account.
    String sweepId = "sweepId_example"; // String | The unique identifier of the sweep.
    SweepConfigurationV2 sweepConfigurationV2 = new SweepConfigurationV2(); // SweepConfigurationV2 | 
    try {
      SweepConfigurationV2 result = apiInstance.patchBalanceAccountsBalanceAccountIdSweepsSweepId(balanceAccountId, sweepId, sweepConfigurationV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#patchBalanceAccountsBalanceAccountIdSweepsSweepId");
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
| **balanceAccountId** | **String**| The unique identifier of the balance account. | |
| **sweepId** | **String**| The unique identifier of the sweep. | |
| **sweepConfigurationV2** | [**SweepConfigurationV2**](SweepConfigurationV2.md)|  | [optional] |

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

<a id="patchBalanceAccountsId"></a>
# **patchBalanceAccountsId**
> BalanceAccount patchBalanceAccountsId(id, balanceAccountUpdateRequest)

Update a balance account

Updates a balance account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the balance account.
    BalanceAccountUpdateRequest balanceAccountUpdateRequest = new BalanceAccountUpdateRequest(); // BalanceAccountUpdateRequest | 
    try {
      BalanceAccount result = apiInstance.patchBalanceAccountsId(id, balanceAccountUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#patchBalanceAccountsId");
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
| **id** | **String**| The unique identifier of the balance account. | |
| **balanceAccountUpdateRequest** | [**BalanceAccountUpdateRequest**](BalanceAccountUpdateRequest.md)|  | [optional] |

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a id="postBalanceAccounts"></a>
# **postBalanceAccounts**
> BalanceAccount postBalanceAccounts(balanceAccountInfo)

Create a balance account

Creates a balance account that holds the funds of the associated account holder.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    BalanceAccountInfo balanceAccountInfo = new BalanceAccountInfo(); // BalanceAccountInfo | 
    try {
      BalanceAccount result = apiInstance.postBalanceAccounts(balanceAccountInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#postBalanceAccounts");
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
| **balanceAccountInfo** | [**BalanceAccountInfo**](BalanceAccountInfo.md)|  | [optional] |

### Return type

[**BalanceAccount**](BalanceAccount.md)

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

<a id="postBalanceAccountsBalanceAccountIdSweeps"></a>
# **postBalanceAccountsBalanceAccountIdSweeps**
> SweepConfigurationV2 postBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, sweepConfigurationV2)

Create a sweep

Creates a sweep that results in moving funds from or to a balance account.  A sweep pulls in or pushes out funds based on a defined schedule, amount, currency, and a source or a destination.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAccountsApi;

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

    BalanceAccountsApi apiInstance = new BalanceAccountsApi(defaultClient);
    String balanceAccountId = "balanceAccountId_example"; // String | The unique identifier of the balance account.
    SweepConfigurationV2 sweepConfigurationV2 = new SweepConfigurationV2(); // SweepConfigurationV2 | 
    try {
      SweepConfigurationV2 result = apiInstance.postBalanceAccountsBalanceAccountIdSweeps(balanceAccountId, sweepConfigurationV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceAccountsApi#postBalanceAccountsBalanceAccountIdSweeps");
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
| **balanceAccountId** | **String**| The unique identifier of the balance account. | |
| **sweepConfigurationV2** | [**SweepConfigurationV2**](SweepConfigurationV2.md)|  | [optional] |

### Return type

[**SweepConfigurationV2**](SweepConfigurationV2.md)

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

