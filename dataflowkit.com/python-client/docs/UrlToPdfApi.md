# openapi_client.UrlToPdfApi

All URIs are relative to *https://api.dataflowkit.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**url_to_pdf**](UrlToPdfApi.md#url_to_pdf) | **POST** /convert/url/pdf | Save web page as PDF


# **url_to_pdf**
> bytearray url_to_pdf(url2pdfrequest)

Save web page as PDF

Automate URL to PDF Conversion right in your application.  Specify request parameters like URL, Proxy, and actions to render web pages to PDF using Headless Chrome.  Get resulted PDF even from websites blocked in your area for some reason utilizing our worldwide pool of proxies.  Simulate real-world human interaction with the page. For example, before saving a web page to PDF, you may need to scroll it.  Generate ready-to-run code for your favorite language at [https://dataflowkit.com/url-to-pdf](https://dataflowkit.com/url-to-pdf)

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.url2pdfrequest import Url2pdfrequest
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
    api_instance = openapi_client.UrlToPdfApi(api_client)
    url2pdfrequest = openapi_client.Url2pdfrequest() # Url2pdfrequest | 

    try:
        # Save web page as PDF
        api_response = api_instance.url_to_pdf(url2pdfrequest)
        print("The response of UrlToPdfApi->url_to_pdf:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UrlToPdfApi->url_to_pdf: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url2pdfrequest** | [**Url2pdfrequest**](Url2pdfrequest.md)|  | 

### Return type

**bytearray**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, text/plain; charset=utf-8

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A PDF file. |  -  |
**400** | Bad Request. Invalid payload specified. |  -  |
**401** | Unauthorized. &#x60;api_key&#x60; parameter is missed or incorrect |  -  |
**500** | Internal Server Error is a very general HTTP status code that means something has gone wrong on the web site&#39;s server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

