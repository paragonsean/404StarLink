# PaymentInstrumentGroupsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentInstrumentGroupsId**](PaymentInstrumentGroupsApi.md#getPaymentInstrumentGroupsId) | **GET** /paymentInstrumentGroups/{id} | Get a payment instrument group |
| [**getPaymentInstrumentGroupsIdTransactionRules**](PaymentInstrumentGroupsApi.md#getPaymentInstrumentGroupsIdTransactionRules) | **GET** /paymentInstrumentGroups/{id}/transactionRules | Get all transaction rules for a payment instrument group |
| [**postPaymentInstrumentGroups**](PaymentInstrumentGroupsApi.md#postPaymentInstrumentGroups) | **POST** /paymentInstrumentGroups | Create a payment instrument group |


<a id="getPaymentInstrumentGroupsId"></a>
# **getPaymentInstrumentGroupsId**
> PaymentInstrumentGroup getPaymentInstrumentGroupsId(id)

Get a payment instrument group

Returns the details of a payment instrument group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentGroupsApi;

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

    PaymentInstrumentGroupsApi apiInstance = new PaymentInstrumentGroupsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument group.
    try {
      PaymentInstrumentGroup result = apiInstance.getPaymentInstrumentGroupsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsId");
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
| **id** | **String**| The unique identifier of the payment instrument group. | |

### Return type

[**PaymentInstrumentGroup**](PaymentInstrumentGroup.md)

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

<a id="getPaymentInstrumentGroupsIdTransactionRules"></a>
# **getPaymentInstrumentGroupsIdTransactionRules**
> TransactionRulesResponse getPaymentInstrumentGroupsIdTransactionRules(id)

Get all transaction rules for a payment instrument group

Returns a list of all the transaction rules associated with a payment instrument group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentGroupsApi;

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

    PaymentInstrumentGroupsApi apiInstance = new PaymentInstrumentGroupsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument group.
    try {
      TransactionRulesResponse result = apiInstance.getPaymentInstrumentGroupsIdTransactionRules(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentGroupsApi#getPaymentInstrumentGroupsIdTransactionRules");
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
| **id** | **String**| The unique identifier of the payment instrument group. | |

### Return type

[**TransactionRulesResponse**](TransactionRulesResponse.md)

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

<a id="postPaymentInstrumentGroups"></a>
# **postPaymentInstrumentGroups**
> PaymentInstrumentGroup postPaymentInstrumentGroups(paymentInstrumentGroupInfo)

Create a payment instrument group

Creates a payment instrument group to associate and group payment instrument resources together. You can apply a transaction rule to a payment instrument group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentGroupsApi;

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

    PaymentInstrumentGroupsApi apiInstance = new PaymentInstrumentGroupsApi(defaultClient);
    PaymentInstrumentGroupInfo paymentInstrumentGroupInfo = new PaymentInstrumentGroupInfo(); // PaymentInstrumentGroupInfo | 
    try {
      PaymentInstrumentGroup result = apiInstance.postPaymentInstrumentGroups(paymentInstrumentGroupInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentGroupsApi#postPaymentInstrumentGroups");
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
| **paymentInstrumentGroupInfo** | [**PaymentInstrumentGroupInfo**](PaymentInstrumentGroupInfo.md)|  | [optional] |

### Return type

[**PaymentInstrumentGroup**](PaymentInstrumentGroup.md)

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

