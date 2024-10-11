# EnterpriseSettingsEnterpriseNtp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_server** | **str** |  | [optional] 
**secondary_server** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_ntp import EnterpriseSettingsEnterpriseNtp

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseNtp from a JSON string
enterprise_settings_enterprise_ntp_instance = EnterpriseSettingsEnterpriseNtp.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseNtp.to_json())

# convert the object into a dict
enterprise_settings_enterprise_ntp_dict = enterprise_settings_enterprise_ntp_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseNtp from a dict
enterprise_settings_enterprise_ntp_from_dict = EnterpriseSettingsEnterpriseNtp.from_dict(enterprise_settings_enterprise_ntp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


