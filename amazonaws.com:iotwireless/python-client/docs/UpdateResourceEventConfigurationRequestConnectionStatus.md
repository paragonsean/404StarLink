# UpdateResourceEventConfigurationRequestConnectionStatus

Connection status event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN**](UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN.md) |  | [optional] 
**wireless_gateway_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request_connection_status import UpdateResourceEventConfigurationRequestConnectionStatus

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequestConnectionStatus from a JSON string
update_resource_event_configuration_request_connection_status_instance = UpdateResourceEventConfigurationRequestConnectionStatus.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequestConnectionStatus.to_json())

# convert the object into a dict
update_resource_event_configuration_request_connection_status_dict = update_resource_event_configuration_request_connection_status_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequestConnectionStatus from a dict
update_resource_event_configuration_request_connection_status_from_dict = UpdateResourceEventConfigurationRequestConnectionStatus.from_dict(update_resource_event_configuration_request_connection_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


