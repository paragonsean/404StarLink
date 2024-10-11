# EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_actions** | [**AllowedActions**](AllowedActions.md) |  | [optional] 
**enabled_organizations** | [**EnabledOrganizations**](EnabledOrganizations.md) |  | 

## Example

```python
from openapi_client.models.enterprise_admin_set_github_actions_permissions_enterprise_request import EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest from a JSON string
enterprise_admin_set_github_actions_permissions_enterprise_request_instance = EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_set_github_actions_permissions_enterprise_request_dict = enterprise_admin_set_github_actions_permissions_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest from a dict
enterprise_admin_set_github_actions_permissions_enterprise_request_from_dict = EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest.from_dict(enterprise_admin_set_github_actions_permissions_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


