# NormalizedValue

Contains information relating to dates in a document, including the type of value, and the value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** |  | [optional] 
**value_type** | [**ValueType**](ValueType.md) |  | [optional] 

## Example

```python
from openapi_client.models.normalized_value import NormalizedValue

# TODO update the JSON string below
json = "{}"
# create an instance of NormalizedValue from a JSON string
normalized_value_instance = NormalizedValue.from_json(json)
# print the JSON string representation of the object
print(NormalizedValue.to_json())

# convert the object into a dict
normalized_value_dict = normalized_value_instance.to_dict()
# create an instance of NormalizedValue from a dict
normalized_value_from_dict = NormalizedValue.from_dict(normalized_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


