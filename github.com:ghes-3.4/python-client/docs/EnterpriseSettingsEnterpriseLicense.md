# EnterpriseSettingsEnterpriseLicense


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_support** | **bool** |  | [optional] 
**evaluation** | **bool** |  | [optional] 
**expire_at** | **str** |  | [optional] 
**perpetual** | **bool** |  | [optional] 
**seats** | **int** |  | [optional] 
**ssh_allowed** | **bool** |  | [optional] 
**support_key** | **str** |  | [optional] 
**unlimited_seating** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_license import EnterpriseSettingsEnterpriseLicense

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseLicense from a JSON string
enterprise_settings_enterprise_license_instance = EnterpriseSettingsEnterpriseLicense.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseLicense.to_json())

# convert the object into a dict
enterprise_settings_enterprise_license_dict = enterprise_settings_enterprise_license_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseLicense from a dict
enterprise_settings_enterprise_license_from_dict = EnterpriseSettingsEnterpriseLicense.from_dict(enterprise_settings_enterprise_license_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


