# NullableScopedInstallation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**SimpleUser**](SimpleUser.md) |  | 
**has_multiple_single_files** | **bool** |  | [optional] 
**permissions** | [**AppPermissions**](AppPermissions.md) |  | 
**repositories_url** | **str** |  | 
**repository_selection** | **str** | Describe whether all repositories have been selected or there&#39;s a selection involved | 
**single_file_name** | **str** |  | 
**single_file_paths** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.nullable_scoped_installation import NullableScopedInstallation

# TODO update the JSON string below
json = "{}"
# create an instance of NullableScopedInstallation from a JSON string
nullable_scoped_installation_instance = NullableScopedInstallation.from_json(json)
# print the JSON string representation of the object
print(NullableScopedInstallation.to_json())

# convert the object into a dict
nullable_scoped_installation_dict = nullable_scoped_installation_instance.to_dict()
# create an instance of NullableScopedInstallation from a dict
nullable_scoped_installation_from_dict = NullableScopedInstallation.from_dict(nullable_scoped_installation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


