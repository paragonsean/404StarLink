# LoRaWANJoinEventNotificationConfigurations

Object for LoRaWAN join resource type event configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_eui_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_join_event_notification_configurations import LoRaWANJoinEventNotificationConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANJoinEventNotificationConfigurations from a JSON string
lo_ra_wan_join_event_notification_configurations_instance = LoRaWANJoinEventNotificationConfigurations.from_json(json)
# print the JSON string representation of the object
print(LoRaWANJoinEventNotificationConfigurations.to_json())

# convert the object into a dict
lo_ra_wan_join_event_notification_configurations_dict = lo_ra_wan_join_event_notification_configurations_instance.to_dict()
# create an instance of LoRaWANJoinEventNotificationConfigurations from a dict
lo_ra_wan_join_event_notification_configurations_from_dict = LoRaWANJoinEventNotificationConfigurations.from_dict(lo_ra_wan_join_event_notification_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


