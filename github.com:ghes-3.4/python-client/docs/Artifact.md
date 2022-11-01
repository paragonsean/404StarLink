# Artifact

An artifact

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive_download_url** | **str** |  | 
**created_at** | **datetime** |  | 
**expired** | **bool** | Whether or not the artifact has expired. | 
**expires_at** | **datetime** |  | 
**id** | **int** |  | 
**name** | **str** | The name of the artifact. | 
**node_id** | **str** |  | 
**size_in_bytes** | **int** | The size in bytes of the artifact. | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**workflow_run** | [**ArtifactWorkflowRun**](ArtifactWorkflowRun.md) |  | [optional] 

## Example

```python
from openapi_client.models.artifact import Artifact

# TODO update the JSON string below
json = "{}"
# create an instance of Artifact from a JSON string
artifact_instance = Artifact.from_json(json)
# print the JSON string representation of the object
print(Artifact.to_json())

# convert the object into a dict
artifact_dict = artifact_instance.to_dict()
# create an instance of Artifact from a dict
artifact_from_dict = Artifact.from_dict(artifact_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


