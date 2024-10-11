# NexGuardFileMarkerSettings

For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**license** | **str** |  | [optional] 
**payload** | **int** |  | [optional] 
**preset** | **str** |  | [optional] 
**strength** | [**WatermarkingStrength**](WatermarkingStrength.md) |  | [optional] 

## Example

```python
from openapi_client.models.nex_guard_file_marker_settings import NexGuardFileMarkerSettings

# TODO update the JSON string below
json = "{}"
# create an instance of NexGuardFileMarkerSettings from a JSON string
nex_guard_file_marker_settings_instance = NexGuardFileMarkerSettings.from_json(json)
# print the JSON string representation of the object
print(NexGuardFileMarkerSettings.to_json())

# convert the object into a dict
nex_guard_file_marker_settings_dict = nex_guard_file_marker_settings_instance.to_dict()
# create an instance of NexGuardFileMarkerSettings from a dict
nex_guard_file_marker_settings_from_dict = NexGuardFileMarkerSettings.from_dict(nex_guard_file_marker_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


