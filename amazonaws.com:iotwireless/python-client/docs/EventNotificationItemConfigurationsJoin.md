# EventNotificationItemConfigurationsJoin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestJoinLoRaWAN**](UpdateResourceEventConfigurationRequestJoinLoRaWAN.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations_join import EventNotificationItemConfigurationsJoin

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurationsJoin from a JSON string
event_notification_item_configurations_join_instance = EventNotificationItemConfigurationsJoin.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurationsJoin.to_json())

# convert the object into a dict
event_notification_item_configurations_join_dict = event_notification_item_configurations_join_instance.to_dict()
# create an instance of EventNotificationItemConfigurationsJoin from a dict
event_notification_item_configurations_join_from_dict = EventNotificationItemConfigurationsJoin.from_dict(event_notification_item_configurations_join_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


