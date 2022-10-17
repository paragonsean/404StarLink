# ImageInserter

Use the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/graphic-overlay.html. This setting is disabled by default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insertable_images** | **List** |  | [optional] 
**sdr_reference_white_level** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.image_inserter import ImageInserter

# TODO update the JSON string below
json = "{}"
# create an instance of ImageInserter from a JSON string
image_inserter_instance = ImageInserter.from_json(json)
# print the JSON string representation of the object
print(ImageInserter.to_json())

# convert the object into a dict
image_inserter_dict = image_inserter_instance.to_dict()
# create an instance of ImageInserter from a dict
image_inserter_from_dict = ImageInserter.from_dict(image_inserter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


