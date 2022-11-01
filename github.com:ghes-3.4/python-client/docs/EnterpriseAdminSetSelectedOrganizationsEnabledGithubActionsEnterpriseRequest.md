# EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selected_organization_ids** | **List[int]** | List of organization IDs to enable for GitHub Actions. | 

## Example

```python
from openapi_client.models.enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request import EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest from a JSON string
enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request_instance = EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request_dict = enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest from a dict
enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request_from_dict = EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest.from_dict(enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


