# AacSettings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to \"VBR\" or \"CBR\". In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_description_broadcaster_mix** | [**AacAudioDescriptionBroadcasterMix**](AacAudioDescriptionBroadcasterMix.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**codec_profile** | [**AacCodecProfile**](AacCodecProfile.md) |  | [optional] 
**coding_mode** | [**AacCodingMode**](AacCodingMode.md) |  | [optional] 
**rate_control_mode** | [**AacRateControlMode**](AacRateControlMode.md) |  | [optional] 
**raw_format** | [**AacRawFormat**](AacRawFormat.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**specification** | [**AacSpecification**](AacSpecification.md) |  | [optional] 
**vbr_quality** | [**AacVbrQuality**](AacVbrQuality.md) |  | [optional] 

## Example

```python
from openapi_client.models.aac_settings import AacSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AacSettings from a JSON string
aac_settings_instance = AacSettings.from_json(json)
# print the JSON string representation of the object
print(AacSettings.to_json())

# convert the object into a dict
aac_settings_dict = aac_settings_instance.to_dict()
# create an instance of AacSettings from a dict
aac_settings_from_dict = AacSettings.from_dict(aac_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


