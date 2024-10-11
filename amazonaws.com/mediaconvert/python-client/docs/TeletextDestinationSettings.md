# TeletextDestinationSettings

Settings related to teletext captions. Set up teletext captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TELETEXT.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page_number** | **str** |  | [optional] 
**page_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.teletext_destination_settings import TeletextDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of TeletextDestinationSettings from a JSON string
teletext_destination_settings_instance = TeletextDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(TeletextDestinationSettings.to_json())

# convert the object into a dict
teletext_destination_settings_dict = teletext_destination_settings_instance.to_dict()
# create an instance of TeletextDestinationSettings from a dict
teletext_destination_settings_from_dict = TeletextDestinationSettings.from_dict(teletext_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


