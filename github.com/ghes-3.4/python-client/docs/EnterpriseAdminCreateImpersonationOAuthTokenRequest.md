# EnterpriseAdminCreateImpersonationOAuthTokenRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | **List[str]** | A list of [scopes](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). | 

## Example

```python
from openapi_client.models.enterprise_admin_create_impersonation_o_auth_token_request import EnterpriseAdminCreateImpersonationOAuthTokenRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreateImpersonationOAuthTokenRequest from a JSON string
enterprise_admin_create_impersonation_o_auth_token_request_instance = EnterpriseAdminCreateImpersonationOAuthTokenRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreateImpersonationOAuthTokenRequest.to_json())

# convert the object into a dict
enterprise_admin_create_impersonation_o_auth_token_request_dict = enterprise_admin_create_impersonation_o_auth_token_request_instance.to_dict()
# create an instance of EnterpriseAdminCreateImpersonationOAuthTokenRequest from a dict
enterprise_admin_create_impersonation_o_auth_token_request_from_dict = EnterpriseAdminCreateImpersonationOAuthTokenRequest.from_dict(enterprise_admin_create_impersonation_o_auth_token_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


