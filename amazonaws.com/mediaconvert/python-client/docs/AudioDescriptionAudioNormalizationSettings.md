# AudioDescriptionAudioNormalizationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithm** | [**AudioNormalizationAlgorithm**](AudioNormalizationAlgorithm.md) |  | [optional] 
**algorithm_control** | [**AudioNormalizationAlgorithmControl**](AudioNormalizationAlgorithmControl.md) |  | [optional] 
**correction_gate_level** | **int** |  | [optional] 
**loudness_logging** | [**AudioNormalizationLoudnessLogging**](AudioNormalizationLoudnessLogging.md) |  | [optional] 
**peak_calculation** | [**AudioNormalizationPeakCalculation**](AudioNormalizationPeakCalculation.md) |  | [optional] 
**target_lkfs** | **float** |  | [optional] 
**true_peak_limiter_threshold** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.audio_description_audio_normalization_settings import AudioDescriptionAudioNormalizationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioDescriptionAudioNormalizationSettings from a JSON string
audio_description_audio_normalization_settings_instance = AudioDescriptionAudioNormalizationSettings.from_json(json)
# print the JSON string representation of the object
print(AudioDescriptionAudioNormalizationSettings.to_json())

# convert the object into a dict
audio_description_audio_normalization_settings_dict = audio_description_audio_normalization_settings_instance.to_dict()
# create an instance of AudioDescriptionAudioNormalizationSettings from a dict
audio_description_audio_normalization_settings_from_dict = AudioDescriptionAudioNormalizationSettings.from_dict(audio_description_audio_normalization_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


