# DvbSubSourceSettings

DVB Sub Source Settings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dvb_sub_source_settings import DvbSubSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DvbSubSourceSettings from a JSON string
dvb_sub_source_settings_instance = DvbSubSourceSettings.from_json(json)
# print the JSON string representation of the object
print(DvbSubSourceSettings.to_json())

# convert the object into a dict
dvb_sub_source_settings_dict = dvb_sub_source_settings_instance.to_dict()
# create an instance of DvbSubSourceSettings from a dict
dvb_sub_source_settings_from_dict = DvbSubSourceSettings.from_dict(dvb_sub_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


