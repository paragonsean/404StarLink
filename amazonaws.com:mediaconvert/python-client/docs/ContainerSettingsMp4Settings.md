# ContainerSettingsMp4Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_duration** | [**CmfcAudioDuration**](CmfcAudioDuration.md) |  | [optional] 
**cslg_atom** | [**Mp4CslgAtom**](Mp4CslgAtom.md) |  | [optional] 
**ctts_version** | **int** |  | [optional] 
**free_space_box** | [**Mp4FreeSpaceBox**](Mp4FreeSpaceBox.md) |  | [optional] 
**moov_placement** | [**Mp4MoovPlacement**](Mp4MoovPlacement.md) |  | [optional] 
**mp4_major_brand** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_mp4_settings import ContainerSettingsMp4Settings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsMp4Settings from a JSON string
container_settings_mp4_settings_instance = ContainerSettingsMp4Settings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsMp4Settings.to_json())

# convert the object into a dict
container_settings_mp4_settings_dict = container_settings_mp4_settings_instance.to_dict()
# create an instance of ContainerSettingsMp4Settings from a dict
container_settings_mp4_settings_from_dict = ContainerSettingsMp4Settings.from_dict(container_settings_mp4_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


