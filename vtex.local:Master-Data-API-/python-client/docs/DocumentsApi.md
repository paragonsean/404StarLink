# openapi_client.DocumentsApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createnewdocument**](DocumentsApi.md#createnewdocument) | **POST** /api/dataentities/{dataEntityName}/documents | Create new document
[**createorupdatepartialdocument**](DocumentsApi.md#createorupdatepartialdocument) | **PATCH** /api/dataentities/{dataEntityName}/documents | Create partial document
[**deletedocument**](DocumentsApi.md#deletedocument) | **DELETE** /api/dataentities/{dataEntityName}/documents/{id} | Delete document
[**getdocument**](DocumentsApi.md#getdocument) | **GET** /api/dataentities/{dataEntityName}/documents/{id} | Get document
[**updateentiredocument**](DocumentsApi.md#updateentiredocument) | **PUT** /api/dataentities/{dataEntityName}/documents/{id} | Update entire document
[**updatepartialdocument**](DocumentsApi.md#updatepartialdocument) | **PATCH** /api/dataentities/{dataEntityName}/documents/{id} | Update partial document


# **createnewdocument**
> DocumentResponse createnewdocument(content_type, accept, data_entity_name, request_body, var_schema=var_schema)

Create new document

This request allows you to create a new document corresponding to a given data entity. For example, you can create a new customer profile or address.    > You can use this request to create documents for any given data entity. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for each document you wish to create.    ## Example use cases    ### Client profile    In order to create a new customer profile, choose the `CL` data entity and send a request similar to this:    POST  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Client/documents  ```    Request body  ```json  {      \"email\": \"clark.kent@examplemail.com\",      \"firstName\": \"Clark\",      \"lastName\": \"Kent\",      \"phone\": \"+12025550195\",      \"documentType\": \"CPF\",      \"document\": \"12345678900\"      \"isCorporate\": false,      \"isNewsletterOptIn\": false,      \"localeDefault\": \"en-US\"   }  ```    ### Client address    For a new address, the data entity is `AD` and the request would look like this:    POST  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Address/documents  ```    Request body  ```json  {      \"addressName\": \"My House\",      \"addressType\": \"residential\",      \"city\": \"Metropolis\",      \"complement\": \"\",      \"country\": \"USA\",      \"postalCode\": \"11375\",      \"receiverName\": \"Clark Kent\",      \"reference\": null,      \"state\": \"MP\",      \"street\": \"Baker Street\",      \"neighborhood\": \"Upper east side\",      \"number\": \"21\",      \"userId\": \"7e03m794-a33a-11e9-84rt6-0adfa64s5a8e\"  }  ```

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
    api_instance = openapi_client.DocumentsApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    request_body = {'key': 'request_body_example'} # Dict[str, str] | 
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Create new document
        api_response = api_instance.createnewdocument(content_type, accept, data_entity_name, request_body, var_schema=var_schema)
        print("The response of DocumentsApi->createnewdocument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentsApi->createnewdocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **request_body** | [**Dict[str, str]**](str.md)|  | 
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

# **createorupdatepartialdocument**
> DocumentResponse createorupdatepartialdocument(data_entity_name, content_type, accept, request_body, var_schema=var_schema)

Create partial document

This request allows you to partially update a document corresponding to a given data entity.    > You can use this request to create documents for any given data entity. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for each document you wish to update.    ## Example use cases    ### Client profile    In order to create a customer profile's `phone` and `isNewsletterOptIn` fields, choose the `CL` data entity and send a request similar to this:    PATCH  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Client/documents  ```    Request body  ```json  {      \"phone\": \"+12025550195\",      \"isNewsletterOptIn\": false   }  ```    ### Client address    In order to update the `receiverName` of an existing address, the data entity is `AD` and the request would look like this:    PATCH  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Address/documents  ```    Request body  ```json  {      \"receiverName\": \"Lois Lane\"  }  ```

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
    api_instance = openapi_client.DocumentsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    request_body = {'key': 'request_body_example'} # Dict[str, str] | JSON with the fields to be updated.
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Create partial document
        api_response = api_instance.createorupdatepartialdocument(data_entity_name, content_type, accept, request_body, var_schema=var_schema)
        print("The response of DocumentsApi->createorupdatepartialdocument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentsApi->createorupdatepartialdocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **request_body** | [**Dict[str, str]**](str.md)| JSON with the fields to be updated. | 
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

# **deletedocument**
> deletedocument(data_entity_name, content_type, accept, id)

Delete document

It allows to delete a document.

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
    api_instance = openapi_client.DocumentsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.

    try:
        # Delete document
        api_instance.deletedocument(data_entity_name, content_type, accept, id)
    except Exception as e:
        print("Exception when calling DocumentsApi->deletedocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getdocument**
> UsingFieldsAll getdocument(data_entity_name, content_type, accept, id)

Get document

Gets document by ID.    > Assign the `_fields` parameter in the query string to retrieve the desired fields. If you want to return all the fields use `_fields=_all`.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.using_fields_all import UsingFieldsAll
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
    api_instance = openapi_client.DocumentsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    content_type = 'application/json' # str | Type of the content being sent.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.

    try:
        # Get document
        api_response = api_instance.getdocument(data_entity_name, content_type, accept, id)
        print("The response of DocumentsApi->getdocument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentsApi->getdocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **content_type** | **str**| Type of the content being sent. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 

### Return type

[**UsingFieldsAll**](UsingFieldsAll.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sucessful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateentiredocument**
> DocumentResponse updateentiredocument(data_entity_name, accept, id, request_body, where=where, var_schema=var_schema)

Update entire document

Update an existing document corresponding to a given data entity. For example, you can update a customer profile or address.    > You can use this request to update documents in any given data entity. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for each document you wish to update.    ## Example use cases    ### Client profile    In order to update an existing customer profile, choose the `CL` data entity and send a request similar to this:    PUT  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Client/documents/123456789abc  ```    Request body  ```json  {      \"email\": \"clark.kent@examplemail.com\",      \"firstName\": \"Clark\",      \"lastName\": \"Kent\",      \"phone\": \"+12025550195\",      \"documentType\": \"CPF\",      \"document\": \"12345678900\"      \"isCorporate\": false,      \"isNewsletterOptIn\": false,      \"localeDefault\": \"en-US\"   }  ```    ### Client address    To update an address, the data entity is `AD` and the request would look like this:    PUT  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Address/documents/123456789abc  ```    Request body  ```json  {      \"addressName\": \"My House\",      \"addressType\": \"residential\",      \"city\": \"Metropolis\",      \"complement\": \"\",      \"country\": \"USA\",      \"postalCode\": \"11375\",      \"receiverName\": \"Clark Kent\",      \"reference\": null,      \"state\": \"MP\",      \"street\": \"Baker Street\",      \"neighborhood\": \"Upper east side\",      \"number\": \"21\",      \"userId\": \"7e03m794-a33a-11e9-84rt6-0adfa64s5a8e\"  }  ```

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
    api_instance = openapi_client.DocumentsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    request_body = {'key': 'request_body_example'} # Dict[str, str] | 
    where = 'firstName is not null.' # str | Filter specification. (optional)
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Update entire document
        api_response = api_instance.updateentiredocument(data_entity_name, accept, id, request_body, where=where, var_schema=var_schema)
        print("The response of DocumentsApi->updateentiredocument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentsApi->updateentiredocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **request_body** | [**Dict[str, str]**](str.md)|  | 
 **where** | **str**| Filter specification. | [optional] 
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

# **updatepartialdocument**
> DocumentResponse updatepartialdocument(data_entity_name, accept, id, request_body, where=where, var_schema=var_schema)

Update partial document

This request allows you to partially update a document corresponding to a given data entity. For example, you can update some fields of a customer profile or address.    > You can use this request to update documents for any given data entity. Because of this, you are not restricted to using the fields exemplified below in your requests. But you should be aware of the fields allowed or required for each document you wish to update.    ## Example use cases    ### Client profile    In order to update a customer profile's `phone` and `isNewsletterOptIn` fields, choose the `CL` data entity and send a request similar to this:    PATCH  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Client/documents/123456789abc  ```    Request body  ```json  {      \"phone\": \"+12025550195\",      \"isNewsletterOptIn\": false   }  ```    ### Client address    In order to update the `receiverName` of an existing address, the data entity is `AD` and the request would look like this:    PATCH  ```  https://examplestore.vtexcommercestable.com.br/api/dataentities/Address/documents/123456789abc  ```    Request body  ```json  {      \"receiverName\": \"Lois Lane\"  }  ```

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
    api_instance = openapi_client.DocumentsApi(api_client)
    data_entity_name = 'Client' # str | Name of the data entity. Defined by the api. Examples of native data entities you can use are `CL` for client profiles and `AD` for client addresses.
    accept = 'application/json' # str | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand.
    id = 'Client-b818cbda-e489-11e6-94f4-0ac138d2d42e' # str | ID of the Document.
    request_body = {'key': 'request_body_example'} # Dict[str, str] | 
    where = 'firstName is not null.' # str | Filter specification. (optional)
    var_schema = 'schema' # str | Name of the schema the document to be created needs to be compliant with. (optional)

    try:
        # Update partial document
        api_response = api_instance.updatepartialdocument(data_entity_name, accept, id, request_body, where=where, var_schema=var_schema)
        print("The response of DocumentsApi->updatepartialdocument:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentsApi->updatepartialdocument: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_entity_name** | **str**| Name of the data entity. Defined by the api. Examples of native data entities you can use are &#x60;CL&#x60; for client profiles and &#x60;AD&#x60; for client addresses. | 
 **accept** | **str**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand. | 
 **id** | **str**| ID of the Document. | 
 **request_body** | [**Dict[str, str]**](str.md)|  | 
 **where** | **str**| Filter specification. | [optional] 
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

