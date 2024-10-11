# GetEventConfigurationByResourceTypesResponseJoin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateEventConfigurationByResourceTypesRequestJoinLoRaWAN**](UpdateEventConfigurationByResourceTypesRequestJoinLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_event_configuration_by_resource_types_response_join import GetEventConfigurationByResourceTypesResponseJoin

# TODO update the JSON string below
json = "{}"
# create an instance of GetEventConfigurationByResourceTypesResponseJoin from a JSON string
get_event_configuration_by_resource_types_response_join_instance = GetEventConfigurationByResourceTypesResponseJoin.from_json(json)
# print the JSON string representation of the object
print(GetEventConfigurationByResourceTypesResponseJoin.to_json())

# convert the object into a dict
get_event_configuration_by_resource_types_response_join_dict = get_event_configuration_by_resource_types_response_join_instance.to_dict()
# create an instance of GetEventConfigurationByResourceTypesResponseJoin from a dict
get_event_configuration_by_resource_types_response_join_from_dict = GetEventConfigurationByResourceTypesResponseJoin.from_dict(get_event_configuration_by_resource_types_response_join_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


