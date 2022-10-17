# MinTopRenditionSize

Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or equal to, Max resolution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.min_top_rendition_size import MinTopRenditionSize

# TODO update the JSON string below
json = "{}"
# create an instance of MinTopRenditionSize from a JSON string
min_top_rendition_size_instance = MinTopRenditionSize.from_json(json)
# print the JSON string representation of the object
print(MinTopRenditionSize.to_json())

# convert the object into a dict
min_top_rendition_size_dict = min_top_rendition_size_instance.to_dict()
# create an instance of MinTopRenditionSize from a dict
min_top_rendition_size_from_dict = MinTopRenditionSize.from_dict(min_top_rendition_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


