# PositionConfigurationItem

The wrapper for a position configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_identifier** | **str** |  | [optional] 
**resource_type** | [**PositionResourceType**](PositionResourceType.md) |  | [optional] 
**solvers** | [**PositionConfigurationItemSolvers**](PositionConfigurationItemSolvers.md) |  | [optional] 
**destination** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.position_configuration_item import PositionConfigurationItem

# TODO update the JSON string below
json = "{}"
# create an instance of PositionConfigurationItem from a JSON string
position_configuration_item_instance = PositionConfigurationItem.from_json(json)
# print the JSON string representation of the object
print(PositionConfigurationItem.to_json())

# convert the object into a dict
position_configuration_item_dict = position_configuration_item_instance.to_dict()
# create an instance of PositionConfigurationItem from a dict
position_configuration_item_from_dict = PositionConfigurationItem.from_dict(position_configuration_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


