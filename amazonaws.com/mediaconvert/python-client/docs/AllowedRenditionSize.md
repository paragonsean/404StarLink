# AllowedRenditionSize

Use Allowed renditions to specify a list of possible resolutions in your ABR stack. * MediaConvert will create an ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force include renditions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**required** | [**RequiredFlag**](RequiredFlag.md) |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.allowed_rendition_size import AllowedRenditionSize

# TODO update the JSON string below
json = "{}"
# create an instance of AllowedRenditionSize from a JSON string
allowed_rendition_size_instance = AllowedRenditionSize.from_json(json)
# print the JSON string representation of the object
print(AllowedRenditionSize.to_json())

# convert the object into a dict
allowed_rendition_size_dict = allowed_rendition_size_instance.to_dict()
# create an instance of AllowedRenditionSize from a dict
allowed_rendition_size_from_dict = AllowedRenditionSize.from_dict(allowed_rendition_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


