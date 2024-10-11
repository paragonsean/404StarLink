# openapi_client.OrgsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgs_check_membership_for_user**](OrgsApi.md#orgs_check_membership_for_user) | **GET** /orgs/{org}/members/{username} | Check organization membership for a user
[**orgs_check_public_membership_for_user**](OrgsApi.md#orgs_check_public_membership_for_user) | **GET** /orgs/{org}/public_members/{username} | Check public organization membership for a user
[**orgs_convert_member_to_outside_collaborator**](OrgsApi.md#orgs_convert_member_to_outside_collaborator) | **PUT** /orgs/{org}/outside_collaborators/{username} | Convert an organization member to outside collaborator
[**orgs_create_webhook**](OrgsApi.md#orgs_create_webhook) | **POST** /orgs/{org}/hooks | Create an organization webhook
[**orgs_delete_webhook**](OrgsApi.md#orgs_delete_webhook) | **DELETE** /orgs/{org}/hooks/{hook_id} | Delete an organization webhook
[**orgs_get**](OrgsApi.md#orgs_get) | **GET** /orgs/{org} | Get an organization
[**orgs_get_audit_log**](OrgsApi.md#orgs_get_audit_log) | **GET** /orgs/{org}/audit-log | Get the audit log for an organization
[**orgs_get_membership_for_authenticated_user**](OrgsApi.md#orgs_get_membership_for_authenticated_user) | **GET** /user/memberships/orgs/{org} | Get an organization membership for the authenticated user
[**orgs_get_membership_for_user**](OrgsApi.md#orgs_get_membership_for_user) | **GET** /orgs/{org}/memberships/{username} | Get organization membership for a user
[**orgs_get_webhook**](OrgsApi.md#orgs_get_webhook) | **GET** /orgs/{org}/hooks/{hook_id} | Get an organization webhook
[**orgs_get_webhook_config_for_org**](OrgsApi.md#orgs_get_webhook_config_for_org) | **GET** /orgs/{org}/hooks/{hook_id}/config | Get a webhook configuration for an organization
[**orgs_get_webhook_delivery**](OrgsApi.md#orgs_get_webhook_delivery) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id} | Get a webhook delivery for an organization webhook
[**orgs_list**](OrgsApi.md#orgs_list) | **GET** /organizations | List organizations
[**orgs_list_app_installations**](OrgsApi.md#orgs_list_app_installations) | **GET** /orgs/{org}/installations | List app installations for an organization
[**orgs_list_custom_roles**](OrgsApi.md#orgs_list_custom_roles) | **GET** /organizations/{organization_id}/custom_roles | List custom repository roles in an organization
[**orgs_list_for_authenticated_user**](OrgsApi.md#orgs_list_for_authenticated_user) | **GET** /user/orgs | List organizations for the authenticated user
[**orgs_list_for_user**](OrgsApi.md#orgs_list_for_user) | **GET** /users/{username}/orgs | List organizations for a user
[**orgs_list_members**](OrgsApi.md#orgs_list_members) | **GET** /orgs/{org}/members | List organization members
[**orgs_list_memberships_for_authenticated_user**](OrgsApi.md#orgs_list_memberships_for_authenticated_user) | **GET** /user/memberships/orgs | List organization memberships for the authenticated user
[**orgs_list_outside_collaborators**](OrgsApi.md#orgs_list_outside_collaborators) | **GET** /orgs/{org}/outside_collaborators | List outside collaborators for an organization
[**orgs_list_public_members**](OrgsApi.md#orgs_list_public_members) | **GET** /orgs/{org}/public_members | List public organization members
[**orgs_list_webhook_deliveries**](OrgsApi.md#orgs_list_webhook_deliveries) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries | List deliveries for an organization webhook
[**orgs_list_webhooks**](OrgsApi.md#orgs_list_webhooks) | **GET** /orgs/{org}/hooks | List organization webhooks
[**orgs_ping_webhook**](OrgsApi.md#orgs_ping_webhook) | **POST** /orgs/{org}/hooks/{hook_id}/pings | Ping an organization webhook
[**orgs_redeliver_webhook_delivery**](OrgsApi.md#orgs_redeliver_webhook_delivery) | **POST** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for an organization webhook
[**orgs_remove_member**](OrgsApi.md#orgs_remove_member) | **DELETE** /orgs/{org}/members/{username} | Remove an organization member
[**orgs_remove_membership_for_user**](OrgsApi.md#orgs_remove_membership_for_user) | **DELETE** /orgs/{org}/memberships/{username} | Remove organization membership for a user
[**orgs_remove_outside_collaborator**](OrgsApi.md#orgs_remove_outside_collaborator) | **DELETE** /orgs/{org}/outside_collaborators/{username} | Remove outside collaborator from an organization
[**orgs_remove_public_membership_for_authenticated_user**](OrgsApi.md#orgs_remove_public_membership_for_authenticated_user) | **DELETE** /orgs/{org}/public_members/{username} | Remove public organization membership for the authenticated user
[**orgs_set_membership_for_user**](OrgsApi.md#orgs_set_membership_for_user) | **PUT** /orgs/{org}/memberships/{username} | Set organization membership for a user
[**orgs_set_public_membership_for_authenticated_user**](OrgsApi.md#orgs_set_public_membership_for_authenticated_user) | **PUT** /orgs/{org}/public_members/{username} | Set public organization membership for the authenticated user
[**orgs_update**](OrgsApi.md#orgs_update) | **PATCH** /orgs/{org} | Update an organization
[**orgs_update_membership_for_authenticated_user**](OrgsApi.md#orgs_update_membership_for_authenticated_user) | **PATCH** /user/memberships/orgs/{org} | Update an organization membership for the authenticated user
[**orgs_update_webhook**](OrgsApi.md#orgs_update_webhook) | **PATCH** /orgs/{org}/hooks/{hook_id} | Update an organization webhook
[**orgs_update_webhook_config_for_org**](OrgsApi.md#orgs_update_webhook_config_for_org) | **PATCH** /orgs/{org}/hooks/{hook_id}/config | Update a webhook configuration for an organization


# **orgs_check_membership_for_user**
> orgs_check_membership_for_user(org, username)

Check organization membership for a user

Check if a user is, publicly or privately, a member of the organization.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Check organization membership for a user
        api_instance.orgs_check_membership_for_user(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_check_membership_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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
**204** | Response if requester is an organization member and user is a member |  -  |
**302** | Response if requester is not an organization member |  * Location -  <br>  |
**404** | Not Found if requester is an organization member and user is not a member |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_check_public_membership_for_user**
> orgs_check_public_membership_for_user(org, username)

Check public organization membership for a user



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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Check public organization membership for a user
        api_instance.orgs_check_public_membership_for_user(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_check_public_membership_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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
**204** | Response if user is a public member |  -  |
**404** | Not Found if user is not a public member |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_convert_member_to_outside_collaborator**
> object orgs_convert_member_to_outside_collaborator(org, username, orgs_convert_member_to_outside_collaborator_request=orgs_convert_member_to_outside_collaborator_request)

Convert an organization member to outside collaborator

When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see \"[Converting an organization member to an outside collaborator](https://docs.github.com/enterprise-server@3.4/articles/converting-an-organization-member-to-an-outside-collaborator/)\". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see \"[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-server@3.4/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\"

### Example


```python
import openapi_client
from openapi_client.models.orgs_convert_member_to_outside_collaborator_request import OrgsConvertMemberToOutsideCollaboratorRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.
    orgs_convert_member_to_outside_collaborator_request = {"async":true} # OrgsConvertMemberToOutsideCollaboratorRequest |  (optional)

    try:
        # Convert an organization member to outside collaborator
        api_response = api_instance.orgs_convert_member_to_outside_collaborator(org, username, orgs_convert_member_to_outside_collaborator_request=orgs_convert_member_to_outside_collaborator_request)
        print("The response of OrgsApi->orgs_convert_member_to_outside_collaborator:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_convert_member_to_outside_collaborator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 
 **orgs_convert_member_to_outside_collaborator_request** | [**OrgsConvertMemberToOutsideCollaboratorRequest**](OrgsConvertMemberToOutsideCollaboratorRequest.md)|  | [optional] 

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
**202** | User is getting converted asynchronously |  -  |
**204** | User was converted |  -  |
**403** | Forbidden if user is the last owner of the organization, not a member of the organization, or if the enterprise enforces a policy for inviting outside collaborators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-server@3.4/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot; |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_create_webhook**
> OrgHook orgs_create_webhook(org, orgs_create_webhook_request)

Create an organization webhook

Here's how you can create a hook that posts payloads in JSON format:

### Example


```python
import openapi_client
from openapi_client.models.org_hook import OrgHook
from openapi_client.models.orgs_create_webhook_request import OrgsCreateWebhookRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    orgs_create_webhook_request = {"active":true,"config":{"content_type":"json","url":"http://example.com/webhook"},"events":["push","pull_request"],"name":"web"} # OrgsCreateWebhookRequest | 

    try:
        # Create an organization webhook
        api_response = api_instance.orgs_create_webhook(org, orgs_create_webhook_request)
        print("The response of OrgsApi->orgs_create_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_create_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **orgs_create_webhook_request** | [**OrgsCreateWebhookRequest**](OrgsCreateWebhookRequest.md)|  | 

### Return type

[**OrgHook**](OrgHook.md)

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

# **orgs_delete_webhook**
> orgs_delete_webhook(org, hook_id)

Delete an organization webhook



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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Delete an organization webhook
        api_instance.orgs_delete_webhook(org, hook_id)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_delete_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

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

# **orgs_get**
> OrganizationFull orgs_get(org)

Get an organization

To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/enterprise-server@3.4/articles/securing-your-account-with-two-factor-authentication-2fa/).  GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub Enterprise Server plan. See \"[Authenticating with GitHub Apps](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/)\" for details. For an example response, see 'Response with GitHub Enterprise Server plan information' below.\"

### Example


```python
import openapi_client
from openapi_client.models.organization_full import OrganizationFull
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get an organization
        api_response = api_instance.orgs_get(org)
        print("The response of OrgsApi->orgs_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**OrganizationFull**](OrganizationFull.md)

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

# **orgs_get_audit_log**
> List[AuditLogEvent] orgs_get_audit_log(org, phrase=phrase, include=include, after=after, before=before, order=order, per_page=per_page, page=page)

Get the audit log for an organization

Gets the audit log for an organization. For more information, see \"[Reviewing the audit log for your organization](https://docs.github.com/enterprise-server@3.4/github/setting-up-and-managing-organizations-and-teams/reviewing-the-audit-log-for-your-organization).\"  To use this endpoint, you must be an organization owner, and you must use an access token with the `admin:org` scope. GitHub Apps must have the `organization_administration` read permission to use this endpoint.  By default, the response includes up to 30 events from the past three months. Use the `phrase` parameter to filter results and retrieve older events. For example, use the `phrase` parameter with the `created` qualifier to filter events based on when the events occurred. For more information, see \"[Reviewing the audit log for your organization](https://docs.github.com/enterprise-server@3.4/organizations/keeping-your-organization-secure/managing-security-settings-for-your-organization/reviewing-the-audit-log-for-your-organization#searching-the-audit-log).\"  Use pagination to retrieve fewer or more than 30 events. For more information, see \"[Resources in the REST API](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#pagination).\"

### Example


```python
import openapi_client
from openapi_client.models.audit_log_event import AuditLogEvent
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    phrase = 'phrase_example' # str | A search phrase. For more information, see [Searching the audit log](https://docs.github.com/enterprise-server@3.4/github/setting-up-and-managing-organizations-and-teams/reviewing-the-audit-log-for-your-organization#searching-the-audit-log). (optional)
    include = 'include_example' # str | The event types to include:  - `web` - returns web (non-Git) events. - `git` - returns Git events. - `all` - returns both web and Git events.  The default is `web`. (optional)
    after = 'after_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. (optional)
    before = 'before_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. (optional)
    order = 'order_example' # str | The order of audit log events. To list newest events first, specify `desc`. To list oldest events first, specify `asc`.  The default is `desc`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # Get the audit log for an organization
        api_response = api_instance.orgs_get_audit_log(org, phrase=phrase, include=include, after=after, before=before, order=order, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_get_audit_log:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_audit_log: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **phrase** | **str**| A search phrase. For more information, see [Searching the audit log](https://docs.github.com/enterprise-server@3.4/github/setting-up-and-managing-organizations-and-teams/reviewing-the-audit-log-for-your-organization#searching-the-audit-log). | [optional] 
 **include** | **str**| The event types to include:  - &#x60;web&#x60; - returns web (non-Git) events. - &#x60;git&#x60; - returns Git events. - &#x60;all&#x60; - returns both web and Git events.  The default is &#x60;web&#x60;. | [optional] 
 **after** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. | [optional] 
 **before** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. | [optional] 
 **order** | **str**| The order of audit log events. To list newest events first, specify &#x60;desc&#x60;. To list oldest events first, specify &#x60;asc&#x60;.  The default is &#x60;desc&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[AuditLogEvent]**](AuditLogEvent.md)

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

# **orgs_get_membership_for_authenticated_user**
> OrgMembership orgs_get_membership_for_authenticated_user(org)

Get an organization membership for the authenticated user



### Example


```python
import openapi_client
from openapi_client.models.org_membership import OrgMembership
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get an organization membership for the authenticated user
        api_response = api_instance.orgs_get_membership_for_authenticated_user(org)
        print("The response of OrgsApi->orgs_get_membership_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_membership_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**OrgMembership**](OrgMembership.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_get_membership_for_user**
> OrgMembership orgs_get_membership_for_user(org, username)

Get organization membership for a user

In order to get a user's membership with an organization, the authenticated user must be an organization member. The `state` parameter in the response can be used to identify the user's membership status.

### Example


```python
import openapi_client
from openapi_client.models.org_membership import OrgMembership
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Get organization membership for a user
        api_response = api_instance.orgs_get_membership_for_user(org, username)
        print("The response of OrgsApi->orgs_get_membership_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_membership_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

[**OrgMembership**](OrgMembership.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_get_webhook**
> OrgHook orgs_get_webhook(org, hook_id)

Get an organization webhook

Returns a webhook configured in an organization. To get only the webhook `config` properties, see \"[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization).\"

### Example


```python
import openapi_client
from openapi_client.models.org_hook import OrgHook
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Get an organization webhook
        api_response = api_instance.orgs_get_webhook(org, hook_id)
        print("The response of OrgsApi->orgs_get_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

[**OrgHook**](OrgHook.md)

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

# **orgs_get_webhook_config_for_org**
> WebhookConfig orgs_get_webhook_config_for_org(org, hook_id)

Get a webhook configuration for an organization

Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use \"[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook).\"  Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.

### Example


```python
import openapi_client
from openapi_client.models.webhook_config import WebhookConfig
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Get a webhook configuration for an organization
        api_response = api_instance.orgs_get_webhook_config_for_org(org, hook_id)
        print("The response of OrgsApi->orgs_get_webhook_config_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_webhook_config_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

[**WebhookConfig**](WebhookConfig.md)

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

# **orgs_get_webhook_delivery**
> HookDelivery orgs_get_webhook_delivery(org, hook_id, delivery_id)

Get a webhook delivery for an organization webhook

Returns a delivery for a webhook configured in an organization.

### Example


```python
import openapi_client
from openapi_client.models.hook_delivery import HookDelivery
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    delivery_id = 56 # int | 

    try:
        # Get a webhook delivery for an organization webhook
        api_response = api_instance.orgs_get_webhook_delivery(org, hook_id, delivery_id)
        print("The response of OrgsApi->orgs_get_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_get_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **delivery_id** | **int**|  | 

### Return type

[**HookDelivery**](HookDelivery.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list**
> List[OrganizationSimple] orgs_list(since=since, per_page=per_page)

List organizations

Lists all organizations, in the order that they were created on GitHub Enterprise Server.  **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of organizations.

### Example


```python
import openapi_client
from openapi_client.models.organization_simple import OrganizationSimple
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
    api_instance = openapi_client.OrgsApi(api_client)
    since = 56 # int | An organization ID. Only return organizations with an ID greater than this ID. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List organizations
        api_response = api_instance.orgs_list(since=since, per_page=per_page)
        print("The response of OrgsApi->orgs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **int**| An organization ID. Only return organizations with an ID greater than this ID. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**List[OrganizationSimple]**](OrganizationSimple.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_app_installations**
> OrgsListAppInstallations200Response orgs_list_app_installations(org, per_page=per_page, page=page)

List app installations for an organization

Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.orgs_list_app_installations200_response import OrgsListAppInstallations200Response
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List app installations for an organization
        api_response = api_instance.orgs_list_app_installations(org, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_app_installations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_app_installations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**OrgsListAppInstallations200Response**](OrgsListAppInstallations200Response.md)

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

# **orgs_list_custom_roles**
> OrgsListCustomRoles200Response orgs_list_custom_roles(organization_id)

List custom repository roles in an organization

List the custom repository roles available in this organization. In order to see custom repository roles in an organization, the authenticated user must be an organization owner.  To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organization and must use an access token with `admin:org repo` scope. GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.  For more information on custom repository roles, see \"[About custom repository roles](https://docs.github.com/enterprise-server@3.4/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-repository-roles).\"

### Example


```python
import openapi_client
from openapi_client.models.orgs_list_custom_roles200_response import OrgsListCustomRoles200Response
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
    api_instance = openapi_client.OrgsApi(api_client)
    organization_id = 'organization_id_example' # str | The unique identifier of the organization.

    try:
        # List custom repository roles in an organization
        api_response = api_instance.orgs_list_custom_roles(organization_id)
        print("The response of OrgsApi->orgs_list_custom_roles:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_custom_roles: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization_id** | **str**| The unique identifier of the organization. | 

### Return type

[**OrgsListCustomRoles200Response**](OrgsListCustomRoles200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response - list of custom role names |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_for_authenticated_user**
> List[OrganizationSimple] orgs_list_for_authenticated_user(per_page=per_page, page=page)

List organizations for the authenticated user

List organizations for the authenticated user.  **OAuth scope requirements**  This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.

### Example


```python
import openapi_client
from openapi_client.models.organization_simple import OrganizationSimple
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
    api_instance = openapi_client.OrgsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organizations for the authenticated user
        api_response = api_instance.orgs_list_for_authenticated_user(per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[OrganizationSimple]**](OrganizationSimple.md)

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
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_for_user**
> List[OrganizationSimple] orgs_list_for_user(username, per_page=per_page, page=page)

List organizations for a user

List [public organization memberships](https://docs.github.com/enterprise-server@3.4/articles/publicizing-or-concealing-organization-membership) for the specified user.  This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/enterprise-server@3.4/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.

### Example


```python
import openapi_client
from openapi_client.models.organization_simple import OrganizationSimple
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
    api_instance = openapi_client.OrgsApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organizations for a user
        api_response = api_instance.orgs_list_for_user(username, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[OrganizationSimple]**](OrganizationSimple.md)

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

# **orgs_list_members**
> List[SimpleUser] orgs_list_members(org, filter=filter, role=role, per_page=per_page, page=page)

List organization members

List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    filter = all # str | Filter members returned in the list. `2fa_disabled` means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners. (optional) (default to all)
    role = all # str | Filter members returned by their role. (optional) (default to all)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization members
        api_response = api_instance.orgs_list_members(org, filter=filter, role=role, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_members:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_members: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **filter** | **str**| Filter members returned in the list. &#x60;2fa_disabled&#x60; means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners. | [optional] [default to all]
 **role** | **str**| Filter members returned by their role. | [optional] [default to all]
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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_memberships_for_authenticated_user**
> List[OrgMembership] orgs_list_memberships_for_authenticated_user(state=state, per_page=per_page, page=page)

List organization memberships for the authenticated user



### Example


```python
import openapi_client
from openapi_client.models.org_membership import OrgMembership
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
    api_instance = openapi_client.OrgsApi(api_client)
    state = 'state_example' # str | Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization memberships for the authenticated user
        api_response = api_instance.orgs_list_memberships_for_authenticated_user(state=state, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_memberships_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_memberships_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**| Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[OrgMembership]**](OrgMembership.md)

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
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_outside_collaborators**
> List[SimpleUser] orgs_list_outside_collaborators(org, filter=filter, per_page=per_page, page=page)

List outside collaborators for an organization

List all users who are outside collaborators of an organization.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    filter = all # str | Filter the list of outside collaborators. `2fa_disabled` means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. (optional) (default to all)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List outside collaborators for an organization
        api_response = api_instance.orgs_list_outside_collaborators(org, filter=filter, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_outside_collaborators:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_outside_collaborators: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **filter** | **str**| Filter the list of outside collaborators. &#x60;2fa_disabled&#x60; means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. | [optional] [default to all]
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_public_members**
> List[SimpleUser] orgs_list_public_members(org, per_page=per_page, page=page)

List public organization members

Members of an organization can choose to have their membership publicized or not.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List public organization members
        api_response = api_instance.orgs_list_public_members(org, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_public_members:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_public_members: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_webhook_deliveries**
> List[HookDeliveryItem] orgs_list_webhook_deliveries(org, hook_id, per_page=per_page, cursor=cursor, redelivery=redelivery)

List deliveries for an organization webhook

Returns a list of webhook deliveries for a webhook configured in an organization.

### Example


```python
import openapi_client
from openapi_client.models.hook_delivery_item import HookDeliveryItem
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    cursor = 'cursor_example' # str | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. (optional)
    redelivery = True # bool |  (optional)

    try:
        # List deliveries for an organization webhook
        api_response = api_instance.orgs_list_webhook_deliveries(org, hook_id, per_page=per_page, cursor=cursor, redelivery=redelivery)
        print("The response of OrgsApi->orgs_list_webhook_deliveries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_webhook_deliveries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **cursor** | **str**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional] 
 **redelivery** | **bool**|  | [optional] 

### Return type

[**List[HookDeliveryItem]**](HookDeliveryItem.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_list_webhooks**
> List[OrgHook] orgs_list_webhooks(org, per_page=per_page, page=page)

List organization webhooks



### Example


```python
import openapi_client
from openapi_client.models.org_hook import OrgHook
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization webhooks
        api_response = api_instance.orgs_list_webhooks(org, per_page=per_page, page=page)
        print("The response of OrgsApi->orgs_list_webhooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_list_webhooks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[OrgHook]**](OrgHook.md)

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

# **orgs_ping_webhook**
> orgs_ping_webhook(org, hook_id)

Ping an organization webhook

This will trigger a [ping event](https://docs.github.com/enterprise-server@3.4/webhooks/#ping-event) to be sent to the hook.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Ping an organization webhook
        api_instance.orgs_ping_webhook(org, hook_id)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_ping_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

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

# **orgs_redeliver_webhook_delivery**
> object orgs_redeliver_webhook_delivery(org, hook_id, delivery_id)

Redeliver a delivery for an organization webhook

Redeliver a delivery for a webhook configured in an organization.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    delivery_id = 56 # int | 

    try:
        # Redeliver a delivery for an organization webhook
        api_response = api_instance.orgs_redeliver_webhook_delivery(org, hook_id, delivery_id)
        print("The response of OrgsApi->orgs_redeliver_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_redeliver_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **delivery_id** | **int**|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_remove_member**
> orgs_remove_member(org, username)

Remove an organization member

Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Remove an organization member
        api_instance.orgs_remove_member(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_remove_member: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_remove_membership_for_user**
> orgs_remove_membership_for_user(org, username)

Remove organization membership for a user

In order to remove a user's membership with an organization, the authenticated user must be an organization owner.  If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Remove organization membership for a user
        api_instance.orgs_remove_membership_for_user(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_remove_membership_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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

# **orgs_remove_outside_collaborator**
> orgs_remove_outside_collaborator(org, username)

Remove outside collaborator from an organization

Removing a user from this list will remove them from all the organization's repositories.

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Remove outside collaborator from an organization
        api_instance.orgs_remove_outside_collaborator(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_remove_outside_collaborator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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
**422** | Unprocessable Entity if user is a member of the organization |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_remove_public_membership_for_authenticated_user**
> orgs_remove_public_membership_for_authenticated_user(org, username)

Remove public organization membership for the authenticated user



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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Remove public organization membership for the authenticated user
        api_instance.orgs_remove_public_membership_for_authenticated_user(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_remove_public_membership_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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

# **orgs_set_membership_for_user**
> OrgMembership orgs_set_membership_for_user(org, username, orgs_set_membership_for_user_request=orgs_set_membership_for_user_request)

Set organization membership for a user

Only authenticated organization owners can add a member to the organization or update the member's role.  *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://docs.github.com/enterprise-server@3.4/rest/reference/orgs#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.      *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.  **Rate limits**  To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.

### Example


```python
import openapi_client
from openapi_client.models.org_membership import OrgMembership
from openapi_client.models.orgs_set_membership_for_user_request import OrgsSetMembershipForUserRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.
    orgs_set_membership_for_user_request = {"role":"member"} # OrgsSetMembershipForUserRequest |  (optional)

    try:
        # Set organization membership for a user
        api_response = api_instance.orgs_set_membership_for_user(org, username, orgs_set_membership_for_user_request=orgs_set_membership_for_user_request)
        print("The response of OrgsApi->orgs_set_membership_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_set_membership_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 
 **orgs_set_membership_for_user_request** | [**OrgsSetMembershipForUserRequest**](OrgsSetMembershipForUserRequest.md)|  | [optional] 

### Return type

[**OrgMembership**](OrgMembership.md)

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

# **orgs_set_public_membership_for_authenticated_user**
> orgs_set_public_membership_for_authenticated_user(org, username)

Set public organization membership for the authenticated user

The user can publicize their own membership. (A user cannot publicize the membership for another user.)  Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"

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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Set public organization membership for the authenticated user
        api_instance.orgs_set_public_membership_for_authenticated_user(org, username)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_set_public_membership_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_update**
> OrganizationFull orgs_update(org, orgs_update_request=orgs_update_request)

Update an organization

**Parameter Deprecation Notice:** GitHub Enterprise Server will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).  Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.

### Example


```python
import openapi_client
from openapi_client.models.organization_full import OrganizationFull
from openapi_client.models.orgs_update_request import OrgsUpdateRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    orgs_update_request = {"billing_email":"mona@github.com","company":"GitHub","default_repository_permission":"read","description":"GitHub, the company.","email":"mona@github.com","location":"San Francisco","members_allowed_repository_creation_type":"all","members_can_create_repositories":true,"name":"github","twitter_username":"github"} # OrgsUpdateRequest |  (optional)

    try:
        # Update an organization
        api_response = api_instance.orgs_update(org, orgs_update_request=orgs_update_request)
        print("The response of OrgsApi->orgs_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **orgs_update_request** | [**OrgsUpdateRequest**](OrgsUpdateRequest.md)|  | [optional] 

### Return type

[**OrganizationFull**](OrganizationFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**409** | Conflict |  -  |
**422** | Validation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orgs_update_membership_for_authenticated_user**
> OrgMembership orgs_update_membership_for_authenticated_user(org, orgs_update_membership_for_authenticated_user_request)

Update an organization membership for the authenticated user



### Example


```python
import openapi_client
from openapi_client.models.org_membership import OrgMembership
from openapi_client.models.orgs_update_membership_for_authenticated_user_request import OrgsUpdateMembershipForAuthenticatedUserRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    orgs_update_membership_for_authenticated_user_request = {"state":"active"} # OrgsUpdateMembershipForAuthenticatedUserRequest | 

    try:
        # Update an organization membership for the authenticated user
        api_response = api_instance.orgs_update_membership_for_authenticated_user(org, orgs_update_membership_for_authenticated_user_request)
        print("The response of OrgsApi->orgs_update_membership_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_update_membership_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **orgs_update_membership_for_authenticated_user_request** | [**OrgsUpdateMembershipForAuthenticatedUserRequest**](OrgsUpdateMembershipForAuthenticatedUserRequest.md)|  | 

### Return type

[**OrgMembership**](OrgMembership.md)

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

# **orgs_update_webhook**
> OrgHook orgs_update_webhook(org, hook_id, orgs_update_webhook_request=orgs_update_webhook_request)

Update an organization webhook

Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use \"[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization).\"

### Example


```python
import openapi_client
from openapi_client.models.org_hook import OrgHook
from openapi_client.models.orgs_update_webhook_request import OrgsUpdateWebhookRequest
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    orgs_update_webhook_request = {"active":true,"events":["pull_request"]} # OrgsUpdateWebhookRequest |  (optional)

    try:
        # Update an organization webhook
        api_response = api_instance.orgs_update_webhook(org, hook_id, orgs_update_webhook_request=orgs_update_webhook_request)
        print("The response of OrgsApi->orgs_update_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_update_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **orgs_update_webhook_request** | [**OrgsUpdateWebhookRequest**](OrgsUpdateWebhookRequest.md)|  | [optional] 

### Return type

[**OrgHook**](OrgHook.md)

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

# **orgs_update_webhook_config_for_org**
> WebhookConfig orgs_update_webhook_config_for_org(org, hook_id, apps_update_webhook_config_for_app_request=apps_update_webhook_config_for_app_request)

Update a webhook configuration for an organization

Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use \"[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook).\"  Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.

### Example


```python
import openapi_client
from openapi_client.models.apps_update_webhook_config_for_app_request import AppsUpdateWebhookConfigForAppRequest
from openapi_client.models.webhook_config import WebhookConfig
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
    api_instance = openapi_client.OrgsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    apps_update_webhook_config_for_app_request = {"content_type":"json","insecure_ssl":"0","secret":"********","url":"http://example.com/webhook"} # AppsUpdateWebhookConfigForAppRequest |  (optional)

    try:
        # Update a webhook configuration for an organization
        api_response = api_instance.orgs_update_webhook_config_for_org(org, hook_id, apps_update_webhook_config_for_app_request=apps_update_webhook_config_for_app_request)
        print("The response of OrgsApi->orgs_update_webhook_config_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OrgsApi->orgs_update_webhook_config_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **apps_update_webhook_config_for_app_request** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  | [optional] 

### Return type

[**WebhookConfig**](WebhookConfig.md)

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

