# WorkflowRun

An invocation of a workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifacts_url** | **str** | The URL to the artifacts for the workflow run. | 
**cancel_url** | **str** | The URL to cancel the workflow run. | 
**check_suite_id** | **int** | The ID of the associated check suite. | [optional] 
**check_suite_node_id** | **str** | The node ID of the associated check suite. | [optional] 
**check_suite_url** | **str** | The URL to the associated check suite. | 
**conclusion** | **str** |  | 
**created_at** | **datetime** |  | 
**event** | **str** |  | 
**head_branch** | **str** |  | 
**head_commit** | [**NullableSimpleCommit**](NullableSimpleCommit.md) |  | 
**head_repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**head_repository_id** | **int** |  | [optional] 
**head_sha** | **str** | The SHA of the head commit that points to the version of the workflow being run. | 
**html_url** | **str** |  | 
**id** | **int** | The ID of the workflow run. | 
**jobs_url** | **str** | The URL to the jobs for the workflow run. | 
**logs_url** | **str** | The URL to download the logs for the workflow run. | 
**name** | **str** | The name of the workflow run. | [optional] 
**node_id** | **str** |  | 
**pull_requests** | [**List[PullRequestMinimal]**](PullRequestMinimal.md) |  | 
**repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**rerun_url** | **str** | The URL to rerun the workflow run. | 
**run_number** | **int** | The auto incrementing run number for the workflow run. | 
**status** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** | The URL to the workflow run. | 
**workflow_id** | **int** | The ID of the parent workflow. | 
**workflow_url** | **str** | The URL to the workflow. | 

## Example

```python
from openapi_client.models.workflow_run import WorkflowRun

# TODO update the JSON string below
json = "{}"
# create an instance of WorkflowRun from a JSON string
workflow_run_instance = WorkflowRun.from_json(json)
# print the JSON string representation of the object
print(WorkflowRun.to_json())

# convert the object into a dict
workflow_run_dict = workflow_run_instance.to_dict()
# create an instance of WorkflowRun from a dict
workflow_run_from_dict = WorkflowRun.from_dict(workflow_run_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


