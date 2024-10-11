# openapi_client.CodeScanningApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**code_scanning_delete_analysis**](CodeScanningApi.md#code_scanning_delete_analysis) | **DELETE** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Delete a code scanning analysis from a repository
[**code_scanning_get_alert**](CodeScanningApi.md#code_scanning_get_alert) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Get a code scanning alert
[**code_scanning_get_analysis**](CodeScanningApi.md#code_scanning_get_analysis) | **GET** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Get a code scanning analysis for a repository
[**code_scanning_get_sarif**](CodeScanningApi.md#code_scanning_get_sarif) | **GET** /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id} | Get information about a SARIF upload
[**code_scanning_list_alert_instances**](CodeScanningApi.md#code_scanning_list_alert_instances) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances | List instances of a code scanning alert
[**code_scanning_list_alerts_for_repo**](CodeScanningApi.md#code_scanning_list_alerts_for_repo) | **GET** /repos/{owner}/{repo}/code-scanning/alerts | List code scanning alerts for a repository
[**code_scanning_list_recent_analyses**](CodeScanningApi.md#code_scanning_list_recent_analyses) | **GET** /repos/{owner}/{repo}/code-scanning/analyses | List code scanning analyses for a repository
[**code_scanning_update_alert**](CodeScanningApi.md#code_scanning_update_alert) | **PATCH** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Update a code scanning alert
[**code_scanning_upload_sarif**](CodeScanningApi.md#code_scanning_upload_sarif) | **POST** /repos/{owner}/{repo}/code-scanning/sarifs | Upload an analysis as SARIF data


# **code_scanning_delete_analysis**
> CodeScanningAnalysisDeletion code_scanning_delete_analysis(owner, repo, analysis_id, confirm_delete=confirm_delete)

Delete a code scanning analysis from a repository

Deletes a specified code scanning analysis from a repository. For private repositories, you must use an access token with the `repo` scope. For public repositories, you must use an access token with `public_repo` scope. GitHub Apps must have the `security_events` write permission to use this endpoint.  You can delete one analysis at a time. To delete a series of analyses, start with the most recent analysis and work backwards. Conceptually, the process is similar to the undo function in a text editor.  When you list the analyses for a repository, one or more will be identified as deletable in the response:  ``` \"deletable\": true ```  An analysis is deletable when it's the most recent in a set of analyses. Typically, a repository will have multiple sets of analyses for each enabled code scanning tool, where a set is determined by a unique combination of analysis values:  * `ref` * `tool` * `category`  If you attempt to delete an analysis that is not the most recent in a set, you'll get a 400 response with the message:  ``` Analysis specified is not deletable. ```  The response from a successful `DELETE` operation provides you with two alternative URLs for deleting the next analysis in the set: `next_analysis_url` and `confirm_delete_url`. Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis in a set. This is a useful option if you want to preserve at least one analysis for the specified tool in your repository. Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool. When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url` in the 200 response is `null`.  As an example of the deletion process, let's imagine that you added a workflow that configured a particular code scanning tool to analyze the code in a repository. This tool has added 15 analyses: 10 on the default branch, and another 5 on a topic branch. You therefore have two separate sets of analyses for this tool. You've now decided that you want to remove all of the analyses for the tool. To do this you must make 15 separate deletion requests. To start, you must find an analysis that's identified as deletable. Each set of analyses always has one that's identified as deletable. Having found the deletable analysis for one of the two sets, delete this analysis and then continue deleting the next analysis in the set until they're all deleted. Then repeat the process for the second set. The procedure therefore consists of a nested loop:  **Outer loop**: * List the analyses for the repository, filtered by tool. * Parse this list to find a deletable analysis. If found:    **Inner loop**:   * Delete the identified analysis.   * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.  The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface, for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's analysis entirely.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_analysis_deletion import CodeScanningAnalysisDeletion
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    analysis_id = 56 # int | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.
    confirm_delete = 'confirm_delete_example' # str | Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message: `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.` (optional)

    try:
        # Delete a code scanning analysis from a repository
        api_response = api_instance.code_scanning_delete_analysis(owner, repo, analysis_id, confirm_delete=confirm_delete)
        print("The response of CodeScanningApi->code_scanning_delete_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_delete_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **analysis_id** | **int**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. | 
 **confirm_delete** | **str**| Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to &#x60;true&#x60;, you&#39;ll get a 400 response with the message: &#x60;Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.&#x60; | [optional] 

### Return type

[**CodeScanningAnalysisDeletion**](CodeScanningAnalysisDeletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**400** | Bad Request |  -  |
**403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_get_alert**
> CodeScanningAlert code_scanning_get_alert(owner, repo, alert_number)

Get a code scanning alert

Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.  **Deprecation notice**: The instances field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The same information can now be retrieved via a GET request to the URL specified by `instances_url`.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_alert import CodeScanningAlert
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.

    try:
        # Get a code scanning alert
        api_response = api_instance.code_scanning_get_alert(owner, repo, alert_number)
        print("The response of CodeScanningApi->code_scanning_get_alert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_get_alert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 

### Return type

[**CodeScanningAlert**](CodeScanningAlert.md)

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
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_get_analysis**
> CodeScanningAnalysis code_scanning_get_analysis(owner, repo, analysis_id)

Get a code scanning analysis for a repository

Gets a specified code scanning analysis for a repository. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.  The default JSON response contains fields that describe the analysis. This includes the Git reference and commit SHA to which the analysis relates, the datetime of the analysis, the name of the code scanning tool, and the number of alerts.  The `rules_count` field in the default response give the number of rules that were run in the analysis. For very old analyses this data is not available, and `0` is returned in this field.  If you use the Accept header `application/sarif+json`, the response contains the analysis data that was uploaded. This is formatted as [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_analysis import CodeScanningAnalysis
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    analysis_id = 56 # int | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.

    try:
        # Get a code scanning analysis for a repository
        api_response = api_instance.code_scanning_get_analysis(owner, repo, analysis_id)
        print("The response of CodeScanningApi->code_scanning_get_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_get_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **analysis_id** | **int**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. | 

### Return type

[**CodeScanningAnalysis**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json+sarif

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_get_sarif**
> CodeScanningSarifsStatus code_scanning_get_sarif(owner, repo, sarif_id)

Get information about a SARIF upload

Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see \"[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository).\" You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_sarifs_status import CodeScanningSarifsStatus
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sarif_id = 'sarif_id_example' # str | The SARIF ID obtained after uploading.

    try:
        # Get information about a SARIF upload
        api_response = api_instance.code_scanning_get_sarif(owner, repo, sarif_id)
        print("The response of CodeScanningApi->code_scanning_get_sarif:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_get_sarif: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sarif_id** | **str**| The SARIF ID obtained after uploading. | 

### Return type

[**CodeScanningSarifsStatus**](CodeScanningSarifsStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Not Found if the sarif id does not match any upload |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_list_alert_instances**
> List[CodeScanningAlertInstance] code_scanning_list_alert_instances(owner, repo, alert_number, page=page, per_page=per_page, ref=ref)

List instances of a code scanning alert

Lists all instances of the specified code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_alert_instance import CodeScanningAlertInstance
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    ref = 'ref_example' # str | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. (optional)

    try:
        # List instances of a code scanning alert
        api_response = api_instance.code_scanning_list_alert_instances(owner, repo, alert_number, page=page, per_page=per_page, ref=ref)
        print("The response of CodeScanningApi->code_scanning_list_alert_instances:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_list_alert_instances: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **ref** | **str**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] 

### Return type

[**List[CodeScanningAlertInstance]**](CodeScanningAlertInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_list_alerts_for_repo**
> List[CodeScanningAlertItems] code_scanning_list_alerts_for_repo(owner, repo, tool_name=tool_name, tool_guid=tool_guid, page=page, per_page=per_page, ref=ref, direction=direction, sort=sort, state=state)

List code scanning alerts for a repository

Lists code scanning alerts.  To use this endpoint, you must use an access token with the `security_events` scope or, for alerts from public repositories only, an access token with the `public_repo` scope.  GitHub Apps must have the `security_events` read permission to use this endpoint.  The response includes a `most_recent_instance` object. This provides details of the most recent instance of this alert for the default branch (or for the specified Git reference if you used `ref` in the request).

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_alert_items import CodeScanningAlertItems
from openapi_client.models.code_scanning_alert_state import CodeScanningAlertState
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    tool_name = 'tool_name_example' # str | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. (optional)
    tool_guid = 'tool_guid_example' # str | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. (optional)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    ref = 'ref_example' # str | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. (optional)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str | The property by which to sort the results. (optional) (default to created)
    state = openapi_client.CodeScanningAlertState() # CodeScanningAlertState | If specified, only code scanning alerts with this state will be returned. (optional)

    try:
        # List code scanning alerts for a repository
        api_response = api_instance.code_scanning_list_alerts_for_repo(owner, repo, tool_name=tool_name, tool_guid=tool_guid, page=page, per_page=per_page, ref=ref, direction=direction, sort=sort, state=state)
        print("The response of CodeScanningApi->code_scanning_list_alerts_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_list_alerts_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **tool_name** | **str**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional] 
 **tool_guid** | **str**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional] 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **ref** | **str**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] 
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**| The property by which to sort the results. | [optional] [default to created]
 **state** | [**CodeScanningAlertState**](.md)| If specified, only code scanning alerts with this state will be returned. | [optional] 

### Return type

[**List[CodeScanningAlertItems]**](CodeScanningAlertItems.md)

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
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_list_recent_analyses**
> List[CodeScanningAnalysis] code_scanning_list_recent_analyses(owner, repo, tool_name=tool_name, tool_guid=tool_guid, page=page, per_page=per_page, ref=ref, sarif_id=sarif_id)

List code scanning analyses for a repository

Lists the details of all code scanning analyses for a repository, starting with the most recent. The response is paginated and you can use the `page` and `per_page` parameters to list the analyses you're interested in. By default 30 analyses are listed per page.  The `rules_count` field in the response give the number of rules that were run in the analysis. For very old analyses this data is not available, and `0` is returned in this field.  You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.  **Deprecation notice**: The `tool_name` field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the `tool` field.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_analysis import CodeScanningAnalysis
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    tool_name = 'tool_name_example' # str | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. (optional)
    tool_guid = 'tool_guid_example' # str | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. (optional)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    ref = 'ref_example' # str | The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. (optional)
    sarif_id = 'sarif_id_example' # str | Filter analyses belonging to the same SARIF upload. (optional)

    try:
        # List code scanning analyses for a repository
        api_response = api_instance.code_scanning_list_recent_analyses(owner, repo, tool_name=tool_name, tool_guid=tool_guid, page=page, per_page=per_page, ref=ref, sarif_id=sarif_id)
        print("The response of CodeScanningApi->code_scanning_list_recent_analyses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_list_recent_analyses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **tool_name** | **str**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional] 
 **tool_guid** | **str**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional] 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **ref** | **str**| The Git reference for the analyses you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional] 
 **sarif_id** | **str**| Filter analyses belonging to the same SARIF upload. | [optional] 

### Return type

[**List[CodeScanningAnalysis]**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_update_alert**
> CodeScanningAlert code_scanning_update_alert(owner, repo, alert_number, code_scanning_update_alert_request)

Update a code scanning alert

Updates the status of a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_alert import CodeScanningAlert
from openapi_client.models.code_scanning_update_alert_request import CodeScanningUpdateAlertRequest
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    code_scanning_update_alert_request = {"dismissed_comment":"This alert is not actually correct, because there's a sanitizer included in the library.","dismissed_reason":"false positive","state":"dismissed"} # CodeScanningUpdateAlertRequest | 

    try:
        # Update a code scanning alert
        api_response = api_instance.code_scanning_update_alert(owner, repo, alert_number, code_scanning_update_alert_request)
        print("The response of CodeScanningApi->code_scanning_update_alert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_update_alert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 
 **code_scanning_update_alert_request** | [**CodeScanningUpdateAlertRequest**](CodeScanningUpdateAlertRequest.md)|  | 

### Return type

[**CodeScanningAlert**](CodeScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **code_scanning_upload_sarif**
> CodeScanningSarifsReceipt code_scanning_upload_sarif(owner, repo, code_scanning_upload_sarif_request)

Upload an analysis as SARIF data

Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.  There are two places where you can upload code scanning results. - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the results appear as alerts in a pull request check. For more information, see \"[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests).\" - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security** tab for your repository. For more information, see \"[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository).\"  You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a Base64 format string. For example:  ``` gzip -c analysis-data.sarif | base64 -w0 ``` <br> SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable. To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries.   | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            | |----------------------------------|:------------------:|----------------------------------------------------------------------------------| | Runs per file                    |         15         |                                                                                  | | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            | | Rules per run                    |       25,000       |                                                                                  | | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. | | Location per result              |       1,000        | Only 100 locations will be included.                                             |  The `202 Accepted` response includes an `id` value. You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint. For more information, see \"[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload).\"

### Example


```python
import openapi_client
from openapi_client.models.code_scanning_sarifs_receipt import CodeScanningSarifsReceipt
from openapi_client.models.code_scanning_upload_sarif_request import CodeScanningUploadSarifRequest
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
    api_instance = openapi_client.CodeScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    code_scanning_upload_sarif_request = {"commit_sha":"4b6472266afd7b471e86085a6659e8c7f2b119da","ref":"refs/heads/master","sarif":"H4sICMLGdF4AA2V4YW1wbGUuc2FyaWYAvVjdbts2FL7PUxDCijaA/CM7iRNfLkPXYgHSNstumlzQ0pHFVCI1korjFgH2ONtr7Ul2KFmy/mOn6QIkjsjDw0/nfN85NL8dEGL9pNwAImqRObECrWM1H40kXQ2XTAfJIlEgXcE1cD10RTQSVDE10K4aKSqZP1AxuKOIKg1ydJU60jSfSh8Hk6EzHA/vlOCWbfa7B6kYPpj90rlsWCZcmbHP5Bs+4oAWIjQD2SMOeJLh2vIQDnIaQerqXHjw8YIgxohybxAyDsS4cAPKsp03K4RcUs6+Up2D+JXpd8mibKIQN9fM/aMCdbyBujGSSQgVxJtx5qX2d2qUcIweQhEuDQf3GBO6CKHkogx/N3MVCKl/AeVKFuf4y5ubsMGDTj1ep+5I7sgmLIpxtU38hLtmMRGSuCFVyip5eKzs5ydh+LztVL6f2m6oih1BkYiuyQIIJWodxVpERPj4sEiWBNNH8EWT0DMG8EAjzKVHXCrB4FkPu/F64NMk1OeC+2yZSNoBOoR7CC0EzYWGbm+xFDFIzbI011+cLjfZtyJkmMZfumAh02uL3NpV2y+MZ6RAjxibyKrNxxJcVjANSb4eBGwZ1M0KsuyR2poLr5rMl8vaDSeVn6eTWEO2j2xIEcmhwlTKNOi4GMOI8gfuZYkvJ7b4v5Tiumyz7RnHeodFzpS8ASIZCH/AYdWi2z3sG8JtFxJ6fF9yR9CdifBr9Pd6d5V2+zbJKjjCFGGmsHuYFy2ytJq9tUxcLSRSQecppOGKrpUxYfxefMEFK+wOGa4hudQByBVT0L+EKtyACxnRsABhEx1QjVDs1KNI9MbpnhqfE45B6FJvu3hRu5VRU9MhZLmK7fqkKyQSTHNoyMqUFMqXCV3CwAeqEwmVokraK8IuBaGvHjQ0gMYrKjnjyw7uk9uD8tgmsBbFMPnU1bV2ZhkJNkuolUiWys3UPWzs5aaIUz9TBe8zMb+6+nT+6fLy91dlE3xzeDDT4zYszb0bW6NjJd0Rvn2EnLvWLFSdKPpBzInzfRgu8ETyMcH8nIfMnJCeC2PyfTA+UKngcnGH7Hw2hGkVQs5YlIRCtdWZYQ4/73es2JlxkfViOEIhoWJq5Oo6UBBfiKIqFBWhiE3jJGbFwVoxBHTRSuIS67sMeplei24X20shLjG+8gqbKC/bESiNMC+wd5q5id0yeS7CJEqXzmrTWNq3k05l84P6f4/bEmXFJjI0fIt1BGQssUnUDkBYeVhE5TqPnMH3jqogDcP0zKcTgLPTMSzOjhbjuVOmW23l1fYNStulfo6sXlFsGLhbDy5RECPRYGCTgOj2bd4nUQEivEd0H7KKYxqnEhFohuur3a3UPskbH/+Yg0+M5P2MHRJu3ziHh3Z2NCrWt3XF1rWTw8Ne/pfbWYXnDSE0SNZQQt1i18q7te2vOhu7ehWuvVyeu0wbLZi24mhoo6aOOTltzG/lgdVvVoXQq5V+pewkFIzL8fjEcadT55jOjpzFzHuOTtDNrMkJPMVQDd7F09RID72O/UPZ0tmctqZ7kWX6EmSZnDpP8GU67SXM8XE3YSrxbKsx6UReZ4y6n/FVZfJjs9Z7stma75W5yQtkzjk5eSJxk1lv4o7+j8TlhaJ2lsKWZO6lruDPBLib3x5ZN/KGWzZ+pn///evv7OOf4iIBv3oY9L/l1wiJ9p0Tc+F1zZnOE9NxXWEus6IQhr5pMfoqxi8WPsuu0azsns4UC6WzNzHIzbeEx4P/AJ3SefgcFAAA"} # CodeScanningUploadSarifRequest | 

    try:
        # Upload an analysis as SARIF data
        api_response = api_instance.code_scanning_upload_sarif(owner, repo, code_scanning_upload_sarif_request)
        print("The response of CodeScanningApi->code_scanning_upload_sarif:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodeScanningApi->code_scanning_upload_sarif: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **code_scanning_upload_sarif_request** | [**CodeScanningUploadSarifRequest**](CodeScanningUploadSarifRequest.md)|  | 

### Return type

[**CodeScanningSarifsReceipt**](CodeScanningSarifsReceipt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |
**400** | Bad Request if the sarif field is invalid |  -  |
**403** | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository |  -  |
**404** | Resource not found |  -  |
**413** | Payload Too Large if the sarif field is too large |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

