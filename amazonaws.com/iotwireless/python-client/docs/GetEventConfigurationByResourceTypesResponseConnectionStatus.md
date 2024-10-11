# GetEventConfigurationByResourceTypesResponseConnectionStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateEventConfigurationByResourceTypesRequestConnectionStatusLoRaWAN**](UpdateEventConfigurationByResourceTypesRequestConnectionStatusLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_event_configuration_by_resource_types_response_connection_status import GetEventConfigurationByResourceTypesResponseConnectionStatus

# TODO update the JSON string below
json = "{}"
# create an instance of GetEventConfigurationByResourceTypesResponseConnectionStatus from a JSON string
get_event_configuration_by_resource_types_response_connection_status_instance = GetEventConfigurationByResourceTypesResponseConnectionStatus.from_json(json)
# print the JSON string representation of the object
print(GetEventConfigurationByResourceTypesResponseConnectionStatus.to_json())

# convert the object into a dict
get_event_configuration_by_resource_types_response_connection_status_dict = get_event_configuration_by_resource_types_response_connection_status_instance.to_dict()
# create an instance of GetEventConfigurationByResourceTypesResponseConnectionStatus from a dict
get_event_configuration_by_resource_types_response_connection_status_from_dict = GetEventConfigurationByResourceTypesResponseConnectionStatus.from_dict(get_event_configuration_by_resource_types_response_connection_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


