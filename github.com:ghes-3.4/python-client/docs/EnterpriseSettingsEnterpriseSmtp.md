# EnterpriseSettingsEnterpriseSmtp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**authentication** | **str** |  | [optional] 
**discard_to_noreply_address** | **bool** |  | [optional] 
**domain** | **str** |  | [optional] 
**enable_starttls_auto** | **bool** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**noreply_address** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**port** | **str** |  | [optional] 
**support_address** | **str** |  | [optional] 
**support_address_type** | **str** |  | [optional] 
**user_name** | **str** |  | [optional] 
**username** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_smtp import EnterpriseSettingsEnterpriseSmtp

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseSmtp from a JSON string
enterprise_settings_enterprise_smtp_instance = EnterpriseSettingsEnterpriseSmtp.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseSmtp.to_json())

# convert the object into a dict
enterprise_settings_enterprise_smtp_dict = enterprise_settings_enterprise_smtp_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseSmtp from a dict
enterprise_settings_enterprise_smtp_from_dict = EnterpriseSettingsEnterpriseSmtp.from_dict(enterprise_settings_enterprise_smtp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


