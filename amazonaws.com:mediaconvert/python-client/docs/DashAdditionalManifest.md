# DashAdditionalManifest

Specify the details for each additional DASH manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_name_modifier** | **str** |  | [optional] 
**selected_outputs** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.dash_additional_manifest import DashAdditionalManifest

# TODO update the JSON string below
json = "{}"
# create an instance of DashAdditionalManifest from a JSON string
dash_additional_manifest_instance = DashAdditionalManifest.from_json(json)
# print the JSON string representation of the object
print(DashAdditionalManifest.to_json())

# convert the object into a dict
dash_additional_manifest_dict = dash_additional_manifest_instance.to_dict()
# create an instance of DashAdditionalManifest from a dict
dash_additional_manifest_from_dict = DashAdditionalManifest.from_dict(dash_additional_manifest_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


