# MovSettings

These settings relate to your QuickTime MOV output container.

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
from openapi_client.models.mov_settings import MovSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MovSettings from a JSON string
mov_settings_instance = MovSettings.from_json(json)
# print the JSON string representation of the object
print(MovSettings.to_json())

# convert the object into a dict
mov_settings_dict = mov_settings_instance.to_dict()
# create an instance of MovSettings from a dict
mov_settings_from_dict = MovSettings.from_dict(mov_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


