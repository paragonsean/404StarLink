# EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allows_public_repositories** | **bool** | Whether the runner group can be used by &#x60;public&#x60; repositories. | [optional] [default to False]
**name** | **str** | Name of the runner group. | 
**runners** | **List[int]** | List of runner IDs to add to the runner group. | [optional] 
**selected_organization_ids** | **List[int]** | List of organization IDs that can access the runner group. | [optional] 
**visibility** | **str** | Visibility of a runner group. You can select all organizations or select individual organization. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_create_self_hosted_runner_group_for_enterprise_request import EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest from a JSON string
enterprise_admin_create_self_hosted_runner_group_for_enterprise_request_instance = EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_create_self_hosted_runner_group_for_enterprise_request_dict = enterprise_admin_create_self_hosted_runner_group_for_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest from a dict
enterprise_admin_create_self_hosted_runner_group_for_enterprise_request_from_dict = EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest.from_dict(enterprise_admin_create_self_hosted_runner_group_for_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


