# CancelStatementResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.cancel_statement_response import CancelStatementResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CancelStatementResponse from a JSON string
cancel_statement_response_instance = CancelStatementResponse.from_json(json)
# print the JSON string representation of the object
print(CancelStatementResponse.to_json())

# convert the object into a dict
cancel_statement_response_dict = cancel_statement_response_instance.to_dict()
# create an instance of CancelStatementResponse from a dict
cancel_statement_response_from_dict = CancelStatementResponse.from_dict(cancel_statement_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


