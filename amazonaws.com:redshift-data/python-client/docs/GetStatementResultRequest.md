# GetStatementResultRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_statement_result_request import GetStatementResultRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetStatementResultRequest from a JSON string
get_statement_result_request_instance = GetStatementResultRequest.from_json(json)
# print the JSON string representation of the object
print(GetStatementResultRequest.to_json())

# convert the object into a dict
get_statement_result_request_dict = get_statement_result_request_instance.to_dict()
# create an instance of GetStatementResultRequest from a dict
get_statement_result_request_from_dict = GetStatementResultRequest.from_dict(get_statement_result_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


