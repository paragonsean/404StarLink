# DvbSdtSettings

Use these settings to insert a DVB Service Description Table (SDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**output_sdt** | [**OutputSdt**](OutputSdt.md) |  | [optional] 
**sdt_interval** | **int** |  | [optional] 
**service_name** | **str** |  | [optional] 
**service_provider_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.dvb_sdt_settings import DvbSdtSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DvbSdtSettings from a JSON string
dvb_sdt_settings_instance = DvbSdtSettings.from_json(json)
# print the JSON string representation of the object
print(DvbSdtSettings.to_json())

# convert the object into a dict
dvb_sdt_settings_dict = dvb_sdt_settings_instance.to_dict()
# create an instance of DvbSdtSettings from a dict
dvb_sdt_settings_from_dict = DvbSdtSettings.from_dict(dvb_sdt_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


