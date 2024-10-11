# EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runner_groups** | [**List[RunnerGroupsEnterprise]**](RunnerGroupsEnterprise.md) |  | 
**total_count** | **float** |  | 

## Example

```python
from openapi_client.models.enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response from a JSON string
enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response_instance = EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response.to_json())

# convert the object into a dict
enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response_dict = enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response_instance.to_dict()
# create an instance of EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response from a dict
enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response_from_dict = EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response.from_dict(enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


