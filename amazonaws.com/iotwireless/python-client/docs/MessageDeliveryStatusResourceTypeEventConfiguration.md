# MessageDeliveryStatusResourceTypeEventConfiguration

Message delivery status resource type event configuration object for enabling or disabling relevant topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**SidewalkResourceTypeEventConfiguration**](SidewalkResourceTypeEventConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_delivery_status_resource_type_event_configuration import MessageDeliveryStatusResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeliveryStatusResourceTypeEventConfiguration from a JSON string
message_delivery_status_resource_type_event_configuration_instance = MessageDeliveryStatusResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(MessageDeliveryStatusResourceTypeEventConfiguration.to_json())

# convert the object into a dict
message_delivery_status_resource_type_event_configuration_dict = message_delivery_status_resource_type_event_configuration_instance.to_dict()
# create an instance of MessageDeliveryStatusResourceTypeEventConfiguration from a dict
message_delivery_status_resource_type_event_configuration_from_dict = MessageDeliveryStatusResourceTypeEventConfiguration.from_dict(message_delivery_status_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


