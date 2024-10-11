# JobPostLaunchActionsLaunchStatus

Launch Status of the Job Post Launch Actions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**execution_id** | **str** |  | [optional] 
**execution_status** | [**PostLaunchActionExecutionStatus**](PostLaunchActionExecutionStatus.md) |  | [optional] 
**failure_reason** | **str** |  | [optional] 
**ssm_document** | [**JobPostLaunchActionsLaunchStatusSsmDocument**](JobPostLaunchActionsLaunchStatusSsmDocument.md) |  | [optional] 
**ssm_document_type** | [**SsmDocumentType**](SsmDocumentType.md) |  | [optional] 

## Example

```python
from openapi_client.models.job_post_launch_actions_launch_status import JobPostLaunchActionsLaunchStatus

# TODO update the JSON string below
json = "{}"
# create an instance of JobPostLaunchActionsLaunchStatus from a JSON string
job_post_launch_actions_launch_status_instance = JobPostLaunchActionsLaunchStatus.from_json(json)
# print the JSON string representation of the object
print(JobPostLaunchActionsLaunchStatus.to_json())

# convert the object into a dict
job_post_launch_actions_launch_status_dict = job_post_launch_actions_launch_status_instance.to_dict()
# create an instance of JobPostLaunchActionsLaunchStatus from a dict
job_post_launch_actions_launch_status_from_dict = JobPostLaunchActionsLaunchStatus.from_dict(job_post_launch_actions_launch_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


