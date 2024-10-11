# openapi_client.SearchApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_documents_reindex**](SearchApi.md#check_documents_reindex) | **GET** /search/documents/reindex/status | Check reindex status of the client source and translation documents.
[**reindex_documents**](SearchApi.md#reindex_documents) | **POST** /search/documents/reindex | Reindex for search all of the client source and translation documents.
[**search_everywhere**](SearchApi.md#search_everywhere) | **GET** /search | Search everything in your account


# **check_documents_reindex**
> AsyncOperationStatus check_documents_reindex(async_request_key)

Check reindex status of the client source and translation documents.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SearchApi(api_client)
    async_request_key = 'async_request_key_example' # str | Async operation key

    try:
        # Check reindex status of the client source and translation documents.
        api_response = api_instance.check_documents_reindex(async_request_key)
        print("The response of SearchApi->check_documents_reindex:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->check_documents_reindex: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async_request_key** | **str**| Async operation key | 

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Async operation status. Use the key to query status of this operation. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reindex_documents**
> AsyncOperationStatus reindex_documents()

Reindex for search all of the client source and translation documents.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SearchApi(api_client)

    try:
        # Reindex for search all of the client source and translation documents.
        api_response = api_instance.reindex_documents()
        print("The response of SearchApi->reindex_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->reindex_documents: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Async operation status. Use the key to query status of this operation. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_everywhere**
> SearchEverywhereResult search_everywhere(query, include=include, page=page, per_page=per_page)

Search everything in your account

Search through everything in your account, from projects to documents, from source strings to translations...

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.search_everywhere_result import SearchEverywhereResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SearchApi(api_client)
    query = 'query_example' # str | Search query term
    include = ['include_example'] # List[str] | Search in these entities. Current oprions are projects, documents, strings. Can be multiple. When not provided, we'll search through all entities. (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)

    try:
        # Search everything in your account
        api_response = api_instance.search_everywhere(query, include=include, page=page, per_page=per_page)
        print("The response of SearchApi->search_everywhere:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->search_everywhere: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| Search query term | 
 **include** | [**List[str]**](str.md)| Search in these entities. Current oprions are projects, documents, strings. Can be multiple. When not provided, we&#39;ll search through all entities. | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]

### Return type

[**SearchEverywhereResult**](SearchEverywhereResult.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Search result for multiple entities and paging |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

