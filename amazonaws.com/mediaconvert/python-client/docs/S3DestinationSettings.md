# S3DestinationSettings

Settings associated with S3 destination

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_control** | [**S3DestinationSettingsAccessControl**](S3DestinationSettingsAccessControl.md) |  | [optional] 
**encryption** | [**S3DestinationSettingsEncryption**](S3DestinationSettingsEncryption.md) |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_settings import S3DestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationSettings from a JSON string
s3_destination_settings_instance = S3DestinationSettings.from_json(json)
# print the JSON string representation of the object
print(S3DestinationSettings.to_json())

# convert the object into a dict
s3_destination_settings_dict = s3_destination_settings_instance.to_dict()
# create an instance of S3DestinationSettings from a dict
s3_destination_settings_from_dict = S3DestinationSettings.from_dict(s3_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


