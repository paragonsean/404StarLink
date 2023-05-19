# TransferInstrumentsApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransferInstrumentsId**](TransferInstrumentsApi.md#deleteTransferInstrumentsId) | **DELETE** /transferInstruments/{id} | Delete a transfer instrument |
| [**getTransferInstrumentsId**](TransferInstrumentsApi.md#getTransferInstrumentsId) | **GET** /transferInstruments/{id} | Get a transfer instrument |
| [**patchTransferInstrumentsId**](TransferInstrumentsApi.md#patchTransferInstrumentsId) | **PATCH** /transferInstruments/{id} | Update a transfer instrument |
| [**postTransferInstruments**](TransferInstrumentsApi.md#postTransferInstruments) | **POST** /transferInstruments | Create a transfer instrument |


<a id="deleteTransferInstrumentsId"></a>
# **deleteTransferInstrumentsId**
> deleteTransferInstrumentsId(id)

Delete a transfer instrument

Deletes a transfer instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransferInstrumentsApi;

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

    TransferInstrumentsApi apiInstance = new TransferInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the transfer instrument to be deleted.
    try {
      apiInstance.deleteTransferInstrumentsId(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferInstrumentsApi#deleteTransferInstrumentsId");
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
| **id** | **String**| The unique identifier of the transfer instrument to be deleted. | |

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

<a id="getTransferInstrumentsId"></a>
# **getTransferInstrumentsId**
> TransferInstrument getTransferInstrumentsId(id)

Get a transfer instrument

Returns the details of a transfer instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransferInstrumentsApi;

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

    TransferInstrumentsApi apiInstance = new TransferInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the transfer instrument.
    try {
      TransferInstrument result = apiInstance.getTransferInstrumentsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferInstrumentsApi#getTransferInstrumentsId");
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
| **id** | **String**| The unique identifier of the transfer instrument. | |

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

<a id="patchTransferInstrumentsId"></a>
# **patchTransferInstrumentsId**
> TransferInstrument patchTransferInstrumentsId(id, transferInstrumentInfo)

Update a transfer instrument

Updates a transfer instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransferInstrumentsApi;

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

    TransferInstrumentsApi apiInstance = new TransferInstrumentsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the transfer instrument.
    TransferInstrumentInfo transferInstrumentInfo = new TransferInstrumentInfo(); // TransferInstrumentInfo | 
    try {
      TransferInstrument result = apiInstance.patchTransferInstrumentsId(id, transferInstrumentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferInstrumentsApi#patchTransferInstrumentsId");
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
| **id** | **String**| The unique identifier of the transfer instrument. | |
| **transferInstrumentInfo** | [**TransferInstrumentInfo**](TransferInstrumentInfo.md)|  | [optional] |

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

<a id="postTransferInstruments"></a>
# **postTransferInstruments**
> TransferInstrument postTransferInstruments(transferInstrumentInfo)

Create a transfer instrument

Creates a transfer instrument.   A transfer instrument is a bank account that a legal entity owns. Adyen performs verification checks on the transfer instrument as required by payment industry regulations. We inform you of the verification results through webhooks or API responses.  When the transfer instrument passes the verification checks, you can start sending funds from the balance platform to the transfer instrument (such as payouts).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransferInstrumentsApi;

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

    TransferInstrumentsApi apiInstance = new TransferInstrumentsApi(defaultClient);
    TransferInstrumentInfo transferInstrumentInfo = new TransferInstrumentInfo(); // TransferInstrumentInfo | 
    try {
      TransferInstrument result = apiInstance.postTransferInstruments(transferInstrumentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferInstrumentsApi#postTransferInstruments");
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
| **transferInstrumentInfo** | [**TransferInstrumentInfo**](TransferInstrumentInfo.md)|  | [optional] |

### Return type

[**TransferInstrument**](TransferInstrument.md)

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

