# DolbyVisionLevel6Metadata

Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_cll** | **int** |  | [optional] 
**max_fall** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dolby_vision_level6_metadata import DolbyVisionLevel6Metadata

# TODO update the JSON string below
json = "{}"
# create an instance of DolbyVisionLevel6Metadata from a JSON string
dolby_vision_level6_metadata_instance = DolbyVisionLevel6Metadata.from_json(json)
# print the JSON string representation of the object
print(DolbyVisionLevel6Metadata.to_json())

# convert the object into a dict
dolby_vision_level6_metadata_dict = dolby_vision_level6_metadata_instance.to_dict()
# create an instance of DolbyVisionLevel6Metadata from a dict
dolby_vision_level6_metadata_from_dict = DolbyVisionLevel6Metadata.from_dict(dolby_vision_level6_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


