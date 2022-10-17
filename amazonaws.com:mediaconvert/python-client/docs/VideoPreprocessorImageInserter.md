# VideoPreprocessorImageInserter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insertable_images** | **List** |  | [optional] 
**sdr_reference_white_level** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_image_inserter import VideoPreprocessorImageInserter

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorImageInserter from a JSON string
video_preprocessor_image_inserter_instance = VideoPreprocessorImageInserter.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorImageInserter.to_json())

# convert the object into a dict
video_preprocessor_image_inserter_dict = video_preprocessor_image_inserter_instance.to_dict()
# create an instance of VideoPreprocessorImageInserter from a dict
video_preprocessor_image_inserter_from_dict = VideoPreprocessorImageInserter.from_dict(video_preprocessor_image_inserter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


