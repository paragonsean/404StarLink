# EnterpriseSettingsEnterprise


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin_password** | **str** |  | [optional] 
**assets** | **str** |  | [optional] 
**auth_mode** | **str** |  | [optional] 
**avatar** | [**EnterpriseSettingsEnterpriseAvatar**](EnterpriseSettingsEnterpriseAvatar.md) |  | [optional] 
**cas** | [**EnterpriseSettingsEnterpriseCas**](EnterpriseSettingsEnterpriseCas.md) |  | [optional] 
**collectd** | [**EnterpriseSettingsEnterpriseCollectd**](EnterpriseSettingsEnterpriseCollectd.md) |  | [optional] 
**configuration_id** | **int** |  | [optional] 
**configuration_run_count** | **int** |  | [optional] 
**customer** | [**EnterpriseSettingsEnterpriseCustomer**](EnterpriseSettingsEnterpriseCustomer.md) |  | [optional] 
**expire_sessions** | **bool** |  | [optional] 
**github_hostname** | **str** |  | [optional] 
**github_oauth** | [**EnterpriseSettingsEnterpriseGithubOauth**](EnterpriseSettingsEnterpriseGithubOauth.md) |  | [optional] 
**github_ssl** | [**EnterpriseSettingsEnterpriseGithubSsl**](EnterpriseSettingsEnterpriseGithubSsl.md) |  | [optional] 
**http_proxy** | **str** |  | [optional] 
**identicons_host** | **str** |  | [optional] 
**ldap** | [**EnterpriseSettingsEnterpriseLdap**](EnterpriseSettingsEnterpriseLdap.md) |  | [optional] 
**license** | [**EnterpriseSettingsEnterpriseLicense**](EnterpriseSettingsEnterpriseLicense.md) |  | [optional] 
**load_balancer** | **str** |  | [optional] 
**mapping** | [**EnterpriseSettingsEnterpriseMapping**](EnterpriseSettingsEnterpriseMapping.md) |  | [optional] 
**ntp** | [**EnterpriseSettingsEnterpriseNtp**](EnterpriseSettingsEnterpriseNtp.md) |  | [optional] 
**pages** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**private_mode** | **bool** |  | [optional] 
**public_pages** | **bool** |  | [optional] 
**saml** | [**EnterpriseSettingsEnterpriseSaml**](EnterpriseSettingsEnterpriseSaml.md) |  | [optional] 
**signup_enabled** | **bool** |  | [optional] 
**smtp** | [**EnterpriseSettingsEnterpriseSmtp**](EnterpriseSettingsEnterpriseSmtp.md) |  | [optional] 
**snmp** | [**EnterpriseSettingsEnterpriseSnmp**](EnterpriseSettingsEnterpriseSnmp.md) |  | [optional] 
**subdomain_isolation** | **bool** |  | [optional] 
**syslog** | [**EnterpriseSettingsEnterpriseSyslog**](EnterpriseSettingsEnterpriseSyslog.md) |  | [optional] 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise import EnterpriseSettingsEnterprise

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterprise from a JSON string
enterprise_settings_enterprise_instance = EnterpriseSettingsEnterprise.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterprise.to_json())

# convert the object into a dict
enterprise_settings_enterprise_dict = enterprise_settings_enterprise_instance.to_dict()
# create an instance of EnterpriseSettingsEnterprise from a dict
enterprise_settings_enterprise_from_dict = EnterpriseSettingsEnterprise.from_dict(enterprise_settings_enterprise_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


