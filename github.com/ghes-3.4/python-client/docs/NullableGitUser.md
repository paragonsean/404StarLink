# NullableGitUser

Metaproperties for Git author/committer information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.nullable_git_user import NullableGitUser

# TODO update the JSON string below
json = "{}"
# create an instance of NullableGitUser from a JSON string
nullable_git_user_instance = NullableGitUser.from_json(json)
# print the JSON string representation of the object
print(NullableGitUser.to_json())

# convert the object into a dict
nullable_git_user_dict = nullable_git_user_instance.to_dict()
# create an instance of NullableGitUser from a dict
nullable_git_user_from_dict = NullableGitUser.from_dict(nullable_git_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


