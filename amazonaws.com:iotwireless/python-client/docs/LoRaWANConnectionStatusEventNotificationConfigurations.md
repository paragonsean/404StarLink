# LoRaWANConnectionStatusEventNotificationConfigurations

Object for LoRaWAN connection status resource type event configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gateway_eui_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_connection_status_event_notification_configurations import LoRaWANConnectionStatusEventNotificationConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANConnectionStatusEventNotificationConfigurations from a JSON string
lo_ra_wan_connection_status_event_notification_configurations_instance = LoRaWANConnectionStatusEventNotificationConfigurations.from_json(json)
# print the JSON string representation of the object
print(LoRaWANConnectionStatusEventNotificationConfigurations.to_json())

# convert the object into a dict
lo_ra_wan_connection_status_event_notification_configurations_dict = lo_ra_wan_connection_status_event_notification_configurations_instance.to_dict()
# create an instance of LoRaWANConnectionStatusEventNotificationConfigurations from a dict
lo_ra_wan_connection_status_event_notification_configurations_from_dict = LoRaWANConnectionStatusEventNotificationConfigurations.from_dict(lo_ra_wan_connection_status_event_notification_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


