# ImscDestinationSettings

Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to IMSC.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**ImscAccessibilitySubs**](ImscAccessibilitySubs.md) |  | [optional] 
**style_passthrough** | [**ImscStylePassthrough**](ImscStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.imsc_destination_settings import ImscDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ImscDestinationSettings from a JSON string
imsc_destination_settings_instance = ImscDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(ImscDestinationSettings.to_json())

# convert the object into a dict
imsc_destination_settings_dict = imsc_destination_settings_instance.to_dict()
# create an instance of ImscDestinationSettings from a dict
imsc_destination_settings_from_dict = ImscDestinationSettings.from_dict(imsc_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


