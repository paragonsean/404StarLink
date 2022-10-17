# M2tsSettingsDvbNitSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network_id** | **int** |  | [optional] 
**network_name** | **str** |  | [optional] 
**nit_interval** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.m2ts_settings_dvb_nit_settings import M2tsSettingsDvbNitSettings

# TODO update the JSON string below
json = "{}"
# create an instance of M2tsSettingsDvbNitSettings from a JSON string
m2ts_settings_dvb_nit_settings_instance = M2tsSettingsDvbNitSettings.from_json(json)
# print the JSON string representation of the object
print(M2tsSettingsDvbNitSettings.to_json())

# convert the object into a dict
m2ts_settings_dvb_nit_settings_dict = m2ts_settings_dvb_nit_settings_instance.to_dict()
# create an instance of M2tsSettingsDvbNitSettings from a dict
m2ts_settings_dvb_nit_settings_from_dict = M2tsSettingsDvbNitSettings.from_dict(m2ts_settings_dvb_nit_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


