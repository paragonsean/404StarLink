# EnterpriseSettingsEnterpriseSyslog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**protocol_name** | **str** |  | [optional] 
**server** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_syslog import EnterpriseSettingsEnterpriseSyslog

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseSyslog from a JSON string
enterprise_settings_enterprise_syslog_instance = EnterpriseSettingsEnterpriseSyslog.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseSyslog.to_json())

# convert the object into a dict
enterprise_settings_enterprise_syslog_dict = enterprise_settings_enterprise_syslog_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseSyslog from a dict
enterprise_settings_enterprise_syslog_from_dict = EnterpriseSettingsEnterpriseSyslog.from_dict(enterprise_settings_enterprise_syslog_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


