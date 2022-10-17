# TtmlDestinationSettings

Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TTML.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**style_passthrough** | [**TtmlStylePassthrough**](TtmlStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.ttml_destination_settings import TtmlDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of TtmlDestinationSettings from a JSON string
ttml_destination_settings_instance = TtmlDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(TtmlDestinationSettings.to_json())

# convert the object into a dict
ttml_destination_settings_dict = ttml_destination_settings_instance.to_dict()
# create an instance of TtmlDestinationSettings from a dict
ttml_destination_settings_from_dict = TtmlDestinationSettings.from_dict(ttml_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


