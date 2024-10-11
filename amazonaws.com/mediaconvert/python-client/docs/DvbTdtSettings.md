# DvbTdtSettings

Use these settings to insert a DVB Time and Date Table (TDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tdt_interval** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dvb_tdt_settings import DvbTdtSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DvbTdtSettings from a JSON string
dvb_tdt_settings_instance = DvbTdtSettings.from_json(json)
# print the JSON string representation of the object
print(DvbTdtSettings.to_json())

# convert the object into a dict
dvb_tdt_settings_dict = dvb_tdt_settings_instance.to_dict()
# create an instance of DvbTdtSettings from a dict
dvb_tdt_settings_from_dict = DvbTdtSettings.from_dict(dvb_tdt_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


