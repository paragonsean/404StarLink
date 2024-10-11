# ArtifactWorkflowRun


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**head_branch** | **str** |  | [optional] 
**head_repository_id** | **int** |  | [optional] 
**head_sha** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**repository_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.artifact_workflow_run import ArtifactWorkflowRun

# TODO update the JSON string below
json = "{}"
# create an instance of ArtifactWorkflowRun from a JSON string
artifact_workflow_run_instance = ArtifactWorkflowRun.from_json(json)
# print the JSON string representation of the object
print(ArtifactWorkflowRun.to_json())

# convert the object into a dict
artifact_workflow_run_dict = artifact_workflow_run_instance.to_dict()
# create an instance of ArtifactWorkflowRun from a dict
artifact_workflow_run_from_dict = ArtifactWorkflowRun.from_dict(artifact_workflow_run_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


