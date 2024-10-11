# JoinEventConfiguration

Join event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestJoinLoRaWAN**](UpdateResourceEventConfigurationRequestJoinLoRaWAN.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.join_event_configuration import JoinEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of JoinEventConfiguration from a JSON string
join_event_configuration_instance = JoinEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(JoinEventConfiguration.to_json())

# convert the object into a dict
join_event_configuration_dict = join_event_configuration_instance.to_dict()
# create an instance of JoinEventConfiguration from a dict
join_event_configuration_from_dict = JoinEventConfiguration.from_dict(join_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


