# EventNotificationItemConfigurationsDeviceRegistrationState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk**](UpdateResourceEventConfigurationRequestDeviceRegistrationStateSidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations_device_registration_state import EventNotificationItemConfigurationsDeviceRegistrationState

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurationsDeviceRegistrationState from a JSON string
event_notification_item_configurations_device_registration_state_instance = EventNotificationItemConfigurationsDeviceRegistrationState.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurationsDeviceRegistrationState.to_json())

# convert the object into a dict
event_notification_item_configurations_device_registration_state_dict = event_notification_item_configurations_device_registration_state_instance.to_dict()
# create an instance of EventNotificationItemConfigurationsDeviceRegistrationState from a dict
event_notification_item_configurations_device_registration_state_from_dict = EventNotificationItemConfigurationsDeviceRegistrationState.from_dict(event_notification_item_configurations_device_registration_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


