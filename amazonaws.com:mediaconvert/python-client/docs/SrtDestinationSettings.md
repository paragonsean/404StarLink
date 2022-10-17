# SrtDestinationSettings

Settings related to SRT captions. SRT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SRT.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**style_passthrough** | [**SrtStylePassthrough**](SrtStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.srt_destination_settings import SrtDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of SrtDestinationSettings from a JSON string
srt_destination_settings_instance = SrtDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(SrtDestinationSettings.to_json())

# convert the object into a dict
srt_destination_settings_dict = srt_destination_settings_instance.to_dict()
# create an instance of SrtDestinationSettings from a dict
srt_destination_settings_from_dict = SrtDestinationSettings.from_dict(srt_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


