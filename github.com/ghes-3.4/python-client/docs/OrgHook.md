# OrgHook

Org Hook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | 
**config** | [**OrgHookConfig**](OrgHookConfig.md) |  | 
**created_at** | **datetime** |  | 
**deliveries_url** | **str** |  | [optional] 
**events** | **List[str]** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**ping_url** | **str** |  | 
**type** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.org_hook import OrgHook

# TODO update the JSON string below
json = "{}"
# create an instance of OrgHook from a JSON string
org_hook_instance = OrgHook.from_json(json)
# print the JSON string representation of the object
print(OrgHook.to_json())

# convert the object into a dict
org_hook_dict = org_hook_instance.to_dict()
# create an instance of OrgHook from a dict
org_hook_from_dict = OrgHook.from_dict(org_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


