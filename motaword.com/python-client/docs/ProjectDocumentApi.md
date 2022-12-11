# openapi_client.ProjectDocumentApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_project_document**](ProjectDocumentApi.md#create_project_document) | **POST** /projects/{projectId}/documents | Upload a new document
[**delete_project_document**](ProjectDocumentApi.md#delete_project_document) | **DELETE** /projects/{projectId}/documents/{documentId} | Delete the document
[**download_project_document**](ProjectDocumentApi.md#download_project_document) | **GET** /projects/{projectId}/documents/{documentId}/download | Download a project source document
[**download_translated_document_for_language**](ProjectDocumentApi.md#download_translated_document_for_language) | **GET** /projects/{projectId}/documents/{documentId}/translations/download/{language} | Download translated document
[**get_project_document**](ProjectDocumentApi.md#get_project_document) | **GET** /projects/{projectId}/documents/{documentId} | View a project source document
[**get_project_documents**](ProjectDocumentApi.md#get_project_documents) | **GET** /projects/{projectId}/documents | View project source documents
[**update_project_document**](ProjectDocumentApi.md#update_project_document) | **POST** /projects/{projectId}/documents/{documentId} | Update the document.


# **create_project_document**
> DocumentList create_project_document(project_id, document_updates=document_updates)

Upload a new document

Upload a new document

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document_list import DocumentList
from openapi_client.models.document_updates import DocumentUpdates
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_updates = openapi_client.DocumentUpdates() # DocumentUpdates |  (optional)

    try:
        # Upload a new document
        api_response = api_instance.create_project_document(project_id, document_updates=document_updates)
        print("The response of ProjectDocumentApi->create_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->create_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_updates** | [**DocumentUpdates**](DocumentUpdates.md)|  | [optional] 

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of successfully added new documents. |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**404** | ProjectNotFound |  -  |
**405** | UnsupportedDocumentFormat |  -  |
**406** | InvalidDocumentScheme |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_document**
> OperationStatus delete_project_document(project_id, document_id)

Delete the document

Delete the document

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID

    try:
        # Delete the document
        api_response = api_instance.delete_project_document(project_id, document_id)
        print("The response of ProjectDocumentApi->delete_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->delete_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Document deleted successfully |  -  |
**404** | DocumentNotFound |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_project_document**
> str download_project_document(project_id, document_id)

Download a project source document

Download an actual source file you uploaded to be translated in your project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID

    try:
        # Download a project source document
        api_response = api_instance.download_project_document(project_id, document_id)
        print("The response of ProjectDocumentApi->download_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->download_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 

### Return type

**str**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Document streamed |  -  |
**404** | DocumentNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_translated_document_for_language**
> bytearray download_translated_document_for_language(project_id, document_id, language, certified=certified)

Download translated document

Download translated document in the given target language.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID
    language = 'language_example' # str | Target language code.
    certified = True # bool | Download certified translation (optional)

    try:
        # Download translated document
        api_response = api_instance.download_translated_document_for_language(project_id, document_id, language, certified=certified)
        print("The response of ProjectDocumentApi->download_translated_document_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->download_translated_document_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 
 **language** | **str**| Target language code. | 
 **certified** | **bool**| Download certified translation | [optional] 

### Return type

**bytearray**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | File |  -  |
**404** | DocumentNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_document**
> Document get_project_document(project_id, document_id, var_with=var_with)

View a project source document

View the details of a source file you uploaded to be translated in your project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document import Document
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # View a project source document
        api_response = api_instance.get_project_document(project_id, document_id, var_with=var_with)
        print("The response of ProjectDocumentApi->get_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->get_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 
 **var_with** | [**List[str]**](str.md)| Attach further information. Possible values &#39;preview&#39; to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]&#x3D;preview for single document/style guide calls. | [optional] 

### Return type

[**Document**](Document.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Document model |  -  |
**404** | DocumentNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_documents**
> DocumentList get_project_documents(project_id, var_with=var_with)

View project source documents

Get a list of source files you uploaded to be translated in your project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document_list import DocumentList
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # View project source documents
        api_response = api_instance.get_project_documents(project_id, var_with=var_with)
        print("The response of ProjectDocumentApi->get_project_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->get_project_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **var_with** | [**List[str]**](str.md)| Attach further information. Possible values &#39;preview&#39; to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]&#x3D;preview for single document/style guide calls. | [optional] 

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of document models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_project_document**
> Document update_project_document(project_id, document_id, document_upload_request=document_upload_request)

Update the document.

Update the document. File name and contents will replaced with the new one.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document import Document
from openapi_client.models.document_upload_request import DocumentUploadRequest
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
    api_instance = openapi_client.ProjectDocumentApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID
    document_upload_request = openapi_client.DocumentUploadRequest() # DocumentUploadRequest |  (optional)

    try:
        # Update the document.
        api_response = api_instance.update_project_document(project_id, document_id, document_upload_request=document_upload_request)
        print("The response of ProjectDocumentApi->update_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectDocumentApi->update_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 
 **document_upload_request** | [**DocumentUploadRequest**](DocumentUploadRequest.md)|  | [optional] 

### Return type

[**Document**](Document.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated document model |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**404** | DocumentNotFound |  -  |
**405** | UnsupportedDocumentFormat |  -  |
**406** | InvalidDocumentScheme |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

