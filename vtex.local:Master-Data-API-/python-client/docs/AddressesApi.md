# openapi_client.AddressesApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_new_customer_address**](AddressesApi.md#create_new_customer_address) | **POST** /api/dataentities/Address/documents | Create new customer address
[**delete_customer_address**](AddressesApi.md#delete_customer_address) | **DELETE** /api/dataentities/Address/documents/{id} | Delete customer address
[**update_customer_address**](AddressesApi.md#update_customer_address) | **PATCH** /api/dataentities/Address/documents/{id} | Update customer address


# **create_new_customer_address**
> DocumentResponse create_new_customer_address(content_type, accept, create_update_address_requests, var_schema=var_schema)

Create new customer address

Creates new customer address.     > You can use this request to create customer addresses according to any `AD` schema. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for the schemas you are using. Learn more about how to use [Master Data v2 schemas](https://developers.vtex.com/vtex-rest-api/docs/master-data-schema-lifecycle).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.create_update_address_requests import CreateUpdateAddressRequests
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
    api_instance = openapi_client.AddressesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    create_update_address_requests = openapi_client.CreateUpdateAddressRequests() # CreateUpdateAddressRequests | 
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Create new customer address
        api_response = api_instance.create_new_customer_address(content_type, accept, create_update_address_requests, var_schema=var_schema)
        print("The response of AddressesApi->create_new_customer_address:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AddressesApi->create_new_customer_address: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **create_update_address_requests** | [**CreateUpdateAddressRequests**](CreateUpdateAddressRequests.md)|  | 
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

# **delete_customer_address**
> DocumentResponse delete_customer_address(content_type, accept, id)

Delete customer address

Deletes a customer address.

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
    api_instance = openapi_client.AddressesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.

    try:
        # Delete customer address
        api_response = api_instance.delete_customer_address(content_type, accept, id)
        print("The response of AddressesApi->delete_customer_address:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AddressesApi->delete_customer_address: %s\n" % e)
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

# **update_customer_address**
> DocumentResponse update_customer_address(content_type, accept, id, create_update_address_requests, var_schema=var_schema)

Update customer address

Partially updates a customer address.    > You can use this request to update customer addresses according to any `AD` schema. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for the schemas you are using. Learn more about how to use [Master Data v2 schemas](https://developers.vtex.com/vtex-rest-api/docs/master-data-schema-lifecycle).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.create_update_address_requests import CreateUpdateAddressRequests
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
    api_instance = openapi_client.AddressesApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    create_update_address_requests = openapi_client.CreateUpdateAddressRequests() # CreateUpdateAddressRequests | 
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Update customer address
        api_response = api_instance.update_customer_address(content_type, accept, id, create_update_address_requests, var_schema=var_schema)
        print("The response of AddressesApi->update_customer_address:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AddressesApi->update_customer_address: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **create_update_address_requests** | [**CreateUpdateAddressRequests**](CreateUpdateAddressRequests.md)|  | 
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

