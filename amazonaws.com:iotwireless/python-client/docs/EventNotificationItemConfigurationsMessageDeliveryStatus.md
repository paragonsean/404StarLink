# EventNotificationItemConfigurationsMessageDeliveryStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**SidewalkEventNotificationConfigurations**](SidewalkEventNotificationConfigurations.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations_message_delivery_status import EventNotificationItemConfigurationsMessageDeliveryStatus

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurationsMessageDeliveryStatus from a JSON string
event_notification_item_configurations_message_delivery_status_instance = EventNotificationItemConfigurationsMessageDeliveryStatus.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurationsMessageDeliveryStatus.to_json())

# convert the object into a dict
event_notification_item_configurations_message_delivery_status_dict = event_notification_item_configurations_message_delivery_status_instance.to_dict()
# create an instance of EventNotificationItemConfigurationsMessageDeliveryStatus from a dict
event_notification_item_configurations_message_delivery_status_from_dict = EventNotificationItemConfigurationsMessageDeliveryStatus.from_dict(event_notification_item_configurations_message_delivery_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


