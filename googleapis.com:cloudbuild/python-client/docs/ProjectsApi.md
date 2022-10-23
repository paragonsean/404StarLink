# openapi_client.ProjectsApi

All URIs are relative to *https://cloudbuild.googleapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudbuild_projects_builds_cancel**](ProjectsApi.md#cloudbuild_projects_builds_cancel) | **POST** /v1/projects/{projectId}/builds/{id}:cancel | 
[**cloudbuild_projects_builds_create**](ProjectsApi.md#cloudbuild_projects_builds_create) | **POST** /v1/projects/{projectId}/builds | 
[**cloudbuild_projects_builds_get**](ProjectsApi.md#cloudbuild_projects_builds_get) | **GET** /v1/projects/{projectId}/builds/{id} | 
[**cloudbuild_projects_builds_list**](ProjectsApi.md#cloudbuild_projects_builds_list) | **GET** /v1/projects/{projectId}/builds | 
[**cloudbuild_projects_builds_retry**](ProjectsApi.md#cloudbuild_projects_builds_retry) | **POST** /v1/projects/{projectId}/builds/{id}:retry | 
[**cloudbuild_projects_locations_bitbucket_server_configs_create**](ProjectsApi.md#cloudbuild_projects_locations_bitbucket_server_configs_create) | **POST** /v1/{parent}/bitbucketServerConfigs | 
[**cloudbuild_projects_locations_bitbucket_server_configs_list**](ProjectsApi.md#cloudbuild_projects_locations_bitbucket_server_configs_list) | **GET** /v1/{parent}/bitbucketServerConfigs | 
[**cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository**](ProjectsApi.md#cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository) | **POST** /v1/{config}:removeBitbucketServerConnectedRepository | 
[**cloudbuild_projects_locations_builds_approve**](ProjectsApi.md#cloudbuild_projects_locations_builds_approve) | **POST** /v1/{name}:approve | 
[**cloudbuild_projects_locations_builds_create**](ProjectsApi.md#cloudbuild_projects_locations_builds_create) | **POST** /v1/{parent}/builds | 
[**cloudbuild_projects_locations_builds_list**](ProjectsApi.md#cloudbuild_projects_locations_builds_list) | **GET** /v1/{parent}/builds | 
[**cloudbuild_projects_locations_builds_retry**](ProjectsApi.md#cloudbuild_projects_locations_builds_retry) | **POST** /v1/{name}:retry | 
[**cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create**](ProjectsApi.md#cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create) | **POST** /v1/{parent}/connectedRepositories:batchCreate | 
[**cloudbuild_projects_locations_git_lab_configs_create**](ProjectsApi.md#cloudbuild_projects_locations_git_lab_configs_create) | **POST** /v1/{parent}/gitLabConfigs | 
[**cloudbuild_projects_locations_git_lab_configs_list**](ProjectsApi.md#cloudbuild_projects_locations_git_lab_configs_list) | **GET** /v1/{parent}/gitLabConfigs | 
[**cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository**](ProjectsApi.md#cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository) | **POST** /v1/{config}:removeGitLabConnectedRepository | 
[**cloudbuild_projects_locations_git_lab_configs_repos_list**](ProjectsApi.md#cloudbuild_projects_locations_git_lab_configs_repos_list) | **GET** /v1/{parent}/repos | 
[**cloudbuild_projects_locations_github_enterprise_configs_create**](ProjectsApi.md#cloudbuild_projects_locations_github_enterprise_configs_create) | **POST** /v1/{parent}/githubEnterpriseConfigs | 
[**cloudbuild_projects_locations_github_enterprise_configs_list**](ProjectsApi.md#cloudbuild_projects_locations_github_enterprise_configs_list) | **GET** /v1/{parent}/githubEnterpriseConfigs | 
[**cloudbuild_projects_locations_operations_cancel**](ProjectsApi.md#cloudbuild_projects_locations_operations_cancel) | **POST** /v1/{name}:cancel | 
[**cloudbuild_projects_locations_triggers_create**](ProjectsApi.md#cloudbuild_projects_locations_triggers_create) | **POST** /v1/{parent}/triggers | 
[**cloudbuild_projects_locations_triggers_list**](ProjectsApi.md#cloudbuild_projects_locations_triggers_list) | **GET** /v1/{parent}/triggers | 
[**cloudbuild_projects_locations_triggers_patch**](ProjectsApi.md#cloudbuild_projects_locations_triggers_patch) | **PATCH** /v1/{resourceName} | 
[**cloudbuild_projects_locations_triggers_run**](ProjectsApi.md#cloudbuild_projects_locations_triggers_run) | **POST** /v1/{name}:run | 
[**cloudbuild_projects_locations_triggers_webhook**](ProjectsApi.md#cloudbuild_projects_locations_triggers_webhook) | **POST** /v1/{name}:webhook | 
[**cloudbuild_projects_locations_worker_pools_create**](ProjectsApi.md#cloudbuild_projects_locations_worker_pools_create) | **POST** /v1/{parent}/workerPools | 
[**cloudbuild_projects_locations_worker_pools_delete**](ProjectsApi.md#cloudbuild_projects_locations_worker_pools_delete) | **DELETE** /v1/{name} | 
[**cloudbuild_projects_locations_worker_pools_get**](ProjectsApi.md#cloudbuild_projects_locations_worker_pools_get) | **GET** /v1/{name} | 
[**cloudbuild_projects_locations_worker_pools_list**](ProjectsApi.md#cloudbuild_projects_locations_worker_pools_list) | **GET** /v1/{parent}/workerPools | 
[**cloudbuild_projects_locations_worker_pools_patch**](ProjectsApi.md#cloudbuild_projects_locations_worker_pools_patch) | **PATCH** /v1/{name} | 
[**cloudbuild_projects_triggers_create**](ProjectsApi.md#cloudbuild_projects_triggers_create) | **POST** /v1/projects/{projectId}/triggers | 
[**cloudbuild_projects_triggers_delete**](ProjectsApi.md#cloudbuild_projects_triggers_delete) | **DELETE** /v1/projects/{projectId}/triggers/{triggerId} | 
[**cloudbuild_projects_triggers_get**](ProjectsApi.md#cloudbuild_projects_triggers_get) | **GET** /v1/projects/{projectId}/triggers/{triggerId} | 
[**cloudbuild_projects_triggers_list**](ProjectsApi.md#cloudbuild_projects_triggers_list) | **GET** /v1/projects/{projectId}/triggers | 
[**cloudbuild_projects_triggers_patch**](ProjectsApi.md#cloudbuild_projects_triggers_patch) | **PATCH** /v1/projects/{projectId}/triggers/{triggerId} | 
[**cloudbuild_projects_triggers_run**](ProjectsApi.md#cloudbuild_projects_triggers_run) | **POST** /v1/projects/{projectId}/triggers/{triggerId}:run | 
[**cloudbuild_projects_triggers_webhook**](ProjectsApi.md#cloudbuild_projects_triggers_webhook) | **POST** /v1/projects/{projectId}/triggers/{trigger}:webhook | 


# **cloudbuild_projects_builds_cancel**
> Build cloudbuild_projects_builds_cancel(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, cancel_build_request=cancel_build_request)



Cancels a build in progress.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build import Build
from openapi_client.models.cancel_build_request import CancelBuildRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    id = 'id_example' # str | Required. ID of the build.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    cancel_build_request = openapi_client.CancelBuildRequest() # CancelBuildRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_builds_cancel(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, cancel_build_request=cancel_build_request)
        print("The response of ProjectsApi->cloudbuild_projects_builds_cancel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_builds_cancel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **id** | **str**| Required. ID of the build. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **cancel_build_request** | [**CancelBuildRequest**](CancelBuildRequest.md)|  | [optional] 

### Return type

[**Build**](Build.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_builds_create**
> Operation cloudbuild_projects_builds_create(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, parent=parent, build=build)



Starts a build with the specified configuration. This method returns a long-running `Operation`, which includes the build ID. Pass the build ID to `GetBuild` to determine the build status (such as `SUCCESS` or `FAILURE`).

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build import Build
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    parent = 'parent_example' # str | The parent resource where this build will be created. Format: `projects/{project}/locations/{location}` (optional)
    build = openapi_client.Build() # Build |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_builds_create(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, parent=parent, build=build)
        print("The response of ProjectsApi->cloudbuild_projects_builds_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_builds_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **parent** | **str**| The parent resource where this build will be created. Format: &#x60;projects/{project}/locations/{location}&#x60; | [optional] 
 **build** | [**Build**](Build.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_builds_get**
> Build cloudbuild_projects_builds_get(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)



Returns information about a previously requested build. The `Build` that is returned includes its status (such as `SUCCESS`, `FAILURE`, or `WORKING`), and timing information.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build import Build
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    id = 'id_example' # str | Required. ID of the build.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    name = 'name_example' # str | The name of the `Build` to retrieve. Format: `projects/{project}/locations/{location}/builds/{build}` (optional)

    try:
        api_response = api_instance.cloudbuild_projects_builds_get(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)
        print("The response of ProjectsApi->cloudbuild_projects_builds_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_builds_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **id** | **str**| Required. ID of the build. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **name** | **str**| The name of the &#x60;Build&#x60; to retrieve. Format: &#x60;projects/{project}/locations/{location}/builds/{build}&#x60; | [optional] 

### Return type

[**Build**](Build.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_builds_list**
> ListBuildsResponse cloudbuild_projects_builds_list(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, filter=filter, page_size=page_size, page_token=page_token, parent=parent)



Lists previously requested builds. Previously requested builds may still be in-progress, or may have finished successfully or unsuccessfully.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_builds_response import ListBuildsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    filter = 'filter_example' # str | The raw filter text to constrain the results. (optional)
    page_size = 56 # int | Number of results to return in the list. (optional)
    page_token = 'page_token_example' # str | The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more. (optional)
    parent = 'parent_example' # str | The parent of the collection of `Builds`. Format: `projects/{project}/locations/{location}` (optional)

    try:
        api_response = api_instance.cloudbuild_projects_builds_list(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, filter=filter, page_size=page_size, page_token=page_token, parent=parent)
        print("The response of ProjectsApi->cloudbuild_projects_builds_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_builds_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **filter** | **str**| The raw filter text to constrain the results. | [optional] 
 **page_size** | **int**| Number of results to return in the list. | [optional] 
 **page_token** | **str**| The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more. | [optional] 
 **parent** | **str**| The parent of the collection of &#x60;Builds&#x60;. Format: &#x60;projects/{project}/locations/{location}&#x60; | [optional] 

### Return type

[**ListBuildsResponse**](ListBuildsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_builds_retry**
> Operation cloudbuild_projects_builds_retry(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, retry_build_request=retry_build_request)



Creates a new build based on the specified build. This method creates a new build using the original build request, which may or may not result in an identical build. For triggered builds: * Triggered builds resolve to a precise revision; therefore a retry of a triggered build will result in a build that uses the same revision. For non-triggered builds that specify `RepoSource`: * If the original build built from the tip of a branch, the retried build will build from the tip of that branch, which may not be the same revision as the original build. * If the original build specified a commit sha or revision ID, the retried build will use the identical source. For builds that specify `StorageSource`: * If the original build pulled source from Google Cloud Storage without specifying the generation of the object, the new build will use the current object, which may be different from the original build source. * If the original build pulled source from Cloud Storage and specified the generation of the object, the new build will attempt to use the same object, which may or may not be available depending on the bucket's lifecycle management settings.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.retry_build_request import RetryBuildRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    id = 'id_example' # str | Required. Build ID of the original build.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    retry_build_request = openapi_client.RetryBuildRequest() # RetryBuildRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_builds_retry(project_id, id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, retry_build_request=retry_build_request)
        print("The response of ProjectsApi->cloudbuild_projects_builds_retry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_builds_retry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **id** | **str**| Required. Build ID of the original build. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **retry_build_request** | [**RetryBuildRequest**](RetryBuildRequest.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_bitbucket_server_configs_create**
> Operation cloudbuild_projects_locations_bitbucket_server_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, bitbucket_server_config_id=bitbucket_server_config_id, bitbucket_server_config=bitbucket_server_config)



Creates a new `BitbucketServerConfig`. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.bitbucket_server_config import BitbucketServerConfig
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. Name of the parent resource.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    bitbucket_server_config_id = 'bitbucket_server_config_id_example' # str | Optional. The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name. bitbucket_server_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character. (optional)
    bitbucket_server_config = openapi_client.BitbucketServerConfig() # BitbucketServerConfig |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_bitbucket_server_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, bitbucket_server_config_id=bitbucket_server_config_id, bitbucket_server_config=bitbucket_server_config)
        print("The response of ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. Name of the parent resource. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **bitbucket_server_config_id** | **str**| Optional. The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig&#39;s resource name. bitbucket_server_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character. | [optional] 
 **bitbucket_server_config** | [**BitbucketServerConfig**](BitbucketServerConfig.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_bitbucket_server_configs_list**
> ListBitbucketServerConfigsResponse cloudbuild_projects_locations_bitbucket_server_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)



List all `BitbucketServerConfigs` for a given project. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_bitbucket_server_configs_response import ListBitbucketServerConfigsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. Name of the parent resource.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 50 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000. (optional)
    page_token = 'page_token_example' # str | A page token, received from a previous `ListBitbucketServerConfigsRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBitbucketServerConfigsRequest` must match the call that provided the page token. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_bitbucket_server_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)
        print("The response of ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. Name of the parent resource. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 50 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000. | [optional] 
 **page_token** | **str**| A page token, received from a previous &#x60;ListBitbucketServerConfigsRequest&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListBitbucketServerConfigsRequest&#x60; must match the call that provided the page token. | [optional] 

### Return type

[**ListBitbucketServerConfigsResponse**](ListBitbucketServerConfigsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository**
> object cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository(config, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, remove_bitbucket_server_connected_repository_request=remove_bitbucket_server_connected_repository_request)



Remove a Bitbucket Server repository from a given BitbucketServerConfig's connected repositories. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.remove_bitbucket_server_connected_repository_request import RemoveBitbucketServerConnectedRepositoryRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    config = 'config_example' # str | Required. The name of the `BitbucketServerConfig` to remove a connected repository. Format: `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    remove_bitbucket_server_connected_repository_request = openapi_client.RemoveBitbucketServerConnectedRepositoryRequest() # RemoveBitbucketServerConnectedRepositoryRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository(config, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, remove_bitbucket_server_connected_repository_request=remove_bitbucket_server_connected_repository_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_bitbucket_server_configs_remove_bitbucket_server_connected_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | **str**| Required. The name of the &#x60;BitbucketServerConfig&#x60; to remove a connected repository. Format: &#x60;projects/{project}/locations/{location}/bitbucketServerConfigs/{config}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **remove_bitbucket_server_connected_repository_request** | [**RemoveBitbucketServerConnectedRepositoryRequest**](RemoveBitbucketServerConnectedRepositoryRequest.md)|  | [optional] 

### Return type

**object**

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_builds_approve**
> Operation cloudbuild_projects_locations_builds_approve(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, approve_build_request=approve_build_request)



Approves or rejects a pending build. If approved, the returned LRO will be analogous to the LRO returned from a CreateBuild call. If rejected, the returned LRO will be immediately done.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.approve_build_request import ApproveBuildRequest
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | Required. Name of the target build. For example: \"projects/{$project_id}/builds/{$build_id}\"
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    approve_build_request = openapi_client.ApproveBuildRequest() # ApproveBuildRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_builds_approve(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, approve_build_request=approve_build_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_builds_approve:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_builds_approve: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Required. Name of the target build. For example: \&quot;projects/{$project_id}/builds/{$build_id}\&quot; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **approve_build_request** | [**ApproveBuildRequest**](ApproveBuildRequest.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_builds_create**
> Operation cloudbuild_projects_locations_builds_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, build=build)



Starts a build with the specified configuration. This method returns a long-running `Operation`, which includes the build ID. Pass the build ID to `GetBuild` to determine the build status (such as `SUCCESS` or `FAILURE`).

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build import Build
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | The parent resource where this build will be created. Format: `projects/{project}/locations/{location}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | Required. ID of the project. (optional)
    build = openapi_client.Build() # Build |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_builds_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, build=build)
        print("The response of ProjectsApi->cloudbuild_projects_locations_builds_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_builds_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| The parent resource where this build will be created. Format: &#x60;projects/{project}/locations/{location}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| Required. ID of the project. | [optional] 
 **build** | [**Build**](Build.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_builds_list**
> ListBuildsResponse cloudbuild_projects_locations_builds_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, filter=filter, page_size=page_size, page_token=page_token, project_id=project_id)



Lists previously requested builds. Previously requested builds may still be in-progress, or may have finished successfully or unsuccessfully.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_builds_response import ListBuildsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | The parent of the collection of `Builds`. Format: `projects/{project}/locations/{location}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    filter = 'filter_example' # str | The raw filter text to constrain the results. (optional)
    page_size = 56 # int | Number of results to return in the list. (optional)
    page_token = 'page_token_example' # str | The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more. (optional)
    project_id = 'project_id_example' # str | Required. ID of the project. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_builds_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, filter=filter, page_size=page_size, page_token=page_token, project_id=project_id)
        print("The response of ProjectsApi->cloudbuild_projects_locations_builds_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_builds_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| The parent of the collection of &#x60;Builds&#x60;. Format: &#x60;projects/{project}/locations/{location}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **filter** | **str**| The raw filter text to constrain the results. | [optional] 
 **page_size** | **int**| Number of results to return in the list. | [optional] 
 **page_token** | **str**| The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more. | [optional] 
 **project_id** | **str**| Required. ID of the project. | [optional] 

### Return type

[**ListBuildsResponse**](ListBuildsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_builds_retry**
> Operation cloudbuild_projects_locations_builds_retry(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, retry_build_request=retry_build_request)



Creates a new build based on the specified build. This method creates a new build using the original build request, which may or may not result in an identical build. For triggered builds: * Triggered builds resolve to a precise revision; therefore a retry of a triggered build will result in a build that uses the same revision. For non-triggered builds that specify `RepoSource`: * If the original build built from the tip of a branch, the retried build will build from the tip of that branch, which may not be the same revision as the original build. * If the original build specified a commit sha or revision ID, the retried build will use the identical source. For builds that specify `StorageSource`: * If the original build pulled source from Google Cloud Storage without specifying the generation of the object, the new build will use the current object, which may be different from the original build source. * If the original build pulled source from Cloud Storage and specified the generation of the object, the new build will attempt to use the same object, which may or may not be available depending on the bucket's lifecycle management settings.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.retry_build_request import RetryBuildRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | The name of the `Build` to retry. Format: `projects/{project}/locations/{location}/builds/{build}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    retry_build_request = openapi_client.RetryBuildRequest() # RetryBuildRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_builds_retry(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, retry_build_request=retry_build_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_builds_retry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_builds_retry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the &#x60;Build&#x60; to retry. Format: &#x60;projects/{project}/locations/{location}/builds/{build}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **retry_build_request** | [**RetryBuildRequest**](RetryBuildRequest.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create**
> Operation cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, batch_create_git_lab_connected_repositories_request=batch_create_git_lab_connected_repositories_request)



Batch connecting GitLab repositories to Cloud Build. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.batch_create_git_lab_connected_repositories_request import BatchCreateGitLabConnectedRepositoriesRequest
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | The name of the `GitLabConfig` that adds connected repositories. Format: `projects/{project}/locations/{location}/gitLabConfigs/{config}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    batch_create_git_lab_connected_repositories_request = openapi_client.BatchCreateGitLabConnectedRepositoriesRequest() # BatchCreateGitLabConnectedRepositoriesRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, batch_create_git_lab_connected_repositories_request=batch_create_git_lab_connected_repositories_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_git_lab_configs_connected_repositories_batch_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| The name of the &#x60;GitLabConfig&#x60; that adds connected repositories. Format: &#x60;projects/{project}/locations/{location}/gitLabConfigs/{config}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **batch_create_git_lab_connected_repositories_request** | [**BatchCreateGitLabConnectedRepositoriesRequest**](BatchCreateGitLabConnectedRepositoriesRequest.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_git_lab_configs_create**
> Operation cloudbuild_projects_locations_git_lab_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, gitlab_config_id=gitlab_config_id, git_lab_config=git_lab_config)



Creates a new `GitLabConfig`. This API is experimental

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.git_lab_config import GitLabConfig
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. Name of the parent resource.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    gitlab_config_id = 'gitlab_config_id_example' # str | Optional. The ID to use for the GitLabConfig, which will become the final component of the GitLabConfig’s resource name. gitlab_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character (optional)
    git_lab_config = openapi_client.GitLabConfig() # GitLabConfig |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_git_lab_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, gitlab_config_id=gitlab_config_id, git_lab_config=git_lab_config)
        print("The response of ProjectsApi->cloudbuild_projects_locations_git_lab_configs_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_git_lab_configs_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. Name of the parent resource. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **gitlab_config_id** | **str**| Optional. The ID to use for the GitLabConfig, which will become the final component of the GitLabConfig’s resource name. gitlab_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character | [optional] 
 **git_lab_config** | [**GitLabConfig**](GitLabConfig.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_git_lab_configs_list**
> ListGitLabConfigsResponse cloudbuild_projects_locations_git_lab_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)



List all `GitLabConfigs` for a given project. This API is experimental

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_git_lab_configs_response import ListGitLabConfigsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. Name of the parent resource
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 50 configs will be returned. The maximum value is 1000;, values above 1000 will be coerced to 1000. (optional)
    page_token = 'page_token_example' # str | A page token, received from a previous ‘ListGitlabConfigsRequest’ call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ‘ListGitlabConfigsRequest’ must match the call that provided the page token. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_git_lab_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)
        print("The response of ProjectsApi->cloudbuild_projects_locations_git_lab_configs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_git_lab_configs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. Name of the parent resource | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 50 configs will be returned. The maximum value is 1000;, values above 1000 will be coerced to 1000. | [optional] 
 **page_token** | **str**| A page token, received from a previous ‘ListGitlabConfigsRequest’ call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ‘ListGitlabConfigsRequest’ must match the call that provided the page token. | [optional] 

### Return type

[**ListGitLabConfigsResponse**](ListGitLabConfigsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository**
> object cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository(config, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, remove_git_lab_connected_repository_request=remove_git_lab_connected_repository_request)



Remove a GitLab repository from a given GitLabConfig's connected repositories. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.remove_git_lab_connected_repository_request import RemoveGitLabConnectedRepositoryRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    config = 'config_example' # str | Required. The name of the `GitLabConfig` to remove a connected repository. Format: `projects/{project}/locations/{location}/gitLabConfigs/{config}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    remove_git_lab_connected_repository_request = openapi_client.RemoveGitLabConnectedRepositoryRequest() # RemoveGitLabConnectedRepositoryRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository(config, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, remove_git_lab_connected_repository_request=remove_git_lab_connected_repository_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_git_lab_configs_remove_git_lab_connected_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | **str**| Required. The name of the &#x60;GitLabConfig&#x60; to remove a connected repository. Format: &#x60;projects/{project}/locations/{location}/gitLabConfigs/{config}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **remove_git_lab_connected_repository_request** | [**RemoveGitLabConnectedRepositoryRequest**](RemoveGitLabConnectedRepositoryRequest.md)|  | [optional] 

### Return type

**object**

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_git_lab_configs_repos_list**
> ListGitLabRepositoriesResponse cloudbuild_projects_locations_git_lab_configs_repos_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)



List all repositories for a given `GitLabConfig`. This API is experimental

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_git_lab_repositories_response import ListGitLabRepositoriesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. Name of the parent resource.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | The maximum number of repositories to return. The service may return fewer than this value. (optional)
    page_token = 'page_token_example' # str | A page token, received from a previous ListGitLabRepositoriesRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListGitLabRepositoriesRequest` must match the call that provided the page token. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_git_lab_configs_repos_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)
        print("The response of ProjectsApi->cloudbuild_projects_locations_git_lab_configs_repos_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_git_lab_configs_repos_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. Name of the parent resource. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| The maximum number of repositories to return. The service may return fewer than this value. | [optional] 
 **page_token** | **str**| A page token, received from a previous ListGitLabRepositoriesRequest&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;ListGitLabRepositoriesRequest&#x60; must match the call that provided the page token. | [optional] 

### Return type

[**ListGitLabRepositoriesResponse**](ListGitLabRepositoriesResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_github_enterprise_configs_create**
> Operation cloudbuild_projects_locations_github_enterprise_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, ghe_config_id=ghe_config_id, project_id=project_id, git_hub_enterprise_config=git_hub_enterprise_config)



Create an association between a GCP project and a GitHub Enterprise server.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.git_hub_enterprise_config import GitHubEnterpriseConfig
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Name of the parent project. For example: projects/{$project_number} or projects/{$project_id}
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    ghe_config_id = 'ghe_config_id_example' # str | Optional. The ID to use for the GithubEnterpriseConfig, which will become the final component of the GithubEnterpriseConfig's resource name. ghe_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character (optional)
    project_id = 'project_id_example' # str | ID of the project. (optional)
    git_hub_enterprise_config = openapi_client.GitHubEnterpriseConfig() # GitHubEnterpriseConfig |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_github_enterprise_configs_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, ghe_config_id=ghe_config_id, project_id=project_id, git_hub_enterprise_config=git_hub_enterprise_config)
        print("The response of ProjectsApi->cloudbuild_projects_locations_github_enterprise_configs_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_github_enterprise_configs_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Name of the parent project. For example: projects/{$project_number} or projects/{$project_id} | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **ghe_config_id** | **str**| Optional. The ID to use for the GithubEnterpriseConfig, which will become the final component of the GithubEnterpriseConfig&#39;s resource name. ghe_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character | [optional] 
 **project_id** | **str**| ID of the project. | [optional] 
 **git_hub_enterprise_config** | [**GitHubEnterpriseConfig**](GitHubEnterpriseConfig.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_github_enterprise_configs_list**
> ListGithubEnterpriseConfigsResponse cloudbuild_projects_locations_github_enterprise_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id)



List all GitHubEnterpriseConfigs for a given project.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_github_enterprise_configs_response import ListGithubEnterpriseConfigsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Name of the parent project. For example: projects/{$project_number} or projects/{$project_id}
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | ID of the project (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_github_enterprise_configs_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id)
        print("The response of ProjectsApi->cloudbuild_projects_locations_github_enterprise_configs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_github_enterprise_configs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Name of the parent project. For example: projects/{$project_number} or projects/{$project_id} | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| ID of the project | [optional] 

### Return type

[**ListGithubEnterpriseConfigsResponse**](ListGithubEnterpriseConfigsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_operations_cancel**
> object cloudbuild_projects_locations_operations_cancel(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, body=body)



Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | The name of the operation resource to be cancelled.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    body = None # object |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_operations_cancel(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, body=body)
        print("The response of ProjectsApi->cloudbuild_projects_locations_operations_cancel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_operations_cancel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the operation resource to be cancelled. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **body** | **object**|  | [optional] 

### Return type

**object**

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_triggers_create**
> BuildTrigger cloudbuild_projects_locations_triggers_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, build_trigger=build_trigger)



Creates a new `BuildTrigger`. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build_trigger import BuildTrigger
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | The parent resource where this trigger will be created. Format: `projects/{project}/locations/{location}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | Required. ID of the project for which to configure automatic builds. (optional)
    build_trigger = openapi_client.BuildTrigger() # BuildTrigger |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_triggers_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, build_trigger=build_trigger)
        print("The response of ProjectsApi->cloudbuild_projects_locations_triggers_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_triggers_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| The parent resource where this trigger will be created. Format: &#x60;projects/{project}/locations/{location}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| Required. ID of the project for which to configure automatic builds. | [optional] 
 **build_trigger** | [**BuildTrigger**](BuildTrigger.md)|  | [optional] 

### Return type

[**BuildTrigger**](BuildTrigger.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_triggers_list**
> ListBuildTriggersResponse cloudbuild_projects_locations_triggers_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token, project_id=project_id)



Lists existing `BuildTrigger`s. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_build_triggers_response import ListBuildTriggersResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | The parent of the collection of `Triggers`. Format: `projects/{project}/locations/{location}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | Number of results to return in the list. (optional)
    page_token = 'page_token_example' # str | Token to provide to skip to a particular spot in the list. (optional)
    project_id = 'project_id_example' # str | Required. ID of the project for which to list BuildTriggers. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_triggers_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token, project_id=project_id)
        print("The response of ProjectsApi->cloudbuild_projects_locations_triggers_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_triggers_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| The parent of the collection of &#x60;Triggers&#x60;. Format: &#x60;projects/{project}/locations/{location}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| Number of results to return in the list. | [optional] 
 **page_token** | **str**| Token to provide to skip to a particular spot in the list. | [optional] 
 **project_id** | **str**| Required. ID of the project for which to list BuildTriggers. | [optional] 

### Return type

[**ListBuildTriggersResponse**](ListBuildTriggersResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_triggers_patch**
> BuildTrigger cloudbuild_projects_locations_triggers_patch(resource_name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, trigger_id=trigger_id, build_trigger=build_trigger)



Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build_trigger import BuildTrigger
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    resource_name = 'resource_name_example' # str | The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | Required. ID of the project that owns the trigger. (optional)
    trigger_id = 'trigger_id_example' # str | Required. ID of the `BuildTrigger` to update. (optional)
    build_trigger = openapi_client.BuildTrigger() # BuildTrigger |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_triggers_patch(resource_name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, trigger_id=trigger_id, build_trigger=build_trigger)
        print("The response of ProjectsApi->cloudbuild_projects_locations_triggers_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_triggers_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_name** | **str**| The &#x60;Trigger&#x60; name with format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60;, where {trigger} is a unique identifier generated by the service. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| Required. ID of the project that owns the trigger. | [optional] 
 **trigger_id** | **str**| Required. ID of the &#x60;BuildTrigger&#x60; to update. | [optional] 
 **build_trigger** | [**BuildTrigger**](BuildTrigger.md)|  | [optional] 

### Return type

[**BuildTrigger**](BuildTrigger.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_triggers_run**
> Operation cloudbuild_projects_locations_triggers_run(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, run_build_trigger_request=run_build_trigger_request)



Runs a `BuildTrigger` at a particular source revision. To run a regional or global trigger, use the POST request that includes the location endpoint in the path (ex. v1/projects/{projectId}/locations/{region}/triggers/{triggerId}:run). The POST request that does not include the location endpoint in the path can only be used when running global triggers.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.run_build_trigger_request import RunBuildTriggerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | The name of the `Trigger` to run. Format: `projects/{project}/locations/{location}/triggers/{trigger}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    run_build_trigger_request = openapi_client.RunBuildTriggerRequest() # RunBuildTriggerRequest |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_triggers_run(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, run_build_trigger_request=run_build_trigger_request)
        print("The response of ProjectsApi->cloudbuild_projects_locations_triggers_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_triggers_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the &#x60;Trigger&#x60; to run. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **run_build_trigger_request** | [**RunBuildTriggerRequest**](RunBuildTriggerRequest.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_triggers_webhook**
> object cloudbuild_projects_locations_triggers_webhook(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, secret=secret, trigger=trigger, http_body=http_body)



ReceiveTriggerWebhook [Experimental] is called when the API receives a webhook request targeted at a specific trigger.

### Example


```python
import openapi_client
from openapi_client.models.http_body import HttpBody
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | The name of the `ReceiveTriggerWebhook` to retrieve. Format: `projects/{project}/locations/{location}/triggers/{trigger}`
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | Project in which the specified trigger lives (optional)
    secret = 'secret_example' # str | Secret token used for authorization if an OAuth token isn't provided. (optional)
    trigger = 'trigger_example' # str | Name of the trigger to run the payload against (optional)
    http_body = openapi_client.HttpBody() # HttpBody |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_triggers_webhook(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, secret=secret, trigger=trigger, http_body=http_body)
        print("The response of ProjectsApi->cloudbuild_projects_locations_triggers_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_triggers_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the &#x60;ReceiveTriggerWebhook&#x60; to retrieve. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| Project in which the specified trigger lives | [optional] 
 **secret** | **str**| Secret token used for authorization if an OAuth token isn&#39;t provided. | [optional] 
 **trigger** | **str**| Name of the trigger to run the payload against | [optional] 
 **http_body** | [**HttpBody**](HttpBody.md)|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_worker_pools_create**
> Operation cloudbuild_projects_locations_worker_pools_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, validate_only=validate_only, worker_pool_id=worker_pool_id, worker_pool=worker_pool)



Creates a `WorkerPool`.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.worker_pool import WorkerPool
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. The parent resource where this worker pool will be created. Format: `projects/{project}/locations/{location}`.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    validate_only = True # bool | If set, validate the request and preview the response, but do not actually post it. (optional)
    worker_pool_id = 'worker_pool_id_example' # str | Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/. (optional)
    worker_pool = openapi_client.WorkerPool() # WorkerPool |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_worker_pools_create(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, validate_only=validate_only, worker_pool_id=worker_pool_id, worker_pool=worker_pool)
        print("The response of ProjectsApi->cloudbuild_projects_locations_worker_pools_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_worker_pools_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. The parent resource where this worker pool will be created. Format: &#x60;projects/{project}/locations/{location}&#x60;. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **validate_only** | **bool**| If set, validate the request and preview the response, but do not actually post it. | [optional] 
 **worker_pool_id** | **str**| Required. Immutable. The ID to use for the &#x60;WorkerPool&#x60;, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/. | [optional] 
 **worker_pool** | [**WorkerPool**](WorkerPool.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_worker_pools_delete**
> Operation cloudbuild_projects_locations_worker_pools_delete(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, allow_missing=allow_missing, etag=etag, validate_only=validate_only)



Deletes a `WorkerPool`.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | Required. The name of the `WorkerPool` to delete. Format: `projects/{project}/locations/{location}/workerPools/{workerPool}`.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    allow_missing = True # bool | If set to true, and the `WorkerPool` is not found, the request will succeed but no action will be taken on the server. (optional)
    etag = 'etag_example' # str | Optional. If provided, it must match the server's etag on the workerpool for the request to be processed. (optional)
    validate_only = True # bool | If set, validate the request and preview the response, but do not actually post it. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_worker_pools_delete(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, allow_missing=allow_missing, etag=etag, validate_only=validate_only)
        print("The response of ProjectsApi->cloudbuild_projects_locations_worker_pools_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_worker_pools_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Required. The name of the &#x60;WorkerPool&#x60; to delete. Format: &#x60;projects/{project}/locations/{location}/workerPools/{workerPool}&#x60;. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **allow_missing** | **bool**| If set to true, and the &#x60;WorkerPool&#x60; is not found, the request will succeed but no action will be taken on the server. | [optional] 
 **etag** | **str**| Optional. If provided, it must match the server&#39;s etag on the workerpool for the request to be processed. | [optional] 
 **validate_only** | **bool**| If set, validate the request and preview the response, but do not actually post it. | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_worker_pools_get**
> WorkerPool cloudbuild_projects_locations_worker_pools_get(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, trigger_id=trigger_id)



Returns details of a `WorkerPool`.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.worker_pool import WorkerPool
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | Required. The name of the `WorkerPool` to retrieve. Format: `projects/{project}/locations/{location}/workerPools/{workerPool}`.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    project_id = 'project_id_example' # str | Required. ID of the project that owns the trigger. (optional)
    trigger_id = 'trigger_id_example' # str | Required. Identifier (`id` or `name`) of the `BuildTrigger` to get. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_worker_pools_get(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, project_id=project_id, trigger_id=trigger_id)
        print("The response of ProjectsApi->cloudbuild_projects_locations_worker_pools_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_worker_pools_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Required. The name of the &#x60;WorkerPool&#x60; to retrieve. Format: &#x60;projects/{project}/locations/{location}/workerPools/{workerPool}&#x60;. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **project_id** | **str**| Required. ID of the project that owns the trigger. | [optional] 
 **trigger_id** | **str**| Required. Identifier (&#x60;id&#x60; or &#x60;name&#x60;) of the &#x60;BuildTrigger&#x60; to get. | [optional] 

### Return type

[**WorkerPool**](WorkerPool.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_worker_pools_list**
> ListWorkerPoolsResponse cloudbuild_projects_locations_worker_pools_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)



Lists `WorkerPool`s.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_worker_pools_response import ListWorkerPoolsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    parent = 'parent_example' # str | Required. The parent of the collection of `WorkerPools`. Format: `projects/{project}/locations/{location}`.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | The maximum number of `WorkerPool`s to return. The service may return fewer than this value. If omitted, the server will use a sensible default. (optional)
    page_token = 'page_token_example' # str | A page token, received from a previous `ListWorkerPools` call. Provide this to retrieve the subsequent page. (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_worker_pools_list(parent, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token)
        print("The response of ProjectsApi->cloudbuild_projects_locations_worker_pools_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_worker_pools_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **str**| Required. The parent of the collection of &#x60;WorkerPools&#x60;. Format: &#x60;projects/{project}/locations/{location}&#x60;. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| The maximum number of &#x60;WorkerPool&#x60;s to return. The service may return fewer than this value. If omitted, the server will use a sensible default. | [optional] 
 **page_token** | **str**| A page token, received from a previous &#x60;ListWorkerPools&#x60; call. Provide this to retrieve the subsequent page. | [optional] 

### Return type

[**ListWorkerPoolsResponse**](ListWorkerPoolsResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_locations_worker_pools_patch**
> Operation cloudbuild_projects_locations_worker_pools_patch(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, update_mask=update_mask, validate_only=validate_only, worker_pool=worker_pool)



Updates a `WorkerPool`.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.worker_pool import WorkerPool
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    name = 'name_example' # str | Output only. The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    update_mask = 'update_mask_example' # str | A mask specifying which fields in `worker_pool` to update. (optional)
    validate_only = True # bool | If set, validate the request and preview the response, but do not actually post it. (optional)
    worker_pool = openapi_client.WorkerPool() # WorkerPool |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_locations_worker_pools_patch(name, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, update_mask=update_mask, validate_only=validate_only, worker_pool=worker_pool)
        print("The response of ProjectsApi->cloudbuild_projects_locations_worker_pools_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_locations_worker_pools_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Output only. The resource name of the &#x60;WorkerPool&#x60;, with format &#x60;projects/{project}/locations/{location}/workerPools/{worker_pool}&#x60;. The value of &#x60;{worker_pool}&#x60; is provided by &#x60;worker_pool_id&#x60; in &#x60;CreateWorkerPool&#x60; request and the value of &#x60;{location}&#x60; is determined by the endpoint accessed. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **update_mask** | **str**| A mask specifying which fields in &#x60;worker_pool&#x60; to update. | [optional] 
 **validate_only** | **bool**| If set, validate the request and preview the response, but do not actually post it. | [optional] 
 **worker_pool** | [**WorkerPool**](WorkerPool.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_create**
> BuildTrigger cloudbuild_projects_triggers_create(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, parent=parent, build_trigger=build_trigger)



Creates a new `BuildTrigger`. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build_trigger import BuildTrigger
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project for which to configure automatic builds.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    parent = 'parent_example' # str | The parent resource where this trigger will be created. Format: `projects/{project}/locations/{location}` (optional)
    build_trigger = openapi_client.BuildTrigger() # BuildTrigger |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_create(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, parent=parent, build_trigger=build_trigger)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project for which to configure automatic builds. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **parent** | **str**| The parent resource where this trigger will be created. Format: &#x60;projects/{project}/locations/{location}&#x60; | [optional] 
 **build_trigger** | [**BuildTrigger**](BuildTrigger.md)|  | [optional] 

### Return type

[**BuildTrigger**](BuildTrigger.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_delete**
> object cloudbuild_projects_triggers_delete(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)



Deletes a `BuildTrigger` by its project ID and trigger ID. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project that owns the trigger.
    trigger_id = 'trigger_id_example' # str | Required. ID of the `BuildTrigger` to delete.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    name = 'name_example' # str | The name of the `Trigger` to delete. Format: `projects/{project}/locations/{location}/triggers/{trigger}` (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_delete(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project that owns the trigger. | 
 **trigger_id** | **str**| Required. ID of the &#x60;BuildTrigger&#x60; to delete. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **name** | **str**| The name of the &#x60;Trigger&#x60; to delete. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | [optional] 

### Return type

**object**

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_get**
> BuildTrigger cloudbuild_projects_triggers_get(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)



Returns information about a `BuildTrigger`. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build_trigger import BuildTrigger
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project that owns the trigger.
    trigger_id = 'trigger_id_example' # str | Required. Identifier (`id` or `name`) of the `BuildTrigger` to get.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    name = 'name_example' # str | The name of the `Trigger` to retrieve. Format: `projects/{project}/locations/{location}/triggers/{trigger}` (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_get(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project that owns the trigger. | 
 **trigger_id** | **str**| Required. Identifier (&#x60;id&#x60; or &#x60;name&#x60;) of the &#x60;BuildTrigger&#x60; to get. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **name** | **str**| The name of the &#x60;Trigger&#x60; to retrieve. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | [optional] 

### Return type

[**BuildTrigger**](BuildTrigger.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_list**
> ListBuildTriggersResponse cloudbuild_projects_triggers_list(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token, parent=parent)



Lists existing `BuildTrigger`s. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.list_build_triggers_response import ListBuildTriggersResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project for which to list BuildTriggers.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    page_size = 56 # int | Number of results to return in the list. (optional)
    page_token = 'page_token_example' # str | Token to provide to skip to a particular spot in the list. (optional)
    parent = 'parent_example' # str | The parent of the collection of `Triggers`. Format: `projects/{project}/locations/{location}` (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_list(project_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, page_size=page_size, page_token=page_token, parent=parent)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project for which to list BuildTriggers. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **page_size** | **int**| Number of results to return in the list. | [optional] 
 **page_token** | **str**| Token to provide to skip to a particular spot in the list. | [optional] 
 **parent** | **str**| The parent of the collection of &#x60;Triggers&#x60;. Format: &#x60;projects/{project}/locations/{location}&#x60; | [optional] 

### Return type

[**ListBuildTriggersResponse**](ListBuildTriggersResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_patch**
> BuildTrigger cloudbuild_projects_triggers_patch(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, build_trigger=build_trigger)



Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.build_trigger import BuildTrigger
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project that owns the trigger.
    trigger_id = 'trigger_id_example' # str | Required. ID of the `BuildTrigger` to update.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    build_trigger = openapi_client.BuildTrigger() # BuildTrigger |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_patch(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, build_trigger=build_trigger)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project that owns the trigger. | 
 **trigger_id** | **str**| Required. ID of the &#x60;BuildTrigger&#x60; to update. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **build_trigger** | [**BuildTrigger**](BuildTrigger.md)|  | [optional] 

### Return type

[**BuildTrigger**](BuildTrigger.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_run**
> Operation cloudbuild_projects_triggers_run(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name, repo_source=repo_source)



Runs a `BuildTrigger` at a particular source revision. To run a regional or global trigger, use the POST request that includes the location endpoint in the path (ex. v1/projects/{projectId}/locations/{region}/triggers/{triggerId}:run). The POST request that does not include the location endpoint in the path can only be used when running global triggers.

### Example

* OAuth Authentication (Oauth2c):
* OAuth Authentication (Oauth2):

```python
import openapi_client
from openapi_client.models.operation import Operation
from openapi_client.models.repo_source import RepoSource
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Required. ID of the project.
    trigger_id = 'trigger_id_example' # str | Required. ID of the trigger.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    name = 'name_example' # str | The name of the `Trigger` to run. Format: `projects/{project}/locations/{location}/triggers/{trigger}` (optional)
    repo_source = openapi_client.RepoSource() # RepoSource |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_run(project_id, trigger_id, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name, repo_source=repo_source)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Required. ID of the project. | 
 **trigger_id** | **str**| Required. ID of the trigger. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **name** | **str**| The name of the &#x60;Trigger&#x60; to run. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | [optional] 
 **repo_source** | [**RepoSource**](RepoSource.md)|  | [optional] 

### Return type

[**Operation**](Operation.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cloudbuild_projects_triggers_webhook**
> object cloudbuild_projects_triggers_webhook(project_id, trigger, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name, secret=secret, http_body=http_body)



ReceiveTriggerWebhook [Experimental] is called when the API receives a webhook request targeted at a specific trigger.

### Example


```python
import openapi_client
from openapi_client.models.http_body import HttpBody
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProjectsApi(api_client)
    project_id = 'project_id_example' # str | Project in which the specified trigger lives
    trigger = 'trigger_example' # str | Name of the trigger to run the payload against
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    name = 'name_example' # str | The name of the `ReceiveTriggerWebhook` to retrieve. Format: `projects/{project}/locations/{location}/triggers/{trigger}` (optional)
    secret = 'secret_example' # str | Secret token used for authorization if an OAuth token isn't provided. (optional)
    http_body = openapi_client.HttpBody() # HttpBody |  (optional)

    try:
        api_response = api_instance.cloudbuild_projects_triggers_webhook(project_id, trigger, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, name=name, secret=secret, http_body=http_body)
        print("The response of ProjectsApi->cloudbuild_projects_triggers_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectsApi->cloudbuild_projects_triggers_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Project in which the specified trigger lives | 
 **trigger** | **str**| Name of the trigger to run the payload against | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **name** | **str**| The name of the &#x60;ReceiveTriggerWebhook&#x60; to retrieve. Format: &#x60;projects/{project}/locations/{location}/triggers/{trigger}&#x60; | [optional] 
 **secret** | **str**| Secret token used for authorization if an OAuth token isn&#39;t provided. | [optional] 
 **http_body** | [**HttpBody**](HttpBody.md)|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

