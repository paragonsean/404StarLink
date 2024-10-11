# BurninDestinationSettings

Burn-in is a captions delivery method, rather than a captions format. Burn-in writes the captions directly on your video frames, replacing pixels of video content with the captions. Set up burn-in captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to BURN_IN.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**BurninSubtitleAlignment**](BurninSubtitleAlignment.md) |  | [optional] 
**apply_font_color** | [**BurninSubtitleApplyFontColor**](BurninSubtitleApplyFontColor.md) |  | [optional] 
**background_color** | [**BurninSubtitleBackgroundColor**](BurninSubtitleBackgroundColor.md) |  | [optional] 
**background_opacity** | **int** |  | [optional] 
**fallback_font** | [**BurninSubtitleFallbackFont**](BurninSubtitleFallbackFont.md) |  | [optional] 
**font_color** | [**BurninSubtitleFontColor**](BurninSubtitleFontColor.md) |  | [optional] 
**font_opacity** | **int** |  | [optional] 
**font_resolution** | **int** |  | [optional] 
**font_script** | [**FontScript**](FontScript.md) |  | [optional] 
**font_size** | **int** |  | [optional] 
**hex_font_color** | **str** |  | [optional] 
**outline_color** | [**BurninSubtitleOutlineColor**](BurninSubtitleOutlineColor.md) |  | [optional] 
**outline_size** | **int** |  | [optional] 
**shadow_color** | [**BurninSubtitleShadowColor**](BurninSubtitleShadowColor.md) |  | [optional] 
**shadow_opacity** | **int** |  | [optional] 
**shadow_x_offset** | **int** |  | [optional] 
**shadow_y_offset** | **int** |  | [optional] 
**style_passthrough** | [**BurnInSubtitleStylePassthrough**](BurnInSubtitleStylePassthrough.md) |  | [optional] 
**teletext_spacing** | [**BurninSubtitleTeletextSpacing**](BurninSubtitleTeletextSpacing.md) |  | [optional] 
**x_position** | **int** |  | [optional] 
**y_position** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.burnin_destination_settings import BurninDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of BurninDestinationSettings from a JSON string
burnin_destination_settings_instance = BurninDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(BurninDestinationSettings.to_json())

# convert the object into a dict
burnin_destination_settings_dict = burnin_destination_settings_instance.to_dict()
# create an instance of BurninDestinationSettings from a dict
burnin_destination_settings_from_dict = BurninDestinationSettings.from_dict(burnin_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


