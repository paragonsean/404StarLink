# DestinationSettingsS3Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_control** | [**S3DestinationSettingsAccessControl**](S3DestinationSettingsAccessControl.md) |  | [optional] 
**encryption** | [**S3DestinationSettingsEncryption**](S3DestinationSettingsEncryption.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_settings_s3_settings import DestinationSettingsS3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationSettingsS3Settings from a JSON string
destination_settings_s3_settings_instance = DestinationSettingsS3Settings.from_json(json)
# print the JSON string representation of the object
print(DestinationSettingsS3Settings.to_json())

# convert the object into a dict
destination_settings_s3_settings_dict = destination_settings_s3_settings_instance.to_dict()
# create an instance of DestinationSettingsS3Settings from a dict
destination_settings_s3_settings_from_dict = DestinationSettingsS3Settings.from_dict(destination_settings_s3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


