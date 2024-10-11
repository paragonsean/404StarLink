# EmbeddedDestinationSettings

Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination608_channel_number** | **int** |  | [optional] 
**destination708_service_number** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.embedded_destination_settings import EmbeddedDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of EmbeddedDestinationSettings from a JSON string
embedded_destination_settings_instance = EmbeddedDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(EmbeddedDestinationSettings.to_json())

# convert the object into a dict
embedded_destination_settings_dict = embedded_destination_settings_instance.to_dict()
# create an instance of EmbeddedDestinationSettings from a dict
embedded_destination_settings_from_dict = EmbeddedDestinationSettings.from_dict(embedded_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


