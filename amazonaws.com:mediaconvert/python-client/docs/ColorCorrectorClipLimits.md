# ColorCorrectorClipLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maximum_rgb_tolerance** | **int** |  | [optional] 
**maximum_yuv** | **int** |  | [optional] 
**minimum_rgb_tolerance** | **int** |  | [optional] 
**minimum_yuv** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.color_corrector_clip_limits import ColorCorrectorClipLimits

# TODO update the JSON string below
json = "{}"
# create an instance of ColorCorrectorClipLimits from a JSON string
color_corrector_clip_limits_instance = ColorCorrectorClipLimits.from_json(json)
# print the JSON string representation of the object
print(ColorCorrectorClipLimits.to_json())

# convert the object into a dict
color_corrector_clip_limits_dict = color_corrector_clip_limits_instance.to_dict()
# create an instance of ColorCorrectorClipLimits from a dict
color_corrector_clip_limits_from_dict = ColorCorrectorClipLimits.from_dict(color_corrector_clip_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


