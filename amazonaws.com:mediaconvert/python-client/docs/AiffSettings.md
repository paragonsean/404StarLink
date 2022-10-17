# AiffSettings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bit_depth** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.aiff_settings import AiffSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AiffSettings from a JSON string
aiff_settings_instance = AiffSettings.from_json(json)
# print the JSON string representation of the object
print(AiffSettings.to_json())

# convert the object into a dict
aiff_settings_dict = aiff_settings_instance.to_dict()
# create an instance of AiffSettings from a dict
aiff_settings_from_dict = AiffSettings.from_dict(aiff_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


