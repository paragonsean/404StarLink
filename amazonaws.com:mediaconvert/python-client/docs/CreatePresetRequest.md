# CreatePresetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | Optional. A category for the preset you are creating. | [optional] 
**description** | **str** | Optional. A description of the preset you are creating. | [optional] 
**name** | **str** | The name of the preset you are creating. | 
**settings** | [**CreatePresetRequestSettings**](CreatePresetRequestSettings.md) |  | 
**tags** | **Dict[str, str]** | The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. | [optional] 

## Example

```python
from openapi_client.models.create_preset_request import CreatePresetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetRequest from a JSON string
create_preset_request_instance = CreatePresetRequest.from_json(json)
# print the JSON string representation of the object
print(CreatePresetRequest.to_json())

# convert the object into a dict
create_preset_request_dict = create_preset_request_instance.to_dict()
# create an instance of CreatePresetRequest from a dict
create_preset_request_from_dict = CreatePresetRequest.from_dict(create_preset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


