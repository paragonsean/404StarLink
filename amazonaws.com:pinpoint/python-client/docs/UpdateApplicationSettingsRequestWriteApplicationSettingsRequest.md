# UpdateApplicationSettingsRequestWriteApplicationSettingsRequest

Specifies the default settings for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_hook** | [**UpdateApplicationSettingsRequestWriteApplicationSettingsRequestCampaignHook**](UpdateApplicationSettingsRequestWriteApplicationSettingsRequestCampaignHook.md) |  | [optional] 
**cloud_watch_metrics_enabled** | **bool** |  | [optional] 
**event_tagging_enabled** | **bool** |  | [optional] 
**limits** | [**UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits**](UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits.md) |  | [optional] 
**quiet_time** | [**UpdateApplicationSettingsRequestWriteApplicationSettingsRequestQuietTime**](UpdateApplicationSettingsRequestWriteApplicationSettingsRequestQuietTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_application_settings_request_write_application_settings_request import UpdateApplicationSettingsRequestWriteApplicationSettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequest from a JSON string
update_application_settings_request_write_application_settings_request_instance = UpdateApplicationSettingsRequestWriteApplicationSettingsRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateApplicationSettingsRequestWriteApplicationSettingsRequest.to_json())

# convert the object into a dict
update_application_settings_request_write_application_settings_request_dict = update_application_settings_request_write_application_settings_request_instance.to_dict()
# create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequest from a dict
update_application_settings_request_write_application_settings_request_from_dict = UpdateApplicationSettingsRequestWriteApplicationSettingsRequest.from_dict(update_application_settings_request_write_application_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


