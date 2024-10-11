# LoRaWANJoinResourceTypeEventConfiguration

Object for LoRaWAN join resource type event configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_device_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_join_resource_type_event_configuration import LoRaWANJoinResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANJoinResourceTypeEventConfiguration from a JSON string
lo_ra_wan_join_resource_type_event_configuration_instance = LoRaWANJoinResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(LoRaWANJoinResourceTypeEventConfiguration.to_json())

# convert the object into a dict
lo_ra_wan_join_resource_type_event_configuration_dict = lo_ra_wan_join_resource_type_event_configuration_instance.to_dict()
# create an instance of LoRaWANJoinResourceTypeEventConfiguration from a dict
lo_ra_wan_join_resource_type_event_configuration_from_dict = LoRaWANJoinResourceTypeEventConfiguration.from_dict(lo_ra_wan_join_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


