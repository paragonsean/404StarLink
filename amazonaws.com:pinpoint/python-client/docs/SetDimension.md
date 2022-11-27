# SetDimension

Specifies the dimension type and values for a segment dimension.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.set_dimension import SetDimension

# TODO update the JSON string below
json = "{}"
# create an instance of SetDimension from a JSON string
set_dimension_instance = SetDimension.from_json(json)
# print the JSON string representation of the object
print(SetDimension.to_json())

# convert the object into a dict
set_dimension_dict = set_dimension_instance.to_dict()
# create an instance of SetDimension from a dict
set_dimension_from_dict = SetDimension.from_dict(set_dimension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


