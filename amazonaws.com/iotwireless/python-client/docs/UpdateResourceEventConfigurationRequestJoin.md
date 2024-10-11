# UpdateResourceEventConfigurationRequestJoin

Join event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**UpdateResourceEventConfigurationRequestJoinLoRaWAN**](UpdateResourceEventConfigurationRequestJoinLoRaWAN.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request_join import UpdateResourceEventConfigurationRequestJoin

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequestJoin from a JSON string
update_resource_event_configuration_request_join_instance = UpdateResourceEventConfigurationRequestJoin.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequestJoin.to_json())

# convert the object into a dict
update_resource_event_configuration_request_join_dict = update_resource_event_configuration_request_join_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequestJoin from a dict
update_resource_event_configuration_request_join_from_dict = UpdateResourceEventConfigurationRequestJoin.from_dict(update_resource_event_configuration_request_join_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


