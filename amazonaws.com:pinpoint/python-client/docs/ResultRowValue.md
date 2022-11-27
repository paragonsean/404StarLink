# ResultRowValue

Provides a single value and metadata about that value as part of an array of query results for a standard metric that applies to an application, campaign, or journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**type** | **str** |  | 
**value** | **str** |  | 

## Example

```python
from openapi_client.models.result_row_value import ResultRowValue

# TODO update the JSON string below
json = "{}"
# create an instance of ResultRowValue from a JSON string
result_row_value_instance = ResultRowValue.from_json(json)
# print the JSON string representation of the object
print(ResultRowValue.to_json())

# convert the object into a dict
result_row_value_dict = result_row_value_instance.to_dict()
# create an instance of ResultRowValue from a dict
result_row_value_from_dict = ResultRowValue.from_dict(result_row_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


