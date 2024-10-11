# openapi_client.UsersApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_add_email_for_authenticated_user**](UsersApi.md#users_add_email_for_authenticated_user) | **POST** /user/emails | Add an email address for the authenticated user
[**users_check_following_for_user**](UsersApi.md#users_check_following_for_user) | **GET** /users/{username}/following/{target_user} | Check if a user follows another user
[**users_check_person_is_followed_by_authenticated**](UsersApi.md#users_check_person_is_followed_by_authenticated) | **GET** /user/following/{username} | Check if a person is followed by the authenticated user
[**users_create_gpg_key_for_authenticated_user**](UsersApi.md#users_create_gpg_key_for_authenticated_user) | **POST** /user/gpg_keys | Create a GPG key for the authenticated user
[**users_create_public_ssh_key_for_authenticated_user**](UsersApi.md#users_create_public_ssh_key_for_authenticated_user) | **POST** /user/keys | Create a public SSH key for the authenticated user
[**users_delete_email_for_authenticated_user**](UsersApi.md#users_delete_email_for_authenticated_user) | **DELETE** /user/emails | Delete an email address for the authenticated user
[**users_delete_gpg_key_for_authenticated_user**](UsersApi.md#users_delete_gpg_key_for_authenticated_user) | **DELETE** /user/gpg_keys/{gpg_key_id} | Delete a GPG key for the authenticated user
[**users_delete_public_ssh_key_for_authenticated_user**](UsersApi.md#users_delete_public_ssh_key_for_authenticated_user) | **DELETE** /user/keys/{key_id} | Delete a public SSH key for the authenticated user
[**users_follow**](UsersApi.md#users_follow) | **PUT** /user/following/{username} | Follow a user
[**users_get_authenticated**](UsersApi.md#users_get_authenticated) | **GET** /user | Get the authenticated user
[**users_get_by_username**](UsersApi.md#users_get_by_username) | **GET** /users/{username} | Get a user
[**users_get_context_for_user**](UsersApi.md#users_get_context_for_user) | **GET** /users/{username}/hovercard | Get contextual information for a user
[**users_get_gpg_key_for_authenticated_user**](UsersApi.md#users_get_gpg_key_for_authenticated_user) | **GET** /user/gpg_keys/{gpg_key_id} | Get a GPG key for the authenticated user
[**users_get_public_ssh_key_for_authenticated_user**](UsersApi.md#users_get_public_ssh_key_for_authenticated_user) | **GET** /user/keys/{key_id} | Get a public SSH key for the authenticated user
[**users_list**](UsersApi.md#users_list) | **GET** /users | List users
[**users_list_emails_for_authenticated_user**](UsersApi.md#users_list_emails_for_authenticated_user) | **GET** /user/emails | List email addresses for the authenticated user
[**users_list_followed_by_authenticated_user**](UsersApi.md#users_list_followed_by_authenticated_user) | **GET** /user/following | List the people the authenticated user follows
[**users_list_followers_for_authenticated_user**](UsersApi.md#users_list_followers_for_authenticated_user) | **GET** /user/followers | List followers of the authenticated user
[**users_list_followers_for_user**](UsersApi.md#users_list_followers_for_user) | **GET** /users/{username}/followers | List followers of a user
[**users_list_following_for_user**](UsersApi.md#users_list_following_for_user) | **GET** /users/{username}/following | List the people a user follows
[**users_list_gpg_keys_for_authenticated_user**](UsersApi.md#users_list_gpg_keys_for_authenticated_user) | **GET** /user/gpg_keys | List GPG keys for the authenticated user
[**users_list_gpg_keys_for_user**](UsersApi.md#users_list_gpg_keys_for_user) | **GET** /users/{username}/gpg_keys | List GPG keys for a user
[**users_list_public_emails_for_authenticated_user**](UsersApi.md#users_list_public_emails_for_authenticated_user) | **GET** /user/public_emails | List public email addresses for the authenticated user
[**users_list_public_keys_for_user**](UsersApi.md#users_list_public_keys_for_user) | **GET** /users/{username}/keys | List public keys for a user
[**users_list_public_ssh_keys_for_authenticated_user**](UsersApi.md#users_list_public_ssh_keys_for_authenticated_user) | **GET** /user/keys | List public SSH keys for the authenticated user
[**users_unfollow**](UsersApi.md#users_unfollow) | **DELETE** /user/following/{username} | Unfollow a user
[**users_update_authenticated**](UsersApi.md#users_update_authenticated) | **PATCH** /user | Update the authenticated user


# **users_add_email_for_authenticated_user**
> List[Email] users_add_email_for_authenticated_user(users_add_email_for_authenticated_user_request=users_add_email_for_authenticated_user_request)

Add an email address for the authenticated user

This endpoint is accessible with the `user` scope.

### Example


```python
import openapi_client
from openapi_client.models.email import Email
from openapi_client.models.users_add_email_for_authenticated_user_request import UsersAddEmailForAuthenticatedUserRequest
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
    api_instance = openapi_client.UsersApi(api_client)
    users_add_email_for_authenticated_user_request = {"emails":["octocat@github.com","mona@github.com","octocat@octocat.org"]} # UsersAddEmailForAuthenticatedUserRequest |  (optional)

    try:
        # Add an email address for the authenticated user
        api_response = api_instance.users_add_email_for_authenticated_user(users_add_email_for_authenticated_user_request=users_add_email_for_authenticated_user_request)
        print("The response of UsersApi->users_add_email_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_add_email_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users_add_email_for_authenticated_user_request** | [**UsersAddEmailForAuthenticatedUserRequest**](UsersAddEmailForAuthenticatedUserRequest.md)|  | [optional] 

### Return type

[**List[Email]**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_check_following_for_user**
> users_check_following_for_user(username, target_user)

Check if a user follows another user



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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    target_user = 'target_user_example' # str | 

    try:
        # Check if a user follows another user
        api_instance.users_check_following_for_user(username, target_user)
    except Exception as e:
        print("Exception when calling UsersApi->users_check_following_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **target_user** | **str**|  | 

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
**204** | if the user follows the target user |  -  |
**404** | if the user does not follow the target user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_check_person_is_followed_by_authenticated**
> users_check_person_is_followed_by_authenticated(username)

Check if a person is followed by the authenticated user



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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Check if a person is followed by the authenticated user
        api_instance.users_check_person_is_followed_by_authenticated(username)
    except Exception as e:
        print("Exception when calling UsersApi->users_check_person_is_followed_by_authenticated: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**204** | if the person is followed by the authenticated user |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | if the person is not followed by the authenticated user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_create_gpg_key_for_authenticated_user**
> GpgKey users_create_gpg_key_for_authenticated_user(users_create_gpg_key_for_authenticated_user_request)

Create a GPG key for the authenticated user

Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.gpg_key import GpgKey
from openapi_client.models.users_create_gpg_key_for_authenticated_user_request import UsersCreateGpgKeyForAuthenticatedUserRequest
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
    api_instance = openapi_client.UsersApi(api_client)
    users_create_gpg_key_for_authenticated_user_request = {"armored_public_key":"-----BEGIN PGP PUBLIC KEY BLOCK-----\nVersion: GnuPG v1\n\nmQINBFnZ2ZIBEADQ2Z7Z7\n-----END PGP PUBLIC KEY BLOCK-----","name":"Octocat's GPG Key"} # UsersCreateGpgKeyForAuthenticatedUserRequest | 

    try:
        # Create a GPG key for the authenticated user
        api_response = api_instance.users_create_gpg_key_for_authenticated_user(users_create_gpg_key_for_authenticated_user_request)
        print("The response of UsersApi->users_create_gpg_key_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_create_gpg_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users_create_gpg_key_for_authenticated_user_request** | [**UsersCreateGpgKeyForAuthenticatedUserRequest**](UsersCreateGpgKeyForAuthenticatedUserRequest.md)|  | 

### Return type

[**GpgKey**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_create_public_ssh_key_for_authenticated_user**
> Key users_create_public_ssh_key_for_authenticated_user(users_create_public_ssh_key_for_authenticated_user_request)

Create a public SSH key for the authenticated user

Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.key import Key
from openapi_client.models.users_create_public_ssh_key_for_authenticated_user_request import UsersCreatePublicSshKeyForAuthenticatedUserRequest
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
    api_instance = openapi_client.UsersApi(api_client)
    users_create_public_ssh_key_for_authenticated_user_request = {"key":"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234","title":"ssh-rsa AAAAB3NzaC1yc2EAAA"} # UsersCreatePublicSshKeyForAuthenticatedUserRequest | 

    try:
        # Create a public SSH key for the authenticated user
        api_response = api_instance.users_create_public_ssh_key_for_authenticated_user(users_create_public_ssh_key_for_authenticated_user_request)
        print("The response of UsersApi->users_create_public_ssh_key_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_create_public_ssh_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users_create_public_ssh_key_for_authenticated_user_request** | [**UsersCreatePublicSshKeyForAuthenticatedUserRequest**](UsersCreatePublicSshKeyForAuthenticatedUserRequest.md)|  | 

### Return type

[**Key**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_delete_email_for_authenticated_user**
> users_delete_email_for_authenticated_user(users_delete_email_for_authenticated_user_request=users_delete_email_for_authenticated_user_request)

Delete an email address for the authenticated user

This endpoint is accessible with the `user` scope.

### Example


```python
import openapi_client
from openapi_client.models.users_delete_email_for_authenticated_user_request import UsersDeleteEmailForAuthenticatedUserRequest
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
    api_instance = openapi_client.UsersApi(api_client)
    users_delete_email_for_authenticated_user_request = {"emails":["octocat@github.com","mona@github.com"]} # UsersDeleteEmailForAuthenticatedUserRequest |  (optional)

    try:
        # Delete an email address for the authenticated user
        api_instance.users_delete_email_for_authenticated_user(users_delete_email_for_authenticated_user_request=users_delete_email_for_authenticated_user_request)
    except Exception as e:
        print("Exception when calling UsersApi->users_delete_email_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users_delete_email_for_authenticated_user_request** | [**UsersDeleteEmailForAuthenticatedUserRequest**](UsersDeleteEmailForAuthenticatedUserRequest.md)|  | [optional] 

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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_delete_gpg_key_for_authenticated_user**
> users_delete_gpg_key_for_authenticated_user(gpg_key_id)

Delete a GPG key for the authenticated user

Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

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
    api_instance = openapi_client.UsersApi(api_client)
    gpg_key_id = 56 # int | The unique identifier of the GPG key.

    try:
        # Delete a GPG key for the authenticated user
        api_instance.users_delete_gpg_key_for_authenticated_user(gpg_key_id)
    except Exception as e:
        print("Exception when calling UsersApi->users_delete_gpg_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gpg_key_id** | **int**| The unique identifier of the GPG key. | 

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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_delete_public_ssh_key_for_authenticated_user**
> users_delete_public_ssh_key_for_authenticated_user(key_id)

Delete a public SSH key for the authenticated user

Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

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
    api_instance = openapi_client.UsersApi(api_client)
    key_id = 56 # int | The unique identifier of the key.

    try:
        # Delete a public SSH key for the authenticated user
        api_instance.users_delete_public_ssh_key_for_authenticated_user(key_id)
    except Exception as e:
        print("Exception when calling UsersApi->users_delete_public_ssh_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **int**| The unique identifier of the key. | 

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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_follow**
> users_follow(username)

Follow a user

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"  Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.

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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Follow a user
        api_instance.users_follow(username)
    except Exception as e:
        print("Exception when calling UsersApi->users_follow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_get_authenticated**
> UsersGetAuthenticated200Response users_get_authenticated()

Get the authenticated user

If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.  If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.

### Example


```python
import openapi_client
from openapi_client.models.users_get_authenticated200_response import UsersGetAuthenticated200Response
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
    api_instance = openapi_client.UsersApi(api_client)

    try:
        # Get the authenticated user
        api_response = api_instance.users_get_authenticated()
        print("The response of UsersApi->users_get_authenticated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_get_authenticated: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

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
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_get_by_username**
> UsersGetAuthenticated200Response users_get_by_username(username)

Get a user

Provides publicly available information about someone with a GitHub account.  GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub Enterprise Server plan. The GitHub App must be authenticated as a user. See \"[Identifying and authorizing users for GitHub Apps](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)\" for details about authentication. For an example response, see 'Response with GitHub Enterprise Server plan information' below\"  The `email` key in the following response is the publicly visible email address from your GitHub Enterprise Server [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub Enterprise Server. For more information, see [Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#authentication).  The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see \"[Emails API](https://docs.github.com/enterprise-server@3.4/rest/reference/users#emails)\".

### Example


```python
import openapi_client
from openapi_client.models.users_get_authenticated200_response import UsersGetAuthenticated200Response
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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Get a user
        api_response = api_instance.users_get_by_username(username)
        print("The response of UsersApi->users_get_by_username:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_get_by_username: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

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

# **users_get_context_for_user**
> Hovercard users_get_context_for_user(username, subject_type=subject_type, subject_id=subject_id)

Get contextual information for a user

Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.  The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:  ```shell  curl -u username:token   https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192 ```

### Example


```python
import openapi_client
from openapi_client.models.hovercard import Hovercard
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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    subject_type = 'subject_type_example' # str | Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`. (optional)
    subject_id = 'subject_id_example' # str | Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`. (optional)

    try:
        # Get contextual information for a user
        api_response = api_instance.users_get_context_for_user(username, subject_type=subject_type, subject_id=subject_id)
        print("The response of UsersApi->users_get_context_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_get_context_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **subject_type** | **str**| Identifies which additional information you&#39;d like to receive about the person&#39;s hovercard. Can be &#x60;organization&#x60;, &#x60;repository&#x60;, &#x60;issue&#x60;, &#x60;pull_request&#x60;. **Required** when using &#x60;subject_id&#x60;. | [optional] 
 **subject_id** | **str**| Uses the ID for the &#x60;subject_type&#x60; you specified. **Required** when using &#x60;subject_type&#x60;. | [optional] 

### Return type

[**Hovercard**](Hovercard.md)

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

# **users_get_gpg_key_for_authenticated_user**
> GpgKey users_get_gpg_key_for_authenticated_user(gpg_key_id)

Get a GPG key for the authenticated user

View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.gpg_key import GpgKey
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
    api_instance = openapi_client.UsersApi(api_client)
    gpg_key_id = 56 # int | The unique identifier of the GPG key.

    try:
        # Get a GPG key for the authenticated user
        api_response = api_instance.users_get_gpg_key_for_authenticated_user(gpg_key_id)
        print("The response of UsersApi->users_get_gpg_key_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_get_gpg_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gpg_key_id** | **int**| The unique identifier of the GPG key. | 

### Return type

[**GpgKey**](GpgKey.md)

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
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_get_public_ssh_key_for_authenticated_user**
> Key users_get_public_ssh_key_for_authenticated_user(key_id)

Get a public SSH key for the authenticated user

View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.key import Key
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
    api_instance = openapi_client.UsersApi(api_client)
    key_id = 56 # int | The unique identifier of the key.

    try:
        # Get a public SSH key for the authenticated user
        api_response = api_instance.users_get_public_ssh_key_for_authenticated_user(key_id)
        print("The response of UsersApi->users_get_public_ssh_key_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_get_public_ssh_key_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **int**| The unique identifier of the key. | 

### Return type

[**Key**](Key.md)

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
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list**
> List[SimpleUser] users_list(since=since, per_page=per_page)

List users

Lists all users, in the order that they signed up on GitHub Enterprise Server. This list includes personal user accounts and organization accounts.  Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.

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
    api_instance = openapi_client.UsersApi(api_client)
    since = 56 # int | A user ID. Only return users with an ID greater than this ID. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List users
        api_response = api_instance.users_list(since=since, per_page=per_page)
        print("The response of UsersApi->users_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **int**| A user ID. Only return users with an ID greater than this ID. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

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
**304** | Not modified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_emails_for_authenticated_user**
> List[Email] users_list_emails_for_authenticated_user(per_page=per_page, page=page)

List email addresses for the authenticated user

Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.

### Example


```python
import openapi_client
from openapi_client.models.email import Email
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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List email addresses for the authenticated user
        api_response = api_instance.users_list_emails_for_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_emails_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_emails_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Email]**](Email.md)

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
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_followed_by_authenticated_user**
> List[SimpleUser] users_list_followed_by_authenticated_user(per_page=per_page, page=page)

List the people the authenticated user follows

Lists the people who the authenticated user follows.

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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List the people the authenticated user follows
        api_response = api_instance.users_list_followed_by_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_followed_by_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_followed_by_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_followers_for_authenticated_user**
> List[SimpleUser] users_list_followers_for_authenticated_user(per_page=per_page, page=page)

List followers of the authenticated user

Lists the people following the authenticated user.

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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List followers of the authenticated user
        api_response = api_instance.users_list_followers_for_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_followers_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_followers_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_followers_for_user**
> List[SimpleUser] users_list_followers_for_user(username, per_page=per_page, page=page)

List followers of a user

Lists the people following the specified user.

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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List followers of a user
        api_response = api_instance.users_list_followers_for_user(username, per_page=per_page, page=page)
        print("The response of UsersApi->users_list_followers_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_followers_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
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

# **users_list_following_for_user**
> List[SimpleUser] users_list_following_for_user(username, per_page=per_page, page=page)

List the people a user follows

Lists the people who the specified user follows.

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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List the people a user follows
        api_response = api_instance.users_list_following_for_user(username, per_page=per_page, page=page)
        print("The response of UsersApi->users_list_following_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_following_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
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

# **users_list_gpg_keys_for_authenticated_user**
> List[GpgKey] users_list_gpg_keys_for_authenticated_user(per_page=per_page, page=page)

List GPG keys for the authenticated user

Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.gpg_key import GpgKey
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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List GPG keys for the authenticated user
        api_response = api_instance.users_list_gpg_keys_for_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_gpg_keys_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_gpg_keys_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[GpgKey]**](GpgKey.md)

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
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_gpg_keys_for_user**
> List[GpgKey] users_list_gpg_keys_for_user(username, per_page=per_page, page=page)

List GPG keys for a user

Lists the GPG keys for a user. This information is accessible by anyone.

### Example


```python
import openapi_client
from openapi_client.models.gpg_key import GpgKey
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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List GPG keys for a user
        api_response = api_instance.users_list_gpg_keys_for_user(username, per_page=per_page, page=page)
        print("The response of UsersApi->users_list_gpg_keys_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_gpg_keys_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[GpgKey]**](GpgKey.md)

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

# **users_list_public_emails_for_authenticated_user**
> List[Email] users_list_public_emails_for_authenticated_user(per_page=per_page, page=page)

List public email addresses for the authenticated user

Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/enterprise-server@3.4/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.

### Example


```python
import openapi_client
from openapi_client.models.email import Email
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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List public email addresses for the authenticated user
        api_response = api_instance.users_list_public_emails_for_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_public_emails_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_public_emails_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Email]**](Email.md)

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
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_list_public_keys_for_user**
> List[KeySimple] users_list_public_keys_for_user(username, per_page=per_page, page=page)

List public keys for a user

Lists the _verified_ public SSH keys for a user. This is accessible by anyone.

### Example


```python
import openapi_client
from openapi_client.models.key_simple import KeySimple
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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List public keys for a user
        api_response = api_instance.users_list_public_keys_for_user(username, per_page=per_page, page=page)
        print("The response of UsersApi->users_list_public_keys_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_public_keys_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[KeySimple]**](KeySimple.md)

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

# **users_list_public_ssh_keys_for_authenticated_user**
> List[Key] users_list_public_ssh_keys_for_authenticated_user(per_page=per_page, page=page)

List public SSH keys for the authenticated user

Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

### Example


```python
import openapi_client
from openapi_client.models.key import Key
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
    api_instance = openapi_client.UsersApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List public SSH keys for the authenticated user
        api_response = api_instance.users_list_public_ssh_keys_for_authenticated_user(per_page=per_page, page=page)
        print("The response of UsersApi->users_list_public_ssh_keys_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_list_public_ssh_keys_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Key]**](Key.md)

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
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_unfollow**
> users_unfollow(username)

Unfollow a user

Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.

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
    api_instance = openapi_client.UsersApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Unfollow a user
        api_instance.users_unfollow(username)
    except Exception as e:
        print("Exception when calling UsersApi->users_unfollow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_update_authenticated**
> PrivateUser users_update_authenticated(users_update_authenticated_request=users_update_authenticated_request)

Update the authenticated user

**Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.

### Example


```python
import openapi_client
from openapi_client.models.private_user import PrivateUser
from openapi_client.models.users_update_authenticated_request import UsersUpdateAuthenticatedRequest
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
    api_instance = openapi_client.UsersApi(api_client)
    users_update_authenticated_request = {"blog":"https://github.com/blog","name":"monalisa octocat"} # UsersUpdateAuthenticatedRequest |  (optional)

    try:
        # Update the authenticated user
        api_response = api_instance.users_update_authenticated(users_update_authenticated_request=users_update_authenticated_request)
        print("The response of UsersApi->users_update_authenticated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->users_update_authenticated: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users_update_authenticated_request** | [**UsersUpdateAuthenticatedRequest**](UsersUpdateAuthenticatedRequest.md)|  | [optional] 

### Return type

[**PrivateUser**](PrivateUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

