# Installation

Installation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_tokens_url** | **str** |  | 
**account** | [**InstallationAccount**](InstallationAccount.md) |  | 
**app_id** | **int** |  | 
**app_slug** | **str** |  | 
**contact_email** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**events** | **List[str]** |  | 
**has_multiple_single_files** | **bool** |  | [optional] 
**html_url** | **str** |  | 
**id** | **int** | The ID of the installation. | 
**permissions** | [**AppPermissions**](AppPermissions.md) |  | 
**repositories_url** | **str** |  | 
**repository_selection** | **str** | Describe whether all repositories have been selected or there&#39;s a selection involved | 
**single_file_name** | **str** |  | 
**single_file_paths** | **List[str]** |  | [optional] 
**suspended_at** | **datetime** |  | 
**suspended_by** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**target_id** | **int** | The ID of the user or organization this token is being scoped to. | 
**target_type** | **str** |  | 
**updated_at** | **datetime** |  | 

## Example

```python
from openapi_client.models.installation import Installation

# TODO update the JSON string below
json = "{}"
# create an instance of Installation from a JSON string
installation_instance = Installation.from_json(json)
# print the JSON string representation of the object
print(Installation.to_json())

# convert the object into a dict
installation_dict = installation_instance.to_dict()
# create an instance of Installation from a dict
installation_from_dict = Installation.from_dict(installation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


