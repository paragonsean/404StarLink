# OutputChannelMapping

OutputChannel mapping settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input_channels** | **List** |  | [optional] 
**input_channels_fine_tune** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.output_channel_mapping import OutputChannelMapping

# TODO update the JSON string below
json = "{}"
# create an instance of OutputChannelMapping from a JSON string
output_channel_mapping_instance = OutputChannelMapping.from_json(json)
# print the JSON string representation of the object
print(OutputChannelMapping.to_json())

# convert the object into a dict
output_channel_mapping_dict = output_channel_mapping_instance.to_dict()
# create an instance of OutputChannelMapping from a dict
output_channel_mapping_from_dict = OutputChannelMapping.from_dict(output_channel_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


