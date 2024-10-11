# VideoDescriptionVideoPreprocessors


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
from openapi_client.models.video_description_video_preprocessors import VideoDescriptionVideoPreprocessors

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDescriptionVideoPreprocessors from a JSON string
video_description_video_preprocessors_instance = VideoDescriptionVideoPreprocessors.from_json(json)
# print the JSON string representation of the object
print(VideoDescriptionVideoPreprocessors.to_json())

# convert the object into a dict
video_description_video_preprocessors_dict = video_description_video_preprocessors_instance.to_dict()
# create an instance of VideoDescriptionVideoPreprocessors from a dict
video_description_video_preprocessors_from_dict = VideoDescriptionVideoPreprocessors.from_dict(video_description_video_preprocessors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


