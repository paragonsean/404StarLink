# WebvttDestinationSettings

Settings related to WebVTT captions. WebVTT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to WebVTT.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**WebvttAccessibilitySubs**](WebvttAccessibilitySubs.md) |  | [optional] 
**style_passthrough** | [**WebvttStylePassthrough**](WebvttStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.webvtt_destination_settings import WebvttDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of WebvttDestinationSettings from a JSON string
webvtt_destination_settings_instance = WebvttDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(WebvttDestinationSettings.to_json())

# convert the object into a dict
webvtt_destination_settings_dict = webvtt_destination_settings_instance.to_dict()
# create an instance of WebvttDestinationSettings from a dict
webvtt_destination_settings_from_dict = WebvttDestinationSettings.from_dict(webvtt_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


