# OutputGroup

Group of outputs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automated_encoding_settings** | [**OutputGroupAutomatedEncodingSettings**](OutputGroupAutomatedEncodingSettings.md) |  | [optional] 
**custom_name** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**output_group_settings** | [**OutputGroupOutputGroupSettings**](OutputGroupOutputGroupSettings.md) |  | [optional] 
**outputs** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.output_group import OutputGroup

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroup from a JSON string
output_group_instance = OutputGroup.from_json(json)
# print the JSON string representation of the object
print(OutputGroup.to_json())

# convert the object into a dict
output_group_dict = output_group_instance.to_dict()
# create an instance of OutputGroup from a dict
output_group_from_dict = OutputGroup.from_dict(output_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


