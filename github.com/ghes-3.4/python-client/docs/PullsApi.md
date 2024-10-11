# openapi_client.PullsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pulls_check_if_merged**](PullsApi.md#pulls_check_if_merged) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/merge | Check if a pull request has been merged
[**pulls_create**](PullsApi.md#pulls_create) | **POST** /repos/{owner}/{repo}/pulls | Create a pull request
[**pulls_create_reply_for_review_comment**](PullsApi.md#pulls_create_reply_for_review_comment) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies | Create a reply for a review comment
[**pulls_create_review**](PullsApi.md#pulls_create_review) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/reviews | Create a review for a pull request
[**pulls_create_review_comment**](PullsApi.md#pulls_create_review_comment) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/comments | Create a review comment for a pull request
[**pulls_delete_pending_review**](PullsApi.md#pulls_delete_pending_review) | **DELETE** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Delete a pending review for a pull request
[**pulls_delete_review_comment**](PullsApi.md#pulls_delete_review_comment) | **DELETE** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Delete a review comment for a pull request
[**pulls_dismiss_review**](PullsApi.md#pulls_dismiss_review) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals | Dismiss a review for a pull request
[**pulls_get**](PullsApi.md#pulls_get) | **GET** /repos/{owner}/{repo}/pulls/{pull_number} | Get a pull request
[**pulls_get_review**](PullsApi.md#pulls_get_review) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Get a review for a pull request
[**pulls_get_review_comment**](PullsApi.md#pulls_get_review_comment) | **GET** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Get a review comment for a pull request
[**pulls_list**](PullsApi.md#pulls_list) | **GET** /repos/{owner}/{repo}/pulls | List pull requests
[**pulls_list_comments_for_review**](PullsApi.md#pulls_list_comments_for_review) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments | List comments for a pull request review
[**pulls_list_commits**](PullsApi.md#pulls_list_commits) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/commits | List commits on a pull request
[**pulls_list_files**](PullsApi.md#pulls_list_files) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/files | List pull requests files
[**pulls_list_requested_reviewers**](PullsApi.md#pulls_list_requested_reviewers) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Get all requested reviewers for a pull request
[**pulls_list_review_comments**](PullsApi.md#pulls_list_review_comments) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/comments | List review comments on a pull request
[**pulls_list_review_comments_for_repo**](PullsApi.md#pulls_list_review_comments_for_repo) | **GET** /repos/{owner}/{repo}/pulls/comments | List review comments in a repository
[**pulls_list_reviews**](PullsApi.md#pulls_list_reviews) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews | List reviews for a pull request
[**pulls_merge**](PullsApi.md#pulls_merge) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/merge | Merge a pull request
[**pulls_remove_requested_reviewers**](PullsApi.md#pulls_remove_requested_reviewers) | **DELETE** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Remove requested reviewers from a pull request
[**pulls_request_reviewers**](PullsApi.md#pulls_request_reviewers) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Request reviewers for a pull request
[**pulls_submit_review**](PullsApi.md#pulls_submit_review) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events | Submit a review for a pull request
[**pulls_update**](PullsApi.md#pulls_update) | **PATCH** /repos/{owner}/{repo}/pulls/{pull_number} | Update a pull request
[**pulls_update_branch**](PullsApi.md#pulls_update_branch) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/update-branch | Update a pull request branch
[**pulls_update_review**](PullsApi.md#pulls_update_review) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Update a review for a pull request
[**pulls_update_review_comment**](PullsApi.md#pulls_update_review_comment) | **PATCH** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Update a review comment for a pull request


# **pulls_check_if_merged**
> pulls_check_if_merged(owner, repo, pull_number)

Check if a pull request has been merged



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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.

    try:
        # Check if a pull request has been merged
        api_instance.pulls_check_if_merged(owner, repo, pull_number)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_check_if_merged: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 

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
**204** | Response if pull request has been merged |  -  |
**404** | Not Found if pull request has not been merged |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_create**
> PullRequest pulls_create(owner, repo, pulls_create_request)

Create a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.pull_request import PullRequest
from openapi_client.models.pulls_create_request import PullsCreateRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pulls_create_request = {"base":"master","body":"Please pull these awesome changes in!","head":"octocat:new-feature","title":"Amazing new feature"} # PullsCreateRequest | 

    try:
        # Create a pull request
        api_response = api_instance.pulls_create(owner, repo, pulls_create_request)
        print("The response of PullsApi->pulls_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pulls_create_request** | [**PullsCreateRequest**](PullsCreateRequest.md)|  | 

### Return type

[**PullRequest**](PullRequest.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_create_reply_for_review_comment**
> PullRequestReviewComment pulls_create_reply_for_review_comment(owner, repo, pull_number, comment_id, pulls_create_reply_for_review_comment_request)

Create a reply for a review comment

Creates a reply to a review comment for a pull request. For the `comment_id`, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
from openapi_client.models.pulls_create_reply_for_review_comment_request import PullsCreateReplyForReviewCommentRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    comment_id = 56 # int | The unique identifier of the comment.
    pulls_create_reply_for_review_comment_request = {"body":"Great stuff!"} # PullsCreateReplyForReviewCommentRequest | 

    try:
        # Create a reply for a review comment
        api_response = api_instance.pulls_create_reply_for_review_comment(owner, repo, pull_number, comment_id, pulls_create_reply_for_review_comment_request)
        print("The response of PullsApi->pulls_create_reply_for_review_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_create_reply_for_review_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **comment_id** | **int**| The unique identifier of the comment. | 
 **pulls_create_reply_for_review_comment_request** | [**PullsCreateReplyForReviewCommentRequest**](PullsCreateReplyForReviewCommentRequest.md)|  | 

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_create_review**
> PullRequestReview pulls_create_review(owner, repo, pull_number, pulls_create_review_request=pulls_create_review_request)

Create a review for a pull request

This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.  Pull request reviews created in the `PENDING` state are not submitted and therefore do not include the `submitted_at` property in the response. To create a pending review for a pull request, leave the `event` parameter blank. For more information about submitting a `PENDING` review, see \"[Submit a review for a pull request](https://docs.github.com/enterprise-server@3.4/rest/pulls#submit-a-review-for-a-pull-request).\"  **Note:** To comment on a specific line in a file, you need to first determine the _position_ of that line in the diff. The GitHub REST API offers the `application/vnd.github.v3.diff` [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types#commits-commit-comparison-and-pull-requests). To see a pull request diff, add this media type to the `Accept` header of a call to the [single pull request](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#get-a-pull-request) endpoint.  The `position` value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
from openapi_client.models.pulls_create_review_request import PullsCreateReviewRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_create_review_request = {"body":"This is close to perfect! Please address the suggested inline change.","comments":[{"body":"Please add more information here, and fix this typo.","path":"file.md","position":6}],"commit_id":"ecdd80bb57125d7ba9641ffaa4d7d2c19d3f3091","event":"REQUEST_CHANGES"} # PullsCreateReviewRequest |  (optional)

    try:
        # Create a review for a pull request
        api_response = api_instance.pulls_create_review(owner, repo, pull_number, pulls_create_review_request=pulls_create_review_request)
        print("The response of PullsApi->pulls_create_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_create_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_create_review_request** | [**PullsCreateReviewRequest**](PullsCreateReviewRequest.md)|  | [optional] 

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_create_review_comment**
> PullRequestReviewComment pulls_create_review_comment(owner, repo, pull_number, pulls_create_review_comment_request)

Create a review comment for a pull request

 Creates a review comment in the pull request diff. To add a regular comment to a pull request timeline, see \"[Create an issue comment](https://docs.github.com/enterprise-server@3.4/rest/reference/issues#create-an-issue-comment).\" We recommend creating a review comment using `line`, `side`, and optionally `start_line` and `start_side` if your comment applies to more than one line in the pull request diff.  The `position` parameter is deprecated. If you use `position`, the `line`, `side`, `start_line`, and `start_side` parameters are not required.  **Note:** The position value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
from openapi_client.models.pulls_create_review_comment_request import PullsCreateReviewCommentRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_create_review_comment_request = {"body":"Great stuff!","commit_id":"6dcb09b5b57875f334f61aebed695e2e4193db5e","line":2,"path":"file1.txt","side":"RIGHT","start_line":1,"start_side":"RIGHT"} # PullsCreateReviewCommentRequest | 

    try:
        # Create a review comment for a pull request
        api_response = api_instance.pulls_create_review_comment(owner, repo, pull_number, pulls_create_review_comment_request)
        print("The response of PullsApi->pulls_create_review_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_create_review_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_create_review_comment_request** | [**PullsCreateReviewCommentRequest**](PullsCreateReviewCommentRequest.md)|  | 

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_delete_pending_review**
> PullRequestReview pulls_delete_pending_review(owner, repo, pull_number, review_id)

Delete a pending review for a pull request



### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.

    try:
        # Delete a pending review for a pull request
        api_response = api_instance.pulls_delete_pending_review(owner, repo, pull_number, review_id)
        print("The response of PullsApi->pulls_delete_pending_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_delete_pending_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 

### Return type

[**PullRequestReview**](PullRequestReview.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_delete_review_comment**
> pulls_delete_review_comment(owner, repo, comment_id)

Delete a review comment for a pull request

Deletes a review comment.

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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Delete a review comment for a pull request
        api_instance.pulls_delete_review_comment(owner, repo, comment_id)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_delete_review_comment: %s\n" % e)
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
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_dismiss_review**
> PullRequestReview pulls_dismiss_review(owner, repo, pull_number, review_id, pulls_dismiss_review_request)

Dismiss a review for a pull request

**Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#branches), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
from openapi_client.models.pulls_dismiss_review_request import PullsDismissReviewRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.
    pulls_dismiss_review_request = {"event":"DISMISS","message":"You are dismissed"} # PullsDismissReviewRequest | 

    try:
        # Dismiss a review for a pull request
        api_response = api_instance.pulls_dismiss_review(owner, repo, pull_number, review_id, pulls_dismiss_review_request)
        print("The response of PullsApi->pulls_dismiss_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_dismiss_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 
 **pulls_dismiss_review_request** | [**PullsDismissReviewRequest**](PullsDismissReviewRequest.md)|  | 

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_get**
> PullRequest pulls_get(owner, repo, pull_number)

Get a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists details of a pull request by providing its number.  When you get, [create](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls/#create-a-pull-request), or [edit](https://docs.github.com/enterprise-server@3.4/rest/reference/pulls#update-a-pull-request) a pull request, GitHub Enterprise Server creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the `mergeable` key. For more information, see \"[Checking mergeability of pull requests](https://docs.github.com/enterprise-server@3.4/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\".  The value of the `mergeable` attribute can be `true`, `false`, or `null`. If the value is `null`, then GitHub Enterprise Server has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-`null` value for the `mergeable` attribute in the response. If `mergeable` is `true`, then `merge_commit_sha` will be the SHA of the _test_ merge commit.  The value of the `merge_commit_sha` attribute changes depending on the state of the pull request. Before merging a pull request, the `merge_commit_sha` attribute holds the SHA of the _test_ merge commit. After merging a pull request, the `merge_commit_sha` attribute changes depending on how you merged the pull request:  *   If merged as a [merge commit](https://docs.github.com/enterprise-server@3.4/articles/about-merge-methods-on-github/), `merge_commit_sha` represents the SHA of the merge commit. *   If merged via a [squash](https://docs.github.com/enterprise-server@3.4/articles/about-merge-methods-on-github/#squashing-your-merge-commits), `merge_commit_sha` represents the SHA of the squashed commit on the base branch. *   If [rebased](https://docs.github.com/enterprise-server@3.4/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), `merge_commit_sha` represents the commit that the base branch was updated to.  Pass the appropriate [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.

### Example


```python
import openapi_client
from openapi_client.models.pull_request import PullRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.

    try:
        # Get a pull request
        api_response = api_instance.pulls_get(owner, repo, pull_number)
        print("The response of PullsApi->pulls_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pass the appropriate [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats. |  -  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |
**500** | Internal Error |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_get_review**
> PullRequestReview pulls_get_review(owner, repo, pull_number, review_id)

Get a review for a pull request



### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.

    try:
        # Get a review for a pull request
        api_response = api_instance.pulls_get_review(owner, repo, pull_number, review_id)
        print("The response of PullsApi->pulls_get_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_get_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 

### Return type

[**PullRequestReview**](PullRequestReview.md)

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

# **pulls_get_review_comment**
> PullRequestReviewComment pulls_get_review_comment(owner, repo, comment_id)

Get a review comment for a pull request

Provides details for a review comment.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Get a review comment for a pull request
        api_response = api_instance.pulls_get_review_comment(owner, repo, comment_id)
        print("The response of PullsApi->pulls_get_review_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_get_review_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

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

# **pulls_list**
> List[PullRequestSimple] pulls_list(owner, repo, state=state, head=head, base=base, sort=sort, direction=direction, per_page=per_page, page=page)

List pull requests

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_simple import PullRequestSimple
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    state = open # str | Either `open`, `closed`, or `all` to filter by state. (optional) (default to open)
    head = 'head_example' # str | Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`. (optional)
    base = 'base_example' # str | Filter pulls by base branch name. Example: `gh-pages`. (optional)
    sort = created # str | What to sort results by. `popularity` will sort by the number of comments. `long-running` will sort by date created and will limit the results to pull requests that have been open for more than a month and have had activity within the past month. (optional) (default to created)
    direction = 'direction_example' # str | The direction of the sort. Default: `desc` when sort is `created` or sort is not specified, otherwise `asc`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List pull requests
        api_response = api_instance.pulls_list(owner, repo, state=state, head=head, base=base, sort=sort, direction=direction, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **state** | **str**| Either &#x60;open&#x60;, &#x60;closed&#x60;, or &#x60;all&#x60; to filter by state. | [optional] [default to open]
 **head** | **str**| Filter pulls by head user or head organization and branch name in the format of &#x60;user:ref-name&#x60; or &#x60;organization:ref-name&#x60;. For example: &#x60;github:new-script-format&#x60; or &#x60;octocat:test-branch&#x60;. | [optional] 
 **base** | **str**| Filter pulls by base branch name. Example: &#x60;gh-pages&#x60;. | [optional] 
 **sort** | **str**| What to sort results by. &#x60;popularity&#x60; will sort by the number of comments. &#x60;long-running&#x60; will sort by date created and will limit the results to pull requests that have been open for more than a month and have had activity within the past month. | [optional] [default to created]
 **direction** | **str**| The direction of the sort. Default: &#x60;desc&#x60; when sort is &#x60;created&#x60; or sort is not specified, otherwise &#x60;asc&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PullRequestSimple]**](PullRequestSimple.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_list_comments_for_review**
> List[ReviewComment] pulls_list_comments_for_review(owner, repo, pull_number, review_id, per_page=per_page, page=page)

List comments for a pull request review

List comments for a specific pull request review.

### Example


```python
import openapi_client
from openapi_client.models.review_comment import ReviewComment
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List comments for a pull request review
        api_response = api_instance.pulls_list_comments_for_review(owner, repo, pull_number, review_id, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_comments_for_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_comments_for_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[ReviewComment]**](ReviewComment.md)

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

# **pulls_list_commits**
> List[Commit] pulls_list_commits(owner, repo, pull_number, per_page=per_page, page=page)

List commits on a pull request

Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#list-commits) endpoint.

### Example


```python
import openapi_client
from openapi_client.models.commit import Commit
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List commits on a pull request
        api_response = api_instance.pulls_list_commits(owner, repo, pull_number, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_commits:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_commits: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Commit]**](Commit.md)

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

# **pulls_list_files**
> List[DiffEntry] pulls_list_files(owner, repo, pull_number, per_page=per_page, page=page)

List pull requests files

**Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.

### Example


```python
import openapi_client
from openapi_client.models.diff_entry import DiffEntry
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List pull requests files
        api_response = api_instance.pulls_list_files(owner, repo, pull_number, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_files:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_files: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[DiffEntry]**](DiffEntry.md)

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
**500** | Internal Error |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_list_requested_reviewers**
> PullRequestReviewRequest pulls_list_requested_reviewers(owner, repo, pull_number)

Get all requested reviewers for a pull request

Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review, they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for a pull request](https://docs.github.com/enterprise-server@3.4/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_request import PullRequestReviewRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.

    try:
        # Get all requested reviewers for a pull request
        api_response = api_instance.pulls_list_requested_reviewers(owner, repo, pull_number)
        print("The response of PullsApi->pulls_list_requested_reviewers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_requested_reviewers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 

### Return type

[**PullRequestReviewRequest**](PullRequestReviewRequest.md)

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

# **pulls_list_review_comments**
> List[PullRequestReviewComment] pulls_list_review_comments(owner, repo, pull_number, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List review comments on a pull request

Lists all review comments for a pull request. By default, review comments are in ascending order by ID.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    sort = created # str | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. (optional) (default to created)
    direction = 'direction_example' # str | The direction to sort results. Ignored without `sort` parameter. (optional)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List review comments on a pull request
        api_response = api_instance.pulls_list_review_comments(owner, repo, pull_number, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_review_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_review_comments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **sort** | **str**| The property to sort the results by. &#x60;created&#x60; means when the repository was starred. &#x60;updated&#x60; means when the repository was last pushed to. | [optional] [default to created]
 **direction** | **str**| The direction to sort results. Ignored without &#x60;sort&#x60; parameter. | [optional] 
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PullRequestReviewComment]**](PullRequestReviewComment.md)

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

# **pulls_list_review_comments_for_repo**
> List[PullRequestReviewComment] pulls_list_review_comments_for_repo(owner, repo, sort=sort, direction=direction, since=since, per_page=per_page, page=page)

List review comments in a repository

Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sort = 'sort_example' # str |  (optional)
    direction = 'direction_example' # str | The direction to sort results. Ignored without `sort` parameter. (optional)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List review comments in a repository
        api_response = api_instance.pulls_list_review_comments_for_repo(owner, repo, sort=sort, direction=direction, since=since, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_review_comments_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_review_comments_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sort** | **str**|  | [optional] 
 **direction** | **str**| The direction to sort results. Ignored without &#x60;sort&#x60; parameter. | [optional] 
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PullRequestReviewComment]**](PullRequestReviewComment.md)

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

# **pulls_list_reviews**
> List[PullRequestReview] pulls_list_reviews(owner, repo, pull_number, per_page=per_page, page=page)

List reviews for a pull request

The list of reviews returns in chronological order.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List reviews for a pull request
        api_response = api_instance.pulls_list_reviews(owner, repo, pull_number, per_page=per_page, page=page)
        print("The response of PullsApi->pulls_list_reviews:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_list_reviews: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PullRequestReview]**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of reviews returns in chronological order. |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_merge**
> PullRequestMergeResult pulls_merge(owner, repo, pull_number, pulls_merge_request=pulls_merge_request)

Merge a pull request

This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_merge_result import PullRequestMergeResult
from openapi_client.models.pulls_merge_request import PullsMergeRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_merge_request = {"commit_message":"Add a new value to the merge_method enum","commit_title":"Expand enum"} # PullsMergeRequest |  (optional)

    try:
        # Merge a pull request
        api_response = api_instance.pulls_merge(owner, repo, pull_number, pulls_merge_request=pulls_merge_request)
        print("The response of PullsApi->pulls_merge:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_merge: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_merge_request** | [**PullsMergeRequest**](PullsMergeRequest.md)|  | [optional] 

### Return type

[**PullRequestMergeResult**](PullRequestMergeResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | if merge was successful |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**405** | Method Not Allowed if merge cannot be performed |  -  |
**409** | Conflict if sha was provided and pull request head did not match |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_remove_requested_reviewers**
> PullRequestSimple pulls_remove_requested_reviewers(owner, repo, pull_number, pulls_remove_requested_reviewers_request)

Remove requested reviewers from a pull request



### Example


```python
import openapi_client
from openapi_client.models.pull_request_simple import PullRequestSimple
from openapi_client.models.pulls_remove_requested_reviewers_request import PullsRemoveRequestedReviewersRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_remove_requested_reviewers_request = {"reviewers":["octocat","hubot","other_user"],"team_reviewers":["justice-league"]} # PullsRemoveRequestedReviewersRequest | 

    try:
        # Remove requested reviewers from a pull request
        api_response = api_instance.pulls_remove_requested_reviewers(owner, repo, pull_number, pulls_remove_requested_reviewers_request)
        print("The response of PullsApi->pulls_remove_requested_reviewers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_remove_requested_reviewers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_remove_requested_reviewers_request** | [**PullsRemoveRequestedReviewersRequest**](PullsRemoveRequestedReviewersRequest.md)|  | 

### Return type

[**PullRequestSimple**](PullRequestSimple.md)

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

# **pulls_request_reviewers**
> PullRequestSimple pulls_request_reviewers(owner, repo, pull_number, pulls_request_reviewers_request=pulls_request_reviewers_request)

Request reviewers for a pull request

This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_simple import PullRequestSimple
from openapi_client.models.pulls_request_reviewers_request import PullsRequestReviewersRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_request_reviewers_request = {"reviewers":["octocat","hubot","other_user"],"team_reviewers":["justice-league"]} # PullsRequestReviewersRequest |  (optional)

    try:
        # Request reviewers for a pull request
        api_response = api_instance.pulls_request_reviewers(owner, repo, pull_number, pulls_request_reviewers_request=pulls_request_reviewers_request)
        print("The response of PullsApi->pulls_request_reviewers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_request_reviewers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_request_reviewers_request** | [**PullsRequestReviewersRequest**](PullsRequestReviewersRequest.md)|  | [optional] 

### Return type

[**PullRequestSimple**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity if user is not a collaborator |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_submit_review**
> PullRequestReview pulls_submit_review(owner, repo, pull_number, review_id, pulls_submit_review_request)

Submit a review for a pull request

Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see \"[Create a review for a pull request](https://docs.github.com/enterprise-server@3.4/rest/pulls#create-a-review-for-a-pull-request).\"

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
from openapi_client.models.pulls_submit_review_request import PullsSubmitReviewRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.
    pulls_submit_review_request = {"body":"Here is the body for the review.","event":"REQUEST_CHANGES"} # PullsSubmitReviewRequest | 

    try:
        # Submit a review for a pull request
        api_response = api_instance.pulls_submit_review(owner, repo, pull_number, review_id, pulls_submit_review_request)
        print("The response of PullsApi->pulls_submit_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_submit_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 
 **pulls_submit_review_request** | [**PullsSubmitReviewRequest**](PullsSubmitReviewRequest.md)|  | 

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_update**
> PullRequest pulls_update(owner, repo, pull_number, pulls_update_request=pulls_update_request)

Update a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.

### Example


```python
import openapi_client
from openapi_client.models.pull_request import PullRequest
from openapi_client.models.pulls_update_request import PullsUpdateRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_update_request = {"base":"master","body":"updated body","state":"open","title":"new title"} # PullsUpdateRequest |  (optional)

    try:
        # Update a pull request
        api_response = api_instance.pulls_update(owner, repo, pull_number, pulls_update_request=pulls_update_request)
        print("The response of PullsApi->pulls_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_update_request** | [**PullsUpdateRequest**](PullsUpdateRequest.md)|  | [optional] 

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_update_branch**
> EnterpriseAdminUpdateOrgName202Response pulls_update_branch(owner, repo, pull_number, pulls_update_branch_request=pulls_update_branch_request)

Update a pull request branch

Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_org_name202_response import EnterpriseAdminUpdateOrgName202Response
from openapi_client.models.pulls_update_branch_request import PullsUpdateBranchRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    pulls_update_branch_request = {"expected_head_sha":"6dcb09b5b57875f334f61aebed695e2e4193db5e"} # PullsUpdateBranchRequest |  (optional)

    try:
        # Update a pull request branch
        api_response = api_instance.pulls_update_branch(owner, repo, pull_number, pulls_update_branch_request=pulls_update_branch_request)
        print("The response of PullsApi->pulls_update_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_update_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **pulls_update_branch_request** | [**PullsUpdateBranchRequest**](PullsUpdateBranchRequest.md)|  | [optional] 

### Return type

[**EnterpriseAdminUpdateOrgName202Response**](EnterpriseAdminUpdateOrgName202Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pulls_update_review**
> PullRequestReview pulls_update_review(owner, repo, pull_number, review_id, pulls_update_review_request)

Update a review for a pull request

Update the review summary comment with new text.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review import PullRequestReview
from openapi_client.models.pulls_update_review_request import PullsUpdateReviewRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pull_number = 56 # int | The number that identifies the pull request.
    review_id = 56 # int | The unique identifier of the review.
    pulls_update_review_request = {"body":"This is close to perfect! Please address the suggested inline change. And add more about this."} # PullsUpdateReviewRequest | 

    try:
        # Update a review for a pull request
        api_response = api_instance.pulls_update_review(owner, repo, pull_number, review_id, pulls_update_review_request)
        print("The response of PullsApi->pulls_update_review:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_update_review: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pull_number** | **int**| The number that identifies the pull request. | 
 **review_id** | **int**| The unique identifier of the review. | 
 **pulls_update_review_request** | [**PullsUpdateReviewRequest**](PullsUpdateReviewRequest.md)|  | 

### Return type

[**PullRequestReview**](PullRequestReview.md)

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

# **pulls_update_review_comment**
> PullRequestReviewComment pulls_update_review_comment(owner, repo, comment_id, pulls_update_review_comment_request)

Update a review comment for a pull request

Enables you to edit a review comment.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment
from openapi_client.models.pulls_update_review_comment_request import PullsUpdateReviewCommentRequest
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
    api_instance = openapi_client.PullsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.
    pulls_update_review_comment_request = {"body":"I like this too!"} # PullsUpdateReviewCommentRequest | 

    try:
        # Update a review comment for a pull request
        api_response = api_instance.pulls_update_review_comment(owner, repo, comment_id, pulls_update_review_comment_request)
        print("The response of PullsApi->pulls_update_review_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PullsApi->pulls_update_review_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 
 **pulls_update_review_comment_request** | [**PullsUpdateReviewCommentRequest**](PullsUpdateReviewCommentRequest.md)|  | 

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

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

