# ColorCorrector

Settings for color correction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brightness** | **int** |  | [optional] 
**clip_limits** | [**ColorCorrectorClipLimits**](ColorCorrectorClipLimits.md) |  | [optional] 
**color_space_conversion** | [**ColorSpaceConversion**](ColorSpaceConversion.md) |  | [optional] 
**contrast** | **int** |  | [optional] 
**hdr10_metadata** | [**ColorCorrectorHdr10Metadata**](ColorCorrectorHdr10Metadata.md) |  | [optional] 
**hdr_to_sdr_tone_mapper** | [**HDRToSDRToneMapper**](HDRToSDRToneMapper.md) |  | [optional] 
**hue** | **int** |  | [optional] 
**sample_range_conversion** | [**SampleRangeConversion**](SampleRangeConversion.md) |  | [optional] 
**saturation** | **int** |  | [optional] 
**sdr_reference_white_level** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.color_corrector import ColorCorrector

# TODO update the JSON string below
json = "{}"
# create an instance of ColorCorrector from a JSON string
color_corrector_instance = ColorCorrector.from_json(json)
# print the JSON string representation of the object
print(ColorCorrector.to_json())

# convert the object into a dict
color_corrector_dict = color_corrector_instance.to_dict()
# create an instance of ColorCorrector from a dict
color_corrector_from_dict = ColorCorrector.from_dict(color_corrector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


