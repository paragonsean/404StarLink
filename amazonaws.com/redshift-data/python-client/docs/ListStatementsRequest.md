# ListStatementsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 
**role_level** | **bool** |  | [optional] 
**statement_name** | **str** |  | [optional] 
**status** | [**StatusString**](StatusString.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_statements_request import ListStatementsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListStatementsRequest from a JSON string
list_statements_request_instance = ListStatementsRequest.from_json(json)
# print the JSON string representation of the object
print(ListStatementsRequest.to_json())

# convert the object into a dict
list_statements_request_dict = list_statements_request_instance.to_dict()
# create an instance of ListStatementsRequest from a dict
list_statements_request_from_dict = ListStatementsRequest.from_dict(list_statements_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


