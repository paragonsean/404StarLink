# EnterpriseAdminUpdateLdapMappingForTeamRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ldap_dn** | **str** | The [distinguished name](https://www.ldap.com/ldap-dns-and-rdns) (DN) of the LDAP entry to map to a team. | 

## Example

```python
from openapi_client.models.enterprise_admin_update_ldap_mapping_for_team_request import EnterpriseAdminUpdateLdapMappingForTeamRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdateLdapMappingForTeamRequest from a JSON string
enterprise_admin_update_ldap_mapping_for_team_request_instance = EnterpriseAdminUpdateLdapMappingForTeamRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdateLdapMappingForTeamRequest.to_json())

# convert the object into a dict
enterprise_admin_update_ldap_mapping_for_team_request_dict = enterprise_admin_update_ldap_mapping_for_team_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdateLdapMappingForTeamRequest from a dict
enterprise_admin_update_ldap_mapping_for_team_request_from_dict = EnterpriseAdminUpdateLdapMappingForTeamRequest.from_dict(enterprise_admin_update_ldap_mapping_for_team_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


