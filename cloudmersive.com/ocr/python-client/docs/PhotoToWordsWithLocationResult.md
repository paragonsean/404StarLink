# PhotoToWordsWithLocationResult

Result of an photo to words-with-location OCR operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diagnostic_image** | **bytearray** | Typically null.  To analyze OCR performance, enable diagnostic mode by adding the HTTP header \&quot;DiagnosticMode\&quot; with the value \&quot;true\&quot;.  When this is true, a diagnostic image showing the details of the OCR result will be set in PNG format into DiagnosticImage. | [optional] 
**successful** | **bool** | True if successful, false otherwise | [optional] 
**text_elements** | [**List[OcrPhotoTextElement]**](OcrPhotoTextElement.md) | Word elements in the image | [optional] 

## Example

```python
from openapi_client.models.photo_to_words_with_location_result import PhotoToWordsWithLocationResult

# TODO update the JSON string below
json = "{}"
# create an instance of PhotoToWordsWithLocationResult from a JSON string
photo_to_words_with_location_result_instance = PhotoToWordsWithLocationResult.from_json(json)
# print the JSON string representation of the object
print(PhotoToWordsWithLocationResult.to_json())

# convert the object into a dict
photo_to_words_with_location_result_dict = photo_to_words_with_location_result_instance.to_dict()
# create an instance of PhotoToWordsWithLocationResult from a dict
photo_to_words_with_location_result_from_dict = PhotoToWordsWithLocationResult.from_dict(photo_to_words_with_location_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


