# CallsApi

All URIs are relative to *https://api.surevoip.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callsGet**](CallsApi.md#callsGet) | **GET** /calls | Validate a phone number by calling it once |
| [**callsPost**](CallsApi.md#callsPost) | **POST** /calls | Create phone calls with or without announcements and scheduled hangups |


<a id="callsGet"></a>
# **callsGet**
> Object callsGet(validate)

Validate a phone number by calling it once

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CallsApi apiInstance = new CallsApi(defaultClient);
    Integer validate = 441224900123; // Integer | Validate a phone number by calling it for one ring. Note; not 100% proof the number is in service.
    try {
      Object result = apiInstance.callsGet(validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#callsGet");
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
| **validate** | **Integer**| Validate a phone number by calling it for one ring. Note; not 100% proof the number is in service. | [optional] |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad query data |  -  |
| **404** | Only partners or admins can list all live calls. |  -  |

<a id="callsPost"></a>
# **callsPost**
> CallsPost202Response callsPost(callsPostRequest)

Create phone calls with or without announcements and scheduled hangups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CallsApi apiInstance = new CallsApi(defaultClient);
    CallsPostRequest callsPostRequest = new CallsPostRequest(); // CallsPostRequest | Create a phone call and play announcement audio to the \"from\" party (a leg)
    try {
      CallsPost202Response result = apiInstance.callsPost(callsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#callsPost");
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
| **callsPostRequest** | [**CallsPostRequest**](CallsPostRequest.md)| Create a phone call and play announcement audio to the \&quot;from\&quot; party (a leg) | |

### Return type

[**CallsPost202Response**](CallsPost202Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Call creation request accepted. |  * Location - URL of customer account <br>  |
| **400** | Bad data |  -  |
| **403** | Only customer accounts can create calls. |  -  |
| **500** | Issue with API interface to core platform. |  -  |

