# openapi_client.LicensesApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**licenses_get**](LicensesApi.md#licenses_get) | **GET** /licenses/{license} | Get a license
[**licenses_get_all_commonly_used**](LicensesApi.md#licenses_get_all_commonly_used) | **GET** /licenses | Get all commonly used licenses
[**licenses_get_for_repo**](LicensesApi.md#licenses_get_for_repo) | **GET** /repos/{owner}/{repo}/license | Get the license for a repository


# **licenses_get**
> License licenses_get(license)

Get a license



### Example


```python
import openapi_client
from openapi_client.models.license import License
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicensesApi(api_client)
    license = 'license_example' # str | 

    try:
        # Get a license
        api_response = api_instance.licenses_get(license)
        print("The response of LicensesApi->licenses_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LicensesApi->licenses_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **str**|  | 

### Return type

[**License**](License.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **licenses_get_all_commonly_used**
> List[LicenseSimple] licenses_get_all_commonly_used(featured=featured, per_page=per_page, page=page)

Get all commonly used licenses



### Example


```python
import openapi_client
from openapi_client.models.license_simple import LicenseSimple
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicensesApi(api_client)
    featured = True # bool |  (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # Get all commonly used licenses
        api_response = api_instance.licenses_get_all_commonly_used(featured=featured, per_page=per_page, page=page)
        print("The response of LicensesApi->licenses_get_all_commonly_used:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LicensesApi->licenses_get_all_commonly_used: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featured** | **bool**|  | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[LicenseSimple]**](LicenseSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **licenses_get_for_repo**
> LicenseContent licenses_get_for_repo(owner, repo)

Get the license for a repository

This method returns the contents of the repository's license file, if one is detected.  Similar to [Get repository content](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.

### Example


```python
import openapi_client
from openapi_client.models.license_content import LicenseContent
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicensesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the license for a repository
        api_response = api_instance.licenses_get_for_repo(owner, repo)
        print("The response of LicensesApi->licenses_get_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LicensesApi->licenses_get_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**LicenseContent**](LicenseContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

