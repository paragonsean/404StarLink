# GetResourceEventConfigurationResponseDeviceRegistrationState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk**](UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response_device_registration_state import GetResourceEventConfigurationResponseDeviceRegistrationState

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponseDeviceRegistrationState from a JSON string
get_resource_event_configuration_response_device_registration_state_instance = GetResourceEventConfigurationResponseDeviceRegistrationState.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponseDeviceRegistrationState.to_json())

# convert the object into a dict
get_resource_event_configuration_response_device_registration_state_dict = get_resource_event_configuration_response_device_registration_state_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponseDeviceRegistrationState from a dict
get_resource_event_configuration_response_device_registration_state_from_dict = GetResourceEventConfigurationResponseDeviceRegistrationState.from_dict(get_resource_event_configuration_response_device_registration_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


