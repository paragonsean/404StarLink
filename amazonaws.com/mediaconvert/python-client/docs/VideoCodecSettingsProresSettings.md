# VideoCodecSettingsProresSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chroma_sampling** | [**ProresChromaSampling**](ProresChromaSampling.md) |  | [optional] 
**codec_profile** | [**ProresCodecProfile**](ProresCodecProfile.md) |  | [optional] 
**framerate_control** | [**ProresFramerateControl**](ProresFramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**ProresFramerateConversionAlgorithm**](ProresFramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**interlace_mode** | [**ProresInterlaceMode**](ProresInterlaceMode.md) |  | [optional] 
**par_control** | [**ProresParControl**](ProresParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**scan_type_conversion_mode** | [**ProresScanTypeConversionMode**](ProresScanTypeConversionMode.md) |  | [optional] 
**slow_pal** | [**ProresSlowPal**](ProresSlowPal.md) |  | [optional] 
**telecine** | [**ProresTelecine**](ProresTelecine.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_prores_settings import VideoCodecSettingsProresSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsProresSettings from a JSON string
video_codec_settings_prores_settings_instance = VideoCodecSettingsProresSettings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsProresSettings.to_json())

# convert the object into a dict
video_codec_settings_prores_settings_dict = video_codec_settings_prores_settings_instance.to_dict()
# create an instance of VideoCodecSettingsProresSettings from a dict
video_codec_settings_prores_settings_from_dict = VideoCodecSettingsProresSettings.from_dict(video_codec_settings_prores_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


