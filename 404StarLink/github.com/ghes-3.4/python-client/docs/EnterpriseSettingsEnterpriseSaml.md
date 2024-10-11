# EnterpriseSettingsEnterpriseSaml


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate** | **str** |  | [optional] 
**certificate_path** | **str** |  | [optional] 
**disable_admin_demote** | **bool** |  | [optional] 
**idp_initiated_sso** | **bool** |  | [optional] 
**issuer** | **str** |  | [optional] 
**sso_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_saml import EnterpriseSettingsEnterpriseSaml

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseSaml from a JSON string
enterprise_settings_enterprise_saml_instance = EnterpriseSettingsEnterpriseSaml.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseSaml.to_json())

# convert the object into a dict
enterprise_settings_enterprise_saml_dict = enterprise_settings_enterprise_saml_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseSaml from a dict
enterprise_settings_enterprise_saml_from_dict = EnterpriseSettingsEnterpriseSaml.from_dict(enterprise_settings_enterprise_saml_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


