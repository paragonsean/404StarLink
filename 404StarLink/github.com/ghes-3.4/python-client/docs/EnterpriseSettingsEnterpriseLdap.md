# EnterpriseSettingsEnterpriseLdap


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin_group** | **str** |  | [optional] 
**base** | **List[object]** |  | [optional] 
**bind_dn** | **str** |  | [optional] 
**host** | **str** |  | [optional] 
**method** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**port** | **int** |  | [optional] 
**posix_support** | **bool** |  | [optional] 
**profile** | [**EnterpriseSettingsEnterpriseLdapProfile**](EnterpriseSettingsEnterpriseLdapProfile.md) |  | [optional] 
**reconciliation** | [**EnterpriseSettingsEnterpriseLdapReconciliation**](EnterpriseSettingsEnterpriseLdapReconciliation.md) |  | [optional] 
**recursive_group_search** | **bool** |  | [optional] 
**search_strategy** | **str** |  | [optional] 
**sync_enabled** | **bool** |  | [optional] 
**team_sync_interval** | **int** |  | [optional] 
**uid** | **str** |  | [optional] 
**user_groups** | **List[object]** |  | [optional] 
**user_sync_emails** | **bool** |  | [optional] 
**user_sync_interval** | **int** |  | [optional] 
**user_sync_keys** | **bool** |  | [optional] 
**virtual_attribute_enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_ldap import EnterpriseSettingsEnterpriseLdap

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseLdap from a JSON string
enterprise_settings_enterprise_ldap_instance = EnterpriseSettingsEnterpriseLdap.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseLdap.to_json())

# convert the object into a dict
enterprise_settings_enterprise_ldap_dict = enterprise_settings_enterprise_ldap_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseLdap from a dict
enterprise_settings_enterprise_ldap_from_dict = EnterpriseSettingsEnterpriseLdap.from_dict(enterprise_settings_enterprise_ldap_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


