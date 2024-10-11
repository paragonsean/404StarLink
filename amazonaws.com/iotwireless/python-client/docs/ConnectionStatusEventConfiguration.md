# ConnectionStatusEventConfiguration

Connection status event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN**](UpdateResourceEventConfigurationRequestConnectionStatusLoRaWAN.md) |  | [optional] 
**wireless_gateway_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.connection_status_event_configuration import ConnectionStatusEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectionStatusEventConfiguration from a JSON string
connection_status_event_configuration_instance = ConnectionStatusEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(ConnectionStatusEventConfiguration.to_json())

# convert the object into a dict
connection_status_event_configuration_dict = connection_status_event_configuration_instance.to_dict()
# create an instance of ConnectionStatusEventConfiguration from a dict
connection_status_event_configuration_from_dict = ConnectionStatusEventConfiguration.from_dict(connection_status_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


