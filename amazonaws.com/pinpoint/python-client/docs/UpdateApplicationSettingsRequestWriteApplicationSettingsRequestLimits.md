# UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily** | **int** |  | [optional] 
**maximum_duration** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**total** | **int** |  | [optional] 
**session** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.update_application_settings_request_write_application_settings_request_limits import UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits from a JSON string
update_application_settings_request_write_application_settings_request_limits_instance = UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits.from_json(json)
# print the JSON string representation of the object
print(UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits.to_json())

# convert the object into a dict
update_application_settings_request_write_application_settings_request_limits_dict = update_application_settings_request_write_application_settings_request_limits_instance.to_dict()
# create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits from a dict
update_application_settings_request_write_application_settings_request_limits_from_dict = UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits.from_dict(update_application_settings_request_write_application_settings_request_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


