# XavcHdProfileSettings

Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate_class** | [**XavcHdProfileBitrateClass**](XavcHdProfileBitrateClass.md) |  | [optional] 
**flicker_adaptive_quantization** | [**XavcFlickerAdaptiveQuantization**](XavcFlickerAdaptiveQuantization.md) |  | [optional] 
**gop_b_reference** | [**XavcGopBReference**](XavcGopBReference.md) |  | [optional] 
**gop_closed_cadence** | **int** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**interlace_mode** | [**XavcInterlaceMode**](XavcInterlaceMode.md) |  | [optional] 
**quality_tuning_level** | [**XavcHdProfileQualityTuningLevel**](XavcHdProfileQualityTuningLevel.md) |  | [optional] 
**slices** | **int** |  | [optional] 
**telecine** | [**XavcHdProfileTelecine**](XavcHdProfileTelecine.md) |  | [optional] 

## Example

```python
from openapi_client.models.xavc_hd_profile_settings import XavcHdProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of XavcHdProfileSettings from a JSON string
xavc_hd_profile_settings_instance = XavcHdProfileSettings.from_json(json)
# print the JSON string representation of the object
print(XavcHdProfileSettings.to_json())

# convert the object into a dict
xavc_hd_profile_settings_dict = xavc_hd_profile_settings_instance.to_dict()
# create an instance of XavcHdProfileSettings from a dict
xavc_hd_profile_settings_from_dict = XavcHdProfileSettings.from_dict(xavc_hd_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


