# EnterpriseAdminSuspendUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason the user is being suspended. This message will be logged in the [audit log](https://docs.github.com/enterprise-server@3.4/admin/monitoring-activity-in-your-enterprise/reviewing-audit-logs-for-your-enterprise/about-the-audit-log-for-your-enterprise). If you don&#39;t provide a &#x60;reason&#x60;, it will default to \&quot;Suspended via API by _SITE\\_ADMINISTRATOR_\&quot;, where _SITE\\_ADMINISTRATOR_ is the person who performed the action. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_suspend_user_request import EnterpriseAdminSuspendUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminSuspendUserRequest from a JSON string
enterprise_admin_suspend_user_request_instance = EnterpriseAdminSuspendUserRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminSuspendUserRequest.to_json())

# convert the object into a dict
enterprise_admin_suspend_user_request_dict = enterprise_admin_suspend_user_request_instance.to_dict()
# create an instance of EnterpriseAdminSuspendUserRequest from a dict
enterprise_admin_suspend_user_request_from_dict = EnterpriseAdminSuspendUserRequest.from_dict(enterprise_admin_suspend_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


