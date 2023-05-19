# TransactionRulesApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransactionRulesTransactionRuleId**](TransactionRulesApi.md#deleteTransactionRulesTransactionRuleId) | **DELETE** /transactionRules/{transactionRuleId} | Delete a transaction rule |
| [**getTransactionRulesTransactionRuleId**](TransactionRulesApi.md#getTransactionRulesTransactionRuleId) | **GET** /transactionRules/{transactionRuleId} | Get a transaction rule |
| [**patchTransactionRulesTransactionRuleId**](TransactionRulesApi.md#patchTransactionRulesTransactionRuleId) | **PATCH** /transactionRules/{transactionRuleId} | Update a transaction rule |
| [**postTransactionRules**](TransactionRulesApi.md#postTransactionRules) | **POST** /transactionRules | Create a transaction rule |


<a id="deleteTransactionRulesTransactionRuleId"></a>
# **deleteTransactionRulesTransactionRuleId**
> TransactionRule deleteTransactionRulesTransactionRuleId(transactionRuleId)

Delete a transaction rule

Deletes a transaction rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRulesApi;

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

    TransactionRulesApi apiInstance = new TransactionRulesApi(defaultClient);
    String transactionRuleId = "transactionRuleId_example"; // String | The unique identifier of the transaction rule.
    try {
      TransactionRule result = apiInstance.deleteTransactionRulesTransactionRuleId(transactionRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRulesApi#deleteTransactionRulesTransactionRuleId");
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
| **transactionRuleId** | **String**| The unique identifier of the transaction rule. | |

### Return type

[**TransactionRule**](TransactionRule.md)

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

<a id="getTransactionRulesTransactionRuleId"></a>
# **getTransactionRulesTransactionRuleId**
> TransactionRuleResponse getTransactionRulesTransactionRuleId(transactionRuleId)

Get a transaction rule

Returns the details of a transaction rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRulesApi;

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

    TransactionRulesApi apiInstance = new TransactionRulesApi(defaultClient);
    String transactionRuleId = "transactionRuleId_example"; // String | The unique identifier of the transaction rule.
    try {
      TransactionRuleResponse result = apiInstance.getTransactionRulesTransactionRuleId(transactionRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRulesApi#getTransactionRulesTransactionRuleId");
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
| **transactionRuleId** | **String**| The unique identifier of the transaction rule. | |

### Return type

[**TransactionRuleResponse**](TransactionRuleResponse.md)

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

<a id="patchTransactionRulesTransactionRuleId"></a>
# **patchTransactionRulesTransactionRuleId**
> TransactionRule patchTransactionRulesTransactionRuleId(transactionRuleId, transactionRuleInfo)

Update a transaction rule

Updates a transaction rule.   * To update only the status of a transaction rule, send only the &#x60;status&#x60; parameter. All other parameters not provided in the request are left unchanged.  * When updating any other parameter, you need to send all existing resource parameters. If you omit a parameter in the request, that parameter is removed from the resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRulesApi;

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

    TransactionRulesApi apiInstance = new TransactionRulesApi(defaultClient);
    String transactionRuleId = "transactionRuleId_example"; // String | The unique identifier of the transaction rule.
    TransactionRuleInfo transactionRuleInfo = new TransactionRuleInfo(); // TransactionRuleInfo | 
    try {
      TransactionRule result = apiInstance.patchTransactionRulesTransactionRuleId(transactionRuleId, transactionRuleInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRulesApi#patchTransactionRulesTransactionRuleId");
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
| **transactionRuleId** | **String**| The unique identifier of the transaction rule. | |
| **transactionRuleInfo** | [**TransactionRuleInfo**](TransactionRuleInfo.md)|  | [optional] |

### Return type

[**TransactionRule**](TransactionRule.md)

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

<a id="postTransactionRules"></a>
# **postTransactionRules**
> TransactionRule postTransactionRules(transactionRuleInfo)

Create a transaction rule

Creates a [transaction rule](https://docs.adyen.com/issuing/transaction-rules). When your user makes a transaction with their Adyen-issued card, the transaction is allowed or declined based on the conditions and outcome defined in the transaction rule. You can apply the transaction rule to several cards, such as all the cards in your platform, or to a specific card. For use cases, see [examples](https://docs.adyen.com/issuing/transaction-rules/examples).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRulesApi;

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

    TransactionRulesApi apiInstance = new TransactionRulesApi(defaultClient);
    TransactionRuleInfo transactionRuleInfo = new TransactionRuleInfo(); // TransactionRuleInfo | 
    try {
      TransactionRule result = apiInstance.postTransactionRules(transactionRuleInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRulesApi#postTransactionRules");
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
| **transactionRuleInfo** | [**TransactionRuleInfo**](TransactionRuleInfo.md)|  | [optional] |

### Return type

[**TransactionRule**](TransactionRule.md)

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

