# WriteApplicationSettingsRequest

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
from openapi_client.models.write_application_settings_request import WriteApplicationSettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of WriteApplicationSettingsRequest from a JSON string
write_application_settings_request_instance = WriteApplicationSettingsRequest.from_json(json)
# print the JSON string representation of the object
print(WriteApplicationSettingsRequest.to_json())

# convert the object into a dict
write_application_settings_request_dict = write_application_settings_request_instance.to_dict()
# create an instance of WriteApplicationSettingsRequest from a dict
write_application_settings_request_from_dict = WriteApplicationSettingsRequest.from_dict(write_application_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


