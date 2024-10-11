# OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_secret** | **str** | The OAuth app client secret for which to create the token. | 
**note** | **str** | A note to remind you what the OAuth token is for. | [optional] 
**note_url** | **str** | A URL to remind you what app the OAuth token is for. | [optional] 
**scopes** | **List[str]** | A list of scopes that this authorization is in. | [optional] 

## Example

```python
from openapi_client.models.oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request import OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest from a JSON string
oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request_instance = OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest.from_json(json)
# print the JSON string representation of the object
print(OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest.to_json())

# convert the object into a dict
oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request_dict = oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request_instance.to_dict()
# create an instance of OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest from a dict
oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request_from_dict = OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequest.from_dict(oauth_authorizations_get_or_create_authorization_for_app_and_fingerprint_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


