# OrgPreReceiveHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_downstream_configuration** | **bool** |  | [optional] 
**configuration_url** | **str** |  | [optional] 
**enforcement** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_pre_receive_hook import OrgPreReceiveHook

# TODO update the JSON string below
json = "{}"
# create an instance of OrgPreReceiveHook from a JSON string
org_pre_receive_hook_instance = OrgPreReceiveHook.from_json(json)
# print the JSON string representation of the object
print(OrgPreReceiveHook.to_json())

# convert the object into a dict
org_pre_receive_hook_dict = org_pre_receive_hook_instance.to_dict()
# create an instance of OrgPreReceiveHook from a dict
org_pre_receive_hook_from_dict = OrgPreReceiveHook.from_dict(org_pre_receive_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


