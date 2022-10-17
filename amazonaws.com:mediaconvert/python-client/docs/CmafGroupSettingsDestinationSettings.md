# CmafGroupSettingsDestinationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_settings** | [**DestinationSettingsS3Settings**](DestinationSettingsS3Settings.md) |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_group_settings_destination_settings import CmafGroupSettingsDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CmafGroupSettingsDestinationSettings from a JSON string
cmaf_group_settings_destination_settings_instance = CmafGroupSettingsDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(CmafGroupSettingsDestinationSettings.to_json())

# convert the object into a dict
cmaf_group_settings_destination_settings_dict = cmaf_group_settings_destination_settings_instance.to_dict()
# create an instance of CmafGroupSettingsDestinationSettings from a dict
cmaf_group_settings_destination_settings_from_dict = CmafGroupSettingsDestinationSettings.from_dict(cmaf_group_settings_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


