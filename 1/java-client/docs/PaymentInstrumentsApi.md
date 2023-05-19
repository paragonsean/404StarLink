# PaymentInstrumentsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentInstrumentsId**](PaymentInstrumentsApi.md#getPaymentInstrumentsId) | **GET** /paymentInstruments/{id} | Get a payment instrument |
| [**getPaymentInstrumentsIdReveal**](PaymentInstrumentsApi.md#getPaymentInstrumentsIdReveal) | **GET** /paymentInstruments/{id}/reveal | Get the PAN of a payment instrument |
| [**getPaymentInstrumentsIdTransactionRules**](PaymentInstrumentsApi.md#getPaymentInstrumentsIdTransactionRules) | **GET** /paymentInstruments/{id}/transactionRules | Get all transaction rules for a payment instrument |
| [**patchPaymentInstrumentsId**](PaymentInstrumentsApi.md#patchPaymentInstrumentsId) | **PATCH** /paymentInstruments/{id} | Update a payment instrument |
| [**postPaymentInstruments**](PaymentInstrumentsApi.md#postPaymentInstruments) | **POST** /paymentInstruments | Create a payment instrument |


<a id="getPaymentInstrumentsId"></a>
# **getPaymentInstrumentsId**
> PaymentInstrument getPaymentInstrumentsId(id)

Get a payment instrument

Returns the details of a payment instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentsApi;

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

    PaymentInstrumentsApi apiInstance = new PaymentInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument.
    try {
      PaymentInstrument result = apiInstance.getPaymentInstrumentsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentsApi#getPaymentInstrumentsId");
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
| **id** | **String**| The unique identifier of the payment instrument. | |

### Return type

[**PaymentInstrument**](PaymentInstrument.md)

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

<a id="getPaymentInstrumentsIdReveal"></a>
# **getPaymentInstrumentsIdReveal**
> PaymentInstrumentRevealInfo getPaymentInstrumentsIdReveal(id)

Get the PAN of a payment instrument

Returns the primary account number (PAN) of a payment instrument.  To make this request, your API credential must have the following [role](https://docs.adyen.com/issuing/manage-access/api-credentials-web-service#api-permissions):  * Balance Platform BCL PCI role

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentsApi;

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

    PaymentInstrumentsApi apiInstance = new PaymentInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument.
    try {
      PaymentInstrumentRevealInfo result = apiInstance.getPaymentInstrumentsIdReveal(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentsApi#getPaymentInstrumentsIdReveal");
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
| **id** | **String**| The unique identifier of the payment instrument. | |

### Return type

[**PaymentInstrumentRevealInfo**](PaymentInstrumentRevealInfo.md)

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

<a id="getPaymentInstrumentsIdTransactionRules"></a>
# **getPaymentInstrumentsIdTransactionRules**
> TransactionRulesResponse getPaymentInstrumentsIdTransactionRules(id)

Get all transaction rules for a payment instrument

Returns a list of transaction rules associated with a payment instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentsApi;

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

    PaymentInstrumentsApi apiInstance = new PaymentInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument.
    try {
      TransactionRulesResponse result = apiInstance.getPaymentInstrumentsIdTransactionRules(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentsApi#getPaymentInstrumentsIdTransactionRules");
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
| **id** | **String**| The unique identifier of the payment instrument. | |

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

<a id="patchPaymentInstrumentsId"></a>
# **patchPaymentInstrumentsId**
> UpdatePaymentInstrument patchPaymentInstrumentsId(id, paymentInstrumentUpdateRequest)

Update a payment instrument

Updates a payment instrument. Once a payment instrument is already active, you can only update its status. However, for cards created with **inactive** status, you can still update the balance account associated with the card.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentsApi;

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

    PaymentInstrumentsApi apiInstance = new PaymentInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the payment instrument.
    PaymentInstrumentUpdateRequest paymentInstrumentUpdateRequest = new PaymentInstrumentUpdateRequest(); // PaymentInstrumentUpdateRequest | 
    try {
      UpdatePaymentInstrument result = apiInstance.patchPaymentInstrumentsId(id, paymentInstrumentUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentsApi#patchPaymentInstrumentsId");
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
| **id** | **String**| The unique identifier of the payment instrument. | |
| **paymentInstrumentUpdateRequest** | [**PaymentInstrumentUpdateRequest**](PaymentInstrumentUpdateRequest.md)|  | [optional] |

### Return type

[**UpdatePaymentInstrument**](UpdatePaymentInstrument.md)

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

<a id="postPaymentInstruments"></a>
# **postPaymentInstruments**
> PaymentInstrument postPaymentInstruments(paymentInstrumentInfo)

Create a payment instrument

Creates a payment instrument to issue a physical card, a virtual card, or a business account to your user.   For more information, refer to [Issue cards](https://docs.adyen.com/issuing/create-cards) or [Issue business accounts](https://docs.adyen.com/marketplaces-and-platforms/business-accounts).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentInstrumentsApi;

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

    PaymentInstrumentsApi apiInstance = new PaymentInstrumentsApi(defaultClient);
    PaymentInstrumentInfo paymentInstrumentInfo = new PaymentInstrumentInfo(); // PaymentInstrumentInfo | 
    try {
      PaymentInstrument result = apiInstance.postPaymentInstruments(paymentInstrumentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstrumentsApi#postPaymentInstruments");
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
| **paymentInstrumentInfo** | [**PaymentInstrumentInfo**](PaymentInstrumentInfo.md)|  | [optional] |

### Return type

[**PaymentInstrument**](PaymentInstrument.md)

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

