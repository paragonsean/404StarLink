# JobPostLaunchActionsLaunchStatusSsmDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_name** | **str** |  | 
**external_parameters** | **Dict** |  | [optional] 
**must_succeed_for_cutover** | **bool** |  | [optional] 
**parameters** | **Dict** |  | [optional] 
**ssm_document_name** | **str** |  | 
**timeout_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.job_post_launch_actions_launch_status_ssm_document import JobPostLaunchActionsLaunchStatusSsmDocument

# TODO update the JSON string below
json = "{}"
# create an instance of JobPostLaunchActionsLaunchStatusSsmDocument from a JSON string
job_post_launch_actions_launch_status_ssm_document_instance = JobPostLaunchActionsLaunchStatusSsmDocument.from_json(json)
# print the JSON string representation of the object
print(JobPostLaunchActionsLaunchStatusSsmDocument.to_json())

# convert the object into a dict
job_post_launch_actions_launch_status_ssm_document_dict = job_post_launch_actions_launch_status_ssm_document_instance.to_dict()
# create an instance of JobPostLaunchActionsLaunchStatusSsmDocument from a dict
job_post_launch_actions_launch_status_ssm_document_from_dict = JobPostLaunchActionsLaunchStatusSsmDocument.from_dict(job_post_launch_actions_launch_status_ssm_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


