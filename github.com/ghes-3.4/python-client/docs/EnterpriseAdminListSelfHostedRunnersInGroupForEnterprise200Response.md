# EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runners** | [**List[Runner]**](Runner.md) |  | 
**total_count** | **float** |  | 

## Example

```python
from openapi_client.models.enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response from a JSON string
enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response_instance = EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response.to_json())

# convert the object into a dict
enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response_dict = enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response_instance.to_dict()
# create an instance of EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response from a dict
enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response_from_dict = EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response.from_dict(enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


