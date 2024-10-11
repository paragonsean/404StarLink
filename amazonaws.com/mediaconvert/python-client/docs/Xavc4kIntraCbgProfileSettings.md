# Xavc4kIntraCbgProfileSettings

Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_CBG.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xavc_class** | [**Xavc4kIntraCbgProfileClass**](Xavc4kIntraCbgProfileClass.md) |  | [optional] 

## Example

```python
from openapi_client.models.xavc4k_intra_cbg_profile_settings import Xavc4kIntraCbgProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Xavc4kIntraCbgProfileSettings from a JSON string
xavc4k_intra_cbg_profile_settings_instance = Xavc4kIntraCbgProfileSettings.from_json(json)
# print the JSON string representation of the object
print(Xavc4kIntraCbgProfileSettings.to_json())

# convert the object into a dict
xavc4k_intra_cbg_profile_settings_dict = xavc4k_intra_cbg_profile_settings_instance.to_dict()
# create an instance of Xavc4kIntraCbgProfileSettings from a dict
xavc4k_intra_cbg_profile_settings_from_dict = Xavc4kIntraCbgProfileSettings.from_dict(xavc4k_intra_cbg_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


