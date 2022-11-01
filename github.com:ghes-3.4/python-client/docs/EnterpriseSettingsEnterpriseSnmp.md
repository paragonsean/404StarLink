# EnterpriseSettingsEnterpriseSnmp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**community** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_snmp import EnterpriseSettingsEnterpriseSnmp

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseSnmp from a JSON string
enterprise_settings_enterprise_snmp_instance = EnterpriseSettingsEnterpriseSnmp.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseSnmp.to_json())

# convert the object into a dict
enterprise_settings_enterprise_snmp_dict = enterprise_settings_enterprise_snmp_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseSnmp from a dict
enterprise_settings_enterprise_snmp_from_dict = EnterpriseSettingsEnterpriseSnmp.from_dict(enterprise_settings_enterprise_snmp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


