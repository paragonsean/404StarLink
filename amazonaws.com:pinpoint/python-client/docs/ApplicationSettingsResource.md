# ApplicationSettingsResource

Provides information about an application, including the default settings for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**campaign_hook** | [**ApplicationSettingsResourceCampaignHook**](ApplicationSettingsResourceCampaignHook.md) |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**limits** | [**ApplicationSettingsResourceLimits**](ApplicationSettingsResourceLimits.md) |  | [optional] 
**quiet_time** | [**ApplicationSettingsResourceQuietTime**](ApplicationSettingsResourceQuietTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.application_settings_resource import ApplicationSettingsResource

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationSettingsResource from a JSON string
application_settings_resource_instance = ApplicationSettingsResource.from_json(json)
# print the JSON string representation of the object
print(ApplicationSettingsResource.to_json())

# convert the object into a dict
application_settings_resource_dict = application_settings_resource_instance.to_dict()
# create an instance of ApplicationSettingsResource from a dict
application_settings_resource_from_dict = ApplicationSettingsResource.from_dict(application_settings_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


