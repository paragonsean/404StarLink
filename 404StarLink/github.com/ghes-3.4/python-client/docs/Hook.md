# Hook

Webhooks for repositories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | Determines whether the hook is actually triggered on pushes. | 
**config** | [**HookConfig**](HookConfig.md) |  | 
**created_at** | **datetime** |  | 
**deliveries_url** | **str** |  | [optional] 
**events** | **List[str]** | Determines what events the hook is triggered for. Default: [&#39;push&#39;]. | 
**id** | **int** | Unique identifier of the webhook. | 
**last_response** | [**HookResponse**](HookResponse.md) |  | 
**name** | **str** | The name of a valid service, use &#39;web&#39; for a webhook. | 
**ping_url** | **str** |  | 
**test_url** | **str** |  | 
**type** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.hook import Hook

# TODO update the JSON string below
json = "{}"
# create an instance of Hook from a JSON string
hook_instance = Hook.from_json(json)
# print the JSON string representation of the object
print(Hook.to_json())

# convert the object into a dict
hook_dict = hook_instance.to_dict()
# create an instance of Hook from a dict
hook_from_dict = Hook.from_dict(hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


