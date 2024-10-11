# DestinationSettings

Settings associated with the destination. Will vary based on the type of destination

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_settings** | [**DestinationSettingsS3Settings**](DestinationSettingsS3Settings.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_settings import DestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationSettings from a JSON string
destination_settings_instance = DestinationSettings.from_json(json)
# print the JSON string representation of the object
print(DestinationSettings.to_json())

# convert the object into a dict
destination_settings_dict = destination_settings_instance.to_dict()
# create an instance of DestinationSettings from a dict
destination_settings_from_dict = DestinationSettings.from_dict(destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


