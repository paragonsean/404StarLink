# RunnerGroupsEnterprise


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allows_public_repositories** | **bool** |  | 
**default** | **bool** |  | 
**id** | **float** |  | 
**name** | **str** |  | 
**runners_url** | **str** |  | 
**selected_organizations_url** | **str** |  | [optional] 
**visibility** | **str** |  | 

## Example

```python
from openapi_client.models.runner_groups_enterprise import RunnerGroupsEnterprise

# TODO update the JSON string below
json = "{}"
# create an instance of RunnerGroupsEnterprise from a JSON string
runner_groups_enterprise_instance = RunnerGroupsEnterprise.from_json(json)
# print the JSON string representation of the object
print(RunnerGroupsEnterprise.to_json())

# convert the object into a dict
runner_groups_enterprise_dict = runner_groups_enterprise_instance.to_dict()
# create an instance of RunnerGroupsEnterprise from a dict
runner_groups_enterprise_from_dict = RunnerGroupsEnterprise.from_dict(runner_groups_enterprise_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


