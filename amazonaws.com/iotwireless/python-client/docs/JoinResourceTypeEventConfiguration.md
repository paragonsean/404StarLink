# JoinResourceTypeEventConfiguration

Join resource type event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateEventConfigurationByResourceTypesRequestJoinLoRaWAN**](UpdateEventConfigurationByResourceTypesRequestJoinLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.join_resource_type_event_configuration import JoinResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of JoinResourceTypeEventConfiguration from a JSON string
join_resource_type_event_configuration_instance = JoinResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(JoinResourceTypeEventConfiguration.to_json())

# convert the object into a dict
join_resource_type_event_configuration_dict = join_resource_type_event_configuration_instance.to_dict()
# create an instance of JoinResourceTypeEventConfiguration from a dict
join_resource_type_event_configuration_from_dict = JoinResourceTypeEventConfiguration.from_dict(join_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


