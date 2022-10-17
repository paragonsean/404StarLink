# Output

Each output in your job is a collection of settings that describes how you want MediaConvert to encode a single output file or stream. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/create-outputs.html.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_descriptions** | **List** |  | [optional] 
**caption_descriptions** | **List** |  | [optional] 
**container_settings** | [**CreatePresetRequestSettingsContainerSettings**](CreatePresetRequestSettingsContainerSettings.md) |  | [optional] 
**extension** | **str** |  | [optional] 
**name_modifier** | **str** |  | [optional] 
**output_settings** | [**OutputOutputSettings**](OutputOutputSettings.md) |  | [optional] 
**preset** | **str** |  | [optional] 
**video_description** | [**CreatePresetRequestSettingsVideoDescription**](CreatePresetRequestSettingsVideoDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.output import Output

# TODO update the JSON string below
json = "{}"
# create an instance of Output from a JSON string
output_instance = Output.from_json(json)
# print the JSON string representation of the object
print(Output.to_json())

# convert the object into a dict
output_dict = output_instance.to_dict()
# create an instance of Output from a dict
output_from_dict = Output.from_dict(output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


