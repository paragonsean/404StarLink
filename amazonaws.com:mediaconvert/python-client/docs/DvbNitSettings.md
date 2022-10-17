# DvbNitSettings

Use these settings to insert a DVB Network Information Table (NIT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network_id** | **int** |  | [optional] 
**network_name** | **str** |  | [optional] 
**nit_interval** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dvb_nit_settings import DvbNitSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DvbNitSettings from a JSON string
dvb_nit_settings_instance = DvbNitSettings.from_json(json)
# print the JSON string representation of the object
print(DvbNitSettings.to_json())

# convert the object into a dict
dvb_nit_settings_dict = dvb_nit_settings_instance.to_dict()
# create an instance of DvbNitSettings from a dict
dvb_nit_settings_from_dict = DvbNitSettings.from_dict(dvb_nit_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


