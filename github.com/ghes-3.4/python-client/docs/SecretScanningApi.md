# openapi_client.SecretScanningApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secret_scanning_get_alert**](SecretScanningApi.md#secret_scanning_get_alert) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number} | Get a secret scanning alert
[**secret_scanning_list_alerts_for_enterprise**](SecretScanningApi.md#secret_scanning_list_alerts_for_enterprise) | **GET** /enterprises/{enterprise}/secret-scanning/alerts | List secret scanning alerts for an enterprise
[**secret_scanning_list_alerts_for_org**](SecretScanningApi.md#secret_scanning_list_alerts_for_org) | **GET** /orgs/{org}/secret-scanning/alerts | List secret scanning alerts for an organization
[**secret_scanning_list_alerts_for_repo**](SecretScanningApi.md#secret_scanning_list_alerts_for_repo) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts | List secret scanning alerts for a repository
[**secret_scanning_list_locations_for_alert**](SecretScanningApi.md#secret_scanning_list_locations_for_alert) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations | List locations for a secret scanning alert
[**secret_scanning_update_alert**](SecretScanningApi.md#secret_scanning_update_alert) | **PATCH** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number} | Update a secret scanning alert


# **secret_scanning_get_alert**
> SecretScanningAlert secret_scanning_get_alert(owner, repo, alert_number)

Get a secret scanning alert

Gets a single secret scanning alert detected in a private repository. To use this endpoint, you must be an administrator for the repository or organization, and you must use an access token with the `repo` scope or `security_events` scope.  GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.secret_scanning_alert import SecretScanningAlert
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.

    try:
        # Get a secret scanning alert
        api_response = api_instance.secret_scanning_get_alert(owner, repo, alert_number)
        print("The response of SecretScanningApi->secret_scanning_get_alert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_get_alert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 

### Return type

[**SecretScanningAlert**](SecretScanningAlert.md)

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
**404** | Repository is public, or secret scanning is disabled for the repository, or the resource is not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secret_scanning_list_alerts_for_enterprise**
> List[OrganizationSecretScanningAlert] secret_scanning_list_alerts_for_enterprise(enterprise, state=state, secret_type=secret_type, resolution=resolution, per_page=per_page, before=before, after=after)

List secret scanning alerts for an enterprise

Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest. To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/enterprise-server@3.4/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).

### Example


```python
import openapi_client
from openapi_client.models.organization_secret_scanning_alert import OrganizationSecretScanningAlert
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    state = 'state_example' # str | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. (optional)
    secret_type = 'secret_type_example' # str | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types. (optional)
    resolution = 'resolution_example' # str | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    before = 'before_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. (optional)
    after = 'after_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. (optional)

    try:
        # List secret scanning alerts for an enterprise
        api_response = api_instance.secret_scanning_list_alerts_for_enterprise(enterprise, state=state, secret_type=secret_type, resolution=resolution, per_page=per_page, before=before, after=after)
        print("The response of SecretScanningApi->secret_scanning_list_alerts_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_list_alerts_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **state** | **str**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] 
 **secret_type** | **str**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional] 
 **resolution** | **str**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **before** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. | [optional] 
 **after** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. | [optional] 

### Return type

[**List[OrganizationSecretScanningAlert]**](OrganizationSecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secret_scanning_list_alerts_for_org**
> List[OrganizationSecretScanningAlert] secret_scanning_list_alerts_for_org(org, state=state, secret_type=secret_type, resolution=resolution, page=page, per_page=per_page)

List secret scanning alerts for an organization

Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest. To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.  GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.organization_secret_scanning_alert import OrganizationSecretScanningAlert
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    state = 'state_example' # str | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. (optional)
    secret_type = 'secret_type_example' # str | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types. (optional)
    resolution = 'resolution_example' # str | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. (optional)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List secret scanning alerts for an organization
        api_response = api_instance.secret_scanning_list_alerts_for_org(org, state=state, secret_type=secret_type, resolution=resolution, page=page, per_page=per_page)
        print("The response of SecretScanningApi->secret_scanning_list_alerts_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_list_alerts_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **state** | **str**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] 
 **secret_type** | **str**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional] 
 **resolution** | **str**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional] 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**List[OrganizationSecretScanningAlert]**](OrganizationSecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secret_scanning_list_alerts_for_repo**
> List[SecretScanningAlert] secret_scanning_list_alerts_for_repo(owner, repo, state=state, secret_type=secret_type, resolution=resolution, page=page, per_page=per_page)

List secret scanning alerts for a repository

Lists secret scanning alerts for a private repository, from newest to oldest. To use this endpoint, you must be an administrator for the repository or organization, and you must use an access token with the `repo` scope or `security_events` scope.  GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.secret_scanning_alert import SecretScanningAlert
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    state = 'state_example' # str | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. (optional)
    secret_type = 'secret_type_example' # str | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types. (optional)
    resolution = 'resolution_example' # str | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. (optional)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List secret scanning alerts for a repository
        api_response = api_instance.secret_scanning_list_alerts_for_repo(owner, repo, state=state, secret_type=secret_type, resolution=resolution, page=page, per_page=per_page)
        print("The response of SecretScanningApi->secret_scanning_list_alerts_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_list_alerts_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **state** | **str**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] 
 **secret_type** | **str**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/enterprise-server@3.4/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional] 
 **resolution** | **str**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional] 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**List[SecretScanningAlert]**](SecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Repository is public or secret scanning is disabled for the repository |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secret_scanning_list_locations_for_alert**
> List[SecretScanningLocation] secret_scanning_list_locations_for_alert(owner, repo, alert_number, page=page, per_page=per_page)

List locations for a secret scanning alert

Lists all locations for a given secret scanning alert for a private repository. To use this endpoint, you must be an administrator for the repository or organization, and you must use an access token with the `repo` scope or `security_events` scope.  GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.secret_scanning_location import SecretScanningLocation
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List locations for a secret scanning alert
        api_response = api_instance.secret_scanning_list_locations_for_alert(owner, repo, alert_number, page=page, per_page=per_page)
        print("The response of SecretScanningApi->secret_scanning_list_locations_for_alert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_list_locations_for_alert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**List[SecretScanningLocation]**](SecretScanningLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Repository is public, or secret scanning is disabled for the repository, or the resource is not found |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **secret_scanning_update_alert**
> SecretScanningAlert secret_scanning_update_alert(owner, repo, alert_number, secret_scanning_update_alert_request)

Update a secret scanning alert

Updates the status of a secret scanning alert in a private repository. To use this endpoint, you must be an administrator for the repository or organization, and you must use an access token with the `repo` scope or `security_events` scope.  GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.secret_scanning_alert import SecretScanningAlert
from openapi_client.models.secret_scanning_update_alert_request import SecretScanningUpdateAlertRequest
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
    api_instance = openapi_client.SecretScanningApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    alert_number = 56 # int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
    secret_scanning_update_alert_request = {"resolution":"false_positive","state":"resolved"} # SecretScanningUpdateAlertRequest | 

    try:
        # Update a secret scanning alert
        api_response = api_instance.secret_scanning_update_alert(owner, repo, alert_number, secret_scanning_update_alert_request)
        print("The response of SecretScanningApi->secret_scanning_update_alert:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SecretScanningApi->secret_scanning_update_alert: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **alert_number** | **int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. | 
 **secret_scanning_update_alert_request** | [**SecretScanningUpdateAlertRequest**](SecretScanningUpdateAlertRequest.md)|  | 

### Return type

[**SecretScanningAlert**](SecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Repository is public, or secret scanning is disabled for the repository, or the resource is not found |  -  |
**422** | State does not match the resolution |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

