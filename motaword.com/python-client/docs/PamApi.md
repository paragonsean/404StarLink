# openapi_client.PamApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_client_profile_for_pam**](PamApi.md#get_client_profile_for_pam) | **GET** /pam/profiles/client/{clientId} | Get the Pam profile of a client for this client ID
[**get_project_completion_report_for_pam**](PamApi.md#get_project_completion_report_for_pam) | **GET** /pam/projects/{projectId}/completion-report | Get completion report data of a project
[**post_message**](PamApi.md#post_message) | **POST** /pam/chat | Sends a message to chat


# **get_client_profile_for_pam**
> ClientProfile get_client_profile_for_pam(client_id)

Get the Pam profile of a client for this client ID

Get the Pam  profile of a client for this client ID

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.client_profile import ClientProfile
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
    api_instance = openapi_client.PamApi(api_client)
    client_id = 56 # int | Client ID

    try:
        # Get the Pam profile of a client for this client ID
        api_response = api_instance.get_client_profile_for_pam(client_id)
        print("The response of PamApi->get_client_profile_for_pam:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PamApi->get_client_profile_for_pam: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **int**| Client ID | 

### Return type

[**ClientProfile**](ClientProfile.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Client profile |  -  |
**404** | ClientProfileNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_completion_report_for_pam**
> ProjectCompletionReport get_project_completion_report_for_pam(project_id)

Get completion report data of a project

Get completion report data of a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_completion_report import ProjectCompletionReport
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
    api_instance = openapi_client.PamApi(api_client)
    project_id = 56 # int | Quote ID

    try:
        # Get completion report data of a project
        api_response = api_instance.get_project_completion_report_for_pam(project_id)
        print("The response of PamApi->get_project_completion_report_for_pam:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PamApi->get_project_completion_report_for_pam: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Quote ID | 

### Return type

[**ProjectCompletionReport**](ProjectCompletionReport.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project Completion Report |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_message**
> OperationStatus post_message(pam_message=pam_message)

Sends a message to chat

Sends a message to the channel.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.pam_message import PamMessage
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
    api_instance = openapi_client.PamApi(api_client)
    pam_message = openapi_client.PamMessage() # PamMessage |  (optional)

    try:
        # Sends a message to chat
        api_response = api_instance.post_message(pam_message=pam_message)
        print("The response of PamApi->post_message:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PamApi->post_message: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pam_message** | [**PamMessage**](PamMessage.md)|  | [optional] 

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
**200** | Successful operation |  -  |
**400** | Missing Parameter |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

