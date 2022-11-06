# SubStatementData

Information about an SQL statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] 
**duration** | **int** |  | [optional] 
**error** | **str** |  | [optional] 
**has_result_set** | **bool** |  | [optional] 
**id** | **str** |  | 
**query_string** | **str** |  | [optional] 
**redshift_query_id** | **int** |  | [optional] 
**result_rows** | **int** |  | [optional] 
**result_size** | **int** |  | [optional] 
**status** | [**StatementStatusString**](StatementStatusString.md) |  | [optional] 
**updated_at** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.sub_statement_data import SubStatementData

# TODO update the JSON string below
json = "{}"
# create an instance of SubStatementData from a JSON string
sub_statement_data_instance = SubStatementData.from_json(json)
# print the JSON string representation of the object
print(SubStatementData.to_json())

# convert the object into a dict
sub_statement_data_dict = sub_statement_data_instance.to_dict()
# create an instance of SubStatementData from a dict
sub_statement_data_from_dict = SubStatementData.from_dict(sub_statement_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


