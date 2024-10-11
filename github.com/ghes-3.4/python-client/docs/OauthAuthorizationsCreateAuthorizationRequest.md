# OauthAuthorizationsCreateAuthorizationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The OAuth app client key for which to create the token. | [optional] 
**client_secret** | **str** | The OAuth app client secret for which to create the token. | [optional] 
**fingerprint** | **str** | A unique string to distinguish an authorization from others created for the same client ID and user. | [optional] 
**note** | **str** | A note to remind you what the OAuth token is for. | [optional] 
**note_url** | **str** | A URL to remind you what app the OAuth token is for. | [optional] 
**scopes** | **List[str]** | A list of scopes that this authorization is in. | [optional] 

## Example

```python
from openapi_client.models.oauth_authorizations_create_authorization_request import OauthAuthorizationsCreateAuthorizationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAuthorizationsCreateAuthorizationRequest from a JSON string
oauth_authorizations_create_authorization_request_instance = OauthAuthorizationsCreateAuthorizationRequest.from_json(json)
# print the JSON string representation of the object
print(OauthAuthorizationsCreateAuthorizationRequest.to_json())

# convert the object into a dict
oauth_authorizations_create_authorization_request_dict = oauth_authorizations_create_authorization_request_instance.to_dict()
# create an instance of OauthAuthorizationsCreateAuthorizationRequest from a dict
oauth_authorizations_create_authorization_request_from_dict = OauthAuthorizationsCreateAuthorizationRequest.from_dict(oauth_authorizations_create_authorization_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


