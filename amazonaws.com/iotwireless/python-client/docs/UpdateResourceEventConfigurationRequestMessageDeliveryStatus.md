# UpdateResourceEventConfigurationRequestMessageDeliveryStatus

Message delivery status event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**SidewalkEventNotificationConfigurations**](SidewalkEventNotificationConfigurations.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request_message_delivery_status import UpdateResourceEventConfigurationRequestMessageDeliveryStatus

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequestMessageDeliveryStatus from a JSON string
update_resource_event_configuration_request_message_delivery_status_instance = UpdateResourceEventConfigurationRequestMessageDeliveryStatus.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequestMessageDeliveryStatus.to_json())

# convert the object into a dict
update_resource_event_configuration_request_message_delivery_status_dict = update_resource_event_configuration_request_message_delivery_status_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequestMessageDeliveryStatus from a dict
update_resource_event_configuration_request_message_delivery_status_from_dict = UpdateResourceEventConfigurationRequestMessageDeliveryStatus.from_dict(update_resource_event_configuration_request_message_delivery_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


