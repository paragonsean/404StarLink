# GetResourceEventConfigurationResponseJoin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestJoinLoRaWAN**](UpdateResourceEventConfigurationRequestJoinLoRaWAN.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response_join import GetResourceEventConfigurationResponseJoin

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponseJoin from a JSON string
get_resource_event_configuration_response_join_instance = GetResourceEventConfigurationResponseJoin.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponseJoin.to_json())

# convert the object into a dict
get_resource_event_configuration_response_join_dict = get_resource_event_configuration_response_join_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponseJoin from a dict
get_resource_event_configuration_response_join_from_dict = GetResourceEventConfigurationResponseJoin.from_dict(get_resource_event_configuration_response_join_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


