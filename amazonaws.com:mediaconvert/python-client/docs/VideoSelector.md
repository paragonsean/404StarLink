# VideoSelector

Input video selectors contain the video settings for the input. Each of your inputs can have up to one video selector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alpha_behavior** | [**AlphaBehavior**](AlphaBehavior.md) |  | [optional] 
**color_space** | [**ColorSpace**](ColorSpace.md) |  | [optional] 
**color_space_usage** | [**ColorSpaceUsage**](ColorSpaceUsage.md) |  | [optional] 
**embedded_timecode_override** | [**EmbeddedTimecodeOverride**](EmbeddedTimecodeOverride.md) |  | [optional] 
**hdr10_metadata** | [**VideoSelectorHdr10Metadata**](VideoSelectorHdr10Metadata.md) |  | [optional] 
**pad_video** | [**PadVideo**](PadVideo.md) |  | [optional] 
**pid** | **int** |  | [optional] 
**program_number** | **int** |  | [optional] 
**rotate** | [**InputRotate**](InputRotate.md) |  | [optional] 
**sample_range** | [**InputSampleRange**](InputSampleRange.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_selector import VideoSelector

# TODO update the JSON string below
json = "{}"
# create an instance of VideoSelector from a JSON string
video_selector_instance = VideoSelector.from_json(json)
# print the JSON string representation of the object
print(VideoSelector.to_json())

# convert the object into a dict
video_selector_dict = video_selector_instance.to_dict()
# create an instance of VideoSelector from a dict
video_selector_from_dict = VideoSelector.from_dict(video_selector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


