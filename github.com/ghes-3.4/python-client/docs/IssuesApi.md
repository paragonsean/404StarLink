# openapi_client.IssuesApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issues_add_assignees**](IssuesApi.md#issues_add_assignees) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/assignees | Add assignees to an issue
[**issues_add_labels**](IssuesApi.md#issues_add_labels) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/labels | Add labels to an issue
[**issues_check_user_can_be_assigned**](IssuesApi.md#issues_check_user_can_be_assigned) | **GET** /repos/{owner}/{repo}/assignees/{assignee} | Check if a user can be assigned
[**issues_check_user_can_be_assigned_to_issue**](IssuesApi.md#issues_check_user_can_be_assigned_to_issue) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee} | Check if a user can be assigned to a issue
[**issues_create**](IssuesApi.md#issues_create) | **POST** /repos/{owner}/{repo}/issues | Create an issue
[**issues_create_comment**](IssuesApi.md#issues_create_comment) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/comments | Create an issue comment
[**issues_create_label**](IssuesApi.md#issues_create_label) | **POST** /repos/{owner}/{repo}/labels | Create a label
[**issues_create_milestone**](IssuesApi.md#issues_create_milestone) | **POST** /repos/{owner}/{repo}/milestones | Create a milestone
[**issues_delete_comment**](IssuesApi.md#issues_delete_comment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{comment_id} | Delete an issue comment
[**issues_delete_label**](IssuesApi.md#issues_delete_label) | **DELETE** /repos/{owner}/{repo}/labels/{name} | Delete a label
[**issues_delete_milestone**](IssuesApi.md#issues_delete_milestone) | **DELETE** /repos/{owner}/{repo}/milestones/{milestone_number} | Delete a milestone
[**issues_get**](IssuesApi.md#issues_get) | **GET** /repos/{owner}/{repo}/issues/{issue_number} | Get an issue
[**issues_get_comment**](IssuesApi.md#issues_get_comment) | **GET** /repos/{owner}/{repo}/issues/comments/{comment_id} | Get an issue comment
[**issues_get_event**](IssuesApi.md#issues_get_event) | **GET** /repos/{owner}/{repo}/issues/events/{event_id} | Get an issue event
[**issues_get_label**](IssuesApi.md#issues_get_label) | **GET** /repos/{owner}/{repo}/labels/{name} | Get a label
[**issues_get_milestone**](IssuesApi.md#issues_get_milestone) | **GET** /repos/{owner}/{repo}/milestones/{milestone_number} | Get a milestone
[**issues_list**](IssuesApi.md#issues_list) | **GET** /issues | List issues assigned to the authenticated user
[**issues_list_assignees**](IssuesApi.md#issues_list_assignees) | **GET** /repos/{owner}/{repo}/assignees | List assignees
[**issues_list_comments**](IssuesApi.md#issues_list_comments) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/comments | List issue comments
[**issues_list_comments_for_repo**](IssuesApi.md#issues_list_comments_for_repo) | **GET** /repos/{owner}/{repo}/issues/comments | List issue comments for a repository
[**issues_list_events**](IssuesApi.md#issues_list_events) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/events | List issue events
[**issues_list_events_for_repo**](IssuesApi.md#issues_list_events_for_repo) | **GET** /repos/{owner}/{repo}/issues/events | List issue events for a repository
[**issues_list_events_for_timeline**](IssuesApi.md#issues_list_events_for_timeline) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/timeline | List timeline events for an issue
[**issues_list_for_authenticated_user**](IssuesApi.md#issues_list_for_authenticated_user) | **GET** /user/issues | List user account issues assigned to the authenticated user
[**issues_list_for_org**](IssuesApi.md#issues_list_for_org) | **GET** /orgs/{org}/issues | List organization issues assigned to the authenticated user
[**issues_list_for_repo**](IssuesApi.md#issues_list_for_repo) | **GET** /repos/{owner}/{repo}/issues | List repository issues
[**issues_list_labels_for_milestone**](IssuesApi.md#issues_list_labels_for_milestone) | **GET** /repos/{owner}/{repo}/milestones/{milestone_number}/labels | List labels for issues in a milestone
[**issues_list_labels_for_repo**](IssuesApi.md#issues_list_labels_for_repo) | **GET** /repos/{owner}/{repo}/labels | List labels for a repository
[**issues_list_labels_on_issue**](IssuesApi.md#issues_list_labels_on_issue) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/labels | List labels for an issue
[**issues_list_milestones**](IssuesApi.md#issues_list_milestones) | **GET** /repos/{owner}/{repo}/milestones | List milestones
[**issues_lock**](IssuesApi.md#issues_lock) | **PUT** /repos/{owner}/{repo}/issues/{issue_number}/lock | Lock an issue
[**issues_remove_all_labels**](IssuesApi.md#issues_remove_all_labels) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/labels | Remove all labels from an issue
[**issues_remove_assignees**](IssuesApi.md#issues_remove_assignees) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/assignees | Remove assignees from an issue
[**issues_remove_label**](IssuesApi.md#issues_remove_label) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/labels/{name} | Remove a label from an issue
[**issues_set_labels**](IssuesApi.md#issues_set_labels) | **PUT** /repos/{owner}/{repo}/issues/{issue_number}/labels | Set labels for an issue
[**issues_unlock**](IssuesApi.md#issues_unlock) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/lock | Unlock an issue
[**issues_update**](IssuesApi.md#issues_update) | **PATCH** /repos/{owner}/{repo}/issues/{issue_number} | Update an issue
[**issues_update_comment**](IssuesApi.md#issues_update_comment) | **PATCH** /repos/{owner}/{repo}/issues/comments/{comment_id} | Update an issue comment
[**issues_update_label**](IssuesApi.md#issues_update_label) | **PATCH** /repos/{owner}/{repo}/labels/{name} | Update a label
[**issues_update_milestone**](IssuesApi.md#issues_update_milestone) | **PATCH** /repos/{owner}/{repo}/milestones/{milestone_number} | Update a milestone


# **issues_add_assignees**
> Issue issues_add_assignees(owner, repo, issue_number, issues_add_assignees_request=issues_add_assignees_request)

Add assignees to an issue

Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
from openapi_client.models.issues_add_assignees_request import IssuesAddAssigneesRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_add_assignees_request = {"assignees":["hubot","other_user"]} # IssuesAddAssigneesRequest |  (optional)

    try:
        # Add assignees to an issue
        api_response = api_instance.issues_add_assignees(owner, repo, issue_number, issues_add_assignees_request=issues_add_assignees_request)
        print("The response of IssuesApi->issues_add_assignees:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_add_assignees: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_add_assignees_request** | [**IssuesAddAssigneesRequest**](IssuesAddAssigneesRequest.md)|  | [optional] 

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_add_labels**
> List[Label] issues_add_labels(owner, repo, issue_number, issues_add_labels_request=issues_add_labels_request)

Add labels to an issue



### Example


```python
import openapi_client
from openapi_client.models.issues_add_labels_request import IssuesAddLabelsRequest
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_add_labels_request = {"labels":["bug","enhancement"]} # IssuesAddLabelsRequest |  (optional)

    try:
        # Add labels to an issue
        api_response = api_instance.issues_add_labels(owner, repo, issue_number, issues_add_labels_request=issues_add_labels_request)
        print("The response of IssuesApi->issues_add_labels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_add_labels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_add_labels_request** | [**IssuesAddLabelsRequest**](IssuesAddLabelsRequest.md)|  | [optional] 

### Return type

[**List[Label]**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_check_user_can_be_assigned**
> issues_check_user_can_be_assigned(owner, repo, assignee)

Check if a user can be assigned

Checks if a user has permission to be assigned to an issue in this repository.  If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.  Otherwise a `404` status code is returned.

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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    assignee = 'assignee_example' # str | 

    try:
        # Check if a user can be assigned
        api_instance.issues_check_user_can_be_assigned(owner, repo, assignee)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_check_user_can_be_assigned: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **assignee** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | If the &#x60;assignee&#x60; can be assigned to issues in the repository, a &#x60;204&#x60; header with no content is returned. |  -  |
**404** | Otherwise a &#x60;404&#x60; status code is returned. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_check_user_can_be_assigned_to_issue**
> issues_check_user_can_be_assigned_to_issue(owner, repo, issue_number, assignee)

Check if a user can be assigned to a issue

Checks if a user has permission to be assigned to a specific issue.  If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.  Otherwise a `404` status code is returned.

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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    assignee = 'assignee_example' # str | 

    try:
        # Check if a user can be assigned to a issue
        api_instance.issues_check_user_can_be_assigned_to_issue(owner, repo, issue_number, assignee)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_check_user_can_be_assigned_to_issue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **assignee** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response if &#x60;assignee&#x60; can be assigned to &#x60;issue_number&#x60; |  -  |
**404** | Response if &#x60;assignee&#x60; can not be assigned to &#x60;issue_number&#x60; |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_create**
> Issue issues_create(owner, repo, issues_create_request)

Create an issue

Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/enterprise-server@3.4/articles/disabling-issues/), the API returns a `410 Gone` status.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
from openapi_client.models.issues_create_request import IssuesCreateRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issues_create_request = {"assignees":["octocat"],"body":"I'm having a problem with this.","labels":["bug"],"milestone":1,"title":"Found a bug"} # IssuesCreateRequest | 

    try:
        # Create an issue
        api_response = api_instance.issues_create(owner, repo, issues_create_request)
        print("The response of IssuesApi->issues_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issues_create_request** | [**IssuesCreateRequest**](IssuesCreateRequest.md)|  | 

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_create_comment**
> IssueComment issues_create_comment(owner, repo, issue_number, issues_update_comment_request)

Create an issue comment

This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.issue_comment import IssueComment
from openapi_client.models.issues_update_comment_request import IssuesUpdateCommentRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_update_comment_request = {"body":"Me too"} # IssuesUpdateCommentRequest | 

    try:
        # Create an issue comment
        api_response = api_instance.issues_create_comment(owner, repo, issue_number, issues_update_comment_request)
        print("The response of IssuesApi->issues_create_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_create_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_update_comment_request** | [**IssuesUpdateCommentRequest**](IssuesUpdateCommentRequest.md)|  | 

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_create_label**
> Label issues_create_label(owner, repo, issues_create_label_request)

Create a label



### Example


```python
import openapi_client
from openapi_client.models.issues_create_label_request import IssuesCreateLabelRequest
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issues_create_label_request = {"color":"f29513","description":"Something isn't working","name":"bug"} # IssuesCreateLabelRequest | 

    try:
        # Create a label
        api_response = api_instance.issues_create_label(owner, repo, issues_create_label_request)
        print("The response of IssuesApi->issues_create_label:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_create_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issues_create_label_request** | [**IssuesCreateLabelRequest**](IssuesCreateLabelRequest.md)|  | 

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_create_milestone**
> Milestone issues_create_milestone(owner, repo, issues_create_milestone_request)

Create a milestone



### Example


```python
import openapi_client
from openapi_client.models.issues_create_milestone_request import IssuesCreateMilestoneRequest
from openapi_client.models.milestone import Milestone
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issues_create_milestone_request = {"description":"Tracking milestone for version 1.0","due_on":"2012-10-09T23:39:01Z","state":"open","title":"v1.0"} # IssuesCreateMilestoneRequest | 

    try:
        # Create a milestone
        api_response = api_instance.issues_create_milestone(owner, repo, issues_create_milestone_request)
        print("The response of IssuesApi->issues_create_milestone:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_create_milestone: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issues_create_milestone_request** | [**IssuesCreateMilestoneRequest**](IssuesCreateMilestoneRequest.md)|  | 

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_delete_comment**
> issues_delete_comment(owner, repo, comment_id)

Delete an issue comment



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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Delete an issue comment
        api_instance.issues_delete_comment(owner, repo, comment_id)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_delete_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_delete_label**
> issues_delete_label(owner, repo, name)

Delete a label



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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    name = 'name_example' # str | 

    try:
        # Delete a label
        api_instance.issues_delete_label(owner, repo, name)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_delete_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_delete_milestone**
> issues_delete_milestone(owner, repo, milestone_number)

Delete a milestone



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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    milestone_number = 56 # int | The number that identifies the milestone.

    try:
        # Delete a milestone
        api_instance.issues_delete_milestone(owner, repo, milestone_number)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_delete_milestone: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **milestone_number** | **int**| The number that identifies the milestone. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_get**
> Issue issues_get(owner, repo, issue_number)

Get an issue

The API returns a [`301 Moved Permanently` status](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-redirects-redirects) if the issue was [transferred](https://docs.github.com/enterprise-server@3.4/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads/#issues) webhook.  **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \"Issues\" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key. Be aware that the `id` of a pull request returned from \"Issues\" endpoints will be an _issue id_. To find out the pull request id, use the \"[List pull requests](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#list-pull-requests)\" endpoint.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.

    try:
        # Get an issue
        api_response = api_instance.issues_get(owner, repo, issue_number)
        print("The response of IssuesApi->issues_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_get_comment**
> IssueComment issues_get_comment(owner, repo, comment_id)

Get an issue comment



### Example


```python
import openapi_client
from openapi_client.models.issue_comment import IssueComment
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Get an issue comment
        api_response = api_instance.issues_get_comment(owner, repo, comment_id)
        print("The response of IssuesApi->issues_get_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_get_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_get_event**
> IssueEvent issues_get_event(owner, repo, event_id)

Get an issue event



### Example


```python
import openapi_client
from openapi_client.models.issue_event import IssueEvent
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    event_id = 56 # int | 

    try:
        # Get an issue event
        api_response = api_instance.issues_get_event(owner, repo, event_id)
        print("The response of IssuesApi->issues_get_event:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_get_event: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **event_id** | **int**|  | 

### Return type

[**IssueEvent**](IssueEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_get_label**
> Label issues_get_label(owner, repo, name)

Get a label



### Example


```python
import openapi_client
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    name = 'name_example' # str | 

    try:
        # Get a label
        api_response = api_instance.issues_get_label(owner, repo, name)
        print("The response of IssuesApi->issues_get_label:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_get_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **name** | **str**|  | 

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_get_milestone**
> Milestone issues_get_milestone(owner, repo, milestone_number)

Get a milestone



### Example


```python
import openapi_client
from openapi_client.models.milestone import Milestone
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    milestone_number = 56 # int | The number that identifies the milestone.

    try:
        # Get a milestone
        api_response = api_instance.issues_get_milestone(owner, repo, milestone_number)
        print("The response of IssuesApi->issues_get_milestone:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_get_milestone: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **milestone_number** | **int**| The number that identifies the milestone. | 

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list**
> List[Issue] issues_list(filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, collab=collab, orgs=orgs, owned=owned, pulls=pulls, per_page=per_page, page=page)

List issues assigned to the authenticated user

List issues assigned to the authenticated user across all visible repositories including owned repositories, member repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not necessarily assigned to you.   **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \"Issues\" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key. Be aware that the `id` of a pull request returned from \"Issues\" endpoints will be an _issue id_. To find out the pull request id, use the \"[List pull requests](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#list-pull-requests)\" endpoint.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
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
    api_instance = openapi_client.IssuesApi(api_client)
    filter = assigned # str | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. (optional) (default to assigned)
    state = open # str | Indicates the state of the issues to return. (optional) (default to open)
    labels = 'labels_example' # str | A list of comma separated label names. Example: `bug,ui,@high` (optional)
    sort = created # str | What to sort results by. (optional) (default to created)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    collab = True # bool |  (optional)
    orgs = True # bool |  (optional)
    owned = True # bool |  (optional)
    pulls = True # bool |  (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List issues assigned to the authenticated user
        api_response = api_instance.issues_list(filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, collab=collab, orgs=orgs, owned=owned, pulls=pulls, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned]
 **state** | **str**| Indicates the state of the issues to return. | [optional] [default to open]
 **labels** | **str**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional] 
 **sort** | **str**| What to sort results by. | [optional] [default to created]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **collab** | **bool**|  | [optional] 
 **orgs** | **bool**|  | [optional] 
 **owned** | **bool**|  | [optional] 
 **pulls** | **bool**|  | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Issue]**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_assignees**
> List[SimpleUser] issues_list_assignees(owner, repo, per_page=per_page, page=page)

List assignees

Lists the [available assignees](https://docs.github.com/enterprise-server@3.4/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.

### Example


```python
import openapi_client
from openapi_client.models.simple_user import SimpleUser
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List assignees
        api_response = api_instance.issues_list_assignees(owner, repo, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_assignees:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_assignees: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[SimpleUser]**](SimpleUser.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_comments**
> List[IssueComment] issues_list_comments(owner, repo, issue_number, since=since, per_page=per_page, page=page)

List issue comments

Issue Comments are ordered by ascending ID.

### Example


```python
import openapi_client
from openapi_client.models.issue_comment import IssueComment
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List issue comments
        api_response = api_instance.issues_list_comments(owner, repo, issue_number, since=since, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_comments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[IssueComment]**](IssueComment.md)

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
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_comments_for_repo**
> List[IssueComment] issues_list_comments_for_repo(owner, repo, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List issue comments for a repository

By default, Issue Comments are ordered by ascending ID.

### Example


```python
import openapi_client
from openapi_client.models.issue_comment import IssueComment
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sort = created # str | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. (optional) (default to created)
    direction = 'direction_example' # str | Either `asc` or `desc`. Ignored without the `sort` parameter. (optional)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List issue comments for a repository
        api_response = api_instance.issues_list_comments_for_repo(owner, repo, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_comments_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_comments_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sort** | **str**| The property to sort the results by. &#x60;created&#x60; means when the repository was starred. &#x60;updated&#x60; means when the repository was last pushed to. | [optional] [default to created]
 **direction** | **str**| Either &#x60;asc&#x60; or &#x60;desc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] 
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[IssueComment]**](IssueComment.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_events**
> List[IssueEventForIssue] issues_list_events(owner, repo, issue_number, per_page=per_page, page=page)

List issue events



### Example


```python
import openapi_client
from openapi_client.models.issue_event_for_issue import IssueEventForIssue
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List issue events
        api_response = api_instance.issues_list_events(owner, repo, issue_number, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_events:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_events: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[IssueEventForIssue]**](IssueEventForIssue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_events_for_repo**
> List[IssueEvent] issues_list_events_for_repo(owner, repo, per_page=per_page, page=page)

List issue events for a repository



### Example


```python
import openapi_client
from openapi_client.models.issue_event import IssueEvent
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List issue events for a repository
        api_response = api_instance.issues_list_events_for_repo(owner, repo, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_events_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_events_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[IssueEvent]**](IssueEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_events_for_timeline**
> List[TimelineIssueEvents] issues_list_events_for_timeline(owner, repo, issue_number, per_page=per_page, page=page)

List timeline events for an issue



### Example


```python
import openapi_client
from openapi_client.models.timeline_issue_events import TimelineIssueEvents
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List timeline events for an issue
        api_response = api_instance.issues_list_events_for_timeline(owner, repo, issue_number, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_events_for_timeline:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_events_for_timeline: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[TimelineIssueEvents]**](TimelineIssueEvents.md)

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
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_for_authenticated_user**
> List[Issue] issues_list_for_authenticated_user(filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List user account issues assigned to the authenticated user

List issues across owned and member repositories assigned to the authenticated user.  **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \"Issues\" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key. Be aware that the `id` of a pull request returned from \"Issues\" endpoints will be an _issue id_. To find out the pull request id, use the \"[List pull requests](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#list-pull-requests)\" endpoint.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
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
    api_instance = openapi_client.IssuesApi(api_client)
    filter = assigned # str | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. (optional) (default to assigned)
    state = open # str | Indicates the state of the issues to return. (optional) (default to open)
    labels = 'labels_example' # str | A list of comma separated label names. Example: `bug,ui,@high` (optional)
    sort = created # str | What to sort results by. (optional) (default to created)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List user account issues assigned to the authenticated user
        api_response = api_instance.issues_list_for_authenticated_user(filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned]
 **state** | **str**| Indicates the state of the issues to return. | [optional] [default to open]
 **labels** | **str**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional] 
 **sort** | **str**| What to sort results by. | [optional] [default to created]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Issue]**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_for_org**
> List[Issue] issues_list_for_org(org, filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List organization issues assigned to the authenticated user

List issues in an organization assigned to the authenticated user.  **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \"Issues\" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key. Be aware that the `id` of a pull request returned from \"Issues\" endpoints will be an _issue id_. To find out the pull request id, use the \"[List pull requests](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#list-pull-requests)\" endpoint.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
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
    api_instance = openapi_client.IssuesApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    filter = assigned # str | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. (optional) (default to assigned)
    state = open # str | Indicates the state of the issues to return. (optional) (default to open)
    labels = 'labels_example' # str | A list of comma separated label names. Example: `bug,ui,@high` (optional)
    sort = created # str | What to sort results by. (optional) (default to created)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization issues assigned to the authenticated user
        api_response = api_instance.issues_list_for_org(org, filter=filter, state=state, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **filter** | **str**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned]
 **state** | **str**| Indicates the state of the issues to return. | [optional] [default to open]
 **labels** | **str**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional] 
 **sort** | **str**| What to sort results by. | [optional] [default to created]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Issue]**](Issue.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_for_repo**
> List[Issue] issues_list_for_repo(owner, repo, milestone=milestone, state=state, assignee=assignee, creator=creator, mentioned=mentioned, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List repository issues

List issues in a repository. Only open issues will be listed.  **Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \"Issues\" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key. Be aware that the `id` of a pull request returned from \"Issues\" endpoints will be an _issue id_. To find out the pull request id, use the \"[List pull requests](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#list-pull-requests)\" endpoint.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    milestone = 'milestone_example' # str | If an `integer` is passed, it should refer to a milestone by its `number` field. If the string `*` is passed, issues with any milestone are accepted. If the string `none` is passed, issues without milestones are returned. (optional)
    state = open # str | Indicates the state of the issues to return. (optional) (default to open)
    assignee = 'assignee_example' # str | Can be the name of a user. Pass in `none` for issues with no assigned user, and `*` for issues assigned to any user. (optional)
    creator = 'creator_example' # str | The user that created the issue. (optional)
    mentioned = 'mentioned_example' # str | A user that's mentioned in the issue. (optional)
    labels = 'labels_example' # str | A list of comma separated label names. Example: `bug,ui,@high` (optional)
    sort = created # str | What to sort results by. (optional) (default to created)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository issues
        api_response = api_instance.issues_list_for_repo(owner, repo, milestone=milestone, state=state, assignee=assignee, creator=creator, mentioned=mentioned, labels=labels, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **milestone** | **str**| If an &#x60;integer&#x60; is passed, it should refer to a milestone by its &#x60;number&#x60; field. If the string &#x60;*&#x60; is passed, issues with any milestone are accepted. If the string &#x60;none&#x60; is passed, issues without milestones are returned. | [optional] 
 **state** | **str**| Indicates the state of the issues to return. | [optional] [default to open]
 **assignee** | **str**| Can be the name of a user. Pass in &#x60;none&#x60; for issues with no assigned user, and &#x60;*&#x60; for issues assigned to any user. | [optional] 
 **creator** | **str**| The user that created the issue. | [optional] 
 **mentioned** | **str**| A user that&#39;s mentioned in the issue. | [optional] 
 **labels** | **str**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional] 
 **sort** | **str**| What to sort results by. | [optional] [default to created]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Issue]**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_labels_for_milestone**
> List[Label] issues_list_labels_for_milestone(owner, repo, milestone_number, per_page=per_page, page=page)

List labels for issues in a milestone



### Example


```python
import openapi_client
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    milestone_number = 56 # int | The number that identifies the milestone.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List labels for issues in a milestone
        api_response = api_instance.issues_list_labels_for_milestone(owner, repo, milestone_number, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_labels_for_milestone:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_labels_for_milestone: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **milestone_number** | **int**| The number that identifies the milestone. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Label]**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_labels_for_repo**
> List[Label] issues_list_labels_for_repo(owner, repo, per_page=per_page, page=page)

List labels for a repository



### Example


```python
import openapi_client
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List labels for a repository
        api_response = api_instance.issues_list_labels_for_repo(owner, repo, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_labels_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_labels_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Label]**](Label.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_labels_on_issue**
> List[Label] issues_list_labels_on_issue(owner, repo, issue_number, per_page=per_page, page=page)

List labels for an issue



### Example


```python
import openapi_client
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List labels for an issue
        api_response = api_instance.issues_list_labels_on_issue(owner, repo, issue_number, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_labels_on_issue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_labels_on_issue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Label]**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_list_milestones**
> List[Milestone] issues_list_milestones(owner, repo, state=state, sort=sort, direction=direction, per_page=per_page, page=page)

List milestones



### Example


```python
import openapi_client
from openapi_client.models.milestone import Milestone
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    state = open # str | The state of the milestone. Either `open`, `closed`, or `all`. (optional) (default to open)
    sort = due_on # str | What to sort results by. Either `due_on` or `completeness`. (optional) (default to due_on)
    direction = asc # str | The direction of the sort. Either `asc` or `desc`. (optional) (default to asc)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List milestones
        api_response = api_instance.issues_list_milestones(owner, repo, state=state, sort=sort, direction=direction, per_page=per_page, page=page)
        print("The response of IssuesApi->issues_list_milestones:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_list_milestones: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **state** | **str**| The state of the milestone. Either &#x60;open&#x60;, &#x60;closed&#x60;, or &#x60;all&#x60;. | [optional] [default to open]
 **sort** | **str**| What to sort results by. Either &#x60;due_on&#x60; or &#x60;completeness&#x60;. | [optional] [default to due_on]
 **direction** | **str**| The direction of the sort. Either &#x60;asc&#x60; or &#x60;desc&#x60;. | [optional] [default to asc]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Milestone]**](Milestone.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_lock**
> issues_lock(owner, repo, issue_number, issues_lock_request=issues_lock_request)

Lock an issue

Users with push access can lock an issue or pull request's conversation.  Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"

### Example


```python
import openapi_client
from openapi_client.models.issues_lock_request import IssuesLockRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_lock_request = {"lock_reason":"off-topic"} # IssuesLockRequest |  (optional)

    try:
        # Lock an issue
        api_instance.issues_lock(owner, repo, issue_number, issues_lock_request=issues_lock_request)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_lock: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_lock_request** | [**IssuesLockRequest**](IssuesLockRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_remove_all_labels**
> issues_remove_all_labels(owner, repo, issue_number)

Remove all labels from an issue



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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.

    try:
        # Remove all labels from an issue
        api_instance.issues_remove_all_labels(owner, repo, issue_number)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_remove_all_labels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_remove_assignees**
> Issue issues_remove_assignees(owner, repo, issue_number, issues_remove_assignees_request=issues_remove_assignees_request)

Remove assignees from an issue

Removes one or more assignees from an issue.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
from openapi_client.models.issues_remove_assignees_request import IssuesRemoveAssigneesRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_remove_assignees_request = {"assignees":["hubot","other_user"]} # IssuesRemoveAssigneesRequest |  (optional)

    try:
        # Remove assignees from an issue
        api_response = api_instance.issues_remove_assignees(owner, repo, issue_number, issues_remove_assignees_request=issues_remove_assignees_request)
        print("The response of IssuesApi->issues_remove_assignees:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_remove_assignees: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_remove_assignees_request** | [**IssuesRemoveAssigneesRequest**](IssuesRemoveAssigneesRequest.md)|  | [optional] 

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_remove_label**
> List[Label] issues_remove_label(owner, repo, issue_number, name)

Remove a label from an issue

Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.

### Example


```python
import openapi_client
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    name = 'name_example' # str | 

    try:
        # Remove a label from an issue
        api_response = api_instance.issues_remove_label(owner, repo, issue_number, name)
        print("The response of IssuesApi->issues_remove_label:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_remove_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **name** | **str**|  | 

### Return type

[**List[Label]**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_set_labels**
> List[Label] issues_set_labels(owner, repo, issue_number, issues_set_labels_request=issues_set_labels_request)

Set labels for an issue

Removes any previous labels and sets the new labels for an issue.

### Example


```python
import openapi_client
from openapi_client.models.issues_set_labels_request import IssuesSetLabelsRequest
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_set_labels_request = {"labels":["bug","enhancement"]} # IssuesSetLabelsRequest |  (optional)

    try:
        # Set labels for an issue
        api_response = api_instance.issues_set_labels(owner, repo, issue_number, issues_set_labels_request=issues_set_labels_request)
        print("The response of IssuesApi->issues_set_labels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_set_labels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_set_labels_request** | [**IssuesSetLabelsRequest**](IssuesSetLabelsRequest.md)|  | [optional] 

### Return type

[**List[Label]**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_unlock**
> issues_unlock(owner, repo, issue_number)

Unlock an issue

Users with push access can unlock an issue's conversation.

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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.

    try:
        # Unlock an issue
        api_instance.issues_unlock(owner, repo, issue_number)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_unlock: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_update**
> Issue issues_update(owner, repo, issue_number, issues_update_request=issues_update_request)

Update an issue

Issue owners and users with push access can edit an issue.

### Example


```python
import openapi_client
from openapi_client.models.issue import Issue
from openapi_client.models.issues_update_request import IssuesUpdateRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    issue_number = 56 # int | The number that identifies the issue.
    issues_update_request = {"assignees":["octocat"],"body":"I'm having a problem with this.","labels":["bug"],"milestone":1,"state":"open","title":"Found a bug"} # IssuesUpdateRequest |  (optional)

    try:
        # Update an issue
        api_response = api_instance.issues_update(owner, repo, issue_number, issues_update_request=issues_update_request)
        print("The response of IssuesApi->issues_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **issue_number** | **int**| The number that identifies the issue. | 
 **issues_update_request** | [**IssuesUpdateRequest**](IssuesUpdateRequest.md)|  | [optional] 

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_update_comment**
> IssueComment issues_update_comment(owner, repo, comment_id, issues_update_comment_request)

Update an issue comment



### Example


```python
import openapi_client
from openapi_client.models.issue_comment import IssueComment
from openapi_client.models.issues_update_comment_request import IssuesUpdateCommentRequest
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.
    issues_update_comment_request = {"body":"Me too"} # IssuesUpdateCommentRequest | 

    try:
        # Update an issue comment
        api_response = api_instance.issues_update_comment(owner, repo, comment_id, issues_update_comment_request)
        print("The response of IssuesApi->issues_update_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_update_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 
 **issues_update_comment_request** | [**IssuesUpdateCommentRequest**](IssuesUpdateCommentRequest.md)|  | 

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_update_label**
> Label issues_update_label(owner, repo, name, issues_update_label_request=issues_update_label_request)

Update a label



### Example


```python
import openapi_client
from openapi_client.models.issues_update_label_request import IssuesUpdateLabelRequest
from openapi_client.models.label import Label
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    name = 'name_example' # str | 
    issues_update_label_request = {"color":"b01f26","description":"Small bug fix required","new_name":"bug :bug:"} # IssuesUpdateLabelRequest |  (optional)

    try:
        # Update a label
        api_response = api_instance.issues_update_label(owner, repo, name, issues_update_label_request=issues_update_label_request)
        print("The response of IssuesApi->issues_update_label:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_update_label: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **name** | **str**|  | 
 **issues_update_label_request** | [**IssuesUpdateLabelRequest**](IssuesUpdateLabelRequest.md)|  | [optional] 

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issues_update_milestone**
> Milestone issues_update_milestone(owner, repo, milestone_number, issues_update_milestone_request=issues_update_milestone_request)

Update a milestone



### Example


```python
import openapi_client
from openapi_client.models.issues_update_milestone_request import IssuesUpdateMilestoneRequest
from openapi_client.models.milestone import Milestone
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
    api_instance = openapi_client.IssuesApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    milestone_number = 56 # int | The number that identifies the milestone.
    issues_update_milestone_request = {"description":"Tracking milestone for version 1.0","due_on":"2012-10-09T23:39:01Z","state":"open","title":"v1.0"} # IssuesUpdateMilestoneRequest |  (optional)

    try:
        # Update a milestone
        api_response = api_instance.issues_update_milestone(owner, repo, milestone_number, issues_update_milestone_request=issues_update_milestone_request)
        print("The response of IssuesApi->issues_update_milestone:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuesApi->issues_update_milestone: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **milestone_number** | **int**| The number that identifies the milestone. | 
 **issues_update_milestone_request** | [**IssuesUpdateMilestoneRequest**](IssuesUpdateMilestoneRequest.md)|  | [optional] 

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

