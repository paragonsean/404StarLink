# ResultRow

Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouped_bys** | **List** |  | 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.result_row import ResultRow

# TODO update the JSON string below
json = "{}"
# create an instance of ResultRow from a JSON string
result_row_instance = ResultRow.from_json(json)
# print the JSON string representation of the object
print(ResultRow.to_json())

# convert the object into a dict
result_row_dict = result_row_instance.to_dict()
# create an instance of ResultRow from a dict
result_row_from_dict = ResultRow.from_dict(result_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


