# openapi_client.ContinuousProjectApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_document**](ContinuousProjectApi.md#add_document) | **POST** /continuous_projects/{projectId}/documents | Add a new document to your continuous project
[**collect_analytics**](ContinuousProjectApi.md#collect_analytics) | **POST** /continuous_projects/{id}/collect-analytics | Save/collect analytics data from Active widget
[**complete**](ContinuousProjectApi.md#complete) | **POST** /continuous_projects/{id}/complete | Complete continuous project
[**complete_continuous_document**](ContinuousProjectApi.md#complete_continuous_document) | **POST** /continuous_projects/{id}/documents/{documentId}/complete | Complete a continuous project document
[**complete_language**](ContinuousProjectApi.md#complete_language) | **POST** /continuous_projects/{id}/languages/{targetLanguage}/complete | Complete continuous project language
[**create_active_widget**](ContinuousProjectApi.md#create_active_widget) | **POST** /continuous_projects/{projectId}/widgets | Create a new Active widget
[**create_continuous_project**](ContinuousProjectApi.md#create_continuous_project) | **POST** /continuous_projects | Create a continuous project
[**create_subscription**](ContinuousProjectApi.md#create_subscription) | **POST** /continuous_projects/{id}/subscription | Create subscription for continuous project
[**delete_active_widget**](ContinuousProjectApi.md#delete_active_widget) | **DELETE** /continuous_projects/{projectId}/widgets/{widgetId} | Delete a single widget for this Active project
[**delete_continuous_project**](ContinuousProjectApi.md#delete_continuous_project) | **DELETE** /continuous_projects/{id} | Delete a continuous project
[**delete_subscription**](ContinuousProjectApi.md#delete_subscription) | **DELETE** /continuous_projects/{id}/subscription | Delete subscription for continuous project
[**get_active_widget**](ContinuousProjectApi.md#get_active_widget) | **GET** /continuous_projects/{projectId}/widgets/{widgetId} | View an Active widget
[**get_active_widgets**](ContinuousProjectApi.md#get_active_widgets) | **GET** /continuous_projects/{projectId}/widgets | View Active widgets
[**get_analytics_token**](ContinuousProjectApi.md#get_analytics_token) | **GET** /continuous_projects/{id}/analytics-token | Get JWT token to be used in analytics dashboards
[**get_continuous_project**](ContinuousProjectApi.md#get_continuous_project) | **GET** /continuous_projects/{id} | View a continuous project
[**get_continuous_project_document**](ContinuousProjectApi.md#get_continuous_project_document) | **GET** /continuous_projects/{projectId}/documents/{documentId} | View a continuous document
[**get_continuous_project_document_progress**](ContinuousProjectApi.md#get_continuous_project_document_progress) | **GET** /continuous_projects/{projectId}/documents/{documentId}/progress | Monitor progress of a continuous document
[**get_continuous_project_documents**](ContinuousProjectApi.md#get_continuous_project_documents) | **GET** /continuous_projects/{projectId}/documents | View continuous documents
[**get_continuous_project_invoices**](ContinuousProjectApi.md#get_continuous_project_invoices) | **GET** /continuous_projects/{projectId}/invoices | Invoices of a continuous project
[**get_continuous_project_progress**](ContinuousProjectApi.md#get_continuous_project_progress) | **GET** /continuous_projects/{projectId}/progress | Monitor progress and status of a continous project
[**get_continuous_projects**](ContinuousProjectApi.md#get_continuous_projects) | **GET** /continuous_projects | View continuous projects
[**get_quote_for_document**](ContinuousProjectApi.md#get_quote_for_document) | **POST** /continuous_projects/{id}/documents/{documentId}/quote | Get a quote for a continuous project document
[**get_quote_for_documents**](ContinuousProjectApi.md#get_quote_for_documents) | **POST** /continuous_projects/{id}/documents/quote | Get quote for documents
[**get_quote_for_language**](ContinuousProjectApi.md#get_quote_for_language) | **POST** /continuous_projects/{id}/languages/{targetLanguage}/quote | Get quote for language
[**get_quote_for_languages**](ContinuousProjectApi.md#get_quote_for_languages) | **POST** /continuous_projects/{id}/languages/quote | Get quote for languages
[**get_subscription**](ContinuousProjectApi.md#get_subscription) | **GET** /continuous_projects/{id}/subscription | Get subscription for continuous project
[**post_continuous_project_document_progress**](ContinuousProjectApi.md#post_continuous_project_document_progress) | **POST** /continuous_projects/{projectId}/documents/progress | Get continuous project document progress for multiple IDs
[**reset_active_widget_token**](ContinuousProjectApi.md#reset_active_widget_token) | **POST** /continuous_projects/{projectId}/widgets/{widgetId}/reset-token | Reset Active widget token
[**translate**](ContinuousProjectApi.md#translate) | **POST** /continuous_projects/{id}/translate/{targetLanguage} | Instantly translate your content
[**update_active_widget**](ContinuousProjectApi.md#update_active_widget) | **POST** /continuous_projects/{projectId}/widgets/{widgetId} | Update Active widget settings.
[**update_continuous_project**](ContinuousProjectApi.md#update_continuous_project) | **POST** /continuous_projects/{id} | Update a continuous project
[**update_document**](ContinuousProjectApi.md#update_document) | **POST** /continuous_projects/{projectId}/documents/{documentId} | Update the document
[**update_subscription**](ContinuousProjectApi.md#update_subscription) | **PUT** /continuous_projects/{id}/subscription | Update subscription for continuous project
[**update_subscription_payment_method**](ContinuousProjectApi.md#update_subscription_payment_method) | **PUT** /continuous_projects/{id}/subscription/payment | Update subscription payment method for continuous project


# **add_document**
> ContinuousProjectDocument add_document(project_id, add_or_update_document_request=add_or_update_document_request)

Add a new document to your continuous project

Add a new document to your continuous project. If the name already exists, it will update the existing document. In most scenarios, this operation will also trigger auto-translation of your document, via MT and/or TM.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.add_or_update_document_request import AddOrUpdateDocumentRequest
from openapi_client.models.continuous_project_document import ContinuousProjectDocument
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    add_or_update_document_request = openapi_client.AddOrUpdateDocumentRequest() # AddOrUpdateDocumentRequest |  (optional)

    try:
        # Add a new document to your continuous project
        api_response = api_instance.add_document(project_id, add_or_update_document_request=add_or_update_document_request)
        print("The response of ContinuousProjectApi->add_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->add_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **add_or_update_document_request** | [**AddOrUpdateDocumentRequest**](AddOrUpdateDocumentRequest.md)|  | [optional] 

### Return type

[**ContinuousProjectDocument**](ContinuousProjectDocument.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly added continuous project document object. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collect_analytics**
> OperationStatus collect_analytics(id, analytics_collection=analytics_collection)

Save/collect analytics data from Active widget

Save/collect analytics data from Active widget

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.analytics_collection import AnalyticsCollection
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    analytics_collection = openapi_client.AnalyticsCollection() # AnalyticsCollection |  (optional)

    try:
        # Save/collect analytics data from Active widget
        api_response = api_instance.collect_analytics(id, analytics_collection=analytics_collection)
        print("The response of ContinuousProjectApi->collect_analytics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->collect_analytics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **analytics_collection** | [**AnalyticsCollection**](AnalyticsCollection.md)|  | [optional] 

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
**200** | Analytics data collection result |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **complete**
> OperationStatus complete(id)

Complete continuous project

Complete continuous project

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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID

    try:
        # Complete continuous project
        api_response = api_instance.complete(id)
        print("The response of ContinuousProjectApi->complete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->complete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 

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
**200** | Operation status |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **complete_continuous_document**
> OperationStatus complete_continuous_document(id, document_id)

Complete a continuous project document

Complete a continuous project document. Per your project settings, a continuous project document can be target language-specific or project-wide for all target languages of the project.

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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    document_id = 56 # int | Document ID

    try:
        # Complete a continuous project document
        api_response = api_instance.complete_continuous_document(id, document_id)
        print("The response of ContinuousProjectApi->complete_continuous_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->complete_continuous_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **document_id** | **int**| Document ID | 

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
**200** | Operation status |  -  |
**404** | ProjectNotFound FileNotFound DocumentNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **complete_language**
> OperationStatus complete_language(id, target_language)

Complete continuous project language

Complete continuous project language

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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    target_language = 'target_language_example' # str | Target language that you want to complete

    try:
        # Complete continuous project language
        api_response = api_instance.complete_language(id, target_language)
        print("The response of ContinuousProjectApi->complete_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->complete_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **target_language** | **str**| Target language that you want to complete | 

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
**200** | Operation status |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_active_widget**
> ActiveWidget create_active_widget(project_id, active_widget=active_widget)

Create a new Active widget

Create a new widget for your Active project to be used in your website. Most website-specific configuration is provided via widgets. This does not create a new Active project, just a separate widget.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.active_widget import ActiveWidget
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    active_widget = openapi_client.ActiveWidget() # ActiveWidget |  (optional)

    try:
        # Create a new Active widget
        api_response = api_instance.create_active_widget(project_id, active_widget=active_widget)
        print("The response of ContinuousProjectApi->create_active_widget:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->create_active_widget: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **active_widget** | [**ActiveWidget**](ActiveWidget.md)|  | [optional] 

### Return type

[**ActiveWidget**](ActiveWidget.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated widget details |  -  |
**404** | ProjectNotFound | ActiveWidgetNotFound | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_continuous_project**
> ContinuousProject create_continuous_project(continuous_project=continuous_project)

Create a continuous project

Create a new continuous project for your software, website, CI/CD translation needs.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project import ContinuousProject
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    continuous_project = openapi_client.ContinuousProject() # ContinuousProject |  (optional)

    try:
        # Create a continuous project
        api_response = api_instance.create_continuous_project(continuous_project=continuous_project)
        print("The response of ContinuousProjectApi->create_continuous_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->create_continuous_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuous_project** | [**ContinuousProject**](ContinuousProject.md)|  | [optional] 

### Return type

[**ContinuousProject**](ContinuousProject.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created continuous project |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_subscription**
> Subscription create_subscription(id, subscription)

Create subscription for continuous project

Create subscription for continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.subscription import Subscription
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    subscription = openapi_client.Subscription() # Subscription | 

    try:
        # Create subscription for continuous project
        api_response = api_instance.create_subscription(id, subscription)
        print("The response of ContinuousProjectApi->create_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->create_subscription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **subscription** | [**Subscription**](Subscription.md)|  | 

### Return type

[**Subscription**](Subscription.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created continuous project subscription |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_active_widget**
> OperationStatus delete_active_widget(project_id, widget_id)

Delete a single widget for this Active project

Delete a single widget for this Active project

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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID
    widget_id = 56 # int | Active widget ID belonging to this Continuous Project

    try:
        # Delete a single widget for this Active project
        api_response = api_instance.delete_active_widget(project_id, widget_id)
        print("The response of ContinuousProjectApi->delete_active_widget:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->delete_active_widget: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 
 **widget_id** | **int**| Active widget ID belonging to this Continuous Project | 

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
**200** | Delete operation result |  -  |
**404** | ProjectNotFound | ActiveWidgetNotFound | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_continuous_project**
> OperationStatus delete_continuous_project(id)

Delete a continuous project

Delete an existing continuous project. Your project will be cancelled, and you will still be charged for the amount of translations we have done for you so far.

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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID

    try:
        # Delete a continuous project
        api_response = api_instance.delete_continuous_project(id)
        print("The response of ContinuousProjectApi->delete_continuous_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->delete_continuous_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 

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
**200** | Continuous project deleted successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_subscription**
> Subscription delete_subscription(id)

Delete subscription for continuous project

Delete subscription for continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.subscription import Subscription
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID

    try:
        # Delete subscription for continuous project
        api_response = api_instance.delete_subscription(id)
        print("The response of ContinuousProjectApi->delete_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->delete_subscription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 

### Return type

[**Subscription**](Subscription.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete continuous project subscription |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_active_widget**
> ActiveWidget get_active_widget(project_id, widget_id)

View an Active widget

View the details of an Active widget to be used in your website. Most website-specific configuration is provided via widgets.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.active_widget import ActiveWidget
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID
    widget_id = 56 # int | Active widget ID belonging to this Continuous Project

    try:
        # View an Active widget
        api_response = api_instance.get_active_widget(project_id, widget_id)
        print("The response of ContinuousProjectApi->get_active_widget:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_active_widget: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 
 **widget_id** | **int**| Active widget ID belonging to this Continuous Project | 

### Return type

[**ActiveWidget**](ActiveWidget.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Active widget details |  -  |
**404** | ProjectNotFound | ActiveWidgetNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_active_widgets**
> ActiveWidgetList get_active_widgets(project_id)

View Active widgets

View a list of widgets in your Active project to be used in your website. Most website-specific configuration is provided via widgets.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.active_widget_list import ActiveWidgetList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID

    try:
        # View Active widgets
        api_response = api_instance.get_active_widgets(project_id)
        print("The response of ContinuousProjectApi->get_active_widgets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_active_widgets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 

### Return type

[**ActiveWidgetList**](ActiveWidgetList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of widgets |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_analytics_token**
> AnalyticsToken get_analytics_token(id)

Get JWT token to be used in analytics dashboards

Get JWT token to be used in analytics dashboards

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.analytics_token import AnalyticsToken
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID

    try:
        # Get JWT token to be used in analytics dashboards
        api_response = api_instance.get_analytics_token(id)
        print("The response of ContinuousProjectApi->get_analytics_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_analytics_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 

### Return type

[**AnalyticsToken**](AnalyticsToken.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | JWT token result |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project**
> ContinuousProject get_continuous_project(id)

View a continuous project

View the details of a continuous project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project import ContinuousProject
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous Project ID

    try:
        # View a continuous project
        api_response = api_instance.get_continuous_project(id)
        print("The response of ContinuousProjectApi->get_continuous_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous Project ID | 

### Return type

[**ContinuousProject**](ContinuousProject.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ContinuousProject model |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_document**
> ContinuousProjectDocument get_continuous_project_document(project_id, document_id)

View a continuous document

View the details of a source document in continuous translation project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_document import ContinuousProjectDocument
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    document_id = 56 # int | Document ID/Name

    try:
        # View a continuous document
        api_response = api_instance.get_continuous_project_document(project_id, document_id)
        print("The response of ContinuousProjectApi->get_continuous_project_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **document_id** | **int**| Document ID/Name | 

### Return type

[**ContinuousProjectDocument**](ContinuousProjectDocument.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Progress information |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_document_progress**
> Progress get_continuous_project_document_progress(project_id, document_id, filter_by_language=filter_by_language)

Monitor progress of a continuous document

Monitor the translation progress of a document in a continuous project in real-time.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.progress import Progress
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    document_id = 56 # int | Document ID/Name
    filter_by_language = 'filter_by_language_example' # str |  (optional)

    try:
        # Monitor progress of a continuous document
        api_response = api_instance.get_continuous_project_document_progress(project_id, document_id, filter_by_language=filter_by_language)
        print("The response of ContinuousProjectApi->get_continuous_project_document_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project_document_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **document_id** | **int**| Document ID/Name | 
 **filter_by_language** | **str**|  | [optional] 

### Return type

[**Progress**](Progress.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Progress information |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_documents**
> ContinuousProjectDocumentList get_continuous_project_documents(project_id, filter_by_language=filter_by_language)

View continuous documents

View the documents under this continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_document_list import ContinuousProjectDocumentList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID
    filter_by_language = 'filter_by_language_example' # str |  (optional)

    try:
        # View continuous documents
        api_response = api_instance.get_continuous_project_documents(project_id, filter_by_language=filter_by_language)
        print("The response of ContinuousProjectApi->get_continuous_project_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 
 **filter_by_language** | **str**|  | [optional] 

### Return type

[**ContinuousProjectDocumentList**](ContinuousProjectDocumentList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of continuous project document models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_invoices**
> ContinuousProjectInvoices get_continuous_project_invoices(project_id)

Invoices of a continuous project

Get real-time access to a continuous project's invoices.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_invoices import ContinuousProjectInvoices
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # Invoices of a continuous project
        api_response = api_instance.get_continuous_project_invoices(project_id)
        print("The response of ContinuousProjectApi->get_continuous_project_invoices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project_invoices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**ContinuousProjectInvoices**](ContinuousProjectInvoices.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invoices List |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_project_progress**
> ContinuousProjectProgress get_continuous_project_progress(project_id, filter_by_language=filter_by_language)

Monitor progress and status of a continous project

Monitor the translation progress of an ongoing continuous project in real-time.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_progress import ContinuousProjectProgress
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Project ID
    filter_by_language = 'filter_by_language_example' # str |  (optional)

    try:
        # Monitor progress and status of a continous project
        api_response = api_instance.get_continuous_project_progress(project_id, filter_by_language=filter_by_language)
        print("The response of ContinuousProjectApi->get_continuous_project_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_project_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **filter_by_language** | **str**|  | [optional] 

### Return type

[**ContinuousProjectProgress**](ContinuousProjectProgress.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Progress information |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_continuous_projects**
> ContinuousProjectsList get_continuous_projects(type=type)

View continuous projects

View a list of continuous projects under your account. Continuous projects are those that are constantly updated, such as a CI/CD project, software project, website translation and such.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_projects_list import ContinuousProjectsList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    type = active # str | Type of continuous project. (optional) (default to active)

    try:
        # View continuous projects
        api_response = api_instance.get_continuous_projects(type=type)
        print("The response of ContinuousProjectApi->get_continuous_projects:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_continuous_projects: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**| Type of continuous project. | [optional] [default to active]

### Return type

[**ContinuousProjectsList**](ContinuousProjectsList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created continuous project |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_for_document**
> ProjectList get_quote_for_document(id, document_id)

Get a quote for a continuous project document

Get a new quote for provided document in continuous project. Per your project settings, a continuous project document can be target language-specific or project-wide for all target languages of the project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_list import ProjectList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    document_id = 56 # int | Document ID

    try:
        # Get a quote for a continuous project document
        api_response = api_instance.get_quote_for_document(id, document_id)
        print("The response of ContinuousProjectApi->get_quote_for_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_quote_for_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **document_id** | **int**| Document ID | 

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created project |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**405** | UnsupportedDocumentFormat UnsupportedStyleGuideFormat UnsupportedGlossaryFormat |  -  |
**406** | UnsupportedLanguage TooManyGlossaries ProjectAlreadyHasGlossary |  -  |
**500** | ProjectInsertFailed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_for_documents**
> ProjectList get_quote_for_documents(id, get_quotes_for_documents_body=get_quotes_for_documents_body)

Get quote for documents

Get a new quote for provided documents in continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.get_quotes_for_documents_body import GetQuotesForDocumentsBody
from openapi_client.models.project_list import ProjectList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    get_quotes_for_documents_body = openapi_client.GetQuotesForDocumentsBody() # GetQuotesForDocumentsBody |  (optional)

    try:
        # Get quote for documents
        api_response = api_instance.get_quote_for_documents(id, get_quotes_for_documents_body=get_quotes_for_documents_body)
        print("The response of ContinuousProjectApi->get_quote_for_documents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_quote_for_documents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **get_quotes_for_documents_body** | [**GetQuotesForDocumentsBody**](GetQuotesForDocumentsBody.md)|  | [optional] 

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created project |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**405** | UnsupportedDocumentFormat UnsupportedStyleGuideFormat UnsupportedGlossaryFormat |  -  |
**406** | UnsupportedLanguage TooManyGlossaries ProjectAlreadyHasGlossary |  -  |
**500** | ProjectInsertFailed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_for_language**
> ProjectList get_quote_for_language(id, target_language)

Get quote for language

Get a new quote for provided target language in continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_list import ProjectList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    target_language = 'target_language_example' # str | Target language that you want to complete

    try:
        # Get quote for language
        api_response = api_instance.get_quote_for_language(id, target_language)
        print("The response of ContinuousProjectApi->get_quote_for_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_quote_for_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **target_language** | **str**| Target language that you want to complete | 

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created project(s) |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**405** | UnsupportedDocumentFormat UnsupportedStyleGuideFormat UnsupportedGlossaryFormat |  -  |
**406** | UnsupportedLanguage TooManyGlossaries ProjectAlreadyHasGlossary |  -  |
**500** | ProjectInsertFailed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_for_languages**
> ProjectList get_quote_for_languages(id, get_quotes_for_languages_body=get_quotes_for_languages_body)

Get quote for languages

Get a new quote for provided target languages in continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.get_quotes_for_languages_body import GetQuotesForLanguagesBody
from openapi_client.models.project_list import ProjectList
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    get_quotes_for_languages_body = openapi_client.GetQuotesForLanguagesBody() # GetQuotesForLanguagesBody |  (optional)

    try:
        # Get quote for languages
        api_response = api_instance.get_quote_for_languages(id, get_quotes_for_languages_body=get_quotes_for_languages_body)
        print("The response of ContinuousProjectApi->get_quote_for_languages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_quote_for_languages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **get_quotes_for_languages_body** | [**GetQuotesForLanguagesBody**](GetQuotesForLanguagesBody.md)|  | [optional] 

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Newly created project |  -  |
**400** | FileTooLarge FileTooSmall FileWasAlreadyUploaded |  -  |
**405** | UnsupportedDocumentFormat UnsupportedStyleGuideFormat UnsupportedGlossaryFormat |  -  |
**406** | UnsupportedLanguage TooManyGlossaries ProjectAlreadyHasGlossary |  -  |
**500** | ProjectInsertFailed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subscription**
> Subscription get_subscription(id)

Get subscription for continuous project

Get subscription for continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.subscription import Subscription
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID

    try:
        # Get subscription for continuous project
        api_response = api_instance.get_subscription(id)
        print("The response of ContinuousProjectApi->get_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->get_subscription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 

### Return type

[**Subscription**](Subscription.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get continuous project subscription |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_continuous_project_document_progress**
> Progress post_continuous_project_document_progress(project_id, continuous_project_document_progress_body=continuous_project_document_progress_body)

Get continuous project document progress for multiple IDs

Get continuous project document progress for multiple IDs

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project_document_progress_body import ContinuousProjectDocumentProgressBody
from openapi_client.models.progress import Progress
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    continuous_project_document_progress_body = openapi_client.ContinuousProjectDocumentProgressBody() # ContinuousProjectDocumentProgressBody |  (optional)

    try:
        # Get continuous project document progress for multiple IDs
        api_response = api_instance.post_continuous_project_document_progress(project_id, continuous_project_document_progress_body=continuous_project_document_progress_body)
        print("The response of ContinuousProjectApi->post_continuous_project_document_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->post_continuous_project_document_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **continuous_project_document_progress_body** | [**ContinuousProjectDocumentProgressBody**](ContinuousProjectDocumentProgressBody.md)|  | [optional] 

### Return type

[**Progress**](Progress.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Progress information |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_active_widget_token**
> ActiveWidget reset_active_widget_token(project_id, widget_id)

Reset Active widget token

Reset the public token used with your Active widget. This token is used when communicating from your environment to MotaWord systems for translation, analytics and meta.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.active_widget import ActiveWidget
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID
    widget_id = 56 # int | Active widget ID belonging to this Continuous Project

    try:
        # Reset Active widget token
        api_response = api_instance.reset_active_widget_token(project_id, widget_id)
        print("The response of ContinuousProjectApi->reset_active_widget_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->reset_active_widget_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 
 **widget_id** | **int**| Active widget ID belonging to this Continuous Project | 

### Return type

[**ActiveWidget**](ActiveWidget.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated widget details |  -  |
**404** | ProjectNotFound | ActiveWidgetNotFound | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **translate**
> InstantTranslationResult translate(id, target_language, instant_translation_request=instant_translation_request)

Instantly translate your content

Instantly translate your content with your existing TM and MT resources. This is the primary endpoint to translate your files and content on the fly, especially in CI/CD environments. This is a complex endpoint that is configured in your Active or Continuous Project dashboards. For instance, you can configure whether to use your TM, or translate missing strings via MT and then post-edit those new translations. There are various scenarios you can establish via a set of configurations.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.instant_translation_request import InstantTranslationRequest
from openapi_client.models.instant_translation_result import InstantTranslationResult
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    target_language = 'target_language_example' # str | Target language that you want to instantly translate your file into.
    instant_translation_request = openapi_client.InstantTranslationRequest() # InstantTranslationRequest |  (optional)

    try:
        # Instantly translate your content
        api_response = api_instance.translate(id, target_language, instant_translation_request=instant_translation_request)
        print("The response of ContinuousProjectApi->translate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->translate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **target_language** | **str**| Target language that you want to instantly translate your file into. | 
 **instant_translation_request** | [**InstantTranslationRequest**](InstantTranslationRequest.md)|  | [optional] 

### Return type

[**InstantTranslationResult**](InstantTranslationResult.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Instant translation result. It may return a list of translated strings, or a list of translated files. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_active_widget**
> ActiveWidget update_active_widget(project_id, widget_id, active_widget=active_widget)

Update Active widget settings.

Update Active widget settings.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.active_widget import ActiveWidget
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous Project ID
    widget_id = 56 # int | Active widget ID belonging to this Continuous Project
    active_widget = openapi_client.ActiveWidget() # ActiveWidget |  (optional)

    try:
        # Update Active widget settings.
        api_response = api_instance.update_active_widget(project_id, widget_id, active_widget=active_widget)
        print("The response of ContinuousProjectApi->update_active_widget:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->update_active_widget: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous Project ID | 
 **widget_id** | **int**| Active widget ID belonging to this Continuous Project | 
 **active_widget** | [**ActiveWidget**](ActiveWidget.md)|  | [optional] 

### Return type

[**ActiveWidget**](ActiveWidget.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated widget details |  -  |
**404** | ProjectNotFound | ActiveWidgetNotFound | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_continuous_project**
> ContinuousProject update_continuous_project(id, continuous_project_update_content=continuous_project_update_content)

Update a continuous project

Update the details and settings of continuous project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.continuous_project import ContinuousProject
from openapi_client.models.continuous_project_update_content import ContinuousProjectUpdateContent
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    continuous_project_update_content = openapi_client.ContinuousProjectUpdateContent() # ContinuousProjectUpdateContent |  (optional)

    try:
        # Update a continuous project
        api_response = api_instance.update_continuous_project(id, continuous_project_update_content=continuous_project_update_content)
        print("The response of ContinuousProjectApi->update_continuous_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->update_continuous_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **continuous_project_update_content** | [**ContinuousProjectUpdateContent**](ContinuousProjectUpdateContent.md)|  | [optional] 

### Return type

[**ContinuousProject**](ContinuousProject.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update continuous project operation status |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_document**
> ContinuousProjectDocument update_document(project_id, document_id, add_or_update_document_request=add_or_update_document_request)

Update the document

Update source document in your continuous project. In most scenarios, this operation will also trigger auto-translation of your document, via MT and/or TM.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.add_or_update_document_request import AddOrUpdateDocumentRequest
from openapi_client.models.continuous_project_document import ContinuousProjectDocument
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    project_id = 56 # int | Continuous project ID
    document_id = 56 # int | Continuous project document ID
    add_or_update_document_request = openapi_client.AddOrUpdateDocumentRequest() # AddOrUpdateDocumentRequest |  (optional)

    try:
        # Update the document
        api_response = api_instance.update_document(project_id, document_id, add_or_update_document_request=add_or_update_document_request)
        print("The response of ContinuousProjectApi->update_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->update_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Continuous project ID | 
 **document_id** | **int**| Continuous project document ID | 
 **add_or_update_document_request** | [**AddOrUpdateDocumentRequest**](AddOrUpdateDocumentRequest.md)|  | [optional] 

### Return type

[**ContinuousProjectDocument**](ContinuousProjectDocument.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated continuous project document object. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_subscription**
> Subscription update_subscription(id, subscription)

Update subscription for continuous project

Update subscription for continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.subscription import Subscription
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    subscription = openapi_client.Subscription() # Subscription | 

    try:
        # Update subscription for continuous project
        api_response = api_instance.update_subscription(id, subscription)
        print("The response of ContinuousProjectApi->update_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->update_subscription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **subscription** | [**Subscription**](Subscription.md)|  | 

### Return type

[**Subscription**](Subscription.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated continuous project subscription |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_subscription_payment_method**
> Subscription update_subscription_payment_method(id, subscription)

Update subscription payment method for continuous project

Update subscription payment method for continuous project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.subscription import Subscription
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
    api_instance = openapi_client.ContinuousProjectApi(api_client)
    id = 56 # int | Continuous project ID
    subscription = openapi_client.Subscription() # Subscription | 

    try:
        # Update subscription payment method for continuous project
        api_response = api_instance.update_subscription_payment_method(id, subscription)
        print("The response of ContinuousProjectApi->update_subscription_payment_method:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContinuousProjectApi->update_subscription_payment_method: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Continuous project ID | 
 **subscription** | [**Subscription**](Subscription.md)|  | 

### Return type

[**Subscription**](Subscription.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated continuous project subscription |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

