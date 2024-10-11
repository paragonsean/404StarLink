# openapi_client.MetricsApi

All URIs are relative to *http://api.datumbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**document_similarity**](MetricsApi.md#document_similarity) | **POST** /1.0/DocumentSimilarity.json | Estimates the similarity between 2 Documents


# **document_similarity**
> document_similarity(api_key, copy=copy, original=original)

Estimates the similarity between 2 Documents

The Document Similarity function estimates the degree of similarity between two documents. It can be used to detect duplicate webpages or detect plagiarism.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MetricsApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    copy = 'copy_example' # str | The second text. It should not contain HTML tags. (optional)
    original = 'original_example' # str | The first text. It should not contain HTML tags. (optional)

    try:
        # Estimates the similarity between 2 Documents
        api_instance.document_similarity(api_key, copy=copy, original=original)
    except Exception as e:
        print("Exception when calling MetricsApi->document_similarity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **copy** | **str**| The second text. It should not contain HTML tags. | [optional] 
 **original** | **str**| The first text. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

