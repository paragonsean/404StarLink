# openapi_client.ClustersApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validatedocumentbyclusters**](ClustersApi.md#validatedocumentbyclusters) | **POST** /api/dataentities/{dataEntityName}/documents/{id}/clusters | Validate document by clusters


# **validatedocumentbyclusters**
> validatedocumentbyclusters(data_entity_name, accept, id, body)

Validate document by clusters

Check if a document is present in one or more clusters (specific set of field values).    > There is a limit of five rules per request.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ClustersApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    body = [
    {
        "name": "male",        
        "rule": "gender=male"
    },
    {
        "name": "complex",
        "rule": "((gender=male AND percent=0.35) AND any is null) AND (name=*go*)"
    },    
    {
        "name": "complex2",
        "rule": "((gender=male AND percent=0.35) AND any is not null) OR (name=*go*)"
    },
    {
        "name": "createdIn",
        "rule": "createdIn between 2015-10-28 AND 2015-10-30"
    }
] # str | Request body for validating a document by clusters

    try:
        # Validate document by clusters
        api_instance.validatedocumentbyclusters(data_entity_name, accept, id, body)
    except Exception as e:
        print("Exception when calling ClustersApi->validatedocumentbyclusters: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **body** | **str**| Request body for validating a document by clusters | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

