# DvbSubDestinationSettings

Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to DVB_SUB.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**DvbSubtitleAlignment**](DvbSubtitleAlignment.md) |  | [optional] 
**apply_font_color** | [**DvbSubtitleApplyFontColor**](DvbSubtitleApplyFontColor.md) |  | [optional] 
**background_color** | [**DvbSubtitleBackgroundColor**](DvbSubtitleBackgroundColor.md) |  | [optional] 
**background_opacity** | **int** |  | [optional] 
**dds_handling** | [**DvbddsHandling**](DvbddsHandling.md) |  | [optional] 
**dds_x_coordinate** | **int** |  | [optional] 
**dds_y_coordinate** | **int** |  | [optional] 
**fallback_font** | [**DvbSubSubtitleFallbackFont**](DvbSubSubtitleFallbackFont.md) |  | [optional] 
**font_color** | [**DvbSubtitleFontColor**](DvbSubtitleFontColor.md) |  | [optional] 
**font_opacity** | **int** |  | [optional] 
**font_resolution** | **int** |  | [optional] 
**font_script** | [**FontScript**](FontScript.md) |  | [optional] 
**font_size** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**hex_font_color** | **str** |  | [optional] 
**outline_color** | [**DvbSubtitleOutlineColor**](DvbSubtitleOutlineColor.md) |  | [optional] 
**outline_size** | **int** |  | [optional] 
**shadow_color** | [**DvbSubtitleShadowColor**](DvbSubtitleShadowColor.md) |  | [optional] 
**shadow_opacity** | **int** |  | [optional] 
**shadow_x_offset** | **int** |  | [optional] 
**shadow_y_offset** | **int** |  | [optional] 
**style_passthrough** | [**DvbSubtitleStylePassthrough**](DvbSubtitleStylePassthrough.md) |  | [optional] 
**subtitling_type** | [**DvbSubtitlingType**](DvbSubtitlingType.md) |  | [optional] 
**teletext_spacing** | [**DvbSubtitleTeletextSpacing**](DvbSubtitleTeletextSpacing.md) |  | [optional] 
**width** | **int** |  | [optional] 
**x_position** | **int** |  | [optional] 
**y_position** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dvb_sub_destination_settings import DvbSubDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DvbSubDestinationSettings from a JSON string
dvb_sub_destination_settings_instance = DvbSubDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(DvbSubDestinationSettings.to_json())

# convert the object into a dict
dvb_sub_destination_settings_dict = dvb_sub_destination_settings_instance.to_dict()
# create an instance of DvbSubDestinationSettings from a dict
dvb_sub_destination_settings_from_dict = DvbSubDestinationSettings.from_dict(dvb_sub_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


