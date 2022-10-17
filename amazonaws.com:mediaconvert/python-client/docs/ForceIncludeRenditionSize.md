# ForceIncludeRenditionSize

Use Force include renditions to specify one or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other resolutions that you do not specify here, depending on the Max renditions setting.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.force_include_rendition_size import ForceIncludeRenditionSize

# TODO update the JSON string below
json = "{}"
# create an instance of ForceIncludeRenditionSize from a JSON string
force_include_rendition_size_instance = ForceIncludeRenditionSize.from_json(json)
# print the JSON string representation of the object
print(ForceIncludeRenditionSize.to_json())

# convert the object into a dict
force_include_rendition_size_dict = force_include_rendition_size_instance.to_dict()
# create an instance of ForceIncludeRenditionSize from a dict
force_include_rendition_size_from_dict = ForceIncludeRenditionSize.from_dict(force_include_rendition_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


