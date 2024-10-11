# HlsGroupSettingsImageBasedTrickPlaySettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_cadence** | [**HlsIntervalCadence**](HlsIntervalCadence.md) |  | [optional] 
**thumbnail_height** | **int** |  | [optional] 
**thumbnail_interval** | **float** |  | [optional] 
**thumbnail_width** | **int** |  | [optional] 
**tile_height** | **int** |  | [optional] 
**tile_width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.hls_group_settings_image_based_trick_play_settings import HlsGroupSettingsImageBasedTrickPlaySettings

# TODO update the JSON string below
json = "{}"
# create an instance of HlsGroupSettingsImageBasedTrickPlaySettings from a JSON string
hls_group_settings_image_based_trick_play_settings_instance = HlsGroupSettingsImageBasedTrickPlaySettings.from_json(json)
# print the JSON string representation of the object
print(HlsGroupSettingsImageBasedTrickPlaySettings.to_json())

# convert the object into a dict
hls_group_settings_image_based_trick_play_settings_dict = hls_group_settings_image_based_trick_play_settings_instance.to_dict()
# create an instance of HlsGroupSettingsImageBasedTrickPlaySettings from a dict
hls_group_settings_image_based_trick_play_settings_from_dict = HlsGroupSettingsImageBasedTrickPlaySettings.from_dict(hls_group_settings_image_based_trick_play_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


