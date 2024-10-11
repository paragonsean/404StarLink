# EventConfigurationItem

Event configuration object for a single resource.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** |  | [optional] 
**identifier_type** | [**IdentifierType**](IdentifierType.md) |  | [optional] 
**partner_type** | [**EventNotificationPartnerType**](EventNotificationPartnerType.md) |  | [optional] 
**events** | [**EventNotificationItemConfigurations**](EventNotificationItemConfigurations.md) |  | [optional] 

## Example

```python
from openapi_client.models.event_configuration_item import EventConfigurationItem

# TODO update the JSON string below
json = "{}"
# create an instance of EventConfigurationItem from a JSON string
event_configuration_item_instance = EventConfigurationItem.from_json(json)
# print the JSON string representation of the object
print(EventConfigurationItem.to_json())

# convert the object into a dict
event_configuration_item_dict = event_configuration_item_instance.to_dict()
# create an instance of EventConfigurationItem from a dict
event_configuration_item_from_dict = EventConfigurationItem.from_dict(event_configuration_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


