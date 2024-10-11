# CmafAdditionalManifest

Specify the details for each pair of HLS and DASH additional manifests that you want the service to generate for this CMAF output group. Each pair of manifests can reference a different subset of outputs in the group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_name_modifier** | **str** |  | [optional] 
**selected_outputs** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_additional_manifest import CmafAdditionalManifest

# TODO update the JSON string below
json = "{}"
# create an instance of CmafAdditionalManifest from a JSON string
cmaf_additional_manifest_instance = CmafAdditionalManifest.from_json(json)
# print the JSON string representation of the object
print(CmafAdditionalManifest.to_json())

# convert the object into a dict
cmaf_additional_manifest_dict = cmaf_additional_manifest_instance.to_dict()
# create an instance of CmafAdditionalManifest from a dict
cmaf_additional_manifest_from_dict = CmafAdditionalManifest.from_dict(cmaf_additional_manifest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


