# GrantOffersApi

All URIs are relative to *https://balanceplatform-api-test.adyen.com/bcl/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGrantOffers**](GrantOffersApi.md#getGrantOffers) | **GET** /grantOffers | Get all available grant offers |
| [**getGrantOffersGrantOfferId**](GrantOffersApi.md#getGrantOffersGrantOfferId) | **GET** /grantOffers/{grantOfferId} | Get a grant offer |


<a id="getGrantOffers"></a>
# **getGrantOffers**
> GrantOffers getGrantOffers(accountHolderId)

Get all available grant offers

Returns a list of all [grant offers](https://docs.adyen.com/marketplaces-and-platforms/capital#grant-offers) available for &#x60;accountHolderId&#x60; specified as a query parameter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GrantOffersApi;

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

    GrantOffersApi apiInstance = new GrantOffersApi(defaultClient);
    String accountHolderId = "accountHolderId_example"; // String | The unique identifier of the grant account.
    try {
      GrantOffers result = apiInstance.getGrantOffers(accountHolderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrantOffersApi#getGrantOffers");
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
| **accountHolderId** | **String**| The unique identifier of the grant account. | |

### Return type

[**GrantOffers**](GrantOffers.md)

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

<a id="getGrantOffersGrantOfferId"></a>
# **getGrantOffersGrantOfferId**
> GrantOffer getGrantOffersGrantOfferId(grantOfferId)

Get a grant offer

Returns the details of a single grant offer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GrantOffersApi;

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

    GrantOffersApi apiInstance = new GrantOffersApi(defaultClient);
    String grantOfferId = "grantOfferId_example"; // String | The unique identifier of the grant offer.
    try {
      GrantOffer result = apiInstance.getGrantOffersGrantOfferId(grantOfferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrantOffersApi#getGrantOffersGrantOfferId");
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
| **grantOfferId** | **String**| The unique identifier of the grant offer. | |

### Return type

[**GrantOffer**](GrantOffer.md)

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

