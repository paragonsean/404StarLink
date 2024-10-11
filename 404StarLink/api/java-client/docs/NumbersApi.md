# NumbersApi

All URIs are relative to *https://api.surevoip.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**numbersGet**](NumbersApi.md#numbersGet) | **GET** /numbers | List available SureVoIP Ofcom number allocations for purchase |


<a id="numbersGet"></a>
# **numbersGet**
> numbersGet()

List available SureVoIP Ofcom number allocations for purchase

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NumbersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");

    NumbersApi apiInstance = new NumbersApi(defaultClient);
    try {
      apiInstance.numbersGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling NumbersApi#numbersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

