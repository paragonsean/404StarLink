# SidewalkResourceTypeEventConfiguration

Sidewalk resource type event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_device_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_resource_type_event_configuration import SidewalkResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkResourceTypeEventConfiguration from a JSON string
sidewalk_resource_type_event_configuration_instance = SidewalkResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(SidewalkResourceTypeEventConfiguration.to_json())

# convert the object into a dict
sidewalk_resource_type_event_configuration_dict = sidewalk_resource_type_event_configuration_instance.to_dict()
# create an instance of SidewalkResourceTypeEventConfiguration from a dict
sidewalk_resource_type_event_configuration_from_dict = SidewalkResourceTypeEventConfiguration.from_dict(sidewalk_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


