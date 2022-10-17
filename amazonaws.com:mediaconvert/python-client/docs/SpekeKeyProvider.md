# SpekeKeyProvider

If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_arn** | **str** |  | [optional] 
**resource_id** | **str** |  | [optional] 
**system_ids** | **List** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.speke_key_provider import SpekeKeyProvider

# TODO update the JSON string below
json = "{}"
# create an instance of SpekeKeyProvider from a JSON string
speke_key_provider_instance = SpekeKeyProvider.from_json(json)
# print the JSON string representation of the object
print(SpekeKeyProvider.to_json())

# convert the object into a dict
speke_key_provider_dict = speke_key_provider_instance.to_dict()
# create an instance of SpekeKeyProvider from a dict
speke_key_provider_from_dict = SpekeKeyProvider.from_dict(speke_key_provider_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


