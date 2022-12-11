# openapi_client.StyleGuideApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_style_guide**](StyleGuideApi.md#create_style_guide) | **POST** /projects/{projectId}/styleguides | Upload a new style guide
[**delete_style_guide**](StyleGuideApi.md#delete_style_guide) | **DELETE** /projects/{projectId}/styleguides/{styleGuideId} | Delete a style guide
[**download_global_style_guide**](StyleGuideApi.md#download_global_style_guide) | **GET** /styleguide | Download account style guide
[**download_style_guide**](StyleGuideApi.md#download_style_guide) | **GET** /projects/{projectId}/styleguides/{styleGuideId}/download | Download a style guide
[**get_style_guide**](StyleGuideApi.md#get_style_guide) | **GET** /projects/{projectId}/styleguides/{styleGuideId} | View a style guide
[**get_style_guides**](StyleGuideApi.md#get_style_guides) | **GET** /projects/{projectId}/styleguides | View style guides
[**update_global_style_guide**](StyleGuideApi.md#update_global_style_guide) | **POST** /styleguide | Create or update the account style guide
[**update_style_guide**](StyleGuideApi.md#update_style_guide) | **PUT** /projects/{projectId}/styleguides/{styleGuideId} | Update a style guide


# **create_style_guide**
> StyleGuideList create_style_guide(project_id, style_guide_upload_request=style_guide_upload_request)

Upload a new style guide

Upload a new style guide

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.style_guide_list import StyleGuideList
from openapi_client.models.style_guide_upload_request import StyleGuideUploadRequest
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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    style_guide_upload_request = openapi_client.StyleGuideUploadRequest() # StyleGuideUploadRequest |  (optional)

    try:
        # Upload a new style guide
        api_response = api_instance.create_style_guide(project_id, style_guide_upload_request=style_guide_upload_request)
        print("The response of StyleGuideApi->create_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->create_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **style_guide_upload_request** | [**StyleGuideUploadRequest**](StyleGuideUploadRequest.md)|  | [optional] 

### Return type

[**StyleGuideList**](StyleGuideList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created style guide model or a list of new style guide models |  -  |
**400** | FileTooLarge |  -  |
**404** | ProjectNotFound |  -  |
**405** | UnsupportedStyleGuideFormat |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_style_guide**
> OperationStatus delete_style_guide(project_id, style_guide_id)

Delete a style guide

Delete the existing style guide from the project.

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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    style_guide_id = 56 # int | Style Guide ID

    try:
        # Delete a style guide
        api_response = api_instance.delete_style_guide(project_id, style_guide_id)
        print("The response of StyleGuideApi->delete_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->delete_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **style_guide_id** | **int**| Style Guide ID | 

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
**200** | Style guide deleted successfully |  -  |
**404** | StyleGuideNotFound |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_global_style_guide**
> str download_global_style_guide()

Download account style guide

Download your account's global style guide. This endpoint is available only for corporate account customers. This style guide will be automatically attached to each new project under your account.

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
    api_instance = openapi_client.StyleGuideApi(api_client)

    try:
        # Download account style guide
        api_response = api_instance.download_global_style_guide()
        print("The response of StyleGuideApi->download_global_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->download_global_style_guide: %s\n" % e)
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
**200** | Style guide file streamed. |  -  |
**404** | StyleGuideNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_style_guide**
> str download_style_guide(project_id, style_guide_id)

Download a style guide

Download a previously uploaded style guide file.

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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    style_guide_id = 56 # int | Style Guide ID

    try:
        # Download a style guide
        api_response = api_instance.download_style_guide(project_id, style_guide_id)
        print("The response of StyleGuideApi->download_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->download_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **style_guide_id** | **int**| Style Guide ID | 

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
**200** | Style guide streamed |  -  |
**404** | StyleGuideNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_style_guide**
> StyleGuide get_style_guide(project_id, style_guide_id, var_with=var_with)

View a style guide

View the details of a style guide uploaded to a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.style_guide import StyleGuide
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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    style_guide_id = 56 # int | Style Guide ID
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # View a style guide
        api_response = api_instance.get_style_guide(project_id, style_guide_id, var_with=var_with)
        print("The response of StyleGuideApi->get_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->get_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **style_guide_id** | **int**| Style Guide ID | 
 **var_with** | [**List[str]**](str.md)| Attach further information. Possible values &#39;preview&#39; to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]&#x3D;preview for single document/style guide calls. | [optional] 

### Return type

[**StyleGuide**](StyleGuide.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Style guide model |  -  |
**404** | StyleGuideNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_style_guides**
> StyleGuideList get_style_guides(project_id, var_with=var_with)

View style guides

View a list of style guides in your project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.style_guide_list import StyleGuideList
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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    var_with = ['var_with_example'] # List[str] | Attach further information. Possible values 'preview' to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]=preview for single document/style guide calls. (optional)

    try:
        # View style guides
        api_response = api_instance.get_style_guides(project_id, var_with=var_with)
        print("The response of StyleGuideApi->get_style_guides:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->get_style_guides: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **var_with** | [**List[str]**](str.md)| Attach further information. Possible values &#39;preview&#39; to fetch temporary preview URLs. This is NOT recommended to be used with list calls. Only use with[]&#x3D;preview for single document/style guide calls. | [optional] 

### Return type

[**StyleGuideList**](StyleGuideList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of style guide models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_global_style_guide**
> OperationStatus update_global_style_guide(account_style_guide_upload_request=account_style_guide_upload_request)

Create or update the account style guide

Update your corporate account's global style guide. This endpoint is available only for corporate account customers. This style guide will be automatically attached to each new project under your account.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.account_style_guide_upload_request import AccountStyleGuideUploadRequest
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
    api_instance = openapi_client.StyleGuideApi(api_client)
    account_style_guide_upload_request = openapi_client.AccountStyleGuideUploadRequest() # AccountStyleGuideUploadRequest |  (optional)

    try:
        # Create or update the account style guide
        api_response = api_instance.update_global_style_guide(account_style_guide_upload_request=account_style_guide_upload_request)
        print("The response of StyleGuideApi->update_global_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->update_global_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_style_guide_upload_request** | [**AccountStyleGuideUploadRequest**](AccountStyleGuideUploadRequest.md)|  | [optional] 

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
**400** | FileTooLarge FileTooSmall NoFileUploaded MissingCorporateAccount |  -  |
**405** | UnsupportedStyleGuideFormat |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_style_guide**
> StyleGuide update_style_guide(project_id, style_guide_id, style_guide_upload_request=style_guide_upload_request)

Update a style guide

Update the existing style guide in the project. Public users are allowed to have only 1 style guide per project and file name and contents will replaced with the new style guide that you are uploading via this endpoint.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.style_guide import StyleGuide
from openapi_client.models.style_guide_upload_request import StyleGuideUploadRequest
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
    api_instance = openapi_client.StyleGuideApi(api_client)
    project_id = 56 # int | Project ID
    style_guide_id = 56 # int | Style guide ID
    style_guide_upload_request = openapi_client.StyleGuideUploadRequest() # StyleGuideUploadRequest |  (optional)

    try:
        # Update a style guide
        api_response = api_instance.update_style_guide(project_id, style_guide_id, style_guide_upload_request=style_guide_upload_request)
        print("The response of StyleGuideApi->update_style_guide:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StyleGuideApi->update_style_guide: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **style_guide_id** | **int**| Style guide ID | 
 **style_guide_upload_request** | [**StyleGuideUploadRequest**](StyleGuideUploadRequest.md)|  | [optional] 

### Return type

[**StyleGuide**](StyleGuide.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated style guide model |  -  |
**400** | FileTooLarge |  -  |
**404** | StyleGuideNotFound |  -  |
**405** | UnsupportedStyleGuideFormat |  -  |
**409** | ProjectAlreadyStarted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

