# DashIsoImageBasedTrickPlaySettings

Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_cadence** | [**DashIsoIntervalCadence**](DashIsoIntervalCadence.md) |  | [optional] 
**thumbnail_height** | **int** |  | [optional] 
**thumbnail_interval** | **float** |  | [optional] 
**thumbnail_width** | **int** |  | [optional] 
**tile_height** | **int** |  | [optional] 
**tile_width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dash_iso_image_based_trick_play_settings import DashIsoImageBasedTrickPlaySettings

# TODO update the JSON string below
json = "{}"
# create an instance of DashIsoImageBasedTrickPlaySettings from a JSON string
dash_iso_image_based_trick_play_settings_instance = DashIsoImageBasedTrickPlaySettings.from_json(json)
# print the JSON string representation of the object
print(DashIsoImageBasedTrickPlaySettings.to_json())

# convert the object into a dict
dash_iso_image_based_trick_play_settings_dict = dash_iso_image_based_trick_play_settings_instance.to_dict()
# create an instance of DashIsoImageBasedTrickPlaySettings from a dict
dash_iso_image_based_trick_play_settings_from_dict = DashIsoImageBasedTrickPlaySettings.from_dict(dash_iso_image_based_trick_play_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


