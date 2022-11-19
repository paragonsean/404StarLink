# TableRowResult

One row of data in the resulting table

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_row_cells_result** | [**List[TableCellResult]**](TableCellResult.md) | Table cells in this row result | [optional] 

## Example

```python
from openapi_client.models.table_row_result import TableRowResult

# TODO update the JSON string below
json = "{}"
# create an instance of TableRowResult from a JSON string
table_row_result_instance = TableRowResult.from_json(json)
# print the JSON string representation of the object
print(TableRowResult.to_json())

# convert the object into a dict
table_row_result_dict = table_row_result_instance.to_dict()
# create an instance of TableRowResult from a dict
table_row_result_from_dict = TableRowResult.from_dict(table_row_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


