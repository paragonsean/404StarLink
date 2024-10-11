# GetResourceEventConfigurationResponseMessageDeliveryStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**SidewalkEventNotificationConfigurations**](SidewalkEventNotificationConfigurations.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response_message_delivery_status import GetResourceEventConfigurationResponseMessageDeliveryStatus

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponseMessageDeliveryStatus from a JSON string
get_resource_event_configuration_response_message_delivery_status_instance = GetResourceEventConfigurationResponseMessageDeliveryStatus.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponseMessageDeliveryStatus.to_json())

# convert the object into a dict
get_resource_event_configuration_response_message_delivery_status_dict = get_resource_event_configuration_response_message_delivery_status_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponseMessageDeliveryStatus from a dict
get_resource_event_configuration_response_message_delivery_status_from_dict = GetResourceEventConfigurationResponseMessageDeliveryStatus.from_dict(get_resource_event_configuration_response_message_delivery_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


