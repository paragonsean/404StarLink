# openapi_client.ProjectApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assign_cm**](ProjectApi.md#assign_cm) | **POST** /projects/{id}/assign-cm | Assign a CM to the project
[**cancel_project**](ProjectApi.md#cancel_project) | **POST** /projects/{id}/cancel | Cancel your translation project
[**create_project**](ProjectApi.md#create_project) | **POST** /projects | Create a new project
[**delete_project**](ProjectApi.md#delete_project) | **DELETE** /projects/{id} | Delete your translation project
[**deliver_project**](ProjectApi.md#deliver_project) | **POST** /projects/{id}/deliver | Deliver project
[**download**](ProjectApi.md#download) | **GET** /projects/{id}/download | Download your translated project
[**download_html_invoice**](ProjectApi.md#download_html_invoice) | **GET** /projects/{id}/invoice.html | Download project invoice (HTML)
[**download_language**](ProjectApi.md#download_language) | **GET** /projects/{id}/download/{language} | Download your translated project language
[**download_pdf_invoice**](ProjectApi.md#download_pdf_invoice) | **GET** /projects/{id}/invoice.pdf | Download project invoice (PDF)
[**get_invoice**](ProjectApi.md#get_invoice) | **GET** /projects/{id}/invoice | View project invoice
[**get_progress**](ProjectApi.md#get_progress) | **GET** /projects/{id}/progress | View progress of a project
[**get_project**](ProjectApi.md#get_project) | **GET** /projects/{id} | View a translation project
[**get_project_vendors**](ProjectApi.md#get_project_vendors) | **GET** /projects/{projectId}/vendors | Get a list of vendors.
[**get_projects**](ProjectApi.md#get_projects) | **GET** /projects | View your translation projects
[**get_quote_id_from_internal_id**](ProjectApi.md#get_quote_id_from_internal_id) | **GET** /projects/from-internal-id/{projectId} | Get Quote Id
[**get_vendor_projects**](ProjectApi.md#get_vendor_projects) | **GET** /projects/vendor | List projects as a vendor
[**get_vendor_projects_by_user_id**](ProjectApi.md#get_vendor_projects_by_user_id) | **GET** /{userId}/projects/vendor | Get a list of user/vendor projects
[**launch_project**](ProjectApi.md#launch_project) | **POST** /projects/{id}/launch | Launch your translation project
[**package**](ProjectApi.md#package) | **POST** /projects/{id}/package | Package your translated project
[**package_language**](ProjectApi.md#package_language) | **POST** /projects/{id}/package/{language} | Package your translated project language
[**recreate_project**](ProjectApi.md#recreate_project) | **POST** /projects/{id}/recreate | Recreate your translation project from scratch. This is a risky action, you will lose current translations.
[**send_quote_email**](ProjectApi.md#send_quote_email) | **POST** /projects/{id}/email-quote | Send a quote email
[**submit_project_reports**](ProjectApi.md#submit_project_reports) | **POST** /projects/{id}/reports | Submit feedback report for a project
[**track_package**](ProjectApi.md#track_package) | **GET** /projects/{id}/package/check | Track translation packaging status
[**trigger_callback**](ProjectApi.md#trigger_callback) | **GET** /projects/{id}/callback/{actionType} | Trigger a call to your callback URL related to this project.
[**update_project**](ProjectApi.md#update_project) | **PUT** /projects/{id} | Update project info and settings


# **assign_cm**
> OperationStatus assign_cm(id, cm=cm)

Assign a CM to the project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.cm import CM
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    cm = openapi_client.CM() # CM |  (optional)

    try:
        # Assign a CM to the project
        api_response = api_instance.assign_cm(id, cm=cm)
        print("The response of ProjectApi->assign_cm:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->assign_cm: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **cm** | [**CM**](CM.md)|  | [optional] 

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
**200** | Operation started successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_project**
> OperationStatus cancel_project(id, cancel_project_request=cancel_project_request)

Cancel your translation project

If you haven't launched your translation project yet, we will delete it. If MotaWord already started working on your project, we will cancel the project and refund the volume that we haven't worked on yet.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.cancel_project_request import CancelProjectRequest
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    cancel_project_request = openapi_client.CancelProjectRequest() # CancelProjectRequest |  (optional)

    try:
        # Cancel your translation project
        api_response = api_instance.cancel_project(id, cancel_project_request=cancel_project_request)
        print("The response of ProjectApi->cancel_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->cancel_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **cancel_project_request** | [**CancelProjectRequest**](CancelProjectRequest.md)|  | [optional] 

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
**200** | Project canceled successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project**
> Project create_project(new_project=new_project)

Create a new project

Create a new translation project. Projects are not launched (you are not charged) until you `/launch` the created project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.new_project import NewProject
from openapi_client.models.project import Project
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
    api_instance = openapi_client.ProjectApi(api_client)
    new_project = openapi_client.NewProject() # NewProject |  (optional)

    try:
        # Create a new project
        api_response = api_instance.create_project(new_project=new_project)
        print("The response of ProjectApi->create_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->create_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **new_project** | [**NewProject**](NewProject.md)|  | [optional] 

### Return type

[**Project**](Project.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
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

# **delete_project**
> OperationStatus delete_project(id)

Delete your translation project

If you haven't launched your translation project yet, we will delete it. If MotaWord already started working on your project, we will cancel the project and refund the volume that we haven't worked on yet.

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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Delete your translation project
        api_response = api_instance.delete_project(id)
        print("The response of ProjectApi->delete_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->delete_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

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
**200** | Project canceled successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deliver_project**
> OperationStatus deliver_project(id)

Deliver project

Deliver project to the owner of the project. You can also download your translations in `/package` and `/download` endpoints.

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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Deliver project
        api_response = api_instance.deliver_project(id)
        print("The response of ProjectApi->deliver_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->deliver_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

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
**200** | Operation started successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download**
> bytearray download(id)

Download your translated project

Download the latest translation package. You must have requested a `/package` call beforehand and wait until the packaging status is 'completed'.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Download your translated project
        api_response = api_instance.download(id)
        print("The response of ProjectApi->download:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->download: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

### Return type

**bytearray**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation package streamed. The streamed file is always a ZIP file, except when the API client is configured for Drupal and Wordpress. |  -  |
**402** | ProjectNotLaunchedYet |  -  |
**404** | TranslationPackageNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_html_invoice**
> str download_html_invoice(id)

Download project invoice (HTML)

Download your project invoice as HTML. This is useful when you want to show your users the invoice in a webpage.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Download project invoice (HTML)
        api_response = api_instance.download_html_invoice(id)
        print("The response of ProjectApi->download_html_invoice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->download_html_invoice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

### Return type

**str**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invoice |  -  |
**404** | ProjectNotFound or InvoiceNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_language**
> bytearray download_language(id, language)

Download your translated project language

Download the latest translation package for your target language. You must have requested a `/package` call beforehand and wait until the packaging status is 'completed'.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    language = 'language_example' # str | Language code. You can download the translation of only a specific language.

    try:
        # Download your translated project language
        api_response = api_instance.download_language(id, language)
        print("The response of ProjectApi->download_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->download_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **language** | **str**| Language code. You can download the translation of only a specific language. | 

### Return type

**bytearray**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation package streamed. The streamed file is always a ZIP file, except when the API client is configured for Drupal and Wordpress. |  -  |
**402** | ProjectNotLaunchedYet |  -  |
**404** | TranslationPackageNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_pdf_invoice**
> bytearray download_pdf_invoice(id)

Download project invoice (PDF)

Download your project invoice as PDF. Your invoice may be in \"unpaid\" status, in which case youn can see the payment instructions in the PDF file.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Download project invoice (PDF)
        api_response = api_instance.download_pdf_invoice(id)
        print("The response of ProjectApi->download_pdf_invoice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->download_pdf_invoice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

### Return type

**bytearray**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invoice |  -  |
**404** | ProjectNotFound or InvoiceNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice**
> Invoice get_invoice(id)

View project invoice

View your invoice details for your translation project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.invoice import Invoice
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # View project invoice
        api_response = api_instance.get_invoice(id)
        print("The response of ProjectApi->get_invoice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_invoice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invoice |  -  |
**404** | ProjectNotFound or InvoiceNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_progress**
> Progress get_progress(id, raw=raw)

View progress of a project

Monitor the translation progress of an already launched project in real-time.

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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    raw = False # bool | This will return a more raw progress information for translation and proofreading. For instance, when completed, we will return 100% for both tasks by default, whereas their actual progress may be lower than 100%. (optional) (default to False)

    try:
        # View progress of a project
        api_response = api_instance.get_progress(id, raw=raw)
        print("The response of ProjectApi->get_progress:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_progress: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **raw** | **bool**| This will return a more raw progress information for translation and proofreading. For instance, when completed, we will return 100% for both tasks by default, whereas their actual progress may be lower than 100%. | [optional] [default to False]

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
**402** | ProjectNotLaunchedYet |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project**
> Project get_project(id, var_with=var_with)

View a translation project

View the details of a translation project in your account.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project import Project
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    var_with = ['var_with_example'] # List[str] | Include detailed information. Possible values 'client', 'vendor', 'score' (optional)

    try:
        # View a translation project
        api_response = api_instance.get_project(id, var_with=var_with)
        print("The response of ProjectApi->get_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **var_with** | [**List[str]**](str.md)| Include detailed information. Possible values &#39;client&#39;, &#39;vendor&#39;, &#39;score&#39; | [optional] 

### Return type

[**Project**](Project.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project model |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_vendors**
> UserList get_project_vendors(project_id)

Get a list of vendors.

Get a list of vendors.

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
    api_instance = openapi_client.ProjectApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # Get a list of vendors.
        api_response = api_instance.get_project_vendors(project_id)
        print("The response of ProjectApi->get_project_vendors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_project_vendors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

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
**402** | ProjectNotLaunchedYet |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects**
> ProjectList get_projects(page=page, per_page=per_page, status=status, with_pending=with_pending, with_started=with_started, with_completed=with_completed, order_by=order_by, order_type=order_type, var_with=var_with)

View your translation projects

View the translation projects ordered in your account. If you have the related permission (configured by your account administrator), you can view the projects of your colleagues under the same company account.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.list_order_type import ListOrderType
from openapi_client.models.project_list import ProjectList
from openapi_client.models.project_status import ProjectStatus
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
    api_instance = openapi_client.ProjectApi(api_client)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)
    status = [openapi_client.ProjectStatus()] # List[ProjectStatus] | Filter projects by status. Accepts multiple statuses. Possible values 'pending', 'started', 'completed' (optional)
    with_pending = True # bool | deprecated. use `status[]` param. (optional) (default to True)
    with_started = True # bool | deprecated. use `status[]` param. (optional) (default to True)
    with_completed = True # bool | deprecated. use `status[]` param. (optional) (default to True)
    order_by = id # str |  (optional) (default to id)
    order_type = openapi_client.ListOrderType() # ListOrderType |  (optional)
    var_with = ['var_with_example'] # List[str] | Include detailed information. Possible values 'client', 'vendor' (optional)

    try:
        # View your translation projects
        api_response = api_instance.get_projects(page=page, per_page=per_page, status=status, with_pending=with_pending, with_started=with_started, with_completed=with_completed, order_by=order_by, order_type=order_type, var_with=var_with)
        print("The response of ProjectApi->get_projects:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_projects: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]
 **status** | [**List[ProjectStatus]**](ProjectStatus.md)| Filter projects by status. Accepts multiple statuses. Possible values &#39;pending&#39;, &#39;started&#39;, &#39;completed&#39; | [optional] 
 **with_pending** | **bool**| deprecated. use &#x60;status[]&#x60; param. | [optional] [default to True]
 **with_started** | **bool**| deprecated. use &#x60;status[]&#x60; param. | [optional] [default to True]
 **with_completed** | **bool**| deprecated. use &#x60;status[]&#x60; param. | [optional] [default to True]
 **order_by** | **str**|  | [optional] [default to id]
 **order_type** | [**ListOrderType**](.md)|  | [optional] 
 **var_with** | [**List[str]**](str.md)| Include detailed information. Possible values &#39;client&#39;, &#39;vendor&#39; | [optional] 

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
**200** | Project list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_quote_id_from_internal_id**
> ProjectId get_quote_id_from_internal_id(project_id)

Get Quote Id

Get Quote Id

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_id import ProjectId
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
    api_instance = openapi_client.ProjectApi(api_client)
    project_id = 56 # int | Project ID

    try:
        # Get Quote Id
        api_response = api_instance.get_quote_id_from_internal_id(project_id)
        print("The response of ProjectApi->get_quote_id_from_internal_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_quote_id_from_internal_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 

### Return type

[**ProjectId**](ProjectId.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | QuoteId |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vendor_projects**
> ProjectList get_vendor_projects(joined=joined, completed=completed, page=page, per_page=per_page)

List projects as a vendor

Get a list of projects that are available to you to work on as a vendor. This is not a list of projects that you ordered as a customer.

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
    api_instance = openapi_client.ProjectApi(api_client)
    joined = True # bool | Return only projects that this user has already joined (optional)
    completed = True # bool | Return only projects that have been completed. When `true`, this makes `joined` true as well. (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)

    try:
        # List projects as a vendor
        api_response = api_instance.get_vendor_projects(joined=joined, completed=completed, page=page, per_page=per_page)
        print("The response of ProjectApi->get_vendor_projects:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_vendor_projects: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joined** | **bool**| Return only projects that this user has already joined | [optional] 
 **completed** | **bool**| Return only projects that have been completed. When &#x60;true&#x60;, this makes &#x60;joined&#x60; true as well. | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]

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
**200** | Vendor project list |  -  |
**400** | VendorNotFound - this is not a vendor user account |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vendor_projects_by_user_id**
> ProjectList get_vendor_projects_by_user_id(user_id, joined=joined, completed=completed, page=page, per_page=per_page)

Get a list of user/vendor projects

Get a list of user/vendor projects

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
    api_instance = openapi_client.ProjectApi(api_client)
    user_id = 56 # int | User ID
    joined = True # bool | Return only projects that this user has already joined (optional)
    completed = True # bool | Return only projects that have been completed. When `true`, this makes `joined` true as well. (optional)
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)

    try:
        # Get a list of user/vendor projects
        api_response = api_instance.get_vendor_projects_by_user_id(user_id, joined=joined, completed=completed, page=page, per_page=per_page)
        print("The response of ProjectApi->get_vendor_projects_by_user_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->get_vendor_projects_by_user_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **int**| User ID | 
 **joined** | **bool**| Return only projects that this user has already joined | [optional] 
 **completed** | **bool**| Return only projects that have been completed. When &#x60;true&#x60;, this makes &#x60;joined&#x60; true as well. | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]

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
**200** | Vendor project list |  -  |
**400** | VendorNotFound - this is not a vendor user account |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **launch_project**
> ProjectLaunchResponse launch_project(id, project_payment=project_payment)

Launch your translation project

Launch your translation project so MotaWord can actually start working on your translation.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_launch_response import ProjectLaunchResponse
from openapi_client.models.project_payment import ProjectPayment
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    project_payment = openapi_client.ProjectPayment() # ProjectPayment |  (optional)

    try:
        # Launch your translation project
        api_response = api_instance.launch_project(id, project_payment=project_payment)
        print("The response of ProjectApi->launch_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->launch_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **project_payment** | [**ProjectPayment**](ProjectPayment.md)|  | [optional] 

### Return type

[**ProjectLaunchResponse**](ProjectLaunchResponse.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project launched successfully |  -  |
**400** | MissingPaymentCode MissingCorporateAccount MissingPaymentMethod |  -  |
**401** | CorporateAccountNotAllowedForApiPayment ApiClientMissingPaymentInformation |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package**
> bytearray package(id, var_async=var_async)

Package your translated project

Package the translations in your project, prepare translated documents and make it ready to be downloaded. Once packaged, you can download your translated project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    var_async = 0 # int | If you want to package and download the translation synchronously, mark this parameter as '0'. It will package the translation and then return the packaged file in the response, identical to /download call after an asynchronous /package call. (optional) (default to 0)

    try:
        # Package your translated project
        api_response = api_instance.package(id, var_async=var_async)
        print("The response of ProjectApi->package:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->package: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **var_async** | **int**| If you want to package and download the translation synchronously, mark this parameter as &#39;0&#39;. It will package the translation and then return the packaged file in the response, identical to /download call after an asynchronous /package call. | [optional] [default to 0]

### Return type

**bytearray**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Packaged translation streamed. |  -  |
**402** | ProjectNotLaunchedYet |  -  |
**404** | TranslationPackageNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_language**
> Package package_language(id, language, var_async=var_async)

Package your translated project language

Package the translations in your project for a specific target language, prepare translated documents and make it ready to be downloaded. Once packaged, you can download your translated project in this target language.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.package import Package
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    language = 'language_example' # str | Language code. You can package the translation of only a specific language.
    var_async = 0 # int | If you want to package and download the translation synchronously, mark this parameter as '0'. It will package the translation and then return the packaged file in the response, identical to /download call after an asynchronous /package call. (optional) (default to 0)

    try:
        # Package your translated project language
        api_response = api_instance.package_language(id, language, var_async=var_async)
        print("The response of ProjectApi->package_language:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->package_language: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **language** | **str**| Language code. You can package the translation of only a specific language. | 
 **var_async** | **int**| If you want to package and download the translation synchronously, mark this parameter as &#39;0&#39;. It will package the translation and then return the packaged file in the response, identical to /download call after an asynchronous /package call. | [optional] [default to 0]

### Return type

[**Package**](Package.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Packaging status and tracking code. With the package key, you can track the progress of translation packaging.Also packaged translation streamed. |  -  |
**402** | ProjectNotLaunchedYet |  -  |
**404** | TranslationPackageNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recreate_project**
> OperationStatus recreate_project(id)

Recreate your translation project from scratch. This is a risky action, you will lose current translations.

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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Recreate your translation project from scratch. This is a risky action, you will lose current translations.
        api_response = api_instance.recreate_project(id)
        print("The response of ProjectApi->recreate_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->recreate_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

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
**200** | Project recreation process started successfully |  -  |
**401** | UnauthorizedUser |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_quote_email**
> OperationStatus send_quote_email(id)

Send a quote email

Send a quote email

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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID

    try:
        # Send a quote email
        api_response = api_instance.send_quote_email(id)
        print("The response of ProjectApi->send_quote_email:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->send_quote_email: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 

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
**200** | Email sent successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_project_reports**
> OperationStatus submit_project_reports(id, report_content=report_content)

Submit feedback report for a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.report_content import ReportContent
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    report_content = openapi_client.ReportContent() # ReportContent |  (optional)

    try:
        # Submit feedback report for a project
        api_response = api_instance.submit_project_reports(id, report_content=report_content)
        print("The response of ProjectApi->submit_project_reports:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->submit_project_reports: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **report_content** | [**ReportContent**](ReportContent.md)|  | [optional] 

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
**200** | Report submitted successfully |  -  |
**400** | MissingMessage |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **track_package**
> PackageStatus track_package(id, key=key)

Track translation packaging status

Track the packaging status of your translations, by using the `key` from packaging request. Once packaging is completed, you can download your translations via `/download` endpoints.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.package_status import PackageStatus
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    key = 'key_example' # str | This is the package tracking key provided in the response of a /package call. (optional)

    try:
        # Track translation packaging status
        api_response = api_instance.track_package(id, key=key)
        print("The response of ProjectApi->track_package:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->track_package: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **key** | **str**| This is the package tracking key provided in the response of a /package call. | [optional] 

### Return type

[**PackageStatus**](PackageStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Current status of packaging process. |  -  |
**402** | ProjectNotLaunchedYet |  -  |
**404** | PackagingStatusMissing |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trigger_callback**
> CallbackResult trigger_callback(id, action_type)

Trigger a call to your callback URL related to this project.

Trigger a call to your callback URL related to this project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.callback_result import CallbackResult
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    action_type = 'action_type_example' # str | Callback type

    try:
        # Trigger a call to your callback URL related to this project.
        api_response = api_instance.trigger_callback(id, action_type)
        print("The response of ProjectApi->trigger_callback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->trigger_callback: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **action_type** | **str**| Callback type | 

### Return type

[**CallbackResult**](CallbackResult.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Callback result |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_project**
> Project update_project(id, project_update=project_update)

Update project info and settings

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project import Project
from openapi_client.models.project_update import ProjectUpdate
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
    api_instance = openapi_client.ProjectApi(api_client)
    id = 56 # int | Project ID
    project_update = openapi_client.ProjectUpdate() # ProjectUpdate |  (optional)

    try:
        # Update project info and settings
        api_response = api_instance.update_project(id, project_update=project_update)
        print("The response of ProjectApi->update_project:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProjectApi->update_project: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **project_update** | [**ProjectUpdate**](ProjectUpdate.md)|  | [optional] 

### Return type

[**Project**](Project.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated project |  -  |
**404** | ProjectNotFound |  -  |
**406** | UnsupportedLanguage |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

