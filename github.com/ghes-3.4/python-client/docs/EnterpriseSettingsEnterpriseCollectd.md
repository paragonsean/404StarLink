# EnterpriseSettingsEnterpriseCollectd


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**encryption** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**port** | **int** |  | [optional] 
**server** | **str** |  | [optional] 
**username** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_collectd import EnterpriseSettingsEnterpriseCollectd

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseCollectd from a JSON string
enterprise_settings_enterprise_collectd_instance = EnterpriseSettingsEnterpriseCollectd.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseCollectd.to_json())

# convert the object into a dict
enterprise_settings_enterprise_collectd_dict = enterprise_settings_enterprise_collectd_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseCollectd from a dict
enterprise_settings_enterprise_collectd_from_dict = EnterpriseSettingsEnterpriseCollectd.from_dict(enterprise_settings_enterprise_collectd_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


