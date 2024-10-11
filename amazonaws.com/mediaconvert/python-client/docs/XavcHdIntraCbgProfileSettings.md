# XavcHdIntraCbgProfileSettings

Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD_INTRA_CBG.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xavc_class** | [**XavcHdIntraCbgProfileClass**](XavcHdIntraCbgProfileClass.md) |  | [optional] 

## Example

```python
from openapi_client.models.xavc_hd_intra_cbg_profile_settings import XavcHdIntraCbgProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of XavcHdIntraCbgProfileSettings from a JSON string
xavc_hd_intra_cbg_profile_settings_instance = XavcHdIntraCbgProfileSettings.from_json(json)
# print the JSON string representation of the object
print(XavcHdIntraCbgProfileSettings.to_json())

# convert the object into a dict
xavc_hd_intra_cbg_profile_settings_dict = xavc_hd_intra_cbg_profile_settings_instance.to_dict()
# create an instance of XavcHdIntraCbgProfileSettings from a dict
xavc_hd_intra_cbg_profile_settings_from_dict = XavcHdIntraCbgProfileSettings.from_dict(xavc_hd_intra_cbg_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


