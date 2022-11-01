# EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runners** | **List[int]** | List of runner IDs to add to the runner group. | 

## Example

```python
from openapi_client.models.enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request import EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest from a JSON string
enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request_instance = EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest.to_json())

# convert the object into a dict
enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request_dict = enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request_instance.to_dict()
# create an instance of EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest from a dict
enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request_from_dict = EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest.from_dict(enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


