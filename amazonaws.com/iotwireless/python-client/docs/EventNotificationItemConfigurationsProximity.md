# EventNotificationItemConfigurationsProximity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestProximitySidewalk**](UpdateResourceEventConfigurationRequestProximitySidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_notification_item_configurations_proximity import EventNotificationItemConfigurationsProximity

# TODO update the JSON string below
json = "{}"
# create an instance of EventNotificationItemConfigurationsProximity from a JSON string
event_notification_item_configurations_proximity_instance = EventNotificationItemConfigurationsProximity.from_json(json)
# print the JSON string representation of the object
print(EventNotificationItemConfigurationsProximity.to_json())

# convert the object into a dict
event_notification_item_configurations_proximity_dict = event_notification_item_configurations_proximity_instance.to_dict()
# create an instance of EventNotificationItemConfigurationsProximity from a dict
event_notification_item_configurations_proximity_from_dict = EventNotificationItemConfigurationsProximity.from_dict(event_notification_item_configurations_proximity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


