# RunnerGroupsOrg


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allows_public_repositories** | **bool** |  | 
**default** | **bool** |  | 
**id** | **float** |  | 
**inherited** | **bool** |  | 
**inherited_allows_public_repositories** | **bool** |  | [optional] 
**name** | **str** |  | 
**runners_url** | **str** |  | 
**selected_repositories_url** | **str** | Link to the selected repositories resource for this runner group. Not present unless visibility was set to &#x60;selected&#x60; | [optional] 
**visibility** | **str** |  | 

## Example

```python
from openapi_client.models.runner_groups_org import RunnerGroupsOrg

# TODO update the JSON string below
json = "{}"
# create an instance of RunnerGroupsOrg from a JSON string
runner_groups_org_instance = RunnerGroupsOrg.from_json(json)
# print the JSON string representation of the object
print(RunnerGroupsOrg.to_json())

# convert the object into a dict
runner_groups_org_dict = runner_groups_org_instance.to_dict()
# create an instance of RunnerGroupsOrg from a dict
runner_groups_org_from_dict = RunnerGroupsOrg.from_dict(runner_groups_org_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


