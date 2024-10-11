# EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selected_organization_ids** | **List[int]** | List of organization IDs that can access the runner group. | 

## Example

```python
from openapi_client.models.enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request import EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest from a JSON string
enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request_instance = EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request_dict = enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest from a dict
enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request_from_dict = EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest.from_dict(enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


