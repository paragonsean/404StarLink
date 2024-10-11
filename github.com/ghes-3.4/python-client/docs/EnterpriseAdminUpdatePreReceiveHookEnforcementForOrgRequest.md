# EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_downstream_configuration** | **bool** | Whether repositories can override enforcement. | [optional] 
**enforcement** | **str** | The state of enforcement for the hook on this repository. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_update_pre_receive_hook_enforcement_for_org_request import EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest from a JSON string
enterprise_admin_update_pre_receive_hook_enforcement_for_org_request_instance = EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest.to_json())

# convert the object into a dict
enterprise_admin_update_pre_receive_hook_enforcement_for_org_request_dict = enterprise_admin_update_pre_receive_hook_enforcement_for_org_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest from a dict
enterprise_admin_update_pre_receive_hook_enforcement_for_org_request_from_dict = EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest.from_dict(enterprise_admin_update_pre_receive_hook_enforcement_for_org_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


