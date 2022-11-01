# EnterpriseAdminUpdatePreReceiveHookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_downstream_configuration** | **bool** | Whether enforcement can be overridden at the org or repo level. | [optional] 
**enforcement** | **str** | The state of enforcement for this hook. | [optional] 
**environment** | **Dict[str, object]** | The pre-receive environment where the script is executed. | [optional] 
**name** | **str** | The name of the hook. | [optional] 
**script** | **str** | The script that the hook runs. | [optional] 
**script_repository** | **Dict[str, object]** | The GitHub repository where the script is kept. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_update_pre_receive_hook_request import EnterpriseAdminUpdatePreReceiveHookRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdatePreReceiveHookRequest from a JSON string
enterprise_admin_update_pre_receive_hook_request_instance = EnterpriseAdminUpdatePreReceiveHookRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdatePreReceiveHookRequest.to_json())

# convert the object into a dict
enterprise_admin_update_pre_receive_hook_request_dict = enterprise_admin_update_pre_receive_hook_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdatePreReceiveHookRequest from a dict
enterprise_admin_update_pre_receive_hook_request_from_dict = EnterpriseAdminUpdatePreReceiveHookRequest.from_dict(enterprise_admin_update_pre_receive_hook_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


