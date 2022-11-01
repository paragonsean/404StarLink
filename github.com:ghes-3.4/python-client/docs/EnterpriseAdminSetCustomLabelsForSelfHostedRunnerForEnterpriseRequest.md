# EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | **List[str]** | The names of the custom labels to set for the runner. You can pass an empty array to remove all custom labels. | 

## Example

```python
from openapi_client.models.enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request import EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest from a JSON string
enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request_instance = EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request_dict = enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest from a dict
enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request_from_dict = EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest.from_dict(enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


