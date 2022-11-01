# EnterpriseAdminUpdateOrgNameRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**login** | **str** | The organization&#39;s new name. | 

## Example

```python
from openapi_client.models.enterprise_admin_update_org_name_request import EnterpriseAdminUpdateOrgNameRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdateOrgNameRequest from a JSON string
enterprise_admin_update_org_name_request_instance = EnterpriseAdminUpdateOrgNameRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdateOrgNameRequest.to_json())

# convert the object into a dict
enterprise_admin_update_org_name_request_dict = enterprise_admin_update_org_name_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdateOrgNameRequest from a dict
enterprise_admin_update_org_name_request_from_dict = EnterpriseAdminUpdateOrgNameRequest.from_dict(enterprise_admin_update_org_name_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


