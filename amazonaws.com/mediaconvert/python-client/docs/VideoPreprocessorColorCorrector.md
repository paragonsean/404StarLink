# VideoPreprocessorColorCorrector


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brightness** | **int** |  | [optional] 
**clip_limits** | [**ColorCorrectorClipLimits**](ColorCorrectorClipLimits.md) |  | [optional] 
**color_space_conversion** | [**ColorSpaceConversion**](ColorSpaceConversion.md) |  | [optional] 
**contrast** | **int** |  | [optional] 
**hdr10_metadata** | [**ColorCorrectorHdr10Metadata**](ColorCorrectorHdr10Metadata.md) |  | [optional] 
**hdr_to_sdr_tone_mapper** | [**HDRToSDRToneMapper**](HDRToSDRToneMapper.md) |  | [optional] 
**hue** | **int** |  | [optional] 
**sample_range_conversion** | [**SampleRangeConversion**](SampleRangeConversion.md) |  | [optional] 
**saturation** | **int** |  | [optional] 
**sdr_reference_white_level** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_color_corrector import VideoPreprocessorColorCorrector

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorColorCorrector from a JSON string
video_preprocessor_color_corrector_instance = VideoPreprocessorColorCorrector.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorColorCorrector.to_json())

# convert the object into a dict
video_preprocessor_color_corrector_dict = video_preprocessor_color_corrector_instance.to_dict()
# create an instance of VideoPreprocessorColorCorrector from a dict
video_preprocessor_color_corrector_from_dict = VideoPreprocessorColorCorrector.from_dict(video_preprocessor_color_corrector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


