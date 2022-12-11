# TokenError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**help** | **str** |  | [optional] 
**http_code** | **int** |  | [optional] 
**message** | **str** |  | [optional] 
**account_status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.token_error import TokenError

# TODO update the JSON string below
json = "{}"
# create an instance of TokenError from a JSON string
token_error_instance = TokenError.from_json(json)
# print the JSON string representation of the object
print(TokenError.to_json())

# convert the object into a dict
token_error_dict = token_error_instance.to_dict()
# create an instance of TokenError from a dict
token_error_from_dict = TokenError.from_dict(token_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


