# openapi_client.MigrationsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**migrations_delete_archive_for_org**](MigrationsApi.md#migrations_delete_archive_for_org) | **DELETE** /orgs/{org}/migrations/{migration_id}/archive | Delete an organization migration archive
[**migrations_download_archive_for_org**](MigrationsApi.md#migrations_download_archive_for_org) | **GET** /orgs/{org}/migrations/{migration_id}/archive | Download an organization migration archive
[**migrations_get_archive_for_authenticated_user**](MigrationsApi.md#migrations_get_archive_for_authenticated_user) | **GET** /user/migrations/{migration_id}/archive | Download a user migration archive
[**migrations_get_status_for_org**](MigrationsApi.md#migrations_get_status_for_org) | **GET** /orgs/{org}/migrations/{migration_id} | Get an organization migration status
[**migrations_list_for_authenticated_user**](MigrationsApi.md#migrations_list_for_authenticated_user) | **GET** /user/migrations | List user migrations
[**migrations_list_for_org**](MigrationsApi.md#migrations_list_for_org) | **GET** /orgs/{org}/migrations | List organization migrations
[**migrations_list_repos_for_authenticated_user**](MigrationsApi.md#migrations_list_repos_for_authenticated_user) | **GET** /user/migrations/{migration_id}/repositories | List repositories for a user migration
[**migrations_list_repos_for_org**](MigrationsApi.md#migrations_list_repos_for_org) | **GET** /orgs/{org}/migrations/{migration_id}/repositories | List repositories in an organization migration
[**migrations_start_for_authenticated_user**](MigrationsApi.md#migrations_start_for_authenticated_user) | **POST** /user/migrations | Start a user migration
[**migrations_start_for_org**](MigrationsApi.md#migrations_start_for_org) | **POST** /orgs/{org}/migrations | Start an organization migration
[**migrations_unlock_repo_for_org**](MigrationsApi.md#migrations_unlock_repo_for_org) | **DELETE** /orgs/{org}/migrations/{migration_id}/repos/{repo_name}/lock | Unlock an organization repository


# **migrations_delete_archive_for_org**
> migrations_delete_archive_for_org(org, migration_id)

Delete an organization migration archive

Deletes a previous migration archive. Migration archives are automatically deleted after seven days.

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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migration_id = 56 # int | The unique identifier of the migration.

    try:
        # Delete an organization migration archive
        api_instance.migrations_delete_archive_for_org(org, migration_id)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_delete_archive_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migration_id** | **int**| The unique identifier of the migration. | 

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

# **migrations_download_archive_for_org**
> migrations_download_archive_for_org(org, migration_id)

Download an organization migration archive

Fetches the URL to a migration archive.

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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migration_id = 56 # int | The unique identifier of the migration.

    try:
        # Download an organization migration archive
        api_instance.migrations_download_archive_for_org(org, migration_id)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_download_archive_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migration_id** | **int**| The unique identifier of the migration. | 

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
**302** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **migrations_get_archive_for_authenticated_user**
> migrations_get_archive_for_authenticated_user(migration_id)

Download a user migration archive

Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:  *   attachments *   bases *   commit\\_comments *   issue\\_comments *   issue\\_events *   issues *   milestones *   organizations *   projects *   protected\\_branches *   pull\\_request\\_reviews *   pull\\_requests *   releases *   repositories *   review\\_comments *   schema *   users  The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com and a `repositories` directory that contains the repository's Git data.

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
    api_instance = openapi_client.MigrationsApi(api_client)
    migration_id = 56 # int | The unique identifier of the migration.

    try:
        # Download a user migration archive
        api_instance.migrations_get_archive_for_authenticated_user(migration_id)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_get_archive_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migration_id** | **int**| The unique identifier of the migration. | 

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
**302** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **migrations_get_status_for_org**
> Migration migrations_get_status_for_org(org, migration_id, exclude=exclude)

Get an organization migration status

Fetches the status of a migration.  The `state` of a migration can be one of the following values:  *   `pending`, which means the migration hasn't started yet. *   `exporting`, which means the migration is in progress. *   `exported`, which means the migration finished successfully. *   `failed`, which means the migration failed.

### Example


```python
import openapi_client
from openapi_client.models.migration import Migration
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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migration_id = 56 # int | The unique identifier of the migration.
    exclude = ['exclude_example'] # List[str] | Exclude attributes from the API response to improve performance (optional)

    try:
        # Get an organization migration status
        api_response = api_instance.migrations_get_status_for_org(org, migration_id, exclude=exclude)
        print("The response of MigrationsApi->migrations_get_status_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_get_status_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migration_id** | **int**| The unique identifier of the migration. | 
 **exclude** | [**List[str]**](str.md)| Exclude attributes from the API response to improve performance | [optional] 

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | *   &#x60;pending&#x60;, which means the migration hasn&#39;t started yet. *   &#x60;exporting&#x60;, which means the migration is in progress. *   &#x60;exported&#x60;, which means the migration finished successfully. *   &#x60;failed&#x60;, which means the migration failed. |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **migrations_list_for_authenticated_user**
> List[Migration] migrations_list_for_authenticated_user(per_page=per_page, page=page)

List user migrations

Lists all migrations a user has started.

### Example


```python
import openapi_client
from openapi_client.models.migration import Migration
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
    api_instance = openapi_client.MigrationsApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List user migrations
        api_response = api_instance.migrations_list_for_authenticated_user(per_page=per_page, page=page)
        print("The response of MigrationsApi->migrations_list_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_list_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Migration]**](Migration.md)

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

# **migrations_list_for_org**
> List[Migration] migrations_list_for_org(org, per_page=per_page, page=page, exclude=exclude)

List organization migrations

Lists the most recent migrations, including both exports (which can be started through the REST API) and imports (which cannot be started using the REST API).  A list of `repositories` is only returned for export migrations.

### Example


```python
import openapi_client
from openapi_client.models.migration import Migration
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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    exclude = ['exclude_example'] # List[str] | Exclude attributes from the API response to improve performance (optional)

    try:
        # List organization migrations
        api_response = api_instance.migrations_list_for_org(org, per_page=per_page, page=page, exclude=exclude)
        print("The response of MigrationsApi->migrations_list_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_list_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **exclude** | [**List[str]**](str.md)| Exclude attributes from the API response to improve performance | [optional] 

### Return type

[**List[Migration]**](Migration.md)

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

# **migrations_list_repos_for_authenticated_user**
> List[MinimalRepository] migrations_list_repos_for_authenticated_user(migration_id, per_page=per_page, page=page)

List repositories for a user migration

Lists all the repositories for this user migration.

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
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
    api_instance = openapi_client.MigrationsApi(api_client)
    migration_id = 56 # int | The unique identifier of the migration.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repositories for a user migration
        api_response = api_instance.migrations_list_repos_for_authenticated_user(migration_id, per_page=per_page, page=page)
        print("The response of MigrationsApi->migrations_list_repos_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_list_repos_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migration_id** | **int**| The unique identifier of the migration. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

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

# **migrations_list_repos_for_org**
> List[MinimalRepository] migrations_list_repos_for_org(org, migration_id, per_page=per_page, page=page)

List repositories in an organization migration

List all the repositories for this organization migration.

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migration_id = 56 # int | The unique identifier of the migration.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repositories in an organization migration
        api_response = api_instance.migrations_list_repos_for_org(org, migration_id, per_page=per_page, page=page)
        print("The response of MigrationsApi->migrations_list_repos_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_list_repos_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migration_id** | **int**| The unique identifier of the migration. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

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

# **migrations_start_for_authenticated_user**
> Migration migrations_start_for_authenticated_user(migrations_start_for_authenticated_user_request)

Start a user migration

Initiates the generation of a user migration archive.

### Example


```python
import openapi_client
from openapi_client.models.migration import Migration
from openapi_client.models.migrations_start_for_authenticated_user_request import MigrationsStartForAuthenticatedUserRequest
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
    api_instance = openapi_client.MigrationsApi(api_client)
    migrations_start_for_authenticated_user_request = {"lock_repositories":true,"repositories":["octocat/Hello-World"]} # MigrationsStartForAuthenticatedUserRequest | 

    try:
        # Start a user migration
        api_response = api_instance.migrations_start_for_authenticated_user(migrations_start_for_authenticated_user_request)
        print("The response of MigrationsApi->migrations_start_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_start_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrations_start_for_authenticated_user_request** | [**MigrationsStartForAuthenticatedUserRequest**](MigrationsStartForAuthenticatedUserRequest.md)|  | 

### Return type

[**Migration**](Migration.md)

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
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **migrations_start_for_org**
> Migration migrations_start_for_org(org, migrations_start_for_org_request)

Start an organization migration

Initiates the generation of a migration archive.

### Example


```python
import openapi_client
from openapi_client.models.migration import Migration
from openapi_client.models.migrations_start_for_org_request import MigrationsStartForOrgRequest
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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migrations_start_for_org_request = {"lock_repositories":true,"repositories":["github/Hello-World"]} # MigrationsStartForOrgRequest | 

    try:
        # Start an organization migration
        api_response = api_instance.migrations_start_for_org(org, migrations_start_for_org_request)
        print("The response of MigrationsApi->migrations_start_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_start_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migrations_start_for_org_request** | [**MigrationsStartForOrgRequest**](MigrationsStartForOrgRequest.md)|  | 

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **migrations_unlock_repo_for_org**
> migrations_unlock_repo_for_org(org, migration_id, repo_name)

Unlock an organization repository

Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://docs.github.com/enterprise-server@3.4/rest/repos/repos#delete-a-repository) when the migration is complete and you no longer need the source data.

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
    api_instance = openapi_client.MigrationsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    migration_id = 56 # int | The unique identifier of the migration.
    repo_name = 'repo_name_example' # str | repo_name parameter

    try:
        # Unlock an organization repository
        api_instance.migrations_unlock_repo_for_org(org, migration_id, repo_name)
    except Exception as e:
        print("Exception when calling MigrationsApi->migrations_unlock_repo_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **migration_id** | **int**| The unique identifier of the migration. | 
 **repo_name** | **str**| repo_name parameter | 

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

