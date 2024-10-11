# OauthAuthorizationsUpdateAuthorizationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add_scopes** | **List[str]** | A list of scopes to add to this authorization. | [optional] 
**fingerprint** | **str** | A unique string to distinguish an authorization from others created for the same client ID and user. | [optional] 
**note** | **str** | A note to remind you what the OAuth token is for. | [optional] 
**note_url** | **str** | A URL to remind you what app the OAuth token is for. | [optional] 
**remove_scopes** | **List[str]** | A list of scopes to remove from this authorization. | [optional] 
**scopes** | **List[str]** | A list of scopes that this authorization is in. | [optional] 

## Example

```python
from openapi_client.models.oauth_authorizations_update_authorization_request import OauthAuthorizationsUpdateAuthorizationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAuthorizationsUpdateAuthorizationRequest from a JSON string
oauth_authorizations_update_authorization_request_instance = OauthAuthorizationsUpdateAuthorizationRequest.from_json(json)
# print the JSON string representation of the object
print(OauthAuthorizationsUpdateAuthorizationRequest.to_json())

# convert the object into a dict
oauth_authorizations_update_authorization_request_dict = oauth_authorizations_update_authorization_request_instance.to_dict()
# create an instance of OauthAuthorizationsUpdateAuthorizationRequest from a dict
oauth_authorizations_update_authorization_request_from_dict = OauthAuthorizationsUpdateAuthorizationRequest.from_dict(oauth_authorizations_update_authorization_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


