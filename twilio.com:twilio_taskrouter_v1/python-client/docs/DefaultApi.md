# openapi_client.DefaultApi

All URIs are relative to *https://taskrouter.twilio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_activity**](DefaultApi.md#create_activity) | **POST** /v1/Workspaces/{WorkspaceSid}/Activities | 
[**create_task**](DefaultApi.md#create_task) | **POST** /v1/Workspaces/{WorkspaceSid}/Tasks | 
[**create_task_channel**](DefaultApi.md#create_task_channel) | **POST** /v1/Workspaces/{WorkspaceSid}/TaskChannels | 
[**create_task_queue**](DefaultApi.md#create_task_queue) | **POST** /v1/Workspaces/{WorkspaceSid}/TaskQueues | 
[**create_worker**](DefaultApi.md#create_worker) | **POST** /v1/Workspaces/{WorkspaceSid}/Workers | 
[**create_workflow**](DefaultApi.md#create_workflow) | **POST** /v1/Workspaces/{WorkspaceSid}/Workflows | 
[**create_workspace**](DefaultApi.md#create_workspace) | **POST** /v1/Workspaces | 
[**delete_activity**](DefaultApi.md#delete_activity) | **DELETE** /v1/Workspaces/{WorkspaceSid}/Activities/{Sid} | 
[**delete_task**](DefaultApi.md#delete_task) | **DELETE** /v1/Workspaces/{WorkspaceSid}/Tasks/{Sid} | 
[**delete_task_channel**](DefaultApi.md#delete_task_channel) | **DELETE** /v1/Workspaces/{WorkspaceSid}/TaskChannels/{Sid} | 
[**delete_task_queue**](DefaultApi.md#delete_task_queue) | **DELETE** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{Sid} | 
[**delete_worker**](DefaultApi.md#delete_worker) | **DELETE** /v1/Workspaces/{WorkspaceSid}/Workers/{Sid} | 
[**delete_workflow**](DefaultApi.md#delete_workflow) | **DELETE** /v1/Workspaces/{WorkspaceSid}/Workflows/{Sid} | 
[**delete_workspace**](DefaultApi.md#delete_workspace) | **DELETE** /v1/Workspaces/{Sid} | 
[**fetch_activity**](DefaultApi.md#fetch_activity) | **GET** /v1/Workspaces/{WorkspaceSid}/Activities/{Sid} | 
[**fetch_event**](DefaultApi.md#fetch_event) | **GET** /v1/Workspaces/{WorkspaceSid}/Events/{Sid} | 
[**fetch_task**](DefaultApi.md#fetch_task) | **GET** /v1/Workspaces/{WorkspaceSid}/Tasks/{Sid} | 
[**fetch_task_channel**](DefaultApi.md#fetch_task_channel) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskChannels/{Sid} | 
[**fetch_task_queue**](DefaultApi.md#fetch_task_queue) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{Sid} | 
[**fetch_task_queue_cumulative_statistics**](DefaultApi.md#fetch_task_queue_cumulative_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{TaskQueueSid}/CumulativeStatistics | 
[**fetch_task_queue_real_time_statistics**](DefaultApi.md#fetch_task_queue_real_time_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{TaskQueueSid}/RealTimeStatistics | 
[**fetch_task_queue_statistics**](DefaultApi.md#fetch_task_queue_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{TaskQueueSid}/Statistics | 
[**fetch_task_reservation**](DefaultApi.md#fetch_task_reservation) | **GET** /v1/Workspaces/{WorkspaceSid}/Tasks/{TaskSid}/Reservations/{Sid} | 
[**fetch_worker**](DefaultApi.md#fetch_worker) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{Sid} | 
[**fetch_worker_channel**](DefaultApi.md#fetch_worker_channel) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Channels/{Sid} | 
[**fetch_worker_instance_statistics**](DefaultApi.md#fetch_worker_instance_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Statistics | 
[**fetch_worker_reservation**](DefaultApi.md#fetch_worker_reservation) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Reservations/{Sid} | 
[**fetch_worker_statistics**](DefaultApi.md#fetch_worker_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/Statistics | 
[**fetch_workers_cumulative_statistics**](DefaultApi.md#fetch_workers_cumulative_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/CumulativeStatistics | 
[**fetch_workers_real_time_statistics**](DefaultApi.md#fetch_workers_real_time_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/RealTimeStatistics | 
[**fetch_workflow**](DefaultApi.md#fetch_workflow) | **GET** /v1/Workspaces/{WorkspaceSid}/Workflows/{Sid} | 
[**fetch_workflow_cumulative_statistics**](DefaultApi.md#fetch_workflow_cumulative_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workflows/{WorkflowSid}/CumulativeStatistics | 
[**fetch_workflow_real_time_statistics**](DefaultApi.md#fetch_workflow_real_time_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workflows/{WorkflowSid}/RealTimeStatistics | 
[**fetch_workflow_statistics**](DefaultApi.md#fetch_workflow_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Workflows/{WorkflowSid}/Statistics | 
[**fetch_workspace**](DefaultApi.md#fetch_workspace) | **GET** /v1/Workspaces/{Sid} | 
[**fetch_workspace_cumulative_statistics**](DefaultApi.md#fetch_workspace_cumulative_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/CumulativeStatistics | 
[**fetch_workspace_real_time_statistics**](DefaultApi.md#fetch_workspace_real_time_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/RealTimeStatistics | 
[**fetch_workspace_statistics**](DefaultApi.md#fetch_workspace_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/Statistics | 
[**list_activity**](DefaultApi.md#list_activity) | **GET** /v1/Workspaces/{WorkspaceSid}/Activities | 
[**list_event**](DefaultApi.md#list_event) | **GET** /v1/Workspaces/{WorkspaceSid}/Events | 
[**list_task**](DefaultApi.md#list_task) | **GET** /v1/Workspaces/{WorkspaceSid}/Tasks | 
[**list_task_channel**](DefaultApi.md#list_task_channel) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskChannels | 
[**list_task_queue**](DefaultApi.md#list_task_queue) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues | 
[**list_task_queues_statistics**](DefaultApi.md#list_task_queues_statistics) | **GET** /v1/Workspaces/{WorkspaceSid}/TaskQueues/Statistics | 
[**list_task_reservation**](DefaultApi.md#list_task_reservation) | **GET** /v1/Workspaces/{WorkspaceSid}/Tasks/{TaskSid}/Reservations | 
[**list_worker**](DefaultApi.md#list_worker) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers | 
[**list_worker_channel**](DefaultApi.md#list_worker_channel) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Channels | 
[**list_worker_reservation**](DefaultApi.md#list_worker_reservation) | **GET** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Reservations | 
[**list_workflow**](DefaultApi.md#list_workflow) | **GET** /v1/Workspaces/{WorkspaceSid}/Workflows | 
[**list_workspace**](DefaultApi.md#list_workspace) | **GET** /v1/Workspaces | 
[**update_activity**](DefaultApi.md#update_activity) | **POST** /v1/Workspaces/{WorkspaceSid}/Activities/{Sid} | 
[**update_task**](DefaultApi.md#update_task) | **POST** /v1/Workspaces/{WorkspaceSid}/Tasks/{Sid} | 
[**update_task_channel**](DefaultApi.md#update_task_channel) | **POST** /v1/Workspaces/{WorkspaceSid}/TaskChannels/{Sid} | 
[**update_task_queue**](DefaultApi.md#update_task_queue) | **POST** /v1/Workspaces/{WorkspaceSid}/TaskQueues/{Sid} | 
[**update_task_reservation**](DefaultApi.md#update_task_reservation) | **POST** /v1/Workspaces/{WorkspaceSid}/Tasks/{TaskSid}/Reservations/{Sid} | 
[**update_worker**](DefaultApi.md#update_worker) | **POST** /v1/Workspaces/{WorkspaceSid}/Workers/{Sid} | 
[**update_worker_channel**](DefaultApi.md#update_worker_channel) | **POST** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Channels/{Sid} | 
[**update_worker_reservation**](DefaultApi.md#update_worker_reservation) | **POST** /v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Reservations/{Sid} | 
[**update_workflow**](DefaultApi.md#update_workflow) | **POST** /v1/Workspaces/{WorkspaceSid}/Workflows/{Sid} | 
[**update_workspace**](DefaultApi.md#update_workspace) | **POST** /v1/Workspaces/{Sid} | 


# **create_activity**
> TaskrouterV1WorkspaceActivity create_activity(workspace_sid, friendly_name, available=available)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_activity import TaskrouterV1WorkspaceActivity
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new Activity belongs to.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Activity resource. It can be up to 64 characters long. These names are used to calculate and expose statistics about Workers, and provide visibility into the state of each Worker. Examples of friendly names include: `on-call`, `break`, and `email`.
    available = True # bool | Whether the Worker should be eligible to receive a Task when it occupies the Activity. A value of `true`, `1`, or `yes` specifies the Activity is available. All other values specify that it is not. The value cannot be changed after the Activity is created. (optional)

    try:
        api_response = api_instance.create_activity(workspace_sid, friendly_name, available=available)
        print("The response of DefaultApi->create_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new Activity belongs to. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the Activity resource. It can be up to 64 characters long. These names are used to calculate and expose statistics about Workers, and provide visibility into the state of each Worker. Examples of friendly names include: &#x60;on-call&#x60;, &#x60;break&#x60;, and &#x60;email&#x60;. | 
 **available** | **bool**| Whether the Worker should be eligible to receive a Task when it occupies the Activity. A value of &#x60;true&#x60;, &#x60;1&#x60;, or &#x60;yes&#x60; specifies the Activity is available. All other values specify that it is not. The value cannot be changed after the Activity is created. | [optional] 

### Return type

[**TaskrouterV1WorkspaceActivity**](TaskrouterV1WorkspaceActivity.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_task**
> TaskrouterV1WorkspaceTask create_task(workspace_sid, attributes=attributes, priority=priority, task_channel=task_channel, timeout=timeout, workflow_sid=workflow_sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task import TaskrouterV1WorkspaceTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new Task belongs to.
    attributes = 'attributes_example' # str | A URL-encoded JSON string with the attributes of the new task. This value is passed to the Workflow's `assignment_callback_url` when the Task is assigned to a Worker. For example: `{ \\\"task_type\\\": \\\"call\\\", \\\"twilio_call_sid\\\": \\\"CAxxx\\\", \\\"customer_ticket_number\\\": \\\"12345\\\" }`. (optional)
    priority = 56 # int | The priority to assign the new task and override the default. When supplied, the new Task will have this priority unless it matches a Workflow Target with a Priority set. When not supplied, the new Task will have the priority of the matching Workflow Target. Value can be 0 to 2^31^ (2,147,483,647). (optional)
    task_channel = 'task_channel_example' # str | When MultiTasking is enabled, specify the TaskChannel by passing either its `unique_name` or `sid`. Default value is `default`. (optional)
    timeout = 56 # int | The amount of time in seconds the new task can live before being assigned. Can be up to a maximum of 2 weeks (1,209,600 seconds). The default value is 24 hours (86,400 seconds). On timeout, the `task.canceled` event will fire with description `Task TTL Exceeded`. (optional)
    workflow_sid = 'workflow_sid_example' # str | The SID of the Workflow that you would like to handle routing for the new Task. If there is only one Workflow defined for the Workspace that you are posting the new task to, this parameter is optional. (optional)

    try:
        api_response = api_instance.create_task(workspace_sid, attributes=attributes, priority=priority, task_channel=task_channel, timeout=timeout, workflow_sid=workflow_sid)
        print("The response of DefaultApi->create_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new Task belongs to. | 
 **attributes** | **str**| A URL-encoded JSON string with the attributes of the new task. This value is passed to the Workflow&#39;s &#x60;assignment_callback_url&#x60; when the Task is assigned to a Worker. For example: &#x60;{ \\\&quot;task_type\\\&quot;: \\\&quot;call\\\&quot;, \\\&quot;twilio_call_sid\\\&quot;: \\\&quot;CAxxx\\\&quot;, \\\&quot;customer_ticket_number\\\&quot;: \\\&quot;12345\\\&quot; }&#x60;. | [optional] 
 **priority** | **int**| The priority to assign the new task and override the default. When supplied, the new Task will have this priority unless it matches a Workflow Target with a Priority set. When not supplied, the new Task will have the priority of the matching Workflow Target. Value can be 0 to 2^31^ (2,147,483,647). | [optional] 
 **task_channel** | **str**| When MultiTasking is enabled, specify the TaskChannel by passing either its &#x60;unique_name&#x60; or &#x60;sid&#x60;. Default value is &#x60;default&#x60;. | [optional] 
 **timeout** | **int**| The amount of time in seconds the new task can live before being assigned. Can be up to a maximum of 2 weeks (1,209,600 seconds). The default value is 24 hours (86,400 seconds). On timeout, the &#x60;task.canceled&#x60; event will fire with description &#x60;Task TTL Exceeded&#x60;. | [optional] 
 **workflow_sid** | **str**| The SID of the Workflow that you would like to handle routing for the new Task. If there is only one Workflow defined for the Workspace that you are posting the new task to, this parameter is optional. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTask**](TaskrouterV1WorkspaceTask.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_task_channel**
> TaskrouterV1WorkspaceTaskChannel create_task_channel(workspace_sid, friendly_name, unique_name, channel_optimized_routing=channel_optimized_routing)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_channel import TaskrouterV1WorkspaceTaskChannel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new Task Channel belongs to.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Task Channel. It can be up to 64 characters long.
    unique_name = 'unique_name_example' # str | An application-defined string that uniquely identifies the Task Channel, such as `voice` or `sms`.
    channel_optimized_routing = True # bool | Whether the Task Channel should prioritize Workers that have been idle. If `true`, Workers that have been idle the longest are prioritized. (optional)

    try:
        api_response = api_instance.create_task_channel(workspace_sid, friendly_name, unique_name, channel_optimized_routing=channel_optimized_routing)
        print("The response of DefaultApi->create_task_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_task_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new Task Channel belongs to. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the Task Channel. It can be up to 64 characters long. | 
 **unique_name** | **str**| An application-defined string that uniquely identifies the Task Channel, such as &#x60;voice&#x60; or &#x60;sms&#x60;. | 
 **channel_optimized_routing** | **bool**| Whether the Task Channel should prioritize Workers that have been idle. If &#x60;true&#x60;, Workers that have been idle the longest are prioritized. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskChannel**](TaskrouterV1WorkspaceTaskChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_task_queue**
> TaskrouterV1WorkspaceTaskQueue create_task_queue(workspace_sid, friendly_name, assignment_activity_sid=assignment_activity_sid, max_reserved_workers=max_reserved_workers, reservation_activity_sid=reservation_activity_sid, target_workers=target_workers, task_order=task_order)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue import TaskrouterV1WorkspaceTaskQueue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new TaskQueue belongs to.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the TaskQueue. For example `Support-Tier 1`, `Sales`, or `Escalation`.
    assignment_activity_sid = 'assignment_activity_sid_example' # str | The SID of the Activity to assign Workers when a task is assigned to them. (optional)
    max_reserved_workers = 56 # int | The maximum number of Workers to reserve for the assignment of a Task in the queue. Can be an integer between 1 and 50, inclusive and defaults to 1. (optional)
    reservation_activity_sid = 'reservation_activity_sid_example' # str | The SID of the Activity to assign Workers when a task is reserved for them. (optional)
    target_workers = 'target_workers_example' # str | A string that describes the Worker selection criteria for any Tasks that enter the TaskQueue. For example, `'\\\"language\\\" == \\\"spanish\\\"'`. The default value is `1==1`. If this value is empty, Tasks will wait in the TaskQueue until they are deleted or moved to another TaskQueue. For more information about Worker selection, see [Describing Worker selection criteria](https://www.twilio.com/docs/taskrouter/api/taskqueues#target-workers). (optional)
    task_order = openapi_client.TaskQueueEnumTaskOrder() # TaskQueueEnumTaskOrder |  (optional)

    try:
        api_response = api_instance.create_task_queue(workspace_sid, friendly_name, assignment_activity_sid=assignment_activity_sid, max_reserved_workers=max_reserved_workers, reservation_activity_sid=reservation_activity_sid, target_workers=target_workers, task_order=task_order)
        print("The response of DefaultApi->create_task_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_task_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new TaskQueue belongs to. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the TaskQueue. For example &#x60;Support-Tier 1&#x60;, &#x60;Sales&#x60;, or &#x60;Escalation&#x60;. | 
 **assignment_activity_sid** | **str**| The SID of the Activity to assign Workers when a task is assigned to them. | [optional] 
 **max_reserved_workers** | **int**| The maximum number of Workers to reserve for the assignment of a Task in the queue. Can be an integer between 1 and 50, inclusive and defaults to 1. | [optional] 
 **reservation_activity_sid** | **str**| The SID of the Activity to assign Workers when a task is reserved for them. | [optional] 
 **target_workers** | **str**| A string that describes the Worker selection criteria for any Tasks that enter the TaskQueue. For example, &#x60;&#39;\\\&quot;language\\\&quot; &#x3D;&#x3D; \\\&quot;spanish\\\&quot;&#39;&#x60;. The default value is &#x60;1&#x3D;&#x3D;1&#x60;. If this value is empty, Tasks will wait in the TaskQueue until they are deleted or moved to another TaskQueue. For more information about Worker selection, see [Describing Worker selection criteria](https://www.twilio.com/docs/taskrouter/api/taskqueues#target-workers). | [optional] 
 **task_order** | **TaskQueueEnumTaskOrder**|  | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskQueue**](TaskrouterV1WorkspaceTaskQueue.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_worker**
> TaskrouterV1WorkspaceWorker create_worker(workspace_sid, friendly_name, activity_sid=activity_sid, attributes=attributes)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker import TaskrouterV1WorkspaceWorker
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new Worker belongs to.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the new Worker. It can be up to 64 characters long.
    activity_sid = 'activity_sid_example' # str | The SID of a valid Activity that will describe the new Worker's initial state. See [Activities](https://www.twilio.com/docs/taskrouter/api/activity) for more information. If not provided, the new Worker's initial state is the `default_activity_sid` configured on the Workspace. (optional)
    attributes = 'attributes_example' # str | A valid JSON string that describes the new Worker. For example: `{ \\\"email\\\": \\\"Bob@example.com\\\", \\\"phone\\\": \\\"+5095551234\\\" }`. This data is passed to the `assignment_callback_url` when TaskRouter assigns a Task to the Worker. Defaults to {}. (optional)

    try:
        api_response = api_instance.create_worker(workspace_sid, friendly_name, activity_sid=activity_sid, attributes=attributes)
        print("The response of DefaultApi->create_worker:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_worker: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new Worker belongs to. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the new Worker. It can be up to 64 characters long. | 
 **activity_sid** | **str**| The SID of a valid Activity that will describe the new Worker&#39;s initial state. See [Activities](https://www.twilio.com/docs/taskrouter/api/activity) for more information. If not provided, the new Worker&#39;s initial state is the &#x60;default_activity_sid&#x60; configured on the Workspace. | [optional] 
 **attributes** | **str**| A valid JSON string that describes the new Worker. For example: &#x60;{ \\\&quot;email\\\&quot;: \\\&quot;Bob@example.com\\\&quot;, \\\&quot;phone\\\&quot;: \\\&quot;+5095551234\\\&quot; }&#x60;. This data is passed to the &#x60;assignment_callback_url&#x60; when TaskRouter assigns a Task to the Worker. Defaults to {}. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorker**](TaskrouterV1WorkspaceWorker.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_workflow**
> TaskrouterV1WorkspaceWorkflow create_workflow(workspace_sid, configuration, friendly_name, assignment_callback_url=assignment_callback_url, fallback_assignment_callback_url=fallback_assignment_callback_url, task_reservation_timeout=task_reservation_timeout)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow import TaskrouterV1WorkspaceWorkflow
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace that the new Workflow to create belongs to.
    configuration = 'configuration_example' # str | A JSON string that contains the rules to apply to the Workflow. See [Configuring Workflows](https://www.twilio.com/docs/taskrouter/workflow-configuration) for more information.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Workflow resource. For example, `Inbound Call Workflow` or `2014 Outbound Campaign`.
    assignment_callback_url = 'assignment_callback_url_example' # str | The URL from your application that will process task assignment events. See [Handling Task Assignment Callback](https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks) for more details. (optional)
    fallback_assignment_callback_url = 'fallback_assignment_callback_url_example' # str | The URL that we should call when a call to the `assignment_callback_url` fails. (optional)
    task_reservation_timeout = 56 # int | How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker. Can be up to `86,400` (24 hours) and the default is `120`. (optional)

    try:
        api_response = api_instance.create_workflow(workspace_sid, configuration, friendly_name, assignment_callback_url=assignment_callback_url, fallback_assignment_callback_url=fallback_assignment_callback_url, task_reservation_timeout=task_reservation_timeout)
        print("The response of DefaultApi->create_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace that the new Workflow to create belongs to. | 
 **configuration** | **str**| A JSON string that contains the rules to apply to the Workflow. See [Configuring Workflows](https://www.twilio.com/docs/taskrouter/workflow-configuration) for more information. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the Workflow resource. For example, &#x60;Inbound Call Workflow&#x60; or &#x60;2014 Outbound Campaign&#x60;. | 
 **assignment_callback_url** | **str**| The URL from your application that will process task assignment events. See [Handling Task Assignment Callback](https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks) for more details. | [optional] 
 **fallback_assignment_callback_url** | **str**| The URL that we should call when a call to the &#x60;assignment_callback_url&#x60; fails. | [optional] 
 **task_reservation_timeout** | **int**| How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker. Can be up to &#x60;86,400&#x60; (24 hours) and the default is &#x60;120&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkflow**](TaskrouterV1WorkspaceWorkflow.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_workspace**
> TaskrouterV1Workspace create_workspace(friendly_name, event_callback_url=event_callback_url, events_filter=events_filter, multi_task_enabled=multi_task_enabled, prioritize_queue_order=prioritize_queue_order, template=template)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace import TaskrouterV1Workspace
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Workspace resource. It can be up to 64 characters long. For example: `Customer Support` or `2014 Election Campaign`.
    event_callback_url = 'event_callback_url_example' # str | The URL we should call when an event occurs. If provided, the Workspace will publish events to this URL, for example, to collect data for reporting. See [Workspace Events](https://www.twilio.com/docs/taskrouter/api/event) for more information. This parameter supports Twilio's [Webhooks (HTTP callbacks) Connection Overrides](https://www.twilio.com/docs/usage/webhooks/webhooks-connection-overrides). (optional)
    events_filter = 'events_filter_example' # str | The list of Workspace events for which to call event_callback_url. For example, if `EventsFilter=task.created, task.canceled, worker.activity.update`, then TaskRouter will call event_callback_url only when a task is created, canceled, or a Worker activity is updated. (optional)
    multi_task_enabled = True # bool | Whether to enable multi-tasking. Can be: `true` to enable multi-tasking, or `false` to disable it. However, all workspaces should be created as multi-tasking. The default is `true`. Multi-tasking allows Workers to handle multiple Tasks simultaneously. When enabled (`true`), each Worker can receive parallel reservations up to the per-channel maximums defined in the Workers section. In single-tasking mode (legacy mode), each Worker will only receive a new reservation when the previous task is completed. Learn more at [Multitasking](https://www.twilio.com/docs/taskrouter/multitasking). (optional)
    prioritize_queue_order = openapi_client.WorkspaceEnumQueueOrder() # WorkspaceEnumQueueOrder |  (optional)
    template = 'template_example' # str | An available template name. Can be: `NONE` or `FIFO` and the default is `NONE`. Pre-configures the Workspace with the Workflow and Activities specified in the template. `NONE` will create a Workspace with only a set of default activities. `FIFO` will configure TaskRouter with a set of default activities and a single TaskQueue for first-in, first-out distribution, which can be useful when you are getting started with TaskRouter. (optional)

    try:
        api_response = api_instance.create_workspace(friendly_name, event_callback_url=event_callback_url, events_filter=events_filter, multi_task_enabled=multi_task_enabled, prioritize_queue_order=prioritize_queue_order, template=template)
        print("The response of DefaultApi->create_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendly_name** | **str**| A descriptive string that you create to describe the Workspace resource. It can be up to 64 characters long. For example: &#x60;Customer Support&#x60; or &#x60;2014 Election Campaign&#x60;. | 
 **event_callback_url** | **str**| The URL we should call when an event occurs. If provided, the Workspace will publish events to this URL, for example, to collect data for reporting. See [Workspace Events](https://www.twilio.com/docs/taskrouter/api/event) for more information. This parameter supports Twilio&#39;s [Webhooks (HTTP callbacks) Connection Overrides](https://www.twilio.com/docs/usage/webhooks/webhooks-connection-overrides). | [optional] 
 **events_filter** | **str**| The list of Workspace events for which to call event_callback_url. For example, if &#x60;EventsFilter&#x3D;task.created, task.canceled, worker.activity.update&#x60;, then TaskRouter will call event_callback_url only when a task is created, canceled, or a Worker activity is updated. | [optional] 
 **multi_task_enabled** | **bool**| Whether to enable multi-tasking. Can be: &#x60;true&#x60; to enable multi-tasking, or &#x60;false&#x60; to disable it. However, all workspaces should be created as multi-tasking. The default is &#x60;true&#x60;. Multi-tasking allows Workers to handle multiple Tasks simultaneously. When enabled (&#x60;true&#x60;), each Worker can receive parallel reservations up to the per-channel maximums defined in the Workers section. In single-tasking mode (legacy mode), each Worker will only receive a new reservation when the previous task is completed. Learn more at [Multitasking](https://www.twilio.com/docs/taskrouter/multitasking). | [optional] 
 **prioritize_queue_order** | **WorkspaceEnumQueueOrder**|  | [optional] 
 **template** | **str**| An available template name. Can be: &#x60;NONE&#x60; or &#x60;FIFO&#x60; and the default is &#x60;NONE&#x60;. Pre-configures the Workspace with the Workflow and Activities specified in the template. &#x60;NONE&#x60; will create a Workspace with only a set of default activities. &#x60;FIFO&#x60; will configure TaskRouter with a set of default activities and a single TaskQueue for first-in, first-out distribution, which can be useful when you are getting started with TaskRouter. | [optional] 

### Return type

[**TaskrouterV1Workspace**](TaskrouterV1Workspace.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_activity**
> delete_activity(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Activity resources to delete.
    sid = 'sid_example' # str | The SID of the Activity resource to delete.

    try:
        api_instance.delete_activity(workspace_sid, sid)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Activity resources to delete. | 
 **sid** | **str**| The SID of the Activity resource to delete. | 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_task**
> delete_task(workspace_sid, sid, if_match=if_match)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task to delete.
    sid = 'sid_example' # str | The SID of the Task resource to delete.
    if_match = 'if_match_example' # str | If provided, deletes this Task if (and only if) the [ETag](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag) header of the Task matches the provided value. This matches the semantics of (and is implemented with) the HTTP [If-Match header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Match). (optional)

    try:
        api_instance.delete_task(workspace_sid, sid, if_match=if_match)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task to delete. | 
 **sid** | **str**| The SID of the Task resource to delete. | 
 **if_match** | **str**| If provided, deletes this Task if (and only if) the [ETag](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag) header of the Task matches the provided value. This matches the semantics of (and is implemented with) the HTTP [If-Match header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Match). | [optional] 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_task_channel**
> delete_task_channel(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task Channel to delete.
    sid = 'sid_example' # str | The SID of the Task Channel resource to delete.

    try:
        api_instance.delete_task_channel(workspace_sid, sid)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_task_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task Channel to delete. | 
 **sid** | **str**| The SID of the Task Channel resource to delete. | 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_task_queue**
> delete_task_queue(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to delete.
    sid = 'sid_example' # str | The SID of the TaskQueue resource to delete.

    try:
        api_instance.delete_task_queue(workspace_sid, sid)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_task_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to delete. | 
 **sid** | **str**| The SID of the TaskQueue resource to delete. | 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_worker**
> delete_worker(workspace_sid, sid, if_match=if_match)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Worker to delete.
    sid = 'sid_example' # str | The SID of the Worker resource to delete.
    if_match = 'if_match_example' # str | The If-Match HTTP request header (optional)

    try:
        api_instance.delete_worker(workspace_sid, sid, if_match=if_match)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_worker: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Worker to delete. | 
 **sid** | **str**| The SID of the Worker resource to delete. | 
 **if_match** | **str**| The If-Match HTTP request header | [optional] 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_workflow**
> delete_workflow(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to delete.
    sid = 'sid_example' # str | The SID of the Workflow resource to delete.

    try:
        api_instance.delete_workflow(workspace_sid, sid)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to delete. | 
 **sid** | **str**| The SID of the Workflow resource to delete. | 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_workspace**
> delete_workspace(sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sid = 'sid_example' # str | The SID of the Workspace resource to delete.

    try:
        api_instance.delete_workspace(sid)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **str**| The SID of the Workspace resource to delete. | 

### Return type

void (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_activity**
> TaskrouterV1WorkspaceActivity fetch_activity(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_activity import TaskrouterV1WorkspaceActivity
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Activity resources to fetch.
    sid = 'sid_example' # str | The SID of the Activity resource to fetch.

    try:
        api_response = api_instance.fetch_activity(workspace_sid, sid)
        print("The response of DefaultApi->fetch_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Activity resources to fetch. | 
 **sid** | **str**| The SID of the Activity resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceActivity**](TaskrouterV1WorkspaceActivity.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_event**
> TaskrouterV1WorkspaceEvent fetch_event(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_event import TaskrouterV1WorkspaceEvent
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Event to fetch.
    sid = 'sid_example' # str | The SID of the Event resource to fetch.

    try:
        api_response = api_instance.fetch_event(workspace_sid, sid)
        print("The response of DefaultApi->fetch_event:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_event: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Event to fetch. | 
 **sid** | **str**| The SID of the Event resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceEvent**](TaskrouterV1WorkspaceEvent.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task**
> TaskrouterV1WorkspaceTask fetch_task(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task import TaskrouterV1WorkspaceTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task to fetch.
    sid = 'sid_example' # str | The SID of the Task resource to fetch.

    try:
        api_response = api_instance.fetch_task(workspace_sid, sid)
        print("The response of DefaultApi->fetch_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task to fetch. | 
 **sid** | **str**| The SID of the Task resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceTask**](TaskrouterV1WorkspaceTask.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_channel**
> TaskrouterV1WorkspaceTaskChannel fetch_task_channel(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_channel import TaskrouterV1WorkspaceTaskChannel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task Channel to fetch.
    sid = 'sid_example' # str | The SID of the Task Channel resource to fetch.

    try:
        api_response = api_instance.fetch_task_channel(workspace_sid, sid)
        print("The response of DefaultApi->fetch_task_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task Channel to fetch. | 
 **sid** | **str**| The SID of the Task Channel resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceTaskChannel**](TaskrouterV1WorkspaceTaskChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_queue**
> TaskrouterV1WorkspaceTaskQueue fetch_task_queue(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue import TaskrouterV1WorkspaceTaskQueue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to fetch.
    sid = 'sid_example' # str | The SID of the TaskQueue resource to fetch.

    try:
        api_response = api_instance.fetch_task_queue(workspace_sid, sid)
        print("The response of DefaultApi->fetch_task_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to fetch. | 
 **sid** | **str**| The SID of the TaskQueue resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceTaskQueue**](TaskrouterV1WorkspaceTaskQueue.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_queue_cumulative_statistics**
> TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics fetch_task_queue_cumulative_statistics(workspace_sid, task_queue_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to fetch.
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue for which to fetch statistics.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default is 15 minutes. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. TaskRouter will calculate statistics on up to 10,000 Tasks/Reservations for any given threshold. (optional)

    try:
        api_response = api_instance.fetch_task_queue_cumulative_statistics(workspace_sid, task_queue_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_task_queue_cumulative_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_queue_cumulative_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to fetch. | 
 **task_queue_sid** | **str**| The SID of the TaskQueue for which to fetch statistics. | 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default is 15 minutes. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. TaskRouter will calculate statistics on up to 10,000 Tasks/Reservations for any given threshold. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics**](TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_queue_real_time_statistics**
> TaskrouterV1WorkspaceTaskQueueTaskQueueRealTimeStatistics fetch_task_queue_real_time_statistics(workspace_sid, task_queue_sid, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queue_real_time_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueueRealTimeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to fetch.
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue for which to fetch statistics.
    task_channel = 'task_channel_example' # str | The TaskChannel for which to fetch statistics. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_task_queue_real_time_statistics(workspace_sid, task_queue_sid, task_channel=task_channel)
        print("The response of DefaultApi->fetch_task_queue_real_time_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_queue_real_time_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to fetch. | 
 **task_queue_sid** | **str**| The SID of the TaskQueue for which to fetch statistics. | 
 **task_channel** | **str**| The TaskChannel for which to fetch statistics. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskQueueTaskQueueRealTimeStatistics**](TaskrouterV1WorkspaceTaskQueueTaskQueueRealTimeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_queue_statistics**
> TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics fetch_task_queue_statistics(workspace_sid, task_queue_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queue_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to fetch.
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue for which to fetch statistics.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default is 15 minutes. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate real-time and cumulative statistics for the specified TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. (optional)

    try:
        api_response = api_instance.fetch_task_queue_statistics(workspace_sid, task_queue_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_task_queue_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_queue_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to fetch. | 
 **task_queue_sid** | **str**| The SID of the TaskQueue for which to fetch statistics. | 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default is 15 minutes. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate real-time and cumulative statistics for the specified TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics**](TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_task_reservation**
> TaskrouterV1WorkspaceTaskTaskReservation fetch_task_reservation(workspace_sid, task_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_task_reservation import TaskrouterV1WorkspaceTaskTaskReservation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskReservation resource to fetch.
    task_sid = 'task_sid_example' # str | The SID of the reserved Task resource with the TaskReservation resource to fetch.
    sid = 'sid_example' # str | The SID of the TaskReservation resource to fetch.

    try:
        api_response = api_instance.fetch_task_reservation(workspace_sid, task_sid, sid)
        print("The response of DefaultApi->fetch_task_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_task_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskReservation resource to fetch. | 
 **task_sid** | **str**| The SID of the reserved Task resource with the TaskReservation resource to fetch. | 
 **sid** | **str**| The SID of the TaskReservation resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceTaskTaskReservation**](TaskrouterV1WorkspaceTaskTaskReservation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_worker**
> TaskrouterV1WorkspaceWorker fetch_worker(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker import TaskrouterV1WorkspaceWorker
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Worker to fetch.
    sid = 'sid_example' # str | The SID of the Worker resource to fetch.

    try:
        api_response = api_instance.fetch_worker(workspace_sid, sid)
        print("The response of DefaultApi->fetch_worker:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_worker: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Worker to fetch. | 
 **sid** | **str**| The SID of the Worker resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceWorker**](TaskrouterV1WorkspaceWorker.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_worker_channel**
> TaskrouterV1WorkspaceWorkerWorkerChannel fetch_worker_channel(workspace_sid, worker_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_channel import TaskrouterV1WorkspaceWorkerWorkerChannel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerChannel to fetch.
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the WorkerChannel to fetch.
    sid = 'sid_example' # str | The SID of the WorkerChannel to fetch.

    try:
        api_response = api_instance.fetch_worker_channel(workspace_sid, worker_sid, sid)
        print("The response of DefaultApi->fetch_worker_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_worker_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerChannel to fetch. | 
 **worker_sid** | **str**| The SID of the Worker with the WorkerChannel to fetch. | 
 **sid** | **str**| The SID of the WorkerChannel to fetch. | 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerChannel**](TaskrouterV1WorkspaceWorkerWorkerChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_worker_instance_statistics**
> TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics fetch_worker_instance_statistics(workspace_sid, worker_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_instance_statistics import TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerChannel to fetch.
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the WorkerChannel to fetch.
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    task_channel = 'task_channel_example' # str | Only calculate statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_worker_instance_statistics(workspace_sid, worker_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel)
        print("The response of DefaultApi->fetch_worker_instance_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_worker_instance_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerChannel to fetch. | 
 **worker_sid** | **str**| The SID of the Worker with the WorkerChannel to fetch. | 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **end_date** | **datetime**| Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **task_channel** | **str**| Only calculate statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics**](TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_worker_reservation**
> TaskrouterV1WorkspaceWorkerWorkerReservation fetch_worker_reservation(workspace_sid, worker_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_reservation import TaskrouterV1WorkspaceWorkerWorkerReservation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerReservation resource to fetch.
    worker_sid = 'worker_sid_example' # str | The SID of the reserved Worker resource with the WorkerReservation resource to fetch.
    sid = 'sid_example' # str | The SID of the WorkerReservation resource to fetch.

    try:
        api_response = api_instance.fetch_worker_reservation(workspace_sid, worker_sid, sid)
        print("The response of DefaultApi->fetch_worker_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_worker_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerReservation resource to fetch. | 
 **worker_sid** | **str**| The SID of the reserved Worker resource with the WorkerReservation resource to fetch. | 
 **sid** | **str**| The SID of the WorkerReservation resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerReservation**](TaskrouterV1WorkspaceWorkerWorkerReservation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_worker_statistics**
> TaskrouterV1WorkspaceWorkerWorkerStatistics fetch_worker_statistics(workspace_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_queue_sid=task_queue_sid, task_queue_name=task_queue_name, friendly_name=friendly_name, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_statistics import TaskrouterV1WorkspaceWorkerWorkerStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Worker to fetch.
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue for which to fetch Worker statistics. (optional)
    task_queue_name = 'task_queue_name_example' # str | The `friendly_name` of the TaskQueue for which to fetch Worker statistics. (optional)
    friendly_name = 'friendly_name_example' # str | Only include Workers with `friendly_name` values that match this parameter. (optional)
    task_channel = 'task_channel_example' # str | Only calculate statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_worker_statistics(workspace_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_queue_sid=task_queue_sid, task_queue_name=task_queue_name, friendly_name=friendly_name, task_channel=task_channel)
        print("The response of DefaultApi->fetch_worker_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_worker_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Worker to fetch. | 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **task_queue_sid** | **str**| The SID of the TaskQueue for which to fetch Worker statistics. | [optional] 
 **task_queue_name** | **str**| The &#x60;friendly_name&#x60; of the TaskQueue for which to fetch Worker statistics. | [optional] 
 **friendly_name** | **str**| Only include Workers with &#x60;friendly_name&#x60; values that match this parameter. | [optional] 
 **task_channel** | **str**| Only calculate statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerStatistics**](TaskrouterV1WorkspaceWorkerWorkerStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workers_cumulative_statistics**
> TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics fetch_workers_cumulative_statistics(workspace_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_workers_cumulative_statistics import TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the resource to fetch.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_workers_cumulative_statistics(workspace_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel)
        print("The response of DefaultApi->fetch_workers_cumulative_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workers_cumulative_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the resource to fetch. | 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics**](TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workers_real_time_statistics**
> TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics fetch_workers_real_time_statistics(workspace_sid, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_workers_real_time_statistics import TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the resource to fetch.
    task_channel = 'task_channel_example' # str | Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_workers_real_time_statistics(workspace_sid, task_channel=task_channel)
        print("The response of DefaultApi->fetch_workers_real_time_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workers_real_time_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the resource to fetch. | 
 **task_channel** | **str**| Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics**](TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workflow**
> TaskrouterV1WorkspaceWorkflow fetch_workflow(workspace_sid, sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow import TaskrouterV1WorkspaceWorkflow
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to fetch.
    sid = 'sid_example' # str | The SID of the Workflow resource to fetch.

    try:
        api_response = api_instance.fetch_workflow(workspace_sid, sid)
        print("The response of DefaultApi->fetch_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to fetch. | 
 **sid** | **str**| The SID of the Workflow resource to fetch. | 

### Return type

[**TaskrouterV1WorkspaceWorkflow**](TaskrouterV1WorkspaceWorkflow.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workflow_cumulative_statistics**
> TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics fetch_workflow_cumulative_statistics(workspace_sid, workflow_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_cumulative_statistics import TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the resource to fetch.
    workflow_sid = 'workflow_sid_example' # str | Returns the list of Tasks that are being controlled by the Workflow with the specified Sid value.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, `5,30` would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. TaskRouter will calculate statistics on up to 10,000 Tasks for any given threshold. (optional)

    try:
        api_response = api_instance.fetch_workflow_cumulative_statistics(workspace_sid, workflow_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_workflow_cumulative_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workflow_cumulative_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the resource to fetch. | 
 **workflow_sid** | **str**| Returns the list of Tasks that are being controlled by the Workflow with the specified Sid value. | 
 **end_date** | **datetime**| Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, &#x60;5,30&#x60; would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. TaskRouter will calculate statistics on up to 10,000 Tasks for any given threshold. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics**](TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workflow_real_time_statistics**
> TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics fetch_workflow_real_time_statistics(workspace_sid, workflow_sid, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_real_time_statistics import TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to fetch.
    workflow_sid = 'workflow_sid_example' # str | Returns the list of Tasks that are being controlled by the Workflow with the specified SID value.
    task_channel = 'task_channel_example' # str | Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_workflow_real_time_statistics(workspace_sid, workflow_sid, task_channel=task_channel)
        print("The response of DefaultApi->fetch_workflow_real_time_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workflow_real_time_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to fetch. | 
 **workflow_sid** | **str**| Returns the list of Tasks that are being controlled by the Workflow with the specified SID value. | 
 **task_channel** | **str**| Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics**](TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workflow_statistics**
> TaskrouterV1WorkspaceWorkflowWorkflowStatistics fetch_workflow_statistics(workspace_sid, workflow_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_statistics import TaskrouterV1WorkspaceWorkflowWorkflowStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to fetch.
    workflow_sid = 'workflow_sid_example' # str | Returns the list of Tasks that are being controlled by the Workflow with the specified SID value.
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    task_channel = 'task_channel_example' # str | Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, `5,30` would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. (optional)

    try:
        api_response = api_instance.fetch_workflow_statistics(workspace_sid, workflow_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_workflow_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workflow_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to fetch. | 
 **workflow_sid** | **str**| Returns the list of Tasks that are being controlled by the Workflow with the specified SID value. | 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **task_channel** | **str**| Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, &#x60;5,30&#x60; would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkflowWorkflowStatistics**](TaskrouterV1WorkspaceWorkflowWorkflowStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workspace**
> TaskrouterV1Workspace fetch_workspace(sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace import TaskrouterV1Workspace
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sid = 'sid_example' # str | The SID of the Workspace resource to fetch.

    try:
        api_response = api_instance.fetch_workspace(sid)
        print("The response of DefaultApi->fetch_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **str**| The SID of the Workspace resource to fetch. | 

### Return type

[**TaskrouterV1Workspace**](TaskrouterV1Workspace.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workspace_cumulative_statistics**
> TaskrouterV1WorkspaceWorkspaceCumulativeStatistics fetch_workspace_cumulative_statistics(workspace_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workspace_cumulative_statistics import TaskrouterV1WorkspaceWorkspaceCumulativeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace to fetch.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, `5,30` would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. TaskRouter will calculate statistics on up to 10,000 Tasks for any given threshold. (optional)

    try:
        api_response = api_instance.fetch_workspace_cumulative_statistics(workspace_sid, end_date=end_date, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_workspace_cumulative_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workspace_cumulative_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace to fetch. | 
 **end_date** | **datetime**| Only include usage that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate cumulative statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, &#x60;5,30&#x60; would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. TaskRouter will calculate statistics on up to 10,000 Tasks for any given threshold. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkspaceCumulativeStatistics**](TaskrouterV1WorkspaceWorkspaceCumulativeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workspace_real_time_statistics**
> TaskrouterV1WorkspaceWorkspaceRealTimeStatistics fetch_workspace_real_time_statistics(workspace_sid, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workspace_real_time_statistics import TaskrouterV1WorkspaceWorkspaceRealTimeStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace to fetch.
    task_channel = 'task_channel_example' # str | Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.fetch_workspace_real_time_statistics(workspace_sid, task_channel=task_channel)
        print("The response of DefaultApi->fetch_workspace_real_time_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workspace_real_time_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace to fetch. | 
 **task_channel** | **str**| Only calculate real-time statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkspaceRealTimeStatistics**](TaskrouterV1WorkspaceWorkspaceRealTimeStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_workspace_statistics**
> TaskrouterV1WorkspaceWorkspaceStatistics fetch_workspace_statistics(workspace_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workspace_statistics import TaskrouterV1WorkspaceWorkspaceStatistics
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace to fetch.
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    task_channel = 'task_channel_example' # str | Only calculate statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, `5,30` would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. (optional)

    try:
        api_response = api_instance.fetch_workspace_statistics(workspace_sid, minutes=minutes, start_date=start_date, end_date=end_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time)
        print("The response of DefaultApi->fetch_workspace_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_workspace_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace to fetch. | 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default 15 minutes. This is helpful for displaying statistics for the last 15 minutes, 240 minutes (4 hours), and 480 minutes (8 hours) to see trends. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **task_channel** | **str**| Only calculate statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. For example, &#x60;5,30&#x60; would show splits of Tasks that were canceled or accepted before and after 5 seconds and before and after 30 seconds. This can be used to show short abandoned Tasks or Tasks that failed to meet an SLA. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkspaceStatistics**](TaskrouterV1WorkspaceWorkspaceStatistics.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_activity**
> ListActivityResponse list_activity(workspace_sid, friendly_name=friendly_name, available=available, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_activity_response import ListActivityResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Activity resources to read.
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the Activity resources to read. (optional)
    available = 'available_example' # str | Whether return only Activity resources that are available or unavailable. A value of `true` returns only available activities. Values of '1' or `yes` also indicate `true`. All other values represent `false` and return activities that are unavailable. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_activity(workspace_sid, friendly_name=friendly_name, available=available, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Activity resources to read. | 
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the Activity resources to read. | [optional] 
 **available** | **str**| Whether return only Activity resources that are available or unavailable. A value of &#x60;true&#x60; returns only available activities. Values of &#39;1&#39; or &#x60;yes&#x60; also indicate &#x60;true&#x60;. All other values represent &#x60;false&#x60; and return activities that are unavailable. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListActivityResponse**](ListActivityResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_event**
> ListEventResponse list_event(workspace_sid, end_date=end_date, event_type=event_type, minutes=minutes, reservation_sid=reservation_sid, start_date=start_date, task_queue_sid=task_queue_sid, task_sid=task_sid, worker_sid=worker_sid, workflow_sid=workflow_sid, task_channel=task_channel, sid=sid, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_event_response import ListEventResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Events to read. Returns only the Events that pertain to the specified Workspace.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only include Events that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    event_type = 'event_type_example' # str | The type of Events to read. Returns only Events of the type specified. (optional)
    minutes = 56 # int | The period of events to read in minutes. Returns only Events that occurred since this many minutes in the past. The default is `15` minutes. Task Attributes for Events occuring more 43,200 minutes ago will be redacted. (optional)
    reservation_sid = 'reservation_sid_example' # str | The SID of the Reservation with the Events to read. Returns only Events that pertain to the specified Reservation. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only include Events from on or after this date and time, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Task Attributes for Events older than 30 days will be redacted. (optional)
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue with the Events to read. Returns only the Events that pertain to the specified TaskQueue. (optional)
    task_sid = 'task_sid_example' # str | The SID of the Task with the Events to read. Returns only the Events that pertain to the specified Task. (optional)
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the Events to read. Returns only the Events that pertain to the specified Worker. (optional)
    workflow_sid = 'workflow_sid_example' # str | The SID of the Workflow with the Events to read. Returns only the Events that pertain to the specified Workflow. (optional)
    task_channel = 'task_channel_example' # str | The TaskChannel with the Events to read. Returns only the Events that pertain to the specified TaskChannel. (optional)
    sid = 'sid_example' # str | The SID of the Event resource to read. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_event(workspace_sid, end_date=end_date, event_type=event_type, minutes=minutes, reservation_sid=reservation_sid, start_date=start_date, task_queue_sid=task_queue_sid, task_sid=task_sid, worker_sid=worker_sid, workflow_sid=workflow_sid, task_channel=task_channel, sid=sid, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_event:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_event: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Events to read. Returns only the Events that pertain to the specified Workspace. | 
 **end_date** | **datetime**| Only include Events that occurred on or before this date, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **event_type** | **str**| The type of Events to read. Returns only Events of the type specified. | [optional] 
 **minutes** | **int**| The period of events to read in minutes. Returns only Events that occurred since this many minutes in the past. The default is &#x60;15&#x60; minutes. Task Attributes for Events occuring more 43,200 minutes ago will be redacted. | [optional] 
 **reservation_sid** | **str**| The SID of the Reservation with the Events to read. Returns only Events that pertain to the specified Reservation. | [optional] 
 **start_date** | **datetime**| Only include Events from on or after this date and time, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Task Attributes for Events older than 30 days will be redacted. | [optional] 
 **task_queue_sid** | **str**| The SID of the TaskQueue with the Events to read. Returns only the Events that pertain to the specified TaskQueue. | [optional] 
 **task_sid** | **str**| The SID of the Task with the Events to read. Returns only the Events that pertain to the specified Task. | [optional] 
 **worker_sid** | **str**| The SID of the Worker with the Events to read. Returns only the Events that pertain to the specified Worker. | [optional] 
 **workflow_sid** | **str**| The SID of the Workflow with the Events to read. Returns only the Events that pertain to the specified Workflow. | [optional] 
 **task_channel** | **str**| The TaskChannel with the Events to read. Returns only the Events that pertain to the specified TaskChannel. | [optional] 
 **sid** | **str**| The SID of the Event resource to read. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListEventResponse**](ListEventResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_task**
> ListTaskResponse list_task(workspace_sid, priority=priority, assignment_status=assignment_status, workflow_sid=workflow_sid, workflow_name=workflow_name, task_queue_sid=task_queue_sid, task_queue_name=task_queue_name, evaluate_task_attributes=evaluate_task_attributes, ordering=ordering, has_addons=has_addons, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_task_response import ListTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Tasks to read.
    priority = 56 # int | The priority value of the Tasks to read. Returns the list of all Tasks in the Workspace with the specified priority. (optional)
    assignment_status = ['assignment_status_example'] # List[str] | The `assignment_status` of the Tasks you want to read. Can be: `pending`, `reserved`, `assigned`, `canceled`, `wrapping`, or `completed`. Returns all Tasks in the Workspace with the specified `assignment_status`. (optional)
    workflow_sid = 'workflow_sid_example' # str | The SID of the Workflow with the Tasks to read. Returns the Tasks controlled by the Workflow identified by this SID. (optional)
    workflow_name = 'workflow_name_example' # str | The friendly name of the Workflow with the Tasks to read. Returns the Tasks controlled by the Workflow identified by this friendly name. (optional)
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue with the Tasks to read. Returns the Tasks waiting in the TaskQueue identified by this SID. (optional)
    task_queue_name = 'task_queue_name_example' # str | The `friendly_name` of the TaskQueue with the Tasks to read. Returns the Tasks waiting in the TaskQueue identified by this friendly name. (optional)
    evaluate_task_attributes = 'evaluate_task_attributes_example' # str | The attributes of the Tasks to read. Returns the Tasks that match the attributes specified in this parameter. (optional)
    ordering = 'ordering_example' # str | How to order the returned Task resources. y default, Tasks are sorted by ascending DateCreated. This value is specified as: `Attribute:Order`, where `Attribute` can be either `Priority` or `DateCreated` and `Order` can be either `asc` or `desc`. For example, `Priority:desc` returns Tasks ordered in descending order of their Priority. Multiple sort orders can be specified in a comma-separated list such as `Priority:desc,DateCreated:asc`, which returns the Tasks in descending Priority order and ascending DateCreated Order. (optional)
    has_addons = True # bool | Whether to read Tasks with addons. If `true`, returns only Tasks with addons. If `false`, returns only Tasks without addons. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_task(workspace_sid, priority=priority, assignment_status=assignment_status, workflow_sid=workflow_sid, workflow_name=workflow_name, task_queue_sid=task_queue_sid, task_queue_name=task_queue_name, evaluate_task_attributes=evaluate_task_attributes, ordering=ordering, has_addons=has_addons, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Tasks to read. | 
 **priority** | **int**| The priority value of the Tasks to read. Returns the list of all Tasks in the Workspace with the specified priority. | [optional] 
 **assignment_status** | [**List[str]**](str.md)| The &#x60;assignment_status&#x60; of the Tasks you want to read. Can be: &#x60;pending&#x60;, &#x60;reserved&#x60;, &#x60;assigned&#x60;, &#x60;canceled&#x60;, &#x60;wrapping&#x60;, or &#x60;completed&#x60;. Returns all Tasks in the Workspace with the specified &#x60;assignment_status&#x60;. | [optional] 
 **workflow_sid** | **str**| The SID of the Workflow with the Tasks to read. Returns the Tasks controlled by the Workflow identified by this SID. | [optional] 
 **workflow_name** | **str**| The friendly name of the Workflow with the Tasks to read. Returns the Tasks controlled by the Workflow identified by this friendly name. | [optional] 
 **task_queue_sid** | **str**| The SID of the TaskQueue with the Tasks to read. Returns the Tasks waiting in the TaskQueue identified by this SID. | [optional] 
 **task_queue_name** | **str**| The &#x60;friendly_name&#x60; of the TaskQueue with the Tasks to read. Returns the Tasks waiting in the TaskQueue identified by this friendly name. | [optional] 
 **evaluate_task_attributes** | **str**| The attributes of the Tasks to read. Returns the Tasks that match the attributes specified in this parameter. | [optional] 
 **ordering** | **str**| How to order the returned Task resources. y default, Tasks are sorted by ascending DateCreated. This value is specified as: &#x60;Attribute:Order&#x60;, where &#x60;Attribute&#x60; can be either &#x60;Priority&#x60; or &#x60;DateCreated&#x60; and &#x60;Order&#x60; can be either &#x60;asc&#x60; or &#x60;desc&#x60;. For example, &#x60;Priority:desc&#x60; returns Tasks ordered in descending order of their Priority. Multiple sort orders can be specified in a comma-separated list such as &#x60;Priority:desc,DateCreated:asc&#x60;, which returns the Tasks in descending Priority order and ascending DateCreated Order. | [optional] 
 **has_addons** | **bool**| Whether to read Tasks with addons. If &#x60;true&#x60;, returns only Tasks with addons. If &#x60;false&#x60;, returns only Tasks without addons. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListTaskResponse**](ListTaskResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_task_channel**
> ListTaskChannelResponse list_task_channel(workspace_sid, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_task_channel_response import ListTaskChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task Channel to read.
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_task_channel(workspace_sid, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_task_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_task_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task Channel to read. | 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListTaskChannelResponse**](ListTaskChannelResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_task_queue**
> ListTaskQueueResponse list_task_queue(workspace_sid, friendly_name=friendly_name, evaluate_worker_attributes=evaluate_worker_attributes, worker_sid=worker_sid, ordering=ordering, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_task_queue_response import ListTaskQueueResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to read.
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the TaskQueue resources to read. (optional)
    evaluate_worker_attributes = 'evaluate_worker_attributes_example' # str | The attributes of the Workers to read. Returns the TaskQueues with Workers that match the attributes specified in this parameter. (optional)
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the TaskQueue resources to read. (optional)
    ordering = 'ordering_example' # str | Sorting parameter for TaskQueues (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_task_queue(workspace_sid, friendly_name=friendly_name, evaluate_worker_attributes=evaluate_worker_attributes, worker_sid=worker_sid, ordering=ordering, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_task_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_task_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to read. | 
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the TaskQueue resources to read. | [optional] 
 **evaluate_worker_attributes** | **str**| The attributes of the Workers to read. Returns the TaskQueues with Workers that match the attributes specified in this parameter. | [optional] 
 **worker_sid** | **str**| The SID of the Worker with the TaskQueue resources to read. | [optional] 
 **ordering** | **str**| Sorting parameter for TaskQueues | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListTaskQueueResponse**](ListTaskQueueResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_task_queues_statistics**
> ListTaskQueuesStatisticsResponse list_task_queues_statistics(workspace_sid, end_date=end_date, friendly_name=friendly_name, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_task_queues_statistics_response import ListTaskQueuesStatisticsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueues to read.
    end_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. (optional)
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the TaskQueue statistics to read. (optional)
    minutes = 56 # int | Only calculate statistics since this many minutes in the past. The default is 15 minutes. (optional)
    start_date = '2013-10-20T19:20:30+01:00' # datetime | Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. (optional)
    task_channel = 'task_channel_example' # str | Only calculate statistics on this TaskChannel. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)
    split_by_wait_time = 'split_by_wait_time_example' # str | A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_task_queues_statistics(workspace_sid, end_date=end_date, friendly_name=friendly_name, minutes=minutes, start_date=start_date, task_channel=task_channel, split_by_wait_time=split_by_wait_time, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_task_queues_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_task_queues_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueues to read. | 
 **end_date** | **datetime**| Only calculate statistics from this date and time and earlier, specified in GMT as an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time. | [optional] 
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the TaskQueue statistics to read. | [optional] 
 **minutes** | **int**| Only calculate statistics since this many minutes in the past. The default is 15 minutes. | [optional] 
 **start_date** | **datetime**| Only calculate statistics from this date and time and later, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
 **task_channel** | **str**| Only calculate statistics on this TaskChannel. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 
 **split_by_wait_time** | **str**| A comma separated list of values that describes the thresholds, in seconds, to calculate statistics on. For each threshold specified, the number of Tasks canceled and reservations accepted above and below the specified thresholds in seconds are computed. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListTaskQueuesStatisticsResponse**](ListTaskQueuesStatisticsResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_task_reservation**
> ListTaskReservationResponse list_task_reservation(workspace_sid, task_sid, reservation_status=reservation_status, worker_sid=worker_sid, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_task_reservation_response import ListTaskReservationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskReservation resources to read.
    task_sid = 'task_sid_example' # str | The SID of the reserved Task resource with the TaskReservation resources to read.
    reservation_status = openapi_client.TaskReservationEnumStatus() # TaskReservationEnumStatus | Returns the list of reservations for a task with a specified ReservationStatus.  Can be: `pending`, `accepted`, `rejected`, or `timeout`. (optional)
    worker_sid = 'worker_sid_example' # str | The SID of the reserved Worker resource to read. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_task_reservation(workspace_sid, task_sid, reservation_status=reservation_status, worker_sid=worker_sid, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_task_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_task_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskReservation resources to read. | 
 **task_sid** | **str**| The SID of the reserved Task resource with the TaskReservation resources to read. | 
 **reservation_status** | **TaskReservationEnumStatus**| Returns the list of reservations for a task with a specified ReservationStatus.  Can be: &#x60;pending&#x60;, &#x60;accepted&#x60;, &#x60;rejected&#x60;, or &#x60;timeout&#x60;. | [optional] 
 **worker_sid** | **str**| The SID of the reserved Worker resource to read. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListTaskReservationResponse**](ListTaskReservationResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_worker**
> ListWorkerResponse list_worker(workspace_sid, activity_name=activity_name, activity_sid=activity_sid, available=available, friendly_name=friendly_name, target_workers_expression=target_workers_expression, task_queue_name=task_queue_name, task_queue_sid=task_queue_sid, ordering=ordering, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_worker_response import ListWorkerResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workers to read.
    activity_name = 'activity_name_example' # str | The `activity_name` of the Worker resources to read. (optional)
    activity_sid = 'activity_sid_example' # str | The `activity_sid` of the Worker resources to read. (optional)
    available = 'available_example' # str | Whether to return only Worker resources that are available or unavailable. Can be `true`, `1`, or `yes` to return Worker resources that are available, and `false`, or any value returns the Worker resources that are not available. (optional)
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the Worker resources to read. (optional)
    target_workers_expression = 'target_workers_expression_example' # str | Filter by Workers that would match an expression on a TaskQueue. This is helpful for debugging which Workers would match a potential queue. (optional)
    task_queue_name = 'task_queue_name_example' # str | The `friendly_name` of the TaskQueue that the Workers to read are eligible for. (optional)
    task_queue_sid = 'task_queue_sid_example' # str | The SID of the TaskQueue that the Workers to read are eligible for. (optional)
    ordering = 'ordering_example' # str | Sorting parameter for Workers (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_worker(workspace_sid, activity_name=activity_name, activity_sid=activity_sid, available=available, friendly_name=friendly_name, target_workers_expression=target_workers_expression, task_queue_name=task_queue_name, task_queue_sid=task_queue_sid, ordering=ordering, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_worker:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_worker: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workers to read. | 
 **activity_name** | **str**| The &#x60;activity_name&#x60; of the Worker resources to read. | [optional] 
 **activity_sid** | **str**| The &#x60;activity_sid&#x60; of the Worker resources to read. | [optional] 
 **available** | **str**| Whether to return only Worker resources that are available or unavailable. Can be &#x60;true&#x60;, &#x60;1&#x60;, or &#x60;yes&#x60; to return Worker resources that are available, and &#x60;false&#x60;, or any value returns the Worker resources that are not available. | [optional] 
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the Worker resources to read. | [optional] 
 **target_workers_expression** | **str**| Filter by Workers that would match an expression on a TaskQueue. This is helpful for debugging which Workers would match a potential queue. | [optional] 
 **task_queue_name** | **str**| The &#x60;friendly_name&#x60; of the TaskQueue that the Workers to read are eligible for. | [optional] 
 **task_queue_sid** | **str**| The SID of the TaskQueue that the Workers to read are eligible for. | [optional] 
 **ordering** | **str**| Sorting parameter for Workers | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListWorkerResponse**](ListWorkerResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_worker_channel**
> ListWorkerChannelResponse list_worker_channel(workspace_sid, worker_sid, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_worker_channel_response import ListWorkerChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerChannels to read.
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the WorkerChannels to read.
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_worker_channel(workspace_sid, worker_sid, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_worker_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_worker_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerChannels to read. | 
 **worker_sid** | **str**| The SID of the Worker with the WorkerChannels to read. | 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListWorkerChannelResponse**](ListWorkerChannelResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_worker_reservation**
> ListWorkerReservationResponse list_worker_reservation(workspace_sid, worker_sid, reservation_status=reservation_status, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_worker_reservation_response import ListWorkerReservationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerReservation resources to read.
    worker_sid = 'worker_sid_example' # str | The SID of the reserved Worker resource with the WorkerReservation resources to read.
    reservation_status = openapi_client.WorkerReservationEnumStatus() # WorkerReservationEnumStatus | Returns the list of reservations for a worker with a specified ReservationStatus. Can be: `pending`, `accepted`, `rejected`, `timeout`, `canceled`, or `rescinded`. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_worker_reservation(workspace_sid, worker_sid, reservation_status=reservation_status, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_worker_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_worker_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerReservation resources to read. | 
 **worker_sid** | **str**| The SID of the reserved Worker resource with the WorkerReservation resources to read. | 
 **reservation_status** | **WorkerReservationEnumStatus**| Returns the list of reservations for a worker with a specified ReservationStatus. Can be: &#x60;pending&#x60;, &#x60;accepted&#x60;, &#x60;rejected&#x60;, &#x60;timeout&#x60;, &#x60;canceled&#x60;, or &#x60;rescinded&#x60;. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListWorkerReservationResponse**](ListWorkerReservationResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_workflow**
> ListWorkflowResponse list_workflow(workspace_sid, friendly_name=friendly_name, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_workflow_response import ListWorkflowResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to read.
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the Workflow resources to read. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_workflow(workspace_sid, friendly_name=friendly_name, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to read. | 
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the Workflow resources to read. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListWorkflowResponse**](ListWorkflowResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_workspace**
> ListWorkspaceResponse list_workspace(friendly_name=friendly_name, page_size=page_size, page=page, page_token=page_token)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.list_workspace_response import ListWorkspaceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    friendly_name = 'friendly_name_example' # str | The `friendly_name` of the Workspace resources to read. For example `Customer Support` or `2014 Election Campaign`. (optional)
    page_size = 56 # int | How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
    page = 56 # int | The page index. This value is simply for client state. (optional)
    page_token = 'page_token_example' # str | The page token. This is provided by the API. (optional)

    try:
        api_response = api_instance.list_workspace(friendly_name=friendly_name, page_size=page_size, page=page, page_token=page_token)
        print("The response of DefaultApi->list_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **friendly_name** | **str**| The &#x60;friendly_name&#x60; of the Workspace resources to read. For example &#x60;Customer Support&#x60; or &#x60;2014 Election Campaign&#x60;. | [optional] 
 **page_size** | **int**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] 
 **page** | **int**| The page index. This value is simply for client state. | [optional] 
 **page_token** | **str**| The page token. This is provided by the API. | [optional] 

### Return type

[**ListWorkspaceResponse**](ListWorkspaceResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_activity**
> TaskrouterV1WorkspaceActivity update_activity(workspace_sid, sid, friendly_name=friendly_name)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_activity import TaskrouterV1WorkspaceActivity
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Activity resources to update.
    sid = 'sid_example' # str | The SID of the Activity resource to update.
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Activity resource. It can be up to 64 characters long. These names are used to calculate and expose statistics about Workers, and provide visibility into the state of each Worker. Examples of friendly names include: `on-call`, `break`, and `email`. (optional)

    try:
        api_response = api_instance.update_activity(workspace_sid, sid, friendly_name=friendly_name)
        print("The response of DefaultApi->update_activity:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_activity: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Activity resources to update. | 
 **sid** | **str**| The SID of the Activity resource to update. | 
 **friendly_name** | **str**| A descriptive string that you create to describe the Activity resource. It can be up to 64 characters long. These names are used to calculate and expose statistics about Workers, and provide visibility into the state of each Worker. Examples of friendly names include: &#x60;on-call&#x60;, &#x60;break&#x60;, and &#x60;email&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceActivity**](TaskrouterV1WorkspaceActivity.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_task**
> TaskrouterV1WorkspaceTask update_task(workspace_sid, sid, if_match=if_match, assignment_status=assignment_status, attributes=attributes, priority=priority, reason=reason, task_channel=task_channel)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task import TaskrouterV1WorkspaceTask
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task to update.
    sid = 'sid_example' # str | The SID of the Task resource to update.
    if_match = 'if_match_example' # str | If provided, applies this mutation if (and only if) the [ETag](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag) header of the Task matches the provided value. This matches the semantics of (and is implemented with) the HTTP [If-Match header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Match). (optional)
    assignment_status = openapi_client.TaskEnumStatus() # TaskEnumStatus |  (optional)
    attributes = 'attributes_example' # str | The JSON string that describes the custom attributes of the task. (optional)
    priority = 56 # int | The Task's new priority value. When supplied, the Task takes on the specified priority unless it matches a Workflow Target with a Priority set. Value can be 0 to 2^31^ (2,147,483,647). (optional)
    reason = 'reason_example' # str | The reason that the Task was canceled or completed. This parameter is required only if the Task is canceled or completed. Setting this value queues the task for deletion and logs the reason. (optional)
    task_channel = 'task_channel_example' # str | When MultiTasking is enabled, specify the TaskChannel with the task to update. Can be the TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or `default`. (optional)

    try:
        api_response = api_instance.update_task(workspace_sid, sid, if_match=if_match, assignment_status=assignment_status, attributes=attributes, priority=priority, reason=reason, task_channel=task_channel)
        print("The response of DefaultApi->update_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task to update. | 
 **sid** | **str**| The SID of the Task resource to update. | 
 **if_match** | **str**| If provided, applies this mutation if (and only if) the [ETag](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag) header of the Task matches the provided value. This matches the semantics of (and is implemented with) the HTTP [If-Match header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Match). | [optional] 
 **assignment_status** | **TaskEnumStatus**|  | [optional] 
 **attributes** | **str**| The JSON string that describes the custom attributes of the task. | [optional] 
 **priority** | **int**| The Task&#39;s new priority value. When supplied, the Task takes on the specified priority unless it matches a Workflow Target with a Priority set. Value can be 0 to 2^31^ (2,147,483,647). | [optional] 
 **reason** | **str**| The reason that the Task was canceled or completed. This parameter is required only if the Task is canceled or completed. Setting this value queues the task for deletion and logs the reason. | [optional] 
 **task_channel** | **str**| When MultiTasking is enabled, specify the TaskChannel with the task to update. Can be the TaskChannel&#39;s SID or its &#x60;unique_name&#x60;, such as &#x60;voice&#x60;, &#x60;sms&#x60;, or &#x60;default&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTask**](TaskrouterV1WorkspaceTask.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_task_channel**
> TaskrouterV1WorkspaceTaskChannel update_task_channel(workspace_sid, sid, channel_optimized_routing=channel_optimized_routing, friendly_name=friendly_name)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_channel import TaskrouterV1WorkspaceTaskChannel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Task Channel to update.
    sid = 'sid_example' # str | The SID of the Task Channel resource to update.
    channel_optimized_routing = True # bool | Whether the TaskChannel should prioritize Workers that have been idle. If `true`, Workers that have been idle the longest are prioritized. (optional)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Task Channel. It can be up to 64 characters long. (optional)

    try:
        api_response = api_instance.update_task_channel(workspace_sid, sid, channel_optimized_routing=channel_optimized_routing, friendly_name=friendly_name)
        print("The response of DefaultApi->update_task_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_task_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Task Channel to update. | 
 **sid** | **str**| The SID of the Task Channel resource to update. | 
 **channel_optimized_routing** | **bool**| Whether the TaskChannel should prioritize Workers that have been idle. If &#x60;true&#x60;, Workers that have been idle the longest are prioritized. | [optional] 
 **friendly_name** | **str**| A descriptive string that you create to describe the Task Channel. It can be up to 64 characters long. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskChannel**](TaskrouterV1WorkspaceTaskChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_task_queue**
> TaskrouterV1WorkspaceTaskQueue update_task_queue(workspace_sid, sid, assignment_activity_sid=assignment_activity_sid, friendly_name=friendly_name, max_reserved_workers=max_reserved_workers, reservation_activity_sid=reservation_activity_sid, target_workers=target_workers, task_order=task_order)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_queue import TaskrouterV1WorkspaceTaskQueue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskQueue to update.
    sid = 'sid_example' # str | The SID of the TaskQueue resource to update.
    assignment_activity_sid = 'assignment_activity_sid_example' # str | The SID of the Activity to assign Workers when a task is assigned for them. (optional)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the TaskQueue. For example `Support-Tier 1`, `Sales`, or `Escalation`. (optional)
    max_reserved_workers = 56 # int | The maximum number of Workers to create reservations for the assignment of a task while in the queue. Maximum of 50. (optional)
    reservation_activity_sid = 'reservation_activity_sid_example' # str | The SID of the Activity to assign Workers when a task is reserved for them. (optional)
    target_workers = 'target_workers_example' # str | A string describing the Worker selection criteria for any Tasks that enter the TaskQueue. For example '\\\"language\\\" == \\\"spanish\\\"' If no TargetWorkers parameter is provided, Tasks will wait in the queue until they are either deleted or moved to another queue. Additional examples on how to describing Worker selection criteria below. (optional)
    task_order = openapi_client.TaskQueueEnumTaskOrder() # TaskQueueEnumTaskOrder |  (optional)

    try:
        api_response = api_instance.update_task_queue(workspace_sid, sid, assignment_activity_sid=assignment_activity_sid, friendly_name=friendly_name, max_reserved_workers=max_reserved_workers, reservation_activity_sid=reservation_activity_sid, target_workers=target_workers, task_order=task_order)
        print("The response of DefaultApi->update_task_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_task_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskQueue to update. | 
 **sid** | **str**| The SID of the TaskQueue resource to update. | 
 **assignment_activity_sid** | **str**| The SID of the Activity to assign Workers when a task is assigned for them. | [optional] 
 **friendly_name** | **str**| A descriptive string that you create to describe the TaskQueue. For example &#x60;Support-Tier 1&#x60;, &#x60;Sales&#x60;, or &#x60;Escalation&#x60;. | [optional] 
 **max_reserved_workers** | **int**| The maximum number of Workers to create reservations for the assignment of a task while in the queue. Maximum of 50. | [optional] 
 **reservation_activity_sid** | **str**| The SID of the Activity to assign Workers when a task is reserved for them. | [optional] 
 **target_workers** | **str**| A string describing the Worker selection criteria for any Tasks that enter the TaskQueue. For example &#39;\\\&quot;language\\\&quot; &#x3D;&#x3D; \\\&quot;spanish\\\&quot;&#39; If no TargetWorkers parameter is provided, Tasks will wait in the queue until they are either deleted or moved to another queue. Additional examples on how to describing Worker selection criteria below. | [optional] 
 **task_order** | **TaskQueueEnumTaskOrder**|  | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskQueue**](TaskrouterV1WorkspaceTaskQueue.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_task_reservation**
> TaskrouterV1WorkspaceTaskTaskReservation update_task_reservation(workspace_sid, task_sid, sid, if_match=if_match, beep=beep, beep_on_customer_entrance=beep_on_customer_entrance, call_accept=call_accept, call_from=call_from, call_record=call_record, call_status_callback_url=call_status_callback_url, call_timeout=call_timeout, call_to=call_to, call_url=call_url, conference_record=conference_record, conference_recording_status_callback=conference_recording_status_callback, conference_recording_status_callback_method=conference_recording_status_callback_method, conference_status_callback=conference_status_callback, conference_status_callback_event=conference_status_callback_event, conference_status_callback_method=conference_status_callback_method, conference_trim=conference_trim, dequeue_from=dequeue_from, dequeue_post_work_activity_sid=dequeue_post_work_activity_sid, dequeue_record=dequeue_record, dequeue_status_callback_event=dequeue_status_callback_event, dequeue_status_callback_url=dequeue_status_callback_url, dequeue_timeout=dequeue_timeout, dequeue_to=dequeue_to, early_media=early_media, end_conference_on_customer_exit=end_conference_on_customer_exit, end_conference_on_exit=end_conference_on_exit, var_from=var_from, instruction=instruction, max_participants=max_participants, muted=muted, post_work_activity_sid=post_work_activity_sid, record=record, recording_channels=recording_channels, recording_status_callback=recording_status_callback, recording_status_callback_method=recording_status_callback_method, redirect_accept=redirect_accept, redirect_call_sid=redirect_call_sid, redirect_url=redirect_url, region=region, reservation_status=reservation_status, sip_auth_password=sip_auth_password, sip_auth_username=sip_auth_username, start_conference_on_enter=start_conference_on_enter, status_callback=status_callback, status_callback_event=status_callback_event, status_callback_method=status_callback_method, supervisor=supervisor, supervisor_mode=supervisor_mode, timeout=timeout, to=to, wait_method=wait_method, wait_url=wait_url, worker_activity_sid=worker_activity_sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_task_task_reservation import TaskrouterV1WorkspaceTaskTaskReservation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the TaskReservation resources to update.
    task_sid = 'task_sid_example' # str | The SID of the reserved Task resource with the TaskReservation resources to update.
    sid = 'sid_example' # str | The SID of the TaskReservation resource to update.
    if_match = 'if_match_example' # str | The If-Match HTTP request header (optional)
    beep = 'beep_example' # str | Whether to play a notification beep when the participant joins or when to play a beep. Can be: `true`, `false`, `onEnter`, or `onExit`. The default value is `true`. (optional)
    beep_on_customer_entrance = True # bool | Whether to play a notification beep when the customer joins. (optional)
    call_accept = True # bool | Whether to accept a reservation when executing a Call instruction. (optional)
    call_from = 'call_from_example' # str | The Caller ID of the outbound call when executing a Call instruction. (optional)
    call_record = 'call_record_example' # str | Whether to record both legs of a call when executing a Call instruction or which leg to record. (optional)
    call_status_callback_url = 'call_status_callback_url_example' # str | The URL to call  for the completed call event when executing a Call instruction. (optional)
    call_timeout = 56 # int | Timeout for call when executing a Call instruction. (optional)
    call_to = 'call_to_example' # str | The Contact URI of the worker when executing a Call instruction.  Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    call_url = 'call_url_example' # str | TwiML URI executed on answering the worker's leg as a result of the Call instruction. (optional)
    conference_record = 'conference_record_example' # str | Whether to record the conference the participant is joining or when to record the conference. Can be: `true`, `false`, `record-from-start`, and `do-not-record`. The default value is `false`. (optional)
    conference_recording_status_callback = 'conference_recording_status_callback_example' # str | The URL we should call using the `conference_recording_status_callback_method` when the conference recording is available. (optional)
    conference_recording_status_callback_method = 'conference_recording_status_callback_method_example' # str | The HTTP method we should use to call `conference_recording_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    conference_status_callback = 'conference_status_callback_example' # str | The URL we should call using the `conference_status_callback_method` when the conference events in `conference_status_callback_event` occur. Only the value set by the first participant to join the conference is used. Subsequent `conference_status_callback` values are ignored. (optional)
    conference_status_callback_event = [openapi_client.TaskReservationEnumConferenceEvent()] # List[TaskReservationEnumConferenceEvent] | The conference status events that we will send to `conference_status_callback`. Can be: `start`, `end`, `join`, `leave`, `mute`, `hold`, `speaker`. (optional)
    conference_status_callback_method = 'conference_status_callback_method_example' # str | The HTTP method we should use to call `conference_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    conference_trim = 'conference_trim_example' # str | How to trim the leading and trailing silence from your recorded conference audio files. Can be: `trim-silence` or `do-not-trim` and defaults to `trim-silence`. (optional)
    dequeue_from = 'dequeue_from_example' # str | The Caller ID of the call to the worker when executing a Dequeue instruction. (optional)
    dequeue_post_work_activity_sid = 'dequeue_post_work_activity_sid_example' # str | The SID of the Activity resource to start after executing a Dequeue instruction. (optional)
    dequeue_record = 'dequeue_record_example' # str | Whether to record both legs of a call when executing a Dequeue instruction or which leg to record. (optional)
    dequeue_status_callback_event = ['dequeue_status_callback_event_example'] # List[str] | The Call progress events sent via webhooks as a result of a Dequeue instruction. (optional)
    dequeue_status_callback_url = 'dequeue_status_callback_url_example' # str | The Callback URL for completed call event when executing a Dequeue instruction. (optional)
    dequeue_timeout = 56 # int | Timeout for call when executing a Dequeue instruction. (optional)
    dequeue_to = 'dequeue_to_example' # str | The Contact URI of the worker when executing a Dequeue instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    early_media = True # bool | Whether to allow an agent to hear the state of the outbound call, including ringing or disconnect messages. The default is `true`. (optional)
    end_conference_on_customer_exit = True # bool | Whether to end the conference when the customer leaves. (optional)
    end_conference_on_exit = True # bool | Whether to end the conference when the agent leaves. (optional)
    var_from = 'var_from_example' # str | The Caller ID of the call to the worker when executing a Conference instruction. (optional)
    instruction = 'instruction_example' # str | The assignment instruction for reservation. (optional)
    max_participants = 56 # int | The maximum number of participants in the conference. Can be a positive integer from `2` to `250`. The default value is `250`. (optional)
    muted = True # bool | Whether the agent is muted in the conference. The default is `false`. (optional)
    post_work_activity_sid = 'post_work_activity_sid_example' # str | The new worker activity SID after executing a Conference instruction. (optional)
    record = True # bool | Whether to record the participant and their conferences, including the time between conferences. The default is `false`. (optional)
    recording_channels = 'recording_channels_example' # str | The recording channels for the final recording. Can be: `mono` or `dual` and the default is `mono`. (optional)
    recording_status_callback = 'recording_status_callback_example' # str | The URL that we should call using the `recording_status_callback_method` when the recording status changes. (optional)
    recording_status_callback_method = 'recording_status_callback_method_example' # str | The HTTP method we should use when we call `recording_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    redirect_accept = True # bool | Whether the reservation should be accepted when executing a Redirect instruction. (optional)
    redirect_call_sid = 'redirect_call_sid_example' # str | The Call SID of the call parked in the queue when executing a Redirect instruction. (optional)
    redirect_url = 'redirect_url_example' # str | TwiML URI to redirect the call to when executing the Redirect instruction. (optional)
    region = 'region_example' # str | The [region](https://support.twilio.com/hc/en-us/articles/223132167-How-global-low-latency-routing-and-region-selection-work-for-conferences-and-Client-calls) where we should mix the recorded audio. Can be:`us1`, `ie1`, `de1`, `sg1`, `br1`, `au1`, or `jp1`. (optional)
    reservation_status = openapi_client.TaskReservationEnumStatus() # TaskReservationEnumStatus |  (optional)
    sip_auth_password = 'sip_auth_password_example' # str | The SIP password for authentication. (optional)
    sip_auth_username = 'sip_auth_username_example' # str | The SIP username used for authentication. (optional)
    start_conference_on_enter = True # bool | Whether to start the conference when the participant joins, if it has not already started. The default is `true`. If `false` and the conference has not started, the participant is muted and hears background music until another participant starts the conference. (optional)
    status_callback = 'status_callback_example' # str | The URL we should call using the `status_callback_method` to send status information to your application. (optional)
    status_callback_event = [openapi_client.TaskReservationEnumCallStatus()] # List[TaskReservationEnumCallStatus] | The call progress events that we will send to `status_callback`. Can be: `initiated`, `ringing`, `answered`, or `completed`. (optional)
    status_callback_method = 'status_callback_method_example' # str | The HTTP method we should use to call `status_callback`. Can be: `POST` or `GET` and the default is `POST`. (optional)
    supervisor = 'supervisor_example' # str | The Supervisor SID/URI when executing the Supervise instruction. (optional)
    supervisor_mode = openapi_client.TaskReservationEnumSupervisorMode() # TaskReservationEnumSupervisorMode |  (optional)
    timeout = 56 # int | Timeout for call when executing a Conference instruction. (optional)
    to = 'to_example' # str | The Contact URI of the worker when executing a Conference instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    wait_method = 'wait_method_example' # str | The HTTP method we should use to call `wait_url`. Can be `GET` or `POST` and the default is `POST`. When using a static audio file, this should be `GET` so that we can cache the file. (optional)
    wait_url = 'wait_url_example' # str | The URL we should call using the `wait_method` for the music to play while participants are waiting for the conference to start. The default value is the URL of our standard hold music. [Learn more about hold music](https://www.twilio.com/labs/twimlets/holdmusic). (optional)
    worker_activity_sid = 'worker_activity_sid_example' # str | The new worker activity SID if rejecting a reservation. (optional)

    try:
        api_response = api_instance.update_task_reservation(workspace_sid, task_sid, sid, if_match=if_match, beep=beep, beep_on_customer_entrance=beep_on_customer_entrance, call_accept=call_accept, call_from=call_from, call_record=call_record, call_status_callback_url=call_status_callback_url, call_timeout=call_timeout, call_to=call_to, call_url=call_url, conference_record=conference_record, conference_recording_status_callback=conference_recording_status_callback, conference_recording_status_callback_method=conference_recording_status_callback_method, conference_status_callback=conference_status_callback, conference_status_callback_event=conference_status_callback_event, conference_status_callback_method=conference_status_callback_method, conference_trim=conference_trim, dequeue_from=dequeue_from, dequeue_post_work_activity_sid=dequeue_post_work_activity_sid, dequeue_record=dequeue_record, dequeue_status_callback_event=dequeue_status_callback_event, dequeue_status_callback_url=dequeue_status_callback_url, dequeue_timeout=dequeue_timeout, dequeue_to=dequeue_to, early_media=early_media, end_conference_on_customer_exit=end_conference_on_customer_exit, end_conference_on_exit=end_conference_on_exit, var_from=var_from, instruction=instruction, max_participants=max_participants, muted=muted, post_work_activity_sid=post_work_activity_sid, record=record, recording_channels=recording_channels, recording_status_callback=recording_status_callback, recording_status_callback_method=recording_status_callback_method, redirect_accept=redirect_accept, redirect_call_sid=redirect_call_sid, redirect_url=redirect_url, region=region, reservation_status=reservation_status, sip_auth_password=sip_auth_password, sip_auth_username=sip_auth_username, start_conference_on_enter=start_conference_on_enter, status_callback=status_callback, status_callback_event=status_callback_event, status_callback_method=status_callback_method, supervisor=supervisor, supervisor_mode=supervisor_mode, timeout=timeout, to=to, wait_method=wait_method, wait_url=wait_url, worker_activity_sid=worker_activity_sid)
        print("The response of DefaultApi->update_task_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_task_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the TaskReservation resources to update. | 
 **task_sid** | **str**| The SID of the reserved Task resource with the TaskReservation resources to update. | 
 **sid** | **str**| The SID of the TaskReservation resource to update. | 
 **if_match** | **str**| The If-Match HTTP request header | [optional] 
 **beep** | **str**| Whether to play a notification beep when the participant joins or when to play a beep. Can be: &#x60;true&#x60;, &#x60;false&#x60;, &#x60;onEnter&#x60;, or &#x60;onExit&#x60;. The default value is &#x60;true&#x60;. | [optional] 
 **beep_on_customer_entrance** | **bool**| Whether to play a notification beep when the customer joins. | [optional] 
 **call_accept** | **bool**| Whether to accept a reservation when executing a Call instruction. | [optional] 
 **call_from** | **str**| The Caller ID of the outbound call when executing a Call instruction. | [optional] 
 **call_record** | **str**| Whether to record both legs of a call when executing a Call instruction or which leg to record. | [optional] 
 **call_status_callback_url** | **str**| The URL to call  for the completed call event when executing a Call instruction. | [optional] 
 **call_timeout** | **int**| Timeout for call when executing a Call instruction. | [optional] 
 **call_to** | **str**| The Contact URI of the worker when executing a Call instruction.  Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **call_url** | **str**| TwiML URI executed on answering the worker&#39;s leg as a result of the Call instruction. | [optional] 
 **conference_record** | **str**| Whether to record the conference the participant is joining or when to record the conference. Can be: &#x60;true&#x60;, &#x60;false&#x60;, &#x60;record-from-start&#x60;, and &#x60;do-not-record&#x60;. The default value is &#x60;false&#x60;. | [optional] 
 **conference_recording_status_callback** | **str**| The URL we should call using the &#x60;conference_recording_status_callback_method&#x60; when the conference recording is available. | [optional] 
 **conference_recording_status_callback_method** | **str**| The HTTP method we should use to call &#x60;conference_recording_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **conference_status_callback** | **str**| The URL we should call using the &#x60;conference_status_callback_method&#x60; when the conference events in &#x60;conference_status_callback_event&#x60; occur. Only the value set by the first participant to join the conference is used. Subsequent &#x60;conference_status_callback&#x60; values are ignored. | [optional] 
 **conference_status_callback_event** | [**List[TaskReservationEnumConferenceEvent]**](TaskReservationEnumConferenceEvent.md)| The conference status events that we will send to &#x60;conference_status_callback&#x60;. Can be: &#x60;start&#x60;, &#x60;end&#x60;, &#x60;join&#x60;, &#x60;leave&#x60;, &#x60;mute&#x60;, &#x60;hold&#x60;, &#x60;speaker&#x60;. | [optional] 
 **conference_status_callback_method** | **str**| The HTTP method we should use to call &#x60;conference_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **conference_trim** | **str**| How to trim the leading and trailing silence from your recorded conference audio files. Can be: &#x60;trim-silence&#x60; or &#x60;do-not-trim&#x60; and defaults to &#x60;trim-silence&#x60;. | [optional] 
 **dequeue_from** | **str**| The Caller ID of the call to the worker when executing a Dequeue instruction. | [optional] 
 **dequeue_post_work_activity_sid** | **str**| The SID of the Activity resource to start after executing a Dequeue instruction. | [optional] 
 **dequeue_record** | **str**| Whether to record both legs of a call when executing a Dequeue instruction or which leg to record. | [optional] 
 **dequeue_status_callback_event** | [**List[str]**](str.md)| The Call progress events sent via webhooks as a result of a Dequeue instruction. | [optional] 
 **dequeue_status_callback_url** | **str**| The Callback URL for completed call event when executing a Dequeue instruction. | [optional] 
 **dequeue_timeout** | **int**| Timeout for call when executing a Dequeue instruction. | [optional] 
 **dequeue_to** | **str**| The Contact URI of the worker when executing a Dequeue instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **early_media** | **bool**| Whether to allow an agent to hear the state of the outbound call, including ringing or disconnect messages. The default is &#x60;true&#x60;. | [optional] 
 **end_conference_on_customer_exit** | **bool**| Whether to end the conference when the customer leaves. | [optional] 
 **end_conference_on_exit** | **bool**| Whether to end the conference when the agent leaves. | [optional] 
 **var_from** | **str**| The Caller ID of the call to the worker when executing a Conference instruction. | [optional] 
 **instruction** | **str**| The assignment instruction for reservation. | [optional] 
 **max_participants** | **int**| The maximum number of participants in the conference. Can be a positive integer from &#x60;2&#x60; to &#x60;250&#x60;. The default value is &#x60;250&#x60;. | [optional] 
 **muted** | **bool**| Whether the agent is muted in the conference. The default is &#x60;false&#x60;. | [optional] 
 **post_work_activity_sid** | **str**| The new worker activity SID after executing a Conference instruction. | [optional] 
 **record** | **bool**| Whether to record the participant and their conferences, including the time between conferences. The default is &#x60;false&#x60;. | [optional] 
 **recording_channels** | **str**| The recording channels for the final recording. Can be: &#x60;mono&#x60; or &#x60;dual&#x60; and the default is &#x60;mono&#x60;. | [optional] 
 **recording_status_callback** | **str**| The URL that we should call using the &#x60;recording_status_callback_method&#x60; when the recording status changes. | [optional] 
 **recording_status_callback_method** | **str**| The HTTP method we should use when we call &#x60;recording_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **redirect_accept** | **bool**| Whether the reservation should be accepted when executing a Redirect instruction. | [optional] 
 **redirect_call_sid** | **str**| The Call SID of the call parked in the queue when executing a Redirect instruction. | [optional] 
 **redirect_url** | **str**| TwiML URI to redirect the call to when executing the Redirect instruction. | [optional] 
 **region** | **str**| The [region](https://support.twilio.com/hc/en-us/articles/223132167-How-global-low-latency-routing-and-region-selection-work-for-conferences-and-Client-calls) where we should mix the recorded audio. Can be:&#x60;us1&#x60;, &#x60;ie1&#x60;, &#x60;de1&#x60;, &#x60;sg1&#x60;, &#x60;br1&#x60;, &#x60;au1&#x60;, or &#x60;jp1&#x60;. | [optional] 
 **reservation_status** | **TaskReservationEnumStatus**|  | [optional] 
 **sip_auth_password** | **str**| The SIP password for authentication. | [optional] 
 **sip_auth_username** | **str**| The SIP username used for authentication. | [optional] 
 **start_conference_on_enter** | **bool**| Whether to start the conference when the participant joins, if it has not already started. The default is &#x60;true&#x60;. If &#x60;false&#x60; and the conference has not started, the participant is muted and hears background music until another participant starts the conference. | [optional] 
 **status_callback** | **str**| The URL we should call using the &#x60;status_callback_method&#x60; to send status information to your application. | [optional] 
 **status_callback_event** | [**List[TaskReservationEnumCallStatus]**](TaskReservationEnumCallStatus.md)| The call progress events that we will send to &#x60;status_callback&#x60;. Can be: &#x60;initiated&#x60;, &#x60;ringing&#x60;, &#x60;answered&#x60;, or &#x60;completed&#x60;. | [optional] 
 **status_callback_method** | **str**| The HTTP method we should use to call &#x60;status_callback&#x60;. Can be: &#x60;POST&#x60; or &#x60;GET&#x60; and the default is &#x60;POST&#x60;. | [optional] 
 **supervisor** | **str**| The Supervisor SID/URI when executing the Supervise instruction. | [optional] 
 **supervisor_mode** | **TaskReservationEnumSupervisorMode**|  | [optional] 
 **timeout** | **int**| Timeout for call when executing a Conference instruction. | [optional] 
 **to** | **str**| The Contact URI of the worker when executing a Conference instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **wait_method** | **str**| The HTTP method we should use to call &#x60;wait_url&#x60;. Can be &#x60;GET&#x60; or &#x60;POST&#x60; and the default is &#x60;POST&#x60;. When using a static audio file, this should be &#x60;GET&#x60; so that we can cache the file. | [optional] 
 **wait_url** | **str**| The URL we should call using the &#x60;wait_method&#x60; for the music to play while participants are waiting for the conference to start. The default value is the URL of our standard hold music. [Learn more about hold music](https://www.twilio.com/labs/twimlets/holdmusic). | [optional] 
 **worker_activity_sid** | **str**| The new worker activity SID if rejecting a reservation. | [optional] 

### Return type

[**TaskrouterV1WorkspaceTaskTaskReservation**](TaskrouterV1WorkspaceTaskTaskReservation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_worker**
> TaskrouterV1WorkspaceWorker update_worker(workspace_sid, sid, if_match=if_match, activity_sid=activity_sid, attributes=attributes, friendly_name=friendly_name, reject_pending_reservations=reject_pending_reservations)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker import TaskrouterV1WorkspaceWorker
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Worker to update.
    sid = 'sid_example' # str | The SID of the Worker resource to update.
    if_match = 'if_match_example' # str | The If-Match HTTP request header (optional)
    activity_sid = 'activity_sid_example' # str | The SID of a valid Activity that will describe the Worker's initial state. See [Activities](https://www.twilio.com/docs/taskrouter/api/activity) for more information. (optional)
    attributes = 'attributes_example' # str | The JSON string that describes the Worker. For example: `{ \\\"email\\\": \\\"Bob@example.com\\\", \\\"phone\\\": \\\"+5095551234\\\" }`. This data is passed to the `assignment_callback_url` when TaskRouter assigns a Task to the Worker. Defaults to {}. (optional)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Worker. It can be up to 64 characters long. (optional)
    reject_pending_reservations = True # bool | Whether to reject the Worker's pending reservations. This option is only valid if the Worker's new [Activity](https://www.twilio.com/docs/taskrouter/api/activity) resource has its `availability` property set to `False`. (optional)

    try:
        api_response = api_instance.update_worker(workspace_sid, sid, if_match=if_match, activity_sid=activity_sid, attributes=attributes, friendly_name=friendly_name, reject_pending_reservations=reject_pending_reservations)
        print("The response of DefaultApi->update_worker:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_worker: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Worker to update. | 
 **sid** | **str**| The SID of the Worker resource to update. | 
 **if_match** | **str**| The If-Match HTTP request header | [optional] 
 **activity_sid** | **str**| The SID of a valid Activity that will describe the Worker&#39;s initial state. See [Activities](https://www.twilio.com/docs/taskrouter/api/activity) for more information. | [optional] 
 **attributes** | **str**| The JSON string that describes the Worker. For example: &#x60;{ \\\&quot;email\\\&quot;: \\\&quot;Bob@example.com\\\&quot;, \\\&quot;phone\\\&quot;: \\\&quot;+5095551234\\\&quot; }&#x60;. This data is passed to the &#x60;assignment_callback_url&#x60; when TaskRouter assigns a Task to the Worker. Defaults to {}. | [optional] 
 **friendly_name** | **str**| A descriptive string that you create to describe the Worker. It can be up to 64 characters long. | [optional] 
 **reject_pending_reservations** | **bool**| Whether to reject the Worker&#39;s pending reservations. This option is only valid if the Worker&#39;s new [Activity](https://www.twilio.com/docs/taskrouter/api/activity) resource has its &#x60;availability&#x60; property set to &#x60;False&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorker**](TaskrouterV1WorkspaceWorker.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_worker_channel**
> TaskrouterV1WorkspaceWorkerWorkerChannel update_worker_channel(workspace_sid, worker_sid, sid, available=available, capacity=capacity)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_channel import TaskrouterV1WorkspaceWorkerWorkerChannel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerChannel to update.
    worker_sid = 'worker_sid_example' # str | The SID of the Worker with the WorkerChannel to update.
    sid = 'sid_example' # str | The SID of the WorkerChannel to update.
    available = True # bool | Whether the WorkerChannel is available. Set to `false` to prevent the Worker from receiving any new Tasks of this TaskChannel type. (optional)
    capacity = 56 # int | The total number of Tasks that the Worker should handle for the TaskChannel type. TaskRouter creates reservations for Tasks of this TaskChannel type up to the specified capacity. If the capacity is 0, no new reservations will be created. (optional)

    try:
        api_response = api_instance.update_worker_channel(workspace_sid, worker_sid, sid, available=available, capacity=capacity)
        print("The response of DefaultApi->update_worker_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_worker_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerChannel to update. | 
 **worker_sid** | **str**| The SID of the Worker with the WorkerChannel to update. | 
 **sid** | **str**| The SID of the WorkerChannel to update. | 
 **available** | **bool**| Whether the WorkerChannel is available. Set to &#x60;false&#x60; to prevent the Worker from receiving any new Tasks of this TaskChannel type. | [optional] 
 **capacity** | **int**| The total number of Tasks that the Worker should handle for the TaskChannel type. TaskRouter creates reservations for Tasks of this TaskChannel type up to the specified capacity. If the capacity is 0, no new reservations will be created. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerChannel**](TaskrouterV1WorkspaceWorkerWorkerChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_worker_reservation**
> TaskrouterV1WorkspaceWorkerWorkerReservation update_worker_reservation(workspace_sid, worker_sid, sid, if_match=if_match, beep=beep, beep_on_customer_entrance=beep_on_customer_entrance, call_accept=call_accept, call_from=call_from, call_record=call_record, call_status_callback_url=call_status_callback_url, call_timeout=call_timeout, call_to=call_to, call_url=call_url, conference_record=conference_record, conference_recording_status_callback=conference_recording_status_callback, conference_recording_status_callback_method=conference_recording_status_callback_method, conference_status_callback=conference_status_callback, conference_status_callback_event=conference_status_callback_event, conference_status_callback_method=conference_status_callback_method, conference_trim=conference_trim, dequeue_from=dequeue_from, dequeue_post_work_activity_sid=dequeue_post_work_activity_sid, dequeue_record=dequeue_record, dequeue_status_callback_event=dequeue_status_callback_event, dequeue_status_callback_url=dequeue_status_callback_url, dequeue_timeout=dequeue_timeout, dequeue_to=dequeue_to, early_media=early_media, end_conference_on_customer_exit=end_conference_on_customer_exit, end_conference_on_exit=end_conference_on_exit, var_from=var_from, instruction=instruction, max_participants=max_participants, muted=muted, post_work_activity_sid=post_work_activity_sid, record=record, recording_channels=recording_channels, recording_status_callback=recording_status_callback, recording_status_callback_method=recording_status_callback_method, redirect_accept=redirect_accept, redirect_call_sid=redirect_call_sid, redirect_url=redirect_url, region=region, reservation_status=reservation_status, sip_auth_password=sip_auth_password, sip_auth_username=sip_auth_username, start_conference_on_enter=start_conference_on_enter, status_callback=status_callback, status_callback_event=status_callback_event, status_callback_method=status_callback_method, timeout=timeout, to=to, wait_method=wait_method, wait_url=wait_url, worker_activity_sid=worker_activity_sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_worker_worker_reservation import TaskrouterV1WorkspaceWorkerWorkerReservation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the WorkerReservation resources to update.
    worker_sid = 'worker_sid_example' # str | The SID of the reserved Worker resource with the WorkerReservation resources to update.
    sid = 'sid_example' # str | The SID of the WorkerReservation resource to update.
    if_match = 'if_match_example' # str | The If-Match HTTP request header (optional)
    beep = 'beep_example' # str | Whether to play a notification beep when the participant joins or when to play a beep. Can be: `true`, `false`, `onEnter`, or `onExit`. The default value is `true`. (optional)
    beep_on_customer_entrance = True # bool | Whether to play a notification beep when the customer joins. (optional)
    call_accept = True # bool | Whether to accept a reservation when executing a Call instruction. (optional)
    call_from = 'call_from_example' # str | The Caller ID of the outbound call when executing a Call instruction. (optional)
    call_record = 'call_record_example' # str | Whether to record both legs of a call when executing a Call instruction. (optional)
    call_status_callback_url = 'call_status_callback_url_example' # str | The URL to call for the completed call event when executing a Call instruction. (optional)
    call_timeout = 56 # int | The timeout for a call when executing a Call instruction. (optional)
    call_to = 'call_to_example' # str | The contact URI of the worker when executing a Call instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    call_url = 'call_url_example' # str | TwiML URI executed on answering the worker's leg as a result of the Call instruction. (optional)
    conference_record = 'conference_record_example' # str | Whether to record the conference the participant is joining or when to record the conference. Can be: `true`, `false`, `record-from-start`, and `do-not-record`. The default value is `false`. (optional)
    conference_recording_status_callback = 'conference_recording_status_callback_example' # str | The URL we should call using the `conference_recording_status_callback_method` when the conference recording is available. (optional)
    conference_recording_status_callback_method = 'conference_recording_status_callback_method_example' # str | The HTTP method we should use to call `conference_recording_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    conference_status_callback = 'conference_status_callback_example' # str | The URL we should call using the `conference_status_callback_method` when the conference events in `conference_status_callback_event` occur. Only the value set by the first participant to join the conference is used. Subsequent `conference_status_callback` values are ignored. (optional)
    conference_status_callback_event = [openapi_client.WorkerReservationEnumConferenceEvent()] # List[WorkerReservationEnumConferenceEvent] | The conference status events that we will send to `conference_status_callback`. Can be: `start`, `end`, `join`, `leave`, `mute`, `hold`, `speaker`. (optional)
    conference_status_callback_method = 'conference_status_callback_method_example' # str | The HTTP method we should use to call `conference_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    conference_trim = 'conference_trim_example' # str | Whether to trim leading and trailing silence from your recorded conference audio files. Can be: `trim-silence` or `do-not-trim` and defaults to `trim-silence`. (optional)
    dequeue_from = 'dequeue_from_example' # str | The caller ID of the call to the worker when executing a Dequeue instruction. (optional)
    dequeue_post_work_activity_sid = 'dequeue_post_work_activity_sid_example' # str | The SID of the Activity resource to start after executing a Dequeue instruction. (optional)
    dequeue_record = 'dequeue_record_example' # str | Whether to record both legs of a call when executing a Dequeue instruction or which leg to record. (optional)
    dequeue_status_callback_event = ['dequeue_status_callback_event_example'] # List[str] | The call progress events sent via webhooks as a result of a Dequeue instruction. (optional)
    dequeue_status_callback_url = 'dequeue_status_callback_url_example' # str | The callback URL for completed call event when executing a Dequeue instruction. (optional)
    dequeue_timeout = 56 # int | The timeout for call when executing a Dequeue instruction. (optional)
    dequeue_to = 'dequeue_to_example' # str | The contact URI of the worker when executing a Dequeue instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    early_media = True # bool | Whether to allow an agent to hear the state of the outbound call, including ringing or disconnect messages. The default is `true`. (optional)
    end_conference_on_customer_exit = True # bool | Whether to end the conference when the customer leaves. (optional)
    end_conference_on_exit = True # bool | Whether to end the conference when the agent leaves. (optional)
    var_from = 'var_from_example' # str | The caller ID of the call to the worker when executing a Conference instruction. (optional)
    instruction = 'instruction_example' # str | The assignment instruction for the reservation. (optional)
    max_participants = 56 # int | The maximum number of participants allowed in the conference. Can be a positive integer from `2` to `250`. The default value is `250`. (optional)
    muted = True # bool | Whether the agent is muted in the conference. Defaults to `false`. (optional)
    post_work_activity_sid = 'post_work_activity_sid_example' # str | The new worker activity SID after executing a Conference instruction. (optional)
    record = True # bool | Whether to record the participant and their conferences, including the time between conferences. Can be `true` or `false` and the default is `false`. (optional)
    recording_channels = 'recording_channels_example' # str | The recording channels for the final recording. Can be: `mono` or `dual` and the default is `mono`. (optional)
    recording_status_callback = 'recording_status_callback_example' # str | The URL that we should call using the `recording_status_callback_method` when the recording status changes. (optional)
    recording_status_callback_method = 'recording_status_callback_method_example' # str | The HTTP method we should use when we call `recording_status_callback`. Can be: `GET` or `POST` and defaults to `POST`. (optional)
    redirect_accept = True # bool | Whether the reservation should be accepted when executing a Redirect instruction. (optional)
    redirect_call_sid = 'redirect_call_sid_example' # str | The Call SID of the call parked in the queue when executing a Redirect instruction. (optional)
    redirect_url = 'redirect_url_example' # str | TwiML URI to redirect the call to when executing the Redirect instruction. (optional)
    region = 'region_example' # str | The [region](https://support.twilio.com/hc/en-us/articles/223132167-How-global-low-latency-routing-and-region-selection-work-for-conferences-and-Client-calls) where we should mix the recorded audio. Can be:`us1`, `ie1`, `de1`, `sg1`, `br1`, `au1`, or `jp1`. (optional)
    reservation_status = openapi_client.WorkerReservationEnumStatus() # WorkerReservationEnumStatus |  (optional)
    sip_auth_password = 'sip_auth_password_example' # str | The SIP password for authentication. (optional)
    sip_auth_username = 'sip_auth_username_example' # str | The SIP username used for authentication. (optional)
    start_conference_on_enter = True # bool | Whether to start the conference when the participant joins, if it has not already started. Can be: `true` or `false` and the default is `true`. If `false` and the conference has not started, the participant is muted and hears background music until another participant starts the conference. (optional)
    status_callback = 'status_callback_example' # str | The URL we should call using the `status_callback_method` to send status information to your application. (optional)
    status_callback_event = [openapi_client.WorkerReservationEnumCallStatus()] # List[WorkerReservationEnumCallStatus] | The call progress events that we will send to `status_callback`. Can be: `initiated`, `ringing`, `answered`, or `completed`. (optional)
    status_callback_method = 'status_callback_method_example' # str | The HTTP method we should use to call `status_callback`. Can be: `POST` or `GET` and the default is `POST`. (optional)
    timeout = 56 # int | The timeout for a call when executing a Conference instruction. (optional)
    to = 'to_example' # str | The Contact URI of the worker when executing a Conference instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. (optional)
    wait_method = 'wait_method_example' # str | The HTTP method we should use to call `wait_url`. Can be `GET` or `POST` and the default is `POST`. When using a static audio file, this should be `GET` so that we can cache the file. (optional)
    wait_url = 'wait_url_example' # str | The URL we should call using the `wait_method` for the music to play while participants are waiting for the conference to start. The default value is the URL of our standard hold music. [Learn more about hold music](https://www.twilio.com/labs/twimlets/holdmusic). (optional)
    worker_activity_sid = 'worker_activity_sid_example' # str | The new worker activity SID if rejecting a reservation. (optional)

    try:
        api_response = api_instance.update_worker_reservation(workspace_sid, worker_sid, sid, if_match=if_match, beep=beep, beep_on_customer_entrance=beep_on_customer_entrance, call_accept=call_accept, call_from=call_from, call_record=call_record, call_status_callback_url=call_status_callback_url, call_timeout=call_timeout, call_to=call_to, call_url=call_url, conference_record=conference_record, conference_recording_status_callback=conference_recording_status_callback, conference_recording_status_callback_method=conference_recording_status_callback_method, conference_status_callback=conference_status_callback, conference_status_callback_event=conference_status_callback_event, conference_status_callback_method=conference_status_callback_method, conference_trim=conference_trim, dequeue_from=dequeue_from, dequeue_post_work_activity_sid=dequeue_post_work_activity_sid, dequeue_record=dequeue_record, dequeue_status_callback_event=dequeue_status_callback_event, dequeue_status_callback_url=dequeue_status_callback_url, dequeue_timeout=dequeue_timeout, dequeue_to=dequeue_to, early_media=early_media, end_conference_on_customer_exit=end_conference_on_customer_exit, end_conference_on_exit=end_conference_on_exit, var_from=var_from, instruction=instruction, max_participants=max_participants, muted=muted, post_work_activity_sid=post_work_activity_sid, record=record, recording_channels=recording_channels, recording_status_callback=recording_status_callback, recording_status_callback_method=recording_status_callback_method, redirect_accept=redirect_accept, redirect_call_sid=redirect_call_sid, redirect_url=redirect_url, region=region, reservation_status=reservation_status, sip_auth_password=sip_auth_password, sip_auth_username=sip_auth_username, start_conference_on_enter=start_conference_on_enter, status_callback=status_callback, status_callback_event=status_callback_event, status_callback_method=status_callback_method, timeout=timeout, to=to, wait_method=wait_method, wait_url=wait_url, worker_activity_sid=worker_activity_sid)
        print("The response of DefaultApi->update_worker_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_worker_reservation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the WorkerReservation resources to update. | 
 **worker_sid** | **str**| The SID of the reserved Worker resource with the WorkerReservation resources to update. | 
 **sid** | **str**| The SID of the WorkerReservation resource to update. | 
 **if_match** | **str**| The If-Match HTTP request header | [optional] 
 **beep** | **str**| Whether to play a notification beep when the participant joins or when to play a beep. Can be: &#x60;true&#x60;, &#x60;false&#x60;, &#x60;onEnter&#x60;, or &#x60;onExit&#x60;. The default value is &#x60;true&#x60;. | [optional] 
 **beep_on_customer_entrance** | **bool**| Whether to play a notification beep when the customer joins. | [optional] 
 **call_accept** | **bool**| Whether to accept a reservation when executing a Call instruction. | [optional] 
 **call_from** | **str**| The Caller ID of the outbound call when executing a Call instruction. | [optional] 
 **call_record** | **str**| Whether to record both legs of a call when executing a Call instruction. | [optional] 
 **call_status_callback_url** | **str**| The URL to call for the completed call event when executing a Call instruction. | [optional] 
 **call_timeout** | **int**| The timeout for a call when executing a Call instruction. | [optional] 
 **call_to** | **str**| The contact URI of the worker when executing a Call instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **call_url** | **str**| TwiML URI executed on answering the worker&#39;s leg as a result of the Call instruction. | [optional] 
 **conference_record** | **str**| Whether to record the conference the participant is joining or when to record the conference. Can be: &#x60;true&#x60;, &#x60;false&#x60;, &#x60;record-from-start&#x60;, and &#x60;do-not-record&#x60;. The default value is &#x60;false&#x60;. | [optional] 
 **conference_recording_status_callback** | **str**| The URL we should call using the &#x60;conference_recording_status_callback_method&#x60; when the conference recording is available. | [optional] 
 **conference_recording_status_callback_method** | **str**| The HTTP method we should use to call &#x60;conference_recording_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **conference_status_callback** | **str**| The URL we should call using the &#x60;conference_status_callback_method&#x60; when the conference events in &#x60;conference_status_callback_event&#x60; occur. Only the value set by the first participant to join the conference is used. Subsequent &#x60;conference_status_callback&#x60; values are ignored. | [optional] 
 **conference_status_callback_event** | [**List[WorkerReservationEnumConferenceEvent]**](WorkerReservationEnumConferenceEvent.md)| The conference status events that we will send to &#x60;conference_status_callback&#x60;. Can be: &#x60;start&#x60;, &#x60;end&#x60;, &#x60;join&#x60;, &#x60;leave&#x60;, &#x60;mute&#x60;, &#x60;hold&#x60;, &#x60;speaker&#x60;. | [optional] 
 **conference_status_callback_method** | **str**| The HTTP method we should use to call &#x60;conference_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **conference_trim** | **str**| Whether to trim leading and trailing silence from your recorded conference audio files. Can be: &#x60;trim-silence&#x60; or &#x60;do-not-trim&#x60; and defaults to &#x60;trim-silence&#x60;. | [optional] 
 **dequeue_from** | **str**| The caller ID of the call to the worker when executing a Dequeue instruction. | [optional] 
 **dequeue_post_work_activity_sid** | **str**| The SID of the Activity resource to start after executing a Dequeue instruction. | [optional] 
 **dequeue_record** | **str**| Whether to record both legs of a call when executing a Dequeue instruction or which leg to record. | [optional] 
 **dequeue_status_callback_event** | [**List[str]**](str.md)| The call progress events sent via webhooks as a result of a Dequeue instruction. | [optional] 
 **dequeue_status_callback_url** | **str**| The callback URL for completed call event when executing a Dequeue instruction. | [optional] 
 **dequeue_timeout** | **int**| The timeout for call when executing a Dequeue instruction. | [optional] 
 **dequeue_to** | **str**| The contact URI of the worker when executing a Dequeue instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **early_media** | **bool**| Whether to allow an agent to hear the state of the outbound call, including ringing or disconnect messages. The default is &#x60;true&#x60;. | [optional] 
 **end_conference_on_customer_exit** | **bool**| Whether to end the conference when the customer leaves. | [optional] 
 **end_conference_on_exit** | **bool**| Whether to end the conference when the agent leaves. | [optional] 
 **var_from** | **str**| The caller ID of the call to the worker when executing a Conference instruction. | [optional] 
 **instruction** | **str**| The assignment instruction for the reservation. | [optional] 
 **max_participants** | **int**| The maximum number of participants allowed in the conference. Can be a positive integer from &#x60;2&#x60; to &#x60;250&#x60;. The default value is &#x60;250&#x60;. | [optional] 
 **muted** | **bool**| Whether the agent is muted in the conference. Defaults to &#x60;false&#x60;. | [optional] 
 **post_work_activity_sid** | **str**| The new worker activity SID after executing a Conference instruction. | [optional] 
 **record** | **bool**| Whether to record the participant and their conferences, including the time between conferences. Can be &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;false&#x60;. | [optional] 
 **recording_channels** | **str**| The recording channels for the final recording. Can be: &#x60;mono&#x60; or &#x60;dual&#x60; and the default is &#x60;mono&#x60;. | [optional] 
 **recording_status_callback** | **str**| The URL that we should call using the &#x60;recording_status_callback_method&#x60; when the recording status changes. | [optional] 
 **recording_status_callback_method** | **str**| The HTTP method we should use when we call &#x60;recording_status_callback&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and defaults to &#x60;POST&#x60;. | [optional] 
 **redirect_accept** | **bool**| Whether the reservation should be accepted when executing a Redirect instruction. | [optional] 
 **redirect_call_sid** | **str**| The Call SID of the call parked in the queue when executing a Redirect instruction. | [optional] 
 **redirect_url** | **str**| TwiML URI to redirect the call to when executing the Redirect instruction. | [optional] 
 **region** | **str**| The [region](https://support.twilio.com/hc/en-us/articles/223132167-How-global-low-latency-routing-and-region-selection-work-for-conferences-and-Client-calls) where we should mix the recorded audio. Can be:&#x60;us1&#x60;, &#x60;ie1&#x60;, &#x60;de1&#x60;, &#x60;sg1&#x60;, &#x60;br1&#x60;, &#x60;au1&#x60;, or &#x60;jp1&#x60;. | [optional] 
 **reservation_status** | **WorkerReservationEnumStatus**|  | [optional] 
 **sip_auth_password** | **str**| The SIP password for authentication. | [optional] 
 **sip_auth_username** | **str**| The SIP username used for authentication. | [optional] 
 **start_conference_on_enter** | **bool**| Whether to start the conference when the participant joins, if it has not already started. Can be: &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;true&#x60;. If &#x60;false&#x60; and the conference has not started, the participant is muted and hears background music until another participant starts the conference. | [optional] 
 **status_callback** | **str**| The URL we should call using the &#x60;status_callback_method&#x60; to send status information to your application. | [optional] 
 **status_callback_event** | [**List[WorkerReservationEnumCallStatus]**](WorkerReservationEnumCallStatus.md)| The call progress events that we will send to &#x60;status_callback&#x60;. Can be: &#x60;initiated&#x60;, &#x60;ringing&#x60;, &#x60;answered&#x60;, or &#x60;completed&#x60;. | [optional] 
 **status_callback_method** | **str**| The HTTP method we should use to call &#x60;status_callback&#x60;. Can be: &#x60;POST&#x60; or &#x60;GET&#x60; and the default is &#x60;POST&#x60;. | [optional] 
 **timeout** | **int**| The timeout for a call when executing a Conference instruction. | [optional] 
 **to** | **str**| The Contact URI of the worker when executing a Conference instruction. Can be the URI of the Twilio Client, the SIP URI for Programmable SIP, or the [E.164](https://www.twilio.com/docs/glossary/what-e164) formatted phone number, depending on the destination. | [optional] 
 **wait_method** | **str**| The HTTP method we should use to call &#x60;wait_url&#x60;. Can be &#x60;GET&#x60; or &#x60;POST&#x60; and the default is &#x60;POST&#x60;. When using a static audio file, this should be &#x60;GET&#x60; so that we can cache the file. | [optional] 
 **wait_url** | **str**| The URL we should call using the &#x60;wait_method&#x60; for the music to play while participants are waiting for the conference to start. The default value is the URL of our standard hold music. [Learn more about hold music](https://www.twilio.com/labs/twimlets/holdmusic). | [optional] 
 **worker_activity_sid** | **str**| The new worker activity SID if rejecting a reservation. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkerWorkerReservation**](TaskrouterV1WorkspaceWorkerWorkerReservation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_workflow**
> TaskrouterV1WorkspaceWorkflow update_workflow(workspace_sid, sid, assignment_callback_url=assignment_callback_url, configuration=configuration, fallback_assignment_callback_url=fallback_assignment_callback_url, friendly_name=friendly_name, re_evaluate_tasks=re_evaluate_tasks, task_reservation_timeout=task_reservation_timeout)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace_workflow import TaskrouterV1WorkspaceWorkflow
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    workspace_sid = 'workspace_sid_example' # str | The SID of the Workspace with the Workflow to update.
    sid = 'sid_example' # str | The SID of the Workflow resource to update.
    assignment_callback_url = 'assignment_callback_url_example' # str | The URL from your application that will process task assignment events. See [Handling Task Assignment Callback](https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks) for more details. (optional)
    configuration = 'configuration_example' # str | A JSON string that contains the rules to apply to the Workflow. See [Configuring Workflows](https://www.twilio.com/docs/taskrouter/workflow-configuration) for more information. (optional)
    fallback_assignment_callback_url = 'fallback_assignment_callback_url_example' # str | The URL that we should call when a call to the `assignment_callback_url` fails. (optional)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Workflow resource. For example, `Inbound Call Workflow` or `2014 Outbound Campaign`. (optional)
    re_evaluate_tasks = 're_evaluate_tasks_example' # str | Whether or not to re-evaluate Tasks. The default is `false`, which means Tasks in the Workflow will not be processed through the assignment loop again. (optional)
    task_reservation_timeout = 56 # int | How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker. Can be up to `86,400` (24 hours) and the default is `120`. (optional)

    try:
        api_response = api_instance.update_workflow(workspace_sid, sid, assignment_callback_url=assignment_callback_url, configuration=configuration, fallback_assignment_callback_url=fallback_assignment_callback_url, friendly_name=friendly_name, re_evaluate_tasks=re_evaluate_tasks, task_reservation_timeout=task_reservation_timeout)
        print("The response of DefaultApi->update_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace_sid** | **str**| The SID of the Workspace with the Workflow to update. | 
 **sid** | **str**| The SID of the Workflow resource to update. | 
 **assignment_callback_url** | **str**| The URL from your application that will process task assignment events. See [Handling Task Assignment Callback](https://www.twilio.com/docs/taskrouter/handle-assignment-callbacks) for more details. | [optional] 
 **configuration** | **str**| A JSON string that contains the rules to apply to the Workflow. See [Configuring Workflows](https://www.twilio.com/docs/taskrouter/workflow-configuration) for more information. | [optional] 
 **fallback_assignment_callback_url** | **str**| The URL that we should call when a call to the &#x60;assignment_callback_url&#x60; fails. | [optional] 
 **friendly_name** | **str**| A descriptive string that you create to describe the Workflow resource. For example, &#x60;Inbound Call Workflow&#x60; or &#x60;2014 Outbound Campaign&#x60;. | [optional] 
 **re_evaluate_tasks** | **str**| Whether or not to re-evaluate Tasks. The default is &#x60;false&#x60;, which means Tasks in the Workflow will not be processed through the assignment loop again. | [optional] 
 **task_reservation_timeout** | **int**| How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker. Can be up to &#x60;86,400&#x60; (24 hours) and the default is &#x60;120&#x60;. | [optional] 

### Return type

[**TaskrouterV1WorkspaceWorkflow**](TaskrouterV1WorkspaceWorkflow.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_workspace**
> TaskrouterV1Workspace update_workspace(sid, default_activity_sid=default_activity_sid, event_callback_url=event_callback_url, events_filter=events_filter, friendly_name=friendly_name, multi_task_enabled=multi_task_enabled, prioritize_queue_order=prioritize_queue_order, timeout_activity_sid=timeout_activity_sid)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.taskrouter_v1_workspace import TaskrouterV1Workspace
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://taskrouter.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://taskrouter.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sid = 'sid_example' # str | The SID of the Workspace resource to update.
    default_activity_sid = 'default_activity_sid_example' # str | The SID of the Activity that will be used when new Workers are created in the Workspace. (optional)
    event_callback_url = 'event_callback_url_example' # str | The URL we should call when an event occurs. See [Workspace Events](https://www.twilio.com/docs/taskrouter/api/event) for more information. This parameter supports Twilio's [Webhooks (HTTP callbacks) Connection Overrides](https://www.twilio.com/docs/usage/webhooks/webhooks-connection-overrides). (optional)
    events_filter = 'events_filter_example' # str | The list of Workspace events for which to call event_callback_url. For example if `EventsFilter=task.created,task.canceled,worker.activity.update`, then TaskRouter will call event_callback_url only when a task is created, canceled, or a Worker activity is updated. (optional)
    friendly_name = 'friendly_name_example' # str | A descriptive string that you create to describe the Workspace resource. For example: `Sales Call Center` or `Customer Support Team`. (optional)
    multi_task_enabled = True # bool | Whether to enable multi-tasking. Can be: `true` to enable multi-tasking, or `false` to disable it. However, all workspaces should be maintained as multi-tasking. There is no default when omitting this parameter. A multi-tasking Workspace can't be updated to single-tasking unless it is not a Flex Project and another (legacy) single-tasking Workspace exists. Multi-tasking allows Workers to handle multiple Tasks simultaneously. In multi-tasking mode, each Worker can receive parallel reservations up to the per-channel maximums defined in the Workers section. In single-tasking mode (legacy mode), each Worker will only receive a new reservation when the previous task is completed. Learn more at [Multitasking](https://www.twilio.com/docs/taskrouter/multitasking). (optional)
    prioritize_queue_order = openapi_client.WorkspaceEnumQueueOrder() # WorkspaceEnumQueueOrder |  (optional)
    timeout_activity_sid = 'timeout_activity_sid_example' # str | The SID of the Activity that will be assigned to a Worker when a Task reservation times out without a response. (optional)

    try:
        api_response = api_instance.update_workspace(sid, default_activity_sid=default_activity_sid, event_callback_url=event_callback_url, events_filter=events_filter, friendly_name=friendly_name, multi_task_enabled=multi_task_enabled, prioritize_queue_order=prioritize_queue_order, timeout_activity_sid=timeout_activity_sid)
        print("The response of DefaultApi->update_workspace:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_workspace: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **str**| The SID of the Workspace resource to update. | 
 **default_activity_sid** | **str**| The SID of the Activity that will be used when new Workers are created in the Workspace. | [optional] 
 **event_callback_url** | **str**| The URL we should call when an event occurs. See [Workspace Events](https://www.twilio.com/docs/taskrouter/api/event) for more information. This parameter supports Twilio&#39;s [Webhooks (HTTP callbacks) Connection Overrides](https://www.twilio.com/docs/usage/webhooks/webhooks-connection-overrides). | [optional] 
 **events_filter** | **str**| The list of Workspace events for which to call event_callback_url. For example if &#x60;EventsFilter&#x3D;task.created,task.canceled,worker.activity.update&#x60;, then TaskRouter will call event_callback_url only when a task is created, canceled, or a Worker activity is updated. | [optional] 
 **friendly_name** | **str**| A descriptive string that you create to describe the Workspace resource. For example: &#x60;Sales Call Center&#x60; or &#x60;Customer Support Team&#x60;. | [optional] 
 **multi_task_enabled** | **bool**| Whether to enable multi-tasking. Can be: &#x60;true&#x60; to enable multi-tasking, or &#x60;false&#x60; to disable it. However, all workspaces should be maintained as multi-tasking. There is no default when omitting this parameter. A multi-tasking Workspace can&#39;t be updated to single-tasking unless it is not a Flex Project and another (legacy) single-tasking Workspace exists. Multi-tasking allows Workers to handle multiple Tasks simultaneously. In multi-tasking mode, each Worker can receive parallel reservations up to the per-channel maximums defined in the Workers section. In single-tasking mode (legacy mode), each Worker will only receive a new reservation when the previous task is completed. Learn more at [Multitasking](https://www.twilio.com/docs/taskrouter/multitasking). | [optional] 
 **prioritize_queue_order** | **WorkspaceEnumQueueOrder**|  | [optional] 
 **timeout_activity_sid** | **str**| The SID of the Activity that will be assigned to a Worker when a Task reservation times out without a response. | [optional] 

### Return type

[**TaskrouterV1Workspace**](TaskrouterV1Workspace.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

