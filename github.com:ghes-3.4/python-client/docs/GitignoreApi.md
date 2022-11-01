# openapi_client.GitignoreApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gitignore_get_all_templates**](GitignoreApi.md#gitignore_get_all_templates) | **GET** /gitignore/templates | Get all gitignore templates
[**gitignore_get_template**](GitignoreApi.md#gitignore_get_template) | **GET** /gitignore/templates/{name} | Get a gitignore template


# **gitignore_get_all_templates**
> List[str] gitignore_get_all_templates()

Get all gitignore templates

List all templates available to pass as an option when [creating a repository](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#create-a-repository-for-the-authenticated-user).

### Example


```python
import openapi_client
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
    api_instance = openapi_client.GitignoreApi(api_client)

    try:
        # Get all gitignore templates
        api_response = api_instance.gitignore_get_all_templates()
        print("The response of GitignoreApi->gitignore_get_all_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GitignoreApi->gitignore_get_all_templates: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**List[str]**

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

# **gitignore_get_template**
> GitignoreTemplate gitignore_get_template(name)

Get a gitignore template

The API also allows fetching the source of a single template. Use the raw [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/) to get the raw contents.

### Example


```python
import openapi_client
from openapi_client.models.gitignore_template import GitignoreTemplate
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
    api_instance = openapi_client.GitignoreApi(api_client)
    name = 'name_example' # str | 

    try:
        # Get a gitignore template
        api_response = api_instance.gitignore_get_template(name)
        print("The response of GitignoreApi->gitignore_get_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GitignoreApi->gitignore_get_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 

### Return type

[**GitignoreTemplate**](GitignoreTemplate.md)

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

