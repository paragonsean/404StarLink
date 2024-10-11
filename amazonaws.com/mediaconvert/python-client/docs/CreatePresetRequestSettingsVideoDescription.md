# CreatePresetRequestSettingsVideoDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**afd_signaling** | [**AfdSignaling**](AfdSignaling.md) |  | [optional] 
**anti_alias** | [**AntiAlias**](AntiAlias.md) |  | [optional] 
**codec_settings** | [**VideoDescriptionCodecSettings**](VideoDescriptionCodecSettings.md) |  | [optional] 
**color_metadata** | [**ColorMetadata**](ColorMetadata.md) |  | [optional] 
**crop** | [**VideoDescriptionCrop**](VideoDescriptionCrop.md) |  | [optional] 
**drop_frame_timecode** | [**DropFrameTimecode**](DropFrameTimecode.md) |  | [optional] 
**fixed_afd** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**position** | [**VideoDescriptionPosition**](VideoDescriptionPosition.md) |  | [optional] 
**respond_to_afd** | [**RespondToAfd**](RespondToAfd.md) |  | [optional] 
**scaling_behavior** | [**ScalingBehavior**](ScalingBehavior.md) |  | [optional] 
**sharpness** | **int** |  | [optional] 
**timecode_insertion** | [**VideoTimecodeInsertion**](VideoTimecodeInsertion.md) |  | [optional] 
**video_preprocessors** | [**VideoDescriptionVideoPreprocessors**](VideoDescriptionVideoPreprocessors.md) |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_preset_request_settings_video_description import CreatePresetRequestSettingsVideoDescription

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetRequestSettingsVideoDescription from a JSON string
create_preset_request_settings_video_description_instance = CreatePresetRequestSettingsVideoDescription.from_json(json)
# print the JSON string representation of the object
print(CreatePresetRequestSettingsVideoDescription.to_json())

# convert the object into a dict
create_preset_request_settings_video_description_dict = create_preset_request_settings_video_description_instance.to_dict()
# create an instance of CreatePresetRequestSettingsVideoDescription from a dict
create_preset_request_settings_video_description_from_dict = CreatePresetRequestSettingsVideoDescription.from_dict(create_preset_request_settings_video_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


