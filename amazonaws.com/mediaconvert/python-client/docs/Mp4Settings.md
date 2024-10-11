# Mp4Settings

These settings relate to your MP4 output container. You can create audio only outputs with this container. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/supported-codecs-containers-audio-only.html#output-codecs-and-containers-supported-for-audio-only.

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
from openapi_client.models.mp4_settings import Mp4Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Mp4Settings from a JSON string
mp4_settings_instance = Mp4Settings.from_json(json)
# print the JSON string representation of the object
print(Mp4Settings.to_json())

# convert the object into a dict
mp4_settings_dict = mp4_settings_instance.to_dict()
# create an instance of Mp4Settings from a dict
mp4_settings_from_dict = Mp4Settings.from_dict(mp4_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


