# GetResourceEventConfigurationResponseConnectionStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN**](UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN.md) |  | [optional] 
**wireless_gateway_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response_connection_status import GetResourceEventConfigurationResponseConnectionStatus

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponseConnectionStatus from a JSON string
get_resource_event_configuration_response_connection_status_instance = GetResourceEventConfigurationResponseConnectionStatus.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponseConnectionStatus.to_json())

# convert the object into a dict
get_resource_event_configuration_response_connection_status_dict = get_resource_event_configuration_response_connection_status_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponseConnectionStatus from a dict
get_resource_event_configuration_response_connection_status_from_dict = GetResourceEventConfigurationResponseConnectionStatus.from_dict(get_resource_event_configuration_response_connection_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


