# UpdateResourceEventConfigurationRequestProximity

Proximity event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestProximitySidewalk**](UpdateResourceEventConfigurationRequestProximitySidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request_proximity import UpdateResourceEventConfigurationRequestProximity

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequestProximity from a JSON string
update_resource_event_configuration_request_proximity_instance = UpdateResourceEventConfigurationRequestProximity.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequestProximity.to_json())

# convert the object into a dict
update_resource_event_configuration_request_proximity_dict = update_resource_event_configuration_request_proximity_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequestProximity from a dict
update_resource_event_configuration_request_proximity_from_dict = UpdateResourceEventConfigurationRequestProximity.from_dict(update_resource_event_configuration_request_proximity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


