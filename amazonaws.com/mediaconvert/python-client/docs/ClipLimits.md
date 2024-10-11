# ClipLimits

Specify YUV limits and RGB tolerances when you set Sample range conversion to Limited range clip.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maximum_rgb_tolerance** | **int** |  | [optional] 
**maximum_yuv** | **int** |  | [optional] 
**minimum_rgb_tolerance** | **int** |  | [optional] 
**minimum_yuv** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.clip_limits import ClipLimits

# TODO update the JSON string below
json = "{}"
# create an instance of ClipLimits from a JSON string
clip_limits_instance = ClipLimits.from_json(json)
# print the JSON string representation of the object
print(ClipLimits.to_json())

# convert the object into a dict
clip_limits_dict = clip_limits_instance.to_dict()
# create an instance of ClipLimits from a dict
clip_limits_from_dict = ClipLimits.from_dict(clip_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


