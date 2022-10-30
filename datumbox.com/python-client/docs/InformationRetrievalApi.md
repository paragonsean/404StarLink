# openapi_client.InformationRetrievalApi

All URIs are relative to *http://api.datumbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyword_extraction**](InformationRetrievalApi.md#keyword_extraction) | **POST** /1.0/KeywordExtraction.json | Extracts the Keywords of the Document
[**text_extraction**](InformationRetrievalApi.md#text_extraction) | **POST** /1.0/TextExtraction.json | Extracts the clear text from Webpage


# **keyword_extraction**
> keyword_extraction(api_key, n=n, text=text)

Extracts the Keywords of the Document

The Keyword Extraction function enables you to extract from an arbitrary document all the keywords and word-combinations along with their occurrences in the text.

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
    api_instance = openapi_client.InformationRetrievalApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    n = 56 # int | The number of keyword combinations (n-grams) that you wish to extract. (optional)
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Extracts the Keywords of the Document
        api_instance.keyword_extraction(api_key, n=n, text=text)
    except Exception as e:
        print("Exception when calling InformationRetrievalApi->keyword_extraction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **n** | **int**| The number of keyword combinations (n-grams) that you wish to extract. | [optional] 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

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

# **text_extraction**
> text_extraction(api_key, text=text)

Extracts the clear text from Webpage

The Text Extraction function enables you to extract the important information from a given webpage. Extracting the clear text of the documents is an important step before any other analysis.

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
    api_instance = openapi_client.InformationRetrievalApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The HTML source of the webpage. (optional)

    try:
        # Extracts the clear text from Webpage
        api_instance.text_extraction(api_key, text=text)
    except Exception as e:
        print("Exception when calling InformationRetrievalApi->text_extraction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The HTML source of the webpage. | [optional] 

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

