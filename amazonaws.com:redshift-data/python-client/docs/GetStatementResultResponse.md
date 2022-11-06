# GetStatementResultResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column_metadata** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 
**records** | **List** |  | 
**total_num_rows** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.get_statement_result_response import GetStatementResultResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetStatementResultResponse from a JSON string
get_statement_result_response_instance = GetStatementResultResponse.from_json(json)
# print the JSON string representation of the object
print(GetStatementResultResponse.to_json())

# convert the object into a dict
get_statement_result_response_dict = get_statement_result_response_instance.to_dict()
# create an instance of GetStatementResultResponse from a dict
get_statement_result_response_from_dict = GetStatementResultResponse.from_dict(get_statement_result_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


