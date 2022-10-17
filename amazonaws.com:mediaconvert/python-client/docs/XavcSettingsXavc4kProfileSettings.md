# XavcSettingsXavc4kProfileSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate_class** | [**Xavc4kProfileBitrateClass**](Xavc4kProfileBitrateClass.md) |  | [optional] 
**codec_profile** | [**Xavc4kProfileCodecProfile**](Xavc4kProfileCodecProfile.md) |  | [optional] 
**flicker_adaptive_quantization** | [**XavcFlickerAdaptiveQuantization**](XavcFlickerAdaptiveQuantization.md) |  | [optional] 
**gop_b_reference** | [**XavcGopBReference**](XavcGopBReference.md) |  | [optional] 
**gop_closed_cadence** | **int** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**quality_tuning_level** | [**Xavc4kProfileQualityTuningLevel**](Xavc4kProfileQualityTuningLevel.md) |  | [optional] 
**slices** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.xavc_settings_xavc4k_profile_settings import XavcSettingsXavc4kProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of XavcSettingsXavc4kProfileSettings from a JSON string
xavc_settings_xavc4k_profile_settings_instance = XavcSettingsXavc4kProfileSettings.from_json(json)
# print the JSON string representation of the object
print(XavcSettingsXavc4kProfileSettings.to_json())

# convert the object into a dict
xavc_settings_xavc4k_profile_settings_dict = xavc_settings_xavc4k_profile_settings_instance.to_dict()
# create an instance of XavcSettingsXavc4kProfileSettings from a dict
xavc_settings_xavc4k_profile_settings_from_dict = XavcSettingsXavc4kProfileSettings.from_dict(xavc_settings_xavc4k_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


