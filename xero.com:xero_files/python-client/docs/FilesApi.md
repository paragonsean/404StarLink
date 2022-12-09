# openapi_client.FilesApi

All URIs are relative to *https://api.xero.com/files.xro/1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_file_association**](FilesApi.md#create_file_association) | **POST** /Files/{FileId}/Associations | Creates a new file association
[**create_folder**](FilesApi.md#create_folder) | **POST** /Folders | Creates a new folder
[**delete_file**](FilesApi.md#delete_file) | **DELETE** /Files/{FileId} | Deletes a specific file
[**delete_file_association**](FilesApi.md#delete_file_association) | **DELETE** /Files/{FileId}/Associations/{ObjectId} | Deletes an existing file association
[**delete_folder**](FilesApi.md#delete_folder) | **DELETE** /Folders/{FolderId} | Deletes a folder
[**get_associations_by_object**](FilesApi.md#get_associations_by_object) | **GET** /Associations/{ObjectId} | Retrieves an association object using a unique object ID
[**get_file**](FilesApi.md#get_file) | **GET** /Files/{FileId} | Retrieves a file by a unique file ID
[**get_file_associations**](FilesApi.md#get_file_associations) | **GET** /Files/{FileId}/Associations | Retrieves a specific file associations
[**get_file_content**](FilesApi.md#get_file_content) | **GET** /Files/{FileId}/Content | Retrieves the content of a specific file
[**get_files**](FilesApi.md#get_files) | **GET** /Files | Retrieves files
[**get_folder**](FilesApi.md#get_folder) | **GET** /Folders/{FolderId} | Retrieves specific folder by using a unique folder ID
[**get_folders**](FilesApi.md#get_folders) | **GET** /Folders | Retrieves folders
[**get_inbox**](FilesApi.md#get_inbox) | **GET** /Inbox | Retrieves inbox folder
[**update_file**](FilesApi.md#update_file) | **PUT** /Files/{FileId} | Update a file
[**update_folder**](FilesApi.md#update_folder) | **PUT** /Folders/{FolderId} | Updates an existing folder
[**upload_file**](FilesApi.md#upload_file) | **POST** /Files | Uploads a File


# **create_file_association**
> Association create_file_association(xero_tenant_id, file_id, association=association)

Creates a new file association

By passing in the appropriate options, you can create a new folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.association import Association
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object
    association = { "ObjectId": "1270bf7c-5d18-473a-9231-1e36c4bd33ed", "ObjectGroup": "Contact", "ObjectType": "Business" } # Association |  (optional)

    try:
        # Creates a new file association
        api_response = api_instance.create_file_association(xero_tenant_id, file_id, association=association)
        print("The response of FilesApi->create_file_association:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->create_file_association: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 
 **association** | [**Association**](Association.md)|  | [optional] 

### Return type

[**Association**](Association.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A successful request |  -  |
**400** | invalid input, object invalid |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_folder**
> Folder create_folder(xero_tenant_id, folder=folder)

Creates a new folder

By passing in the appropriate properties, you can create a new folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.folder import Folder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    folder = { "Name": "My Docs" } # Folder |  (optional)

    try:
        # Creates a new folder
        api_response = api_instance.create_folder(xero_tenant_id, folder=folder)
        print("The response of FilesApi->create_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->create_folder: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **folder** | [**Folder**](Folder.md)|  | [optional] 

### Return type

[**Folder**](Folder.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |
**400** | invalid input, object invalid |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file**
> delete_file(xero_tenant_id, file_id)

Deletes a specific file

Delete a specific file

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object

    try:
        # Deletes a specific file
        api_instance.delete_file(xero_tenant_id, file_id)
    except Exception as e:
        print("Exception when calling FilesApi->delete_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful deletion - return response 204 no content |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file_association**
> delete_file_association(xero_tenant_id, file_id, object_id)

Deletes an existing file association

By passing in the appropriate options, you can create a new folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object
    object_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | Object id for single object

    try:
        # Deletes an existing file association
        api_instance.delete_file_association(xero_tenant_id, file_id, object_id)
    except Exception as e:
        print("Exception when calling FilesApi->delete_file_association: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 
 **object_id** | **str**| Object id for single object | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful deletion - return response 204 no content |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_folder**
> delete_folder(xero_tenant_id, folder_id)

Deletes a folder

By passing in the appropriate ID, you can delete a folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    folder_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | Folder id for single object

    try:
        # Deletes a folder
        api_instance.delete_folder(xero_tenant_id, folder_id)
    except Exception as e:
        print("Exception when calling FilesApi->delete_folder: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **folder_id** | **str**| Folder id for single object | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful deletion - return response 204 no content |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_associations_by_object**
> List[Association] get_associations_by_object(xero_tenant_id, object_id)

Retrieves an association object using a unique object ID

By passing in the appropriate options,

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.association import Association
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    object_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | Object id for single object

    try:
        # Retrieves an association object using a unique object ID
        api_response = api_instance.get_associations_by_object(xero_tenant_id, object_id)
        print("The response of FilesApi->get_associations_by_object:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_associations_by_object: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **object_id** | **str**| Object id for single object | 

### Return type

[**List[Association]**](Association.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_file**
> FileObject get_file(xero_tenant_id, file_id)

Retrieves a file by a unique file ID

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.file_object import FileObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object

    try:
        # Retrieves a file by a unique file ID
        api_response = api_instance.get_file(xero_tenant_id, file_id)
        print("The response of FilesApi->get_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 

### Return type

[**FileObject**](FileObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_file_associations**
> List[Association] get_file_associations(xero_tenant_id, file_id)

Retrieves a specific file associations

By passing in the appropriate options,  

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.association import Association
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object

    try:
        # Retrieves a specific file associations
        api_response = api_instance.get_file_associations(xero_tenant_id, file_id)
        print("The response of FilesApi->get_file_associations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_file_associations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 

### Return type

[**List[Association]**](Association.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_file_content**
> bytearray get_file_content(xero_tenant_id, file_id)

Retrieves the content of a specific file

By passing in the appropriate options, retrieve data for specific file

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object

    try:
        # Retrieves the content of a specific file
        api_response = api_instance.get_file_content(xero_tenant_id, file_id)
        print("The response of FilesApi->get_file_content:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_file_content: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 

### Return type

**bytearray**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | returns the byte array of the specific file based on id |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_files**
> Files get_files(xero_tenant_id, pagesize=pagesize, page=page, sort=sort)

Retrieves files

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.files import Files
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    pagesize = 50 # int | pass an optional page size value (optional)
    page = 2 # int | number of records to skip for pagination (optional)
    sort = 'CreatedDateUTC DESC' # str | values to sort by (optional)

    try:
        # Retrieves files
        api_response = api_instance.get_files(xero_tenant_id, pagesize=pagesize, page=page, sort=sort)
        print("The response of FilesApi->get_files:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_files: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **pagesize** | **int**| pass an optional page size value | [optional] 
 **page** | **int**| number of records to skip for pagination | [optional] 
 **sort** | **str**| values to sort by | [optional] 

### Return type

[**Files**](Files.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_folder**
> Folder get_folder(xero_tenant_id, folder_id)

Retrieves specific folder by using a unique folder ID

By passing in the appropriate ID, you can search for specific folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.folder import Folder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    folder_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | Folder id for single object

    try:
        # Retrieves specific folder by using a unique folder ID
        api_response = api_instance.get_folder(xero_tenant_id, folder_id)
        print("The response of FilesApi->get_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_folder: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **folder_id** | **str**| Folder id for single object | 

### Return type

[**Folder**](Folder.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_folders**
> List[Folder] get_folders(xero_tenant_id, sort=sort)

Retrieves folders

By passing in the appropriate options, you can search for available folders

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.folder import Folder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    sort = 'CreatedDateUTC DESC' # str | values to sort by (optional)

    try:
        # Retrieves folders
        api_response = api_instance.get_folders(xero_tenant_id, sort=sort)
        print("The response of FilesApi->get_folders:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_folders: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **sort** | **str**| values to sort by | [optional] 

### Return type

[**List[Folder]**](Folder.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_inbox**
> Folder get_inbox(xero_tenant_id)

Retrieves inbox folder

Search for the user inbox

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.folder import Folder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant

    try:
        # Retrieves inbox folder
        api_response = api_instance.get_inbox(xero_tenant_id)
        print("The response of FilesApi->get_inbox:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->get_inbox: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 

### Return type

[**Folder**](Folder.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_file**
> FileObject update_file(xero_tenant_id, file_id, file_object=file_object)

Update a file

Updates file properties of a single file

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.file_object import FileObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    file_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | File id for single object
    file_object = { "FolderId": "bf924975-7097-46f2-a143-1ecfbab3c8c3" } # FileObject |  (optional)

    try:
        # Update a file
        api_response = api_instance.update_file(xero_tenant_id, file_id, file_object=file_object)
        print("The response of FilesApi->update_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->update_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **file_id** | **str**| File id for single object | 
 **file_object** | [**FileObject**](FileObject.md)|  | [optional] 

### Return type

[**FileObject**](FileObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful request |  -  |
**400** | invalid input, object invalid |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_folder**
> Folder update_folder(xero_tenant_id, folder_id, folder)

Updates an existing folder

By passing in the appropriate ID and properties, you can update a folder

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.folder import Folder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    folder_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | Folder id for single object
    folder = { "Name": "Your Docs" } # Folder | 

    try:
        # Updates an existing folder
        api_response = api_instance.update_folder(xero_tenant_id, folder_id, folder)
        print("The response of FilesApi->update_folder:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->update_folder: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **folder_id** | **str**| Folder id for single object | 
 **folder** | [**Folder**](Folder.md)|  | 

### Return type

[**Folder**](Folder.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | return the updated object |  -  |
**400** | invalid input, object invalid |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_file**
> FileObject upload_file(xero_tenant_id, folder_id=folder_id, body=body, filename=filename, mime_type=mime_type, name=name)

Uploads a File

### Example

* OAuth Authentication (OAuth2):

```python
import openapi_client
from openapi_client.models.file_object import FileObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.xero.com/files.xro/1.0
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.xero.com/files.xro/1.0"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.FilesApi(api_client)
    xero_tenant_id = 'YOUR_XERO_TENANT_ID' # str | Xero identifier for Tenant
    folder_id = '4ff1e5cc-9835-40d5-bb18-09fdb118db9c' # str | pass an optional folder id to save file to specific folder (optional)
    body = None # bytearray |  (optional)
    filename = 'filename_example' # str |  (optional)
    mime_type = 'mime_type_example' # str |  (optional)
    name = 'name_example' # str | exact name of the file you are uploading (optional)

    try:
        # Uploads a File
        api_response = api_instance.upload_file(xero_tenant_id, folder_id=folder_id, body=body, filename=filename, mime_type=mime_type, name=name)
        print("The response of FilesApi->upload_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling FilesApi->upload_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xero_tenant_id** | **str**| Xero identifier for Tenant | 
 **folder_id** | **str**| pass an optional folder id to save file to specific folder | [optional] 
 **body** | **bytearray**|  | [optional] 
 **filename** | **str**|  | [optional] 
 **mime_type** | **str**|  | [optional] 
 **name** | **str**| exact name of the file you are uploading | [optional] 

### Return type

[**FileObject**](FileObject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A successful request |  -  |
**400** | invalid input, object invalid |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

