# Xavc4kIntraVbrProfileSettings

Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_VBR.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xavc_class** | [**Xavc4kIntraVbrProfileClass**](Xavc4kIntraVbrProfileClass.md) |  | [optional] 

## Example

```python
from openapi_client.models.xavc4k_intra_vbr_profile_settings import Xavc4kIntraVbrProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Xavc4kIntraVbrProfileSettings from a JSON string
xavc4k_intra_vbr_profile_settings_instance = Xavc4kIntraVbrProfileSettings.from_json(json)
# print the JSON string representation of the object
print(Xavc4kIntraVbrProfileSettings.to_json())

# convert the object into a dict
xavc4k_intra_vbr_profile_settings_dict = xavc4k_intra_vbr_profile_settings_instance.to_dict()
# create an instance of Xavc4kIntraVbrProfileSettings from a dict
xavc4k_intra_vbr_profile_settings_from_dict = Xavc4kIntraVbrProfileSettings.from_dict(xavc4k_intra_vbr_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


