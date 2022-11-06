# DescribeStatementResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_identifier** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**database** | **str** |  | [optional] 
**db_user** | **str** |  | [optional] 
**duration** | **int** |  | [optional] 
**error** | **str** |  | [optional] 
**has_result_set** | **bool** |  | [optional] 
**id** | **str** |  | 
**query_parameters** | **List** |  | [optional] 
**query_string** | **str** |  | [optional] 
**redshift_pid** | **int** |  | [optional] 
**redshift_query_id** | **int** |  | [optional] 
**result_rows** | **int** |  | [optional] 
**result_size** | **int** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**status** | [**StatusString**](StatusString.md) |  | [optional] 
**sub_statements** | **List** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_statement_response import DescribeStatementResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeStatementResponse from a JSON string
describe_statement_response_instance = DescribeStatementResponse.from_json(json)
# print the JSON string representation of the object
print(DescribeStatementResponse.to_json())

# convert the object into a dict
describe_statement_response_dict = describe_statement_response_instance.to_dict()
# create an instance of DescribeStatementResponse from a dict
describe_statement_response_from_dict = DescribeStatementResponse.from_dict(describe_statement_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


