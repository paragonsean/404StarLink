# CaptionSourceFramerate

Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame rates between your input captions and input video, specify the frame rate of the captions file. Specify this value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_framerate import CaptionSourceFramerate

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceFramerate from a JSON string
caption_source_framerate_instance = CaptionSourceFramerate.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceFramerate.to_json())

# convert the object into a dict
caption_source_framerate_dict = caption_source_framerate_instance.to_dict()
# create an instance of CaptionSourceFramerate from a dict
caption_source_framerate_from_dict = CaptionSourceFramerate.from_dict(caption_source_framerate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


