# TableCellResult

The recognition result of one cell in one row in a table of a form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cell_values** | [**List[OcrPhotoTextElement]**](OcrPhotoTextElement.md) | Result cell value(s) extracted | [optional] 
**column_id** | **str** | The ID of the column | [optional] 

## Example

```python
from openapi_client.models.table_cell_result import TableCellResult

# TODO update the JSON string below
json = "{}"
# create an instance of TableCellResult from a JSON string
table_cell_result_instance = TableCellResult.from_json(json)
# print the JSON string representation of the object
print(TableCellResult.to_json())

# convert the object into a dict
table_cell_result_dict = table_cell_result_instance.to_dict()
# create an instance of TableCellResult from a dict
table_cell_result_from_dict = TableCellResult.from_dict(table_cell_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


