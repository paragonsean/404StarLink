# openapi_client.AppsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apps_add_repo_to_installation_for_authenticated_user**](AppsApi.md#apps_add_repo_to_installation_for_authenticated_user) | **PUT** /user/installations/{installation_id}/repositories/{repository_id} | Add a repository to an app installation
[**apps_check_token**](AppsApi.md#apps_check_token) | **POST** /applications/{client_id}/token | Check a token
[**apps_create_from_manifest**](AppsApi.md#apps_create_from_manifest) | **POST** /app-manifests/{code}/conversions | Create a GitHub App from a manifest
[**apps_create_installation_access_token**](AppsApi.md#apps_create_installation_access_token) | **POST** /app/installations/{installation_id}/access_tokens | Create an installation access token for an app
[**apps_delete_authorization**](AppsApi.md#apps_delete_authorization) | **DELETE** /applications/{client_id}/grant | Delete an app authorization
[**apps_delete_installation**](AppsApi.md#apps_delete_installation) | **DELETE** /app/installations/{installation_id} | Delete an installation for the authenticated app
[**apps_delete_token**](AppsApi.md#apps_delete_token) | **DELETE** /applications/{client_id}/token | Delete an app token
[**apps_get_authenticated**](AppsApi.md#apps_get_authenticated) | **GET** /app | Get the authenticated app
[**apps_get_by_slug**](AppsApi.md#apps_get_by_slug) | **GET** /apps/{app_slug} | Get an app
[**apps_get_installation**](AppsApi.md#apps_get_installation) | **GET** /app/installations/{installation_id} | Get an installation for the authenticated app
[**apps_get_org_installation**](AppsApi.md#apps_get_org_installation) | **GET** /orgs/{org}/installation | Get an organization installation for the authenticated app
[**apps_get_repo_installation**](AppsApi.md#apps_get_repo_installation) | **GET** /repos/{owner}/{repo}/installation | Get a repository installation for the authenticated app
[**apps_get_user_installation**](AppsApi.md#apps_get_user_installation) | **GET** /users/{username}/installation | Get a user installation for the authenticated app
[**apps_get_webhook_config_for_app**](AppsApi.md#apps_get_webhook_config_for_app) | **GET** /app/hook/config | Get a webhook configuration for an app
[**apps_get_webhook_delivery**](AppsApi.md#apps_get_webhook_delivery) | **GET** /app/hook/deliveries/{delivery_id} | Get a delivery for an app webhook
[**apps_list_installation_repos_for_authenticated_user**](AppsApi.md#apps_list_installation_repos_for_authenticated_user) | **GET** /user/installations/{installation_id}/repositories | List repositories accessible to the user access token
[**apps_list_installations**](AppsApi.md#apps_list_installations) | **GET** /app/installations | List installations for the authenticated app
[**apps_list_installations_for_authenticated_user**](AppsApi.md#apps_list_installations_for_authenticated_user) | **GET** /user/installations | List app installations accessible to the user access token
[**apps_list_repos_accessible_to_installation**](AppsApi.md#apps_list_repos_accessible_to_installation) | **GET** /installation/repositories | List repositories accessible to the app installation
[**apps_list_webhook_deliveries**](AppsApi.md#apps_list_webhook_deliveries) | **GET** /app/hook/deliveries | List deliveries for an app webhook
[**apps_redeliver_webhook_delivery**](AppsApi.md#apps_redeliver_webhook_delivery) | **POST** /app/hook/deliveries/{delivery_id}/attempts | Redeliver a delivery for an app webhook
[**apps_remove_repo_from_installation_for_authenticated_user**](AppsApi.md#apps_remove_repo_from_installation_for_authenticated_user) | **DELETE** /user/installations/{installation_id}/repositories/{repository_id} | Remove a repository from an app installation
[**apps_reset_token**](AppsApi.md#apps_reset_token) | **PATCH** /applications/{client_id}/token | Reset a token
[**apps_revoke_installation_access_token**](AppsApi.md#apps_revoke_installation_access_token) | **DELETE** /installation/token | Revoke an installation access token
[**apps_scope_token**](AppsApi.md#apps_scope_token) | **POST** /applications/{client_id}/token/scoped | Create a scoped access token
[**apps_suspend_installation**](AppsApi.md#apps_suspend_installation) | **PUT** /app/installations/{installation_id}/suspended | Suspend an app installation
[**apps_unsuspend_installation**](AppsApi.md#apps_unsuspend_installation) | **DELETE** /app/installations/{installation_id}/suspended | Unsuspend an app installation
[**apps_update_webhook_config_for_app**](AppsApi.md#apps_update_webhook_config_for_app) | **PATCH** /app/hook/config | Update a webhook configuration for an app


# **apps_add_repo_to_installation_for_authenticated_user**
> apps_add_repo_to_installation_for_authenticated_user(installation_id, repository_id)

Add a repository to an app installation

Add a single repository to an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/enterprise-server@3.4/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Add a repository to an app installation
        api_instance.apps_add_repo_to_installation_for_authenticated_user(installation_id, repository_id)
    except Exception as e:
        print("Exception when calling AppsApi->apps_add_repo_to_installation_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_check_token**
> Authorization apps_check_token(client_id, apps_check_token_request)

Check a token

OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.

### Example


```python
import openapi_client
from openapi_client.models.apps_check_token_request import AppsCheckTokenRequest
from openapi_client.models.authorization import Authorization
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
    api_instance = openapi_client.AppsApi(api_client)
    client_id = 'Iv1.8a61f9b3a7aba766' # str | The client ID of the GitHub app.
    apps_check_token_request = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a"} # AppsCheckTokenRequest | 

    try:
        # Check a token
        api_response = api_instance.apps_check_token(client_id, apps_check_token_request)
        print("The response of AppsApi->apps_check_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_check_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the GitHub app. | 
 **apps_check_token_request** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  | 

### Return type

[**Authorization**](Authorization.md)

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

# **apps_create_from_manifest**
> AppsCreateFromManifest201Response apps_create_from_manifest(code)

Create a GitHub App from a manifest

Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.

### Example


```python
import openapi_client
from openapi_client.models.apps_create_from_manifest201_response import AppsCreateFromManifest201Response
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
    api_instance = openapi_client.AppsApi(api_client)
    code = 'code_example' # str | 

    try:
        # Create a GitHub App from a manifest
        api_response = api_instance.apps_create_from_manifest(code)
        print("The response of AppsApi->apps_create_from_manifest:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_create_from_manifest: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  | 

### Return type

[**AppsCreateFromManifest201Response**](AppsCreateFromManifest201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_create_installation_access_token**
> InstallationToken apps_create_installation_access_token(installation_id, apps_create_installation_access_token_request=apps_create_installation_access_token_request)

Create an installation access token for an app

Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.apps_create_installation_access_token_request import AppsCreateInstallationAccessTokenRequest
from openapi_client.models.installation_token import InstallationToken
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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.
    apps_create_installation_access_token_request = {"permissions":{"contents":"read","issues":"write"},"repository":"Hello-World"} # AppsCreateInstallationAccessTokenRequest |  (optional)

    try:
        # Create an installation access token for an app
        api_response = api_instance.apps_create_installation_access_token(installation_id, apps_create_installation_access_token_request=apps_create_installation_access_token_request)
        print("The response of AppsApi->apps_create_installation_access_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_create_installation_access_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 
 **apps_create_installation_access_token_request** | [**AppsCreateInstallationAccessTokenRequest**](AppsCreateInstallationAccessTokenRequest.md)|  | [optional] 

### Return type

[**InstallationToken**](InstallationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_delete_authorization**
> apps_delete_authorization(client_id, apps_delete_authorization_request)

Delete an app authorization

OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted. Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).

### Example


```python
import openapi_client
from openapi_client.models.apps_delete_authorization_request import AppsDeleteAuthorizationRequest
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
    api_instance = openapi_client.AppsApi(api_client)
    client_id = 'Iv1.8a61f9b3a7aba766' # str | The client ID of the GitHub app.
    apps_delete_authorization_request = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a"} # AppsDeleteAuthorizationRequest | 

    try:
        # Delete an app authorization
        api_instance.apps_delete_authorization(client_id, apps_delete_authorization_request)
    except Exception as e:
        print("Exception when calling AppsApi->apps_delete_authorization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the GitHub app. | 
 **apps_delete_authorization_request** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  | 

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_delete_installation**
> apps_delete_installation(installation_id)

Delete an installation for the authenticated app

Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app's access to your account's resources, then we recommend the \"[Suspend an app installation](https://docs.github.com/enterprise-server@3.4/rest/reference/apps/#suspend-an-app-installation)\" endpoint.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.

    try:
        # Delete an installation for the authenticated app
        api_instance.apps_delete_installation(installation_id)
    except Exception as e:
        print("Exception when calling AppsApi->apps_delete_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 

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

# **apps_delete_token**
> apps_delete_token(client_id, apps_delete_authorization_request)

Delete an app token

OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.

### Example


```python
import openapi_client
from openapi_client.models.apps_delete_authorization_request import AppsDeleteAuthorizationRequest
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
    api_instance = openapi_client.AppsApi(api_client)
    client_id = 'Iv1.8a61f9b3a7aba766' # str | The client ID of the GitHub app.
    apps_delete_authorization_request = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a"} # AppsDeleteAuthorizationRequest | 

    try:
        # Delete an app token
        api_instance.apps_delete_token(client_id, apps_delete_authorization_request)
    except Exception as e:
        print("Exception when calling AppsApi->apps_delete_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the GitHub app. | 
 **apps_delete_authorization_request** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  | 

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_get_authenticated**
> Integration apps_get_authenticated()

Get the authenticated app

Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the \"[List installations for the authenticated app](https://docs.github.com/enterprise-server@3.4/rest/reference/apps#list-installations-for-the-authenticated-app)\" endpoint.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
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
    api_instance = openapi_client.AppsApi(api_client)

    try:
        # Get the authenticated app
        api_response = api_instance.apps_get_authenticated()
        print("The response of AppsApi->apps_get_authenticated:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_authenticated: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Integration**](Integration.md)

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

# **apps_get_by_slug**
> Integration apps_get_by_slug(app_slug)

Get an app

**Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).  If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://docs.github.com/enterprise-server@3.4/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
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
    api_instance = openapi_client.AppsApi(api_client)
    app_slug = 'app_slug_example' # str | 

    try:
        # Get an app
        api_response = api_instance.apps_get_by_slug(app_slug)
        print("The response of AppsApi->apps_get_by_slug:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_by_slug: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_slug** | **str**|  | 

### Return type

[**Integration**](Integration.md)

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

# **apps_get_installation**
> Installation apps_get_installation(installation_id)

Get an installation for the authenticated app

Enables an authenticated GitHub App to find an installation's information using the installation id.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.installation import Installation
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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.

    try:
        # Get an installation for the authenticated app
        api_response = api_instance.apps_get_installation(installation_id)
        print("The response of AppsApi->apps_get_installation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 

### Return type

[**Installation**](Installation.md)

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

# **apps_get_org_installation**
> Installation apps_get_org_installation(org)

Get an organization installation for the authenticated app

Enables an authenticated GitHub App to find the organization's installation information.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.installation import Installation
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
    api_instance = openapi_client.AppsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get an organization installation for the authenticated app
        api_response = api_instance.apps_get_org_installation(org)
        print("The response of AppsApi->apps_get_org_installation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_org_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**Installation**](Installation.md)

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

# **apps_get_repo_installation**
> Installation apps_get_repo_installation(owner, repo)

Get a repository installation for the authenticated app

Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.installation import Installation
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
    api_instance = openapi_client.AppsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get a repository installation for the authenticated app
        api_response = api_instance.apps_get_repo_installation(owner, repo)
        print("The response of AppsApi->apps_get_repo_installation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_repo_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**Installation**](Installation.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_get_user_installation**
> Installation apps_get_user_installation(username)

Get a user installation for the authenticated app

Enables an authenticated GitHub App to find the user’s installation information.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.installation import Installation
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
    api_instance = openapi_client.AppsApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Get a user installation for the authenticated app
        api_response = api_instance.apps_get_user_installation(username)
        print("The response of AppsApi->apps_get_user_installation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_user_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

[**Installation**](Installation.md)

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

# **apps_get_webhook_config_for_app**
> WebhookConfig apps_get_webhook_config_for_app()

Get a webhook configuration for an app

Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \"[Creating a GitHub App](/developers/apps/creating-a-github-app).\"  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)

    try:
        # Get a webhook configuration for an app
        api_response = api_instance.apps_get_webhook_config_for_app()
        print("The response of AppsApi->apps_get_webhook_config_for_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_webhook_config_for_app: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

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

# **apps_get_webhook_delivery**
> HookDelivery apps_get_webhook_delivery(delivery_id)

Get a delivery for an app webhook

Returns a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    delivery_id = 56 # int | 

    try:
        # Get a delivery for an app webhook
        api_response = api_instance.apps_get_webhook_delivery(delivery_id)
        print("The response of AppsApi->apps_get_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_get_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **apps_list_installation_repos_for_authenticated_user**
> AppsListInstallationReposForAuthenticatedUser200Response apps_list_installation_repos_for_authenticated_user(installation_id, per_page=per_page, page=page)

List repositories accessible to the user access token

List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You must use a [user-to-server OAuth access token](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The access the user has to each repository is included in the hash under the `permissions` key.

### Example


```python
import openapi_client
from openapi_client.models.apps_list_installation_repos_for_authenticated_user200_response import AppsListInstallationReposForAuthenticatedUser200Response
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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repositories accessible to the user access token
        api_response = api_instance.apps_list_installation_repos_for_authenticated_user(installation_id, per_page=per_page, page=page)
        print("The response of AppsApi->apps_list_installation_repos_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_list_installation_repos_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**AppsListInstallationReposForAuthenticatedUser200Response**](AppsListInstallationReposForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The access the user has to each repository is included in the hash under the &#x60;permissions&#x60; key. |  * Link -  <br>  |
**304** | Not modified |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_list_installations**
> List[Installation] apps_list_installations(per_page=per_page, page=page, since=since, outdated=outdated)

List installations for the authenticated app

You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.  The permissions the installation has are included under the `permissions` key.

### Example


```python
import openapi_client
from openapi_client.models.installation import Installation
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
    api_instance = openapi_client.AppsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    outdated = 'outdated_example' # str |  (optional)

    try:
        # List installations for the authenticated app
        api_response = api_instance.apps_list_installations(per_page=per_page, page=page, since=since, outdated=outdated)
        print("The response of AppsApi->apps_list_installations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_list_installations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **outdated** | **str**|  | [optional] 

### Return type

[**List[Installation]**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The permissions the installation has are included under the &#x60;permissions&#x60; key. |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_list_installations_for_authenticated_user**
> OrgsListAppInstallations200Response apps_list_installations_for_authenticated_user(per_page=per_page, page=page)

List app installations accessible to the user access token

Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.  You must use a [user-to-server OAuth access token](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You can find the permissions for the installation under the `permissions` key.

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
    api_instance = openapi_client.AppsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List app installations accessible to the user access token
        api_response = api_instance.apps_list_installations_for_authenticated_user(per_page=per_page, page=page)
        print("The response of AppsApi->apps_list_installations_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_list_installations_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**200** | You can find the permissions for the installation under the &#x60;permissions&#x60; key. |  * Link -  <br>  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_list_repos_accessible_to_installation**
> AppsListReposAccessibleToInstallation200Response apps_list_repos_accessible_to_installation(per_page=per_page, page=page)

List repositories accessible to the app installation

List repositories that an app installation can access.  You must use an [installation access token](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.apps_list_repos_accessible_to_installation200_response import AppsListReposAccessibleToInstallation200Response
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
    api_instance = openapi_client.AppsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repositories accessible to the app installation
        api_response = api_instance.apps_list_repos_accessible_to_installation(per_page=per_page, page=page)
        print("The response of AppsApi->apps_list_repos_accessible_to_installation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_list_repos_accessible_to_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**AppsListReposAccessibleToInstallation200Response**](AppsListReposAccessibleToInstallation200Response.md)

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

# **apps_list_webhook_deliveries**
> List[HookDeliveryItem] apps_list_webhook_deliveries(per_page=per_page, cursor=cursor, redelivery=redelivery)

List deliveries for an app webhook

Returns a list of webhook deliveries for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    cursor = 'cursor_example' # str | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. (optional)
    redelivery = True # bool |  (optional)

    try:
        # List deliveries for an app webhook
        api_response = api_instance.apps_list_webhook_deliveries(per_page=per_page, cursor=cursor, redelivery=redelivery)
        print("The response of AppsApi->apps_list_webhook_deliveries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_list_webhook_deliveries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **apps_redeliver_webhook_delivery**
> object apps_redeliver_webhook_delivery(delivery_id)

Redeliver a delivery for an app webhook

Redeliver a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    delivery_id = 56 # int | 

    try:
        # Redeliver a delivery for an app webhook
        api_response = api_instance.apps_redeliver_webhook_delivery(delivery_id)
        print("The response of AppsApi->apps_redeliver_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_redeliver_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **apps_remove_repo_from_installation_for_authenticated_user**
> apps_remove_repo_from_installation_for_authenticated_user(installation_id, repository_id)

Remove a repository from an app installation

Remove a single repository from an installation. The authenticated user must have admin access to the repository.  You must use a personal access token (which you can create via the [command line](https://docs.github.com/enterprise-server@3.4/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Remove a repository from an app installation
        api_instance.apps_remove_repo_from_installation_for_authenticated_user(installation_id, repository_id)
    except Exception as e:
        print("Exception when calling AppsApi->apps_remove_repo_from_installation_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_reset_token**
> Authorization apps_reset_token(client_id, apps_check_token_request)

Reset a token

OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the \"token\" property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.

### Example


```python
import openapi_client
from openapi_client.models.apps_check_token_request import AppsCheckTokenRequest
from openapi_client.models.authorization import Authorization
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
    api_instance = openapi_client.AppsApi(api_client)
    client_id = 'Iv1.8a61f9b3a7aba766' # str | The client ID of the GitHub app.
    apps_check_token_request = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a"} # AppsCheckTokenRequest | 

    try:
        # Reset a token
        api_response = api_instance.apps_reset_token(client_id, apps_check_token_request)
        print("The response of AppsApi->apps_reset_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_reset_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the GitHub app. | 
 **apps_check_token_request** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  | 

### Return type

[**Authorization**](Authorization.md)

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

# **apps_revoke_installation_access_token**
> apps_revoke_installation_access_token()

Revoke an installation access token

Revokes the installation token you're using to authenticate as an installation and access this endpoint.  Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the \"[Create an installation access token for an app](https://docs.github.com/enterprise-server@3.4/rest/reference/apps#create-an-installation-access-token-for-an-app)\" endpoint.  You must use an [installation access token](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)

    try:
        # Revoke an installation access token
        api_instance.apps_revoke_installation_access_token()
    except Exception as e:
        print("Exception when calling AppsApi->apps_revoke_installation_access_token: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

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

# **apps_scope_token**
> Authorization apps_scope_token(client_id, apps_scope_token_request)

Create a scoped access token

Use a non-scoped user-to-server access token to create a repository scoped and/or permission scoped user-to-server access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the `client_id` and `client_secret` of the GitHub App as the username and password. Invalid tokens will return `404 NOT FOUND`.

### Example


```python
import openapi_client
from openapi_client.models.apps_scope_token_request import AppsScopeTokenRequest
from openapi_client.models.authorization import Authorization
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
    api_instance = openapi_client.AppsApi(api_client)
    client_id = 'Iv1.8a61f9b3a7aba766' # str | The client ID of the GitHub app.
    apps_scope_token_request = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a","permissions":{"contents":"read","issues":"write","metadata":"read"},"target":"octocat"} # AppsScopeTokenRequest | 

    try:
        # Create a scoped access token
        api_response = api_instance.apps_scope_token(client_id, apps_scope_token_request)
        print("The response of AppsApi->apps_scope_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_scope_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the GitHub app. | 
 **apps_scope_token_request** | [**AppsScopeTokenRequest**](AppsScopeTokenRequest.md)|  | 

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apps_suspend_installation**
> apps_suspend_installation(installation_id)

Suspend an app installation

Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account's resources. When a GitHub App is suspended, the app's access to the GitHub Enterprise Server API or webhook events is blocked for that account.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.

    try:
        # Suspend an app installation
        api_instance.apps_suspend_installation(installation_id)
    except Exception as e:
        print("Exception when calling AppsApi->apps_suspend_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 

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

# **apps_unsuspend_installation**
> apps_unsuspend_installation(installation_id)

Unsuspend an app installation

Removes a GitHub App installation suspension.  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    installation_id = 1 # int | The unique identifier of the installation.

    try:
        # Unsuspend an app installation
        api_instance.apps_unsuspend_installation(installation_id)
    except Exception as e:
        print("Exception when calling AppsApi->apps_unsuspend_installation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installation_id** | **int**| The unique identifier of the installation. | 

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

# **apps_update_webhook_config_for_app**
> WebhookConfig apps_update_webhook_config_for_app(apps_update_webhook_config_for_app_request)

Update a webhook configuration for an app

Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \"[Creating a GitHub App](/developers/apps/creating-a-github-app).\"  You must use a [JWT](https://docs.github.com/enterprise-server@3.4/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

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
    api_instance = openapi_client.AppsApi(api_client)
    apps_update_webhook_config_for_app_request = {"content_type":"json","insecure_ssl":"0","secret":"********","url":"https://example.com/webhook"} # AppsUpdateWebhookConfigForAppRequest | 

    try:
        # Update a webhook configuration for an app
        api_response = api_instance.apps_update_webhook_config_for_app(apps_update_webhook_config_for_app_request)
        print("The response of AppsApi->apps_update_webhook_config_for_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AppsApi->apps_update_webhook_config_for_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apps_update_webhook_config_for_app_request** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  | 

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

