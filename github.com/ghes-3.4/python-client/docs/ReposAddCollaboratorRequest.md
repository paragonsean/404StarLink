# ReposAddCollaboratorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permission** | **str** | The permission to grant the collaborator. **Only valid on organization-owned repositories.** | [optional] [default to 'push']

## Example

```python
from openapi_client.models.repos_add_collaborator_request import ReposAddCollaboratorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReposAddCollaboratorRequest from a JSON string
repos_add_collaborator_request_instance = ReposAddCollaboratorRequest.from_json(json)
# print the JSON string representation of the object
print(ReposAddCollaboratorRequest.to_json())

# convert the object into a dict
repos_add_collaborator_request_dict = repos_add_collaborator_request_instance.to_dict()
# create an instance of ReposAddCollaboratorRequest from a dict
repos_add_collaborator_request_from_dict = ReposAddCollaboratorRequest.from_dict(repos_add_collaborator_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


