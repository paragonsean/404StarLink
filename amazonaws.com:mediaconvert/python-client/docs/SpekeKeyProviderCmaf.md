# SpekeKeyProviderCmaf

If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_arn** | **str** |  | [optional] 
**dash_signaled_system_ids** | **List** |  | [optional] 
**hls_signaled_system_ids** | **List** |  | [optional] 
**resource_id** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.speke_key_provider_cmaf import SpekeKeyProviderCmaf

# TODO update the JSON string below
json = "{}"
# create an instance of SpekeKeyProviderCmaf from a JSON string
speke_key_provider_cmaf_instance = SpekeKeyProviderCmaf.from_json(json)
# print the JSON string representation of the object
print(SpekeKeyProviderCmaf.to_json())

# convert the object into a dict
speke_key_provider_cmaf_dict = speke_key_provider_cmaf_instance.to_dict()
# create an instance of SpekeKeyProviderCmaf from a dict
speke_key_provider_cmaf_from_dict = SpekeKeyProviderCmaf.from_dict(speke_key_provider_cmaf_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


