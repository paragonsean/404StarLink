# EnterpriseAdminUpdateUsernameForUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**login** | **str** | The user&#39;s new username. | 

## Example

```python
from openapi_client.models.enterprise_admin_update_username_for_user_request import EnterpriseAdminUpdateUsernameForUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdateUsernameForUserRequest from a JSON string
enterprise_admin_update_username_for_user_request_instance = EnterpriseAdminUpdateUsernameForUserRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdateUsernameForUserRequest.to_json())

# convert the object into a dict
enterprise_admin_update_username_for_user_request_dict = enterprise_admin_update_username_for_user_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdateUsernameForUserRequest from a dict
enterprise_admin_update_username_for_user_request_from_dict = EnterpriseAdminUpdateUsernameForUserRequest.from_dict(enterprise_admin_update_username_for_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


