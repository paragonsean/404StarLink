# TimecodeConfig

These settings control how the service handles timecodes throughout the job. These settings don't affect input clipping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **str** |  | [optional] 
**source** | [**TimecodeSource**](TimecodeSource.md) |  | [optional] 
**start** | **str** |  | [optional] 
**timestamp_offset** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.timecode_config import TimecodeConfig

# TODO update the JSON string below
json = "{}"
# create an instance of TimecodeConfig from a JSON string
timecode_config_instance = TimecodeConfig.from_json(json)
# print the JSON string representation of the object
print(TimecodeConfig.to_json())

# convert the object into a dict
timecode_config_dict = timecode_config_instance.to_dict()
# create an instance of TimecodeConfig from a dict
timecode_config_from_dict = TimecodeConfig.from_dict(timecode_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


