# NullableCollaborator

Collaborator

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | 
**followers_url** | **str** |  | 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**login** | **str** |  | 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**permissions** | [**CollaboratorPermissions**](CollaboratorPermissions.md) |  | [optional] 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.nullable_collaborator import NullableCollaborator

# TODO update the JSON string below
json = "{}"
# create an instance of NullableCollaborator from a JSON string
nullable_collaborator_instance = NullableCollaborator.from_json(json)
# print the JSON string representation of the object
print(NullableCollaborator.to_json())

# convert the object into a dict
nullable_collaborator_dict = nullable_collaborator_instance.to_dict()
# create an instance of NullableCollaborator from a dict
nullable_collaborator_from_dict = NullableCollaborator.from_dict(nullable_collaborator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


