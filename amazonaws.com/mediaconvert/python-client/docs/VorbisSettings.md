# VorbisSettings

Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**vbr_quality** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.vorbis_settings import VorbisSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VorbisSettings from a JSON string
vorbis_settings_instance = VorbisSettings.from_json(json)
# print the JSON string representation of the object
print(VorbisSettings.to_json())

# convert the object into a dict
vorbis_settings_dict = vorbis_settings_instance.to_dict()
# create an instance of VorbisSettings from a dict
vorbis_settings_from_dict = VorbisSettings.from_dict(vorbis_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


