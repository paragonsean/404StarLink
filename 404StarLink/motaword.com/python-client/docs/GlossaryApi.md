# openapi_client.GlossaryApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_glossary**](GlossaryApi.md#create_glossary) | **POST** /projects/{projectId}/glossaries | Upload a glossary file
[**delete_glossary**](GlossaryApi.md#delete_glossary) | **DELETE** /projects/{projectId}/glossaries/{glossaryId} | Delete a glossary
[**download_global_glossary**](GlossaryApi.md#download_global_glossary) | **GET** /glossary | Download account glossary.
[**download_glossary**](GlossaryApi.md#download_glossary) | **GET** /projects/{projectId}/glossaries/{glossaryId}/download | Download a glossary
[**get_glossaries**](GlossaryApi.md#get_glossaries) | **GET** /projects/{projectId}/glossaries | View glossaries
[**get_glossary**](GlossaryApi.md#get_glossary) | **GET** /projects/{projectId}/glossaries/{glossaryId} | View a glossary
[**update_global_glossary**](GlossaryApi.md#update_global_glossary) | **POST** /glossary | Create or update the account glossary
[**update_glossary**](GlossaryApi.md#update_glossary) | **PUT** /projects/{projectId}/glossaries/{glossaryId} | Update a glossary


# **create_glossary**
> Glossary create_glossary(project_id, glossary_upload_request=glossary_upload_request)

Upload a glossary file

Upload a new glossary file to your project to be used during translation. Glossaries can be CSV or TBX files.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.glossary import Glossary
from openapi_client.models.glossary_upload_request import GlossaryUploadRequest
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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID
    glossary_upload_request = openapi_client.GlossaryUploadRequest() # GlossaryUploadRequest |  (optional)

    try:
        # Upload a glossary file
        api_response = api_instance.create_glossary(project_id, glossary_upload_request=glossary_upload_request)
        print("The response of GlossaryApi->create_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->create_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **glossary_upload_request** | [**GlossaryUploadRequest**](GlossaryUploadRequest.md)|  | [optional] 

### Return type

[**Glossary**](Glossary.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created glossary model. |  -  |
**400** | FileTooLarge |  -  |
**404** | ProjectNotFound |  -  |
**405** | UnsupportedGlossaryFormat |  -  |
**406** | ProjectAlreadyHasGlossary |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_glossary**
> OperationStatus delete_glossary(project_id, glossary_id)

Delete a glossary

Delete the existing glossary from the project.

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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID
    glossary_id = 56 # int | Glossary ID

    try:
        # Delete a glossary
        api_response = api_instance.delete_glossary(project_id, glossary_id)
        print("The response of GlossaryApi->delete_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->delete_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **glossary_id** | **int**| Glossary ID | 

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
**200** | Glossary deleted successfully |  -  |
**404** | GlossaryNotFound |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_global_glossary**
> str download_global_glossary()

Download account glossary.

Download your corporate account's global glossary. This endpoint is available only for corporate account customers. This glossary will be automatically attached to each new project under your account.

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
    api_instance = openapi_client.GlossaryApi(api_client)

    try:
        # Download account glossary.
        api_response = api_instance.download_global_glossary()
        print("The response of GlossaryApi->download_global_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->download_global_glossary: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

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
**200** | Glossary file streamed. |  -  |
**404** | GlossaryNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_glossary**
> str download_glossary(project_id, glossary_id)

Download a glossary

Download a previously uploaded glossary file.

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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID
    glossary_id = 56 # int | Glossary ID

    try:
        # Download a glossary
        api_response = api_instance.download_glossary(project_id, glossary_id)
        print("The response of GlossaryApi->download_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->download_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **glossary_id** | **int**| Glossary ID | 

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
**200** | Glossary streamed |  -  |
**404** | GlossaryNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_glossaries**
> GlossaryList get_glossaries(project_id)

View glossaries

View a list of glossaries previously uploaded to the project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.glossary_list import GlossaryList
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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # View glossaries
        api_response = api_instance.get_glossaries(project_id)
        print("The response of GlossaryApi->get_glossaries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->get_glossaries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**GlossaryList**](GlossaryList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of glossary models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_glossary**
> Glossary get_glossary(project_id, glossary_id)

View a glossary

View the details of a glossary file uploaded to a project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.glossary import Glossary
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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID
    glossary_id = 56 # int | Glossary ID

    try:
        # View a glossary
        api_response = api_instance.get_glossary(project_id, glossary_id)
        print("The response of GlossaryApi->get_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->get_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **glossary_id** | **int**| Glossary ID | 

### Return type

[**Glossary**](Glossary.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Glossary model |  -  |
**404** | GlossaryNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_global_glossary**
> OperationStatus update_global_glossary(account_glossary_upload_request=account_glossary_upload_request)

Create or update the account glossary

Update your corporate account's global glossary. This endpoint is available only for corporate account customers. This glossary will be automatically attached to each new project under your account.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.account_glossary_upload_request import AccountGlossaryUploadRequest
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
    api_instance = openapi_client.GlossaryApi(api_client)
    account_glossary_upload_request = openapi_client.AccountGlossaryUploadRequest() # AccountGlossaryUploadRequest |  (optional)

    try:
        # Create or update the account glossary
        api_response = api_instance.update_global_glossary(account_glossary_upload_request=account_glossary_upload_request)
        print("The response of GlossaryApi->update_global_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->update_global_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_glossary_upload_request** | [**AccountGlossaryUploadRequest**](AccountGlossaryUploadRequest.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | FileTooLarge FileTooSmall NoFileUploaded |  -  |
**405** | UnsupportedGlossaryFormat |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_glossary**
> Glossary update_glossary(project_id, glossary_id, glossary_upload_request=glossary_upload_request)

Update a glossary

Update the existing glossary file in the project. Public users are allowed to have only 1 glossary per project and file name and contents will replaced with the new glossary file that you are uploading via this endpoint.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.glossary import Glossary
from openapi_client.models.glossary_upload_request import GlossaryUploadRequest
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
    api_instance = openapi_client.GlossaryApi(api_client)
    project_id = 56 # int | Project ID
    glossary_id = 56 # int | Glossary ID
    glossary_upload_request = openapi_client.GlossaryUploadRequest() # GlossaryUploadRequest |  (optional)

    try:
        # Update a glossary
        api_response = api_instance.update_glossary(project_id, glossary_id, glossary_upload_request=glossary_upload_request)
        print("The response of GlossaryApi->update_glossary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GlossaryApi->update_glossary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **glossary_id** | **int**| Glossary ID | 
 **glossary_upload_request** | [**GlossaryUploadRequest**](GlossaryUploadRequest.md)|  | [optional] 

### Return type

[**Glossary**](Glossary.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated glossary model |  -  |
**400** | FileTooLarge |  -  |
**404** | GlossaryNotFound |  -  |
**405** | UnsupportedGlossaryFormat |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

