# EnterpriseAdminCreateOrgRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin** | **str** | The login of the user who will manage this organization. | 
**login** | **str** | The organization&#39;s username. | 
**profile_name** | **str** | The organization&#39;s display name. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_create_org_request import EnterpriseAdminCreateOrgRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreateOrgRequest from a JSON string
enterprise_admin_create_org_request_instance = EnterpriseAdminCreateOrgRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreateOrgRequest.to_json())

# convert the object into a dict
enterprise_admin_create_org_request_dict = enterprise_admin_create_org_request_instance.to_dict()
# create an instance of EnterpriseAdminCreateOrgRequest from a dict
enterprise_admin_create_org_request_from_dict = EnterpriseAdminCreateOrgRequest.from_dict(enterprise_admin_create_org_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


