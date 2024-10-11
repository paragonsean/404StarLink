# UpdatePresetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | The new category for the preset, if you are changing it. | [optional] 
**description** | **str** | The new description for the preset, if you are changing it. | [optional] 
**settings** | [**CreatePresetRequestSettings**](CreatePresetRequestSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_preset_request import UpdatePresetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePresetRequest from a JSON string
update_preset_request_instance = UpdatePresetRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatePresetRequest.to_json())

# convert the object into a dict
update_preset_request_dict = update_preset_request_instance.to_dict()
# create an instance of UpdatePresetRequest from a dict
update_preset_request_from_dict = UpdatePresetRequest.from_dict(update_preset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


