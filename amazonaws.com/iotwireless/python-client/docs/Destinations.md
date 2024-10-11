# Destinations

Describes a destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**expression_type** | [**ExpressionType**](ExpressionType.md) |  | [optional] 
**expression** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.destinations import Destinations

# TODO update the JSON string below
json = "{}"
# create an instance of Destinations from a JSON string
destinations_instance = Destinations.from_json(json)
# print the JSON string representation of the object
print(Destinations.to_json())

# convert the object into a dict
destinations_dict = destinations_instance.to_dict()
# create an instance of Destinations from a dict
destinations_from_dict = Destinations.from_dict(destinations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


