# EventNotificationItemConfigurationsConnectionStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN**](UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN.md) |  | [optional] 
**wireless_gateway_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations_connection_status import EventNotificationItemConfigurationsConnectionStatus

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurationsConnectionStatus from a JSON string
event_notification_item_configurations_connection_status_instance = EventNotificationItemConfigurationsConnectionStatus.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurationsConnectionStatus.to_json())

# convert the object into a dict
event_notification_item_configurations_connection_status_dict = event_notification_item_configurations_connection_status_instance.to_dict()
# create an instance of EventNotificationItemConfigurationsConnectionStatus from a dict
event_notification_item_configurations_connection_status_from_dict = EventNotificationItemConfigurationsConnectionStatus.from_dict(event_notification_item_configurations_connection_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


