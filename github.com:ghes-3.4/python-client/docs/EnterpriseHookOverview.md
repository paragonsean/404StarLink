# EnterpriseHookOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_hooks** | **int** |  | 
**inactive_hooks** | **int** |  | 
**total_hooks** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_hook_overview import EnterpriseHookOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseHookOverview from a JSON string
enterprise_hook_overview_instance = EnterpriseHookOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseHookOverview.to_json())

# convert the object into a dict
enterprise_hook_overview_dict = enterprise_hook_overview_instance.to_dict()
# create an instance of EnterpriseHookOverview from a dict
enterprise_hook_overview_from_dict = EnterpriseHookOverview.from_dict(enterprise_hook_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


