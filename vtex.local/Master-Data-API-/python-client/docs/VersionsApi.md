# openapi_client.VersionsApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getversion**](VersionsApi.md#getversion) | **GET** /api/dataentities/{dataEntityName}/documents/{id}/versions/{versionId} | Get version
[**listversions**](VersionsApi.md#listversions) | **GET** /api/dataentities/{dataEntityName}/documents/{id}/versions | List versions
[**putversion**](VersionsApi.md#putversion) | **PUT** /api/dataentities/{dataEntityName}/documents/{id}/versions/{versionId} | Put version


# **getversion**
> Getversion getversion(data_entity_name, content_type, accept, id, version_id)

Get version

Returns the version of a document.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.getversion import Getversion
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
    api_instance = openapi_client.VersionsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    version_id = '123456789abc' # str | ID of the version to update. (default to '123456789abc')

    try:
        # Get version
        api_response = api_instance.getversion(data_entity_name, content_type, accept, id, version_id)
        print("The response of VersionsApi->getversion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling VersionsApi->getversion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **version_id** | **str**| ID of the version to update. | [default to &#39;123456789abc&#39;]

### Return type

[**Getversion**](Getversion.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listversions**
> List[Listversion] listversions(data_entity_name, content_type, accept, id, load=load, fields=fields)

List versions

Allows to list the versions of a document.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.listversion import Listversion
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
    api_instance = openapi_client.VersionsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    load = True # bool | If true, return all the fields in each version of the document (optional) (default to True)
    fields = 'id,dataEntityId,isNewsletterOptIn,createdBy' # str | If `load` is true, the response will return only these specific fields (optional) (default to 'id,dataEntityId,isNewsletterOptIn,createdBy')

    try:
        # List versions
        api_response = api_instance.listversions(data_entity_name, content_type, accept, id, load=load, fields=fields)
        print("The response of VersionsApi->listversions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling VersionsApi->listversions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **load** | **bool**| If true, return all the fields in each version of the document | [optional] [default to True]
 **fields** | **str**| If &#x60;load&#x60; is true, the response will return only these specific fields | [optional] [default to &#39;id,dataEntityId,isNewsletterOptIn,createdBy&#39;]

### Return type

[**List[Listversion]**](Listversion.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putversion**
> DocumentResponse putversion(data_entity_name, content_type, accept, id, version_id)

Put version

Updates document with version values.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.document_response import DocumentResponse
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
    api_instance = openapi_client.VersionsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    version_id = '{{versionId}}' # str | ID of the version to update (default to '{{versionId}}')

    try:
        # Put version
        api_response = api_instance.putversion(data_entity_name, content_type, accept, id, version_id)
        print("The response of VersionsApi->putversion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling VersionsApi->putversion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **version_id** | **str**| ID of the version to update | [default to &#39;{{versionId}}&#39;]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

