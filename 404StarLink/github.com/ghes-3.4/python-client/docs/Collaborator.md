# Collaborator

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
from openapi_client.models.collaborator import Collaborator

# TODO update the JSON string below
json = "{}"
# create an instance of Collaborator from a JSON string
collaborator_instance = Collaborator.from_json(json)
# print the JSON string representation of the object
print(Collaborator.to_json())

# convert the object into a dict
collaborator_dict = collaborator_instance.to_dict()
# create an instance of Collaborator from a dict
collaborator_from_dict = Collaborator.from_dict(collaborator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


