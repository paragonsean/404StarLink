# EventNotificationItemConfigurations

Object of all event configurations and the status of the event topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_registration_state** | [**EventNotificationItemConfigurationsDeviceRegistrationState**](EventNotificationItemConfigurationsDeviceRegistrationState.md) |  | [optional] 
**proximity** | [**EventNotificationItemConfigurationsProximity**](EventNotificationItemConfigurationsProximity.md) |  | [optional] 
**join** | [**EventNotificationItemConfigurationsJoin**](EventNotificationItemConfigurationsJoin.md) |  | [optional] 
**connection_status** | [**EventNotificationItemConfigurationsConnectionStatus**](EventNotificationItemConfigurationsConnectionStatus.md) |  | [optional] 
**message_delivery_status** | [**EventNotificationItemConfigurationsMessageDeliveryStatus**](EventNotificationItemConfigurationsMessageDeliveryStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations import EventNotificationItemConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurations from a JSON string
event_notification_item_configurations_instance = EventNotificationItemConfigurations.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurations.to_json())

# convert the object into a dict
event_notification_item_configurations_dict = event_notification_item_configurations_instance.to_dict()
# create an instance of EventNotificationItemConfigurations from a dict
event_notification_item_configurations_from_dict = EventNotificationItemConfigurations.from_dict(event_notification_item_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


