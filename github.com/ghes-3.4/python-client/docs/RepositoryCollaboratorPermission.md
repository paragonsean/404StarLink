# RepositoryCollaboratorPermission

Repository Collaborator Permission

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permission** | **str** |  | 
**user** | [**NullableCollaborator**](NullableCollaborator.md) |  | 

## Example

```python
from openapi_client.models.repository_collaborator_permission import RepositoryCollaboratorPermission

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryCollaboratorPermission from a JSON string
repository_collaborator_permission_instance = RepositoryCollaboratorPermission.from_json(json)
# print the JSON string representation of the object
print(RepositoryCollaboratorPermission.to_json())

# convert the object into a dict
repository_collaborator_permission_dict = repository_collaborator_permission_instance.to_dict()
# create an instance of RepositoryCollaboratorPermission from a dict
repository_collaborator_permission_from_dict = RepositoryCollaboratorPermission.from_dict(repository_collaborator_permission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


