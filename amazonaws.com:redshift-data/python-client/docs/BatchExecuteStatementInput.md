# BatchExecuteStatementInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_token** | **str** |  | [optional] 
**cluster_identifier** | **str** |  | [optional] 
**database** | **str** |  | 
**db_user** | **str** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**sqls** | **List** |  | 
**statement_name** | **str** |  | [optional] 
**with_event** | **bool** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.batch_execute_statement_input import BatchExecuteStatementInput

# TODO update the JSON string below
json = "{}"
# create an instance of BatchExecuteStatementInput from a JSON string
batch_execute_statement_input_instance = BatchExecuteStatementInput.from_json(json)
# print the JSON string representation of the object
print(BatchExecuteStatementInput.to_json())

# convert the object into a dict
batch_execute_statement_input_dict = batch_execute_statement_input_instance.to_dict()
# create an instance of BatchExecuteStatementInput from a dict
batch_execute_statement_input_from_dict = BatchExecuteStatementInput.from_dict(batch_execute_statement_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


