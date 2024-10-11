# DeviceRegistrationStateEventConfiguration

Device registration state event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk**](UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.device_registration_state_event_configuration import DeviceRegistrationStateEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceRegistrationStateEventConfiguration from a JSON string
device_registration_state_event_configuration_instance = DeviceRegistrationStateEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(DeviceRegistrationStateEventConfiguration.to_json())

# convert the object into a dict
device_registration_state_event_configuration_dict = device_registration_state_event_configuration_instance.to_dict()
# create an instance of DeviceRegistrationStateEventConfiguration from a dict
device_registration_state_event_configuration_from_dict = DeviceRegistrationStateEventConfiguration.from_dict(device_registration_state_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


