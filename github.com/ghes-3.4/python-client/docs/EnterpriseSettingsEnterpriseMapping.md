# EnterpriseSettingsEnterpriseMapping


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basemap** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**tileserver** | **str** |  | [optional] 
**token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_mapping import EnterpriseSettingsEnterpriseMapping

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseMapping from a JSON string
enterprise_settings_enterprise_mapping_instance = EnterpriseSettingsEnterpriseMapping.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseMapping.to_json())

# convert the object into a dict
enterprise_settings_enterprise_mapping_dict = enterprise_settings_enterprise_mapping_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseMapping from a dict
enterprise_settings_enterprise_mapping_from_dict = EnterpriseSettingsEnterpriseMapping.from_dict(enterprise_settings_enterprise_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


