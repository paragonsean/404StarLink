# TableResult

The result of reading a table via OCR from a form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_definition** | [**FormTableDefinition**](FormTableDefinition.md) |  | [optional] 
**table_rows_result** | [**List[TableRowResult]**](TableRowResult.md) | Rows of data in the table | [optional] 

## Example

```python
from openapi_client.models.table_result import TableResult

# TODO update the JSON string below
json = "{}"
# create an instance of TableResult from a JSON string
table_result_instance = TableResult.from_json(json)
# print the JSON string representation of the object
print(TableResult.to_json())

# convert the object into a dict
table_result_dict = table_result_instance.to_dict()
# create an instance of TableResult from a dict
table_result_from_dict = TableResult.from_dict(table_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


