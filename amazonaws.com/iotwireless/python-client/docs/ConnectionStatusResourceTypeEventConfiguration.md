# ConnectionStatusResourceTypeEventConfiguration

Connection status resource type event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateEventConfigurationByResourceTypesRequestConnectionStatusLoRaWAN**](UpdateEventConfigurationByResourceTypesRequestConnectionStatusLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.connection_status_resource_type_event_configuration import ConnectionStatusResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ConnectionStatusResourceTypeEventConfiguration from a JSON string
connection_status_resource_type_event_configuration_instance = ConnectionStatusResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(ConnectionStatusResourceTypeEventConfiguration.to_json())

# convert the object into a dict
connection_status_resource_type_event_configuration_dict = connection_status_resource_type_event_configuration_instance.to_dict()
# create an instance of ConnectionStatusResourceTypeEventConfiguration from a dict
connection_status_resource_type_event_configuration_from_dict = ConnectionStatusResourceTypeEventConfiguration.from_dict(connection_status_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


