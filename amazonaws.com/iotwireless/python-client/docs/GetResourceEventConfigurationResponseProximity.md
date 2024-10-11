# GetResourceEventConfigurationResponseProximity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestProximitySidewalk**](UpdateResourceEventConfigurationRequestProximitySidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response_proximity import GetResourceEventConfigurationResponseProximity

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponseProximity from a JSON string
get_resource_event_configuration_response_proximity_instance = GetResourceEventConfigurationResponseProximity.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponseProximity.to_json())

# convert the object into a dict
get_resource_event_configuration_response_proximity_dict = get_resource_event_configuration_response_proximity_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponseProximity from a dict
get_resource_event_configuration_response_proximity_from_dict = GetResourceEventConfigurationResponseProximity.from_dict(get_resource_event_configuration_response_proximity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


