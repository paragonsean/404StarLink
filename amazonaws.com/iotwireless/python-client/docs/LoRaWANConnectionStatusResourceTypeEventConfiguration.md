# LoRaWANConnectionStatusResourceTypeEventConfiguration

Object for LoRaWAN connection status resource type event configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_gateway_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_connection_status_resource_type_event_configuration import LoRaWANConnectionStatusResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANConnectionStatusResourceTypeEventConfiguration from a JSON string
lo_ra_wan_connection_status_resource_type_event_configuration_instance = LoRaWANConnectionStatusResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(LoRaWANConnectionStatusResourceTypeEventConfiguration.to_json())

# convert the object into a dict
lo_ra_wan_connection_status_resource_type_event_configuration_dict = lo_ra_wan_connection_status_resource_type_event_configuration_instance.to_dict()
# create an instance of LoRaWANConnectionStatusResourceTypeEventConfiguration from a dict
lo_ra_wan_connection_status_resource_type_event_configuration_from_dict = LoRaWANConnectionStatusResourceTypeEventConfiguration.from_dict(lo_ra_wan_connection_status_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


