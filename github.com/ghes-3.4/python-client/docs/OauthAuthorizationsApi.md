# openapi_client.OauthAuthorizationsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth_authorizations_create_authorization**](OauthAuthorizationsApi.md#oauth_authorizations_create_authorization) | **POST** /authorizations | Create a new authorization
[**oauth_authorizations_delete_authorization**](OauthAuthorizationsApi.md#oauth_authorizations_delete_authorization) | **DELETE** /authorizations/{authorization_id} | Delete an authorization
[**oauth_authorizations_delete_grant**](OauthAuthorizationsApi.md#oauth_authorizations_delete_grant) | **DELETE** /applications/grants/{grant_id} | Delete a grant
[**oauth_authorizations_get_authorization**](OauthAuthorizationsApi.md#oauth_authorizations_get_authorization) | **GET** /authorizations/{authorization_id} | Get a single authorization
[**oauth_authorizations_get_grant**](OauthAuthorizationsApi.md#oauth_authorizations_get_grant) | **GET** /applications/grants/{grant_id} | Get a single grant
[**oauth_authorizations_get_or_create_authorization_for_app**](OauthAuthorizationsApi.md#oauth_authorizations_get_or_create_authorization_for_app) | **PUT** /authorizations/clients/{client_id} | Get-or-create an authorization for a specific app
[**oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint**](OauthAuthorizationsApi.md#oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint) | **PUT** /authorizations/clients/{client_id}/{fingerprint} | Get-or-create an authorization for a specific app and fingerprint
[**oauth_authorizations_list_authorizations**](OauthAuthorizationsApi.md#oauth_authorizations_list_authorizations) | **GET** /authorizations | List your authorizations
[**oauth_authorizations_list_grants**](OauthAuthorizationsApi.md#oauth_authorizations_list_grants) | **GET** /applications/grants | List your grants
[**oauth_authorizations_update_authorization**](OauthAuthorizationsApi.md#oauth_authorizations_update_authorization) | **PATCH** /authorizations/{authorization_id} | Update an existing authorization


# **oauth_authorizations_create_authorization**
> Authorization oauth_authorizations_create_authorization(oauth_authorizations_create_authorization_request=oauth_authorizations_create_authorization_request)

Create a new authorization

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  **Warning:** Apps must use the [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow) to obtain OAuth tokens that work with GitHub Enterprise Server SAML organizations. OAuth tokens created using the Authorizations API will be unable to access GitHub Enterprise Server SAML organizations. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).  Creates OAuth tokens using [Basic Authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#basic-authentication). If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see \"[Working with two-factor authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#working-with-two-factor-authentication).\"  To create tokens for a particular OAuth application using this endpoint, you must authenticate as the user you want to create an authorization for and provide the app's client ID and secret, found on your OAuth application's settings page. If your OAuth application intends to create multiple tokens for one user, use `fingerprint` to differentiate between them.  You can also create tokens on GitHub Enterprise Server from the [personal access tokens settings](https://github.com/settings/tokens) page. Read more about these tokens in [the GitHub Help documentation](https://docs.github.com/enterprise-server@3.4/articles/creating-an-access-token-for-command-line-use).  Organizations that enforce SAML SSO require personal access tokens to be allowed. Read more about allowing tokens in [the GitHub Help documentation](https://docs.github.com/enterprise-server@3.4/articles/about-identity-and-access-management-with-saml-single-sign-on).

### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
from openapi_client.models.oauth_authorizations_create_authorization_request import OauthAuthorizationsCreateAuthorizationRequest
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    oauth_authorizations_create_authorization_request = {"client_id":"abcde12345fghij67890","client_secret":"3ef4ad510c59ad37bac6bb4f80047fb3aee3cc7f","note":"optional note","note_url":"http://optional/note/url","scopes":["public_repo"]} # OauthAuthorizationsCreateAuthorizationRequest |  (optional)

    try:
        # Create a new authorization
        api_response = api_instance.oauth_authorizations_create_authorization(oauth_authorizations_create_authorization_request=oauth_authorizations_create_authorization_request)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_create_authorization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_create_authorization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauth_authorizations_create_authorization_request** | [**OauthAuthorizationsCreateAuthorizationRequest**](OauthAuthorizationsCreateAuthorizationRequest.md)|  | [optional] 

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
**201** | Response |  * Location -  <br>  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**410** | Gone |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_authorizations_delete_authorization**
> oauth_authorizations_delete_authorization(authorization_id)

Delete an authorization

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).

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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    authorization_id = 56 # int | The unique identifier of the authorization.

    try:
        # Delete an authorization
        api_instance.oauth_authorizations_delete_authorization(authorization_id)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_delete_authorization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization_id** | **int**| The unique identifier of the authorization. | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_authorizations_delete_grant**
> oauth_authorizations_delete_grant(grant_id)

Delete a grant

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for your user. Once deleted, the application has no access to your account and is no longer listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).

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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    grant_id = 56 # int | The unique identifier of the grant.

    try:
        # Delete a grant
        api_instance.oauth_authorizations_delete_grant(grant_id)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_delete_grant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_id** | **int**| The unique identifier of the grant. | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_authorizations_get_authorization**
> Authorization oauth_authorizations_get_authorization(authorization_id)

Get a single authorization

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).

### Example


```python
import openapi_client
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    authorization_id = 56 # int | The unique identifier of the authorization.

    try:
        # Get a single authorization
        api_response = api_instance.oauth_authorizations_get_authorization(authorization_id)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_get_authorization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_get_authorization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization_id** | **int**| The unique identifier of the authorization. | 

### Return type

[**Authorization**](Authorization.md)

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

# **oauth_authorizations_get_grant**
> ApplicationGrant oauth_authorizations_get_grant(grant_id)

Get a single grant

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).

### Example


```python
import openapi_client
from openapi_client.models.application_grant import ApplicationGrant
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    grant_id = 56 # int | The unique identifier of the grant.

    try:
        # Get a single grant
        api_response = api_instance.oauth_authorizations_get_grant(grant_id)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_get_grant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_get_grant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_id** | **int**| The unique identifier of the grant. | 

### Return type

[**ApplicationGrant**](ApplicationGrant.md)

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

# **oauth_authorizations_get_or_create_authorization_for_app**
> Authorization oauth_authorizations_get_or_create_authorization_for_app(client_id, oauth_authorizations_get_or_create_authorization_for_app_request)

Get-or-create an authorization for a specific app

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  **Warning:** Apps must use the [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow) to obtain OAuth tokens that work with GitHub Enterprise Server SAML organizations. OAuth tokens created using the Authorizations API will be unable to access GitHub Enterprise Server SAML organizations. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).  Creates a new authorization for the specified OAuth application, only if an authorization for that application doesn't already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.  If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see \"[Working with two-factor authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#working-with-two-factor-authentication).\"  **Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).

### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
from openapi_client.models.oauth_authorizations_get_or_create_authorization_for_app_request import OauthAuthorizationsGetOrCreateAuthorizationForAppRequest
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    client_id = 'abcde12345fghij67890' # str | The client ID of the OAuth app.
    oauth_authorizations_get_or_create_authorization_for_app_request = {"client_secret":"3ef4ad510c59ad37bac6bb4f80047fb3aee3cc7f","note":"optional note","note_url":"http://optional/note/url","scopes":["public_repo"]} # OauthAuthorizationsGetOrCreateAuthorizationForAppRequest | 

    try:
        # Get-or-create an authorization for a specific app
        api_response = api_instance.oauth_authorizations_get_or_create_authorization_for_app(client_id, oauth_authorizations_get_or_create_authorization_for_app_request)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_get_or_create_authorization_for_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_get_or_create_authorization_for_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the OAuth app. | 
 **oauth_authorizations_get_or_create_authorization_for_app_request** | [**OauthAuthorizationsGetOrCreateAuthorizationForAppRequest**](OauthAuthorizationsGetOrCreateAuthorizationForAppRequest.md)|  | 

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
**200** | if returning an existing token |  * Location -  <br>  |
**201** | **Deprecation Notice:** GitHub will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/). |  * Location -  <br>  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint**
> Authorization oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint(client_id, fingerprint, oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request)

Get-or-create an authorization for a specific app and fingerprint

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  **Warning:** Apps must use the [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow) to obtain OAuth tokens that work with GitHub Enterprise Server SAML organizations. OAuth tokens created using the Authorizations API will be unable to access GitHub Enterprise Server SAML organizations. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).  This method will create a new authorization for the specified OAuth application, only if an authorization for that application and fingerprint do not already exist for the user. The URL includes the 20 character client ID for the OAuth app that is requesting the token. `fingerprint` is a unique string to distinguish an authorization from others created for the same client ID and user. It returns the user's existing authorization for the application if one is present. Otherwise, it creates and returns a new one.  If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see \"[Working with two-factor authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#working-with-two-factor-authentication).\"

### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
from openapi_client.models.oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request import OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    client_id = 'abcde12345fghij67890' # str | The client ID of the OAuth app.
    fingerprint = 'fingerprint_example' # str | 
    oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request = {"client_secret":"3ef4ad510c59ad37bac6bb4f80047fb3aee3cc7f","note":"optional note","note_url":"http://optional/note/url","scopes":["public_repo"]} # OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest | 

    try:
        # Get-or-create an authorization for a specific app and fingerprint
        api_response = api_instance.oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint(client_id, fingerprint, oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| The client ID of the OAuth app. | 
 **fingerprint** | **str**|  | 
 **oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request** | [**OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest**](OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest.md)|  | 

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
**200** | if returning an existing token |  * Location -  <br>  |
**201** | Response if returning a new token |  * Location -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth_authorizations_list_authorizations**
> List[Authorization] oauth_authorizations_list_authorizations(per_page=per_page, page=page, client_id=client_id)

List your authorizations

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/authorizing-oauth-apps/#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).

### Example


```python
import openapi_client
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    client_id = 'client_id_example' # str | The client ID of your GitHub app. (optional)

    try:
        # List your authorizations
        api_response = api_instance.oauth_authorizations_list_authorizations(per_page=per_page, page=page, client_id=client_id)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_list_authorizations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_list_authorizations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **client_id** | **str**| The client ID of your GitHub app. | [optional] 

### Return type

[**List[Authorization]**](Authorization.md)

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

# **oauth_authorizations_list_grants**
> List[ApplicationGrant] oauth_authorizations_list_grants(per_page=per_page, page=page, client_id=client_id)

List your grants

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  You can use this API to list the set of OAuth applications that have been granted access to your account. Unlike the [list your authorizations](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations#list-your-authorizations) API, this API does not manage individual tokens. This API will return one entry for each OAuth application that has been granted access to your account, regardless of the number of tokens an application has generated for your user. The list of OAuth applications returned matches what is shown on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized). The `scopes` returned are the union of scopes authorized for the application. For example, if an application has one token with `repo` scope and another token with `user` scope, the grant will return `[\"repo\", \"user\"]`.

### Example


```python
import openapi_client
from openapi_client.models.application_grant import ApplicationGrant
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    client_id = 'client_id_example' # str | The client ID of your GitHub app. (optional)

    try:
        # List your grants
        api_response = api_instance.oauth_authorizations_list_grants(per_page=per_page, page=page, client_id=client_id)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_list_grants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_list_grants: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **client_id** | **str**| The client ID of your GitHub app. | [optional] 

### Return type

[**List[ApplicationGrant]**](ApplicationGrant.md)

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

# **oauth_authorizations_update_authorization**
> Authorization oauth_authorizations_update_authorization(authorization_id, oauth_authorizations_update_authorization_request=oauth_authorizations_update_authorization_request)

Update an existing authorization

**Deprecation Notice:** GitHub Enterprise Server will discontinue the [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations/), which is used by integrations to create personal access tokens and OAuth tokens, and you must now create these tokens using our [web application flow](https://docs.github.com/enterprise-server@3.4/developers/apps/authorizing-oauth-apps#web-application-flow). The [OAuth Authorizations API](https://docs.github.com/enterprise-server@3.4/rest/reference/oauth-authorizations) will be removed on November, 13, 2020. For more information, including scheduled brownouts, see the [blog post](https://developer.github.com/changes/2020-02-14-deprecating-oauth-auth-endpoint/).  If you have two-factor authentication setup, Basic Authentication for this endpoint requires that you use a one-time password (OTP) and your username and password instead of tokens. For more information, see \"[Working with two-factor authentication](https://docs.github.com/enterprise-server@3.4/rest/overview/other-authentication-methods#working-with-two-factor-authentication).\"  You can only send one of these scope keys at a time.

### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
from openapi_client.models.oauth_authorizations_update_authorization_request import OauthAuthorizationsUpdateAuthorizationRequest
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
    api_instance = openapi_client.OauthAuthorizationsApi(api_client)
    authorization_id = 56 # int | The unique identifier of the authorization.
    oauth_authorizations_update_authorization_request = {"add_scopes":["public_repo"],"note":"optional note","remove_scopes":["user"]} # OauthAuthorizationsUpdateAuthorizationRequest |  (optional)

    try:
        # Update an existing authorization
        api_response = api_instance.oauth_authorizations_update_authorization(authorization_id, oauth_authorizations_update_authorization_request=oauth_authorizations_update_authorization_request)
        print("The response of OauthAuthorizationsApi->oauth_authorizations_update_authorization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OauthAuthorizationsApi->oauth_authorizations_update_authorization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization_id** | **int**| The unique identifier of the authorization. | 
 **oauth_authorizations_update_authorization_request** | [**OauthAuthorizationsUpdateAuthorizationRequest**](OauthAuthorizationsUpdateAuthorizationRequest.md)|  | [optional] 

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

