# EnterpriseAdminCreatePreReceiveHookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_downstream_configuration** | **bool** | Whether enforcement can be overridden at the org or repo level. default: &#x60;false&#x60; | [optional] 
**enforcement** | **str** | The state of enforcement for this hook. default: &#x60;disabled&#x60; | [optional] 
**environment** | **Dict[str, object]** | The pre-receive environment where the script is executed. | 
**name** | **str** | The name of the hook. | 
**script** | **str** | The script that the hook runs. | 
**script_repository** | **Dict[str, object]** | The GitHub repository where the script is kept. | 

## Example

```python
from openapi_client.models.enterprise_admin_create_pre_receive_hook_request import EnterpriseAdminCreatePreReceiveHookRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreatePreReceiveHookRequest from a JSON string
enterprise_admin_create_pre_receive_hook_request_instance = EnterpriseAdminCreatePreReceiveHookRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreatePreReceiveHookRequest.to_json())

# convert the object into a dict
enterprise_admin_create_pre_receive_hook_request_dict = enterprise_admin_create_pre_receive_hook_request_instance.to_dict()
# create an instance of EnterpriseAdminCreatePreReceiveHookRequest from a dict
enterprise_admin_create_pre_receive_hook_request_from_dict = EnterpriseAdminCreatePreReceiveHookRequest.from_dict(enterprise_admin_create_pre_receive_hook_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


