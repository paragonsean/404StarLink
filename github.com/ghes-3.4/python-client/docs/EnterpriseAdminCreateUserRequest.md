# EnterpriseAdminCreateUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | **Required for built-in authentication.** The user&#39;s email address. This parameter can be omitted when using CAS, LDAP, or SAML. For more information, see \&quot;[About authentication for your enterprise](https://docs.github.com/enterprise-server@3.4/admin/identity-and-access-management/managing-iam-for-your-enterprise/about-authentication-for-your-enterprise).\&quot; | [optional] 
**login** | **str** | The user&#39;s username. | 

## Example

```python
from openapi_client.models.enterprise_admin_create_user_request import EnterpriseAdminCreateUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreateUserRequest from a JSON string
enterprise_admin_create_user_request_instance = EnterpriseAdminCreateUserRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreateUserRequest.to_json())

# convert the object into a dict
enterprise_admin_create_user_request_dict = enterprise_admin_create_user_request_instance.to_dict()
# create an instance of EnterpriseAdminCreateUserRequest from a dict
enterprise_admin_create_user_request_from_dict = EnterpriseAdminCreateUserRequest.from_dict(enterprise_admin_create_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


