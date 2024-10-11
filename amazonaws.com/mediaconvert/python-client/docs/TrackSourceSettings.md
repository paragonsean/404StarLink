# TrackSourceSettings

Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**track_number** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.track_source_settings import TrackSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of TrackSourceSettings from a JSON string
track_source_settings_instance = TrackSourceSettings.from_json(json)
# print the JSON string representation of the object
print(TrackSourceSettings.to_json())

# convert the object into a dict
track_source_settings_dict = track_source_settings_instance.to_dict()
# create an instance of TrackSourceSettings from a dict
track_source_settings_from_dict = TrackSourceSettings.from_dict(track_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


