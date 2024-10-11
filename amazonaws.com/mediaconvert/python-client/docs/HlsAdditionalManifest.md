# HlsAdditionalManifest

Specify the details for each additional HLS manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_name_modifier** | **str** |  | [optional] 
**selected_outputs** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.hls_additional_manifest import HlsAdditionalManifest

# TODO update the JSON string below
json = "{}"
# create an instance of HlsAdditionalManifest from a JSON string
hls_additional_manifest_instance = HlsAdditionalManifest.from_json(json)
# print the JSON string representation of the object
print(HlsAdditionalManifest.to_json())

# convert the object into a dict
hls_additional_manifest_dict = hls_additional_manifest_instance.to_dict()
# create an instance of HlsAdditionalManifest from a dict
hls_additional_manifest_from_dict = HlsAdditionalManifest.from_dict(hls_additional_manifest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


