# VideoPreprocessor

Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color_corrector** | [**VideoPreprocessorColorCorrector**](VideoPreprocessorColorCorrector.md) |  | [optional] 
**deinterlacer** | [**VideoPreprocessorDeinterlacer**](VideoPreprocessorDeinterlacer.md) |  | [optional] 
**dolby_vision** | [**VideoPreprocessorDolbyVision**](VideoPreprocessorDolbyVision.md) |  | [optional] 
**hdr10_plus** | [**VideoPreprocessorHdr10Plus**](VideoPreprocessorHdr10Plus.md) |  | [optional] 
**image_inserter** | [**VideoPreprocessorImageInserter**](VideoPreprocessorImageInserter.md) |  | [optional] 
**noise_reducer** | [**VideoPreprocessorNoiseReducer**](VideoPreprocessorNoiseReducer.md) |  | [optional] 
**partner_watermarking** | [**VideoPreprocessorPartnerWatermarking**](VideoPreprocessorPartnerWatermarking.md) |  | [optional] 
**timecode_burnin** | [**VideoPreprocessorTimecodeBurnin**](VideoPreprocessorTimecodeBurnin.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor import VideoPreprocessor

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessor from a JSON string
video_preprocessor_instance = VideoPreprocessor.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessor.to_json())

# convert the object into a dict
video_preprocessor_dict = video_preprocessor_instance.to_dict()
# create an instance of VideoPreprocessor from a dict
video_preprocessor_from_dict = VideoPreprocessor.from_dict(video_preprocessor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


