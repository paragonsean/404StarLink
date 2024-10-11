# openapi_client.DocumentApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_document_subjects**](DocumentApi.md#get_all_document_subjects) | **GET** /documents/subjects | Get a list of subjects of projects
[**get_document**](DocumentApi.md#get_document) | **GET** /documents/{documentId} | View a single document
[**get_document_progress**](DocumentApi.md#get_document_progress) | **GET** /documents/{documentId}/progress | View a document translation progress
[**get_documents**](DocumentApi.md#get_documents) | **GET** /documents | View your documents
[**get_similar_documents**](DocumentApi.md#get_similar_documents) | **GET** /documents/{documentId}/similars | Find documents similar to this document.
[**get_user_documents**](DocumentApi.md#get_user_documents) | **GET** /{userId}/documents | Get a list of your documents
[**regenerate_preview**](DocumentApi.md#regenerate_preview) | **POST** /documents/{documentId}/regenerate_preview | Regenerate preview and return preview URL for given file
[**use_as_draft**](DocumentApi.md#use_as_draft) | **POST** /documents/{documentId}/use_as_draft | Use the translation of given source manual document as manual draft source for the given target document.
[**use_as_regular**](DocumentApi.md#use_as_regular) | **POST** /documents/{documentId}/use_as_regular | Use the translation of the given manual document as a regular file.


# **get_all_document_subjects**
> List[DocumentSubjects] get_all_document_subjects()

Get a list of subjects of projects

Get a list of subjects of projects

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document_subjects import DocumentSubjects
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
    api_instance = openapi_client.DocumentApi(api_client)

    try:
        # Get a list of subjects of projects
        api_response = api_instance.get_all_document_subjects()
        print("The response of DocumentApi->get_all_document_subjects:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_all_document_subjects: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[DocumentSubjects]**](DocumentSubjects.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of subjects of all projects. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document**
> ContinuousProjectDocument get_document(document_id)

View a single document

View a single document from your MotaWord account with its translation info.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_document import ContinuousProjectDocument
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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 'document_id_example' # str | Document ID or filename

    try:
        # View a single document
        api_response = api_instance.get_document(document_id)
        print("The response of DocumentApi->get_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **str**| Document ID or filename | 

### Return type

[**ContinuousProjectDocument**](ContinuousProjectDocument.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Document |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_progress**
> Progress get_document_progress(document_id)

View a document translation progress

View the translation or proofreading progress of a document in your account. You can also track the progress of a document under the project that it was ordered with.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.progress import Progress
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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 3.4 # float | Document ID

    try:
        # View a document translation progress
        api_response = api_instance.get_document_progress(document_id)
        print("The response of DocumentApi->get_document_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_document_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **float**| Document ID | 

### Return type

[**Progress**](Progress.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Progress information |  -  |
**404** | DocumentNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_documents**
> DocumentList get_documents(recent=recent, search=search, type_filter=type_filter, language_code=language_code, page=page, per_page=per_page, order_by=order_by, order_type=order_type, var_with=var_with)

View your documents

View a list of files and documents that you have translations for. This endpoint lets you view your MotaWord account as a multilingual translated file repository, without needing to go through your projects to interact with files in them.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document_list import DocumentList
from openapi_client.models.list_order_type import ListOrderType
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
    api_instance = openapi_client.DocumentApi(api_client)
    recent = True # bool | When true, this will return the most 4 recent active documents. (optional)
    search = 'search_example' # str |  (optional)
    type_filter = ALL # str |  (optional) (default to ALL)
    language_code = 'language_code_example' # str | searches in source language of documents, in source and target languages of document's quote (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)
    order_by = updated_at # str |  (optional) (default to updated_at)
    order_type = openapi_client.ListOrderType() # ListOrderType |  (optional)
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # View your documents
        api_response = api_instance.get_documents(recent=recent, search=search, type_filter=type_filter, language_code=language_code, page=page, per_page=per_page, order_by=order_by, order_type=order_type, var_with=var_with)
        print("The response of DocumentApi->get_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recent** | **bool**| When true, this will return the most 4 recent active documents. | [optional] 
 **search** | **str**|  | [optional] 
 **type_filter** | **str**|  | [optional] [default to ALL]
 **language_code** | **str**| searches in source language of documents, in source and target languages of document&#39;s quote | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]
 **order_by** | **str**|  | [optional] [default to updated_at]
 **order_type** | [**ListOrderType**](.md)|  | [optional] 
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
**200** | Document list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_similar_documents**
> DocumentList get_similar_documents(document_id, per_page=per_page, var_with=var_with)

Find documents similar to this document.

Find documents similar to this document. Optionally, include translation information.

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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 56 # int | Document ID
    per_page = 1 # int | Determines the number of similar documents to return. (optional) (default to 1)
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # Find documents similar to this document.
        api_response = api_instance.get_similar_documents(document_id, per_page=per_page, var_with=var_with)
        print("The response of DocumentApi->get_similar_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_similar_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **int**| Document ID | 
 **per_page** | **int**| Determines the number of similar documents to return. | [optional] [default to 1]
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
**200** | Document list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_documents**
> DocumentList get_user_documents(user_id, recent=recent, search=search, type_filter=type_filter, language_code=language_code, page=page, per_page=per_page, order_by=order_by, order_type=order_type)

Get a list of your documents

Get a list of your documents

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.document_list import DocumentList
from openapi_client.models.list_order_type import ListOrderType
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
    api_instance = openapi_client.DocumentApi(api_client)
    user_id = 56 # int | User ID
    recent = True # bool | When true, this will return the most 4 recent active documents. (optional)
    search = 'search_example' # str |  (optional)
    type_filter = ALL # str |  (optional) (default to ALL)
    language_code = 'language_code_example' # str | searches in source language of documents, in source and target languages of document's quote (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)
    order_by = updated_at # str |  (optional) (default to updated_at)
    order_type = openapi_client.ListOrderType() # ListOrderType |  (optional)

    try:
        # Get a list of your documents
        api_response = api_instance.get_user_documents(user_id, recent=recent, search=search, type_filter=type_filter, language_code=language_code, page=page, per_page=per_page, order_by=order_by, order_type=order_type)
        print("The response of DocumentApi->get_user_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->get_user_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| User ID | 
 **recent** | **bool**| When true, this will return the most 4 recent active documents. | [optional] 
 **search** | **str**|  | [optional] 
 **type_filter** | **str**|  | [optional] [default to ALL]
 **language_code** | **str**| searches in source language of documents, in source and target languages of document&#39;s quote | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]
 **order_by** | **str**|  | [optional] [default to updated_at]
 **order_type** | [**ListOrderType**](.md)|  | [optional] 

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
**200** | Document list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **regenerate_preview**
> RegeneratePreviewResponse regenerate_preview(document_id)

Regenerate preview and return preview URL for given file

Regenerate preview and return preview URL for given file

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.regenerate_preview_response import RegeneratePreviewResponse
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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 56 # int | Document ID

    try:
        # Regenerate preview and return preview URL for given file
        api_response = api_instance.regenerate_preview(document_id)
        print("The response of DocumentApi->regenerate_preview:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->regenerate_preview: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **int**| Document ID | 

### Return type

[**RegeneratePreviewResponse**](RegeneratePreviewResponse.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RegeneratePreviewResponse |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **use_as_draft**
> OperationStatus use_as_draft(document_id, use_as_draft_payload=use_as_draft_payload)

Use the translation of given source manual document as manual draft source for the given target document.

Use the translation of given source manual document as manual draft source for the given target document.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.use_as_draft_payload import UseAsDraftPayload
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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 56 # int | Document ID
    use_as_draft_payload = openapi_client.UseAsDraftPayload() # UseAsDraftPayload |  (optional)

    try:
        # Use the translation of given source manual document as manual draft source for the given target document.
        api_response = api_instance.use_as_draft(document_id, use_as_draft_payload=use_as_draft_payload)
        print("The response of DocumentApi->use_as_draft:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->use_as_draft: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **int**| Document ID | 
 **use_as_draft_payload** | [**UseAsDraftPayload**](UseAsDraftPayload.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation status |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **use_as_regular**
> OperationStatus use_as_regular(document_id, use_as_regular_payload=use_as_regular_payload)

Use the translation of the given manual document as a regular file.

Use the translation of the given manual document as a regular file.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.use_as_regular_payload import UseAsRegularPayload
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
    api_instance = openapi_client.DocumentApi(api_client)
    document_id = 56 # int | Document ID
    use_as_regular_payload = openapi_client.UseAsRegularPayload() # UseAsRegularPayload |  (optional)

    try:
        # Use the translation of the given manual document as a regular file.
        api_response = api_instance.use_as_regular(document_id, use_as_regular_payload=use_as_regular_payload)
        print("The response of DocumentApi->use_as_regular:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DocumentApi->use_as_regular: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | **int**| Document ID | 
 **use_as_regular_payload** | [**UseAsRegularPayload**](UseAsRegularPayload.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation status |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

