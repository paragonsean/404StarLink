# EnterpriseAdminListSelfHostedRunnersForEnterprise200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runners** | [**List[Runner]**](Runner.md) |  | [optional] 
**total_count** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_list_self_hosted_runners_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnersForEnterprise200Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminListSelfHostedRunnersForEnterprise200Response from a JSON string
enterprise_admin_list_self_hosted_runners_for_enterprise200_response_instance = EnterpriseAdminListSelfHostedRunnersForEnterprise200Response.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminListSelfHostedRunnersForEnterprise200Response.to_json())

# convert the object into a dict
enterprise_admin_list_self_hosted_runners_for_enterprise200_response_dict = enterprise_admin_list_self_hosted_runners_for_enterprise200_response_instance.to_dict()
# create an instance of EnterpriseAdminListSelfHostedRunnersForEnterprise200Response from a dict
enterprise_admin_list_self_hosted_runners_for_enterprise200_response_from_dict = EnterpriseAdminListSelfHostedRunnersForEnterprise200Response.from_dict(enterprise_admin_list_self_hosted_runners_for_enterprise200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


