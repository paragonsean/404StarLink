# openapi_client.CorporateApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_available_corporate_permissions**](CorporateApi.md#get_available_corporate_permissions) | **GET** /corporate/permissions | View available permissions
[**get_available_corporate_permissions_by_id**](CorporateApi.md#get_available_corporate_permissions_by_id) | **GET** /corporates/{corporateId}/permissions | Get a list of available permissions for this corporate account. They are used when assigning permissions to corporate users.
[**get_corporate**](CorporateApi.md#get_corporate) | **GET** /corporate | View your corporate account
[**get_corporate_by_id**](CorporateApi.md#get_corporate_by_id) | **GET** /corporates/{corporateId} | Get details of this corporate account
[**get_corporate_user_groups**](CorporateApi.md#get_corporate_user_groups) | **GET** /corporate/user-groups | View user groups
[**get_corporate_user_groups_by_id**](CorporateApi.md#get_corporate_user_groups_by_id) | **GET** /corporates/{corporateId}/user-groups | Get a list of user groups for this corporate account
[**get_corporate_users**](CorporateApi.md#get_corporate_users) | **GET** /corporate/users | View users
[**get_corporate_users_by_id**](CorporateApi.md#get_corporate_users_by_id) | **GET** /corporates/{corporateId}/users | Get a list of users for this corporate account
[**get_corporates_list**](CorporateApi.md#get_corporates_list) | **GET** /corporates/all | Get a list of corporate accounts
[**save_corporate_user**](CorporateApi.md#save_corporate_user) | **POST** /corporate/users | Create or update a user
[**save_corporate_user_group**](CorporateApi.md#save_corporate_user_group) | **POST** /corporate/user-groups | Create or update a corporate user group
[**save_corporate_user_group_by_id**](CorporateApi.md#save_corporate_user_group_by_id) | **POST** /corporates/{corporateId}/user-groups | Create or update a corporate user group for this corporate account


# **get_available_corporate_permissions**
> PermissionList get_available_corporate_permissions()

View available permissions

View a list of available permissions for your corporate account. They are used when assigning permissions to your corporate users.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.permission_list import PermissionList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)

    try:
        # View available permissions
        api_response = api_instance.get_available_corporate_permissions()
        print("The response of CorporateApi->get_available_corporate_permissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_available_corporate_permissions: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**PermissionList**](PermissionList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of permission strings |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_available_corporate_permissions_by_id**
> PermissionList get_available_corporate_permissions_by_id(corporate_id)

Get a list of available permissions for this corporate account. They are used when assigning permissions to corporate users.

Get a list of available permissions for this corporate account. They are used when assigning permissions to corporate users.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.permission_list import PermissionList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    corporate_id = 56 # int | Corporate ID

    try:
        # Get a list of available permissions for this corporate account. They are used when assigning permissions to corporate users.
        api_response = api_instance.get_available_corporate_permissions_by_id(corporate_id)
        print("The response of CorporateApi->get_available_corporate_permissions_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_available_corporate_permissions_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporate_id** | **int**| Corporate ID | 

### Return type

[**PermissionList**](PermissionList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of permission strings |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate**
> CorporateAccount get_corporate()

View your corporate account

View the details of the corporate account that your user account belongs to.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.corporate_account import CorporateAccount
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)

    try:
        # View your corporate account
        api_response = api_instance.get_corporate()
        print("The response of CorporateApi->get_corporate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**CorporateAccount**](CorporateAccount.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Corporate account details |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate_by_id**
> CorporateAccount get_corporate_by_id(corporate_id)

Get details of this corporate account

Get details of this corporate account

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.corporate_account import CorporateAccount
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    corporate_id = 56 # int | Corporate ID

    try:
        # Get details of this corporate account
        api_response = api_instance.get_corporate_by_id(corporate_id)
        print("The response of CorporateApi->get_corporate_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporate_id** | **int**| Corporate ID | 

### Return type

[**CorporateAccount**](CorporateAccount.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Corporate account details |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate_user_groups**
> UserGroupList get_corporate_user_groups()

View user groups

View a list of user groups under my corporate account. User groups are a part of our RBAC implementation and can be used to configure complex permission scenarios.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_group_list import UserGroupList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)

    try:
        # View user groups
        api_response = api_instance.get_corporate_user_groups()
        print("The response of CorporateApi->get_corporate_user_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate_user_groups: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UserGroupList**](UserGroupList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate_user_groups_by_id**
> UserGroupList get_corporate_user_groups_by_id(corporate_id)

Get a list of user groups for this corporate account

Get a list of user groups for this corporate account

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_group_list import UserGroupList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    corporate_id = 56 # int | Corporate ID

    try:
        # Get a list of user groups for this corporate account
        api_response = api_instance.get_corporate_user_groups_by_id(corporate_id)
        print("The response of CorporateApi->get_corporate_user_groups_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate_user_groups_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporate_id** | **int**| Corporate ID | 

### Return type

[**UserGroupList**](UserGroupList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate_users**
> UserList get_corporate_users()

View users

View a list of users under your corporate account. This endpoint will only return information if your user account is permitted to view corporate account users, configured by your administrator.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_list import UserList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)

    try:
        # View users
        api_response = api_instance.get_corporate_users()
        print("The response of CorporateApi->get_corporate_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate_users: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UserList**](UserList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporate_users_by_id**
> UserList get_corporate_users_by_id(corporate_id)

Get a list of users for this corporate account

Get a list of users for this corporate account

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_list import UserList
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    corporate_id = 56 # int | Corporate ID

    try:
        # Get a list of users for this corporate account
        api_response = api_instance.get_corporate_users_by_id(corporate_id)
        print("The response of CorporateApi->get_corporate_users_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporate_users_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporate_id** | **int**| Corporate ID | 

### Return type

[**UserList**](UserList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_corporates_list**
> List[CorporateAccount] get_corporates_list()

Get a list of corporate accounts

Get a list of corporate accounts

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.corporate_account import CorporateAccount
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)

    try:
        # Get a list of corporate accounts
        api_response = api_instance.get_corporates_list()
        print("The response of CorporateApi->get_corporates_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->get_corporates_list: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[CorporateAccount]**](CorporateAccount.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Corporate account list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_corporate_user**
> User save_corporate_user(user_update_content)

Create or update a user

Create or update a user under your corporate account. This endpoint requires permissions for corporate user management, configured by your administrator.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user import User
from openapi_client.models.user_update_content import UserUpdateContent
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    user_update_content = openapi_client.UserUpdateContent() # UserUpdateContent | 

    try:
        # Create or update a user
        api_response = api_instance.save_corporate_user(user_update_content)
        print("The response of CorporateApi->save_corporate_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->save_corporate_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_update_content** | [**UserUpdateContent**](UserUpdateContent.md)|  | 

### Return type

[**User**](User.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created or updated user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_corporate_user_group**
> UserGroup save_corporate_user_group(user_group)

Create or update a corporate user group

Create or update a corporate user group

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_group import UserGroup
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    user_group = openapi_client.UserGroup() # UserGroup | 

    try:
        # Create or update a corporate user group
        api_response = api_instance.save_corporate_user_group(user_group)
        print("The response of CorporateApi->save_corporate_user_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->save_corporate_user_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_corporate_user_group_by_id**
> UserGroup save_corporate_user_group_by_id(corporate_id, user_group)

Create or update a corporate user group for this corporate account

Create or update a corporate user group for this corporate account

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.user_group import UserGroup
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CorporateApi(api_client)
    corporate_id = 56 # int | Corporate ID
    user_group = openapi_client.UserGroup() # UserGroup | 

    try:
        # Create or update a corporate user group for this corporate account
        api_response = api_instance.save_corporate_user_group_by_id(corporate_id, user_group)
        print("The response of CorporateApi->save_corporate_user_group_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorporateApi->save_corporate_user_group_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporate_id** | **int**| Corporate ID | 
 **user_group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User group list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

