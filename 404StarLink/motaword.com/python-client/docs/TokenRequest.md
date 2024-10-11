# TokenRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grant_type** | **str** | OAuth2 grant type. Supports &#39;client_credentials&#39;, &#39;password&#39;, &#39;refresh_token&#39; or &#39;user_id&#39;. | 
**password** | **str** | MW Account password (to be used in password grant type) | [optional] 
**refresh_token** | **str** | Refresh token value for refresh token flow. | [optional] 
**scope** | **str** | Authorization scope. Use &#39;privileged&#39; for private endpoints. | 
**user_id** | **int** | Value for user_id grant type flow. | [optional] 
**username** | **str** | MW Account email (to be used in password grant type) | [optional] 

## Example

```python
from openapi_client.models.token_request import TokenRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TokenRequest from a JSON string
token_request_instance = TokenRequest.from_json(json)
# print the JSON string representation of the object
print(TokenRequest.to_json())

# convert the object into a dict
token_request_dict = token_request_instance.to_dict()
# create an instance of TokenRequest from a dict
token_request_from_dict = TokenRequest.from_dict(token_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


