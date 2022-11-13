# openapi_client.CustomerProfilesApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_new_customer_profilev2**](CustomerProfilesApi.md#create_new_customer_profilev2) | **POST** /api/dataentities/Client/documents | Create new customer profile
[**delete_customer_profile**](CustomerProfilesApi.md#delete_customer_profile) | **DELETE** /api/dataentities/Client/documents/{id} | Delete customer profile
[**update_customer_profile**](CustomerProfilesApi.md#update_customer_profile) | **PATCH** /api/dataentities/Client/documents/{id} | Update customer profile


# **create_new_customer_profilev2**
> DocumentResponse create_new_customer_profilev2(content_type, accept, create_update_profile_requests, var_schema=var_schema)

Create new customer profile

Creates new customer profile.    > You can use this request to create customer profiles according to any `CL` schema. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for the schemas you are using. Learn more about how to use [Master Data v2 schemas](https://developers.vtex.com/vtex-rest-api/docs/master-data-schema-lifecycle).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.create_update_profile_requests import CreateUpdateProfileRequests
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
    api_instance = openapi_client.CustomerProfilesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    create_update_profile_requests = openapi_client.CreateUpdateProfileRequests() # CreateUpdateProfileRequests | 
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Create new customer profile
        api_response = api_instance.create_new_customer_profilev2(content_type, accept, create_update_profile_requests, var_schema=var_schema)
        print("The response of CustomerProfilesApi->create_new_customer_profilev2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerProfilesApi->create_new_customer_profilev2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **create_update_profile_requests** | [**CreateUpdateProfileRequests**](CreateUpdateProfileRequests.md)|  | 
 **var_schema** | **str**| Name of the schema the document to be created needs to be compliant with. | [optional] 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_customer_profile**
> DocumentResponse delete_customer_profile(content_type, accept, id)

Delete customer profile

Deletes a customer profile.

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
    api_instance = openapi_client.CustomerProfilesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.

    try:
        # Delete customer profile
        api_response = api_instance.delete_customer_profile(content_type, accept, id)
        print("The response of CustomerProfilesApi->delete_customer_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerProfilesApi->delete_customer_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 

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

# **update_customer_profile**
> DocumentResponse update_customer_profile(content_type, accept, id, create_update_profile_requests, var_schema=var_schema)

Update customer profile

Partially updates a customer profile.    > You can use this request to update customer profiles according to any `CL` schema. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for the schemas you are using. Learn more about how to use [Master Data v2 schemas](https://developers.vtex.com/vtex-rest-api/docs/master-data-schema-lifecycle).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.create_update_profile_requests import CreateUpdateProfileRequests
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
    api_instance = openapi_client.CustomerProfilesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    create_update_profile_requests = openapi_client.CreateUpdateProfileRequests() # CreateUpdateProfileRequests | 
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Update customer profile
        api_response = api_instance.update_customer_profile(content_type, accept, id, create_update_profile_requests, var_schema=var_schema)
        print("The response of CustomerProfilesApi->update_customer_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerProfilesApi->update_customer_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **create_update_profile_requests** | [**CreateUpdateProfileRequests**](CreateUpdateProfileRequests.md)|  | 
 **var_schema** | **str**| Name of the schema the document to be created needs to be compliant with. | [optional] 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

