# DeviceRegistrationStateResourceTypeEventConfiguration

Device registration state resource type event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateEventConfigurationByResourceTypesRequestDeviceRegistrationStateSidewalk**](UpdateEventConfigurationByResourceTypesRequestDeviceRegistrationStateSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.device_registration_state_resource_type_event_configuration import DeviceRegistrationStateResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceRegistrationStateResourceTypeEventConfiguration from a JSON string
device_registration_state_resource_type_event_configuration_instance = DeviceRegistrationStateResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(DeviceRegistrationStateResourceTypeEventConfiguration.to_json())

# convert the object into a dict
device_registration_state_resource_type_event_configuration_dict = device_registration_state_resource_type_event_configuration_instance.to_dict()
# create an instance of DeviceRegistrationStateResourceTypeEventConfiguration from a dict
device_registration_state_resource_type_event_configuration_from_dict = DeviceRegistrationStateResourceTypeEventConfiguration.from_dict(device_registration_state_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


