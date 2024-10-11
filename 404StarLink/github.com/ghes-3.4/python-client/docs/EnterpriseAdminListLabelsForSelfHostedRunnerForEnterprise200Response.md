# EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**List[RunnerLabel]**](RunnerLabel.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response from a JSON string
enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response_instance = EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.to_json())

# convert the object into a dict
enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response_dict = enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response_instance.to_dict()
# create an instance of EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response from a dict
enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response_from_dict = EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.from_dict(enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


