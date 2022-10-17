# InputTemplate

Specified video input in a template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_selector_groups** | **Dict** |  | [optional] 
**audio_selectors** | **Dict** |  | [optional] 
**caption_selectors** | **Dict** |  | [optional] 
**crop** | [**InputCrop**](InputCrop.md) |  | [optional] 
**deblock_filter** | [**InputDeblockFilter**](InputDeblockFilter.md) |  | [optional] 
**denoise_filter** | [**InputDenoiseFilter**](InputDenoiseFilter.md) |  | [optional] 
**dolby_vision_metadata_xml** | **str** |  | [optional] 
**filter_enable** | [**InputFilterEnable**](InputFilterEnable.md) |  | [optional] 
**filter_strength** | **int** |  | [optional] 
**image_inserter** | [**InputImageInserter**](InputImageInserter.md) |  | [optional] 
**input_clippings** | **List** |  | [optional] 
**input_scan_type** | [**InputScanType**](InputScanType.md) |  | [optional] 
**position** | [**InputPosition**](InputPosition.md) |  | [optional] 
**program_number** | **int** |  | [optional] 
**psi_control** | [**InputPsiControl**](InputPsiControl.md) |  | [optional] 
**timecode_source** | [**InputTimecodeSource**](InputTimecodeSource.md) |  | [optional] 
**timecode_start** | **str** |  | [optional] 
**video_selector** | [**InputVideoSelector**](InputVideoSelector.md) |  | [optional] 

## Example

```python
from openapi_client.models.input_template import InputTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of InputTemplate from a JSON string
input_template_instance = InputTemplate.from_json(json)
# print the JSON string representation of the object
print(InputTemplate.to_json())

# convert the object into a dict
input_template_dict = input_template_instance.to_dict()
# create an instance of InputTemplate from a dict
input_template_from_dict = InputTemplate.from_dict(input_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


