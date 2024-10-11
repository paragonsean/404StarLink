# AttributeOperation

An operation that applies to the requested group. This operation might add, replace, or remove an attribute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_path** | **str** |  | 
**attribute_value** | **object** |  | [optional] 

## Example

```python
from openapi_client.models.attribute_operation import AttributeOperation

# TODO update the JSON string below
json = "{}"
# create an instance of AttributeOperation from a JSON string
attribute_operation_instance = AttributeOperation.from_json(json)
# print the JSON string representation of the object
print(AttributeOperation.to_json())

# convert the object into a dict
attribute_operation_dict = attribute_operation_instance.to_dict()
# create an instance of AttributeOperation from a dict
attribute_operation_from_dict = AttributeOperation.from_dict(attribute_operation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


