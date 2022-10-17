# ContainerSettingsMovSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clap_atom** | [**MovClapAtom**](MovClapAtom.md) |  | [optional] 
**cslg_atom** | [**MovCslgAtom**](MovCslgAtom.md) |  | [optional] 
**mpeg2_four_cc_control** | [**MovMpeg2FourCCControl**](MovMpeg2FourCCControl.md) |  | [optional] 
**padding_control** | [**MovPaddingControl**](MovPaddingControl.md) |  | [optional] 
**reference** | [**MovReference**](MovReference.md) |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_mov_settings import ContainerSettingsMovSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsMovSettings from a JSON string
container_settings_mov_settings_instance = ContainerSettingsMovSettings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsMovSettings.to_json())

# convert the object into a dict
container_settings_mov_settings_dict = container_settings_mov_settings_instance.to_dict()
# create an instance of ContainerSettingsMovSettings from a dict
container_settings_mov_settings_from_dict = ContainerSettingsMovSettings.from_dict(container_settings_mov_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


