# StatementData

The SQL statement to run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [optional] 
**id** | **str** |  | 
**is_batch_statement** | **bool** |  | [optional] 
**query_parameters** | **List** |  | [optional] 
**query_string** | **str** |  | [optional] 
**query_strings** | **List** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**statement_name** | **str** |  | [optional] 
**status** | [**StatusString**](StatusString.md) |  | [optional] 
**updated_at** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.statement_data import StatementData

# TODO update the JSON string below
json = "{}"
# create an instance of StatementData from a JSON string
statement_data_instance = StatementData.from_json(json)
# print the JSON string representation of the object
print(StatementData.to_json())

# convert the object into a dict
statement_data_dict = statement_data_instance.to_dict()
# create an instance of StatementData from a dict
statement_data_from_dict = StatementData.from_dict(statement_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


