# MinBottomRenditionSize

Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top rendition size.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.min_bottom_rendition_size import MinBottomRenditionSize

# TODO update the JSON string below
json = "{}"
# create an instance of MinBottomRenditionSize from a JSON string
min_bottom_rendition_size_instance = MinBottomRenditionSize.from_json(json)
# print the JSON string representation of the object
print(MinBottomRenditionSize.to_json())

# convert the object into a dict
min_bottom_rendition_size_dict = min_bottom_rendition_size_instance.to_dict()
# create an instance of MinBottomRenditionSize from a dict
min_bottom_rendition_size_from_dict = MinBottomRenditionSize.from_dict(min_bottom_rendition_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


