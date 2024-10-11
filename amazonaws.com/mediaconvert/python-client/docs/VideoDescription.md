# VideoDescription

Settings related to video encoding of your output. The specific video settings depend on the video codec that you choose. When you work directly in your JSON job specification, include one instance of Video description (VideoDescription) per output.

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
from openapi_client.models.video_description import VideoDescription

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDescription from a JSON string
video_description_instance = VideoDescription.from_json(json)
# print the JSON string representation of the object
print(VideoDescription.to_json())

# convert the object into a dict
video_description_dict = video_description_instance.to_dict()
# create an instance of VideoDescription from a dict
video_description_from_dict = VideoDescription.from_dict(video_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


