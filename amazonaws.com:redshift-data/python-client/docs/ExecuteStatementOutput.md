# ExecuteStatementOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_identifier** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**database** | **str** |  | [optional] 
**db_user** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.execute_statement_output import ExecuteStatementOutput

# TODO update the JSON string below
json = "{}"
# create an instance of ExecuteStatementOutput from a JSON string
execute_statement_output_instance = ExecuteStatementOutput.from_json(json)
# print the JSON string representation of the object
print(ExecuteStatementOutput.to_json())

# convert the object into a dict
execute_statement_output_dict = execute_statement_output_instance.to_dict()
# create an instance of ExecuteStatementOutput from a dict
execute_statement_output_from_dict = ExecuteStatementOutput.from_dict(execute_statement_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


