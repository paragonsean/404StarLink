# MsSmoothAdditionalManifest

Specify the details for each additional Microsoft Smooth Streaming manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_name_modifier** | **str** |  | [optional] 
**selected_outputs** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.ms_smooth_additional_manifest import MsSmoothAdditionalManifest

# TODO update the JSON string below
json = "{}"
# create an instance of MsSmoothAdditionalManifest from a JSON string
ms_smooth_additional_manifest_instance = MsSmoothAdditionalManifest.from_json(json)
# print the JSON string representation of the object
print(MsSmoothAdditionalManifest.to_json())

# convert the object into a dict
ms_smooth_additional_manifest_dict = ms_smooth_additional_manifest_instance.to_dict()
# create an instance of MsSmoothAdditionalManifest from a dict
ms_smooth_additional_manifest_from_dict = MsSmoothAdditionalManifest.from_dict(ms_smooth_additional_manifest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


