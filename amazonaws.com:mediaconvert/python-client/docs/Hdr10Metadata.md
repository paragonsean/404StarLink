# Hdr10Metadata

Use these settings to specify static color calibration metadata, as defined by SMPTE ST 2086. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blue_primary_x** | **int** |  | [optional] 
**blue_primary_y** | **int** |  | [optional] 
**green_primary_x** | **int** |  | [optional] 
**green_primary_y** | **int** |  | [optional] 
**max_content_light_level** | **int** |  | [optional] 
**max_frame_average_light_level** | **int** |  | [optional] 
**max_luminance** | **int** |  | [optional] 
**min_luminance** | **int** |  | [optional] 
**red_primary_x** | **int** |  | [optional] 
**red_primary_y** | **int** |  | [optional] 
**white_point_x** | **int** |  | [optional] 
**white_point_y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.hdr10_metadata import Hdr10Metadata

# TODO update the JSON string below
json = "{}"
# create an instance of Hdr10Metadata from a JSON string
hdr10_metadata_instance = Hdr10Metadata.from_json(json)
# print the JSON string representation of the object
print(Hdr10Metadata.to_json())

# convert the object into a dict
hdr10_metadata_dict = hdr10_metadata_instance.to_dict()
# create an instance of Hdr10Metadata from a dict
hdr10_metadata_from_dict = Hdr10Metadata.from_dict(hdr10_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


