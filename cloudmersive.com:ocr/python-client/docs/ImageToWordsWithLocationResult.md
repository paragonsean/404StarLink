# ImageToWordsWithLocationResult

Result of an image to words-with-location OCR operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **bool** | True if successful, false otherwise | [optional] 
**words** | [**List[OcrWordElement]**](OcrWordElement.md) | Word elements in the image | [optional] 

## Example

```python
from openapi_client.models.image_to_words_with_location_result import ImageToWordsWithLocationResult

# TODO update the JSON string below
json = "{}"
# create an instance of ImageToWordsWithLocationResult from a JSON string
image_to_words_with_location_result_instance = ImageToWordsWithLocationResult.from_json(json)
# print the JSON string representation of the object
print(ImageToWordsWithLocationResult.to_json())

# convert the object into a dict
image_to_words_with_location_result_dict = image_to_words_with_location_result_instance.to_dict()
# create an instance of ImageToWordsWithLocationResult from a dict
image_to_words_with_location_result_from_dict = ImageToWordsWithLocationResult.from_dict(image_to_words_with_location_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


