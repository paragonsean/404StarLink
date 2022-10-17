# Mp2Settings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.mp2_settings import Mp2Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Mp2Settings from a JSON string
mp2_settings_instance = Mp2Settings.from_json(json)
# print the JSON string representation of the object
print(Mp2Settings.to_json())

# convert the object into a dict
mp2_settings_dict = mp2_settings_instance.to_dict()
# create an instance of Mp2Settings from a dict
mp2_settings_from_dict = Mp2Settings.from_dict(mp2_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


