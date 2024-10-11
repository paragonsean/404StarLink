# MessageDeliveryStatusEventConfiguration

Message delivery status event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**SidewalkEventNotificationConfigurations**](SidewalkEventNotificationConfigurations.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_delivery_status_event_configuration import MessageDeliveryStatusEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeliveryStatusEventConfiguration from a JSON string
message_delivery_status_event_configuration_instance = MessageDeliveryStatusEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(MessageDeliveryStatusEventConfiguration.to_json())

# convert the object into a dict
message_delivery_status_event_configuration_dict = message_delivery_status_event_configuration_instance.to_dict()
# create an instance of MessageDeliveryStatusEventConfiguration from a dict
message_delivery_status_event_configuration_from_dict = MessageDeliveryStatusEventConfiguration.from_dict(message_delivery_status_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


