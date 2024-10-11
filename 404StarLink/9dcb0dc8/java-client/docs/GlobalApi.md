# GlobalApi

All URIs are relative to *https://api.surevoip.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rootGet**](GlobalApi.md#rootGet) | **GET** / | List global resources |


<a id="rootGet"></a>
# **rootGet**
> Get200Response rootGet(hypermedia, contentType)

List global resources

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalApi;

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

    GlobalApi apiInstance = new GlobalApi(defaultClient);
    String hypermedia = "true"; // String | Disable Hypermedia
    String contentType = "application/json"; // String | Content Type
    try {
      Get200Response result = apiInstance.rootGet(hypermedia, contentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalApi#rootGet");
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
| **hypermedia** | **String**| Disable Hypermedia | [optional] [default to true] [enum: true, false] |
| **contentType** | **String**| Content Type | [optional] [default to application/json] [enum: application/json, text/html, text/xml, application/xml] |

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return Status OK and/or resource list |  -  |

