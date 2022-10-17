# Input

Use inputs to define the source files used in your transcoding job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/specify-input-settings.html. You can use multiple video inputs to do input stitching. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/assembling-multiple-inputs-and-input-clips.html

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_selector_groups** | **Dict** |  | [optional] 
**audio_selectors** | **Dict** |  | [optional] 
**caption_selectors** | **Dict** |  | [optional] 
**crop** | [**InputCrop**](InputCrop.md) |  | [optional] 
**deblock_filter** | [**InputDeblockFilter**](InputDeblockFilter.md) |  | [optional] 
**decryption_settings** | [**InputDecryptionSettings**](InputDecryptionSettings.md) |  | [optional] 
**denoise_filter** | [**InputDenoiseFilter**](InputDenoiseFilter.md) |  | [optional] 
**dolby_vision_metadata_xml** | **str** |  | [optional] 
**file_input** | **str** |  | [optional] 
**filter_enable** | [**InputFilterEnable**](InputFilterEnable.md) |  | [optional] 
**filter_strength** | **int** |  | [optional] 
**image_inserter** | [**InputImageInserter**](InputImageInserter.md) |  | [optional] 
**input_clippings** | **List** |  | [optional] 
**input_scan_type** | [**InputScanType**](InputScanType.md) |  | [optional] 
**position** | [**InputPosition**](InputPosition.md) |  | [optional] 
**program_number** | **int** |  | [optional] 
**psi_control** | [**InputPsiControl**](InputPsiControl.md) |  | [optional] 
**supplemental_imps** | **List** |  | [optional] 
**timecode_source** | [**InputTimecodeSource**](InputTimecodeSource.md) |  | [optional] 
**timecode_start** | **str** |  | [optional] 
**video_generator** | [**InputVideoGenerator**](InputVideoGenerator.md) |  | [optional] 
**video_selector** | [**InputVideoSelector**](InputVideoSelector.md) |  | [optional] 

## Example

```python
from openapi_client.models.input import Input

# TODO update the JSON string below
json = "{}"
# create an instance of Input from a JSON string
input_instance = Input.from_json(json)
# print the JSON string representation of the object
print(Input.to_json())

# convert the object into a dict
input_dict = input_instance.to_dict()
# create an instance of Input from a dict
input_from_dict = Input.from_dict(input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


