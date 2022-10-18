# openapi_client.UrlToScreenshotApi

All URIs are relative to *https://api.dataflowkit.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**url_to_screenshot**](UrlToScreenshotApi.md#url_to_screenshot) | **POST** /convert/url/screenshot | Capture web page Screenshots.


# **url_to_screenshot**
> bytearray url_to_screenshot(url2screenshotrequest)

Capture web page Screenshots.

Automate URL to Screenshot Conversion right in your application.  Specify request parameters like URL, Proxy, and actions to convert web pages to screenshots using Headless Chrome.  Get resulted pictures in JPG or PNG formats even from websites blocked in your area for some reason utilizing our worldwide pool of proxies.  Simulate real-world human interaction with the page. For example, before capturing a web page, you may need to scroll it.  Generate ready-to-run code for your favorite language at [https://dataflowkit.com/url-to-screenshot](https://dataflowkit.com/url-to-screenshot)

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.url2screenshotrequest import Url2screenshotrequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.dataflowkit.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.dataflowkit.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.UrlToScreenshotApi(api_client)
    url2screenshotrequest = openapi_client.Url2screenshotrequest() # Url2screenshotrequest | 

    try:
        # Capture web page Screenshots.
        api_response = api_instance.url_to_screenshot(url2screenshotrequest)
        print("The response of UrlToScreenshotApi->url_to_screenshot:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UrlToScreenshotApi->url_to_screenshot: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url2screenshotrequest** | [**Url2screenshotrequest**](Url2screenshotrequest.md)|  | 

### Return type

**bytearray**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/jpeg, image/png, text/plain; charset=utf-8

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns jpg or png file. |  -  |
**400** | Bad Request. Invalid payload specified. |  -  |
**401** | Unauthorized. &#x60;api_key&#x60; parameter is missed or incorrect |  -  |
**500** | Internal Server Error is a very general HTTP status code that means something has gone wrong on the web site&#39;s server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

