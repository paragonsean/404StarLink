# ExecuteStatementInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_token** | **str** |  | [optional] 
**cluster_identifier** | **str** |  | [optional] 
**database** | **str** |  | 
**db_user** | **str** |  | [optional] 
**parameters** | **List** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**sql** | **str** |  | 
**statement_name** | **str** |  | [optional] 
**with_event** | **bool** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.execute_statement_input import ExecuteStatementInput

# TODO update the JSON string below
json = "{}"
# create an instance of ExecuteStatementInput from a JSON string
execute_statement_input_instance = ExecuteStatementInput.from_json(json)
# print the JSON string representation of the object
print(ExecuteStatementInput.to_json())

# convert the object into a dict
execute_statement_input_dict = execute_statement_input_instance.to_dict()
# create an instance of ExecuteStatementInput from a dict
execute_statement_input_from_dict = ExecuteStatementInput.from_dict(execute_statement_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


