# AttributeDimension

Specifies attribute-based criteria for including or excluding endpoints from a segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_type** | [**AttributeType**](AttributeType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.attribute_dimension import AttributeDimension

# TODO update the JSON string below
json = "{}"
# create an instance of AttributeDimension from a JSON string
attribute_dimension_instance = AttributeDimension.from_json(json)
# print the JSON string representation of the object
print(AttributeDimension.to_json())

# convert the object into a dict
attribute_dimension_dict = attribute_dimension_instance.to_dict()
# create an instance of AttributeDimension from a dict
attribute_dimension_from_dict = AttributeDimension.from_dict(attribute_dimension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


