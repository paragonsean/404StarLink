# UpdateResourceEventConfigurationRequestDeviceRegistrationState

Device registration state event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk**](UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request_device_registration_state import UpdateResourceEventConfigurationRequestDeviceRegistrationState

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequestDeviceRegistrationState from a JSON string
update_resource_event_configuration_request_device_registration_state_instance = UpdateResourceEventConfigurationRequestDeviceRegistrationState.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequestDeviceRegistrationState.to_json())

# convert the object into a dict
update_resource_event_configuration_request_device_registration_state_dict = update_resource_event_configuration_request_device_registration_state_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequestDeviceRegistrationState from a dict
update_resource_event_configuration_request_device_registration_state_from_dict = UpdateResourceEventConfigurationRequestDeviceRegistrationState.from_dict(update_resource_event_configuration_request_device_registration_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


