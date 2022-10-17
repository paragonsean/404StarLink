# SccDestinationSettings

Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SCC.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate** | [**SccDestinationFramerate**](SccDestinationFramerate.md) |  | [optional] 

## Example

```python
from openapi_client.models.scc_destination_settings import SccDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of SccDestinationSettings from a JSON string
scc_destination_settings_instance = SccDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(SccDestinationSettings.to_json())

# convert the object into a dict
scc_destination_settings_dict = scc_destination_settings_instance.to_dict()
# create an instance of SccDestinationSettings from a dict
scc_destination_settings_from_dict = SccDestinationSettings.from_dict(scc_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


