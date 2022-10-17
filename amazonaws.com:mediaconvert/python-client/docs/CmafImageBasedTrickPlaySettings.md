# CmafImageBasedTrickPlaySettings

Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_cadence** | [**CmafIntervalCadence**](CmafIntervalCadence.md) |  | [optional] 
**thumbnail_height** | **int** |  | [optional] 
**thumbnail_interval** | **float** |  | [optional] 
**thumbnail_width** | **int** |  | [optional] 
**tile_height** | **int** |  | [optional] 
**tile_width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_image_based_trick_play_settings import CmafImageBasedTrickPlaySettings

# TODO update the JSON string below
json = "{}"
# create an instance of CmafImageBasedTrickPlaySettings from a JSON string
cmaf_image_based_trick_play_settings_instance = CmafImageBasedTrickPlaySettings.from_json(json)
# print the JSON string representation of the object
print(CmafImageBasedTrickPlaySettings.to_json())

# convert the object into a dict
cmaf_image_based_trick_play_settings_dict = cmaf_image_based_trick_play_settings_instance.to_dict()
# create an instance of CmafImageBasedTrickPlaySettings from a dict
cmaf_image_based_trick_play_settings_from_dict = CmafImageBasedTrickPlaySettings.from_dict(cmaf_image_based_trick_play_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


