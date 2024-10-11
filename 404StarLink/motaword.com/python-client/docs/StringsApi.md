# openapi_client.StringsApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clear_translation_cache**](StringsApi.md#clear_translation_cache) | **DELETE** /continuous_projects/{projectId}/strings/cached | Clear translation cache
[**get_continuous_project_file_strings**](StringsApi.md#get_continuous_project_file_strings) | **GET** /continuous_projects/{projectId}/documents/{documentId}/strings | View strings their translations in a continuous document
[**get_continuous_project_strings**](StringsApi.md#get_continuous_project_strings) | **GET** /continuous_projects/{projectId}/strings | View strings and translations in continuous project
[**get_document_translations**](StringsApi.md#get_document_translations) | **GET** /projects/{projectId}/documents/{documentId}/translations | View strings and translations of a document
[**get_document_translations_for_language**](StringsApi.md#get_document_translations_for_language) | **GET** /projects/{projectId}/documents/{documentId}/translations/{language} | View strings and translations of a document for target language
[**get_project_strings**](StringsApi.md#get_project_strings) | **GET** /projects/{projectId}/strings | View project strings and translations
[**get_project_strings_for_language**](StringsApi.md#get_project_strings_for_language) | **GET** /projects/{projectId}/strings/{language} | View strings and translations for target language
[**get_project_translations**](StringsApi.md#get_project_translations) | **GET** /projects/{projectId}/translations | Deprecated. Use /projects/{projectId}/strings instead.
[**get_project_translations_for_language**](StringsApi.md#get_project_translations_for_language) | **GET** /projects/{projectId}/translations/{language} | Deprecated. use /projects/{projectId}/strings/{language} instead.
[**get_strings**](StringsApi.md#get_strings) | **GET** /strings | View account strings (translation memory)
[**get_translation_cache**](StringsApi.md#get_translation_cache) | **GET** /continuous_projects/{projectId}/strings/cached | View cached strings translations in continuous project
[**package_project_translation_memory**](StringsApi.md#package_project_translation_memory) | **POST** /projects/{projectId}/strings/package | Download project translation memory
[**package_project_translation_memory_for_language**](StringsApi.md#package_project_translation_memory_for_language) | **POST** /projects/{projectId}/strings/{languageCode}/package | Download language-specific project translation memory
[**package_project_translation_memory_for_language_status**](StringsApi.md#package_project_translation_memory_for_language_status) | **GET** /projects/{projectId}/strings/{languageCode}/package/status | Check language-specific translation memory packaging status
[**package_project_translation_memory_status**](StringsApi.md#package_project_translation_memory_status) | **GET** /projects/{projectId}/strings/package/status | Check translation memory packaging status
[**package_user_translation_memory**](StringsApi.md#package_user_translation_memory) | **POST** /strings/{languageCode}/package | Download account translation memory
[**package_user_translation_memory_for_language_status**](StringsApi.md#package_user_translation_memory_for_language_status) | **GET** /strings/{languageCode}/package/status | Check account translation memory packaging status
[**post_continuous_project_file_strings**](StringsApi.md#post_continuous_project_file_strings) | **POST** /continuous_projects/{projectId}/documents/strings | Get a list of strings and its translations in the project.
[**recache_translations**](StringsApi.md#recache_translations) | **POST** /continuous_projects/{projectId}/strings/recache-tms | Recache translations
[**update_translation_memory_unit**](StringsApi.md#update_translation_memory_unit) | **PUT** /strings | Update string translation


# **clear_translation_cache**
> OperationStatus clear_translation_cache(project_id, locale=locale, file_id=file_id)

Clear translation cache

Clear/delete continuous project translation cache.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    locale = 'locale_example' # str | Locale (optional)
    file_id = 56 # int | Continuous Project File ID (optional)

    try:
        # Clear translation cache
        api_response = api_instance.clear_translation_cache(project_id, locale=locale, file_id=file_id)
        print("The response of StringsApi->clear_translation_cache:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->clear_translation_cache: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **locale** | **str**| Locale | [optional] 
 **file_id** | **int**| Continuous Project File ID | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_file_strings**
> StringList get_continuous_project_file_strings(project_id, document_id)

View strings their translations in a continuous document

View the strings from a document and their translations in your continuous translation project, for all target languages. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID/Name

    try:
        # View strings their translations in a continuous document
        api_response = api_instance.get_continuous_project_file_strings(project_id, document_id)
        print("The response of StringsApi->get_continuous_project_file_strings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_continuous_project_file_strings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID/Name | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_strings**
> StringList get_continuous_project_strings(project_id)

View strings and translations in continuous project

View the strings and their translations in your continuous translation project, for all target languages. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # View strings and translations in continuous project
        api_response = api_instance.get_continuous_project_strings(project_id)
        print("The response of StringsApi->get_continuous_project_strings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_continuous_project_strings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_translations**
> StringList get_document_translations(project_id, document_id)

View strings and translations of a document

View the strings and their translations in your translation project for the specified source document. The list of translations is live if your project is not completed yet. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID

    try:
        # View strings and translations of a document
        api_response = api_instance.get_document_translations(project_id, document_id)
        print("The response of StringsApi->get_document_translations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_document_translations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_translations_for_language**
> StringList get_document_translations_for_language(project_id, document_id, language)

View strings and translations of a document for target language

View the strings and their translations in the given target language for the specified source document. The list of translations is live if your project is not completed yet. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    document_id = 56 # int | Document ID
    language = 'language_example' # str | Target language code.

    try:
        # View strings and translations of a document for target language
        api_response = api_instance.get_document_translations_for_language(project_id, document_id, language)
        print("The response of StringsApi->get_document_translations_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_document_translations_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **document_id** | **int**| Document ID | 
 **language** | **str**| Target language code. | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_strings**
> StringList get_project_strings(project_id)

View project strings and translations

View the strings and their translations in your translation project, for all target languages. The list of translations is live if your project is not completed yet. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # View project strings and translations
        api_response = api_instance.get_project_strings(project_id)
        print("The response of StringsApi->get_project_strings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_project_strings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_strings_for_language**
> StringList get_project_strings_for_language(project_id, language)

View strings and translations for target language

View the strings and their translations in your translation project for the specified target language. The list of translations is live if your project is not completed yet. If you need the translated version of your source document/file, then you need to use package and download endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    language = 'language_example' # str | Target language code

    try:
        # View strings and translations for target language
        api_response = api_instance.get_project_strings_for_language(project_id, language)
        print("The response of StringsApi->get_project_strings_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_project_strings_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **language** | **str**| Target language code | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_translations**
> StringList get_project_translations(project_id)

Deprecated. Use /projects/{projectId}/strings instead.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # Deprecated. Use /projects/{projectId}/strings instead.
        api_response = api_instance.get_project_translations(project_id)
        print("The response of StringsApi->get_project_translations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_project_translations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_translations_for_language**
> StringList get_project_translations_for_language(project_id, language)

Deprecated. use /projects/{projectId}/strings/{language} instead.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    language = 'language_example' # str | Target language code

    try:
        # Deprecated. use /projects/{projectId}/strings/{language} instead.
        api_response = api_instance.get_project_translations_for_language(project_id, language)
        print("The response of StringsApi->get_project_translations_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_project_translations_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **language** | **str**| Target language code | 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_strings**
> ClientStrings get_strings(source_language=source_language, page=page)

View account strings (translation memory)

Get a list of all strings and their translations under your account, from all projects. This is your MotaWord translation memory. If you have the related permission, this endpoint will also return strings from your company account.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.client_strings import ClientStrings
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
    api_instance = openapi_client.StringsApi(api_client)
    source_language = 'source_language_example' # str | Source Language Code (optional)
    page = 0 # int | Requested page (optional) (default to 0)

    try:
        # View account strings (translation memory)
        api_response = api_instance.get_strings(source_language=source_language, page=page)
        print("The response of StringsApi->get_strings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_strings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source_language** | **str**| Source Language Code | [optional] 
 **page** | **int**| Requested page | [optional] [default to 0]

### Return type

[**ClientStrings**](ClientStrings.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of strings in JSON |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_translation_cache**
> ContinuousProjectCache get_translation_cache(project_id, flatten=flatten)

View cached strings translations in continuous project

MotaWord caches your account intensively (and in a smart way) in real-time translation environments. This endpoint will return the currently cached strings and translations in your continuous translation project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_cache import ContinuousProjectCache
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    flatten = True # bool | Flatten cache results and ignore document keys (optional)

    try:
        # View cached strings translations in continuous project
        api_response = api_instance.get_translation_cache(project_id, flatten=flatten)
        print("The response of StringsApi->get_translation_cache:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->get_translation_cache: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **flatten** | **bool**| Flatten cache results and ignore document keys | [optional] 

### Return type

[**ContinuousProjectCache**](ContinuousProjectCache.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_project_translation_memory**
> AsyncOperationStatus package_project_translation_memory(project_id, var_async=var_async, format=format)

Download project translation memory

Package and download project translation memory in TMX format

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    var_async = 0 # int | If you want to package and download the translation memory synchronously, mark this parameter as '0'. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. (optional) (default to 0)
    format = 'tmx' # str | Translation Memory file format (optional) (default to 'tmx')

    try:
        # Download project translation memory
        api_response = api_instance.package_project_translation_memory(project_id, var_async=var_async, format=format)
        print("The response of StringsApi->package_project_translation_memory:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_project_translation_memory: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **var_async** | **int**| If you want to package and download the translation memory synchronously, mark this parameter as &#39;0&#39;. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. | [optional] [default to 0]
 **format** | **str**| Translation Memory file format | [optional] [default to &#39;tmx&#39;]

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response in TMX or async request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_project_translation_memory_for_language**
> AsyncOperationStatus package_project_translation_memory_for_language(project_id, language_code, var_async=var_async, format=format)

Download language-specific project translation memory

Package and download project translation memory in TMX format for a specific target language.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    language_code = 'language_code_example' # str | Language Code
    var_async = 0 # int | If you want to package and download the translation memory synchronously, mark this parameter as '0'. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. (optional) (default to 0)
    format = 'tmx' # str | Translation Memory file format (optional) (default to 'tmx')

    try:
        # Download language-specific project translation memory
        api_response = api_instance.package_project_translation_memory_for_language(project_id, language_code, var_async=var_async, format=format)
        print("The response of StringsApi->package_project_translation_memory_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_project_translation_memory_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **language_code** | **str**| Language Code | 
 **var_async** | **int**| If you want to package and download the translation memory synchronously, mark this parameter as &#39;0&#39;. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. | [optional] [default to 0]
 **format** | **str**| Translation Memory file format | [optional] [default to &#39;tmx&#39;]

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response in TMX or async request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_project_translation_memory_for_language_status**
> AsyncOperationStatus package_project_translation_memory_for_language_status(project_id, language_code, async_request_key)

Check language-specific translation memory packaging status

Check translation memory packaging status for async packaging requests, using the key returned from strings/package call.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    language_code = 'language_code_example' # str | Language Code
    async_request_key = 'async_request_key_example' # str | Async operation key

    try:
        # Check language-specific translation memory packaging status
        api_response = api_instance.package_project_translation_memory_for_language_status(project_id, language_code, async_request_key)
        print("The response of StringsApi->package_project_translation_memory_for_language_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_project_translation_memory_for_language_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **language_code** | **str**| Language Code | 
 **async_request_key** | **str**| Async operation key | 

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Async operation status. Use the key to query status of this operation. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_project_translation_memory_status**
> AsyncOperationStatus package_project_translation_memory_status(project_id, async_request_key)

Check translation memory packaging status

Check translation memory packaging status for async packaging requests, using the key returned from strings/package call.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    async_request_key = 'async_request_key_example' # str | Async operation key

    try:
        # Check translation memory packaging status
        api_response = api_instance.package_project_translation_memory_status(project_id, async_request_key)
        print("The response of StringsApi->package_project_translation_memory_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_project_translation_memory_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **async_request_key** | **str**| Async operation key | 

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Async operation status. Use the key to query status of this operation. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_user_translation_memory**
> AsyncOperationStatus package_user_translation_memory(language_code, var_async=var_async, email=email)

Download account translation memory

Package and download account translation memory in TMX format. If you have the related permission, this will also download your company translation memory.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    language_code = 'language_code_example' # str | Source Language Code
    var_async = 0 # int | If you want to package and download the translation memory synchronously, mark this parameter as '0'. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. (optional) (default to 0)
    email = 1 # int | If you don't need us to email the TMX, set this to '0'. Default is 1. (optional) (default to 1)

    try:
        # Download account translation memory
        api_response = api_instance.package_user_translation_memory(language_code, var_async=var_async, email=email)
        print("The response of StringsApi->package_user_translation_memory:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_user_translation_memory: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language_code** | **str**| Source Language Code | 
 **var_async** | **int**| If you want to package and download the translation memory synchronously, mark this parameter as &#39;0&#39;. It will package the translation memory and then return the packaged file in the response, identical to async/download call after an asynchronous /package call. | [optional] [default to 0]
 **email** | **int**| If you don&#39;t need us to email the TMX, set this to &#39;0&#39;. Default is 1. | [optional] [default to 1]

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response in TMX or async request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_user_translation_memory_for_language_status**
> AsyncOperationStatus package_user_translation_memory_for_language_status(language_code, async_request_key)

Check account translation memory packaging status

Check translation memory packaging status for async packaging requests, using the key returned from strings/package call.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.async_operation_status import AsyncOperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    language_code = 'language_code_example' # str | Language Code
    async_request_key = 'async_request_key_example' # str | Async operation key

    try:
        # Check account translation memory packaging status
        api_response = api_instance.package_user_translation_memory_for_language_status(language_code, async_request_key)
        print("The response of StringsApi->package_user_translation_memory_for_language_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->package_user_translation_memory_for_language_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language_code** | **str**| Language Code | 
 **async_request_key** | **str**| Async operation key | 

### Return type

[**AsyncOperationStatus**](AsyncOperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Async operation status. Use the key to query status of this operation. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_continuous_project_file_strings**
> StringList post_continuous_project_file_strings(project_id, continuous_project_document_strings_body=continuous_project_document_strings_body)

Get a list of strings and its translations in the project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_document_strings_body import ContinuousProjectDocumentStringsBody
from openapi_client.models.string_list import StringList
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    continuous_project_document_strings_body = openapi_client.ContinuousProjectDocumentStringsBody() # ContinuousProjectDocumentStringsBody |  (optional)

    try:
        # Get a list of strings and its translations in the project.
        api_response = api_instance.post_continuous_project_file_strings(project_id, continuous_project_document_strings_body=continuous_project_document_strings_body)
        print("The response of StringsApi->post_continuous_project_file_strings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->post_continuous_project_file_strings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **continuous_project_document_strings_body** | [**ContinuousProjectDocumentStringsBody**](ContinuousProjectDocumentStringsBody.md)|  | [optional] 

### Return type

[**StringList**](StringList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for strings and their translations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recache_translations**
> OperationStatus recache_translations(project_id, locale=locale, file_id=file_id)

Recache translations

Recache translations for the continuous project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
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
    api_instance = openapi_client.StringsApi(api_client)
    project_id = 56 # int | Project ID
    locale = 'locale_example' # str | Locale (optional)
    file_id = 56 # int | Continuous Project File ID (optional)

    try:
        # Recache translations
        api_response = api_instance.recache_translations(project_id, locale=locale, file_id=file_id)
        print("The response of StringsApi->recache_translations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->recache_translations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **locale** | **str**| Locale | [optional] 
 **file_id** | **int**| Continuous Project File ID | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_translation_memory_unit**
> OperationStatus update_translation_memory_unit(translation_memory_unit=translation_memory_unit)

Update string translation

Update the translation of a string from your account strings/translation memory.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.translation_memory_unit import TranslationMemoryUnit
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
    api_instance = openapi_client.StringsApi(api_client)
    translation_memory_unit = openapi_client.TranslationMemoryUnit() # TranslationMemoryUnit |  (optional)

    try:
        # Update string translation
        api_response = api_instance.update_translation_memory_unit(translation_memory_unit=translation_memory_unit)
        print("The response of StringsApi->update_translation_memory_unit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StringsApi->update_translation_memory_unit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translation_memory_unit** | [**TranslationMemoryUnit**](TranslationMemoryUnit.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation updated by adding new translation memory unit |  -  |
**400** | Corporate id, source language, target language, source string or target string is not provided |  -  |
**404** | Source language or target language is not found |  -  |
**500** | Something went wrong and translation unit is not updated |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

