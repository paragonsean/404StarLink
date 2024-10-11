# ActionsListJobsForWorkflowRun200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobs** | [**List[Job]**](Job.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.actions_list_jobs_for_workflow_run200_response import ActionsListJobsForWorkflowRun200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsListJobsForWorkflowRun200Response from a JSON string
actions_list_jobs_for_workflow_run200_response_instance = ActionsListJobsForWorkflowRun200Response.from_json(json)
# print the JSON string representation of the object
print(ActionsListJobsForWorkflowRun200Response.to_json())

# convert the object into a dict
actions_list_jobs_for_workflow_run200_response_dict = actions_list_jobs_for_workflow_run200_response_instance.to_dict()
# create an instance of ActionsListJobsForWorkflowRun200Response from a dict
actions_list_jobs_for_workflow_run200_response_from_dict = ActionsListJobsForWorkflowRun200Response.from_dict(actions_list_jobs_for_workflow_run200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


