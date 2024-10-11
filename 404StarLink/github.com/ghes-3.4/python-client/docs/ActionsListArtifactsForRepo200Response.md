# ActionsListArtifactsForRepo200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifacts** | [**List[Artifact]**](Artifact.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.actions_list_artifacts_for_repo200_response import ActionsListArtifactsForRepo200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsListArtifactsForRepo200Response from a JSON string
actions_list_artifacts_for_repo200_response_instance = ActionsListArtifactsForRepo200Response.from_json(json)
# print the JSON string representation of the object
print(ActionsListArtifactsForRepo200Response.to_json())

# convert the object into a dict
actions_list_artifacts_for_repo200_response_dict = actions_list_artifacts_for_repo200_response_instance.to_dict()
# create an instance of ActionsListArtifactsForRepo200Response from a dict
actions_list_artifacts_for_repo200_response_from_dict = ActionsListArtifactsForRepo200Response.from_dict(actions_list_artifacts_for_repo200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


