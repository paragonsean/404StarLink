# ProximityEventConfiguration

Proximity event configuration object for enabling and disabling relevant topics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateResourceEventConfigurationRequestProximitySidewalk**](UpdateResourceEventConfigurationRequestProximitySidewalk.md) |  | [optional] 
**wireless_device_id_event_topic** | [**EventNotificationTopicStatus**](EventNotificationTopicStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.proximity_event_configuration import ProximityEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ProximityEventConfiguration from a JSON string
proximity_event_configuration_instance = ProximityEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(ProximityEventConfiguration.to_json())

# convert the object into a dict
proximity_event_configuration_dict = proximity_event_configuration_instance.to_dict()
# create an instance of ProximityEventConfiguration from a dict
proximity_event_configuration_from_dict = ProximityEventConfiguration.from_dict(proximity_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


