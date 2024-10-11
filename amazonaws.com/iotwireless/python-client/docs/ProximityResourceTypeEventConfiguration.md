# ProximityResourceTypeEventConfiguration

Proximity resource type event configuration object for enabling or disabling topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateEventConfigurationByResourceTypesRequestProximitySidewalk**](UpdateEventConfigurationByResourceTypesRequestProximitySidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.proximity_resource_type_event_configuration import ProximityResourceTypeEventConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ProximityResourceTypeEventConfiguration from a JSON string
proximity_resource_type_event_configuration_instance = ProximityResourceTypeEventConfiguration.from_json(json)
# print the JSON string representation of the object
print(ProximityResourceTypeEventConfiguration.to_json())

# convert the object into a dict
proximity_resource_type_event_configuration_dict = proximity_resource_type_event_configuration_instance.to_dict()
# create an instance of ProximityResourceTypeEventConfiguration from a dict
proximity_resource_type_event_configuration_from_dict = ProximityResourceTypeEventConfiguration.from_dict(proximity_resource_type_event_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


