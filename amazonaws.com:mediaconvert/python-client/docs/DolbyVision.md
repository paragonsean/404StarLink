# DolbyVision

Create Dolby Vision Profile 5 or Profile 8.1 compatible video output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**l6_metadata** | [**DolbyVisionL6Metadata**](DolbyVisionL6Metadata.md) |  | [optional] 
**l6_mode** | [**DolbyVisionLevel6Mode**](DolbyVisionLevel6Mode.md) |  | [optional] 
**mapping** | [**DolbyVisionMapping**](DolbyVisionMapping.md) |  | [optional] 
**profile** | [**DolbyVisionProfile**](DolbyVisionProfile.md) |  | [optional] 

## Example

```python
from openapi_client.models.dolby_vision import DolbyVision

# TODO update the JSON string below
json = "{}"
# create an instance of DolbyVision from a JSON string
dolby_vision_instance = DolbyVision.from_json(json)
# print the JSON string representation of the object
print(DolbyVision.to_json())

# convert the object into a dict
dolby_vision_dict = dolby_vision_instance.to_dict()
# create an instance of DolbyVision from a dict
dolby_vision_from_dict = DolbyVision.from_dict(dolby_vision_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


