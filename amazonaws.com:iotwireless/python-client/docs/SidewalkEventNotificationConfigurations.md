# SidewalkEventNotificationConfigurations

 <code>SidewalkEventNotificationConfigurations</code> object, which is the event configuration object for Sidewalk-related event topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_event_notification_configurations import SidewalkEventNotificationConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkEventNotificationConfigurations from a JSON string
sidewalk_event_notification_configurations_instance = SidewalkEventNotificationConfigurations.from_json(json)
# print the JSON string representation of the object
print(SidewalkEventNotificationConfigurations.to_json())

# convert the object into a dict
sidewalk_event_notification_configurations_dict = sidewalk_event_notification_configurations_instance.to_dict()
# create an instance of SidewalkEventNotificationConfigurations from a dict
sidewalk_event_notification_configurations_from_dict = SidewalkEventNotificationConfigurations.from_dict(sidewalk_event_notification_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


