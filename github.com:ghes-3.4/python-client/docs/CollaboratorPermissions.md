# CollaboratorPermissions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin** | **bool** |  | 
**maintain** | **bool** |  | [optional] 
**pull** | **bool** |  | 
**push** | **bool** |  | 
**triage** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.collaborator_permissions import CollaboratorPermissions

# TODO update the JSON string below
json = "{}"
# create an instance of CollaboratorPermissions from a JSON string
collaborator_permissions_instance = CollaboratorPermissions.from_json(json)
# print the JSON string representation of the object
print(CollaboratorPermissions.to_json())

# convert the object into a dict
collaborator_permissions_dict = collaborator_permissions_instance.to_dict()
# create an instance of CollaboratorPermissions from a dict
collaborator_permissions_from_dict = CollaboratorPermissions.from_dict(collaborator_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


