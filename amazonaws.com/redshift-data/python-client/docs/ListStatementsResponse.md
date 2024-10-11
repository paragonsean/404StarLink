# ListStatementsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**statements** | **List** |  | 

## Example

```python
from openapi_client.models.list_statements_response import ListStatementsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListStatementsResponse from a JSON string
list_statements_response_instance = ListStatementsResponse.from_json(json)
# print the JSON string representation of the object
print(ListStatementsResponse.to_json())

# convert the object into a dict
list_statements_response_dict = list_statements_response_instance.to_dict()
# create an instance of ListStatementsResponse from a dict
list_statements_response_from_dict = ListStatementsResponse.from_dict(list_statements_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


