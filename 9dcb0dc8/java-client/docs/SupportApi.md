# SupportApi

All URIs are relative to *https://api.surevoip.co.uk*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressGet**](SupportApi.md#ipAddressGet) | **GET** /ip-address | Return the IP address from where your API request originated |
| [**serviceStatusGet**](SupportApi.md#serviceStatusGet) | **GET** /service-status | List all Service Status messages |
| [**supportIpAddressGet**](SupportApi.md#supportIpAddressGet) | **GET** /support/ip-address | Return the IP address from where your API request originated |
| [**supportServiceStatusGet**](SupportApi.md#supportServiceStatusGet) | **GET** /support/service-status | List all Service Status messages |


<a id="ipAddressGet"></a>
# **ipAddressGet**
> ipAddressGet()

Return the IP address from where your API request originated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");

    SupportApi apiInstance = new SupportApi(defaultClient);
    try {
      apiInstance.ipAddressGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportApi#ipAddressGet");
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

<a id="serviceStatusGet"></a>
# **serviceStatusGet**
> serviceStatusGet()

List all Service Status messages

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");

    SupportApi apiInstance = new SupportApi(defaultClient);
    try {
      apiInstance.serviceStatusGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportApi#serviceStatusGet");
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

<a id="supportIpAddressGet"></a>
# **supportIpAddressGet**
> supportIpAddressGet()

Return the IP address from where your API request originated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");

    SupportApi apiInstance = new SupportApi(defaultClient);
    try {
      apiInstance.supportIpAddressGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportApi#supportIpAddressGet");
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

<a id="supportServiceStatusGet"></a>
# **supportServiceStatusGet**
> supportServiceStatusGet()

List all Service Status messages

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.surevoip.co.uk");

    SupportApi apiInstance = new SupportApi(defaultClient);
    try {
      apiInstance.supportServiceStatusGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportApi#supportServiceStatusGet");
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

