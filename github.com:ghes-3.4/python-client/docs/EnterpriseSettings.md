# EnterpriseSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enterprise** | [**EnterpriseSettingsEnterprise**](EnterpriseSettingsEnterprise.md) |  | [optional] 
**run_list** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings import EnterpriseSettings

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettings from a JSON string
enterprise_settings_instance = EnterpriseSettings.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettings.to_json())

# convert the object into a dict
enterprise_settings_dict = enterprise_settings_instance.to_dict()
# create an instance of EnterpriseSettings from a dict
enterprise_settings_from_dict = EnterpriseSettings.from_dict(enterprise_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


