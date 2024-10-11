# openapi_client.ActivityApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_activities**](ActivityApi.md#get_activities) | **GET** /projects/{projectId}/activities | Monitor project activities
[**get_activity**](ActivityApi.md#get_activity) | **GET** /projects/{projectId}/activities/{activityId} | View an activity
[**get_activity_comments**](ActivityApi.md#get_activity_comments) | **GET** /projects/{projectId}/activities/{activityId}/comments | View activity comments
[**get_comments**](ActivityApi.md#get_comments) | **GET** /projects/{projectId}/comments | View all project comments
[**get_sales_activities**](ActivityApi.md#get_sales_activities) | **GET** /projects/{id}/sales/activities | Get sales activities for a project
[**insert_sales_activity**](ActivityApi.md#insert_sales_activity) | **POST** /projects/{id}/sales/activities | Insert sales activity for a project
[**submit_comment**](ActivityApi.md#submit_comment) | **POST** /projects/{projectId}/activities/{activityId} | Submit comment to an activity


# **get_activities**
> ActivityList get_activities(project_id, page=page, per_page=per_page)

Monitor project activities

Get a list of real-time activities in the project, such as translation suggestion and translation approval.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.activity_list import ActivityList
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
    api_instance = openapi_client.ActivityApi(api_client)
    project_id = 56 # int | Project ID
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)

    try:
        # Monitor project activities
        api_response = api_instance.get_activities(project_id, page=page, per_page=per_page)
        print("The response of ActivityApi->get_activities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->get_activities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]

### Return type

[**ActivityList**](ActivityList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of activity models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_activity**
> Activity get_activity(project_id, activity_id)

View an activity

View the details of an activity in the project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.activity import Activity
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
    api_instance = openapi_client.ActivityApi(api_client)
    project_id = 56 # int | Project ID
    activity_id = 56 # int | Activity ID

    try:
        # View an activity
        api_response = api_instance.get_activity(project_id, activity_id)
        print("The response of ActivityApi->get_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->get_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **activity_id** | **int**| Activity ID | 

### Return type

[**Activity**](Activity.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Activity model |  -  |
**404** | ProjectActivityNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_activity_comments**
> CommentList get_activity_comments(project_id, activity_id)

View activity comments

View a list of comments added to this activity.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.comment_list import CommentList
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
    api_instance = openapi_client.ActivityApi(api_client)
    project_id = 56 # int | Project ID
    activity_id = 56 # int | Activity ID

    try:
        # View activity comments
        api_response = api_instance.get_activity_comments(project_id, activity_id)
        print("The response of ActivityApi->get_activity_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->get_activity_comments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **activity_id** | **int**| Activity ID | 

### Return type

[**CommentList**](CommentList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Comment models |  -  |
**404** | ProjectActivityNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comments**
> CommentList get_comments(project_id, page=page, per_page=per_page)

View all project comments

View a list of activity comments in the project.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.comment_list import CommentList
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
    api_instance = openapi_client.ActivityApi(api_client)
    project_id = 56 # int | Project ID
    page = 1 # int |  (optional) (default to 1)
    per_page = 10 # int |  (optional) (default to 10)

    try:
        # View all project comments
        api_response = api_instance.get_comments(project_id, page=page, per_page=per_page)
        print("The response of ActivityApi->get_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->get_comments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **page** | **int**|  | [optional] [default to 1]
 **per_page** | **int**|  | [optional] [default to 10]

### Return type

[**CommentList**](CommentList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Comment models |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sales_activities**
> SalesActivities get_sales_activities(id, exclude_owner=exclude_owner, type=type)

Get sales activities for a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.sales_activities import SalesActivities
from openapi_client.models.sales_activity_type import SalesActivityType
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
    api_instance = openapi_client.ActivityApi(api_client)
    id = 56 # int | Project ID
    exclude_owner = 'exclude_owner_example' # str |  (optional)
    type = openapi_client.SalesActivityType() # SalesActivityType |  (optional)

    try:
        # Get sales activities for a project
        api_response = api_instance.get_sales_activities(id, exclude_owner=exclude_owner, type=type)
        print("The response of ActivityApi->get_sales_activities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->get_sales_activities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **exclude_owner** | **str**|  | [optional] 
 **type** | [**SalesActivityType**](.md)|  | [optional] 

### Return type

[**SalesActivities**](SalesActivities.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Activities fetched successfully |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **insert_sales_activity**
> OperationStatus insert_sales_activity(id, new_sales_activity=new_sales_activity)

Insert sales activity for a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.new_sales_activity import NewSalesActivity
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
    api_instance = openapi_client.ActivityApi(api_client)
    id = 56 # int | Project ID
    new_sales_activity = openapi_client.NewSalesActivity() # NewSalesActivity |  (optional)

    try:
        # Insert sales activity for a project
        api_response = api_instance.insert_sales_activity(id, new_sales_activity=new_sales_activity)
        print("The response of ActivityApi->insert_sales_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->insert_sales_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| Project ID | 
 **new_sales_activity** | [**NewSalesActivity**](NewSalesActivity.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Acvitity inserted successfully |  -  |
**400** | BadRequest |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_comment**
> Comment submit_comment(project_id, activity_id, comment=comment)

Submit comment to an activity

Submit a comment to an activity in the project, such as translation or editing.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.comment import Comment
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
    api_instance = openapi_client.ActivityApi(api_client)
    project_id = 56 # int | Project ID
    activity_id = 56 # int | Activity ID
    comment = openapi_client.Comment() # Comment |  (optional)

    try:
        # Submit comment to an activity
        api_response = api_instance.submit_comment(project_id, activity_id, comment=comment)
        print("The response of ActivityApi->submit_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActivityApi->submit_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **int**| Project ID | 
 **activity_id** | **int**| Activity ID | 
 **comment** | [**Comment**](Comment.md)|  | [optional] 

### Return type

[**Comment**](Comment.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comment model |  -  |
**404** | ProjectActivityNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

